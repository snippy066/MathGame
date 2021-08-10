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
    Button ok,next;

    Random rnd=new Random();
    int num1,num2,correct_ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_game);

        score=findViewById(R.id.textSc);
        life=findViewById(R.id.textLi);
        time=findViewById(R.id.txtTime);
        que=findViewById(R.id.textque);
        ans=findViewById(R.id.textAns);
        ok=findViewById(R.id.btnOk);
        next=findViewById(R.id.btnNext);

        gameStart(); //calling logic of the game

        //ok button listener
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int userans=Integer.parseInt(ans.getText().toString());

                if(userans==correct_ans){
                    int count=Integer.parseInt(score.getText().toString());
                    count+=10;

                    score.setText(count+"");

                    que.setText("Congratulations your answer is true");
                }
                else{
                    int usrli=Integer.parseInt(life.getText().toString());
                    usrli--;

                    life.setText(usrli+"");

                    que.setText("Sorry! your answer is wrong try again");
                }

            }
        });

        //next button listener
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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