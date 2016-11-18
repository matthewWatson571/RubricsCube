package com.teamcube.rubricscube.Views;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.teamcube.rubricscube.Adapters.LegendDisplayAdapter;
import com.teamcube.rubricscube.Models.LegendImageModel;
import com.teamcube.rubricscube.R;
import com.teamcube.rubricscube.Utils;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by aaroncampbell on 11/17/16.
 */

public class CubeLegendView extends RelativeLayout {
    private Context context;
    private LegendDisplayAdapter legendDisplayAdapter;

    @Bind(R.id.recycler_view)
    RecyclerView recyclerView;

    public CubeLegendView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);

        legendDisplayAdapter = new LegendDisplayAdapter(new ArrayList<LegendImageModel>(), context);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(legendDisplayAdapter);

        Utils.getData();
    }
}
