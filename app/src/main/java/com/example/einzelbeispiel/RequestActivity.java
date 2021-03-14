package com.example.einzelbeispiel;

import android.app.Activity;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class RequestActivity extends Thread{
    private TextView outputField;
    private EditText inputField;

    public RequestActivity(TextView textView, EditText editText){
        this.inputField = editText;
        this.outputField = textView;
    }

    @Override
    public void run(){
        try {
            Socket clientSocket = new Socket("se2-isys.aau.at",53212);
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
            String number = inputField.getText().toString();
            outToServer.writeBytes(number + '\n');
            String outputNum = inFromServer.readLine();

            outputField.setText(outputNum);

            clientSocket.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
