package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button play_btn, vs_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;});
        play_btn= (Button) findViewById(R.id.play_button);
        play_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sintent= new Intent(MainActivity.this, TTT_play.class);
                sintent.putExtra("key","play");
                startActivity(sintent);

            }
        });
        vs_btn= (Button) findViewById(R.id.vs_button);
        vs_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sintent= new Intent(MainActivity.this, TTT_play.class);
                sintent.putExtra("key","vs");
                startActivity(sintent);

            }
        });
    }
}