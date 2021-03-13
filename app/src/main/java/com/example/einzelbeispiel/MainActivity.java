package com.example.einzelbeispiel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendReq = (Button)findViewById(R.id.SendRequestButton);
        sendReq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText userInp = (EditText)findViewById(R.id.UserNumberInput);

            }
        });
        Button calcPrim = (Button)findViewById(R.id.CalculatePrimButton);
        calcPrim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText calcNumber = (EditText)findViewById(R.id.UserNumberInput);
                String numToCalc = calcNumber.getText().toString();
                String result = "";
                for (int i = 0; i < numToCalc.length(); i++) {
                    if (numToCalc.charAt(i) == '2' ||numToCalc.charAt(i) == '3' ||numToCalc.charAt(i) == '5' ||numToCalc.charAt(i) == '7') {
                        result += numToCalc.charAt(i);
                    }
                }
                TextView resText = (TextView)findViewById(R.id.ServerResponse);
                resText.setText(result.toString());
            }
        });

    }
}