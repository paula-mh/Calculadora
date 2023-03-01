
import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class Calculadora extends Application{
    double entrada;
    TextField pantalla;
    double operacion = 0;
    double primera = 0;
    double resultado;
    double segunda;

    
    public static void main(String args[]) {
     launch(args);
        
    }
    
    public void Dimensiones(Button btn){
        btn.setPrefWidth(60);
        btn.setPrefHeight(50);
    }
    
    @Override
    public void start(Stage lamina) {
        
        //Botones numéricos
        Button btn0=new Button("0");
        Button btn1=new Button("1");
        Button btn2=new Button("2");
        Button btn3=new Button("3");
        Button btn4=new Button("4");
        Button btn5=new Button("5");
        Button btn6=new Button("6");
        Button btn7=new Button("7");
        Button btn8=new Button("8");
        Button btn9=new Button("9");      
        
        //Botones operaciones
        Button btnSuma=new Button("+");
        Button btnResta=new Button("-");
        Button btnMultiplicacion=new Button("×");
        Button btnDivision=new Button("÷");
        Button btnIgual=new Button("=");
        
        // Pantalla de operaciones
        pantalla=new TextField();
        
        //layout
        GridPane root=new GridPane();
        root.setAlignment(Pos.CENTER);
        
        //Cuadricula de botones
        GridPane.setConstraints(pantalla, 0, 0, 4, 1);
        GridPane.setConstraints(btn7, 0, 1);
        GridPane.setConstraints(btn8, 1, 1);
        GridPane.setConstraints(btn9, 2, 1);
        GridPane.setConstraints(btnSuma, 3, 1);
        GridPane.setConstraints(btn4, 0, 2);
        GridPane.setConstraints(btn5, 1, 2);
        GridPane.setConstraints(btn6, 2, 2);
        GridPane.setConstraints(btnResta, 3, 2);
        GridPane.setConstraints(btn1, 0, 3);
        GridPane.setConstraints(btn2, 1, 3);
        GridPane.setConstraints(btn3, 2, 3);
        GridPane.setConstraints(btnMultiplicacion, 3, 3);
        GridPane.setConstraints(btnIgual, 0, 4);
        GridPane.setConstraints(btn0, 2, 4);
        GridPane.setConstraints(btnDivision, 3, 4);
        
        //boton Igual
        GridPane.setColumnSpan(btnIgual, 2);
        btnIgual.setMaxHeight(Double.MAX_VALUE);
        btnIgual.setMaxWidth(Double.MAX_VALUE);

        //mostrar todos los botones
        root.getChildren().addAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnSuma,btnResta,btnMultiplicacion,btnDivision,btnIgual, pantalla);
        
        //tamaño predefinido para los botones
        Dimensiones(btn0);
        Dimensiones(btn1);
        Dimensiones(btn2);
        Dimensiones(btn3);
        Dimensiones(btn4);
        Dimensiones(btn5);
        Dimensiones(btn6);
        Dimensiones(btn7);
        Dimensiones(btn8);
        Dimensiones(btn9);
        Dimensiones(btnSuma);
        Dimensiones(btnResta);
        Dimensiones(btnMultiplicacion);
        Dimensiones(btnDivision);
        
        
        //insertar números
            
        btn1.setOnAction(event ->{
            entrada = 1;
            pantalla.setText(pantalla.getText() + String.valueOf(entrada));
        });
        btn2.setOnAction(event ->{
            entrada = 2;
            pantalla.setText(pantalla.getText() + String.valueOf(entrada));
        });
                
        btn3.setOnAction(event ->{
            entrada = 3;
            pantalla.setText(pantalla.getText() + String.valueOf(entrada));
        });
        
        btn4.setOnAction(event ->{
            entrada = 4;
            pantalla.setText(pantalla.getText() + String.valueOf(entrada));
        });
        btn5.setOnAction(event ->{
            entrada = 5;
            pantalla.setText(pantalla.getText() + String.valueOf(entrada));
        });
        
        btn6.setOnAction(event ->{
            entrada = 6;
            pantalla.setText(pantalla.getText() + String.valueOf(entrada));
        });
        
        btn7.setOnAction(event ->{
            entrada = 7;
            pantalla.setText(pantalla.getText() + String.valueOf(entrada));
        });
        
        btn8.setOnAction(event ->{
            entrada = 8;
            pantalla.setText(pantalla.getText() + String.valueOf(entrada));
        });
        
        btn9.setOnAction(event ->{
            entrada = 9;
            pantalla.setText(pantalla.getText() + String.valueOf(entrada));
        });
        
        btn0.setOnAction(event ->{
            entrada = 0;
            pantalla.setText(pantalla.getText() + String.valueOf(entrada));
        });
        
        
        //insertar funciones
        
        btnSuma.setOnAction(event ->{
            primera = Integer.parseInt(pantalla.getText());
            operacion = 1;
            pantalla.setText("");    
        });
        
                
        btnResta.setOnAction(event ->{
            primera = Integer.parseInt(pantalla.getText());
            operacion = 2; 
            pantalla.setText("");
        });
        
        
        btnMultiplicacion.setOnAction(event ->{
            primera = Integer.parseInt(pantalla.getText());
            operacion = 3; 
            pantalla.setText("");
        });
        
        
        btnDivision.setOnAction(event ->{
            primera = Integer.parseInt(pantalla.getText());
            operacion = 4; 
            pantalla.setText("");
        });
        
        // acciones botón igual 
        btnIgual.setOnAction(event ->{
            segunda = Integer.parseInt(pantalla.getText());
            switch (operacion) {
                case 1: //Suma
                    resultado = primera + segunda;
                    break;
                    
                case 2: //Resta
                    resultado = primera - segunda;
                    break;
                    
                case 3: //Multiplicacion
                    resultado = primera * segunda;
                    break;
                    
                case 4: //División
                    resultado = primera / segunda;
                    break;
            }
            
            pantalla.setText(String.valueOf(resultado));
        });

        
        //tamaño de la lámina por defecto
        Scene escena=new Scene(root, 300, 275);
        
        lamina.setTitle("Calculadora");
        lamina.setScene(escena);
        lamina.show();
  
    }

 }

