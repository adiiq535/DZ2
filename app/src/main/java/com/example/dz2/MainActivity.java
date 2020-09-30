package com.example.dz2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private EditText editText2;
    private EditText editText3;
    private TextView textView;
    private Button button;
    private String input = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("olol", "onCreate");
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a, b, c, d;
                String S1 = editText.getText().toString();
                String S2 = editText2.getText().toString();
                String S3 = editText3.getText().toString();

                a = Double.parseDouble(S1);
                b = Double.parseDouble(S2);
                c = Double.parseDouble(S3);
                d = a + b / c;

                String S = Double.toString(d);
                textView.setText(S);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("olol", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("olol", "onResume");
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("olol", "onSaveInstanceState");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("olol", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("olol", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("olol", "onRestart");
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("olol", "onRestoreInstanceState");


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("olol", "onDestroy");

    }
    
}
