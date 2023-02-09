package com.sanvalero.singleton_01.actions;

import android.widget.Toast;

import com.sanvalero.singleton_01.MainActivity;

public class ACTION_MAIN {

    MainActivity principal;
    /* VINCULAR ENTRE OBJETOS*/
    private ACTION_MAIN(){
       this.principal = MainActivity.getInstance();

    }
    private static ACTION_MAIN actionMain = null;
    public static ACTION_MAIN getInstance(){
        if(actionMain==null){
            actionMain = new ACTION_MAIN();
        }
        return actionMain;
    }

    /* FIN */
    /*EMPEZAR A PROGRAMAR*/
    public void desencadenaAlerta(){
        MainActivity.getInstance();
        Toast.makeText(principal,
                "hello world!!!",
                Toast.LENGTH_LONG).
                show();
    }
}
