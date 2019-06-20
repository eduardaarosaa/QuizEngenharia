package com.example.eduarda.engenhariasoftware;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

import com.example.eduarda.engenhariasoftware.Utilitarios.BaseActivity;

public class Comecar extends BaseActivity implements OnClickListener {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comecar);

        button = findViewById(R.id.button);
        button.setOnClickListener(this);

        reiniciarNota();
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();
        switch (id) {
            case R.id.button:
                startActivity(new Intent(getBaseContext(), Perguntas0.class));
                finish();
                break;
        }

    }

}


