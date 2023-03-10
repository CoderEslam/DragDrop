package com.doubleclick.dragdrop.maze;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.doubleclick.dragdrop.R;

public class MainActivity extends AppCompatActivity {

    Button left, right, up, bottom;
    MyGameView canvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        canvas = findViewById(R.id.view);
        left = findViewById(R.id.left);
        up = findViewById(R.id.up);
        bottom = findViewById(R.id.bottom);
        right = findViewById(R.id.right);

        left.setOnClickListener(view -> {
            canvas.check = true;
            canvas.left = true;
            canvas.right = false;
            canvas.down = false;
            canvas.up = false;
            canvas.invalidate();
        });
        up.setOnClickListener(view -> {
            canvas.check = true;
            canvas.left = false;
            canvas.right = false;
            canvas.down = false;
            canvas.up = true;
            canvas.invalidate();
        });
        bottom.setOnClickListener(view -> {
            canvas.check = true;
            canvas.left = false;
            canvas.right = false;
            canvas.down = true;
            canvas.up = false;
            canvas.invalidate();
        });
        right.setOnClickListener(view -> {
            canvas.check = true;
            canvas.left = false;
            canvas.right = true;
            canvas.down = false;
            canvas.up = false;
            canvas.invalidate();
        });
    }
}
