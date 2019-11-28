package com.example.materialdesign;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private static final int MAX_TEXT_LENGTH = 10;
    private static final String EMPTY_LINE = "";
    private static final String ERROR_MESSAGE = "10 characters max";
    
    private TextInputLayout tInputLayout;
    private TextInputEditText tEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        tEditText.addTextChangedListener(textWatcher);
    }

    private void initViews() {
        tInputLayout = findViewById(R.id.textInputLayout);
        tEditText = findViewById(R.id.textInputEditText);
    }

    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if(count > MAX_TEXT_LENGTH) {
                showError();
            } else {
                hideError();
            }
        }
        @Override
        public void afterTextChanged(Editable s) {}
    };

    private void hideError() {
        tInputLayout.setError(EMPTY_LINE);
    }

    private void showError() {
        if (Objects.requireNonNull(tEditText.getText()).length() > MAX_TEXT_LENGTH) {
            tInputLayout.setError(ERROR_MESSAGE);
        }
    }
}
