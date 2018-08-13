/**
 * 
 */
package com.mindtree.dao;

import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.dbunit.database.DatabaseDataSourceConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

import com.mindtree.configuration.AppInitializer;
import com.mindtree.configuration.HibernateConfigurationTest;

/**
 * @author Krithi
 * @param <T>
 *
 */
@WebAppConfiguration
@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration(classes = {AppInitializer.class, HibernateConfigurationTest.class }, loader=AnnotationConfigWebContextLoader.class)
@Transactional
public abstract class AbstractDaoTest {
	
	@Autowired
	DataSource dataSource;
	
	    public void setUp() throws Exception {
	    	IDatabaseConnection dbConn = new DatabaseDataSourceConnection(
	                dataSource);
	        DatabaseOperation.CLEAN_INSERT.execute(dbConn, getDataSet());
	    }
	    
	    protected abstract IDataSet getDataSet() throws Exception;
}
