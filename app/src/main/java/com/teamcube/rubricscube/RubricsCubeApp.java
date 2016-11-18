package com.teamcube.rubricscube;

import android.app.Application;

import com.teamcube.rubricscube.Stages.CubeLegendStage;

import flow.Flow;
import flow.History;

/**
 * Created by aaroncampbell on 11/17/16.
 */

public class RubricsCubeApp extends Application {
    private static RubricsCubeApp application;
    public final Flow mainFlow =
            new Flow(History.single(new CubeLegendStage()));

    @Override
    public void onCreate() {
        super.onCreate();

        application = this;
    }
    public static RubricsCubeApp getInstance() {
        return application;
    }

    public static Flow getMainFlow() {
        return getInstance().mainFlow;
    }
}
