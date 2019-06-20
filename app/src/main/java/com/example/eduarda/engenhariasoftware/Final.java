package com.example.eduarda.engenhariasoftware;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

import com.example.eduarda.engenhariasoftware.Utilitarios.BaseActivity;


public class Final extends BaseActivity  implements OnClickListener {

    int nota;
    Button btnRecomecar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        TextView nota = findViewById(R.id.nota);
        nota.setText(pegaNota());

        Button btnRecomecar = findViewById(R.id.btnRecomecar);
        btnRecomecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reiniciarNota();
                startActivity(new Intent(getApplicationContext(), Comecar.class));
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}

