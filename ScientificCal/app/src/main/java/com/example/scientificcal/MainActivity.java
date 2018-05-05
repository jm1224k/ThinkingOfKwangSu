package com.example.scientificcal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button add, subtract, multiply, divide, one, two, three, four, five, six, seven, eight, nine, zero, zero_2, equal;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button) findViewById(R.id.add);
        subtract = (Button)findViewById(R.id.subtract);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);
        equal = findViewById(R.id.equal);

        result = findViewById(R.id.result);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        zero_2 = findViewById(R.id.zero_2);


        View.OnClickListener numberButton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()){
                    case R.id.one: result.setText("1");
                        break;
                    case R.id.two: result.setText("2");
                        break;
                    case R.id.three: result.setText("3");
                        break;
                    case R.id.four: result.setText("4");
                        break;
                    case R.id.five: result.setText("5");
                        break;
                    case R.id.six: result.setText("6");
                        break;
                    case R.id.seven: result.setText("7");
                        break;
                    case R.id.eight: result.setText("8");
                        break;
                    case R.id.nine: result.setText("9");
                        break;
                    case R.id.zero: result.setText("0");
                        break;
                    case R.id.zero_2: result.setText("00");
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"기능미구현",Toast.LENGTH_SHORT).show();

                }
            }
        };

        add.setOnClickListener(numberButton);
        subtract.setOnClickListener(numberButton);
        multiply.setOnClickListener(numberButton);
        divide.setOnClickListener(numberButton);
        equal.setOnClickListener(numberButton);

        one.setOnClickListener(numberButton);
        two.setOnClickListener(numberButton);
        three.setOnClickListener(numberButton);
        four.setOnClickListener(numberButton);
        five.setOnClickListener(numberButton);
        six.setOnClickListener(numberButton);
        seven.setOnClickListener(numberButton);
        eight.setOnClickListener(numberButton);
        nine.setOnClickListener(numberButton);
        zero.setOnClickListener(numberButton);
        zero_2.setOnClickListener(numberButton);
    }



}
