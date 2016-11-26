package com.teamcube.rubricscube.Views;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.teamcube.rubricscube.Adapters.SolutionAdapter;
import com.teamcube.rubricscube.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Matthew.Watson on 11/20/16.
 */

public class SolutionView extends RelativeLayout {
    private Context context;
    private SolutionAdapter solutionAdapter;

    @Bind(R.id.solution_recycler)
    RecyclerView recyclerView;


    public SolutionView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);
    }


}
