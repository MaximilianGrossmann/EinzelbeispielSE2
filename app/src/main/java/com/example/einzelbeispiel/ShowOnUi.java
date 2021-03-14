package com.example.einzelbeispiel;

import android.widget.TextView;

import java.util.logging.Handler;

public class ShowOnUi implements Runnable{
    String print;
    TextView output;

    public ShowOnUi(String res, TextView out){
    this.print = res;
    this.output = out;
    }

    @Override
    public void run() {
        output.setText(print);
    }
}
