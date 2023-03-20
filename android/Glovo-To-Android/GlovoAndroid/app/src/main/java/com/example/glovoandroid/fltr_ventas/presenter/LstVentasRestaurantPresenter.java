package com.example.glovoandroid.fltr_ventas.presenter;

import com.example.glovoandroid.entities.Restaurante;
import com.example.glovoandroid.fltr_ventas.LstVentasRestaurantContract;
import com.example.glovoandroid.fltr_ventas.model.LstVentasRestaurantModel;
import com.example.glovoandroid.lst_restaurantes.LstRestaurantContract;
import com.example.glovoandroid.lst_restaurantes.model.LstRestaurantModel;

import java.util.ArrayList;

public class LstVentasRestaurantPresenter implements LstVentasRestaurantContract.Presenter {
    private LstVentasRestaurantModel lstVentasRestaurantModel;
    private LstVentasRestaurantContract.View view;

    public LstVentasRestaurantPresenter(LstVentasRestaurantContract.View view){
        this.view = view;
        this.lstVentasRestaurantModel = new LstVentasRestaurantModel();
    }

    @Override
    public void lstVentasRestaurant(Restaurante restaurante) {
        lstVentasRestaurantModel.lstVentasRestaurantWS(null, new LstVentasRestaurantContract.Model.onLstVentasRestaurantListener() {
                @Override
                public void onSuccess(ArrayList<Restaurante> lstVentasRestaurante) {

                    if(lstVentasRestaurante!=null && lstVentasRestaurante.size()>0){
                        view.onSuccessLstVentasRestaurant(lstVentasRestaurante);

                    }else{
                        view.onSuccessLstVentasRestaurant(lstVentasRestaurante);
                    }
                }

                @Override
                public void onFailure(String err) {
                    view.onFailureLstVentasRestaurant(err);
                }
            });
    }
}
