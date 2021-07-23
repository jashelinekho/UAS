package com.example.uas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static TextView text_placeholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_placeholder = findViewById(R.id.text_placeholder);
        text_placeholder.setText("Text is not changed!");

        Button click_me_button = this.findViewById(R.id.click_me_button);
        Button reset_button = this.findViewById(R.id.reset_button);

        click_me_button.setOnClickListener(this);
        reset_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.click_me_button){
            text_placeholder.setText("Text Changed!");
        }
        else if(v.getId() == R.id.reset_button){
            text_placeholder.setText("Text is not changed!!");
        }
    }
}
