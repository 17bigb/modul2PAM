package com.example.modul2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstNameEdit;
    private EditText lastNameEdit;
    private Button saveButton;
    private TextView textContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field);
        firstNameEdit = findViewById(R.id.firstNameEdit);
        lastNameEdit = findViewById(R.id.lastNameEdit);
        saveButton = findViewById(R.id.saveButton);
        textContent = findViewById(R.id.textContent);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textContent.setText("Nama : " +firstNameEdit.getText() + " " + lastNameEdit.getText());
            }
        });
        if(savedInstanceState != null){
            String name = savedInstanceState.getString("name");
            textContent.setText(name);
        }
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("name", textContent.getText().toString());
    }
}