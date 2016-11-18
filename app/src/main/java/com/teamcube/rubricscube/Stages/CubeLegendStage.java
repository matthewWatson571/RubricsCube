package com.teamcube.rubricscube.Stages;

import android.app.Application;

import com.davidstemmer.screenplay.stage.Stage;
import com.teamcube.rubricscube.R;
import com.teamcube.rubricscube.Riggers.VerticalSlideRigger;
import com.teamcube.rubricscube.RubricsCubeApplication;

/**
 * Created by aaroncampbell on 11/17/16.
 */

public class CubeLegendStage extends IndexedStage {
    private final VerticalSlideRigger rigger;


    public CubeLegendStage(Application context) {
        //ScreenPlay and Flow handle the work
        super(CubeLegendStage.class.getName());
        this.rigger = new VerticalSlideRigger(context);
    }

    public CubeLegendStage() {
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
