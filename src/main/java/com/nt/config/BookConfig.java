package com.nt.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class BookConfig {
    @Bean
	public Docket postsApi() {
    	//return a prepared docket instance
    	return new Docket(DocumentationType.SWAGGER_2).
    			groupName("Barma Naga").apiInfo(apiDetails()).select()
				.paths(PathSelectors.ant("/api.*")).build();
    }
    	 
    			
    	private  ApiInfo apiDetails() {
    		return new ApiInfoBuilder().title("Book Service")
    				.description("Sample Documentation Generateed Using SWAGGER2 for our Book Rest API")
    				.termsOfServiceUrl("https://www.facebook.com/barma.naga")
    				.license("Barma InterNational License")
    				.licenseUrl("https://www.facebook.com/barma.naga").version("1.0").build();

    			
	}
	
}
