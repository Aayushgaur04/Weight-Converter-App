package com.aayush.massconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button myBtn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        myBtn = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String InputText = editText.getText().toString();
                double killos = Double.parseDouble(InputText);

                double pounds = Converter(killos);

                textView.setText("" + pounds);
            }
        });
    }

    public double Converter(double kgs) {
        return kgs * 2.20462;
    }
}