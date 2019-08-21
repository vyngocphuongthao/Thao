package com.example.student.cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtA;
    EditText edtB;
    Button btnTong;
    Button btnHieu;
    TextView TextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtA = (EditText) findViewById(R.id.edtA);
        edtB = (EditText) findViewById(R.id.edtB);
        btnTong = (Button) findViewById(R.id.btnTong);
        btnHieu = (Button) findViewById(R.id.btnhieu);
        TextView = (TextView) findViewById(R.id.TxtView);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = Integer.parseInt(edtA.getText().toString())+Integer.parseInt(edtB.getText().toString());
                TextView.setText("Ket qua la" + result);
            }
        });


    }}
