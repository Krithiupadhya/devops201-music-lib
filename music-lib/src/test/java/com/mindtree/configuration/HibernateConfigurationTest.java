/**
 * 
 */
package com.mindtree.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Krithi
 *
 */
@Configuration
@EnableTransactionManagement
@ComponentScan({ "com.mindtree.configuration" })
@TestPropertySource( "classpath:application.properties" )
public class HibernateConfigurationTest {
	
	@Autowired
    private Environment environment;
 
	private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernateTest.dialect"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernateTest.show_sql"));
        properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernateTest.format_sql"));
        properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernateTest.hbm2ddl.auto"));
        return properties;        
    }
	
	@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbcTest.driverClassName"));
        dataSource.setUrl(environment.getRequiredProperty("jdbcTest.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbcTest.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbcTest.password"));
        return dataSource;
    }
	
	@Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan(new String[] { "com.mindtree.entity" });
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
     }
	
	@Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory s) {
       HibernateTransactionManager txManager = new HibernateTransactionManager();
       txManager.setSessionFactory(s);
       return txManager;
    }
}
