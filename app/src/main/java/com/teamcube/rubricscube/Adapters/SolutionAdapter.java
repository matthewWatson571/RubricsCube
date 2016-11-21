package com.teamcube.rubricscube.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.teamcube.rubricscube.Cube.Cube;
import com.teamcube.rubricscube.Cube.Solution;
import com.teamcube.rubricscube.R;
import com.teamcube.rubricscube.Utils.Utils;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

import static com.teamcube.rubricscube.Utils.Utils.instructionImages;

/**
 * Created by Matthew.Watson on 11/21/16.
 */

public class SolutionAdapter extends RecyclerView.Adapter<SolutionAdapter.SolutionHolder> {
    private Context context;
//    public ArrayList<Solution> instructionImages;
//    private Cube cube;
//    ArrayList<Integer> instructionImages;


    public SolutionAdapterAdapter(ArrayList<Solution> caughtUsers, Context context) {
        this.instructionImages = instructionImages;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(SolutionHolder holder, int position) {
        Solution solution = instructionImages.get(position);
        holder.bindUser(solution);

    }

    @Override
    public int getItemCount() {

        return instructionImages == null ? 0 : instructionImages.size();
    }

    @Override
    public SolutionHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(context)
                .inflate(R.layout.solution_item, parent, false);
        return new SolutionHolder(inflatedView);
    }

    class CaughtListHolder extends RecyclerView.ViewHolder { //populates view

        @Bind(R.id.solution_image)
        ImageView solutionImage;


        public CaughtListHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindUser(Solution solution) {
            for (int i = 0; i < instructionImages.size(); i++) {
                solutionImage.setImageDrawable(instructionImages);
            }
        }
    }

}