package com.teamcube.rubricscube.Views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import butterknife.ButterKnife;

/**
 * Created by aaroncampbell on 11/17/16.
 */

public class LegendView extends RelativeLayout {
    private Context context;

    public LegendView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);

    }
}
