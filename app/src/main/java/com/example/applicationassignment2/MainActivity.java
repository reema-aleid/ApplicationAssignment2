package com.example.applicationassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextTextPersonName;
    Button ClickHere;
    TextView Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTextPersonName =(EditText)findViewById(R.id.editTextTextPersonName);
        ClickHere =(Button) findViewById(R.id.ClickHere);
        Name =(TextView) findViewById(R.id.Name);

        ClickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name =editTextTextPersonName.getText().toString();
                Name.setText("Hello,"+name);
            }
        });



    }
}