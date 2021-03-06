package com.snippy.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class addGame extends AppCompatActivity {

    TextView score,life,time,que;
    EditText ans;
    Button okay,next;

    Random rnd=new Random();
    int num1,num2,correct_ans;
    int userans,count, usrli;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_game);

        score=findViewById(R.id.textSc);
        life=findViewById(R.id.textLi);
        time=findViewById(R.id.txtTime);
        que=findViewById(R.id.textque);
        ans=findViewById(R.id.textAns);
        okay=(Button)findViewById(R.id.okBtn);
        next=(Button)findViewById(R.id.nextBtn);

        gameStart(); //calling logic of the game

        //ok button listener

        okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userans=Integer.parseInt(ans.getText().toString());

                if(userans==correct_ans){
                    que.setText("Congratulations your answer is true");
                    count=Integer.parseInt(score.getText().toString());
                    count+=10;

                    score.setText(count+"");

                }
                else{
                    que.setText("Sorry! your answer is wrong try again");
                    usrli=Integer.parseInt(life.getText().toString());
                    usrli--;

                    life.setText(usrli+"");

                }
            }
        });

        //next button listener
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText("");
                gameStart();
            }
        });


    }

    //game logic
    public void gameStart(){
        num1=rnd.nextInt(100);
        num2=rnd.nextInt(100);

        correct_ans=num1+num2;

        que.setText(num1+" + "+num2);

    }
}