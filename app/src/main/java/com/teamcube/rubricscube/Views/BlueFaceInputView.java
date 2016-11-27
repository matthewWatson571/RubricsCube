package com.teamcube.rubricscube.Views;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;

import com.teamcube.rubricscube.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.teamcube.rubricscube.Views.UserCubeInputView.blue36Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.blue37Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.blue38Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.blue39Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.blue41Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.blue42Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.blue43Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.blue44Count;

/**
 * Created by matthewsturgill on 11/20/16.
 */

public class BlueFaceInputView extends LinearLayout {

    public Context context;

    //Blue
    @Bind(R.id.blue01)
    Button blue01;

    @Bind(R.id.blue02)
    Button blue02;

    @Bind(R.id.blue03)
    Button blue03;

    @Bind(R.id.blue04)
    Button blue04;

    @Bind(R.id.blue05)
    Button blue05;

    @Bind(R.id.blue06)
    Button blue06;

    @Bind(R.id.blue07)
    Button blue07;

    @Bind(R.id.blue08)
    Button blue08;

    @Bind(R.id.blue09)
    Button blue09;

    //Buttons for transitions
    @Bind(R.id.blueTransitionToOrange)
    Button blueTransitionToOrange;

    @Bind(R.id.blueTransitionToYellow)
    Button blueTransitionToYellow;

    @Bind(R.id.blueTransitionToWhite)
    Button blueTransitionToWhite;

    @Bind(R.id.blueTransitionToRed)
    Button blueTransitionToRed;

    public BlueFaceInputView(Context context, AttributeSet attrs) {

        super(context, attrs);
        this.context = context;
    }

    @Override
    protected void onFinishInflate() {

        super.onFinishInflate();
        ButterKnife.bind(this);

        //On inflate populates colors from expanded input
        switch (blue36Count) {
            //orange
            case 0:
                blue01.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                blue01.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                blue01.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                blue01.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                blue01.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                blue01.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                blue01.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }

        switch (blue37Count) {
            //orange
            case 0:
                blue02.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                blue02.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                blue02.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                blue02.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                blue02.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                blue02.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                blue02.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (blue38Count) {
            //orange
            case 0:
                blue03.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                blue03.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                blue03.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                blue03.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                blue03.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                blue03.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                blue03.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (blue39Count) {
            //orange
            case 0:
                blue04.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                blue04.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                blue04.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                blue04.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                blue04.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                blue04.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                blue04.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (blue41Count) {
            //orange
            case 0:
                blue06.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                blue06.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                blue06.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                blue06.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                blue06.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                blue06.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                blue06.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (blue42Count) {
            //orange
            case 0:
                blue07.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                blue07.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                blue07.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                blue07.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                blue07.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                blue07.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                blue07.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (blue43Count) {
            //orange
            case 0:
                blue08.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                blue08.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                blue08.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                blue08.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                blue08.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                blue08.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                blue08.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (blue44Count) {
            //orange
            case 0:
                blue09.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                blue09.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                blue09.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                blue09.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                blue09.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                blue09.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                blue09.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
    }

    @OnClick(R.id.blue01)
    public void blue01() {
        blue36Count++;
        if (blue36Count < 6) {
            switch (blue36Count) {
                //orange
                case 0:
                    blue01.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    UserCubeInputView.L1 = "F";
                    break;
                //green
                case 1:
                    blue01.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    UserCubeInputView.L1 = "R";
                    break;
                //white
                case 2:
                    blue01.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    UserCubeInputView.L1 = "U";
                    break;
                //red
                case 3:
                    blue01.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    UserCubeInputView.L1 = "B";
                    break;
                //blue
                case 4:
                    blue01.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    UserCubeInputView.L1 = "L";
                    break;
                //yellow
                case 5:
                    blue01.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    UserCubeInputView.L1 = "D";
                    break;
            }
        } else {
            blue36Count = -1;
            blue02.setBackgroundColor(Color.argb(255, 191, 191, 191));
            UserCubeInputView.L1 = "";
        }
    }

    @OnClick(R.id.blue02)
    public void blue02() {
        blue37Count++;
        if (blue37Count < 6) {
            switch (blue37Count) {
                //orange
                case 0:
                    blue02.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    UserCubeInputView.L2 = "F";
                    break;
                //green
                case 1:
                    blue02.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    UserCubeInputView.L2 = "R";
                    break;
                //white
                case 2:
                    blue02.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    UserCubeInputView.L2 = "U";
                    break;
                //red
                case 3:
                    blue02.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    UserCubeInputView.L2 = "B";
                    break;
                //blue
                case 4:
                    blue02.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    UserCubeInputView.L2 = "L";
                    break;
                //yellow
                case 5:
                    blue02.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    UserCubeInputView.L2 = "D";
                    break;
            }
        } else {
            blue37Count = -1;
            blue02.setBackgroundColor(Color.argb(255, 191, 191, 191));
            UserCubeInputView.L2 = "";
        }
    }

    @OnClick(R.id.blue03)
    public void blue03() {
        blue38Count++;
        if (blue38Count < 6) {
            switch (blue38Count) {
                //orange
                case 0:
                    blue03.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    UserCubeInputView.L3 = "F";
                    break;
                //green
                case 1:
                    blue03.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    UserCubeInputView.L3 = "R";
                    break;
                //white
                case 2:
                    blue03.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    UserCubeInputView.L3 = "U";
                    break;
                //red
                case 3:
                    blue03.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    UserCubeInputView.L3 = "B";
                    break;
                //blue
                case 4:
                    blue03.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    UserCubeInputView.L3 = "L";
                    break;
                //yellow
                case 5:
                    blue03.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    UserCubeInputView.L3 = "D";
                    break;
            }
        } else {
            blue38Count = -1;
            blue03.setBackgroundColor(Color.argb(255, 191, 191, 191));
            UserCubeInputView.L3 = "";
        }
    }

    @OnClick(R.id.blue04)
    public void blue04() {
        blue39Count++;
        if (blue39Count < 6) {
            switch (blue39Count) {
                //orange
                case 0:
                    blue04.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    UserCubeInputView.L4 = "F";
                    break;
                //green
                case 1:
                    blue04.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    UserCubeInputView.L4 = "R";
                    break;
                //white
                case 2:
                    blue04.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    UserCubeInputView.L4 = "U";
                    break;
                //red
                case 3:
                    blue04.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    UserCubeInputView.L4 = "B";
                    break;
                //blue
                case 4:
                    blue04.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    UserCubeInputView.L4 = "L";
                    break;
                //yellow
                case 5:
                    blue04.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    UserCubeInputView.L4 = "D";
                    break;
            }
        } else {
            blue39Count = -1;
            blue04.setBackgroundColor(Color.argb(255, 191, 191, 191));
            UserCubeInputView.L4 = "";
        }
    }

    @OnClick(R.id.blue05)
    public void blue05() {
        //blue40count center Buttons
    }

    @OnClick(R.id.blue06)
    public void blue06() {
        blue41Count++;
        if (blue41Count < 6) {
            switch (blue41Count) {
                //orange
                case 0:
                    blue06.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    UserCubeInputView.L6 = "F";
                    break;
                //green
                case 1:
                    blue06.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    UserCubeInputView.L6 = "R";
                    break;
                //white
                case 2:
                    blue06.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    UserCubeInputView.L6 = "U";
                    break;
                //red
                case 3:
                    blue06.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    UserCubeInputView.L6 = "B";
                    break;
                //blue
                case 4:
                    blue06.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    UserCubeInputView.L6 = "L";
                    break;
                //yellow
                case 5:
                    blue06.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    UserCubeInputView.L6 = "D";
                    break;
            }
        } else {
            blue41Count = -1;
            blue06.setBackgroundColor(Color.argb(255, 191, 191, 191));
            UserCubeInputView.L6 = "";
        }
    }

    @OnClick(R.id.blue07)
    public void blue07() {
        blue42Count++;
        if (blue42Count < 6) {
            switch (blue42Count) {
                //orange
                case 0:
                    blue07.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    UserCubeInputView.L7 = "F";
                    break;
                //green
                case 1:
                    blue07.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    UserCubeInputView.L7 = "R";
                    break;
                //white
                case 2:
                    blue07.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    UserCubeInputView.L7 = "U";
                    break;
                //red
                case 3:
                    blue07.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    UserCubeInputView.L7 = "B";
                    break;
                //blue
                case 4:
                    blue07.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    UserCubeInputView.L7 = "L";
                    break;
                //yellow
                case 5:
                    blue07.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    UserCubeInputView.L7 = "D";
                    break;
            }
        } else {
            blue42Count = -1;
            blue07.setBackgroundColor(Color.argb(255, 191, 191, 191));
            UserCubeInputView.L7 = "";
        }
    }

    @OnClick(R.id.blue08)
    public void blue08() {
        blue43Count++;
        if (blue43Count < 6) {
            switch (blue43Count) {
                //orange
                case 0:
                    blue08.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    UserCubeInputView.L8 = "F";
                    break;
                //green
                case 1:
                    blue08.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    UserCubeInputView.L8 = "R";
                    break;
                //white
                case 2:
                    blue08.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    UserCubeInputView.L8 = "U";
                    break;
                //red
                case 3:
                    blue08.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    UserCubeInputView.L8 = "B";
                    break;
                //blue
                case 4:
                    blue08.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    UserCubeInputView.L8 = "L";
                    break;
                //yellow
                case 5:
                    blue08.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    UserCubeInputView.L8 = "D";
                    break;
            }
        } else {
            blue43Count = -1;
            blue08.setBackgroundColor(Color.argb(255, 191, 191, 191));
            UserCubeInputView.L8 = "";
        }
    }

    @OnClick(R.id.blue09)
    public void blue09() {
        blue44Count++;
        if (blue44Count < 6) {
            switch (blue44Count) {
                //orange
                case 0:
                    blue09.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    UserCubeInputView.L9 = "F";
                    break;
                //green
                case 1:
                    blue09.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    UserCubeInputView.L9 = "R";
                    break;
                //white
                case 2:
                    blue09.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    UserCubeInputView.L9 = "U";
                    break;
                //red
                case 3:
                    blue09.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    UserCubeInputView.L9 = "B";
                    break;
                //blue
                case 4:
                    blue09.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    UserCubeInputView.L9 = "L";
                    break;
                //yellow
                case 5:
                    blue09.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    UserCubeInputView.L9 = "D";
                    break;
            }
        } else {
            blue44Count = -1;
            blue09.setBackgroundColor(Color.argb(255, 191, 191, 191));
            UserCubeInputView.L9 = "";
        }
    }
    //Transition buttons
//    @OnClick(R.id.blueTransitionToRed)
//    public void blueTransitionToRed(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new RedFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
//
//    @OnClick(R.id.blueTransitionToOrange)
//    public void blueTransitionToOrange(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new OrangeFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
//
//    @OnClick(R.id.blueTransitionToYellow)
//    public void blueTransitionToYellow(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new YellowFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
//
//    @OnClick(R.id.blueTransitionToWhite)
//    public void blueTransitionToWhite(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new WhiteFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
}
