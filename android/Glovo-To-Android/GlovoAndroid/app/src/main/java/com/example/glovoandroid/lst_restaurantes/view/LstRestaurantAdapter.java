package com.example.glovoandroid.lst_restaurantes.view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import com.example.glovoandroid.R;
import com.example.glovoandroid.entities.Restaurante;
import com.example.glovoandroid.fltr_ficha.view.FiltrFichaDescriptivaActivity;
import com.squareup.picasso.Picasso;


import java.util.ArrayList;

public class LstRestaurantAdapter extends RecyclerView.Adapter<LstRestaurantAdapter.ViewHolder>   {
    private ArrayList<Restaurante> dataset;
    private Context mContext;



    public LstRestaurantAdapter(Context mContext, ArrayList<Restaurante> lstRestaurantes){
        this.dataset = lstRestaurantes;
        this.mContext = mContext;
    }


    @Override
    public LstRestaurantAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.restaurante,parent,false);
        return new LstRestaurantAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LstRestaurantAdapter.ViewHolder holder, int position) {
        Restaurante r = dataset.get(position);

        //holder.idRestaurante.setText(String.valueOf(r.getID_RESTAURANTE()));
        holder.nombreRestaurante.setText(r.getNOMBRE());
        /*holder.tipoRestaurante.setText(r.getTIPO());
        holder.ventasRestaurante.setText(String.valueOf(r.getVENTAS()));
        holder.puntuacionRestaurante.setText(String.valueOf(r.getPUNTUACION()));
*/

        Picasso.get().load(r.getIMAGEN()).into(holder.imagenRestaurante);

        //String id = String.valueOf(holder.idRestaurante.getText());
        holder.btnFicha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), FiltrFichaDescriptivaActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                //intent.putExtra("id", 6);
                intent.putExtra("nombre", holder.nombreRestaurante.getText());
                view.getContext().startActivity(intent);
            }
        });





    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView idRestaurante;
        private TextView nombreRestaurante;
        private TextView tipoRestaurante;
        private TextView ventasRestaurante;
        private TextView puntuacionRestaurante;
        private ImageView imagenRestaurante;
        private Button btnFicha;


        public ViewHolder(View itemView) {
            super(itemView);


            btnFicha = (Button)itemView.findViewById(R.id.btnFicha);


            //idRestaurante = itemView.findViewById(R.id.ID_RESTAURANTE);
            nombreRestaurante = itemView.findViewById(R.id.NOMBRE);
            /*tipoRestaurante = itemView.findViewById(R.id.TIPO);
            ventasRestaurante = itemView.findViewById(R.id.VENTAS);
            puntuacionRestaurante = itemView.findViewById(R.id.PUNTUACION);*/
            imagenRestaurante=(ImageView)itemView.findViewById(R.id.IMAGEN);
        }
    }
    public void adicionarListaRestaurante(ArrayList<Restaurante> lstRestaurant) {
        //dataset.addAll(lstRestaurant);
        //notifyDataSetChanged();
    }
}
