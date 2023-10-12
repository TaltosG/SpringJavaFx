package com.kevlar.SpringFxApp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


public class AppCore extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Alkalmazás");
        stage.show();
     
        VBox pane = new VBox();
        Scene scene = new Scene(pane, 640, 480);
        stage.setScene(scene);
        
        
        Label label = new Label("Lorem ipsum...");
        pane.getChildren().add(label);
        
        CategoryRepository repo = context.getBean(CategoryRepository.class);
        Category category = repo.findById(2).get();
        label.setText(category.toString());
    }

   
    
    private static ConfigurableApplicationContext context;

    public static ConfigurableApplicationContext getContext() {
        return context;
    }

    public static void setContext(ConfigurableApplicationContext context) {
        
        
        AppCore.context = context;
    }

   
    }

    
    
    

