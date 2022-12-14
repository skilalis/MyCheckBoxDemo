package com.example.mycheckboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.io.CharArrayWriter;

public class MainActivity extends AppCompatActivity {
    private CheckBox milkCheckBox, sugarCheckBox, waterCheckBox;
    private Button showButton;
    private TextView resultTectView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkCheckBox = findViewById(R.id.milkCheckboxId);
        sugarCheckBox = findViewById(R.id.sugarCheckboxId);
        waterCheckBox = findViewById(R.id.waterCheckboxId);

        showButton =  findViewById(R.id.showButtonId);

        resultTectView = findViewById(R.id.resultTextViewId);

        showButton.setOnClickListener(new View.OnClickListener() {
            StringBuilder stringBuilder = new StringBuilder();

            @Override
            public void onClick(View v) {



                if (milkCheckBox.isChecked()){
                    String value = milkCheckBox.getText().toString();
                    stringBuilder.append(value +  " is orderd " + "\n");
                }
                if (sugarCheckBox.isChecked()){
                    String value = sugarCheckBox.getText().toString();
                    stringBuilder.append(value +  " is orderd " + "\n");
                }
                if (waterCheckBox.isChecked()){
                    String value = waterCheckBox.getText().toString();
                    stringBuilder.append(value +  " is orderd " + "\n");
                }


                resultTectView.setText(stringBuilder);

            }
        });

    }
}