package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void calculate(View view) {
        EditText tansport_1_el =  findViewById(R.id.tansport_1);
        String number = tansport_1_el.getText( ).toString();
        int transportValue1 = 0;
        if(number.length() > 0) {
            transportValue1 = Integer.parseInt(number);
        }

        EditText tansport_2_el =  findViewById(R.id.tansport_2);
        String number1 = tansport_2_el.getText( ).toString();
        int transportValue2  = 0;
        if(number1.length() > 0) {
            transportValue2 = Integer.parseInt(number1);
        }

        EditText medicines_1_el =  findViewById(R.id.medicines_1);
        String number2 = medicines_1_el.getText( ).toString();
        int medicinesValue1  = 0;
        if(number2.length() > 0) {
            medicinesValue1 = Integer.parseInt(number2);
        }

        EditText medicines_2_el =  findViewById(R.id.medicines_2);
        String number3 = medicines_2_el.getText( ).toString();
        int medicinesValue2  = 0;
        if(number3.length() > 0) {
            medicinesValue2 = Integer.parseInt(number3);
        }

        EditText fastfood_1_el =  findViewById(R.id.fastfood_1);
        String number4 = fastfood_1_el.getText( ).toString();
        int fastfoodValue1  = 0;
        if(number4.length() > 0) {
            fastfoodValue1 = Integer.parseInt(number4);
        }

        EditText fastfood_2_el =  findViewById(R.id.fastfood_2);
        String number5 = fastfood_2_el.getText( ).toString();
        int fastfoodValue2  = 0;
        if(number5.length() > 0) {
            fastfoodValue2 = Integer.parseInt(number5);
        }

        EditText cigarettes_1_el =  findViewById(R.id.cigarettes_1);
        String number6 = cigarettes_1_el.getText( ).toString();
        int cigarettesValue1 = 0;
        if(number6.length() > 0) {
            cigarettesValue1 = Integer.parseInt(number6);
        }

        EditText cigarettes_2_el =  findViewById(R.id.cigarettes_2);
        String number7 = cigarettes_2_el.getText( ).toString();
        int cigarettesValue2  = 0;
        if(number7.length() > 0) {
            cigarettesValue2 = Integer.parseInt(number7);
        }

        EditText coffee_1_el =  findViewById(R.id.coffee_1);
        String number8 = coffee_1_el.getText( ).toString();
        int coffeeValue1  = 0;
        if(number8.length() > 0) {
            coffeeValue1 = Integer.parseInt(number8);
        }

        EditText coffee_2_el =  findViewById(R.id.coffee_2);
        String number9 = coffee_2_el.getText( ).toString();
        int coffeeValue2  = 0;
        if(number9.length() > 0) {
            coffeeValue2 = Integer.parseInt(number9);
        }

        EditText businesslunch_1_el =  findViewById(R.id.businesslunch_1);
        String number10 = businesslunch_1_el.getText( ).toString();
        int businesslunchValue1  = 0;
        if(number10.length() > 0) {
            businesslunchValue1 = Integer.parseInt(number10);
        }

        EditText businesslunch_2_el =  findViewById(R.id.businesslunch_2);
        String number11 = businesslunch_2_el.getText( ).toString();
        int businesslunchValue2  = 0;
        if(number11.length() > 0) {
            businesslunchValue2 = Integer.parseInt(number11);
        }

        EditText secretspending_1_el =  findViewById(R.id.secretspending_1);
        String number12 = secretspending_1_el.getText( ).toString();
        int secretspendingValue1  = 0;
        if(number12.length() > 0) {
            secretspendingValue1 = Integer.parseInt(number12);
        }

        EditText secretspending_2_el =  findViewById(R.id.secretspending_2);
        String number13 = secretspending_2_el.getText( ).toString();
        int secretspendingValue2  = 0;
        if(number13.length() > 0) {
            secretspendingValue2 = Integer.parseInt(number13);
        }

        int result = transportValue1 * transportValue2 + medicinesValue1 * medicinesValue2 + fastfoodValue1 * fastfoodValue2 + cigarettesValue1 * cigarettesValue2 + coffeeValue1 * coffeeValue2 + businesslunchValue1 * businesslunchValue2 + secretspendingValue1 * secretspendingValue2;

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        AlertDialog dialog = builder.setTitle("сколько тратите")
                .setMessage(result + " ₽")
                .setPositiveButton("ОК", new DialogInterface.OnClickListener( ) {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel( );
                    }
                }).create( );
        dialog.show();
    }
}