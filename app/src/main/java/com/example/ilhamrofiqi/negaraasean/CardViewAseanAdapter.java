package com.example.ilhamrofiqi.negaraasean;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewAseanAdapter extends RecyclerView.Adapter<CardViewAseanAdapter.CardViewViewHolder> {
    private ArrayList<Asean>listAsean;
    private Context context;

    public CardViewAseanAdapter (Context context){
        this.context = context;
    }

    public ArrayList<Asean> getListAsean(){
        return listAsean;
    }

    public void setListAsean(ArrayList<Asean> listAsean){
        this.listAsean = listAsean;
    }
    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_asean, parent, false);
        CardViewViewHolder viewHolder =  new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder (CardViewViewHolder holder, int position) {
        final Asean p = getListAsean().get(position);

        Glide.with(context)
                .load(p.getPhoto())
                .override(350, 550)
                .into(holder.imgPhoto);

        holder.tvName.setText(p.getName());
        holder.tvRemarks.setText(p.getRemarks());

        holder.btnShare.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share " + getListAsean().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));

        holder.btnDetail.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent intent = new Intent (context, Detail_activity.class);
                intent.putExtra("Name", p.getName());
                intent.putExtra("Remarks", p.getRemarks());
                intent.putExtra("Photo", p.getPhoto());
                intent.putExtra("Deskripsi", p.getDeskripsi());
                intent.putExtra("Ibukota", p.getIbukota());
                intent.putExtra("Bahasa", p.getBahasa());
                intent.putExtra("Merdeka", p.getMerdeka());
                intent.putExtra("Matauang", p.getMatauang());
                intent.putExtra("Luas", p.getLuas());
                context.startActivity(intent);
            }
        }));
    }

    @Override
    public int getItemCount(){
        return getListAsean().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnShare, btnDetail;
        public CardViewViewHolder(View itemView){
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView)itemView.findViewById(R.id.tv_item_remarks);
            btnShare = (Button)itemView.findViewById(R.id.btn_set_share);
            btnDetail = (Button)itemView.findViewById(R.id.btn_set_detail);
        }
    }

}