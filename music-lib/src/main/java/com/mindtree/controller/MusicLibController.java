/**
 * 
 */
package com.mindtree.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindtree.dto.MusicCDSummary;
import com.mindtree.entity.Artist;
import com.mindtree.entity.MusicCD;
import com.mindtree.entity.MusicTrack;
import com.mindtree.exception.ApplicationException;
import com.mindtree.service.ArtistService;
import com.mindtree.service.MusicService;

/**
 * @author Krithi
 *
 */
@Controller
public class MusicLibController {
	
	private static final Logger logger = Logger.getLogger(MusicLibController.class);
	
	@Autowired
	MusicService musicService;
	
	@Autowired
	ArtistService artistService;
	
	@RequestMapping(value = {"/","/cd" }, method = RequestMethod.GET)
    public String listCDs(ModelMap model) {
        List<MusicCDSummary> cdSummaries=new ArrayList<>();
		try {
			cdSummaries = musicService.fetchAll();
		} catch (Exception e) {
			logger.error("Error while fetching music CD list: "+e.getMessage());
		}
        model.addAttribute("cdSummaries", cdSummaries);
        return "cd_list";
    }
	
	@RequestMapping(value = {"/cd/{cd_id}" }, method = RequestMethod.GET)
    public String getCDDetails( @PathVariable("cd_id") Long cdId, ModelMap model) {
        MusicCD musicCD;
		try {
			musicCD = musicService.getMusicCDDetails(cdId);
			model.addAttribute("musicCD", musicCD);
	        getAllArtists(model);
		} catch (Exception e) {

			logger.error("Error while fetching music CD details: "+e.getMessage()+" "+e.getCause());}
        
        return "cd_details";
    }
	
	
	@RequestMapping(value = {"/cd" }, method = RequestMethod.POST)
    public String saveCDDetails(@ModelAttribute("musicCD") MusicCD musicCD, ModelMap model) {
		try {
			getAllArtists(model);
			musicCD = musicService.saveMusicCdDetails(musicCD);
			model.addAttribute("musicCD", musicService.getMusicCDDetails(musicCD.getCdId()));
			model.addAttribute("successMsg", "Music CD details added successfully!!");
		} catch (Exception e) {
			logger.error("Error while saving music CD details: "+e.getMessage());
		}
		return "cd_details";
    }

	@RequestMapping(value = {"cd_details" }, method = RequestMethod.GET)
    public String getCDDetails( ModelMap model) {
		MusicCD cd= new MusicCD();
		try {
			List<MusicTrack> list = new ArrayList<MusicTrack>();
			list.add(new MusicTrack());
			cd.setMusicTracks(list);
			model.addAttribute("musicCD", cd);
			getAllArtists(model);
		} catch (Exception e) {
			logger.error("Error while fetching music CD details: "+e.getMessage());
		}
		return "cd_details";
    }

	private void getAllArtists(ModelMap model) throws ApplicationException{
		List<Artist> artists;
		artists = artistService.fetchAllArtists();
		model.addAttribute("artists", artists);
	}

	@RequestMapping(value = {"/artist" }, method = RequestMethod.POST)
    public String saveArtistDetails(@ModelAttribute("artist") Artist artist, ModelMap model) {
		
		try {
			artistService.saveArtistDetails(artist);
			model.addAttribute("artist", artist);
			getAllArtists(model);
			model.addAttribute("successMsg", "Artist added successfully!!");
		} catch (Exception e) {
			logger.error("Error while saving artist details: "+e.getMessage());
		}
		return "artist";
    }
	
	@RequestMapping(value = {"/artist" }, method = RequestMethod.GET)
    public String getArtistDetails(ModelMap model) {
		try {
			model.addAttribute("artist", new Artist());
			getAllArtists(model);
		} catch (ApplicationException e) {
			logger.error("Error while fetching artist details: "+e.getMessage());
		}
        return "artist";
    }
}
