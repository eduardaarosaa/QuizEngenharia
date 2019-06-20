package com.example.eduarda.engenhariasoftware;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Perguntas10 extends AppCompatActivity implements OnClickListener {

    CheckBox opc1;
    CheckBox opc2;
    CheckBox opc3;
    Button btn;
    TextView msg;
    Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas10);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
////        setSupportActionBar(toolbar);
////
////        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
////        fab.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
////                        .setAction("Action", null).show();
////            }
////        });

        opc1 = (CheckBox)findViewById(R.id.opc1);
        opc2 = (CheckBox)findViewById(R.id.opc2);
        opc3 = (CheckBox)findViewById(R.id.opc3);
        btn = (Button)findViewById(R.id.btn);
        msg =  (TextView)findViewById(R.id.msg);

        btn.setOnClickListener(this);

        btn2 = (Button)findViewById(R.id.btn2);
        Msg.verificaCheckbox(opc1, opc2, opc3);


    }
    public void btn2(View v) {
        startActivity(new Intent(getBaseContext(), Perguntas11.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_perguntas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }





    @Override
    public void onClick(View v) {

        String mensagem = "";

        if(opc1.isChecked()){
            Msg.mostra(this, "Errada");
        }
        if(opc2.isChecked()){
            Msg.mostra(this, "Errada");
        }
        if(opc3.isChecked()){

            Msg.mostra(this, "Correta");
        }

        msg.setText(mensagem);
    }
}
