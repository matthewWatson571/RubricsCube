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

import static com.teamcube.rubricscube.Views.UserCubeInputView.B1;
import static com.teamcube.rubricscube.Views.UserCubeInputView.B2;
import static com.teamcube.rubricscube.Views.UserCubeInputView.B3;
import static com.teamcube.rubricscube.Views.UserCubeInputView.B4;
import static com.teamcube.rubricscube.Views.UserCubeInputView.B6;
import static com.teamcube.rubricscube.Views.UserCubeInputView.B7;
import static com.teamcube.rubricscube.Views.UserCubeInputView.B8;
import static com.teamcube.rubricscube.Views.UserCubeInputView.B9;
import static com.teamcube.rubricscube.Views.UserCubeInputView.red27Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.red28Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.red29Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.red30Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.red32Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.red33Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.red34Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.red35Count;

/**
 * Created by matthewsturgill on 11/20/16.
 */

public class RedFaceInputView extends LinearLayout {

    private Context context;

    //Red
    @Bind(R.id.red01)
    Button red01;

    @Bind(R.id.red02)
    Button red02;

    @Bind(R.id.red03)
    Button red03;

    @Bind(R.id.red04)
    Button red04;

    @Bind(R.id.red05)
    Button red05;

    @Bind(R.id.red06)
    Button red06;

    @Bind(R.id.red07)
    Button red07;

    @Bind(R.id.red08)
    Button red08;

    @Bind(R.id.red09)
    Button red09;

    //Buttons for transitions
    @Bind(R.id.redTransitionToBlue)
    Button redTransitionToBlue;

    @Bind(R.id.redTransitionToGreen)
    Button redTransitionToGreen;

    @Bind(R.id.redTransitionToYellow)
    Button redTransitionToYellow;

    @Bind(R.id.redTransitionToWhite)
    Button redTransitionToWhite;

    public RedFaceInputView(Context context, AttributeSet attrs) {

        super(context, attrs);
        this.context = context;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);

        //On inflate populates colors from expanded input
        switch (red27Count) {
            //orange
            case 0:
                red01.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                red01.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                red01.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                red01.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                red01.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                red01.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                red01.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (red28Count) {
            //orange
            case 0:
                red02.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                red02.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                red02.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                red02.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                red02.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                red02.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                red02.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (red29Count) {
            //orange
            case 0:
                red03.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                red03.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                red03.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                red03.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                red03.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                red03.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                red03.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (red30Count) {
            //orange
            case 0:
                red04.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                red04.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                red04.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                red04.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                red04.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                red04.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                red04.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (red32Count) {
            //orange
            case 0:
                red06.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                red06.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                red06.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                red06.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                red06.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                red06.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                red06.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (red33Count) {
            //orange
            case 0:
                red07.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                red07.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                red07.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                red07.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                red07.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                red07.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                red07.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (red34Count) {
            //orange
            case 0:
                red08.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                red08.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                red08.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                red08.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                red08.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                red08.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                red08.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (red35Count) {
            //orange
            case 0:
                red09.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                red09.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                red09.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                red09.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                red09.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                red09.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                red09.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
    }

    @OnClick(R.id.red01)
    public void red01() {
        red27Count++;
        if (red27Count < 6) {
            switch (red27Count) {
                //orange
                case 0:
                    red01.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    B1 = "F";
                    break;
                //green
                case 1:
                    red01.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    B1 = "R";
                    break;
                //white
                case 2:
                    red01.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    B1 = "U";
                    break;
                //red
                case 3:
                    red01.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    B1 = "B";
                    break;
                //blue
                case 4:
                    red01.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    B1 = "L";
                    break;
                //yellow
                case 5:
                    red01.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    B1 = "D";
                    break;
            }
        } else {
            red27Count = -1;
            red01.setBackgroundColor(Color.argb(255, 191, 191, 191));
            B1 = "";
        }
    }

    @OnClick(R.id.red02)
    public void red02() {
        red28Count++;
        if (red28Count < 6) {
            switch (red28Count) {
                //orange
                case 0:
                    red02.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    B2 = "F";
                    break;
                //green
                case 1:
                    red02.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    B2 = "R";
                    break;
                //white
                case 2:
                    red02.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    B2 = "U";
                    break;
                //red
                case 3:
                    red02.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    B2 = "B";
                    break;
                //blue
                case 4:
                    red02.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    B2 = "L";
                    break;
                //yellow
                case 5:
                    red02.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    B2 = "D";
                    break;
            }
        } else {
            red28Count = -1;
            red02.setBackgroundColor(Color.argb(255, 191, 191, 191));
            B2 = "";
        }
    }

    @OnClick(R.id.red03)
    public void red03() {
        red29Count++;
        if (red29Count < 6) {
            switch (red29Count) {
                //orange
                case 0:
                    red03.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    B3 = "F";
                    break;
                //green
                case 1:
                    red03.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    B3 = "R";
                    break;
                //white
                case 2:
                    red03.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    B3 = "U";
                    break;
                //red
                case 3:
                    red03.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    B3 = "B";
                    break;
                //blue
                case 4:
                    red03.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    B3 = "L";
                    break;
                //yellow
                case 5:
                    red03.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    B3 = "D";
                    break;
            }
        } else {
            red29Count = -1;
            red03.setBackgroundColor(Color.argb(255, 191, 191, 191));
            B3 = "";
        }
    }

    @OnClick(R.id.red04)
    public void red04() {
        red30Count++;
        if (red30Count < 6) {
            switch (red30Count) {
                //orange
                case 0:
                    red04.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    B4 = "F";
                    break;
                //green
                case 1:
                    red04.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    B4 = "R";
                    break;
                //white
                case 2:
                    red04.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    B4 = "U";
                    break;
                //red
                case 3:
                    red04.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    B4 = "B";
                    break;
                //blue
                case 4:
                    red04.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    B4 = "L";
                    break;
                //yellow
                case 5:
                    red04.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    B4 = "D";
                    break;
            }
        } else {
            red30Count = -1;
            red04.setBackgroundColor(Color.argb(255, 191, 191, 191));
            B4 = "";
        }
    }

    @OnClick(R.id.red05)
    public void red05() {

    }

    @OnClick(R.id.red06)
    public void red06() {
        red32Count++;
        if (red32Count < 6) {
            switch (red32Count) {
                //orange
                case 0:
                    red06.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    B6 = "F";
                    break;
                //green
                case 1:
                    red06.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    B6 = "R";
                    break;
                //white
                case 2:
                    red06.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    B6 = "U";
                    break;
                //red
                case 3:
                    red06.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    B6 = "B";
                    break;
                //blue
                case 4:
                    red06.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    B6 = "L";
                    break;
                //yellow
                case 5:
                    red06.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    B6 = "D";
                    break;
            }
        } else {
            red32Count = -1;
            red06.setBackgroundColor(Color.argb(255, 191, 191, 191));
            B6 = "";
        }
    }

    @OnClick(R.id.red07)
    public void red07() {
        red33Count++;
        if (red33Count < 6) {
            switch (red33Count) {
                //orange
                case 0:
                    red07.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    B7 = "F";
                    break;
                //green
                case 1:
                    red07.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    B7 = "R";
                    break;
                //white
                case 2:
                    red07.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    B7 = "U";
                    break;
                //red
                case 3:
                    red07.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    B7 = "B";
                    break;
                //blue
                case 4:
                    red07.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    B7 = "L";
                    break;
                //yellow
                case 5:
                    red07.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    B7 = "D";
                    break;
            }
        } else {
            red33Count = -1;
            red07.setBackgroundColor(Color.argb(255, 191, 191, 191));
            B7 = "";
        }
    }

    @OnClick(R.id.red08)
    public void red08() {
        red34Count++;
        if (red34Count < 6) {
            switch (red34Count) {
                //orange
                case 0:
                    red08.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    B8 = "F";
                    break;
                //green
                case 1:
                    red08.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    B8 = "R";
                    break;
                //white
                case 2:
                    red08.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    B8 = "U";
                    break;
                //red
                case 3:
                    red08.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    B8 = "B";
                    break;
                //blue
                case 4:
                    red08.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    B8 = "L";
                    break;
                //yellow
                case 5:
                    red08.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    B8 = "D";
                    break;
            }
        } else {
            red34Count = -1;
            red08.setBackgroundColor(Color.argb(255, 191, 191, 191));
            B8 = "";
        }
    }

    @OnClick(R.id.red09)
    public void red09() {
        red35Count++;
        if (red35Count < 6) {
            switch (red35Count) {
                //orange
                case 0:
                    red09.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    B9 = "F";
                    break;
                //green
                case 1:
                    red09.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    B9 = "R";
                    break;
                //white
                case 2:
                    red09.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    B9 = "U";
                    break;
                //red
                case 3:
                    red09.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    B9 = "B";
                    break;
                //blue
                case 4:
                    red09.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    B9 = "L";
                    break;
                //yellow
                case 5:
                    red09.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    B9 = "D";
                    break;
            }
        } else {
            red35Count = -1;
            red09.setBackgroundColor(Color.argb(255, 191, 191, 191));
            B9 = "";
        }
    }

    //Transition buttons
//    @OnClick(R.id.redTransitionToBlue)
//    public void redTransitionToBlue(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new BlueFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
//
//    @OnClick(R.id.redTransitionToGreen)
//    public void redTransitionToGreen(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new GreenFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
//
//    @OnClick(R.id.redTransitionToYellow)
//    public void redTransitionToYellow(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new YellowFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
//
//    @OnClick(R.id.redTransitionToWhite)
//    public void redTransitionToWhite(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new WhiteFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
}
