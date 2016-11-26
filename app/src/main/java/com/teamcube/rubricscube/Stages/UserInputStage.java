package com.teamcube.rubricscube.Stages;

import android.app.Application;

import com.davidstemmer.screenplay.stage.Stage;
import com.teamcube.rubricscube.R;
import com.teamcube.rubricscube.Riggers.SlideRigger;
import com.teamcube.rubricscube.RubricsCubeApplication;

/**
 * Created by matthewsturgill on 11/16/16.
 */

public class UserInputStage extends IndexedStage{
    private final SlideRigger rigger;

    public UserInputStage(Application context){
        super (UserInputStage.class.getName());
        this.rigger = new SlideRigger(context);
    }

    public UserInputStage(){
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

