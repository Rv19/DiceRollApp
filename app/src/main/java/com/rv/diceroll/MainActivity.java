package com.rv.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollbutton;
        rollbutton=findViewById(R.id.Button1);
        final ImageView leftdice=findViewById(R.id.dce1);
        final ImageView rightdice=findViewById(R.id.dce2);
        final int[] dicearray={R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};
        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random RamdomGenerator=new Random();
                int number=RamdomGenerator.nextInt(6);
                leftdice.setImageResource(dicearray[number]);
                number=RamdomGenerator.nextInt(6);
                rightdice.setImageResource(dicearray[number]);

            }
        });
    }
}

