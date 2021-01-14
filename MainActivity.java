package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    boolean isFirstInput = true;
    double resultNumber = 0;
    String operator = "+";
    ActivityMainBinding activityMainBinding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
    }

    public void num1click (View view){

        if(isFirstInput) {
            activityMainBinding.resultTextView.setText("1");

            isFirstInput = false;
        }else {
            activityMainBinding.resultTextView.append("1");


        }

    }

    public void num2Click (View view) {
        if (isFirstInput) {
            activityMainBinding.resultTextView.setText("2");

            isFirstInput = false;
        } else {
            activityMainBinding.resultTextView.append("2");

        }
    }

    public void num3Click (View view) {
        if (isFirstInput) {
            activityMainBinding.resultTextView.setText("3");

            isFirstInput = false;
        } else {
            activityMainBinding.resultTextView.append("3");

        }
    }

    public void num4Click (View view) {
        if (isFirstInput) {
            activityMainBinding.resultTextView.setText("4");

            isFirstInput = false;
        } else {
            activityMainBinding.resultTextView.append("4");

        }
    }
    public void num5Click (View view) {
        if (isFirstInput) {
            activityMainBinding.resultTextView.setText("5");

            isFirstInput = false;
        } else {
            activityMainBinding.resultTextView.append("5");

        }
    }
    public void num6Click (View view) {
        if (isFirstInput) {
            activityMainBinding.resultTextView.setText("6");

            isFirstInput = false;
        } else {
            activityMainBinding.resultTextView.append("6");

        }
    }
    public void num7Click (View view) {
        if (isFirstInput) {
            activityMainBinding.resultTextView.setText("7");

            isFirstInput = false;
        } else {
            activityMainBinding.resultTextView.append("7");

        }
    }
    public void num8Click (View view) {
        if (isFirstInput) {
            activityMainBinding.resultTextView.setText("8");

            isFirstInput = false;
        } else {
            activityMainBinding.resultTextView.append("8");

        }
    }
    public void num9Click (View view) {
        if (isFirstInput) {
            activityMainBinding.resultTextView.setText("9");

            isFirstInput = false;
        } else {
            activityMainBinding.resultTextView.append("9");

        }
    }
    public void num0Click (View view) {
        if (isFirstInput) {
            activityMainBinding.resultTextView.setText("0");

            isFirstInput = false;
        } else {
            activityMainBinding.resultTextView.append("0");

        }
    }

    public void allCLearButtonClick (View view){
        activityMainBinding.resultTextView.setText("0");
        activityMainBinding.mathTextView.setText("");
        resultNumber = 0;
        operator = "+";
        isFirstInput = true;
    }

    public void pointButtonClick (View view){
        if(isFirstInput){
            activityMainBinding.resultTextView.setText("0" + view.getTag().toString());
            isFirstInput = false;
        }else {
            if(activityMainBinding.resultTextView.getText().toString().contains(".")){
                Toast.makeText(this, "이미 소숫점이 존재 합니다람쥐.", Toast.LENGTH_SHORT).show();
            } else{
                activityMainBinding.resultTextView.append(view.getTag().toString());
            }
        }

    }

    public void OperatorClick (View view){
        double inputNumber = Double.parseDouble(activityMainBinding.resultTextView.getText().toString());

        if(operator.equals("+")){
            resultNumber = resultNumber +inputNumber;
        }else if(operator.equals("-")){
            resultNumber = resultNumber - inputNumber;
        }else if(operator.equals("X")){
            resultNumber = resultNumber * inputNumber;
        }else if (operator.equals("/")){
            resultNumber =  resultNumber / inputNumber;
        }

        activityMainBinding.resultTextView.setText(String.valueOf(resultNumber));
        isFirstInput = true;
        operator = view.getTag().toString();
        activityMainBinding.mathTextView.append(inputNumber + " " + operator + " ");
    }

    public void equalsButtonClick (View view){
        double inputNumber = Double.parseDouble(activityMainBinding.resultTextView.getText().toString());

        if(operator.equals("+")){
            resultNumber = resultNumber +inputNumber;
        }else if(operator.equals("-")){
            resultNumber = resultNumber - inputNumber;
        }else if(operator.equals("X")){
            resultNumber = resultNumber * inputNumber;
        }else if (operator.equals("/")){
            resultNumber =  resultNumber / inputNumber;
        }

        activityMainBinding.resultTextView.setText(String.valueOf(resultNumber));
        isFirstInput = true;
        operator = view.getTag().toString();
        activityMainBinding.mathTextView.append(inputNumber + " " + operator + " ");
    }


}
