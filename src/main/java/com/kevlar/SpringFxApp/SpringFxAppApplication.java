package com.kevlar.SpringFxApp;

import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringFxAppApplication {

	public static void main(String[] args) {
            ConfigurableApplicationContext ctx;
            ctx = SpringApplication.run(SpringFxAppApplication.class, args);
               
            AppCore.setContext(ctx);
            Application.launch(AppCore.class, args);
                
                //SpringFxAppApplication app = ctx.getBean(SpringFxAppApplication.class);
                
	}
        
        
    }


