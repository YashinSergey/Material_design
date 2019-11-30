package com.example.materialdesign;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ButtonsActivity extends AppCompatActivity {

    FloatingActionButton fab;
    Button flatButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        fab = findViewById(R.id.fab);
        flatButton = findViewById(R.id.flat_button_with_background);

        fab.setOnClickListener(clickListener);

        flatButton.setOnClickListener(clickListener);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(ButtonsActivity.this, "Fab test", Toast.LENGTH_SHORT).show();
        }
    };
}
