package com.sagar.rest.webservices.restfulwebservices;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.Resource;
import javax.websocket.Session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}
	
	@Bean
	public LocaleResolver localeResolver(){
		SessionLocaleResolver localeResolver = new SessionLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		return localeResolver;
	}
	
//	@Bean
//	public ResourceBundleMessageSource bundleMessageSource(){
//		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//		messageSource.setBasenames("messages");
//		return messageSource;
//	}
	
	@Bean
	 public MessageSource messageSource() {
	 ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
	 messageSource.setBasenames("messages");
	 return messageSource;
	 }
}
