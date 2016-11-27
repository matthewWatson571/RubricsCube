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

import static com.teamcube.rubricscube.Views.UserCubeInputView.orange0Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.orange1Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.orange2Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.orange3Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.orange5Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.orange6Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.orange7Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.orange8Count;

/**
 * Created by matthewsturgill on 11/20/16.
 */

public class OrangeFaceInputView extends LinearLayout {

    public Context context;

    //Buttons for input
    @Bind(R.id.orange01)
    Button orange01;

    @Bind(R.id.orange02)
    Button orange02;

    @Bind(R.id.orange03)
    Button orange03;

    @Bind(R.id.orange04)
    Button orange04;

    @Bind(R.id.orange05)
    Button orange05;

    @Bind(R.id.orange06)
    Button orange06;

    @Bind(R.id.orange07)
    Button orange07;

    @Bind(R.id.orange08)
    Button orange08;

    @Bind(R.id.orange09)
    Button orange09;

    //Buttons for transitions
    @Bind(R.id.orangeTransitionToBlue)
    Button orangeTransitionToBlue;

    @Bind(R.id.orangeTransitionToGreen)
    Button orangeTransitionToGreen;

    @Bind(R.id.orangeTransitionToYellow)
    Button orangeTransitionToYellow;

    @Bind(R.id.orangeTransitionToWhite)
    Button orangeTransitionToWhite;

    public OrangeFaceInputView(Context context, AttributeSet attrs) {

        super(context, attrs);
        this.context = context;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);

        //On inflate populates colors from expanded input
        switch (orange0Count) {
            //orange
            case 0:
                orange01.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                orange01.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                orange01.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                orange01.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                orange01.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                orange01.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                orange01.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (orange1Count) {
            //orange
            case 0:
                orange02.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                orange02.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                orange02.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                orange02.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                orange02.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                orange02.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                orange02.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (orange2Count) {
            //orange
            case 0:
                orange03.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                orange03.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                orange03.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                orange03.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                orange03.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                orange03.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                orange03.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (orange3Count) {
            //orange
            case 0:
                orange04.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                orange04.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                orange04.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                orange04.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                orange04.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                orange04.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                orange04.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (orange5Count) {
            //orange
            case 0:
                orange06.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                orange06.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                orange06.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                orange06.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                orange06.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                orange06.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                orange06.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (orange6Count) {
            //orange
            case 0:
                orange07.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                orange07.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                orange07.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                orange07.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                orange07.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                orange07.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                orange07.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (orange7Count) {
            //orange
            case 0:
                orange08.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                orange08.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                orange08.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                orange08.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                orange08.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                orange08.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                orange08.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (orange8Count) {
            //orange
            case 0:
                orange09.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                orange09.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                orange09.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                orange09.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                orange09.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                orange09.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                orange09.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
    }

    @OnClick(R.id.orange01)
    public void orange01() {
        orange0Count++;
        if (orange0Count < 6) {
            switch (orange0Count) {
                //orange
                case 0:
                    orange01.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    UserCubeInputView.F1 = "F";
                    break;
                //green
                case 1:
                    orange01.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    UserCubeInputView.F1 = "R";
                    break;
                //white
                case 2:
                    orange01.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    UserCubeInputView.F1 = "U";
                    break;
                //red
                case 3:
                    orange01.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    UserCubeInputView.F1 = "B";
                    break;
                //blue
                case 4:
                    orange01.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    UserCubeInputView.F1 = "L";
                    break;
                //yellow
                case 5:
                    orange01.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    UserCubeInputView.F1 = "D";
                    break;
            }
        } else {
            orange0Count = -1;
            orange01.setBackgroundColor(Color.argb(255, 191, 191, 191));
            UserCubeInputView.F1 = "";
        }
    }

    @OnClick(R.id.orange02)
    public void orange02() {
        orange1Count++;
        if (orange1Count < 6) {
            switch (orange1Count) {
                //orange
                case 0:
                    orange02.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    UserCubeInputView.F2 = "F";
                    break;
                //green
                case 1:
                    orange02.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    UserCubeInputView.F2 = "R";
                    break;
                //white
                case 2:
                    orange02.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    UserCubeInputView.F2 = "U";
                    break;
                //red
                case 3:
                    orange02.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    UserCubeInputView.F2 = "B";
                    break;
                //blue
                case 4:
                    orange02.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    UserCubeInputView.F2 = "L";
                    break;
                //yellow
                case 5:
                    orange02.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    UserCubeInputView.F2 = "D";
                    break;
            }
        } else {
            orange1Count = -1;
            orange02.setBackgroundColor(Color.argb(255, 191, 191, 191));
            UserCubeInputView.F2 = "";
        }
    }

    @OnClick(R.id.orange03)
    public void orange03() {
        orange2Count++;
        if (orange2Count < 6) {
            switch (orange2Count) {
                //orange
                case 0:
                    orange03.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    UserCubeInputView.F3 = "F";
                    break;
                //green
                case 1:
                    orange03.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    UserCubeInputView.F3 = "R";
                    break;
                //white
                case 2:
                    orange03.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    UserCubeInputView.F3 = "U";
                    break;
                //red
                case 3:
                    orange03.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    UserCubeInputView.F3 = "B";
                    break;
                //blue
                case 4:
                    orange03.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    UserCubeInputView.F3 = "L";
                    break;
                //yellow
                case 5:
                    orange03.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    UserCubeInputView.F3 = "D";
                    break;
            }
        } else {
            orange2Count = -1;
            orange03.setBackgroundColor(Color.argb(255, 191, 191, 191));
            UserCubeInputView.F3 = "";
        }
    }

    @OnClick(R.id.orange04)
    public void orange04() {
        orange3Count++;
        if (orange3Count < 6) {
            switch (orange3Count) {
                //orange
                case 0:
                    orange04.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    UserCubeInputView.F4 = "F";
                    break;
                //green
                case 1:
                    orange04.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    UserCubeInputView.F4 = "R";
                    break;
                //white
                case 2:
                    orange04.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    UserCubeInputView.F4 = "U";
                    break;
                //red
                case 3:
                    orange04.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    UserCubeInputView.F4 = "B";
                    break;
                //blue
                case 4:
                    orange04.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    UserCubeInputView.F4 = "L";
                    break;
                //yellow
                case 5:
                    orange04.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    UserCubeInputView.F4 = "D";
                    break;
            }
        } else {
            orange3Count = -1;
            orange04.setBackgroundColor(Color.argb(255, 191, 191, 191));
            UserCubeInputView.F4 = "";
        }
    }

    @OnClick(R.id.orange05)
    public void orange05() {
        //Orange 4 count and F5 already finalized

    }

    @OnClick(R.id.orange06)
    public void orange06() {
        orange5Count++;
        if (orange5Count < 6) {
            switch (orange5Count) {
                //orange
                case 0:
                    orange06.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    UserCubeInputView.F6 = "F";
                    break;
                //green
                case 1:
                    orange06.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    UserCubeInputView.F6 = "R";
                    break;
                //white
                case 2:
                    orange06.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    UserCubeInputView.F6 = "U";
                    break;
                //red
                case 3:
                    orange06.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    UserCubeInputView.F6 = "B";
                    break;
                //blue
                case 4:
                    orange06.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    UserCubeInputView.F6 = "L";
                    break;
                //yellow
                case 5:
                    orange06.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    UserCubeInputView.F6 = "D";
                    break;
            }
        } else {
            orange5Count = -1;
            orange06.setBackgroundColor(Color.argb(255, 191, 191, 191));
            UserCubeInputView.F6 = "";
        }
    }

    @OnClick(R.id.orange07)
    public void orange07() {
        orange6Count++;
        if (orange6Count < 6) {
            switch (orange6Count) {
                //orange
                case 0:
                    orange07.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    UserCubeInputView.F7 = "F";
                    break;
                //green
                case 1:
                    orange07.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    UserCubeInputView.F7 = "R";
                    break;
                //white
                case 2:
                    orange07.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    UserCubeInputView.F7 = "U";
                    break;
                //red
                case 3:
                    orange07.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    UserCubeInputView.F7 = "B";
                    break;
                //blue
                case 4:
                    orange07.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    UserCubeInputView.F7 = "L";
                    break;
                //yellow
                case 5:
                    orange07.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    UserCubeInputView.F7 = "D";
                    break;
            }
        } else {
            orange6Count = -1;
            orange07.setBackgroundColor(Color.argb(255, 191, 191, 191));
            UserCubeInputView.F7 = "";
        }
    }

    @OnClick(R.id.orange08)
    public void orange08() {
        orange7Count++;
        if (orange7Count < 6) {
            switch (orange7Count) {
                //orange
                case 0:
                    orange08.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    UserCubeInputView.F8 = "F";
                    break;
                //green
                case 1:
                    orange08.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    UserCubeInputView.F8 = "R";
                    break;
                //white
                case 2:
                    orange08.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    UserCubeInputView.F8 = "U";
                    break;
                //red
                case 3:
                    orange08.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    UserCubeInputView.F8 = "B";
                    break;
                //blue
                case 4:
                    orange08.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    UserCubeInputView.F8 = "L";
                    break;
                //yellow
                case 5:
                    orange08.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    UserCubeInputView.F8 = "D";
                    break;
            }
        } else {
            orange7Count = -1;
            orange08.setBackgroundColor(Color.argb(255, 191, 191, 191));
            UserCubeInputView.F8 = "";
        }
    }

    @OnClick(R.id.orange09)
    public void orange09() {
        orange8Count++;
        if (orange8Count < 6) {
            switch (orange8Count) {
                //orange
                case 0:
                    orange09.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    UserCubeInputView.F9 = "F";
                    break;
                //green
                case 1:
                    orange09.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    UserCubeInputView.F9 = "R";
                    break;
                //white
                case 2:
                    orange09.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    UserCubeInputView.F9 = "U";
                    break;
                //red
                case 3:
                    orange09.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    UserCubeInputView.F9 = "B";
                    break;
                //blue
                case 4:
                    orange09.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    UserCubeInputView.F9 = "L";
                    break;
                //yellow
                case 5:
                    orange09.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    UserCubeInputView.F9 = "D";
                    break;
            }
        } else {
            orange8Count = -1;
            orange09.setBackgroundColor(Color.argb(255, 191, 191, 191));
            UserCubeInputView.F9 = "";
        }
    }

//    Transition buttons
//    @OnClick(R.id.orangeTransitionToBlue)
//    public void orangeTransitionToBlue(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new BlueFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
//
//    @OnClick(R.id.orangeTransitionToGreen)
//    public void orangeTransitionToGreen(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new GreenFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
//
//    @OnClick(R.id.orangeTransitionToYellow)
//    public void orangeTransitionToYellow(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new YellowFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
//
//    @OnClick(R.id.orangeTransitionToWhite)
//    public void orangeTransitionToWhite(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new WhiteFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
}
