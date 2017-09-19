package com.vega.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {ApplicationConfig.class};
	}
	
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
