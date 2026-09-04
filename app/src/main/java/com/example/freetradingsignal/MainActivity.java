package com.example.freetradingsignal;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Free Trading Signal App - Ready!");
        textView.setTextSize(20);
        textView.setPadding(50, 50, 50, 50);

        setContentView(textView);
    }
}
