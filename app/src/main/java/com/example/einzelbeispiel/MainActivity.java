package com.example.einzelbeispiel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.*;
import java.net.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView resText = (TextView)findViewById(R.id.ServerResponse);
        EditText userInp = (EditText)findViewById(R.id.UserNumberInput);

        Button sendReq = (Button)findViewById(R.id.SendRequestButton);
        Button calcPrim = (Button)findViewById(R.id.CalculatePrimButton);

        sendReq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestActivity request = new RequestActivity(resText,userInp);
                request.start();
            }
        });

        calcPrim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numToCalc = userInp.getText().toString();
                String result = "";
                for (int i = 0; i < numToCalc.length(); i++) {
                    if (numToCalc.charAt(i) == '2' ||numToCalc.charAt(i) == '3' ||numToCalc.charAt(i) == '5' ||numToCalc.charAt(i) == '7') {
                        result += numToCalc.charAt(i);
                    }
                }
                resText.setText(result);
            }
        });
    }
}