package com.teamcube.rubricscube.Views;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.RelativeLayout;

import com.teamcube.rubricscube.Adapters.SolutionAdapter;
import com.teamcube.rubricscube.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Matthew.Watson on 11/20/16.
 */

public class SolutionView extends RelativeLayout {
    private Context context;
    SolutionAdapter solutionAdapter;

    @Bind(R.id.solution_recycler)
    RecyclerView recyclerView;


    public SolutionView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);

        solutionAdapter = new SolutionAdapter(new ArrayList<Integer>(), context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(solutionAdapter);

        printInstructions(UserCubeInputView.splitRub);
        solutionAdapter.notifyDataSetChanged();
    }


    public static void printInstructions(String[] splitRub) {

        for (int i = 0; i < splitRub.length; i++) {
            Log.d("splitRub[i]", splitRub[i]);
            switch (splitRub[i]) {
                case "F":
                    SolutionAdapter.instructionImages.add(R.drawable.clock_front);
                    break;
                case "F2":
                    SolutionAdapter.instructionImages.add(R.drawable.clock_front);
                    SolutionAdapter.instructionImages.add(R.drawable.clock_front);
                    break;
                case "F'":
                    SolutionAdapter.instructionImages.add(R.drawable.counter_front);
                    break;
                case "F'2":
                    SolutionAdapter.instructionImages.add(R.drawable.counter_front);
                    SolutionAdapter.instructionImages.add(R.drawable.counter_front);
                    break;
                case "U":
                    SolutionAdapter.instructionImages.add(R.drawable.clock_upper);
                    break;
                case "U2":
                    SolutionAdapter.instructionImages.add(R.drawable.clock_upper);
                    SolutionAdapter.instructionImages.add(R.drawable.clock_upper);
                    break;
                case "U'":
                    SolutionAdapter.instructionImages.add(R.drawable.counter_upper);
                    break;
                case "U'2":
                    SolutionAdapter.instructionImages.add(R.drawable.counter_upper);
                    SolutionAdapter.instructionImages.add(R.drawable.counter_upper);
                    break;
                case "L":
                    SolutionAdapter.instructionImages.add(R.drawable.clock_left);
                    break;
                case "L2":
                    SolutionAdapter.instructionImages.add(R.drawable.clock_left);
                    SolutionAdapter.instructionImages.add(R.drawable.clock_left);
                    break;
                case "L'":
                    SolutionAdapter.instructionImages.add(R.drawable.counter_left);
                    break;
                case "L'2":
                    SolutionAdapter.instructionImages.add(R.drawable.counter_left);
                    SolutionAdapter.instructionImages.add(R.drawable.counter_left);
                    break;
                case "R":
                    SolutionAdapter.instructionImages.add(R.drawable.clock_right);
                    break;
                case "R2":
                    SolutionAdapter.instructionImages.add(R.drawable.clock_right);
                    SolutionAdapter.instructionImages.add(R.drawable.clock_right);
                    break;
                case "R'":
                    SolutionAdapter.instructionImages.add(R.drawable.counter_right);
                    break;
                case "R'2":
                    SolutionAdapter.instructionImages.add(R.drawable.counter_right);
                    SolutionAdapter.instructionImages.add(R.drawable.counter_right);
                    break;
                case "D":
                    SolutionAdapter.instructionImages.add(R.drawable.clock_down);
                    break;
                case "D2":
                    SolutionAdapter.instructionImages.add(R.drawable.clock_down);
                    SolutionAdapter.instructionImages.add(R.drawable.clock_down);
                    break;
                case "D'":
                    SolutionAdapter.instructionImages.add(R.drawable.counter_down);
                    break;
                case "D'2":
                    SolutionAdapter.instructionImages.add(R.drawable.counter_down);
                    SolutionAdapter.instructionImages.add(R.drawable.counter_down);
                    break;
                case "B":
                    SolutionAdapter.instructionImages.add(R.drawable.clock_back);
                    break;
                case "B2":
                    SolutionAdapter.instructionImages.add(R.drawable.clock_back);
                    SolutionAdapter.instructionImages.add(R.drawable.clock_back);
                    break;
                case "B'":
                    SolutionAdapter.instructionImages.add(R.drawable.counter_back);
                    break;
                case "B'2":
                    SolutionAdapter.instructionImages.add(R.drawable.counter_back);
                    SolutionAdapter.instructionImages.add(R.drawable.counter_back);
                    break;
            }
        }

        Log.d("instructionImages.size", String.valueOf(SolutionAdapter.instructionImages.size()));
        Log.d("instructionImages", SolutionAdapter.instructionImages.toString());
    }


}
