package com.example.eva_1;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListaAdaptador extends RecyclerView.Adapter<ListaAdaptador.ViewHolder>{

    private List<listaElementos> mData;
    private LayoutInflater mInflater;
    private Context context;

    public ListaAdaptador(List<listaElementos> itemList, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }

    @Override
    public int getItemCount(){
        return mData.size();
    }
    public ListaAdaptador.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.lista_elementos, null);
        return new ListaAdaptador.ViewHolder(view);

    }
    @Override
    public void onBindViewHolder (final ListaAdaptador.ViewHolder holder, final int position){
        holder.bindData(mData.get(position));
    }

    public void setItems(List<listaElementos> items){
        mData = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView nombre, ciudad, estado;

        ViewHolder(View itemView){
            super(itemView);
            iconImage=itemView.findViewById(R.id.corazon_roto);
            nombre=itemView.findViewById(R.id.txt_nombre);
            ciudad=itemView.findViewById(R.id.txt_ciudad);
            estado=itemView.findViewById(R.id.txt_estado);
        }

        void bindData(final listaElementos item){
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            nombre.setText(item.getNombre());
            ciudad.setText(item.getCiudad());
            estado.setText(item.getEstado());
        }
    }

}

