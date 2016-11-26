package com.teamcube.rubricscube.Stages;

import android.app.Application;

import com.davidstemmer.screenplay.stage.Stage;
import com.teamcube.rubricscube.R;
import com.teamcube.rubricscube.Riggers.SlideRigger;
import com.teamcube.rubricscube.RubricsCubeApplication;

/**
 * Created by matthewsturgill on 11/21/16.
 */

public class RedFaceInputStage extends IndexedStage {
    private final SlideRigger rigger;

    public RedFaceInputStage(Application context){
        super (RedFaceInputStage.class.getName());
        this.rigger = new SlideRigger(context);
    }

    public RedFaceInputStage(){
        this(RubricsCubeApplication.getInstance());

    }

    @Override
    public int getLayoutId() {
        return R.layout.red_face_input_view;
    }

    @Override
    public Stage.Rigger getRigger() {
        return rigger;
    }

}

