package com.doubleclick.dragdrop.MyCanvas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.doubleclick.dragdrop.R;

public class MainActivity extends AppCompatActivity {


    Button left, right, up, bottom;
    MyCanvas canvas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_canvas);
        canvas = findViewById(R.id.my_canvas);
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