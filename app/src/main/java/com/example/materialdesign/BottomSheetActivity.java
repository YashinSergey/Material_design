package com.example.materialdesign;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class BottomSheetActivity extends AppCompatActivity {

    private LinearLayout bottomSheet;
    private BottomSheetBehavior bottomSheetBehavior;
    private TextView textView1;
    private TextView textView2;
    private int changedCounter = 0;
    private int slideCounter = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet);

        bottomSheet = findViewById(R.id.bottom_sheet);
        textView1 = findViewById(R.id.on_state_changed_counter);
        textView2 = findViewById(R.id.on_slide_counter);

        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_DRAGGING);

        bottomSheetBehavior.setHideable(false);

        bottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View view, int i) {
                textView1.setText(String.valueOf(changedCounter));
                changedCounter++;
            }

            @Override
            public void onSlide(@NonNull View view, float v) {
                textView2.setText(String.valueOf(slideCounter));
                slideCounter++;
            }
        });


    }
}
