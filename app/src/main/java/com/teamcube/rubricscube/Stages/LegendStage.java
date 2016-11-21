package com.teamcube.rubricscube.Stages;

import android.app.Application;

import com.davidstemmer.screenplay.stage.Stage;
import com.teamcube.rubricscube.R;
import com.teamcube.rubricscube.Riggers.VerticalSlideRigger;
import com.teamcube.rubricscube.RubricsCubeApplication;

/**
 * Created by aaroncampbell on 11/17/16.
 */

public class LegendStage extends IndexedStage {
    private final VerticalSlideRigger rigger;


    public LegendStage(Application context) {
        //ScreenPlay and Flow handle the work
        super(LegendStage.class.getName());
        this.rigger = new VerticalSlideRigger(context);
    }

    public LegendStage() {
        this(RubricsCubeApplication.getInstance());
    }

    @Override
    public int getLayoutId() {
        return R.layout.cube_legend;
    }

    @Override
    public Stage.Rigger getRigger() {
        return rigger;
    }
}
