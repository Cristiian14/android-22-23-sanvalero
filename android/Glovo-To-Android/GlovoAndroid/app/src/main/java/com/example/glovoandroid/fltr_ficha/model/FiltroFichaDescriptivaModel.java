package com.example.glovoandroid.fltr_ficha.model;

import com.example.glovoandroid.entities.Restaurante;
import com.example.glovoandroid.fltr_ficha.FiltroFechaDescriptivaContract;
import com.example.glovoandroid.utils.ApiClient;
import com.example.glovoandroid.utils.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FiltroFichaDescriptivaModel implements FiltroFechaDescriptivaContract.Model {
    @Override
    public void lstFichaRestaurantWS(String filtro, onLstFichaRestaurantListener onLstFichaRestaurantListener) {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<ArrayList<Restaurante>> call = apiService.getFichaDesc(filtro);
        call.enqueue(new Callback<ArrayList<Restaurante>>() {
            @Override
            public void onResponse(Call<ArrayList<Restaurante>> call, Response<ArrayList<Restaurante>> response) {
                ArrayList<Restaurante> listaRestaurante = response.body();
                onLstFichaRestaurantListener.onSuccess(listaRestaurante);
            }

            @Override
            public void onFailure(Call<ArrayList<Restaurante>> call, Throwable t) {
                    onLstFichaRestaurantListener.onFailure(t.getMessage());
            }
        });

    }

}
