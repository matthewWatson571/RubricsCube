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

import static com.teamcube.rubricscube.Views.UserCubeInputView.R1;
import static com.teamcube.rubricscube.Views.UserCubeInputView.R2;
import static com.teamcube.rubricscube.Views.UserCubeInputView.R3;
import static com.teamcube.rubricscube.Views.UserCubeInputView.R4;
import static com.teamcube.rubricscube.Views.UserCubeInputView.R6;
import static com.teamcube.rubricscube.Views.UserCubeInputView.R7;
import static com.teamcube.rubricscube.Views.UserCubeInputView.R8;
import static com.teamcube.rubricscube.Views.UserCubeInputView.R9;
import static com.teamcube.rubricscube.Views.UserCubeInputView.green10Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.green11Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.green12Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.green14Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.green15Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.green16Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.green17Count;
import static com.teamcube.rubricscube.Views.UserCubeInputView.green9Count;

/**
 * Created by matthewsturgill on 11/21/16.
 */

public class GreenFaceInputView extends LinearLayout {

    private Context context;

    //Green
    @Bind(R.id.green01)
    Button green01;

    @Bind(R.id.green02)
    Button green02;

    @Bind(R.id.green03)
    Button green03;

    @Bind(R.id.green04)
    Button green04;

    @Bind(R.id.green05)
    Button green05;

    @Bind(R.id.green06)
    Button green06;

    @Bind(R.id.green07)
    Button green07;

    @Bind(R.id.green08)
    Button green08;

    @Bind(R.id.green09)
    Button green09;

    //Buttons for transitions
    @Bind(R.id.greenTransitionToOrange)
    Button greenTransitionToOrange;

    @Bind(R.id.greenTransitionToYellow)
    Button greenTransitionToYellow;

    @Bind(R.id.greenTransitionToRed)
    Button greenTransitionToRed;

    @Bind(R.id.greenTransitionToWhite)
    Button greenTransitionToWhite;

    public GreenFaceInputView(Context context, AttributeSet attrs) {

        super(context, attrs);
        this.context = context;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);

        //On inflate populates colors from expanded input
        switch (green9Count) {
            //orange
            case 0:
                green01.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                green01.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                green01.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                green01.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                green01.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                green01.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                green01.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (green10Count) {
            //orange
            case 0:
                green02.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                green02.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                green02.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                green02.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                green02.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                green02.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                green02.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (green11Count) {
            //orange
            case 0:
                green03.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                green03.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                green03.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                green03.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                green03.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                green03.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                green03.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (green12Count) {
            //orange
            case 0:
                green04.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                green04.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                green04.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                green04.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                green04.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                green04.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                green04.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (green14Count) {
            //orange
            case 0:
                green06.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                green06.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                green06.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                green06.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                green06.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                green06.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                green06.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (green15Count) {
            //orange
            case 0:
                green07.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                green07.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                green07.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                green07.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                green07.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                green07.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                green07.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (green16Count) {
            //orange
            case 0:
                green08.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                green08.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                green08.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                green08.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                green08.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                green08.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                green08.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
        switch (green17Count) {
            //orange
            case 0:
                green09.setBackgroundColor(Color.argb(255, 255, 149, 0));
                break;
            //green
            case 1:
                green09.setBackgroundColor(Color.argb(255, 41, 198, 60));
                break;
            //white
            case 2:
                green09.setBackgroundColor(Color.argb(255, 255, 255, 255));
                break;
            //red
            case 3:
                green09.setBackgroundColor(Color.argb(255, 255, 40, 40));
                break;
            //blue
            case 4:
                green09.setBackgroundColor(Color.argb(255, 0, 0, 255));
                break;
            //yellow
            case 5:
                green09.setBackgroundColor(Color.argb(255, 246, 255, 0));
                break;
            default:
                green09.setBackgroundColor(Color.argb(255, 191, 191, 191));
        }
    }

    @OnClick(R.id.green01)
    public void green01() {
        green9Count++;
        if (green9Count < 6) {
            switch (green9Count) {
                //orange
                case 0:
                    green01.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    R1 = "F";
                    break;
                //green
                case 1:
                    green01.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    R1 = "R";
                    break;
                //white
                case 2:
                    green01.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    R1 = "U";
                    break;
                //red
                case 3:
                    green01.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    R1 = "B";
                    break;
                //blue
                case 4:
                    green01.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    R1 = "L";
                    break;
                //yellow
                case 5:
                    green01.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    R1 = "D";
                    break;
            }
        } else {
            green9Count = -1;
            green01.setBackgroundColor(Color.argb(255, 191, 191, 191));
            R1 = "";
        }
    }

    @OnClick(R.id.green02)
    public void green02() {
        green10Count++;
        if (green10Count < 6) {
            switch (green10Count) {
                //orange
                case 0:
                    green02.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    R2 = "F";
                    break;
                //green
                case 1:
                    green02.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    R2 = "R";
                    break;
                //white
                case 2:
                    green02.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    R2 = "U";
                    break;
                //red
                case 3:
                    green02.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    R2 = "B";
                    break;
                //blue
                case 4:
                    green02.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    R2 = "L";
                    break;
                //yellow
                case 5:
                    green02.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    R2 = "D";
                    break;
            }
        } else {
            green10Count = -1;
            green02.setBackgroundColor(Color.argb(255, 191, 191, 191));
            R2 = "";
        }
    }

    @OnClick(R.id.green03)
    public void green03() {
        green11Count++;
        if (green11Count < 6) {
            switch (green11Count) {
                //orange
                case 0:
                    green03.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    R3 = "F";
                    break;
                //green
                case 1:
                    green03.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    R3 = "R";
                    break;
                //white
                case 2:
                    green03.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    R3 = "U";
                    break;
                //red
                case 3:
                    green03.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    R3 = "B";
                    break;
                //blue
                case 4:
                    green03.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    R3 = "L";
                    break;
                //yellow
                case 5:
                    green03.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    R3 = "D";
                    break;
            }
        } else {
            green11Count = -1;
            green03.setBackgroundColor(Color.argb(255, 191, 191, 191));
            R3 = "";
        }
    }

    @OnClick(R.id.green04)
    public void green04() {
        green12Count++;
        if (green12Count < 6) {
            switch (green12Count) {
                //orange
                case 0:
                    green04.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    R4 = "F";
                    break;
                //green
                case 1:
                    green04.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    R4 = "R";
                    break;
                //white
                case 2:
                    green04.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    R4 = "U";
                    break;
                //red
                case 3:
                    green04.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    R4 = "B";
                    break;
                //blue
                case 4:
                    green04.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    R4 = "L";
                    break;
                //yellow
                case 5:
                    green04.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    R4 = "D";
                    break;
            }
        } else {
            green12Count = -1;
            green04.setBackgroundColor(Color.argb(255, 191, 191, 191));
            R4 = "";
        }
    }

    @OnClick(R.id.green05)
    public void green05() {
        //R5 is finalized on User cube input
    }

    @OnClick(R.id.green06)
    public void green06() {
        green14Count++;
        if (green14Count < 6) {
            switch (green14Count) {
                //orange
                case 0:
                    green06.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    R6 = "F";
                    break;
                //green
                case 1:
                    green06.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    R6 = "R";
                    break;
                //white
                case 2:
                    green06.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    R6 = "U";
                    break;
                //red
                case 3:
                    green06.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    R6 = "B";
                    break;
                //blue
                case 4:
                    green06.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    R6 = "L";
                    break;
                //yellow
                case 5:
                    green06.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    R6 = "D";
                    break;
            }
        } else {
            green14Count = -1;
            green06.setBackgroundColor(Color.argb(255, 191, 191, 191));
            R6 = "";
        }
    }

    @OnClick(R.id.green07)
    public void green07() {
        green15Count++;
        if (green15Count < 6) {
            switch (green15Count) {
                //orange
                case 0:
                    green07.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    R7 = "F";
                    break;
                //green
                case 1:
                    green07.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    R7 = "R";
                    break;
                //white
                case 2:
                    green07.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    R7 = "U";
                    break;
                //red
                case 3:
                    green07.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    R7 = "B";
                    break;
                //blue
                case 4:
                    green07.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    R7 = "L";
                    break;
                //yellow
                case 5:
                    green07.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    R7 = "D";
                    break;
            }
        } else {
            green15Count = -1;
            green07.setBackgroundColor(Color.argb(255, 191, 191, 191));
            R7 = "";
        }
    }

    @OnClick(R.id.green08)
    public void green08() {
        green16Count++;
        if (green16Count < 6) {
            switch (green16Count) {
                //orange
                case 0:
                    green08.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    R8 = "F";
                    break;
                //green
                case 1:
                    green08.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    R8 = "R";
                    break;
                //white
                case 2:
                    green08.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    R8 = "U";
                    break;
                //red
                case 3:
                    green08.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    R8 = "B";
                    break;
                //blue
                case 4:
                    green08.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    R8 = "L";
                    break;
                //yellow
                case 5:
                    green08.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    R8 = "D";
                    break;
            }
        } else {
            green16Count = -1;
            green08.setBackgroundColor(Color.argb(255, 191, 191, 191));
            R8 = "";
        }
    }

    @OnClick(R.id.green09)
    public void green09() {
        green17Count++;
        if (green17Count < 6) {
            switch (green17Count) {
                //orange
                case 0:
                    green09.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    R9 = "F";
                    break;
                //green
                case 1:
                    green09.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    R9 = "R";
                    break;
                //white
                case 2:
                    green09.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    R9 = "U";
                    break;
                //red
                case 3:
                    green09.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    R9 = "B";
                    break;
                //blue
                case 4:
                    green09.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    R9 = "L";
                    break;
                //yellow
                case 5:
                    green09.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    R9 = "D";
                    break;
            }
        } else {
            green17Count = -1;
            green09.setBackgroundColor(Color.argb(255, 191, 191, 191));
            R9 = "";
        }
    }
    //Transition buttons
//    @OnClick(R.id.greenTransitionToRed)
//    public void greenTransitionToRed(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new RedFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
//
//    @OnClick(R.id.greenTransitionToOrange)
//    public void greenTransitionToOrange(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new OrangeFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
//
//    @OnClick(R.id.greenTransitionToYellow)
//    public void greenTransitionToYellow(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new YellowFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
//
//    @OnClick(R.id.greenTransitionToWhite)
//    public void greenTransitionToWhite(){
//        Flow flow = RubricsCubeApplication.getMainFlow();
//        History newHistory = flow.getHistory().buildUpon()
//                .push(new WhiteFaceInputStage())
//                .build();
//        flow.setHistory(newHistory, Flow.Direction.REPLACE);
//    }
}
