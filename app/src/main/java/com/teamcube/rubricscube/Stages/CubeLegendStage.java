package com.teamcube.rubricscube.Stages;

import android.app.Application;

import com.teamcube.rubricscube.R;
import com.teamcube.rubricscube.RubricsCubeApp;

/**
 * Created by aaroncampbell on 11/17/16.
 */

public class CubeLegendStage extends IndexedStage {

    public CubeLegendStage(Application context) {
        //ScreenPlay and Flow handle the work
        super(CubeLegendStage.class.getName());
    }

    public CubeLegendStage() {
        this(RubricsCubeApp.getInstance());
    }

    @Override
    public int getLayoutId() {
        return R.layout.cube_legend;
    }

    @Override
    public Rigger getRigger() {
        return null;
    }
}
