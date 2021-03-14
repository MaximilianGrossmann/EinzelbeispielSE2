package com.example.einzelbeispiel;

import android.widget.EditText;
import android.widget.TextView;

public class CalcPrim extends Thread{
    private TextView outputField;
    private EditText inputField;

    public CalcPrim(TextView textView, EditText editText){
        this.inputField = editText;
        this.outputField = textView;
    }

    public void run(TextView resText, EditText userInp) {
        String numToCalc = userInp.getText().toString();
        String result = "";
        for (int i = 0; i < numToCalc.length(); i++) {
            if (numToCalc.charAt(i) == '2' ||numToCalc.charAt(i) == '3' ||numToCalc.charAt(i) == '5' ||numToCalc.charAt(i) == '7') {
                result += numToCalc.charAt(i);
            }
        }
        resText.setText(result);


    }
}
