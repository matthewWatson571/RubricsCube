package com.teamcube.rubricscube;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.davidstemmer.flow.plugin.screenplay.ScreenplayDispatcher;
import com.teamcube.rubricscube.Stages.LegendStage;
import com.teamcube.rubricscube.Stages.UserCubeInputStage;

import butterknife.Bind;
import butterknife.ButterKnife;
import flow.Flow;
import flow.History;

public class MainActivity extends AppCompatActivity {
    private Flow flow;
    private ScreenplayDispatcher dispatcher;
    private Menu menu;

    @Bind(R.id.container)
    RelativeLayout container;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        flow = RubricsCubeApplication.getMainFlow(); // Reference to main Flow application
        dispatcher = new ScreenplayDispatcher(this, container);
        dispatcher.setUp(flow);
    }

    @Override
    public void onBackPressed() {
        if (!flow.goBack()) {
            flow.removeDispatcher(dispatcher);
            flow.setHistory(History.single(new UserCubeInputStage()), Flow.Direction.BACKWARD);
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.user_menu, menu);
        this.menu = menu;
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.legend:
                History viewLegend = flow.getHistory().buildUpon()
                        .push(new LegendStage())
                        .build();
                flow.setHistory(viewLegend, Flow.Direction.FORWARD);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}