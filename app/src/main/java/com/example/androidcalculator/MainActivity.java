package com.example.androidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView etdisplay;
    Button etOne, etTwo, etThree, etFour, etFive, etSix, etSeven, etEight, etNine, etZero, etSum, etSub, etAnswer, etMul, etDiv, etC;
    float var1, var2;
    boolean sum, sub, mul, div;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etC = findViewById(R.id.btC);
        etOne = findViewById(R.id.bt1);
        etTwo = findViewById(R.id.bt2);
        etThree =findViewById(R.id.bt3);
        etFour =findViewById(R.id.bt4);
        etFive = findViewById(R.id.bt5);
        etSix = findViewById(R.id.bt6);
        etSeven = findViewById(R.id.bt7);
        etEight = findViewById(R.id.bt8);
        etNine = findViewById(R.id.bt9);
        etZero = findViewById(R.id.bt0);

        etdisplay = findViewById(R.id.etdisplay);
        etSum = findViewById(R.id.btsum);
        etSub = findViewById(R.id.btsub);
        etMul = findViewById(R.id.btmul);
        etDiv = findViewById(R.id.btdiv);
        etAnswer = findViewById(R.id.btans);

        etOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText()+"1");
            }
        });

        etTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText()+"2");
            }
        });

        etThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText()+"3");
            }
        });

        etFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText()+"4");
            }
        });

        etFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText()+"5");
            }
        });

        etSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText()+"6");
            }
        });

        etSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText()+"7");
            }
        });

        etEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText()+"8");
            }
        });

        etNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText()+"9");
            }
        });

        etZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText()+"0");
            }
        });



        etSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etdisplay == null)
                {
                    etdisplay.setText("");
                } else {
                var1 = Float.parseFloat(etdisplay.getText()+"");
                sum = true;
                etdisplay.setText(null);
                }
            }
        });

        etSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    var1 = Float.parseFloat(etdisplay.getText()+"");
                    sub = true;
                    etdisplay.setText(null);

            }
        });

        etMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Float.parseFloat(etdisplay.getText()+"");
                mul = true;
                etdisplay.setText(null);
            }
        });

        etDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Float.parseFloat(etdisplay.getText()+"");
                div = true;
                etdisplay.setText(null);
            }
        });

        etAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Float.parseFloat(etdisplay.getText()+"");

                if (sum==true){
                    etdisplay.setText(var1+var2+"");
                    sum=false;}

                if (sub==true){
                    etdisplay.setText(var1-var2+"");
                    sub=false;}

                if (mul==true){
                    etdisplay.setText(var1*var2+"");
                    mul=false;}

                if (div==true){
                    etdisplay.setText(var1/var2+"");
                    div=false;}
            }
        });

        etC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText("");
            }
        });

    }
}
