package com.teamcube.rubricscube.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;

import com.teamcube.rubricscube.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Matthew.Watson on 11/21/16.
 */

public class SolutionAdapter extends RecyclerView.Adapter<SolutionAdapter.SolutionHolder> {
    private Context context;
    public static ArrayList<Integer> instructionImages;


    public SolutionAdapter(ArrayList<Integer> instructionImages, Context context) {
        this.instructionImages = instructionImages;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(SolutionHolder holder, int position) {
        Integer solution = instructionImages.get(position);
        holder.bindMove(solution);
    }

    @Override
    public int getItemCount() {
        return instructionImages.size();
    }

    @Override
    public SolutionHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(context)
                .inflate(R.layout.solution_item, parent, false);
        return new SolutionHolder(inflatedView);
    }

    class SolutionHolder extends RecyclerView.ViewHolder { //populates view

        @Bind(R.id.move_image)
        ImageView solutionImage;

        @Bind(R.id.checkBox)
        CheckBox checkBox;


        SolutionHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        void bindMove(Integer solution) {
            Log.d("solution", String.valueOf(solution));
            solutionImage.setImageResource(solution);
            checkBox.setChecked(false);
        }
    }
}