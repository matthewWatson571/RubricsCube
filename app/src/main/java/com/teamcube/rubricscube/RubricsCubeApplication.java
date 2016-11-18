package com.teamcube.rubricscube;

import android.app.Application;

import com.teamcube.rubricscube.Stages.UserCubeInputStage;

import flow.Flow;
import flow.History;

/**
 * Created by matthewsturgill on 11/16/16.
 */

public class RubricsCubeApplication extends Application {

    private static RubricsCubeApplication application;
    public final Flow mainFlow = new Flow(History.single(new UserCubeInputStage()));

    @Override
    public void onCreate() {
        super.onCreate();

        application = this;
    }

    public static RubricsCubeApplication getInstance(){
        return application;
    }

    public static Flow getMainFlow(){return getInstance().mainFlow;}

}

