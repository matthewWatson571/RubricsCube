package com.teamcube.rubricscube;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.davidstemmer.flow.plugin.screenplay.ScreenplayDispatcher;

import butterknife.Bind;
import butterknife.ButterKnife;
import flow.Flow;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";
    private Flow flow;
    private ScreenplayDispatcher dispatcher;

    @Bind(R.id.container)
    RelativeLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        flow = RubricsCubeApplication.getMainFlow();
        dispatcher = new ScreenplayDispatcher(this, container);
        dispatcher.setUp(flow);
    }
}
