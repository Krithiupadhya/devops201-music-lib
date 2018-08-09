/**
 * 
 */
package com.mindtree.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.print.DocFlavor.STRING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomCollectionEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindtree.dto.MusicCDSummary;
import com.mindtree.entity.Artist;
import com.mindtree.entity.MusicCD;
import com.mindtree.entity.MusicTrack;
import com.mindtree.service.MusicService;

/**
 * @author Krithi
 *
 */
@Controller
public class MusicLibController {
	
	@Autowired
	MusicService musicService;
	
	@RequestMapping(value = {"/","/cd" }, method = RequestMethod.GET)
    public String listCDs(ModelMap model) {
        List<MusicCDSummary> cdSummaries = musicService.fetchAll();
        model.addAttribute("cdSummaries", cdSummaries);
        return "cd_list";
    }
	
	@RequestMapping(value = {"/cd/{cd_id}" }, method = RequestMethod.GET)
    public String getCDDetails( @PathVariable("cd_id") Long cdId, ModelMap model) {
        MusicCD musicCD = musicService.getMusicCDDetails(cdId);
        model.addAttribute("musicCD", musicCD);
        getAllArtists(model);
        return "cd_details";
    }
	
	
	@RequestMapping(value = {"/cd" }, method = RequestMethod.POST)
    public String saveCDDetails(@ModelAttribute("musicCD") MusicCD musicCD, ModelMap model) {
		getAllArtists(model);
		musicService.saveMusicCdDetails(musicCD);
		model.addAttribute("musicCD", musicCD);
		
        return "cd_details";
    }

	@RequestMapping(value = {"cd_details" }, method = RequestMethod.GET)
    public String getCDDetails( ModelMap model) {
		MusicCD cd= new MusicCD();
		List<MusicTrack> list = new ArrayList<MusicTrack>(); 
		list.add(new MusicTrack());
		cd.setMusicTracks(list);
		model.addAttribute("musicCD", cd);
		getAllArtists(model);
        return "cd_details";
    }

	private void getAllArtists(ModelMap model) {
		List<Artist> artists=musicService.fetchAllArtists();
		System.out.println("Fetching artist details::"+artists);
		model.addAttribute("artists", artists);
	}
	private Map<String, Artist> getArtistCache() {
		List<Artist> artists=musicService.fetchAllArtists();
		Map artistMap= artists.stream().collect(Collectors.toMap(artist->artist.getArtistId().toString(), artist->artist));
		return artistMap;

	}
	@RequestMapping(value = {"/artist" }, method = RequestMethod.POST)
    public String saveArtistDetails(@ModelAttribute("artist") Artist artist, ModelMap model) {
		getAllArtists(model);
		musicService.saveArtistDetails(artist);
		model.addAttribute("artist", artist);
		
        return "artist";
    }
	
	@RequestMapping(value = {"/artist" }, method = RequestMethod.GET)
    public String getArtistDetails(ModelMap model) {
		model.addAttribute("artist", new Artist());
		
        return "artist";
    }
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) throws Exception {
		binder.registerCustomEditor(List.class, "artists", new CustomCollectionEditor(List.class) {
			protected Object convertElement(Object element) {
				if (element instanceof Artist) {
					System.out.println("Converting from Staff to Staff: " + element);
					return element;
				}
				if (element instanceof String) {
					Map<String, Artist> artists = getArtistCache();
					System.out.println("Looking up staff for id " + element + ": " + artists.get(element));
					return artists.get(element);
				}
				System.out.println("Don't know what to do with: " + element);
				return null;
			}
		});
	}
}
