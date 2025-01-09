package com.example.viewbinding;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.viewbinding.databinding.ActivityTestBinding;

public class TestActivity extends AppCompatActivity {
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTestBinding binding = ActivityTestBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.testButton.setOnClickListener(v -> {
            binding.testTextView.setText(getCounterText());
        });
    }

    private String getCounterText() {
        return "Testing! " + ++counter;
    }
}