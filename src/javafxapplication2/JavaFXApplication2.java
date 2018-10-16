/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author EDSON
 */
public class JavaFXApplication2 extends Application {
    
    
         private Stage primaryStage;
	private BorderPane rootLayout;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        
                this.primaryStage = stage;
		this.primaryStage.setTitle("AddressApp");

		initRootLayout();
		showPersonOverview();

      
    }

    
    
    public void initRootLayout(){	
		try{                    
                   Parent root = FXMLLoader.load(getClass().getResource("RootLayout.fxml"));       
			
			rootLayout = (BorderPane) root;

			//Mostra a scene (cena) contendo o root layout
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
	                primaryStage.show();
		}catch (IOException e){
			e.printStackTrace();
		}
	}

 //Metodo que mostra o person overview dentro do root layout
	public void showPersonOverview()
	{
		try{
                       
                        Parent root = FXMLLoader.load(getClass().getResource("PersonOverView.fxml"));
			//carrega o person overview		
			 AnchorPane personOverview = (AnchorPane) root;
			//define o person overview dentro do root layout
                        rootLayout.setCenter(personOverview);                   
			
                      
		}catch (IOException e){
			e.printStackTrace();
		}
	}

	//retorna o palco principal
	public Stage getPrimaryStage()
	{
		return primaryStage;
	}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    
}
