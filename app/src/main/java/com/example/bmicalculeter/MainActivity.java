package com.example.bmicalculeter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView txt1,txt2;
    TextInputEditText txtedit1,txtedit2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txtedit1 = findViewById(R.id.txtedit1);
        txtedit2 = findViewById(R.id.txtedit2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              double height = Integer.parseInt(txtedit2.getText().toString());
              double weight = Integer.parseInt(txtedit1.getText().toString());
                 double ans;

                 ans = weight / ((height/100) *  (height/100));
                 txt2.setText(new DecimalFormat("##.##").format(ans));
            }
        });

    }
}
