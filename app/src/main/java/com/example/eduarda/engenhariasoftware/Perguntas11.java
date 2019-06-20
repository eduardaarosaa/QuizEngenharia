package com.example.eduarda.engenhariasoftware;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.eduarda.engenhariasoftware.Utilitarios.Utilitarios;

public class Perguntas11 extends AppCompatActivity implements OnClickListener {

    CheckBox opc1;
    CheckBox opc2;
    CheckBox opc3;
    Button btn;
    TextView msg;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas11);

        opc1 = findViewById(R.id.opc1);
        opc2 = findViewById(R.id.opc2);
        opc3 = findViewById(R.id.opc3);
        btn = findViewById(R.id.btn);
//        msg = findViewById(R.id.msg);

        btn.setOnClickListener(this);
//        btn1 = findViewById(R.id.btn1);
        Utilitarios.verificaCheckbox(opc1, opc2, opc3);
        Utilitarios.finalizarQuastionario(this);

    }

    public void btn2(View v) {
        startActivity(new Intent(getBaseContext(), Final.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_perguntas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        if (Utilitarios.verificaResposta(this, Final.class, opc1, opc2, opc3)) {
            if (opc1.isChecked()) {
                Utilitarios.mostraMsg(this, "Correta");
            }
            if (opc2.isChecked()) {
                Utilitarios.mostraMsg(this, "Errada");
            }
            if (opc3.isChecked()) {
                Utilitarios.mostraMsg(this, "Errada");
            }

        }

    }
}
