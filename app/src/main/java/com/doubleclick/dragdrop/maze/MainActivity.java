package com.doubleclick.dragdrop.maze;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.doubleclick.dragdrop.Interface.move;
import com.doubleclick.dragdrop.R;

public class MainActivity extends AppCompatActivity {

    Button left, right, up, bottom;
    GameView game_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        game_view = findViewById(R.id.game_view);
        left = findViewById(R.id.left);
        up = findViewById(R.id.up);
        bottom = findViewById(R.id.bottom);
        right = findViewById(R.id.right);
        game_view.setMove(new move() {
            @Override
            public void done() {
                startActivity(new Intent(MainActivity.this, com.doubleclick.dragdrop.MyCanvas.MainActivity.class));
                Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
            }
        });
/*
        left.setOnClickListener(view -> {
            game_view.check = true;
            game_view.left = true;
            game_view.right = false;
            game_view.down = false;
            game_view.up = false;
            game_view.invalidate();
        });
        up.setOnClickListener(view -> {
            game_view.check = true;
            game_view.left = false;
            game_view.right = false;
            game_view.down = false;
            game_view.up = true;
            game_view.invalidate();
        });
        bottom.setOnClickListener(view -> {
            game_view.check = true;
            game_view.left = false;
            game_view.right = false;
            game_view.down = true;
            game_view.up = false;
            game_view.invalidate();
        });
        right.setOnClickListener(view -> {
            game_view.check = true;
            game_view.left = false;
            game_view.right = true;
            game_view.down = false;
            game_view.up = false;
            game_view.invalidate();
        });*/
    }
}
