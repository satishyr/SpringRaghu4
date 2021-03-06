package com.app.config;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@PropertySource("classpath:app.properties")
@ComponentScan("com.app")
@EnableWebMvc



public class AppConfig 
  implements WebMvcConfigurer
{
	
	@Autowired
	private Environment env;
	@Bean
	public InternalResourceViewResolver vr() {
		InternalResourceViewResolver v=new InternalResourceViewResolver();
		v.setPrefix(env.getProperty("mvc.prefix"));
		v.setSuffix(env.getProperty("mvc.suffix"));
		return v;
	}
	
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource r=new ReloadableResourceBundleMessageSource();
		r.setBasename("classpath:messages");
		r.setDefaultEncoding("UTF-8");
		return r;
	}
	@Bean
	public CookieLocaleResolver localeResolver() {
		CookieLocaleResolver c=new CookieLocaleResolver();
		c.setDefaultLocale(Locale.ENGLISH);
		c.setCookieName("my-cke");
		return c;
	}
	@Bean
	public LocaleChangeInterceptor lcinterceptor() {
		LocaleChangeInterceptor lc=new LocaleChangeInterceptor();
		lc.setParamName("lang");
		return lc;
	} 
	
	@Override
	public void addInterceptors(
			InterceptorRegistry registry) {
		registry.addInterceptor(lcinterceptor());
	}
	
	
}







