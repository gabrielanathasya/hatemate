package com.example.asus.hatematenew;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class partnerAdapter extends RecyclerView.Adapter<partnerAdapter.partnerViewHolder> {
    private ArrayList<partnerClass> dataList;

    public partnerAdapter(ArrayList<partnerClass> dataList) {
        this.dataList = dataList;
    }

    @Override
    public partnerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_partner, parent, false);
        return new partnerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(partnerViewHolder holder, int position) {
        holder.txtName.setText(dataList.get(position).getName());
        holder.txtBio.setText(dataList.get(position).getBio());
        holder.txtMatchPercent.setText(dataList.get(position).getMatchPercent());
        holder.displayPic.setImageDrawable(dataList.get(position).getDisplayPhoto());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class partnerViewHolder extends RecyclerView.ViewHolder{
        private TextView txtName, txtBio, txtMatchPercent;
        private ImageView displayPic;

        public partnerViewHolder(View itemView) {
            super(itemView);
            txtName = (TextView) itemView.findViewById(R.id.partner_name);
            txtBio = (TextView) itemView.findViewById(R.id.partner_bio);
            txtMatchPercent = (TextView) itemView.findViewById(R.id.partner_match_percent);
            displayPic = (ImageView) itemView.findViewById(R.id.partner_display_photo);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, partner_profile.class);
                    context.startActivity(intent);
                }
            });
        }
    }
}
