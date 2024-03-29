package com.example.materialdesign;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

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
            Snackbar.make(v,"Btn test", Snackbar.LENGTH_SHORT).show();
        }
    };
}
