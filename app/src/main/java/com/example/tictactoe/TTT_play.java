package com.example.tictactoe;


import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;


public class TTT_play extends AppCompatActivity implements View.OnClickListener {
    Button reset_btn;
    TextView mode,p_c;
    ImageView o1,o2,o3,o4,o5,o6,o7,o8,o9,x1,x2,x3,x4,x5,x6,x7,x8,x9,ba1,ba2,ba3,ba4,ba5,ba6,ba7,ba8,ba9;
    String [][] p= new String[3][3];
    String play="x";

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ttt_play);
        ba1=findViewById(R.id.back_00);
        ba2=findViewById(R.id.back_01);
        ba3=findViewById(R.id.back_02);
        ba4=findViewById(R.id.back_10);
        ba5=findViewById(R.id.back_11);
        ba6=findViewById(R.id.back_12);
        ba7=findViewById(R.id.back_20);
        ba8=findViewById(R.id.back_21);
        ba9=findViewById(R.id.back_22);

        reset_btn=findViewById(R.id.reset_button);


        mode= findViewById(R.id.player);
        p_c=findViewById(R.id.player_c);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("key");
            mode.setText(value);
        }
        p_c.setText(String.format("%s's turn", play));
        x1=findViewById(R.id.x00);
        x2=findViewById(R.id.x01);
        x3=findViewById(R.id.x02);
        x4=findViewById(R.id.x10);
        x5=findViewById(R.id.x11);
        x6=findViewById(R.id.x12);
        x7=findViewById(R.id.x20);
        x8=findViewById(R.id.x21);
        x9=findViewById(R.id.x22);
        o1=findViewById(R.id.o00);
        o2=findViewById(R.id.o01);
        o3=findViewById(R.id.o02);
        o4=findViewById(R.id.o10);
        o5=findViewById(R.id.o11);
        o6=findViewById(R.id.o12);
        o7=findViewById(R.id.o20);
        o8=findViewById(R.id.o21);
        o9=findViewById(R.id.o22);

        ba1.setOnClickListener(TTT_play.this);
        ba2.setOnClickListener(TTT_play.this);
        ba3.setOnClickListener(TTT_play.this);
        ba4.setOnClickListener(TTT_play.this);
        ba5.setOnClickListener(TTT_play.this);
        ba6.setOnClickListener(TTT_play.this);
        ba7.setOnClickListener(TTT_play.this);
        ba8.setOnClickListener(TTT_play.this);
        ba9.setOnClickListener(TTT_play.this);
        reset_btn.setOnClickListener(TTT_play.this);


    }

    @Override
    public void onClick(View v) {
        if(v==ba1&&play=="x"&&p[0][0]==null) {x1.setVisibility(View.VISIBLE); p[0][0]="x";p_c.setText(String.format("%s's turn", play)); checkwin(p,play);play="o";}
        else if(v==ba1&&play=="o"&&p[0][0]==null) {o1.setVisibility(View.VISIBLE);;p[0][0]="o";p_c.setText(String.format("%s's turn", play));checkwin(p,play);play="x";}

        else if(v==ba2&&play=="x"&&p[0][1]==null) {x2.setVisibility(View.VISIBLE);p[0][1]="x";p_c.setText(String.format("%s's turn", play));checkwin(p,play);play="o";}
        else if(v==ba2&&play=="o"&&p[0][1]==null) {o2.setVisibility(View.VISIBLE);p[0][1]="o";p_c.setText(String.format("%s's turn", play));checkwin(p,play);play="x";}

        else if(v==ba3&&play=="x"&&p[0][2]==null){x3.setVisibility(View.VISIBLE);p[0][2]="x";p_c.setText(String.format("%s's turn", play));checkwin(p,play);play="o";}
        else if(v==ba3&&play=="o"&&p[0][2]==null){o3.setVisibility(View.VISIBLE);p[0][2]="o";p_c.setText(String.format("%s's turn", play));checkwin(p,play);play="x";}

        else if(v==ba4&&play=="x"&&p[1][0]==null){x4.setVisibility(View.VISIBLE);p[1][0]="x";p_c.setText(String.format("%s's turn", play));checkwin(p,play);play="o";}
        else if(v==ba4&&play=="o"&&p[1][0]==null){o4.setVisibility(View.VISIBLE);p[1][0]="o";p_c.setText(String.format("%s's turn", play));checkwin(p,play);play="x";}

        else if(v==ba5&&play=="x"&&p[1][1]==null){x5.setVisibility(View.VISIBLE);p[1][1]="x";p_c.setText(String.format("%s's turn", play));checkwin(p,play);play="o";}
        else if(v==ba5&&play=="o"&&p[1][1]==null){o5.setVisibility(View.VISIBLE);p[1][1]="o";p_c.setText(String.format("%s's turn", play));checkwin(p,play);play="x";}

        else if(v==ba6&&play=="x"&&p[1][2]==null){x6.setVisibility(View.VISIBLE);p[1][2]="x";p_c.setText(String.format("%s's turn", play));checkwin(p,play);play="o";}
        else if(v==ba6&&play=="o"&&p[1][2]==null){o6.setVisibility(View.VISIBLE);p[1][2]="o";p_c.setText(String.format("%s's turn", play));checkwin(p,play);play="x";}

        else if(v==ba7&&play=="x"&&p[2][0]==null){x7.setVisibility(View.VISIBLE);p[2][0]="x";p_c.setText(String.format("%s's turn", play));checkwin(p,play);play="o";}
        else if(v==ba7&&play=="o"&&p[2][0]==null){o7.setVisibility(View.VISIBLE);p[2][0]="o";p_c.setText(String.format("%s's turn", play));checkwin(p,play);play="x";}

        else if(v==ba8&&play=="x"&&p[2][1]==null){x8.setVisibility(View.VISIBLE);p[2][1]="x";p_c.setText(String.format("%s's turn", play));checkwin(p,play);play="o";}
        else if(v==ba8&&play=="o"&&p[2][1]==null){o8.setVisibility(View.VISIBLE);p[2][1]="o";p_c.setText(String.format("%s's turn", play));checkwin(p,play);play="x";}

        else if(v==ba9&&play=="x"&&p[2][2]==null){x9.setVisibility(View.VISIBLE);p[2][2]="x";p_c.setText(String.format("%s's turn", play));checkwin(p,play);play="o";}
        else if(v==ba9&&play=="o"&&p[2][2]==null){o9.setVisibility(View.VISIBLE);p[2][2]="o";p_c.setText(String.format("%s's turn", play));checkwin(p,play);play="x";}
        else if(v==reset_btn){reset_btn();}
    }

    @SuppressLint("SetTextI18n")
    public void checkwin(String [][] r, String play){
        String [][] e= new String[3][3];

        //top
        if(Objects.equals(r[0][0], play) && Objects.equals(r[0][1], play) && Objects.equals(r[0][2], play)){
            p_c.setText(String.format("%s  Wins", play));bclick();
        }
        //horizontal-middle
        else if(Objects.equals(r[1][0], play) && Objects.equals(r[1][1], play) && Objects.equals(r[1][2], play)){
            p_c.setText(String.format("%s  Wins", play));bclick();
        }
        //bottom
        else if(Objects.equals(r[2][0], play) && Objects.equals(r[2][1], play) && Objects.equals(r[2][2], play)){
            p_c.setText(String.format("%s  Wins", play));bclick();
        }
        //left-cross
        else if(Objects.equals(r[0][0], play) && Objects.equals(r[1][1], play) && Objects.equals(r[2][2], play)){
            p_c.setText(String.format("%s  Wins", play));bclick();
        }
        //left
        else if(Objects.equals(r[0][0], play) && Objects.equals(r[1][0], play) && Objects.equals(r[2][0], play)){
            p_c.setText(String.format("%s  Wins", play));bclick();
        }
        //vertical-middle
        else if(Objects.equals(r[0][1], play) && Objects.equals(r[1][1], play) && Objects.equals(r[2][1], play)){
            p_c.setText(String.format("%s  Wins", play));bclick();
        }
        //right
        else if(Objects.equals(r[0][2], play) && Objects.equals(r[1][2], play) && Objects.equals(r[2][2], play)){
            p_c.setText(String.format("%s  Wins", play));bclick();
        }
        //right-cross
        else if(Objects.equals(r[0][2], play) && Objects.equals(r[1][1], play) && Objects.equals(r[2][0], play)){
            p_c.setText(String.format("%s  Wins", play));bclick();
        }
        else if(isArrayFull(p)){
            p_c.setText("it's a draw");bclick();
    }}
    public void reset_btn(){
        x1.setVisibility(View.INVISIBLE);
        x2.setVisibility(View.INVISIBLE);
        x3.setVisibility(View.INVISIBLE);
        x4.setVisibility(View.INVISIBLE);
        x5.setVisibility(View.INVISIBLE);
        x6.setVisibility(View.INVISIBLE);
        x7.setVisibility(View.INVISIBLE);
        x8.setVisibility(View.INVISIBLE);
        x9.setVisibility(View.INVISIBLE);
        o1.setVisibility(View.INVISIBLE);
        o2.setVisibility(View.INVISIBLE);
        o3.setVisibility(View.INVISIBLE);
        o4.setVisibility(View.INVISIBLE);
        o5.setVisibility(View.INVISIBLE);
        o6.setVisibility(View.INVISIBLE);
        o7.setVisibility(View.INVISIBLE);
        o8.setVisibility(View.INVISIBLE);
        o9.setVisibility(View.INVISIBLE);
        play="x";p= new String[3][3];
        p_c.setText(String.format("%s's turn", play));
        ba1.setEnabled(true);
        ba2.setEnabled(true);
        ba3.setEnabled(true);
        ba4.setEnabled(true);
        ba5.setEnabled(true);
        ba6.setEnabled(true);
        ba7.setEnabled(true);
        ba8.setEnabled(true);
        ba9.setEnabled(true);
    }
    public void bclick(){
        ba1.setEnabled(false);
        ba2.setEnabled(false);
        ba3.setEnabled(false);
        ba4.setEnabled(false);
        ba5.setEnabled(false);
        ba6.setEnabled(false);
        ba7.setEnabled(false);
        ba8.setEnabled(false);
        ba9.setEnabled(false);

    }
    public boolean isArrayFull(String[][] r){

            int i;
            int j;
            for (i = 0; i < r.length; i++) {
                for (j = 0; j < r.length; j++)
                    if (null == r[i][j]) {
                        return false;
                    }
            }
            return true;
        }


}