package com.app.config;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.app")
@PropertySource("classpath:app.properties")
@EnableWebMvc
@Import(SecurityConfig.class)
public class AppConfig {
	@Autowired
	private Environment env;
	//1. View Resolver
	@Bean
	public InternalResourceViewResolver ivr() {
		InternalResourceViewResolver v=new  InternalResourceViewResolver();
		v.setPrefix(env.getProperty("mvc.prefix"));
		v.setSuffix(env.getProperty("mvc.suffix"));
                
		return v;
	}
	//2. Password encoder
	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	//3. Data source
	@Bean
	public BasicDataSource ds() {
		BasicDataSource ds=new BasicDataSource();
		ds.setDriverClassName(env.getProperty("db.driver"));
		ds.setUrl(env.getProperty("db.url"));
		ds.setUsername(env.getProperty("db.un"));
		ds.setPassword(env.getProperty("db.pwd"));
		return ds;
	}
	
}







