package com.example.pbb3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder>{

    private ArrayList<ItemAdapter> mlist;
    private Context context;

    public adapter(ArrayList<ItemAdapter> mlist, Context context) {
        super();
        this.mlist = mlist;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemAdapter itemAdapter = mlist.get(position);
        holder.fotokopi.setImageResource(itemAdapter.getImage());
        holder.namakopi.setText(itemAdapter.getText1());
        holder.harga.setText(""+itemAdapter.getText2());

        holder.materialCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context, itemAdapter.getText1() ,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, Detail_produk.class);

                intent.putExtra("gambar", itemAdapter.getImage());
                intent.putExtra("judul", itemAdapter.getText1());
                intent.putExtra("harga", itemAdapter.getText2());
                intent.putExtra("deskripsi", itemAdapter.getDeskripsi());

                context.startActivities(new Intent[]{intent});
            }
        });
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView fotokopi;
        TextView namakopi;
        TextView harga;
        MaterialCardView materialCardView ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fotokopi = itemView.findViewById(R.id.fotokopi);
            namakopi = itemView.findViewById(R.id.nama_kopi);
            harga = itemView.findViewById(R.id.harga_view);
            materialCardView = itemView.findViewById(R.id.material_card);

        }
    }
}
