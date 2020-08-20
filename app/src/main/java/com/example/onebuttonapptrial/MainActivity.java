package com.example.onebuttonapptrial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick (View view) {
        TextView textView = findViewById(R.id.numberOutcome);
        EditText editText = findViewById(R.id.inputNumberField);
        if (editText.getText().toString().isEmpty() || editText.getText() == null) {
            textView.setText(R.string.invalidResult);
        } else {
            double number = Double.parseDouble(editText.getText().toString());
            number = number * 1.8 + 32;
            String toDisplay = number + " F";
            textView.setText(toDisplay);
        }

    }
}