package com.aplikasi.sahabatmengaji;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class AdapterChat extends RecyclerView.Adapter<AdapterChat.CardViewViewHolder> {
    private ArrayList<item_chat> itemChat;
    private Context context;

    public AdapterChat(Context context) {
        this.context = context;
    }

    private ArrayList<item_chat> getitemchat() {
        return itemChat;
    }

    public void setitemchat(ArrayList<item_chat> itemchat) {
        this.itemChat = itemchat;
    }
    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        Glide.with(context)
                .load(getitemchat().get(position).getGambar())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.Name.setText(getitemchat().get(position).getNama());
        holder.isi.setText(getitemchat().get(position).getIsipesan());
    }

    @Override
    public int getItemCount() {
        return getitemchat().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView Name, isi;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            Name = itemView.findViewById(R.id.tv_item_name);
            isi = itemView.findViewById(R.id.tv_item_from);
        }
    }
}
