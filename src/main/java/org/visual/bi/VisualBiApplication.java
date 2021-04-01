package org.visual.bi;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:context.xml")
public class VisualBiApplication {

	public static void main(String[] args) {

		SpringApplication.run(VisualBiApplication.class, args);
		System.out.println("__      __  _                         _   ____    _ \n" +
				" \\ \\    / / (_)                       | | |  _ \\  (_)\n" +
				"  \\ \\  / /   _   ___   _   _    __ _  | | | |_) |  _ \n" +
				"   \\ \\/ /   | | / __| | | | |  / _` | | | |  _ <  | |\n" +
				"    \\  /    | | \\__ \\ | |_| | | (_| | | | | |_) | | |\n" +
				"     \\/     |_| |___/  \\__,_|  \\__,_| |_| |____/  |_|\n" +
				"                                                     ");
	}

	@Bean
	public ServletRegistrationBean buildUReportServlet(){
		return new ServletRegistrationBean(new UReportServlet(),"/ureport/*");
	}
}
