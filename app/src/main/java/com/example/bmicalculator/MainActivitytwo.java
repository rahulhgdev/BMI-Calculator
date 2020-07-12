package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivitytwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitytwo);
    }


    // Main function to calculate BMI

    public void calculateBMI(View view){

        double height = 0;
        double weight = 0;
        double bmi= 0;
        double multiplyHeight = 0;
        String msg = "";

        EditText et1 = (EditText)findViewById(R.id.weightInput);
        EditText et2 = (EditText)findViewById(R.id.heightInput);

        Button btn = (Button)findViewById(R.id.buttonCalculate);

        TextView t1 = (TextView) findViewById(R.id.textBMI);
        TextView t2 = (TextView) findViewById(R.id.textResult);

        weight = Double.parseDouble(et1.getText().toString());
        height = Double.parseDouble(et2.getText().toString());

        multiplyHeight = height * height;   // Or you can directly use bmi instead of multiplyheight
        bmi = weight / multiplyHeight;


        // YOUR BMI
        t1.setText(String.valueOf(bmi));


        // YOUR BMI RESULT
        if(bmi<18.5 )
        {
            msg = " UnderWeight !!";
        }
        else if(bmi>18.5 && bmi<25)
        {
            msg="Healthy !!";
        }
        else if(bmi>25)
        {
            msg="Overweight !!";
        }

        t2.setText(msg);
    }
}