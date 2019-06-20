/*
 * Copyright (c) Developed by John Alves at 2018/11/3.
 */

package com.example.eduarda.engenhariasoftware.Utilitarios;

import android.content.Context;
import android.content.SharedPreferences;

public class Pontuacao {

    private static final String NotaFinal = "NotaFinal";
    private final SharedPreferences Prefs;

    Pontuacao(Context context) {
        Prefs = context.getSharedPreferences(NotaFinal, Context.MODE_PRIVATE);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String nota = "nota";
    public void setNota(int s) {
        int rawNota = getNota();
        SharedPreferences.Editor editor = Prefs.edit();
        editor.putInt(nota, s+rawNota);
        editor.apply();
    }

    public int getNota() {
        return Prefs.getInt(nota, 0);
    }

    void limpaNota() {
        SharedPreferences.Editor editor = Prefs.edit();
        editor.putInt(nota, 0);
        editor.apply();
    }

}
