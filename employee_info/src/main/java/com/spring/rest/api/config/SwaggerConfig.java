package com.spring.rest.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket swaaggerApi() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.spring.rest.api"))
				.paths(regex("/employee/.*"))
				.build()
				.apiInfo(getApiInfo());
	}
	
	
	private ApiInfo getApiInfo() {
	    return new ApiInfoBuilder()
		    .title("Spring Boot REST API")
		    .description("Spring Boot REST API for Employee Details")
		    .version("1.0.0")
		    .license("Apache License Version 2.0")
		    .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
		    .contact(new Contact("Vigneswaran Viswakethu", "https://github.com/vigneswaran-svm/SpringBootAPI", "vigneswaran.svm@gmail.com"))
		    .build();
	}
	
	/*@Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
 
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }*/

}
