package com.teamcube.rubricscube.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.teamcube.rubricscube.Components.Utils;
import com.teamcube.rubricscube.Cube.Solution;
import com.teamcube.rubricscube.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

import static com.teamcube.rubricscube.Components.Utils.instructionImages;

/**
 * Created by Matthew.Watson on 11/21/16.
 */

public class SolutionAdapter extends RecyclerView.Adapter<SolutionAdapter.SolutionHolder> {
    private Context context;
//    public ArrayList<Solution> instructionImages;
//    private Cube cube;
//    ArrayList<Integer> instructionImages;


    public SolutionAdapter(ArrayList<Integer> instructionImages, Context context) {
        this.instructionImages = instructionImages;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(SolutionHolder holder, int position) {
        Solution solution = instructionImages.get(position);
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

        @Bind(R.id.solution_image)
        ImageView solutionImage;


        public SolutionHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindMove() {
            for (int i = 0; i < instructionImages.size(); i++) {
                solutionImage.setImageResource(instructionImages.get(i));
            }
        }
    }
}