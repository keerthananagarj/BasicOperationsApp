package com.cap.basicoperationsapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.cap.basicoperationslibrary.BasicOperations;

public class MainActivity extends AppCompatActivity {

    private EditText number1,number2;
    private Button btAdd,btSub,btMultiply,btDivide;
    private TextView result;

    BasicOperations basicOperations = new BasicOperations();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onResume(){
        super.onResume();

        number1 = findViewById(R.id.tv1);
        number2 = findViewById(R.id.tv2);

        btAdd = findViewById(R.id.btnAdd);
        btSub = findViewById(R.id.btnSubtract);
        btMultiply = findViewById(R.id.btnMultiply);
        btDivide = findViewById(R.id.btnDivide);

        result = findViewById(R.id.answer);

        btAdd.setOnClickListener(view -> {
            int a = Integer.parseInt(String.valueOf(number1.getText()));
            int b = Integer.parseInt(String.valueOf(number2.getText()));
            int sum = basicOperations.addNumbers(a,b);
            result.setText(String.format(
                    getResources().getString(R.string.reesult_is_d),sum));
        });

        btSub.setOnClickListener(view -> {
            int a = Integer.parseInt(String.valueOf(number1.getText()));
            int b = Integer.parseInt(String.valueOf(number2.getText()));
            int sub = basicOperations.subtractNumbers(a,b);
            result.setText(String.format(
                    getResources().getString(R.string.reesult_is_d),sub));
        });

        btMultiply.setOnClickListener(view -> {
            int a = Integer.parseInt(String.valueOf(number1.getText()));
            int b = Integer.parseInt(String.valueOf(number2.getText()));
            int multiply = basicOperations.multiplyNumbers(a,b);
            result.setText(String.format(
                    getResources().getString(R.string.reesult_is_d),multiply));
        });

        btDivide.setOnClickListener(view -> {
            int a = Integer.parseInt(String.valueOf(number1.getText()));
            int b = Integer.parseInt(String.valueOf(number2.getText()));
            int divide = basicOperations.divideNumbers(a,b);
            Log.d("result:", String.valueOf(divide));
            result.setText(String.format(
                    getResources().getString(R.string.reesult_is_d),divide));
        });



    }
}