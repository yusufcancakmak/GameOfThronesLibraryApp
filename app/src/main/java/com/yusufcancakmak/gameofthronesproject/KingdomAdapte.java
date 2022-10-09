package com.yusufcancakmak.gameofthronesproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class KingdomAdapte extends RecyclerView.Adapter<KingdomAdapte.cardnesnetutucu> {
private Context mcontext;
private List<Kingdom> kingdomList;

    public KingdomAdapte(Context mcontext, List<Kingdom> kingdomList) {
        this.mcontext = mcontext;
        this.kingdomList = kingdomList;
    }

    @NonNull
    @Override
    public cardnesnetutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.kingdom_list,parent,false);
        return new cardnesnetutucu(view);
    }

    @Override
    public void onBindViewHolder(@NonNull cardnesnetutucu holder, int position) {
    Kingdom kingdom = kingdomList.get(position);
    holder.textViewHaneAd.setText(kingdom.getKingdomAd());
    holder.textViewHaneAcıklama.setText(kingdom.getKingdomAcıklama());
    holder.imageViewFoto.setImageResource(mcontext.getResources().getIdentifier(kingdom.getKingdomResim(),"drawable",mcontext.getPackageName()));
    }

    @Override
    public int getItemCount() {
        return kingdomList.size();
    }

    public class cardnesnetutucu extends RecyclerView.ViewHolder {
        private ImageView imageViewFoto;
        private TextView textViewHaneAd;
        private TextView textViewHaneAcıklama;
        public cardnesnetutucu(@NonNull View itemView) {
            super(itemView);
            imageViewFoto=itemView.findViewById(R.id.imageViewFoto);
            textViewHaneAd=itemView.findViewById(R.id.textViewHaneAd);
            textViewHaneAcıklama=itemView.findViewById(R.id.textViewHaneAcıklama);
        }
    }
}
