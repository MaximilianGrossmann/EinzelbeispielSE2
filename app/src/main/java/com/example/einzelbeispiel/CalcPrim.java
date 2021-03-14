package com.example.einzelbeispiel;

import android.os.Looper;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Handler;

public class CalcPrim extends Thread{
    private TextView outputField;
    private EditText inputField;

    public CalcPrim(TextView textView, EditText editText){
        this.inputField = editText;
        this.outputField = textView;
    }

    @Override
    public void run() {
        String numToCalc = inputField.getText().toString();
        String result = "";
        for (int i = 0; i < numToCalc.length(); i++) {
            if (numToCalc.charAt(i) == '2' ||numToCalc.charAt(i) == '3' ||numToCalc.charAt(i) == '5' ||numToCalc.charAt(i) == '7') {
                result += numToCalc.charAt(i);
            }
        }
        new Handler(Looper.getMainLooper()).post(new ShowOnUi(result,outputField));
    }
}
