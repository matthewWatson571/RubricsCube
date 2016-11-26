package com.teamcube.rubricscube.Stages;

import android.app.Application;

import com.davidstemmer.screenplay.stage.Stage;
import com.teamcube.rubricscube.R;
import com.teamcube.rubricscube.Riggers.SlideRigger;
import com.teamcube.rubricscube.RubricsCubeApplication;

/**
 * Created by matthewsturgill on 11/20/16.
 */

public class OrangeFaceInputStage extends IndexedStage{
    private final SlideRigger rigger;

    public OrangeFaceInputStage(Application context){
        super (OrangeFaceInputStage.class.getName());
        this.rigger = new SlideRigger(context);
    }

    public OrangeFaceInputStage(){
        this(RubricsCubeApplication.getInstance());

    }

    @Override
    public int getLayoutId() {
        return R.layout.orange_face_input_view;
    }

    @Override
    public Stage.Rigger getRigger() {
        return rigger;
    }

}

