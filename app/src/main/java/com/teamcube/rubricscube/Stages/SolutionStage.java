package com.teamcube.rubricscube.Stages;

import android.app.Application;

import com.teamcube.rubricscube.R;
import com.teamcube.rubricscube.Riggers.SlideRigger;
import com.teamcube.rubricscube.RubricsCubeApplication;

/**
 * Created by Matthew.Watson on 11/21/16.
 */

public class SolutionStage extends IndexedStage {
    private final SlideRigger rigger; //sets Rigger

    @Override
    public int getLayoutId() {
        return R.layout.solution_view;
    }

    @Override
    public Rigger getRigger() {
        return rigger;
    }

    private SolutionStage(Application context) {
        super(SolutionStage.class.getName());
        this.rigger = new SlideRigger(context);
    }

    public SolutionStage() {
        this(RubricsCubeApplication.getInstance());
    }
}