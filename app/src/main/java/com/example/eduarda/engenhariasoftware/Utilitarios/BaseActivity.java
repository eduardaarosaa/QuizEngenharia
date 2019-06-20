package com.example.eduarda.engenhariasoftware.Utilitarios;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    Pontuacao pontuacao;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initVars();
        initActions();

    }

    private void initVars() {
        pontuacao = new Pontuacao(this);
    }

    private void initActions() {

    }

    public void acertou() {
        int ok = 1;
        pontuacao.setNota(ok);
    }

    public void errou() {
        int error = 0;
        pontuacao.setNota(error);
    }

    public void reiniciarNota() {
        pontuacao.limpaNota();
    }

    public String pegaNota() {
        int text = pontuacao.getNota();

        if (text == 1) {
            return " Você acertou "+ text + " Pergunta";
        } else {
            return " Você acertou " + text + " Perguntas";
        }
    }
}