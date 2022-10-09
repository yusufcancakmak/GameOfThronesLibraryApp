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

public class KarakterAdapter extends RecyclerView.Adapter<KarakterAdapter.cardnesnetutucu> {
    private Context mcontext;
    private List<Karakter> karakterList;

    public KarakterAdapter(Context mcontext, List<Karakter> karakterList) {
        this.mcontext = mcontext;
        this.karakterList = karakterList;
    }

    @NonNull
    @Override
    public cardnesnetutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.karakter_list,parent,false);
        return new cardnesnetutucu(view);
    }

    @Override
    public void onBindViewHolder(@NonNull cardnesnetutucu holder, int position) {
        Karakter k =karakterList.get(position);
        holder.textViewisim.setText(k.getKarakterisim());
        holder.textViewkarakacıklama.setText(k.getKarakteracıklama());
        holder.imageViewkarakter.setImageResource(mcontext.getResources().getIdentifier(k.getKarakterresim(),"drawable",mcontext.getPackageName()));

    }

    @Override
    public int getItemCount() {
        return karakterList.size();
    }

    public class cardnesnetutucu extends RecyclerView.ViewHolder {
        private ImageView imageViewkarakter;
        private TextView textViewisim;
        private TextView textViewkarakacıklama;
        public cardnesnetutucu(@NonNull View itemView) {
            super(itemView);
            imageViewkarakter=itemView.findViewById(R.id.imageViewkarakter);
            textViewisim=itemView.findViewById(R.id.textViewisim);
            textViewkarakacıklama=itemView.findViewById(R.id.textViewkarakacıklama);

        }
    }
}
