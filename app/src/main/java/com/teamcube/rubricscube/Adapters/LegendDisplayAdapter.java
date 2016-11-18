package com.teamcube.rubricscube.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.teamcube.rubricscube.Models.LegendImageModel;
import com.teamcube.rubricscube.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by aaroncampbell on 11/17/16.
 */

public class LegendDisplayAdapter extends RecyclerView.Adapter<LegendDisplayAdapter.LegendHolder> {
    private Context context;
    public ArrayList<LegendImageModel> legendImages;

    public LegendDisplayAdapter(ArrayList<LegendImageModel> legendImages, Context context) {
        this.legendImages = legendImages;
        this.context = context;

    }

    @Override
    public int getItemCount() {
        return legendImages.size();
    }

    @Override
    public LegendHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(context)
                .inflate(R.layout.cube_legend_item, parent, false);

        return new LegendHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(LegendHolder holder, int position) {
        LegendImageModel legend = legendImages.get(position);
        holder.bindLegendImages(legend);
    }

    class LegendHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.legend_move_item)
        ImageView legendImage;

        @Bind(R.id.legend_move_icon)
        ImageView legendItem;


        public LegendHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindLegendImages(LegendImageModel legend) {
            legendItem.setImageResource(legend.getImageOneId());
            legendImage.setImageResource(legend.getImageTwoId());
        }
    }
}
