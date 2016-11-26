package com.teamcube.rubricscube.Stages;

import android.app.Application;

import com.davidstemmer.screenplay.stage.Stage;
import com.teamcube.rubricscube.R;
import com.teamcube.rubricscube.Riggers.VerticalSlideRigger;
import com.teamcube.rubricscube.RubricsCubeApplication;

/**
 * Created by matthewsturgill on 11/16/16.
 */

public class UserCubeInputStage extends IndexedStage{
    private final VerticalSlideRigger rigger;

    public UserCubeInputStage(Application context){
        super (UserCubeInputStage.class.getName());
        this.rigger = new VerticalSlideRigger(context);
    }

    public UserCubeInputStage(){
        this(RubricsCubeApplication.getInstance());

    }

    @Override
    public int getLayoutId() {
        return R.layout.user_cube_view;
    }

    @Override
    public Stage.Rigger getRigger() {
        return rigger;
    }

}

