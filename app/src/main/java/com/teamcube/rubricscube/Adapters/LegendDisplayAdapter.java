package com.teamcube.rubricscube.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.teamcube.rubricscube.Models.LegendModel;
import com.teamcube.rubricscube.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by aaroncampbell on 11/17/16.
 */

public class LegendDisplayAdapter extends RecyclerView.Adapter<LegendDisplayAdapter.LegendDisplayHolder> {
    private Context context;
    public ArrayList<LegendModel> legendImages;

    public LegendDisplayAdapter(ArrayList<LegendModel> legendImages, Context context) {
        this.legendImages = legendImages;
        this.context = context;

    }

    @Override
    public int getItemCount() {
        return legendImages.size();
    }

    @Override
    public LegendDisplayHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(context)
                .inflate(R.layout.cube_legend_item, parent, false);

        return new LegendDisplayHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(LegendDisplayHolder holder, int position) {
        LegendModel legend = legendImages.get(position);
        holder.bindLegendImages(legend);
    }

    class LegendDisplayHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.legend_move_item)
        ImageView legendImage;

        @Bind(R.id.legend_move_icon)
        ImageView legendItem;


        public LegendDisplayHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindLegendImages(LegendModel legend) {
            legendItem.setImageResource(legend.getImageOneId());
            legendImage.setImageResource(legend.getImageTwoId());
        }
    }
}
