/*
 * Copyright (c) Developed by John Alves at 2018/10/24.
 */

package com.example.eduarda.engenhariasoftware;

import android.app.Activity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Msg {

    public static void mostra(Activity activity, String msg) {
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

}
