package com.example.glovoandroid.fltr_ficha.presenter;

import com.example.glovoandroid.entities.Restaurante;
import com.example.glovoandroid.fltr_ficha.FiltroFechaDescriptivaContract;
import com.example.glovoandroid.fltr_ficha.model.FiltroFichaDescriptivaModel;
import com.example.glovoandroid.fltr_usuario.FiltroNecUsuarioContract;
import com.example.glovoandroid.fltr_usuario.model.FiltroNecUsuarioModel;

import java.util.ArrayList;

public class FiltroFechaDescriptivaPresenter implements FiltroFechaDescriptivaContract.Presenter {
    private FiltroFichaDescriptivaModel filtrFichaModel;
    private FiltroFechaDescriptivaContract.View view;

    public FiltroFechaDescriptivaPresenter(FiltroFechaDescriptivaContract.View view){
        this.view = view;
        this.filtrFichaModel = new FiltroFichaDescriptivaModel();
    }

    @Override
    public void lstFichaRestaurant(String filtro) {
        filtrFichaModel.lstFichaRestaurantWS(filtro, new FiltroFechaDescriptivaContract.Model.onLstFichaRestaurantListener() {
                @Override
                public void onSuccess(ArrayList<Restaurante> lstRestaurante) {

                    if(lstRestaurante!=null && lstRestaurante.size()>0){
                        view.onSuccessLstFichaRestaurant(lstRestaurante);

                    }else{
                        view.onSuccessLstFichaRestaurant(lstRestaurante);
                    }
                }

                @Override
                public void onFailure(String err) {
                    view.onFailureLstFichaRestaurant(err);
                }
            });
    }
}
