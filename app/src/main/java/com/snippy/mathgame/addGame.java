package com.snippy.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class addGame extends AppCompatActivity {

    TextView score,life,time,que;
    EditText ans;
    Button ok,next;
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
    }
}