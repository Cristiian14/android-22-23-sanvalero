package com.example.glovoandroid.fltr_ficha.view;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.glovoandroid.R;
import com.example.glovoandroid.entities.Restaurante;
import com.example.glovoandroid.fltr_ficha.FiltroFechaDescriptivaContract;
import com.example.glovoandroid.fltr_ficha.presenter.FiltroFechaDescriptivaPresenter;
import com.example.glovoandroid.fltr_usuario.FiltroNecUsuarioContract;
import com.example.glovoandroid.fltr_usuario.presenter.LstRestaurantPresenter;
import com.example.glovoandroid.fltr_usuario.view.FiltrUsuAdapter;

import java.util.ArrayList;

public class FiltrFichaDescriptivaActivity extends AppCompatActivity implements FiltroFechaDescriptivaContract.View {
    private FiltrFichaDescriptivaAdapter lstFichaRestaurantAdapter;
    private FiltroFechaDescriptivaPresenter lstFichaRestPresenter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ficha_tecnica);
        String nombre = getIntent().getExtras().getString("nombre");
        initComponents();
        initPresenter();
        initData(nombre);
    }
    public void initComponents(){

        recyclerView = (RecyclerView) findViewById(R.id.recyclerFichaTecnica);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

    }
    public void initPresenter(){
        lstFichaRestPresenter = new FiltroFechaDescriptivaPresenter(this);
    }
    public void initData(String filtro){
        lstFichaRestPresenter.lstFichaRestaurant(filtro); //SELECT * FROM SIMPSON
    }

    @Override
    public void onSuccessLstFichaRestaurant(ArrayList<Restaurante> lstFichaRestaurant) {
        FiltrFichaDescriptivaAdapter adapter = new FiltrFichaDescriptivaAdapter(getBaseContext(),lstFichaRestaurant);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onFailureLstFichaRestaurant(String err) {
        Toast.makeText(this, err, Toast.LENGTH_LONG).show();
    }
}