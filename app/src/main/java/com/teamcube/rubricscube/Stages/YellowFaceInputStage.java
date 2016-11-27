package com.teamcube.rubricscube.Stages;

import android.app.Application;

import com.davidstemmer.screenplay.stage.Stage;
import com.teamcube.rubricscube.R;
import com.teamcube.rubricscube.Riggers.SlideRigger;
import com.teamcube.rubricscube.RubricsCubeApplication;

/**
 * Created by matthewsturgill on 11/21/16.
 */

public class YellowFaceInputStage extends IndexedStage {
    private final SlideRigger rigger;

    public YellowFaceInputStage(Application context) {
        super(YellowFaceInputStage.class.getName());
        this.rigger = new SlideRigger(context);
    }

    public YellowFaceInputStage() {
        this(RubricsCubeApplication.getInstance());

    }

    @Override
    public int getLayoutId() {
        return R.layout.yellow_face_input_view;
    }

    @Override
    public Stage.Rigger getRigger() {
        return rigger;
    }

}

