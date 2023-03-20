package com.example.glovoandroid.fltr_ventas.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.glovoandroid.R;
import com.example.glovoandroid.entities.Restaurante;
import com.example.glovoandroid.fltr_ventas.LstVentasRestaurantContract;
import com.example.glovoandroid.fltr_ventas.presenter.LstVentasRestaurantPresenter;
import com.example.glovoandroid.lst_restaurantes.LstRestaurantContract;
import com.example.glovoandroid.lst_restaurantes.presenter.LstRestaurantPresenter;
import com.example.glovoandroid.lst_restaurantes.view.LstRestaurantAdapter;

import java.util.ArrayList;

public class LstVentasRestaurantActivity extends AppCompatActivity implements LstVentasRestaurantContract.View {
    private LstVentasRestaurantAdapter lstRestaurantAdapter;
    private LstVentasRestaurantPresenter lstVentasRestaurantPresenter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fltr_ventas_restaurant);
        initComponents();
        initPresenter();
        initData();

    }
    public void initComponents(){
        recyclerView = (RecyclerView) findViewById(R.id.recyclerV);

        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
    public void initPresenter(){
        lstVentasRestaurantPresenter = new LstVentasRestaurantPresenter(this);
    }
    public void initData(){
        lstVentasRestaurantPresenter.lstVentasRestaurant(null); //SELECT * FROM SIMPSON
    }

    @Override
    public void onSuccessLstVentasRestaurant(ArrayList<Restaurante> lstVentasRestaurant) {
        LstVentasRestaurantAdapter adapter = new LstVentasRestaurantAdapter(getBaseContext(),lstVentasRestaurant);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onFailureLstVentasRestaurant(String err) {
        Toast.makeText(this, err, Toast.LENGTH_LONG).show();
    }

}