package com.waduzzaman.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edText1,edText2, edText3, edText4, edText5 ;
    Button btnCal;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edText1=findViewById(R.id.edText1);
        edText2=findViewById(R.id.edText2);
        edText3=findViewById(R.id.edText3);
        edText4=findViewById(R.id.edText4);
        edText5=findViewById(R.id.edText5);
        btnCal=findViewById(R.id.btnCal);
        tvResult=findViewById(R.id.tvResult);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //get physics number from user input in string format
                String physicsString=edText1.getText().toString();
                // convert the string number to integer
                double physicsNumber=Double.parseDouble(physicsString);

                String chemistryString=edText2.getText().toString();
                double chemistryNumber=Double.parseDouble(chemistryString);

                String biologyString=edText3.getText().toString();
                double biologyNumber=Double.parseDouble(biologyString);

                String mathString=edText4.getText().toString();
                double mathNumber=Double.parseDouble(mathString);

                String computerString=edText5.getText().toString();
                double computerNumber=Double.parseDouble(computerString);

//                all subject total number
                double percent=(physicsNumber+chemistryNumber+biologyNumber+mathNumber+computerNumber)/5;

                if(percent>=90 && percent <=100){
                    tvResult.setText("You got "+percent+" % marks and your grade is A" );

                }else if (percent>=80 && percent <90) {
                    tvResult.setText("You got "+percent+" % marks and your grade is B" );
                }
                else if (percent>=70 && percent <80) {
                    tvResult.setText("You got " + percent + " % marks and your grade is C");
                }
                else if (percent>=60 && percent <70) {
                    tvResult.setText("You got " + percent + " % marks and your grade is D");
                }
                else if (percent>=40 && percent <60) {
                    tvResult.setText("You got " + percent + " % marks and your grade is E");
                }
                else if (percent<40) {
                    tvResult.setText("You got " + percent + " % marks and your grade is F");
                }
                else {
                    tvResult.setText(" invalid input, plz enter right number" );
                }

            }
        });

    }
}