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

import static com.teamcube.rubricscube.Views.UserCubeInputView.U1;
import static com.teamcube.rubricscube.Views.UserCubeInputView.U2;
import static com.teamcube.rubricscube.Views.UserCubeInputView.U3;
import static com.teamcube.rubricscube.Views.UserCubeInputView.U4;
import static com.teamcube.rubricscube.Views.UserCubeInputView.U6;
import static com.teamcube.rubricscube.Views.UserCubeInputView.U7;
import static com.teamcube.rubricscube.Views.UserCubeInputView.U8;
import static com.teamcube.rubricscube.Views.UserCubeInputView.U9;
import static com.teamcube.rubricscube.Views.UserCubeInputView.white18Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.white19Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.white20Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.white21Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.white23Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.white24Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.white25Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.white26Count;

/**
 * Created by matthewsturgill on 11/20/16.
 */

public class WhiteFaceInputView extends LinearLayout {
    private Context context;

    //White
    @Bind(R.id.white01)
    Button white01;

    @Bind(R.id.white02)
    Button white02;

    @Bind(R.id.white03)
    Button white03;

    @Bind(R.id.white04)
    Button white04;

    @Bind(R.id.white05)
    Button white05;

    @Bind(R.id.white06)
    Button white06;

    @Bind(R.id.white07)
    Button white07;

    @Bind(R.id.white08)
    Button white08;

    @Bind(R.id.white09)
    Button white09;

    //Buttons for transitions
    @Bind(R.id.whiteTransitionToBlue)
    Button whiteTransitionToBlue;

    @Bind(R.id.whiteTransitionToGreen)
    Button whiteTransitionToGreen;

    @Bind(R.id.whiteTransitionToRed)
    Button whiteTransitionToRed;

    @Bind(R.id.whiteTransitionToOrange)
    Button whiteTransitionToOrange;

    public WhiteFaceInputView(Context context, AttributeSet attrs) {

        super(context, attrs);
        this.context = context;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);

        //On inflate populates colors from expanded input
        switch (white18Count) {
            //orange
            case 0:
                white01.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                white01.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                white01.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                white01.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                white01.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                white01.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                white01.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (white19Count) {
            //orange
            case 0:
                white02.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                white02.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                white02.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                white02.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                white02.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                white02.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                white02.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (white20Count) {
            //orange
            case 0:
                white03.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                white03.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                white03.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                white03.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                white03.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                white03.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                white03.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (white21Count) {
            //orange
            case 0:
                white04.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                white04.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                white04.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                white04.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                white04.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                white04.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                white04.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (white23Count) {
            //orange
            case 0:
                white06.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                white06.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                white06.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                white06.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                white06.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                white06.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                white06.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (white24Count) {
            //orange
            case 0:
                white07.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                white07.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                white07.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                white07.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                white07.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                white07.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                white07.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (white25Count) {
            //orange
            case 0:
                white08.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                white08.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                white08.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                white08.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                white08.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                white08.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                white08.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (white26Count) {
            //orange
            case 0:
                white09.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                white09.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                white09.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                white09.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                white09.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                white09.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                white09.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
    }

    @OnClick(R.id.white01)
    public void white01() {
        white18Count++;
        if (white18Count < 6) {
            switch (white18Count) {
                //orange
                case 0:
                    white01.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    U1 = "F";
                    break;
                //green
                case 1:
                    white01.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    U1 = "R";
                    break;
                //white
                case 2:
                    white01.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    U1 = "U";
                    break;
                //red
                case 3:
                    white01.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    U1 = "B";
                    break;
                //blue
                case 4:
                    white01.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    U1 = "L";
                    break;
                //yellow
                case 5:
                    white01.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    U1 = "D";
                    break;
            }
        } else {
            white18Count = -1;
            white01.setBackgroundColor(Color.argb(255, 191, 191, 191));
            U1 = "";
        }
    }

    @OnClick(R.id.white02)
    public void white02() {
        white19Count++;
        if (white19Count < 6) {
            switch (white19Count) {
                //orange
                case 0:
                    white02.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    U2 = "F";
                    break;
                //green
                case 1:
                    white02.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    U2 = "R";
                    break;
                //white
                case 2:
                    white02.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    U2 = "U";
                    break;
                //red
                case 3:
                    white02.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    U2 = "B";
                    break;
                //blue
                case 4:
                    white02.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    U2 = "L";
                    break;
                //yellow
                case 5:
                    white02.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    U2 = "D";
                    break;
            }
        } else {
            white19Count = -1;
            white02.setBackgroundColor(Color.argb(255, 191, 191, 191));
            U2 = "";
        }
    }

    @OnClick(R.id.white03)
    public void white03() {
        white20Count++;
        if (white20Count < 6) {
            switch (white20Count) {
                //orange
                case 0:
                    white03.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    U3 = "F";
                    break;
                //green
                case 1:
                    white03.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    U3 = "R";
                    break;
                //white
                case 2:
                    white03.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    U3 = "U";
                    break;
                //red
                case 3:
                    white03.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    U3 = "B";
                    break;
                //blue
                case 4:
                    white03.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    U3 = "L";
                    break;
                //yellow
                case 5:
                    white03.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    U3 = "D";
                    break;
            }
        } else {
            white20Count = -1;
            white03.setBackgroundColor(Color.argb(255, 191, 191, 191));
            U3 = "";
        }
    }

    @OnClick(R.id.white04)
    public void white04() {
        white21Count++;
        if (white21Count < 6) {
            switch (white21Count) {
                //orange
                case 0:
                    white04.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    U4 = "F";
                    break;
                //green
                case 1:
                    white04.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    U4 = "R";
                    break;
                //white
                case 2:
                    white04.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    U4 = "U";
                    break;
                //red
                case 3:
                    white04.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    U4 = "B";
                    break;
                //blue
                case 4:
                    white04.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    U4 = "L";
                    break;
                //yellow
                case 5:
                    white04.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    U4 = "D";
                    break;
            }
        } else {
            white21Count = -1;
            white04.setBackgroundColor(Color.argb(255, 191, 191, 191));
            U4 = "";
        }
    }

    @OnClick(R.id.white05)
    public void white05() {
        //U5 finalized on User cube input view
    }

    @OnClick(R.id.white06)
    public void white06() {
        white23Count++;
        if (white23Count < 6) {
            switch (white23Count) {
                //orange
                case 0:
                    white06.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    U6 = "F";
                    break;
                //green
                case 1:
                    white06.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    U6 = "R";
                    break;
                //white
                case 2:
                    white06.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    U6 = "U";
                    break;
                //red
                case 3:
                    white06.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    U6 = "B";
                    break;
                //blue
                case 4:
                    white06.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    U6 = "L";
                    break;
                //yellow
                case 5:
                    white06.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    U6 = "D";
                    break;
            }
        } else {
            white23Count = -1;
            white06.setBackgroundColor(Color.argb(255, 191, 191, 191));
            U6 = "";
        }
    }

    @OnClick(R.id.white07)
    public void white07() {
        white24Count++;
        if (white24Count < 6) {
            switch (white24Count) {
                //orange
                case 0:
                    white07.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    U7 = "F";
                    break;
                //green
                case 1:
                    white07.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    U7 = "R";
                    break;
                //white
                case 2:
                    white07.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    U7 = "U";
                    break;
                //red
                case 3:
                    white07.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    U7 = "B";
                    break;
                //blue
                case 4:
                    white07.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    U7 = "L";
                    break;
                //yellow
                case 5:
                    white07.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    U7 = "D";
                    break;
            }
        } else {
            white24Count = -1;
            white07.setBackgroundColor(Color.argb(255, 191, 191, 191));
            U7 = "";
        }
    }

    @OnClick(R.id.white08)
    public void white08() {
        white25Count++;
        if (white25Count < 6) {
            switch (white25Count) {
                //orange
                case 0:
                    white08.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    U8 = "F";
                    break;
                //green
                case 1:
                    white08.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    U8 = "R";
                    break;
                //white
                case 2:
                    white08.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    U8 = "U";
                    break;
                //red
                case 3:
                    white08.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    U8 = "B";
                    break;
                //blue
                case 4:
                    white08.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    U8 = "L";
                    break;
                //yellow
                case 5:
                    white08.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    U8 = "D";
                    break;
            }
        } else {
            white25Count = -1;
            white08.setBackgroundColor(Color.argb(255, 191, 191, 191));
            U8 = "";
        }
    }

    @OnClick(R.id.white09)
    public void white09() {
        white26Count++;
        if (white26Count < 6) {
            switch (white26Count) {
                //orange
                case 0:
                    white09.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    U9 = "F";
                    break;
                //green
                case 1:
                    white09.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    U9 = "R";
                    break;
                //white
                case 2:
                    white09.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    U9 = "U";
                    break;
                //red
                case 3:
                    white09.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    U9 = "B";
                    break;
                //blue
                case 4:
                    white09.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    U9 = "L";
                    break;
                //yellow
                case 5:
                    white09.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    U9 = "D";
                    break;
            }
        } else {
            white26Count = -1;
            white09.setBackgroundColor(Color.argb(255, 191, 191, 191));
            U9 = "";
        }
    }

    //Transition buttons
//    @OnClick(R.id.whiteTransitionToBlue)
//    public void whiteTransitionToBlue(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new BlueFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
//
//    @OnClick(R.id.whiteTransitionToGreen)
//    public void whiteTransitionToGreen(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new GreenFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
//
//    @OnClick(R.id.whiteTransitionToRed)
//    public void whiteTransitionToRed(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new RedFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
//
//    @OnClick(R.id.whiteTransitionToOrange)
//    public void whiteTransitionToOrange(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new OrangeFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.FORWARD);
//    }
}
