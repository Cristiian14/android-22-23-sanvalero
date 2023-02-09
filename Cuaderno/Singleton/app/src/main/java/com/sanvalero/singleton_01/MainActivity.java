package com.sanvalero.singleton_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.sanvalero.singleton_01.actions.ACTION_MAIN;
import com.sanvalero.singleton_01.datos.TOSTADA;

public class MainActivity extends AppCompatActivity {

    private static final int MEDIUM_TIME = 4000;

    // PROGRAMAMOS A TRAVÉS DE EVENTOS
        // QUE NOS NOTIFICA EL MÓVIL


    //SINGLETON -> ESTÁTICA
    private static MainActivity miInstancia;
    public static MainActivity getInstance(){
        return miInstancia;
    }
    /***************ON LOAD EN JAVASCRIPT********************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miInstancia=this;
        //desencadenaAlerta();

        ACTION_MAIN actionMain = new ACTION_MAIN(this);
        //posicion memoria main activity

        actionMain.desencadenaAlerta();
    }
    /******************************************************/


    /*EMPEZAR A PROGRAMAR*/
    /*public void desencadenaAlerta(){
        Toast.makeText(this,
                "hello world!!!",
                Toast.LENGTH_LONG).
                    show();
    }*/
}