package com.guylaf.calculator;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import hugo.weaving.DebugLog;


public class MainActivity extends AppCompatActivity {
    public String str = "";
    Character op = 'q';
    double num, numtemp;
    TextView showResult;
    boolean error = false;


    public String getName(String first, String last) {
        SystemClock.sleep(15); // Don't ever really do this!
        return first + " " + last;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showResult = (TextView) findViewById(R.id.result_id);

    }

    public void btn0Clicked(View v) {
        insert(0);
    }

    public void btn1Clicked(View v) {
        insert(1);
    }

    public void btn2Clicked(View v) {
        insert(2);
    }

    public void btn3Clicked(View v) {
        insert(3);
    }

    public void btn4Clicked(View v) {
        insert(4);
    }

    public void btn5Clicked(View v) {
        insert(5);
    }

    public void btn6Clicked(View v) {
        insert(6);
    }

    public void btn7Clicked(View v) {
        insert(7);
    }

    public void btn8Clicked(View v) {
        insert(8);
    }

    public void btn9Clicked(View v) {
        insert(9);
    }

    public void btncommaClicked(View v) {
        if (!str.contains(".") && str != "") {
            str = str + ".";
            showResult.setText(str);
        }
    }

    @DebugLog
    public void btnplusClicked(View v) {
        perform();
        op = '+';
    }

    public void btnminusClicked(View v) {
        perform();
        op = '-';
    }

    public void btndivideClicked(View v) {
        perform();
        op = '/';
    }

    public void btnmultiClicked(View v) {
        perform();
        op = '*';
    }

    public void btnequalClicked(View v) {
        calculate();
    }

    public void btnclearClicked(View v) {
        reset();
    }

    private void reset() {
        str = "";
        op = 'q';
        num = 0;
        numtemp = 0;
        showResult.setText("");
    }

    void insert(int j) {
        str = str + Integer.toString(j);
        num = Double.valueOf(str).doubleValue();
        showResult.setText(str);
    }

    void perform() {
        str = "";
        numtemp = num;
    }

    @DebugLog
    void calculate() {
        if (op == '+') {
            num = numtemp + num;
        } else if (op == '-') {
            num = numtemp - num;
        } else {
            if (op == '/') {
                if (num != 0) {
                    num = numtemp / num;
                } else {
                    showResult.setText("ERROR");
                    error = true;
                }
            } else if (op == '*') {
                num = numtemp * num;
            }
        }
        if (!error) {
            affich();
        } else {
            error = false;
        }
    }

    public void affich() {
        double y = num - (int) num;
        if (y == 0) {
            showResult.setText("" + (int) num);
        } else {
            showResult.setText("" + num);
        }
        str = "";

    }
}


