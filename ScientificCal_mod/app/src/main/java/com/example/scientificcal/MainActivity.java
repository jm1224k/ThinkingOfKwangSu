package com.example.scientificcal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button shift, up, down, right, left, backspace, squre, root, left_bracket, right_bracket, previouse_answer, constant, add, subtract, multiply,
            divide, one, two, three, four, five, six, seven, eight, nine, zero, point, equal;
    private TextView current, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

//        shift = (Button) findViewById(R.id.shift);
//        up = (Button) findViewById(R.id.up);
//        down = (Button) findViewById(R.id.down);
//        right = (Button) findViewById(R.id.right);
//        left = (Button) findViewById(R.id.left);
//        backspace = (Button) findViewById(R.id.backspace);
//        constant =  (Button) findViewById(R.id.constant);
//
//        add = (Button) findViewById(R.id.add);
//        subtract = (Button) findViewById(R.id.subtract);
//        multiply = (Button) findViewById(R.id.multiply);
//        divide = (Button) findViewById(R.id.divide);
//        squre = (Button) findViewById(R.id.square);
//        root = (Button) findViewById(R.id.root);
//        equal = (Button) findViewById(R.id.equal);
//
//        previouse_answer = (Button) findViewById(R.id.previous_answer);
//
//        one = findViewById(R.id.one);
//        two = findViewById(R.id.two);
//        three = findViewById(R.id.three);
//        four = findViewById(R.id.four);
//        five = findViewById(R.id.five);
//        six = findViewById(R.id.six);
//        seven = findViewById(R.id.seven);
//        eight = findViewById(R.id.eight);
//        nine = findViewById(R.id.nine);
//        zero = findViewById(R.id.zero);
//        point = (Button) findViewById(R.id.point);
//        left_bracket = (Button) findViewById(R.id.left_bracket);
//        right_bracket = (Button) findViewById(R.id.right_bracket);
//
//        result =  findViewById(R.id.result);
//
//        View.OnClickListener numberButton = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch(v.getId()){
//                    case R.id.one: current.setText("1");
//                        break;
//                    case R.id.two: current.setText("2");
//                        break;
//                    case R.id.three: current.setText("3");
//                        break;
//                    case R.id.four: current.setText("4");
//                        break;
//                    case R.id.five: current.setText("5");
//                        break;
//                    case R.id.six: current.setText("6");
//                        break;
//                    case R.id.seven: current.setText("7");
//                        break;
//                    case R.id.eight: current.setText("8");
//                        break;
//                    case R.id.nine: current.setText("9");
//                        break;
//                    case R.id.zero: current.setText("0");
//                        break;
//                    default:
//                        Toast.makeText(getApplicationContext(),"syntax_error",Toast.LENGTH_SHORT).show();
//                }
//            }
//        };
//
//        add.setOnClickListener(numberButton);
//        subtract.setOnClickListener(numberButton);
//        multiply.setOnClickListener(numberButton);
//        divide.setOnClickListener(numberButton);
//        equal.setOnClickListener(numberButton);
//
//        one.setOnClickListener(numberButton);
//        two.setOnClickListener(numberButton);
//        three.setOnClickListener(numberButton);
//        four.setOnClickListener(numberButton);
//        five.setOnClickListener(numberButton);
//        six.setOnClickListener(numberButton);
//        seven.setOnClickListener(numberButton);
//        eight.setOnClickListener(numberButton);
//        nine.setOnClickListener(numberButton);
//        zero.setOnClickListener(numberButton);
//    }
