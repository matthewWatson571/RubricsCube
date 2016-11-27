package com.teamcube.rubricscube.Stages;

import android.app.Application;

import com.davidstemmer.screenplay.stage.Stage;
import com.teamcube.rubricscube.R;
import com.teamcube.rubricscube.Riggers.SlideRigger;
import com.teamcube.rubricscube.RubricsCubeApplication;

/**
 * Created by matthewsturgill on 11/21/16.
 */

public class GreenFaceInputStage extends IndexedStage {
    private final SlideRigger rigger;

    public GreenFaceInputStage(Application context) {
        super(GreenFaceInputStage.class.getName());
        this.rigger = new SlideRigger(context);
    }

    public GreenFaceInputStage() {
        this(RubricsCubeApplication.getInstance());

    }

    @Override
    public int getLayoutId() {
        return R.layout.green_face_input_view;
    }

    @Override
    public Stage.Rigger getRigger() {
        return rigger;
    }

}

