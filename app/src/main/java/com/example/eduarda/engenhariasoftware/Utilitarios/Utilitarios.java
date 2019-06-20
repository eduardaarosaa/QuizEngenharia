package com.example.eduarda.engenhariasoftware.Utilitarios;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.eduarda.engenhariasoftware.Comecar;
import com.example.eduarda.engenhariasoftware.Final;
import com.example.eduarda.engenhariasoftware.Perguntas1;
import com.example.eduarda.engenhariasoftware.R;

public class Utilitarios {

    public static void finalizarQuastionario(final Activity activity) {
        Button finaliza = activity.findViewById(R.id.btnFinalizar);
        finaliza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.startActivity(new Intent(activity, Final.class));
            }
        });
    }

    public static void mostraMsg(Activity activity, String msg) {

        Pontuacao pontuacao = new Pontuacao(activity);

        switch (msg) {
            case "Correta":
                pontuacao.setNota(1);
                break;
            case "Errada":
                pontuacao.setNota(0);
                break;
            default:
                pontuacao.setNota(0);
                break;
        }

        Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show();
    }

    public static void verificaCheckbox(final CheckBox ch1, final CheckBox ch2, final CheckBox ch3) {

        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch2.setChecked(false);
                ch3.setChecked(false);
            }
        });

        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch1.setChecked(false);
                ch3.setChecked(false);
            }
        });

        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ch2.setChecked(false);
                ch1.setChecked(false);
            }
        });
    }

    public static boolean verificaResposta(Activity activity, Class tela, CheckBox ch1, CheckBox ch2, CheckBox ch3) {
        if (ch1.isChecked() || ch2.isChecked() || ch3.isChecked()) {
            activity.startActivity(new Intent(activity, tela));
            return true;
        } else {
            mostraMsg(activity, "Selecione uma resposta!");
            return false;
        }
    }

}
