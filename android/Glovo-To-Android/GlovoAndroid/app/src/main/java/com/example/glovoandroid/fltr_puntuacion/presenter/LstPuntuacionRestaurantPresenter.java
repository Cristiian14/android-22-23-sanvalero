package com.example.glovoandroid.fltr_puntuacion.presenter;

import com.example.glovoandroid.entities.Restaurante;
import com.example.glovoandroid.fltr_puntuacion.LstPuntuacionRestaurantContract;
import com.example.glovoandroid.fltr_puntuacion.model.LstPuntuacionRestaurantModel;
import com.example.glovoandroid.fltr_ventas.LstVentasRestaurantContract;
import com.example.glovoandroid.fltr_ventas.model.LstVentasRestaurantModel;

import java.util.ArrayList;

public class LstPuntuacionRestaurantPresenter implements LstPuntuacionRestaurantContract.Presenter {
    private LstPuntuacionRestaurantModel lstPuntuacionRestaurantModel;
    private LstPuntuacionRestaurantContract.View view;

    public LstPuntuacionRestaurantPresenter(LstPuntuacionRestaurantContract.View view){
        this.view = view;
        this.lstPuntuacionRestaurantModel = new LstPuntuacionRestaurantModel();
    }

    @Override
    public void lstPuntuacionRestaurant(Restaurante restaurante) {
        lstPuntuacionRestaurantModel.lstPuntuacionRestaurantWS(null, new LstPuntuacionRestaurantContract.Model.onLstPuntuacionRestaurantListener() {
                @Override
                public void onSuccess(ArrayList<Restaurante> lstPuntuacionRestaurante) {

                    if(lstPuntuacionRestaurante!=null && lstPuntuacionRestaurante.size()>0){
                        view.onSuccessLstPuntuacionRestaurant(lstPuntuacionRestaurante);

                    }else{
                        view.onSuccessLstPuntuacionRestaurant(lstPuntuacionRestaurante);
                    }
                }

                @Override
                public void onFailure(String err) {
                    view.onFailureLstPuntuacionRestaurant(err);
                }
            });
    }
}
