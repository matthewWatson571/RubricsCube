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

import static com.teamcube.rubricscube.Views.UserCubeInputView.D1;
import static com.teamcube.rubricscube.Views.UserCubeInputView.D2;
import static com.teamcube.rubricscube.Views.UserCubeInputView.D3;
import static com.teamcube.rubricscube.Views.UserCubeInputView.D4;
import static com.teamcube.rubricscube.Views.UserCubeInputView.D6;
import static com.teamcube.rubricscube.Views.UserCubeInputView.D7;
import static com.teamcube.rubricscube.Views.UserCubeInputView.D8;
import static com.teamcube.rubricscube.Views.UserCubeInputView.D9;
import static com.teamcube.rubricscube.Views.UserCubeInputView.yellow45Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.yellow46Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.yellow47Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.yellow48Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.yellow50Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.yellow51Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.yellow52Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.yellow53Count;

/**
 * Created by matthewsturgill on 11/20/16.
 */

public class YellowFaceInputView extends LinearLayout {

    private Context context;

    //Yellow
    @Bind(R.id.yellow01)
    Button yellow01;

    @Bind(R.id.yellow02)
    Button yellow02;

    @Bind(R.id.yellow03)
    Button yellow03;

    @Bind(R.id.yellow04)
    Button yellow04;

    @Bind(R.id.yellow05)
    Button yellow05;

    @Bind(R.id.yellow06)
    Button yellow06;

    @Bind(R.id.yellow07)
    Button yellow07;

    @Bind(R.id.yellow08)
    Button yellow08;

    @Bind(R.id.yellow09)
    Button yellow09;

    //Buttons for transitions
    @Bind(R.id.yellowTransitionToRed)
    Button yellowTransitionToRed;

    @Bind(R.id.yellowTransitionToBlue)
    Button yellowTransitionToBlue;

    @Bind(R.id.yellowTransitionToGreen)
    Button yellowTransitionToGreen;

    @Bind(R.id.yellowTransitionToOrange)
    Button yellowTransitionToOrange;

    public YellowFaceInputView(Context context, AttributeSet attrs) {

        super(context, attrs);
        this.context = context;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);

        //On inflate populates colors from expanded input
        switch (yellow45Count) {
            //orange
            case 0:
                yellow01.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                yellow01.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                yellow01.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                yellow01.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                yellow01.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                yellow01.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                yellow01.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (yellow46Count) {
            //orange
            case 0:
                yellow02.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                yellow02.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                yellow02.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                yellow02.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                yellow02.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                yellow02.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                yellow02.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (yellow47Count) {
            //orange
            case 0:
                yellow03.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                yellow03.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                yellow03.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                yellow03.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                yellow03.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                yellow03.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                yellow03.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (yellow48Count) {
            //orange
            case 0:
                yellow04.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                yellow04.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                yellow04.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                yellow04.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                yellow04.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                yellow04.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                yellow04.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (yellow50Count) {
            //orange
            case 0:
                yellow06.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                yellow06.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                yellow06.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                yellow06.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                yellow06.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                yellow06.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                yellow06.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (yellow51Count) {
            //orange
            case 0:
                yellow07.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                yellow07.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                yellow07.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                yellow07.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                yellow07.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                yellow07.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                yellow07.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (yellow52Count) {
            //orange
            case 0:
                yellow08.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                yellow08.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                yellow08.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                yellow08.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                yellow08.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                yellow08.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                yellow08.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (yellow53Count) {
            //orange
            case 0:
                yellow09.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                yellow09.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                yellow09.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                yellow09.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                yellow09.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                yellow09.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                yellow09.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
    }

    @OnClick(R.id.yellow01)
    public void yellow01() {
        yellow45Count++;
        if (yellow45Count < 6) {
            switch (yellow45Count) {
                //orange
                case 0:
                    yellow01.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    D1 = "F";
                    break;
                //green
                case 1:
                    yellow01.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    D1 = "R";
                    break;
                //white
                case 2:
                    yellow01.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    D1 = "U";
                    break;
                //red
                case 3:
                    yellow01.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    D1 = "B";
                    break;
                //blue
                case 4:
                    yellow01.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    D1 = "L";
                    break;
                //yellow
                case 5:
                    yellow01.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    D1 = "D";
                    break;
            }
        } else {
            yellow45Count = -1;
            yellow01.setBackgroundColor(Color.argb(255, 191, 191, 191));
            D1 = "";
        }
    }

    @OnClick(R.id.yellow02)
    public void yellow02() {
        yellow46Count++;
        if (yellow46Count < 6) {
            switch (yellow46Count) {
                //orange
                case 0:
                    yellow02.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    D2 = "F";
                    break;
                //green
                case 1:
                    yellow02.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    D2 = "R";
                    break;
                //white
                case 2:
                    yellow02.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    D2 = "U";
                    break;
                //red
                case 3:
                    yellow02.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    D2 = "B";
                    break;
                //blue
                case 4:
                    yellow02.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    D2 = "L";
                    break;
                //yellow
                case 5:
                    yellow02.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    D2 = "D";
                    break;
            }
        } else {
            yellow46Count = -1;
            yellow02.setBackgroundColor(Color.argb(255, 191, 191, 191));
            D2 = "";
        }
    }

    @OnClick(R.id.yellow03)
    public void yellow03() {
        yellow47Count++;
        if (yellow47Count < 6) {
            switch (yellow47Count) {
                //orange
                case 0:
                    yellow03.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    D3 = "F";
                    break;
                //green
                case 1:
                    yellow03.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    D3 = "R";
                    break;
                //white
                case 2:
                    yellow03.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    D3 = "U";
                    break;
                //red
                case 3:
                    yellow03.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    D3 = "B";
                    break;
                //blue
                case 4:
                    yellow03.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    D3 = "L";
                    break;
                //yellow
                case 5:
                    yellow03.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    D3 = "D";
                    break;
            }
        } else {
            yellow47Count = -1;
            yellow03.setBackgroundColor(Color.argb(255, 191, 191, 191));
            D3 = "";
        }
    }

    @OnClick(R.id.yellow04)
    public void yellow04() {
        yellow48Count++;
        if (yellow48Count < 6) {
            switch (yellow48Count) {
                //orange
                case 0:
                    yellow04.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    D4 = "F";
                    break;
                //green
                case 1:
                    yellow04.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    D4 = "R";
                    break;
                //white
                case 2:
                    yellow04.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    D4 = "U";
                    break;
                //red
                case 3:
                    yellow04.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    D4 = "B";
                    break;
                //blue
                case 4:
                    yellow04.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    D4 = "L";
                    break;
                //yellow
                case 5:
                    yellow04.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    D4 = "D";
                    break;
            }
        } else {
            yellow48Count = -1;
            yellow04.setBackgroundColor(Color.argb(255, 191, 191, 191));
            D4 = "";
        }
    }

    @OnClick(R.id.yellow05)
    public void yellow05() {
        //Finalized in UserCubeinputView;

    }

    @OnClick(R.id.yellow06)
    public void yellow06() {
        yellow50Count++;
        if (yellow50Count < 6) {
            switch (yellow50Count) {
                //orange
                case 0:
                    yellow06.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    D6 = "F";
                    break;
                //green
                case 1:
                    yellow06.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    D6 = "R";
                    break;
                //white
                case 2:
                    yellow06.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    D6 = "U";
                    break;
                //red
                case 3:
                    yellow06.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    D6 = "B";
                    break;
                //blue
                case 4:
                    yellow06.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    D6 = "L";
                    break;
                //yellow
                case 5:
                    yellow06.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    D6 = "D";
                    break;
            }
        } else {
            yellow50Count = -1;
            yellow06.setBackgroundColor(Color.argb(255, 191, 191, 191));
            D6 = "";
        }
    }

    @OnClick(R.id.yellow07)
    public void yellow07() {
        yellow51Count++;
        if (yellow51Count < 6) {
            switch (yellow51Count) {
                //orange
                case 0:
                    yellow07.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    D7 = "F";
                    break;
                //green
                case 1:
                    yellow07.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    D7 = "R";
                    break;
                //white
                case 2:
                    yellow07.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    D7 = "U";
                    break;
                //red
                case 3:
                    yellow07.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    D7 = "B";
                    break;
                //blue
                case 4:
                    yellow07.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    D7 = "L";
                    break;
                //yellow
                case 5:
                    yellow07.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    D7 = "D";
                    break;
            }
        } else {
            yellow51Count = -1;
            yellow07.setBackgroundColor(Color.argb(255, 191, 191, 191));
            D7 = "";
        }
    }

    @OnClick(R.id.yellow08)
    public void yellow08() {
        yellow52Count++;
        if (yellow52Count < 6) {
            switch (yellow52Count) {
                //orange
                case 0:
                    yellow08.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    D8 = "F";
                    break;
                //green
                case 1:
                    yellow08.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    D8 = "R";
                    break;
                //white
                case 2:
                    yellow08.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    D8 = "U";
                    break;
                //red
                case 3:
                    yellow08.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    D8 = "B";
                    break;
                //blue
                case 4:
                    yellow08.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    D8 = "L";
                    break;
                //yellow
                case 5:
                    yellow08.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    D8 = "D";
                    break;
            }
        } else {
            yellow52Count = -1;
            yellow08.setBackgroundColor(Color.argb(255, 191, 191, 191));
            D8 = "";
        }
    }

    @OnClick(R.id.yellow09)
    public void yellow09() {
        yellow53Count++;
        if (yellow53Count < 6) {
            switch (yellow53Count) {
                //orange
                case 0:
                    yellow09.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    D9 = "F";
                    break;
                //green
                case 1:
                    yellow09.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    D9 = "R";
                    break;
                //white
                case 2:
                    yellow09.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    D9 = "U";
                    break;
                //red
                case 3:
                    yellow09.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    D9 = "B";
                    break;
                //blue
                case 4:
                    yellow09.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    D9 = "L";
                    break;
                //yellow
                case 5:
                    yellow09.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    D9 = "D";
                    break;
            }
        } else {
            yellow53Count = -1;
            yellow09.setBackgroundColor(Color.argb(255, 191, 191, 191));
            D9 = "";
        }
    }

    //Transition buttons
//    @OnClick(R.id.yellowTransitionToBlue)
//    public void yellowTransitionToBlue(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new BlueFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
//
//    @OnClick(R.id.yellowTransitionToGreen)
//    public void yellowTransitionToGreen(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new GreenFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
//
//    @OnClick(R.id.yellowTransitionToRed)
//    public void yellowTransitionToRed(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new RedFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
//
//    @OnClick(R.id.yellowTransitionToOrange)
//    public void yellowTransitionToOrange(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new OrangeFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
}
