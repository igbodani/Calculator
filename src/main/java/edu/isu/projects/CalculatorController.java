package edu.isu.projects;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable  {


    @FXML
    TextField textField;

    @FXML
    Button clear, divide, multiply, minus, seven, eight, nine, four, five, six, one, two, three, negate, zero, dot, equal, add, percent;

    char operator;
    Double number1;

    Double number2;
    Double solution ;
    Double temp;
    String clearText = "";


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        dot.setOnAction(event -> {
            String value = textField.getText();
            if(!textField.getText().contains(".")){
                textField.setText(value + dot.getText());
            }
        });
        clear.setOnAction(event -> textField.setText(clearText));

        negate.setOnAction(event -> {
            String value = textField.getText();
            number1 = Double.parseDouble(value);
            number1 *= -1;
            textField.setText(Double.toString(number1));
        });

        selectNumber(zero, one, two, three, four);

        selectNumber(five, six, seven, eight, nine);

        selectOperator(add, minus, divide, multiply);

        evaluate(equal);
    }

    private void selectNumber(Button zero, Button one, Button two, Button three, Button four) {
        zero.setOnAction(event -> {
            String value = textField.getText();
            textField.setText(value+ zero.getText());
        });

        one.setOnAction(event -> {
            String value = textField.getText();
            textField.setText(value+ one.getText());
        });

        two.setOnAction(event -> {
            String value = textField.getText();
            textField.setText(value+ two.getText());
        });

        three.setOnAction(event -> {
            String value = textField.getText();
            textField.setText(value+ three.getText());
        });

        four.setOnAction(event -> {
            String value = textField.getText();
            textField.setText(value+ four.getText());
        });
    }

    private void selectOperator(Button add, Button minus, Button divide, Button multiply) {
        add.setOnAction(event -> {
            operator = '+';
            if(!textField.getText().equalsIgnoreCase("")){
             number1 = Double.parseDouble(textField.getText());
             textField.setText(clearText);
            }

        });

        minus.setOnAction(event -> {
            operator = '-';
            if(!textField.getText().equalsIgnoreCase("")) {
                number1 = Double.parseDouble(textField.getText());
                textField.setText(clearText);
            }
        });

        divide.setOnAction(event -> {
            operator = '/';
            if(!textField.getText().equalsIgnoreCase("")){
             number1 = Double.parseDouble(textField.getText());
             textField.setText(clearText);
            }

        });

        multiply.setOnAction(event -> {
            operator = '*';
            if(!textField.getText().equalsIgnoreCase("")){
              number1 = Double.parseDouble(textField.getText());
              textField.setText(clearText);
            }
        });

        percent.setOnAction(event -> {
            operator = '%';
            if(!textField.getText().equalsIgnoreCase("")){
                number1 = Double.parseDouble(textField.getText());
                number1 /= 100;
                textField.setText(Double.toString(number1));
            }
        });

    }

    private void evaluate(Button equal) {
       equal.setOnAction(event -> {
           if (number1 != null && !textField.getText().equalsIgnoreCase("")) {
                switch (operator) {
                    case '/' -> {
                        if(number1.equals(solution) && textField.getText().equalsIgnoreCase(String.valueOf(solution))){
                            number2 = temp;
                        }else {
                            number2 = Double.parseDouble(textField.getText());}
                       // number2 = Double.parseDouble(textField.getText());
                        textField.setText(clearText);
                        solution = number1 / number2;
                    }
                    case '+' -> {
                        if(number1.equals(solution) && textField.getText().equalsIgnoreCase(String.valueOf(solution))){
                            number2 = temp;
                        }else {
                            number2 = Double.parseDouble(textField.getText());
                        }
                        textField.setText(clearText);
                        solution = number1 + number2;
                    }
                    case '-' -> {
                        if(number1.equals(solution) && textField.getText().equalsIgnoreCase(String.valueOf(solution))){
                            number2 = temp;
                        }else {
                            number2 = Double.parseDouble(textField.getText());
                        }
                        textField.setText(clearText);
                        solution = number1 - number2;
                    }
                    case '*' -> {
                        if(number1.equals(solution) && textField.getText().equalsIgnoreCase(String.valueOf(solution))){
                            number2 = temp;
                        }else {
                            number2 = Double.parseDouble(textField.getText());}

                        textField.setText(clearText);
                        solution = number1 * number2;
                    }
                }
                  temp = number2;
                   number1 = solution;
                   textField.setText(String.valueOf(solution));
            }
            });
    }
}

