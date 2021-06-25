package com.example.activiti__10;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterLihatBarang extends RecyclerView.Adapter<AdapterLihatBarang.Viewholder> {
    private ArrayList<Barang> daftarbarang;
    private Context context;

    public AdapterLihatBarang(ArrayList<Barang> barangs, Context ctx){
        daftarbarang = barangs;
        context = ctx;
    }
    class Viewholder extends RecyclerView.ViewHolder {
        TextView tvTitle;

        Viewholder(View v) {
            super(v);
            tvTitle = (TextView) v.findViewById(R.id.tv_namabarang);
        }

    }
    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewtype) {
        View v =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_barang, parent, false);
        Viewholder vh = new Viewholder(v);
        return  vh;
    }

    @Override
    public void onBindViewHolder(Viewholder holder, final int position) {
        final String name = daftarbarang.get(position).getNama();
        holder.tvTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        holder.tvTitle.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return true;
            }
        });
        holder.tvTitle.setText(name);
    }

    @Override
    public int getItemCount() {
        return daftarbarang.size();
    }
}
