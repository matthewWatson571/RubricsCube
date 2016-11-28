package com.teamcube.rubricscube.Views;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.teamcube.rubricscube.R;
import com.teamcube.rubricscube.RubricsCubeApplication;
import com.teamcube.rubricscube.Stages.BlueFaceInputStage;
import com.teamcube.rubricscube.Stages.GreenFaceInputStage;
import com.teamcube.rubricscube.Stages.OrangeFaceInputStage;
import com.teamcube.rubricscube.Stages.RedFaceInputStage;
import com.teamcube.rubricscube.Stages.SolutionStage;
import com.teamcube.rubricscube.Stages.WhiteFaceInputStage;
import com.teamcube.rubricscube.Stages.YellowFaceInputStage;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import flow.Flow;
import flow.History;

import static org.kociemba.twophase.Search.solution;

/**
 * Created by matthewsturgill on 11/16/16.
 */

public class UserCubeInputView extends LinearLayout {

    private Context context;
    public static String[] splitRub;


    //Orange Face Strings.
    public static String F1;
    public static String F2;
    public static String F3;
    public static String F4;
    //String face center automatically has value F.
    public final String F5 = "F";
    public static String F6;
    public static String F7;
    public static String F8;
    public static String F9;
    //Green Face String.
    public static String R1;
    public static String R2;
    public static String R3;
    public static String R4;
    //String face center automatically has value R.
    public final String R5 = "R";
    public static String R6;
    public static String R7;
    public static String R8;
    public static String R9;
    //White Face String.
    public static String U1;
    public static String U2;
    public static String U3;
    public static String U4;
    //String face center automatically has value U.
    public final String U5 = "U";
    public static String U6;
    public static String U7;
    public static String U8;
    public static String U9;
    //Red Face String.
    public static String B1;
    public static String B2;
    public static String B3;
    public static String B4;
    //String face center automatically has value B.
    public final String B5 = "B";
    public static String B6;
    public static String B7;
    public static String B8;
    public static String B9;
    //Blue face String.
    public static String L1;
    public static String L2;
    public static String L3;
    public static String L4;
    //String face center automatically has value L.
    public final String L5 = "L";
    public static String L6;
    public static String L7;
    public static String L8;
    public static String L9;
    //Yellow face String.
    public static String D1;
    public static String D2;
    public static String D3;
    public static String D4;
    //String face center automatically has vlue D.
    public final String D5 = "D";
    public static String D6;
    public static String D7;
    public static String D8;
    public static String D9;

    //Orange integers. Orange color value = 0
    public static int orange0Count = -1;
    public static int orange1Count = -1;
    public static int orange2Count = -1;
    public static int orange3Count = -1;
    //Int representing center square is already set to color value.
    public final int orange4Count = 0;
    public static int orange5Count = -1;
    public static int orange6Count = -1;
    public static int orange7Count = -1;
    public static int orange8Count = -1;

    //Green integers. Green color value = 1
    public static int green9Count = -1;
    public static int green10Count = -1;
    public static int green11Count = -1;
    public static int green12Count = -1;
    //Int representing center square is already set to color value.
    public final int green13Count = 1;
    public static int green14Count = -1;
    public static int green15Count = -1;
    public static int green16Count = -1;
    public static int green17Count = -1;

    //White integers. White color value = 2
    public static int white18Count = -1;
    public static int white19Count = -1;
    public static int white20Count = -1;
    public static int white21Count = -1;
    //Int representing center square is already set to color value.
    public final int white22Count = 2;
    public static int white23Count = -1;
    public static int white24Count = -1;
    public static int white25Count = -1;
    public static int white26Count = -1;

    //Red integers. Red color value = 3
    public static int red27Count = -1;
    public static int red28Count = -1;
    public static int red29Count = -1;
    public static int red30Count = -1;
    //Int representing center square is already set to color value.
    public final int red31Count = 3;
    public static int red32Count = -1;
    public static int red33Count = -1;
    public static int red34Count = -1;
    public static int red35Count = -1;

    //Blue integers. Blue color value = 4
    public static int blue36Count = -1;
    public static int blue37Count = -1;
    public static int blue38Count = -1;
    public static int blue39Count = -1;
    //Int representing center square is already set to color value.
    public final int blue40Count = 4;
    public static int blue41Count = -1;
    public static int blue42Count = -1;
    public static int blue43Count = -1;
    public static int blue44Count = -1;

    //Yellow integers. Yellow color value = 5
    public static int yellow45Count = -1;
    public static int yellow46Count = -1;
    public static int yellow47Count = -1;
    public static int yellow48Count = -1;
    //Int representing center square is already set to color value.
    public final int yellow49Count = 5;
    public static int yellow50Count = -1;
    public static int yellow51Count = -1;
    public static int yellow52Count = -1;
    public static int yellow53Count = -1;
    //Integer to hold sum of all cube values.
    int allCubiesAdded;

    //Bind all buttons for User input in numerical order.
    //Orange.
    @Bind(R.id.orange0)
    Button orange0;

    @Bind(R.id.orange1)
    Button orange1;

    @Bind(R.id.orange2)
    Button orange2;

    @Bind(R.id.orange3)
    Button orange3;

    @Bind(R.id.orange4)
    Button orange4;

    @Bind(R.id.orange5)
    Button orange5;

    @Bind(R.id.orange6)
    Button orange6;

    @Bind(R.id.orange7)
    Button orange7;

    @Bind(R.id.orange8)
    Button orange8;

    //Green
    @Bind(R.id.green9)
    Button green9;

    @Bind(R.id.green10)
    Button green10;

    @Bind(R.id.green11)
    Button green11;

    @Bind(R.id.green12)
    Button green12;

    @Bind(R.id.green13)
    Button green13;

    @Bind(R.id.green14)
    Button green14;

    @Bind(R.id.green15)
    Button green15;

    @Bind(R.id.green16)
    Button green16;

    @Bind(R.id.green17)
    Button green17;

    //White
    @Bind(R.id.white18)
    Button white18;

    @Bind(R.id.white19)
    Button white19;

    @Bind(R.id.white20)
    Button white20;

    @Bind(R.id.white21)
    Button white21;

    @Bind(R.id.white22)
    Button white22;

    @Bind(R.id.white23)
    Button white23;

    @Bind(R.id.white24)
    Button white24;

    @Bind(R.id.white25)
    Button white25;

    @Bind(R.id.white26)
    Button white26;

    //Red
    @Bind(R.id.red27)
    Button red27;

    @Bind(R.id.red28)
    Button red28;

    @Bind(R.id.red29)
    Button red29;

    @Bind(R.id.red30)
    Button red30;

    @Bind(R.id.red31)
    Button red31;

    @Bind(R.id.red32)
    Button red32;

    @Bind(R.id.red33)
    Button red33;

    @Bind(R.id.red34)
    Button red34;

    @Bind(R.id.red35)
    Button red35;

    //Blue
    @Bind(R.id.blue36)
    Button blue36;

    @Bind(R.id.blue37)
    Button blue37;

    @Bind(R.id.blue38)
    Button blue38;

    @Bind(R.id.blue39)
    Button blue39;

    @Bind(R.id.blue40)
    Button blue40;

    @Bind(R.id.blue41)
    Button blue41;

    @Bind(R.id.blue42)
    Button blue42;

    @Bind(R.id.blue43)
    Button blue43;

    @Bind(R.id.blue44)
    Button blue44;

    //Yellow
    @Bind(R.id.yellow45)
    Button yellow45;

    @Bind(R.id.yellow46)
    Button yellow46;

    @Bind(R.id.yellow47)
    Button yellow47;

    @Bind(R.id.yellow48)
    Button yellow48;

    @Bind(R.id.yellow49)
    Button yellow49;

    @Bind(R.id.yellow50)
    Button yellow50;

    @Bind(R.id.yellow51)
    Button yellow51;

    @Bind(R.id.yellow52)
    Button yellow52;

    @Bind(R.id.yellow53)
    Button yellow53;

    //Other Buttons
    @Bind(R.id.solveButton)
    Button solveButton;

    @Bind(R.id.resetButton)
    Button resetButton;

    @Bind(R.id.progressSpinner)
    ProgressBar progressSpinner;

//    @Bind(R.id.randomButton)
//    Button randomButton;
//
//    @Bind(R.id.helpButton)
//    Button helpButton;


    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);

        resetButton.setEnabled(true);
        solveButton.setEnabled(true);
        progressSpinner.setVisibility(GONE);

        //Orange on inflate populate from zoom view
        switch (orange0Count) {
            //orange
            case 0:
                orange0.setBackgroundColor(Color.argb(255, 255, 149, 0));
                F1 = "F";
                break;
            //green
            case 1:
                orange0.setBackgroundColor(Color.argb(255, 41, 198, 60));
                F1 = "R";
                break;
            //white
            case 2:
                orange0.setBackgroundColor(Color.argb(255, 255, 255, 255));
                F1 = "U";
                break;
            //red
            case 3:
                orange0.setBackgroundColor(Color.argb(255, 255, 40, 40));
                F1 = "B";
                break;
            //blue
            case 4:
                orange0.setBackgroundColor(Color.argb(255, 0, 0, 255));
                F1 = "L";
                break;
            //yellow
            case 5:
                orange0.setBackgroundColor(Color.argb(255, 246, 255, 0));
                F1 = "D";
                break;
            default:
                orange0Count = -1;
                orange0.setBackgroundColor(Color.argb(255, 191, 191, 191));
                F1 = "";
        }
        switch (orange1Count) {
            //orange
            case 0:
                orange1.setBackgroundColor(Color.argb(255, 255, 149, 0));
                F2 = "F";
                break;
            //green
            case 1:
                orange1.setBackgroundColor(Color.argb(255, 41, 198, 60));
                F2 = "R";
                break;
            //white
            case 2:
                orange1.setBackgroundColor(Color.argb(255, 255, 255, 255));
                F2 = "U";
                break;
            //red
            case 3:
                orange1.setBackgroundColor(Color.argb(255, 255, 40, 40));
                F2 = "B";
                break;
            //blue
            case 4:
                orange1.setBackgroundColor(Color.argb(255, 0, 0, 255));
                F2 = "L";
                break;
            //yellow
            case 5:
                orange1.setBackgroundColor(Color.argb(255, 246, 255, 0));
                F2 = "D";
                break;
            default:
                orange1Count = -1;
                orange1.setBackgroundColor(Color.argb(255, 191, 191, 191));
                F2 = "";
        }
        switch (orange2Count) {
            //orange
            case 0:
                orange2.setBackgroundColor(Color.argb(255, 255, 149, 0));
                F3 = "F";
                break;
            //green
            case 1:
                orange2.setBackgroundColor(Color.argb(255, 41, 198, 60));
                F3 = "R";
                break;
            //white
            case 2:
                orange2.setBackgroundColor(Color.argb(255, 255, 255, 255));
                F3 = "U";
                break;
            //red
            case 3:
                orange2.setBackgroundColor(Color.argb(255, 255, 40, 40));
                F3 = "B";
                break;
            //blue
            case 4:
                orange2.setBackgroundColor(Color.argb(255, 0, 0, 255));
                F3 = "L";
                break;
            //yellow
            case 5:
                orange2.setBackgroundColor(Color.argb(255, 246, 255, 0));
                F3 = "D";
                break;
            default:
                orange2Count = -1;
                orange2.setBackgroundColor(Color.argb(255, 191, 191, 191));
                F3 = "";
        }
        switch (orange3Count) {
            //orange
            case 0:
                orange3.setBackgroundColor(Color.argb(255, 255, 149, 0));
                F4 = "F";
                break;
            //green
            case 1:
                orange3.setBackgroundColor(Color.argb(255, 41, 198, 60));
                F4 = "R";
                break;
            //white
            case 2:
                orange3.setBackgroundColor(Color.argb(255, 255, 255, 255));
                F4 = "U";
                break;
            //red
            case 3:
                orange3.setBackgroundColor(Color.argb(255, 255, 40, 40));
                F4 = "B";
                break;
            //blue
            case 4:
                orange3.setBackgroundColor(Color.argb(255, 0, 0, 255));
                F4 = "L";
                break;
            //yellow
            case 5:
                orange3.setBackgroundColor(Color.argb(255, 246, 255, 0));
                F4 = "D";
                break;
            default:
                orange3Count = -1;
                orange3.setBackgroundColor(Color.argb(255, 191, 191, 191));
                F4 = "";
        }
        switch (orange5Count) {
            //orange
            case 0:
                orange5.setBackgroundColor(Color.argb(255, 255, 149, 0));
                F6 = "F";
                break;
            //green
            case 1:
                orange5.setBackgroundColor(Color.argb(255, 41, 198, 60));
                F6 = "R";
                break;
            //white
            case 2:
                orange5.setBackgroundColor(Color.argb(255, 255, 255, 255));
                F6 = "U";
                break;
            //red
            case 3:
                orange5.setBackgroundColor(Color.argb(255, 255, 40, 40));
                F6 = "B";
                break;
            //blue
            case 4:
                orange5.setBackgroundColor(Color.argb(255, 0, 0, 255));
                F6 = "L";
                break;
            //yellow
            case 5:
                orange5.setBackgroundColor(Color.argb(255, 246, 255, 0));
                F6 = "D";
                break;
            default:
                orange5Count = -1;
                orange5.setBackgroundColor(Color.argb(255, 191, 191, 191));
                F6 = "";
        }
        switch (orange6Count) {
            //orange
            case 0:
                orange6.setBackgroundColor(Color.argb(255, 255, 149, 0));
                F7 = "F";
                break;
            //green
            case 1:
                orange6.setBackgroundColor(Color.argb(255, 41, 198, 60));
                F7 = "R";
                break;
            //white
            case 2:
                orange6.setBackgroundColor(Color.argb(255, 255, 255, 255));
                F7 = "U";
                break;
            //red
            case 3:
                orange6.setBackgroundColor(Color.argb(255, 255, 40, 40));
                F7 = "B";
                break;
            //blue
            case 4:
                orange6.setBackgroundColor(Color.argb(255, 0, 0, 255));
                F7 = "L";
                break;
            //yellow
            case 5:
                orange6.setBackgroundColor(Color.argb(255, 246, 255, 0));
                F7 = "D";
                break;
            default:
                orange6Count = -1;
                orange6.setBackgroundColor(Color.argb(255, 191, 191, 191));
                F7 = "";
        }
        switch (orange7Count) {
            //orange
            case 0:
                orange7.setBackgroundColor(Color.argb(255, 255, 149, 0));
                F8 = "F";
                break;
            //green
            case 1:
                orange7.setBackgroundColor(Color.argb(255, 41, 198, 60));
                F8 = "R";
                break;
            //white
            case 2:
                orange7.setBackgroundColor(Color.argb(255, 255, 255, 255));
                F8 = "U";
                break;
            //red
            case 3:
                orange7.setBackgroundColor(Color.argb(255, 255, 40, 40));
                F8 = "B";
                break;
            //blue
            case 4:
                orange7.setBackgroundColor(Color.argb(255, 0, 0, 255));
                F8 = "L";
                break;
            //yellow
            case 5:
                orange7.setBackgroundColor(Color.argb(255, 246, 255, 0));
                F8 = "D";
                break;
            default:
                orange7Count = -1;
                orange7.setBackgroundColor(Color.argb(255, 191, 191, 191));
                F8 = "";
        }
        switch (orange8Count) {
            //orange
            case 0:
                orange8.setBackgroundColor(Color.argb(255, 255, 149, 0));
                F9 = "F";
                break;
            //green
            case 1:
                orange8.setBackgroundColor(Color.argb(255, 41, 198, 60));
                F9 = "R";
                break;
            //white
            case 2:
                orange8.setBackgroundColor(Color.argb(255, 255, 255, 255));
                F9 = "U";
                break;
            //red
            case 3:
                orange8.setBackgroundColor(Color.argb(255, 255, 40, 40));
                F9 = "B";
                break;
            //blue
            case 4:
                orange8.setBackgroundColor(Color.argb(255, 0, 0, 255));
                F9 = "L";
                break;
            //yellow
            case 5:
                orange8.setBackgroundColor(Color.argb(255, 246, 255, 0));
                F9 = "D";
                break;
            default:
                orange8Count = -1;
                orange8.setBackgroundColor(Color.argb(255, 191, 191, 191));
                F9 = "";
        }
        switch (green9Count) {
            //orange
            case 0:
                green9.setBackgroundColor(Color.argb(255, 255, 149, 0));
                R1 = "F";
                break;
            //green
            case 1:
                green9.setBackgroundColor(Color.argb(255, 41, 198, 60));
                R1 = "R";
                break;
            //white
            case 2:
                green9.setBackgroundColor(Color.argb(255, 255, 255, 255));
                R1 = "U";
                break;
            //red
            case 3:
                green9.setBackgroundColor(Color.argb(255, 255, 40, 40));
                R1 = "B";
                break;
            //blue
            case 4:
                green9.setBackgroundColor(Color.argb(255, 0, 0, 255));
                R1 = "L";
                break;
            //yellow
            case 5:
                green9.setBackgroundColor(Color.argb(255, 246, 255, 0));
                R1 = "D";
                break;
            default:
                green9Count = -1;
                green9.setBackgroundColor(Color.argb(255, 191, 191, 191));
                R1 = "";
        }
        switch (green10Count) {
            //orange
            case 0:
                green10.setBackgroundColor(Color.argb(255, 255, 149, 0));
                R2 = "F";
                break;
            //green
            case 1:
                green10.setBackgroundColor(Color.argb(255, 41, 198, 60));
                R2 = "R";
                break;
            //white
            case 2:
                green10.setBackgroundColor(Color.argb(255, 255, 255, 255));
                R2 = "U";
                break;
            //red
            case 3:
                green10.setBackgroundColor(Color.argb(255, 255, 40, 40));
                R2 = "B";
                break;
            //blue
            case 4:
                green10.setBackgroundColor(Color.argb(255, 0, 0, 255));
                R2 = "L";
                break;
            //yellow
            case 5:
                green10.setBackgroundColor(Color.argb(255, 246, 255, 0));
                R2 = "D";
                break;
            default:
                green10Count = -1;
                green10.setBackgroundColor(Color.argb(255, 191, 191, 191));
                R2 = "";
        }
        switch (green11Count) {
            //orange
            case 0:
                green11.setBackgroundColor(Color.argb(255, 255, 149, 0));
                R3 = "F";
                break;
            //green
            case 1:
                green11.setBackgroundColor(Color.argb(255, 41, 198, 60));
                R3 = "R";
                break;
            //white
            case 2:
                green11.setBackgroundColor(Color.argb(255, 255, 255, 255));
                R3 = "U";
                break;
            //red
            case 3:
                green11.setBackgroundColor(Color.argb(255, 255, 40, 40));
                R3 = "B";
                break;
            //blue
            case 4:
                green11.setBackgroundColor(Color.argb(255, 0, 0, 255));
                R3 = "L";
                break;
            //yellow
            case 5:
                green11.setBackgroundColor(Color.argb(255, 246, 255, 0));
                R3 = "D";
                break;
            default:
                green11Count = -1;
                green11.setBackgroundColor(Color.argb(255, 191, 191, 191));
                R3 = "";
        }
        switch (green12Count) {
            //orange
            case 0:
                green12.setBackgroundColor(Color.argb(255, 255, 149, 0));
                R4 = "F";
                break;
            //green
            case 1:
                green12.setBackgroundColor(Color.argb(255, 41, 198, 60));
                R4 = "R";
                break;
            //white
            case 2:
                green12.setBackgroundColor(Color.argb(255, 255, 255, 255));
                R4 = "U";
                break;
            //red
            case 3:
                green12.setBackgroundColor(Color.argb(255, 255, 40, 40));
                R4 = "B";
                break;
            //blue
            case 4:
                green12.setBackgroundColor(Color.argb(255, 0, 0, 255));
                R4 = "L";
                break;
            //yellow
            case 5:
                green12.setBackgroundColor(Color.argb(255, 246, 255, 0));
                R4 = "D";
                break;
            default:
                green12Count = -1;
                green12.setBackgroundColor(Color.argb(255, 191, 191, 191));
                R4 = "";
        }
        switch (green14Count) {
            //orange
            case 0:
                green14.setBackgroundColor(Color.argb(255, 255, 149, 0));
                R6 = "F";
                break;
            //green
            case 1:
                green14.setBackgroundColor(Color.argb(255, 41, 198, 60));
                R6 = "R";
                break;
            //white
            case 2:
                green14.setBackgroundColor(Color.argb(255, 255, 255, 255));
                R6 = "U";
                break;
            //red
            case 3:
                green14.setBackgroundColor(Color.argb(255, 255, 40, 40));
                R6 = "B";
                break;
            //blue
            case 4:
                green14.setBackgroundColor(Color.argb(255, 0, 0, 255));
                R6 = "L";
                break;
            //yellow
            case 5:
                green14.setBackgroundColor(Color.argb(255, 246, 255, 0));
                R6 = "D";
                break;
            default:
                green14Count = -1;
                green14.setBackgroundColor(Color.argb(255, 191, 191, 191));
                R6 = "";
        }
        switch (green15Count) {
            //orange
            case 0:
                green15.setBackgroundColor(Color.argb(255, 255, 149, 0));
                R7 = "F";
                break;
            //green
            case 1:
                green15.setBackgroundColor(Color.argb(255, 41, 198, 60));
                R7 = "R";
                break;
            //white
            case 2:
                green15.setBackgroundColor(Color.argb(255, 255, 255, 255));
                R7 = "U";
                break;
            //red
            case 3:
                green15.setBackgroundColor(Color.argb(255, 255, 40, 40));
                R7 = "B";
                break;
            //blue
            case 4:
                green15.setBackgroundColor(Color.argb(255, 0, 0, 255));
                R7 = "L";
                break;
            //yellow
            case 5:
                green15.setBackgroundColor(Color.argb(255, 246, 255, 0));
                R7 = "D";
                break;
            default:
                green15Count = -1;
                green15.setBackgroundColor(Color.argb(255, 191, 191, 191));
                R7 = "";
        }
        switch (green16Count) {
            //orange
            case 0:
                green16.setBackgroundColor(Color.argb(255, 255, 149, 0));
                R8 = "F";
                break;
            //green
            case 1:
                green16.setBackgroundColor(Color.argb(255, 41, 198, 60));
                R8 = "R";
                break;
            //white
            case 2:
                green16.setBackgroundColor(Color.argb(255, 255, 255, 255));
                R8 = "U";
                break;
            //red
            case 3:
                green16.setBackgroundColor(Color.argb(255, 255, 40, 40));
                R8 = "B";
                break;
            //blue
            case 4:
                green16.setBackgroundColor(Color.argb(255, 0, 0, 255));
                R8 = "L";
                break;
            //yellow
            case 5:
                green16.setBackgroundColor(Color.argb(255, 246, 255, 0));
                R8 = "D";
                break;
            default:
                green16Count = -1;
                green16.setBackgroundColor(Color.argb(255, 191, 191, 191));
                R8 = "";
        }
        switch (green17Count) {
            //orange
            case 0:
                green17.setBackgroundColor(Color.argb(255, 255, 149, 0));
                R9 = "F";
                break;
            //green
            case 1:
                green17.setBackgroundColor(Color.argb(255, 41, 198, 60));
                R9 = "R";
                break;
            //white
            case 2:
                green17.setBackgroundColor(Color.argb(255, 255, 255, 255));
                R9 = "U";
                break;
            //red
            case 3:
                green17.setBackgroundColor(Color.argb(255, 255, 40, 40));
                R9 = "B";
                break;
            //blue
            case 4:
                green17.setBackgroundColor(Color.argb(255, 0, 0, 255));
                R9 = "L";
                break;
            //yellow
            case 5:
                green17.setBackgroundColor(Color.argb(255, 246, 255, 0));
                R9 = "D";
                break;
            default:
                green17Count = -1;
                green17.setBackgroundColor(Color.argb(255, 191, 191, 191));
                R9 = "";
        }
        //White on inflate to populate from other View
        switch (white18Count) {
            //orange
            case 0:
                white18.setBackgroundColor(Color.argb(255, 255, 149, 0));
                U1 = "F";
                break;
            //green
            case 1:
                white18.setBackgroundColor(Color.argb(255, 41, 198, 60));
                U1 = "R";
                break;
            //white
            case 2:
                white18.setBackgroundColor(Color.argb(255, 255, 255, 255));
                U1 = "U";
                break;
            //red
            case 3:
                white18.setBackgroundColor(Color.argb(255, 255, 40, 40));
                U1 = "B";
                break;
            //blue
            case 4:
                white18.setBackgroundColor(Color.argb(255, 0, 0, 255));
                U1 = "L";
                break;
            //yellow
            case 5:
                white18.setBackgroundColor(Color.argb(255, 246, 255, 0));
                U1 = "D";
                break;
            default:
                white18Count = -1;
                white18.setBackgroundColor(Color.argb(255, 191, 191, 191));
                U1 = "";
        }
        switch (white19Count) {
            //orange
            case 0:
                white19.setBackgroundColor(Color.argb(255, 255, 149, 0));
                U2 = "F";
                break;
            //green
            case 1:
                white19.setBackgroundColor(Color.argb(255, 41, 198, 60));
                U2 = "R";
                break;
            //white
            case 2:
                white19.setBackgroundColor(Color.argb(255, 255, 255, 255));
                U2 = "U";
                break;
            //red
            case 3:
                white19.setBackgroundColor(Color.argb(255, 255, 40, 40));
                U2 = "B";
                break;
            //blue
            case 4:
                white19.setBackgroundColor(Color.argb(255, 0, 0, 255));
                U2 = "L";
                break;
            //yellow
            case 5:
                white19.setBackgroundColor(Color.argb(255, 246, 255, 0));
                U2 = "D";
                break;
            default:
                white19Count = -1;
                white19.setBackgroundColor(Color.argb(255, 191, 191, 191));
                U2 = "";
        }
        switch (white20Count) {
            //orange
            case 0:
                white20.setBackgroundColor(Color.argb(255, 255, 149, 0));
                U3 = "F";
                break;
            //green
            case 1:
                white20.setBackgroundColor(Color.argb(255, 41, 198, 60));
                U3 = "R";
                break;
            //white
            case 2:
                white20.setBackgroundColor(Color.argb(255, 255, 255, 255));
                U3 = "U";
                break;
            //red
            case 3:
                white20.setBackgroundColor(Color.argb(255, 255, 40, 40));
                U3 = "B";
                break;
            //blue
            case 4:
                white20.setBackgroundColor(Color.argb(255, 0, 0, 255));
                U3 = "L";
                break;
            //yellow
            case 5:
                white20.setBackgroundColor(Color.argb(255, 246, 255, 0));
                U3 = "D";
                break;
            default:
                white20Count = -1;
                white20.setBackgroundColor(Color.argb(255, 191, 191, 191));
                U3 = "";
        }
        switch (white21Count) {
            //orange
            case 0:
                white21.setBackgroundColor(Color.argb(255, 255, 149, 0));
                U4 = "F";
                break;
            //green
            case 1:
                white21.setBackgroundColor(Color.argb(255, 41, 198, 60));
                U4 = "R";
                break;
            //white
            case 2:
                white21.setBackgroundColor(Color.argb(255, 255, 255, 255));
                U4 = "U";
                break;
            //red
            case 3:
                white21.setBackgroundColor(Color.argb(255, 255, 40, 40));
                U4 = "B";
                break;
            //blue
            case 4:
                white21.setBackgroundColor(Color.argb(255, 0, 0, 255));
                U4 = "L";
                break;
            //yellow
            case 5:
                white21.setBackgroundColor(Color.argb(255, 246, 255, 0));
                U4 = "D";
                break;
            default:
                white21Count = -1;
                white21.setBackgroundColor(Color.argb(255, 191, 191, 191));
                U4 = "";
        }
        switch (white23Count) {
            //orange
            case 0:
                white23.setBackgroundColor(Color.argb(255, 255, 149, 0));
                U6 = "F";
                break;
            //green
            case 1:
                white23.setBackgroundColor(Color.argb(255, 41, 198, 60));
                U6 = "R";
                break;
            //white
            case 2:
                white23.setBackgroundColor(Color.argb(255, 255, 255, 255));
                U6 = "U";
                break;
            //red
            case 3:
                white23.setBackgroundColor(Color.argb(255, 255, 40, 40));
                U6 = "B";
                break;
            //blue
            case 4:
                white23.setBackgroundColor(Color.argb(255, 0, 0, 255));
                U6 = "L";
                break;
            //yellow
            case 5:
                white23.setBackgroundColor(Color.argb(255, 246, 255, 0));
                U6 = "D";
                break;
            default:
                white23Count = -1;
                white23.setBackgroundColor(Color.argb(255, 191, 191, 191));
                U6 = "";
        }
        switch (white24Count) {
            //orange
            case 0:
                white24.setBackgroundColor(Color.argb(255, 255, 149, 0));
                U7 = "F";
                break;
            //green
            case 1:
                white24.setBackgroundColor(Color.argb(255, 41, 198, 60));
                U7 = "R";
                break;
            //white
            case 2:
                white24.setBackgroundColor(Color.argb(255, 255, 255, 255));
                U7 = "U";
                break;
            //red
            case 3:
                white24.setBackgroundColor(Color.argb(255, 255, 40, 40));
                U7 = "B";
                break;
            //blue
            case 4:
                white24.setBackgroundColor(Color.argb(255, 0, 0, 255));
                U7 = "L";
                break;
            //yellow
            case 5:
                white24.setBackgroundColor(Color.argb(255, 246, 255, 0));
                U7 = "D";
                break;
            default:
                white24Count = -1;
                white24.setBackgroundColor(Color.argb(255, 191, 191, 191));
                U7 = "";
        }
        switch (white25Count) {
            //orange
            case 0:
                white25.setBackgroundColor(Color.argb(255, 255, 149, 0));
                U8 = "F";
                break;
            //green
            case 1:
                white25.setBackgroundColor(Color.argb(255, 41, 198, 60));
                U8 = "R";
                break;
            //white
            case 2:
                white25.setBackgroundColor(Color.argb(255, 255, 255, 255));
                U8 = "U";
                break;
            //red
            case 3:
                white25.setBackgroundColor(Color.argb(255, 255, 40, 40));
                U8 = "B";
                break;
            //blue
            case 4:
                white25.setBackgroundColor(Color.argb(255, 0, 0, 255));
                U8 = "L";
                break;
            //yellow
            case 5:
                white25.setBackgroundColor(Color.argb(255, 246, 255, 0));
                U8 = "D";
                break;
            default:
                white25Count = -1;
                white25.setBackgroundColor(Color.argb(255, 191, 191, 191));
                U8 = "";
        }
        switch (white26Count) {
            //orange
            case 0:
                white26.setBackgroundColor(Color.argb(255, 255, 149, 0));
                U9 = "F";
                break;
            //green
            case 1:
                white26.setBackgroundColor(Color.argb(255, 41, 198, 60));
                U9 = "R";
                break;
            //white
            case 2:
                white26.setBackgroundColor(Color.argb(255, 255, 255, 255));
                U9 = "U";
                break;
            //red
            case 3:
                white26.setBackgroundColor(Color.argb(255, 255, 40, 40));
                U9 = "B";
                break;
            //blue
            case 4:
                white26.setBackgroundColor(Color.argb(255, 0, 0, 255));
                U9 = "L";
                break;
            //yellow
            case 5:
                white26.setBackgroundColor(Color.argb(255, 246, 255, 0));
                U9 = "D";
                break;
            default:
                white26Count = -1;
                white26.setBackgroundColor(Color.argb(255, 191, 191, 191));
                U9 = "";
        }
        //Red on inflate to populate from zoom view
        switch (red27Count) {
            //orange
            case 0:
                red27.setBackgroundColor(Color.argb(255, 255, 149, 0));
                B1 = "F";
                break;
            //green
            case 1:
                red27.setBackgroundColor(Color.argb(255, 41, 198, 60));
                B1 = "R";
                break;
            //white
            case 2:
                red27.setBackgroundColor(Color.argb(255, 255, 255, 255));
                B1 = "U";
                break;
            //red
            case 3:
                red27.setBackgroundColor(Color.argb(255, 255, 40, 40));
                B1 = "B";
                break;
            //blue
            case 4:
                red27.setBackgroundColor(Color.argb(255, 0, 0, 255));
                B1 = "L";
                break;
            //yellow
            case 5:
                red27.setBackgroundColor(Color.argb(255, 246, 255, 0));
                B1 = "D";
                break;
            default:
                red27Count = -1;
                red27.setBackgroundColor(Color.argb(255, 191, 191, 191));
                B1 = "";
        }
        switch (red28Count) {
            //orange
            case 0:
                red28.setBackgroundColor(Color.argb(255, 255, 149, 0));
                B2 = "F";
                break;
            //green
            case 1:
                red28.setBackgroundColor(Color.argb(255, 41, 198, 60));
                B2 = "R";
                break;
            //white
            case 2:
                red28.setBackgroundColor(Color.argb(255, 255, 255, 255));
                B2 = "U";
                break;
            //red
            case 3:
                red28.setBackgroundColor(Color.argb(255, 255, 40, 40));
                B2 = "B";
                break;
            //blue
            case 4:
                red28.setBackgroundColor(Color.argb(255, 0, 0, 255));
                B2 = "L";
                break;
            //yellow
            case 5:
                red28.setBackgroundColor(Color.argb(255, 246, 255, 0));
                B2 = "D";
                break;
            default:
                red28Count = -1;
                red28.setBackgroundColor(Color.argb(255, 191, 191, 191));
                B2 = "";
        }
        switch (red29Count) {
            //orange
            case 0:
                red29.setBackgroundColor(Color.argb(255, 255, 149, 0));
                B3 = "F";
                break;
            //green
            case 1:
                red29.setBackgroundColor(Color.argb(255, 41, 198, 60));
                B3 = "R";
                break;
            //white
            case 2:
                red29.setBackgroundColor(Color.argb(255, 255, 255, 255));
                B3 = "U";
                break;
            //red
            case 3:
                red29.setBackgroundColor(Color.argb(255, 255, 40, 40));
                B3 = "B";
                break;
            //blue
            case 4:
                red29.setBackgroundColor(Color.argb(255, 0, 0, 255));
                B3 = "L";
                break;
            //yellow
            case 5:
                red29.setBackgroundColor(Color.argb(255, 246, 255, 0));
                B3 = "D";
                break;
            default:
                red29Count = -1;
                red29.setBackgroundColor(Color.argb(255, 191, 191, 191));
                B3 = "";
        }
        switch (red30Count) {
            //orange
            case 0:
                red30.setBackgroundColor(Color.argb(255, 255, 149, 0));
                B4 = "F";
                break;
            //green
            case 1:
                red30.setBackgroundColor(Color.argb(255, 41, 198, 60));
                B4 = "R";
                break;
            //white
            case 2:
                red30.setBackgroundColor(Color.argb(255, 255, 255, 255));
                B4 = "U";
                break;
            //red
            case 3:
                red30.setBackgroundColor(Color.argb(255, 255, 40, 40));
                B4 = "B";
                break;
            //blue
            case 4:
                red30.setBackgroundColor(Color.argb(255, 0, 0, 255));
                B4 = "L";
                break;
            //yellow
            case 5:
                red30.setBackgroundColor(Color.argb(255, 246, 255, 0));
                B4 = "D";
                break;
            default:
                red30Count = -1;
                red30.setBackgroundColor(Color.argb(255, 191, 191, 191));
                B4 = "";
        }
        switch (red32Count) {
            //orange
            case 0:
                red32.setBackgroundColor(Color.argb(255, 255, 149, 0));
                B6 = "F";
                break;
            //green
            case 1:
                red32.setBackgroundColor(Color.argb(255, 41, 198, 60));
                B6 = "R";
                break;
            //white
            case 2:
                red32.setBackgroundColor(Color.argb(255, 255, 255, 255));
                B6 = "U";
                break;
            //red
            case 3:
                red32.setBackgroundColor(Color.argb(255, 255, 40, 40));
                B6 = "B";
                break;
            //blue
            case 4:
                red32.setBackgroundColor(Color.argb(255, 0, 0, 255));
                B6 = "L";
                break;
            //yellow
            case 5:
                red32.setBackgroundColor(Color.argb(255, 246, 255, 0));
                B6 = "D";
                break;
            default:
                red32Count = -1;
                red32.setBackgroundColor(Color.argb(255, 191, 191, 191));
                B6 = "";
        }
        switch (red33Count) {
            //orange
            case 0:
                red33.setBackgroundColor(Color.argb(255, 255, 149, 0));
                B7 = "F";
                break;
            //green
            case 1:
                red33.setBackgroundColor(Color.argb(255, 41, 198, 60));
                B7 = "R";
                break;
            //white
            case 2:
                red33.setBackgroundColor(Color.argb(255, 255, 255, 255));
                B7 = "U";
                break;
            //red
            case 3:
                red33.setBackgroundColor(Color.argb(255, 255, 40, 40));
                B7 = "B";
                break;
            //blue
            case 4:
                red33.setBackgroundColor(Color.argb(255, 0, 0, 255));
                B7 = "L";
                break;
            //yellow
            case 5:
                red33.setBackgroundColor(Color.argb(255, 246, 255, 0));
                B7 = "D";
                break;
            default:
                red33Count = -1;
                red33.setBackgroundColor(Color.argb(255, 191, 191, 191));
                B7 = "";
        }
        switch (red34Count) {
            //orange
            case 0:
                red34.setBackgroundColor(Color.argb(255, 255, 149, 0));
                B8 = "F";
                break;
            //green
            case 1:
                red34.setBackgroundColor(Color.argb(255, 41, 198, 60));
                B8 = "R";
                break;
            //white
            case 2:
                red34.setBackgroundColor(Color.argb(255, 255, 255, 255));
                B8 = "U";
                break;
            //red
            case 3:
                red34.setBackgroundColor(Color.argb(255, 255, 40, 40));
                B8 = "B";
                break;
            //blue
            case 4:
                red34.setBackgroundColor(Color.argb(255, 0, 0, 255));
                B8 = "L";
                break;
            //yellow
            case 5:
                red34.setBackgroundColor(Color.argb(255, 246, 255, 0));
                B8 = "D";
                break;
            default:
                red34Count = -1;
                red34.setBackgroundColor(Color.argb(255, 191, 191, 191));
                B8 = "";
        }
        switch (red35Count) {
            //orange
            case 0:
                red35.setBackgroundColor(Color.argb(255, 255, 149, 0));
                B9 = "F";
                break;
            //green
            case 1:
                red35.setBackgroundColor(Color.argb(255, 41, 198, 60));
                B9 = "R";
                break;
            //white
            case 2:
                red35.setBackgroundColor(Color.argb(255, 255, 255, 255));
                B9 = "U";
                break;
            //red
            case 3:
                red35.setBackgroundColor(Color.argb(255, 255, 40, 40));
                B9 = "B";
                break;
            //blue
            case 4:
                red35.setBackgroundColor(Color.argb(255, 0, 0, 255));
                B9 = "L";
                break;
            //yellow
            case 5:
                red35.setBackgroundColor(Color.argb(255, 246, 255, 0));
                B9 = "D";
                break;
            default:
                red35Count = -1;
                red35.setBackgroundColor(Color.argb(255, 191, 191, 191));
                B9 = "";
        }
        //Blue when inflates if zoomed view has any value will populate here
        switch (blue36Count) {
            //orange
            case 0:
                blue36.setBackgroundColor(Color.argb(255, 255, 149, 0));
                L1 = "F";
                break;
            //green
            case 1:
                blue36.setBackgroundColor(Color.argb(255, 41, 198, 60));
                L1 = "R";
                break;
            //white
            case 2:
                blue36.setBackgroundColor(Color.argb(255, 255, 255, 255));
                L1 = "U";
                break;
            //red
            case 3:
                blue36.setBackgroundColor(Color.argb(255, 255, 40, 40));
                L1 = "B";
                break;
            //blue
            case 4:
                blue36.setBackgroundColor(Color.argb(255, 0, 0, 255));
                L1 = "L";
                break;
            //yellow
            case 5:
                blue36.setBackgroundColor(Color.argb(255, 246, 255, 0));
                L1 = "D";
                break;
            default:
                blue36Count = -1;
                blue36.setBackgroundColor(Color.argb(255, 191, 191, 191));
                L1 = "";
        }
        switch (blue37Count) {
            //orange
            case 0:
                blue37.setBackgroundColor(Color.argb(255, 255, 149, 0));
                L2 = "F";
                break;
            //green
            case 1:
                blue37.setBackgroundColor(Color.argb(255, 41, 198, 60));
                L2 = "R";
                break;
            //white
            case 2:
                blue37.setBackgroundColor(Color.argb(255, 255, 255, 255));
                L2 = "U";
                break;
            //red
            case 3:
                blue37.setBackgroundColor(Color.argb(255, 255, 40, 40));
                L2 = "B";
                break;
            //blue
            case 4:
                blue37.setBackgroundColor(Color.argb(255, 0, 0, 255));
                L2 = "L";
                break;
            //yellow
            case 5:
                blue37.setBackgroundColor(Color.argb(255, 246, 255, 0));
                L2 = "D";
                break;
            default:
                blue37Count = -1;
                blue37.setBackgroundColor(Color.argb(255, 191, 191, 191));
                L2 = "";
        }
        switch (blue38Count) {
            //orange
            case 0:
                blue38.setBackgroundColor(Color.argb(255, 255, 149, 0));
                L3 = "F";
                break;
            //green
            case 1:
                blue38.setBackgroundColor(Color.argb(255, 41, 198, 60));
                L3 = "R";
                break;
            //white
            case 2:
                blue38.setBackgroundColor(Color.argb(255, 255, 255, 255));
                L3 = "U";
                break;
            //red
            case 3:
                blue38.setBackgroundColor(Color.argb(255, 255, 40, 40));
                L3 = "B";
                break;
            //blue
            case 4:
                blue38.setBackgroundColor(Color.argb(255, 0, 0, 255));
                L3 = "L";
                break;
            //yellow
            case 5:
                blue38.setBackgroundColor(Color.argb(255, 246, 255, 0));
                L3 = "D";
                break;
            default:
                blue38Count = -1;
                blue38.setBackgroundColor(Color.argb(255, 191, 191, 191));
                L3 = "";
        }
        switch (blue39Count) {
            //orange
            case 0:
                blue39.setBackgroundColor(Color.argb(255, 255, 149, 0));
                L4 = "F";
                break;
            //green
            case 1:
                blue39.setBackgroundColor(Color.argb(255, 41, 198, 60));
                L4 = "R";
                break;
            //white
            case 2:
                blue39.setBackgroundColor(Color.argb(255, 255, 255, 255));
                L4 = "U";
                break;
            //red
            case 3:
                blue39.setBackgroundColor(Color.argb(255, 255, 40, 40));
                L4 = "B";
                break;
            //blue
            case 4:
                blue39.setBackgroundColor(Color.argb(255, 0, 0, 255));
                L4 = "L";
                break;
            //yellow
            case 5:
                blue39.setBackgroundColor(Color.argb(255, 246, 255, 0));
                L4 = "D";
                break;
            default:
                blue39Count = -1;
                blue39.setBackgroundColor(Color.argb(255, 191, 191, 191));
                L4 = "";
        }
        switch (blue41Count) {
            //orange
            case 0:
                blue41.setBackgroundColor(Color.argb(255, 255, 149, 0));
                L6 = "F";
                break;
            //green
            case 1:
                blue41.setBackgroundColor(Color.argb(255, 41, 198, 60));
                L6 = "R";
                break;
            //white
            case 2:
                blue41.setBackgroundColor(Color.argb(255, 255, 255, 255));
                L6 = "U";
                break;
            //red
            case 3:
                blue41.setBackgroundColor(Color.argb(255, 255, 40, 40));
                L6 = "B";
                break;
            //blue
            case 4:
                blue41.setBackgroundColor(Color.argb(255, 0, 0, 255));
                L6 = "L";
                break;
            //yellow
            case 5:
                blue41.setBackgroundColor(Color.argb(255, 246, 255, 0));
                L6 = "D";
                break;
            default:
                blue41Count = -1;
                blue41.setBackgroundColor(Color.argb(255, 191, 191, 191));
                L6 = "";
        }
        switch (blue42Count) {
            //orange
            case 0:
                blue42.setBackgroundColor(Color.argb(255, 255, 149, 0));
                L7 = "F";
                break;
            //green
            case 1:
                blue42.setBackgroundColor(Color.argb(255, 41, 198, 60));
                L7 = "R";
                break;
            //white
            case 2:
                blue42.setBackgroundColor(Color.argb(255, 255, 255, 255));
                L7 = "U";
                break;
            //red
            case 3:
                blue42.setBackgroundColor(Color.argb(255, 255, 40, 40));
                L7 = "B";
                break;
            //blue
            case 4:
                blue42.setBackgroundColor(Color.argb(255, 0, 0, 255));
                L7 = "L";
                break;
            //yellow
            case 5:
                blue42.setBackgroundColor(Color.argb(255, 246, 255, 0));
                L7 = "D";
                break;
            default:
                blue42Count = -1;
                blue42.setBackgroundColor(Color.argb(255, 191, 191, 191));
                L7 = "";
        }
        switch (blue43Count) {
            //orange
            case 0:
                blue43.setBackgroundColor(Color.argb(255, 255, 149, 0));
                L8 = "F";
                break;
            //green
            case 1:
                blue43.setBackgroundColor(Color.argb(255, 41, 198, 60));
                L8 = "R";
                break;
            //white
            case 2:
                blue43.setBackgroundColor(Color.argb(255, 255, 255, 255));
                L8 = "U";
                break;
            //red
            case 3:
                blue43.setBackgroundColor(Color.argb(255, 255, 40, 40));
                L8 = "B";
                break;
            //blue
            case 4:
                blue43.setBackgroundColor(Color.argb(255, 0, 0, 255));
                L8 = "L";
                break;
            //yellow
            case 5:
                blue43.setBackgroundColor(Color.argb(255, 246, 255, 0));
                L8 = "D";
                break;
            default:
                blue43Count = -1;
                blue43.setBackgroundColor(Color.argb(255, 191, 191, 191));
                L8 = "";
        }
        switch (blue44Count) {
            //orange
            case 0:
                blue44.setBackgroundColor(Color.argb(255, 255, 149, 0));
                L9 = "F";
                break;
            //green
            case 1:
                blue44.setBackgroundColor(Color.argb(255, 41, 198, 60));
                L9 = "R";
                break;
            //white
            case 2:
                blue44.setBackgroundColor(Color.argb(255, 255, 255, 255));
                L9 = "U";
                break;
            //red
            case 3:
                blue44.setBackgroundColor(Color.argb(255, 255, 40, 40));
                L9 = "B";
                break;
            //blue
            case 4:
                blue44.setBackgroundColor(Color.argb(255, 0, 0, 255));
                L9 = "L";
                break;
            //yellow
            case 5:
                blue44.setBackgroundColor(Color.argb(255, 246, 255, 0));
                L9 = "D";
                break;
            default:
                blue44Count = -1;
                blue44.setBackgroundColor(Color.argb(255, 191, 191, 191));
                L9 = "";
        }
        //Yellow when inflates if zoomed view has any value will populate here
        switch (yellow45Count) {
            //orange
            case 0:
                yellow45.setBackgroundColor(Color.argb(255, 255, 149, 0));
                D1 = "F";
                break;
            //green
            case 1:
                yellow45.setBackgroundColor(Color.argb(255, 41, 198, 60));
                D1 = "R";
                break;
            //white
            case 2:
                yellow45.setBackgroundColor(Color.argb(255, 255, 255, 255));
                D1 = "U";
                break;
            //red
            case 3:
                yellow45.setBackgroundColor(Color.argb(255, 255, 40, 40));
                D1 = "B";
                break;
            //blue
            case 4:
                yellow45.setBackgroundColor(Color.argb(255, 0, 0, 255));
                D1 = "L";
                break;
            //yellow
            case 5:
                yellow45.setBackgroundColor(Color.argb(255, 246, 255, 0));
                D1 = "D";
                break;
            default:
                yellow45Count = -1;
                yellow45.setBackgroundColor(Color.argb(255, 191, 191, 191));
                D1 = "";
        }
        switch (yellow46Count) {
            //orange
            case 0:
                yellow46.setBackgroundColor(Color.argb(255, 255, 149, 0));
                D2 = "F";
                break;
            //green
            case 1:
                yellow46.setBackgroundColor(Color.argb(255, 41, 198, 60));
                D2 = "R";
                break;
            //white
            case 2:
                yellow46.setBackgroundColor(Color.argb(255, 255, 255, 255));
                D2 = "U";
                break;
            //red
            case 3:
                yellow46.setBackgroundColor(Color.argb(255, 255, 40, 40));
                D2 = "B";
                break;
            //blue
            case 4:
                yellow46.setBackgroundColor(Color.argb(255, 0, 0, 255));
                D2 = "L";
                break;
            //yellow
            case 5:
                yellow46.setBackgroundColor(Color.argb(255, 246, 255, 0));
                D2 = "D";
                break;
            default:
                yellow46Count = -1;
                yellow46.setBackgroundColor(Color.argb(255, 191, 191, 191));
                D2 = "";
        }
        switch (yellow47Count) {
            //orange
            case 0:
                yellow47.setBackgroundColor(Color.argb(255, 255, 149, 0));
                D3 = "F";
                break;
            //green
            case 1:
                yellow47.setBackgroundColor(Color.argb(255, 41, 198, 60));
                D3 = "R";
                break;
            //white
            case 2:
                yellow47.setBackgroundColor(Color.argb(255, 255, 255, 255));
                D3 = "U";
                break;
            //red
            case 3:
                yellow47.setBackgroundColor(Color.argb(255, 255, 40, 40));
                D3 = "B";
                break;
            //blue
            case 4:
                yellow47.setBackgroundColor(Color.argb(255, 0, 0, 255));
                D3 = "L";
                break;
            //yellow
            case 5:
                yellow47.setBackgroundColor(Color.argb(255, 246, 255, 0));
                D3 = "D";
                break;
            default:
                yellow47Count = -1;
                yellow47.setBackgroundColor(Color.argb(255, 191, 191, 191));
                D3 = "";
        }
        switch (yellow48Count) {
            //orange
            case 0:
                yellow48.setBackgroundColor(Color.argb(255, 255, 149, 0));
                D4 = "F";
                break;
            //green
            case 1:
                yellow48.setBackgroundColor(Color.argb(255, 41, 198, 60));
                D4 = "R";
                break;
            //white
            case 2:
                yellow48.setBackgroundColor(Color.argb(255, 255, 255, 255));
                D4 = "U";
                break;
            //red
            case 3:
                yellow48.setBackgroundColor(Color.argb(255, 255, 40, 40));
                D4 = "B";
                break;
            //blue
            case 4:
                yellow48.setBackgroundColor(Color.argb(255, 0, 0, 255));
                D4 = "L";
                break;
            //yellow
            case 5:
                yellow48.setBackgroundColor(Color.argb(255, 246, 255, 0));
                D4 = "D";
                break;
            default:
                yellow48Count = -1;
                yellow48.setBackgroundColor(Color.argb(255, 191, 191, 191));
                D4 = "";
        }
        switch (yellow50Count) {
            //orange
            case 0:
                yellow50.setBackgroundColor(Color.argb(255, 255, 149, 0));
                D6 = "F";
                break;
            //green
            case 1:
                yellow50.setBackgroundColor(Color.argb(255, 41, 198, 60));
                D6 = "R";
                break;
            //white
            case 2:
                yellow50.setBackgroundColor(Color.argb(255, 255, 255, 255));
                D6 = "U";
                break;
            //red
            case 3:
                yellow50.setBackgroundColor(Color.argb(255, 255, 40, 40));
                D6 = "B";
                break;
            //blue
            case 4:
                yellow50.setBackgroundColor(Color.argb(255, 0, 0, 255));
                D6 = "L";
                break;
            //yellow
            case 5:
                yellow50.setBackgroundColor(Color.argb(255, 246, 255, 0));
                D6 = "D";
                break;
            default:
                yellow50Count = -1;
                yellow50.setBackgroundColor(Color.argb(255, 191, 191, 191));
                D6 = "";
        }
        switch (yellow51Count) {
            //orange
            case 0:
                yellow51.setBackgroundColor(Color.argb(255, 255, 149, 0));
                D7 = "F";
                break;
            //green
            case 1:
                yellow51.setBackgroundColor(Color.argb(255, 41, 198, 60));
                D7 = "R";
                break;
            //white
            case 2:
                yellow51.setBackgroundColor(Color.argb(255, 255, 255, 255));
                D7 = "U";
                break;
            //red
            case 3:
                yellow51.setBackgroundColor(Color.argb(255, 255, 40, 40));
                D7 = "B";
                break;
            //blue
            case 4:
                yellow51.setBackgroundColor(Color.argb(255, 0, 0, 255));
                D7 = "L";
                break;
            //yellow
            case 5:
                yellow51.setBackgroundColor(Color.argb(255, 246, 255, 0));
                D7 = "D";
                break;
            default:
                yellow51Count = -1;
                yellow51.setBackgroundColor(Color.argb(255, 191, 191, 191));
                D7 = "";
        }
        switch (yellow52Count) {
            //orange
            case 0:
                yellow52.setBackgroundColor(Color.argb(255, 255, 149, 0));
                D8 = "F";
                break;
            //green
            case 1:
                yellow52.setBackgroundColor(Color.argb(255, 41, 198, 60));
                D8 = "R";
                break;
            //white
            case 2:
                yellow52.setBackgroundColor(Color.argb(255, 255, 255, 255));
                D8 = "U";
                break;
            //red
            case 3:
                yellow52.setBackgroundColor(Color.argb(255, 255, 40, 40));
                D8 = "B";
                break;
            //blue
            case 4:
                yellow52.setBackgroundColor(Color.argb(255, 0, 0, 255));
                D8 = "L";
                break;
            //yellow
            case 5:
                yellow52.setBackgroundColor(Color.argb(255, 246, 255, 0));
                D8 = "D";
                break;
            default:
                yellow52Count = -1;
                yellow52.setBackgroundColor(Color.argb(255, 191, 191, 191));
                D8 = "";
        }
        switch (yellow53Count) {
            //orange
            case 0:
                yellow53.setBackgroundColor(Color.argb(255, 255, 149, 0));
                D9 = "F";
                break;
            //green
            case 1:
                yellow53.setBackgroundColor(Color.argb(255, 41, 198, 60));
                D9 = "R";
                break;
            //white
            case 2:
                yellow53.setBackgroundColor(Color.argb(255, 255, 255, 255));
                D9 = "U";
                break;
            //red
            case 3:
                yellow53.setBackgroundColor(Color.argb(255, 255, 40, 40));
                D9 = "B";
                break;
            //blue
            case 4:
                yellow53.setBackgroundColor(Color.argb(255, 0, 0, 255));
                D9 = "L";
                break;
            //yellow
            case 5:
                yellow53.setBackgroundColor(Color.argb(255, 246, 255, 0));
                D9 = "D";
                break;
            default:
                yellow53Count = -1;
                yellow53.setBackgroundColor(Color.argb(255, 191, 191, 191));
                D9 = "";
        }
    }

    public UserCubeInputView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    //Solve button and reset click
    @OnClick(R.id.solveButton)
    public void solveCube() {


        
        progressSpinner.setVisibility(VISIBLE);

        allCubiesAdded = (
                // Add the Orange
                    orange0Count + orange1Count + orange2Count + orange3Count +
                    orange4Count + orange5Count + orange6Count + orange7Count + orange8Count +
                // Add the Green
                    green9Count + green10Count + green11Count + green12Count + green13Count +
                    green14Count + green15Count + green16Count + green17Count +
                // Add the White
                    white18Count + white19Count + white20Count + white21Count + white22Count +
                    white23Count + white24Count + white25Count + white26Count +
                // Add the Red
                    red27Count + red28Count + red29Count +
                    red30Count + red31Count + red32Count + red33Count + red34Count + red35Count +
                // Add the Blue
                    blue36Count + blue37Count + blue38Count + blue39Count + blue40Count + blue41Count +
                    blue42Count + blue43Count + blue44Count +
                // Add the Yellow
                    yellow45Count + yellow46Count + yellow47Count + yellow48Count + yellow49Count +
                    yellow50Count + yellow51Count + yellow52Count + yellow53Count);

        String mixCube =
                        U1 + U2 + U3 + U4 + U5 + U6 + U7 + U8 + U9 +
                        R1 + R2 + R3 + R4 + R5 + R6 + R7 + R8 + R9 +
                        F1 + F2 + F3 + F4 + F5 + F6 + F7 + F8 + F9 +
                        D1 + D2 + D3 + D4 + D5 + D6 + D7 + D8 + D9 +
                        L1 + L2 + L3 + L4 + L5 + L6 + L7 + L8 + L9 +
                        B1 + B2 + B3 + B4 + B5 + B6 + B7 + B8 + B9;

        Log.d(">>>>>>>>", String.valueOf(allCubiesAdded));

//TestCube

//        String mixCube = "LLFRURLUUFBRBRRRLRDFLUFDDUDLLBFDBUFFBUBDLBRDFUFUDBLDRB";
//        allCubiesAdded = 135;

        // If all cubies combined equals 135 then it will show a progress bar and solve once
        // algorithm is filled in.
        if (allCubiesAdded == 135) {
            String ans = solution(mixCube, 21, 10, false);
            splitRub = ans.split("\\s+");

            resetButton.setEnabled(false);
            solveButton.setEnabled(false);

            Log.d("mixCube", mixCube);
            Log.d("ans", ans);
            Log.d("splitRub", String.valueOf(splitRub));//[Error,8]

            Flow flow = RubricsCubeApplication.getMainFlow();
            History newHistory = flow.getHistory().buildUpon().push(new SolutionStage()).build();

            flow.setHistory(newHistory, Flow.Direction.FORWARD);


        } else {
            progressSpinner.setVisibility(GONE);
            Toast.makeText(context, (getContext().getString(R.string.cube_error)), Toast.LENGTH_LONG).show();

        }
    }


    @OnClick(R.id.resetButton)
    public void resetCube() {
        //Orange integers. Orange color value = 0
        orange0Count = -1;
        orange0.setBackgroundColor(Color.argb(255, 191, 191, 191));
        orange1Count = -1;
        orange1.setBackgroundColor(Color.argb(255, 191, 191, 191));
        orange2Count = -1;
        orange2.setBackgroundColor(Color.argb(255, 191, 191, 191));
        orange3Count = -1;
        orange3.setBackgroundColor(Color.argb(255, 191, 191, 191));
        //Int representing center square is already set to color value.
        orange5Count = -1;
        orange5.setBackgroundColor(Color.argb(255, 191, 191, 191));
        orange6Count = -1;
        orange6.setBackgroundColor(Color.argb(255, 191, 191, 191));
        orange7Count = -1;
        orange7.setBackgroundColor(Color.argb(255, 191, 191, 191));
        orange8Count = -1;
        orange8.setBackgroundColor(Color.argb(255, 191, 191, 191));
        //Green integers. Green color value = 1
        green9Count = -1;
        green9.setBackgroundColor(Color.argb(255, 191, 191, 191));
        green10Count = -1;
        green10.setBackgroundColor(Color.argb(255, 191, 191, 191));
        green11Count = -1;
        green11.setBackgroundColor(Color.argb(255, 191, 191, 191));
        green12Count = -1;
        green12.setBackgroundColor(Color.argb(255, 191, 191, 191));
        //Int representing center square is already set to color value.
        green14Count = -1;
        green14.setBackgroundColor(Color.argb(255, 191, 191, 191));
        green15Count = -1;
        green15.setBackgroundColor(Color.argb(255, 191, 191, 191));
        green16Count = -1;
        green16.setBackgroundColor(Color.argb(255, 191, 191, 191));
        green17Count = -1;
        green17.setBackgroundColor(Color.argb(255, 191, 191, 191));
        //White integers. White color value = 2
        white18Count = -1;
        white18.setBackgroundColor(Color.argb(255, 191, 191, 191));
        white19Count = -1;
        white19.setBackgroundColor(Color.argb(255, 191, 191, 191));
        white20Count = -1;
        white20.setBackgroundColor(Color.argb(255, 191, 191, 191));
        white21Count = -1;
        white21.setBackgroundColor(Color.argb(255, 191, 191, 191));
        //Int representing center square is already set to color value.
        white23Count = -1;
        white23.setBackgroundColor(Color.argb(255, 191, 191, 191));
        white24Count = -1;
        white24.setBackgroundColor(Color.argb(255, 191, 191, 191));
        white25Count = -1;
        white25.setBackgroundColor(Color.argb(255, 191, 191, 191));
        white26Count = -1;
        white26.setBackgroundColor(Color.argb(255, 191, 191, 191));
        //Red integers. Red color value = 3
        red27Count = -1;
        red27.setBackgroundColor(Color.argb(255, 191, 191, 191));
        red28Count = -1;
        red28.setBackgroundColor(Color.argb(255, 191, 191, 191));
        red29Count = -1;
        red29.setBackgroundColor(Color.argb(255, 191, 191, 191));
        red30Count = -1;
        red30.setBackgroundColor(Color.argb(255, 191, 191, 191));
        //Int representing center square is already set to color value.
        red32Count = -1;
        red32.setBackgroundColor(Color.argb(255, 191, 191, 191));
        red33Count = -1;
        red33.setBackgroundColor(Color.argb(255, 191, 191, 191));
        red34Count = -1;
        red34.setBackgroundColor(Color.argb(255, 191, 191, 191));
        red35Count = -1;
        red35.setBackgroundColor(Color.argb(255, 191, 191, 191));
        //Blue integers. Blue color value = 4
        blue36Count = -1;
        blue36.setBackgroundColor(Color.argb(255, 191, 191, 191));
        blue37Count = -1;
        blue37.setBackgroundColor(Color.argb(255, 191, 191, 191));
        blue38Count = -1;
        blue38.setBackgroundColor(Color.argb(255, 191, 191, 191));
        blue39Count = -1;
        blue39.setBackgroundColor(Color.argb(255, 191, 191, 191));
        //Int representing center square is already set to color value.
        blue41Count = -1;
        blue41.setBackgroundColor(Color.argb(255, 191, 191, 191));
        blue42Count = -1;
        blue42.setBackgroundColor(Color.argb(255, 191, 191, 191));
        blue43Count = -1;
        blue43.setBackgroundColor(Color.argb(255, 191, 191, 191));
        blue44Count = -1;
        blue44.setBackgroundColor(Color.argb(255, 191, 191, 191));
        //Yellow integers. Yellow color value = 5
        yellow45Count = -1;
        yellow45.setBackgroundColor(Color.argb(255, 191, 191, 191));
        yellow46Count = -1;
        yellow46.setBackgroundColor(Color.argb(255, 191, 191, 191));
        yellow47Count = -1;
        yellow47.setBackgroundColor(Color.argb(255, 191, 191, 191));
        yellow48Count = -1;
        yellow48.setBackgroundColor(Color.argb(255, 191, 191, 191));
        //Int representing center square is already set to color value.
        yellow50Count = -1;
        yellow50.setBackgroundColor(Color.argb(255, 191, 191, 191));
        yellow51Count = -1;
        yellow51.setBackgroundColor(Color.argb(255, 191, 191, 191));
        yellow52Count = -1;
        yellow52.setBackgroundColor(Color.argb(255, 191, 191, 191));
        yellow53Count = -1;
        yellow53.setBackgroundColor(Color.argb(255, 191, 191, 191));

        //Orange Face Strings.
        F1 = "";
        F2 = "";
        F3 = "";
        F4 = "";
        //String face center automatically has value F.
        F6 = "";
        F7 = "";
        F8 = "";
        F9 = "";

        //Green Face String.
        R1 = "";
        R2 = "";
        R3 = "";
        R4 = "";
        //String face center automatically has value R.
        R6 = "";
        R7 = "";
        R8 = "";
        R9 = "";

        //White Face String.
        U1 = "";
        U2 = "";
        U3 = "";
        U4 = "";
        //String face center automatically has value U.
        U6 = "";
        U7 = "";
        U8 = "";
        U9 = "";

        //Red Face String.
        B1 = "";
        B2 = "";
        B3 = "";
        B4 = "";
        //String face center automatically has value B.
        B6 = "";
        B7 = "";
        B8 = "";
        B9 = "";

        //Blue face String.
        L1 = "";
        L2 = "";
        L3 = "";
        L4 = "";
        //String face center automatically has value L.
        L6 = "";
        L7 = "";
        L8 = "";
        L9 = "";

        //Yellow face String.
        D1 = "";
        D2 = "";
        D3 = "";
        D4 = "";
        //String face center automatically has value D.
        D6 = "";
        D7 = "";
        D8 = "";
        D9 = "";
    }

    //Buttons for User cube set up in numeric order Orange 0 - Yellow 53
    //Leaving buttons for center for future additions (click center cube and inflate)
    //Orange
    @OnClick(R.id.orange0)
    public void orange0() {
        orange0Count++;
        if (orange0Count < 6) {
            switch (orange0Count) {
                //orange
                case 0:
                    orange0.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    F1 = "F";
                    break;
                //green
                case 1:
                    orange0.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    F1 = "R";
                    break;
                //white
                case 2:
                    orange0.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    F1 = "U";
                    break;
                //red
                case 3:
                    orange0.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    F1 = "B";
                    break;
                //blue
                case 4:
                    orange0.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    F1 = "L";
                    break;
                //yellow
                case 5:
                    orange0.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    F1 = "D";
                    break;
            }
        } else {
            orange0Count = -1;
            orange0.setBackgroundColor(Color.argb(255, 191, 191, 191));
            F1 = "";
        }
    }

    @OnClick(R.id.orange1)
    public void orange1() {
        orange1Count++;
        if (orange1Count < 6) {
            switch (orange1Count) {
                //orange
                case 0:
                    orange1.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    F2 = "F";
                    break;
                //green
                case 1:
                    orange1.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    F2 = "R";
                    break;
                //white
                case 2:
                    orange1.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    F2 = "U";
                    break;
                //red
                case 3:
                    orange1.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    F2 = "B";
                    break;
                //blue
                case 4:
                    orange1.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    F2 = "L";
                    break;
                //yellow
                case 5:
                    orange1.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    F2 = "D";
                    break;
            }
        } else {
            orange1Count = -1;
            orange1.setBackgroundColor(Color.argb(255, 191, 191, 191));
            F2 = "";
        }
    }

    @OnClick(R.id.orange2)
    public void orange2() {
        orange2Count++;
        if (orange2Count < 6) {
            switch (orange2Count) {
                //orange
                case 0:
                    orange2.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    F3 = "F";
                    break;
                //green
                case 1:
                    orange2.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    F3 = "R";
                    break;
                //white
                case 2:
                    orange2.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    F3 = "U";
                    break;
                //red
                case 3:
                    orange2.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    F3 = "B";
                    break;
                //blue
                case 4:
                    orange2.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    F3 = "L";
                    break;
                //yellow
                case 5:
                    orange2.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    F3 = "D";
                    break;
            }
        } else {
            orange2Count = -1;
            orange2.setBackgroundColor(Color.argb(255, 191, 191, 191));
            F3 = "";
        }
    }

    @OnClick(R.id.orange3)
    public void orange3() {
        orange3Count++;
        if (orange3Count < 6) {
            switch (orange3Count) {
                //orange
                case 0:
                    orange3.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    F4 = "F";
                    break;
                //green
                case 1:
                    orange3.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    F4 = "R";
                    break;
                //white
                case 2:
                    orange3.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    F4 = "U";
                    break;
                //red
                case 3:
                    orange3.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    F4 = "B";
                    break;
                //blue
                case 4:
                    orange3.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    F4 = "L";
                    break;
                //yellow
                case 5:
                    orange3.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    F4 = "D";
                    break;
            }
        } else {
            orange3Count = -1;
            orange3.setBackgroundColor(Color.argb(255, 191, 191, 191));
            F4 = "";
        }
    }

    //Orange face center button. Created button for future utility. String should always be F.
    @OnClick(R.id.orange4)
    public void orange4() {
        //STRING F5 = F;
        Flow flow = RubricsCubeApplication.getMainFlow();
        History newHistory = flow.getHistory().buildUpon()
                .push(new OrangeFaceInputStage())
                .build();
        flow.setHistory(newHistory, Flow.Direction.REPLACE);

    }

    @OnClick(R.id.orange5)
    public void orange5() {
        orange5Count++;
        if (orange5Count < 6) {
            switch (orange5Count) {
                //orange
                case 0:
                    orange5.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    F6 = "F";
                    break;
                //green
                case 1:
                    orange5.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    F6 = "R";
                    break;
                //white
                case 2:
                    orange5.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    F6 = "U";
                    break;
                //red
                case 3:
                    orange5.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    F6 = "B";
                    break;
                //blue
                case 4:
                    orange5.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    F6 = "L";
                    break;
                //yellow
                case 5:
                    orange5.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    F6 = "D";
                    break;
            }
        } else {
            orange5Count = -1;
            orange5.setBackgroundColor(Color.argb(255, 191, 191, 191));
            F6 = "";
        }
    }

    @OnClick(R.id.orange6)
    public void orange6() {
        orange6Count++;
        if (orange6Count < 6) {
            switch (orange6Count) {
                //orange
                case 0:
                    orange6.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    F7 = "F";
                    break;
                //green
                case 1:
                    orange6.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    F7 = "R";
                    break;
                //white
                case 2:
                    orange6.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    F7 = "U";
                    break;
                //red
                case 3:
                    orange6.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    F7 = "B";
                    break;
                //blue
                case 4:
                    orange6.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    F7 = "L";
                    break;
                //yellow
                case 5:
                    orange6.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    F7 = "D";
                    break;
            }
        } else {
            orange6Count = -1;
            orange6.setBackgroundColor(Color.argb(255, 191, 191, 191));
            F7 = "";
        }
    }

    @OnClick(R.id.orange7)
    public void orange7() {
        orange7Count++;
        if (orange7Count < 6) {
            switch (orange7Count) {
                //orange
                case 0:
                    orange7.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    F8 = "F";
                    break;
                //green
                case 1:
                    orange7.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    F8 = "R";
                    break;
                //white
                case 2:
                    orange7.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    F8 = "U";
                    break;
                //red
                case 3:
                    orange7.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    F8 = "B";
                    break;
                //blue
                case 4:
                    orange7.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    F8 = "L";
                    break;
                //yellow
                case 5:
                    orange7.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    F8 = "D";
                    break;
            }
        } else {
            orange7Count = -1;
            orange7.setBackgroundColor(Color.argb(255, 191, 191, 191));
            F8 = "";
        }
    }

    @OnClick(R.id.orange8)
    public void orange8() {
        orange8Count++;
        if (orange8Count < 6) {
            switch (orange8Count) {
                //orange
                case 0:
                    orange8.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    F9 = "F";
                    break;
                //green
                case 1:
                    orange8.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    F9 = "R";
                    break;
                //white
                case 2:
                    orange8.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    F9 = "U";
                    break;
                //red
                case 3:
                    orange8.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    F9 = "B";
                    break;
                //blue
                case 4:
                    orange8.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    F9 = "L";
                    break;
                //yellow
                case 5:
                    orange8.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    F9 = "D";
                    break;
            }
        } else {
            orange8Count = -1;
            orange8.setBackgroundColor(Color.argb(255, 191, 191, 191));
            F9 = "";
        }
    }

    //Green
    @OnClick(R.id.green9)
    public void green9() {
        green9Count++;
        if (green9Count < 6) {
            switch (green9Count) {
                //orange
                case 0:
                    green9.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    R1 = "F";
                    break;
                //green
                case 1:
                    green9.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    R1 = "R";
                    break;
                //white
                case 2:
                    green9.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    R1 = "U";
                    break;
                //red
                case 3:
                    green9.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    R1 = "B";
                    break;
                //blue
                case 4:
                    green9.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    R1 = "L";
                    break;
                //yellow
                case 5:
                    green9.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    R1 = "D";
                    break;
            }
        } else {
            green9Count = -1;
            green9.setBackgroundColor(Color.argb(255, 191, 191, 191));
            R1 = "";
        }
    }

    @OnClick(R.id.green10)
    public void green10() {
        green10Count++;
        if (green10Count < 6) {
            switch (green10Count) {
                //orange
                case 0:
                    green10.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    R2 = "F";
                    break;
                //green
                case 1:
                    green10.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    R2 = "R";
                    break;
                //white
                case 2:
                    green10.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    R2 = "U";
                    break;
                //red
                case 3:
                    green10.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    R2 = "B";
                    break;
                //blue
                case 4:
                    green10.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    R2 = "L";
                    break;
                //yellow
                case 5:
                    green10.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    R2 = "D";
                    break;
            }
        } else {
            green10Count = -1;
            green10.setBackgroundColor(Color.argb(255, 191, 191, 191));
            R2 = "";
        }
    }

    @OnClick(R.id.green11)
    public void green11() {
        green11Count++;
        if (green11Count < 6) {
            switch (green11Count) {
                //orange
                case 0:
                    green11.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    R3 = "F";
                    break;
                //green
                case 1:
                    green11.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    R3 = "R";
                    break;
                //white
                case 2:
                    green11.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    R3 = "U";
                    break;
                //red
                case 3:
                    green11.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    R3 = "B";
                    break;
                //blue
                case 4:
                    green11.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    R3 = "L";
                    break;
                //yellow
                case 5:
                    green11.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    R3 = "D";
                    break;
            }
        } else {
            green11Count = -1;
            green11.setBackgroundColor(Color.argb(255, 191, 191, 191));
            R3 = "";
        }
    }

    @OnClick(R.id.green12)
    public void green12() {
        green12Count++;
        if (green12Count < 6) {
            switch (green12Count) {
                //orange
                case 0:
                    green12.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    R4 = "F";
                    break;
                //green
                case 1:
                    green12.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    R4 = "R";
                    break;
                //white
                case 2:
                    green12.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    R4 = "U";
                    break;
                //red
                case 3:
                    green12.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    R4 = "B";
                    break;
                //blue
                case 4:
                    green12.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    R4 = "L";
                    break;
                //yellow
                case 5:
                    green12.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    R4 = "D";
                    break;
            }
        } else {
            green12Count = -1;
            green12.setBackgroundColor(Color.argb(255, 191, 191, 191));
            R4 = "";
        }
    }

    //GREEN CENTER BUTTON FOR FUTURE USE. STRING VALUE SHOULD BE R;
    @OnClick(R.id.green13)
    public void green13() {
        //R5 = "R";
        Flow flow = RubricsCubeApplication.getMainFlow();
        History newHistory = flow.getHistory().buildUpon()
                .push(new GreenFaceInputStage())
                .build();
        flow.setHistory(newHistory, Flow.Direction.REPLACE);

    }

    @OnClick(R.id.green14)
    public void green14() {
        green14Count++;
        if (green14Count < 6) {
            switch (green14Count) {
                //orange
                case 0:
                    green14.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    R6 = "F";
                    break;
                //green
                case 1:
                    green14.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    R6 = "R";
                    break;
                //white
                case 2:
                    green14.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    R6 = "U";
                    break;
                //red
                case 3:
                    green14.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    R6 = "B";
                    break;
                //blue
                case 4:
                    green14.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    R6 = "L";
                    break;
                //yellow
                case 5:
                    green14.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    R6 = "D";
                    break;
            }
        } else {
            green14Count = -1;
            green14.setBackgroundColor(Color.argb(255, 191, 191, 191));
            R6 = "";
        }
    }

    @OnClick(R.id.green15)
    public void green15() {
        green15Count++;
        if (green15Count < 6) {
            switch (green15Count) {
                //orange
                case 0:
                    green15.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    R7 = "F";
                    break;
                //green
                case 1:
                    green15.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    R7 = "R";
                    break;
                //white
                case 2:
                    green15.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    R7 = "U";
                    break;
                //red
                case 3:
                    green15.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    R7 = "B";
                    break;
                //blue
                case 4:
                    green15.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    R7 = "L";
                    break;
                //yellow
                case 5:
                    green15.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    R7 = "D";
                    break;
            }
        } else {
            green15Count = -1;
            green15.setBackgroundColor(Color.argb(255, 191, 191, 191));
            R7 = "";
        }
    }

    @OnClick(R.id.green16)
    public void green16() {
        green16Count++;
        if (green16Count < 6) {
            switch (green16Count) {
                //orange
                case 0:
                    green16.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    R8 = "F";
                    break;
                //green
                case 1:
                    green16.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    R8 = "R";
                    break;
                //white
                case 2:
                    green16.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    R8 = "U";
                    break;
                //red
                case 3:
                    green16.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    R8 = "B";
                    break;
                //blue
                case 4:
                    green16.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    R8 = "L";
                    break;
                //yellow
                case 5:
                    green16.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    R8 = "D";
                    break;
            }
        } else {
            green16Count = -1;
            green16.setBackgroundColor(Color.argb(255, 191, 191, 191));
            R8 = "";
        }
    }

    @OnClick(R.id.green17)
    public void green17() {
        green17Count++;
        if (green17Count < 6) {
            switch (green17Count) {
                //orange
                case 0:
                    green17.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    R9 = "F";
                    break;
                //green
                case 1:
                    green17.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    R9 = "R";
                    break;
                //white
                case 2:
                    green17.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    R9 = "U";
                    break;
                //red
                case 3:
                    green17.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    R9 = "B";
                    break;
                //blue
                case 4:
                    green17.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    R9 = "L";
                    break;
                //yellow
                case 5:
                    green17.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    R9 = "D";
                    break;
            }
        } else {
            green17Count = -1;
            green17.setBackgroundColor(Color.argb(255, 191, 191, 191));
            R9 = "";
        }
    }

    //White
    @OnClick(R.id.white18)
    public void white18() {
        white18Count++;
        if (white18Count < 6) {
            switch (white18Count) {
                //orange
                case 0:
                    white18.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    U1 = "F";
                    break;
                //green
                case 1:
                    white18.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    U1 = "R";
                    break;
                //white
                case 2:
                    white18.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    U1 = "U";
                    break;
                //red
                case 3:
                    white18.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    U1 = "B";
                    break;
                //blue
                case 4:
                    white18.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    U1 = "L";
                    break;
                //yellow
                case 5:
                    white18.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    U1 = "D";
                    break;
            }
        } else {
            white18Count = -1;
            white18.setBackgroundColor(Color.argb(255, 191, 191, 191));
            U1 = "";
        }
    }

    @OnClick(R.id.white19)
    public void white19() {
        white19Count++;
        if (white19Count < 6) {
            switch (white19Count) {
                //orange
                case 0:
                    white19.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    U2 = "F";
                    break;
                //green
                case 1:
                    white19.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    U2 = "R";
                    break;
                //white
                case 2:
                    white19.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    U2 = "U";
                    break;
                //red
                case 3:
                    white19.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    U2 = "B";
                    break;
                //blue
                case 4:
                    white19.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    U2 = "L";
                    break;
                //yellow
                case 5:
                    white19.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    U2 = "D";
                    break;
            }
        } else {
            white19Count = -1;
            white19.setBackgroundColor(Color.argb(255, 191, 191, 191));
            U2 = "";
        }
    }

    @OnClick(R.id.white20)
    public void white20() {
        white20Count++;
        if (white20Count < 6) {
            switch (white20Count) {
                //orange
                case 0:
                    white20.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    U3 = "F";
                    break;
                //green
                case 1:
                    white20.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    U3 = "R";
                    break;
                //white
                case 2:
                    white20.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    U3 = "U";
                    break;
                //red
                case 3:
                    white20.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    U3 = "B";
                    break;
                //blue
                case 4:
                    white20.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    U3 = "L";
                    break;
                //yellow
                case 5:
                    white20.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    U3 = "D";
                    break;
            }
        } else {
            white20Count = -1;
            white20.setBackgroundColor(Color.argb(255, 191, 191, 191));
            U3 = "";
        }
    }

    @OnClick(R.id.white21)
    public void white21() {
        white21Count++;
        if (white21Count < 6) {
            switch (white21Count) {
                //orange
                case 0:
                    white21.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    U4 = "F";
                    break;
                //green
                case 1:
                    white21.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    U4 = "R";
                    break;
                //white
                case 2:
                    white21.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    U4 = "U";
                    break;
                //red
                case 3:
                    white21.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    U4 = "B";
                    break;
                //blue
                case 4:
                    white21.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    U4 = "L";
                    break;
                //yellow
                case 5:
                    white21.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    U4 = "D";
                    break;
            }
        } else {
            white21Count = -1;
            white21.setBackgroundColor(Color.argb(255, 191, 191, 191));
            U4 = "";
        }
    }

    @OnClick(R.id.white22)
    public void white22() {
        //U5 = "F";
        Flow flow = RubricsCubeApplication.getMainFlow();
        History newHistory = flow.getHistory().buildUpon()
                .push(new WhiteFaceInputStage())
                .build();
        flow.setHistory(newHistory, Flow.Direction.REPLACE);

    }

    @OnClick(R.id.white23)
    public void white23() {
        white23Count++;
        if (white23Count < 6) {
            switch (white23Count) {
                //orange
                case 0:
                    white23.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    U6 = "F";
                    break;
                //green
                case 1:
                    white23.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    U6 = "R";
                    break;
                //white
                case 2:
                    white23.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    U6 = "U";
                    break;
                //red
                case 3:
                    white23.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    U6 = "B";
                    break;
                //blue
                case 4:
                    white23.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    U6 = "L";
                    break;
                //yellow
                case 5:
                    white23.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    U6 = "D";
                    break;
            }
        } else {
            white23Count = -1;
            white23.setBackgroundColor(Color.argb(255, 191, 191, 191));
            U6 = "";
        }
    }

    @OnClick(R.id.white24)
    public void white24() {
        white24Count++;
        if (white24Count < 6) {
            switch (white24Count) {
                //orange
                case 0:
                    white24.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    U7 = "F";
                    break;
                //green
                case 1:
                    white24.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    U7 = "R";
                    break;
                //white
                case 2:
                    white24.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    U7 = "U";
                    break;
                //red
                case 3:
                    white24.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    U7 = "B";
                    break;
                //blue
                case 4:
                    white24.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    U7 = "L";
                    break;
                //yellow
                case 5:
                    white24.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    U7 = "D";
                    break;
            }
        } else {
            white24Count = -1;
            white24.setBackgroundColor(Color.argb(255, 191, 191, 191));
            U7 = "";
        }
    }

    @OnClick(R.id.white25)
    public void white25() {
        white25Count++;
        if (white25Count < 6) {
            switch (white25Count) {
                //orange
                case 0:
                    white25.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    U8 = "F";
                    break;
                //green
                case 1:
                    white25.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    U8 = "R";
                    break;
                //white
                case 2:
                    white25.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    U8 = "U";
                    break;
                //red
                case 3:
                    white25.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    U8 = "B";
                    break;
                //blue
                case 4:
                    white25.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    U8 = "L";
                    break;
                //yellow
                case 5:
                    white25.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    U8 = "D";
                    break;
            }
        } else {
            white25Count = -1;
            white25.setBackgroundColor(Color.argb(255, 191, 191, 191));
            U8 = "";
        }
    }

    @OnClick(R.id.white26)
    public void white26() {
        white26Count++;
        if (white26Count < 6) {
            switch (white26Count) {
                //orange
                case 0:
                    white26.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    U9 = "F";
                    break;
                //green
                case 1:
                    white26.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    U9 = "R";
                    break;
                //white
                case 2:
                    white26.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    U9 = "U";
                    break;
                //red
                case 3:
                    white26.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    U9 = "B";
                    break;
                //blue
                case 4:
                    white26.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    U9 = "L";
                    break;
                //yellow
                case 5:
                    white26.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    U9 = "D";
                    break;
            }
        } else {
            white26Count = -1;
            white26.setBackgroundColor(Color.argb(255, 191, 191, 191));
            U9 = "";
        }
    }

    //Red
    @OnClick(R.id.red27)
    public void red27() {
        red27Count++;
        if (red27Count < 6) {
            switch (red27Count) {
                //orange
                case 0:
                    red27.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    B1 = "F";
                    break;
                //green
                case 1:
                    red27.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    B1 = "R";
                    break;
                //white
                case 2:
                    red27.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    B1 = "U";
                    break;
                //red
                case 3:
                    red27.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    B1 = "B";
                    break;
                //blue
                case 4:
                    red27.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    B1 = "L";
                    break;
                //yellow
                case 5:
                    red27.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    B1 = "D";
                    break;
            }
        } else {
            red27Count = -1;
            red27.setBackgroundColor(Color.argb(255, 191, 191, 191));
            B1 = "";
        }
    }

    @OnClick(R.id.red28)
    public void red28() {
        red28Count++;
        if (red28Count < 6) {
            switch (red28Count) {
                //orange
                case 0:
                    red28.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    B2 = "F";
                    break;
                //green
                case 1:
                    red28.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    B2 = "R";
                    break;
                //white
                case 2:
                    red28.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    B2 = "U";
                    break;
                //red
                case 3:
                    red28.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    B2 = "B";
                    break;
                //blue
                case 4:
                    red28.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    B2 = "L";
                    break;
                //yellow
                case 5:
                    red28.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    B2 = "D";
                    break;
            }
        } else {
            red28Count = -1;
            red28.setBackgroundColor(Color.argb(255, 191, 191, 191));
            B2 = "";
        }
    }

    @OnClick(R.id.red29)
    public void red29() {
        red29Count++;
        if (red29Count < 6) {
            switch (red29Count) {
                //orange
                case 0:
                    red29.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    B3 = "F";
                    break;
                //green
                case 1:
                    red29.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    B3 = "R";
                    break;
                //white
                case 2:
                    red29.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    B3 = "U";
                    break;
                //red
                case 3:
                    red29.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    B3 = "B";
                    break;
                //blue
                case 4:
                    red29.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    B3 = "L";
                    break;
                //yellow
                case 5:
                    red29.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    B3 = "D";
                    break;
            }
        } else {
            red29Count = -1;
            red29.setBackgroundColor(Color.argb(255, 191, 191, 191));
            B3 = "";
        }
    }

    @OnClick(R.id.red30)
    public void red30() {
        red30Count++;
        if (red30Count < 6) {
            switch (red30Count) {
                //orange
                case 0:
                    red30.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    B4 = "F";
                    break;
                //green
                case 1:
                    red30.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    B4 = "R";
                    break;
                //white
                case 2:
                    red30.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    B4 = "U";
                    break;
                //red
                case 3:
                    red30.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    B4 = "B";
                    break;
                //blue
                case 4:
                    red30.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    B4 = "L";
                    break;
                //yellow
                case 5:
                    red30.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    B4 = "D";
                    break;
            }
        } else {
            red30Count = -1;
            red30.setBackgroundColor(Color.argb(255, 191, 191, 191));
            B4 = "";
        }
    }

    @OnClick(R.id.red31)
    public void red31() {
        //B5 = "F";
        Flow flow = RubricsCubeApplication.getMainFlow();
        History newHistory = flow.getHistory().buildUpon()
                .push(new RedFaceInputStage())
                .build();
        flow.setHistory(newHistory, Flow.Direction.REPLACE);

    }

    @OnClick(R.id.red32)
    public void red32() {
        red32Count++;
        if (red32Count < 6) {
            switch (red32Count) {
                //orange
                case 0:
                    red32.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    B6 = "F";
                    break;
                //green
                case 1:
                    red32.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    B6 = "R";
                    break;
                //white
                case 2:
                    red32.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    B6 = "U";
                    break;
                //red
                case 3:
                    red32.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    B6 = "B";
                    break;
                //blue
                case 4:
                    red32.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    B6 = "L";
                    break;
                //yellow
                case 5:
                    red32.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    B6 = "D";
                    break;
            }
        } else {
            red32Count = -1;
            red32.setBackgroundColor(Color.argb(255, 191, 191, 191));
            B6 = "";
        }
    }

    @OnClick(R.id.red33)
    public void red33() {
        red33Count++;
        if (red33Count < 6) {
            switch (red33Count) {
                //orange
                case 0:
                    red33.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    B7 = "F";
                    break;
                //green
                case 1:
                    red33.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    B7 = "R";
                    break;
                //white
                case 2:
                    red33.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    B7 = "U";
                    break;
                //red
                case 3:
                    red33.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    B7 = "B";
                    break;
                //blue
                case 4:
                    red33.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    B7 = "L";
                    break;
                //yellow
                case 5:
                    red33.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    B7 = "D";
                    break;
            }
        } else {
            red33Count = -1;
            red33.setBackgroundColor(Color.argb(255, 191, 191, 191));
            B7 = "";
        }
    }

    @OnClick(R.id.red34)
    public void red34() {
        red34Count++;
        if (red34Count < 6) {
            switch (red34Count) {
                //orange
                case 0:
                    red34.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    B8 = "F";
                    break;
                //green
                case 1:
                    red34.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    B8 = "R";
                    break;
                //white
                case 2:
                    red34.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    B8 = "U";
                    break;
                //red
                case 3:
                    red34.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    B8 = "B";
                    break;
                //blue
                case 4:
                    red34.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    B8 = "L";
                    break;
                //yellow
                case 5:
                    red34.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    B8 = "D";
                    break;
            }
        } else {
            red34Count = -1;
            red34.setBackgroundColor(Color.argb(255, 191, 191, 191));
            B8 = "";
        }
    }

    @OnClick(R.id.red35)
    public void red35() {
        red35Count++;
        if (red35Count < 6) {
            switch (red35Count) {
                //orange
                case 0:
                    red35.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    B9 = "F";
                    break;
                //green
                case 1:
                    red35.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    B9 = "R";
                    break;
                //white
                case 2:
                    red35.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    B9 = "U";
                    break;
                //red
                case 3:
                    red35.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    B9 = "B";
                    break;
                //blue
                case 4:
                    red35.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    B9 = "L";
                    break;
                //yellow
                case 5:
                    red35.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    B9 = "D";
                    break;
            }
        } else {
            red35Count = -1;
            red35.setBackgroundColor(Color.argb(255, 191, 191, 191));
            B9 = "";
        }
    }

    //Blue
    @OnClick(R.id.blue36)
    public void blue36() {
        blue36Count++;
        if (blue36Count < 6) {
            switch (blue36Count) {
                //orange
                case 0:
                    blue36.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    L1 = "F";
                    break;
                //green
                case 1:
                    blue36.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    L1 = "R";
                    break;
                //white
                case 2:
                    blue36.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    L1 = "U";
                    break;
                //red
                case 3:
                    blue36.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    L1 = "B";
                    break;
                //blue
                case 4:
                    blue36.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    L1 = "L";
                    break;
                //yellow
                case 5:
                    blue36.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    L1 = "D";
                    break;
            }
        } else {
            blue36Count = -1;
            blue36.setBackgroundColor(Color.argb(255, 191, 191, 191));
            L1 = "";
        }
    }

    @OnClick(R.id.blue37)
    public void blue37() {
        blue37Count++;
        if (blue37Count < 6) {
            switch (blue37Count) {
                //orange
                case 0:
                    blue37.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    L2 = "F";
                    break;
                //green
                case 1:
                    blue37.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    L2 = "R";
                    break;
                //white
                case 2:
                    blue37.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    L2 = "U";
                    break;
                //red
                case 3:
                    blue37.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    L2 = "B";
                    break;
                //blue
                case 4:
                    blue37.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    L2 = "L";
                    break;
                //yellow
                case 5:
                    blue37.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    L2 = "D";
                    break;
            }
        } else {
            blue37Count = -1;
            blue37.setBackgroundColor(Color.argb(255, 191, 191, 191));
            L2 = "";
        }
    }

    @OnClick(R.id.blue38)
    public void blue38() {
        blue38Count++;
        if (blue38Count < 6) {
            switch (blue38Count) {
                //orange
                case 0:
                    blue38.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    L3 = "F";
                    break;
                //green
                case 1:
                    blue38.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    L3 = "R";
                    break;
                //white
                case 2:
                    blue38.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    L3 = "U";
                    break;
                //red
                case 3:
                    blue38.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    L3 = "B";
                    break;
                //blue
                case 4:
                    blue38.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    L3 = "L";
                    break;
                //yellow
                case 5:
                    blue38.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    L3 = "D";
                    break;
            }
        } else {
            blue38Count = -1;
            blue38.setBackgroundColor(Color.argb(255, 191, 191, 191));
            L3 = "";
        }
    }

    @OnClick(R.id.blue39)
    public void blue39() {
        blue39Count++;
        if (blue39Count < 6) {
            switch (blue39Count) {
                //orange
                case 0:
                    blue39.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    L4 = "F";
                    break;
                //green
                case 1:
                    blue39.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    L4 = "R";
                    break;
                //white
                case 2:
                    blue39.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    L4 = "U";
                    break;
                //red
                case 3:
                    blue39.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    L4 = "B";
                    break;
                //blue
                case 4:
                    blue39.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    L4 = "L";
                    break;
                //yellow
                case 5:
                    blue39.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    L4 = "D";
                    break;
            }
        } else {
            blue39Count = -1;
            blue39.setBackgroundColor(Color.argb(255, 191, 191, 191));
            L4 = "";
        }
    }

    @OnClick(R.id.blue40)
    public void blue40() {
        //L5 = "F";
        Flow flow = RubricsCubeApplication.getMainFlow();
        History newHistory = flow.getHistory().buildUpon()
                .push(new BlueFaceInputStage())
                .build();
        flow.setHistory(newHistory, Flow.Direction.REPLACE);

    }

    @OnClick(R.id.blue41)
    public void blue41() {
        blue41Count++;
        if (blue41Count < 6) {
            switch (blue41Count) {
                //orange
                case 0:
                    blue41.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    L6 = "F";
                    break;
                //green
                case 1:
                    blue41.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    L6 = "R";
                    break;
                //white
                case 2:
                    blue41.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    L6 = "U";
                    break;
                //red
                case 3:
                    blue41.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    L6 = "B";
                    break;
                //blue
                case 4:
                    blue41.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    L6 = "L";
                    break;
                //yellow
                case 5:
                    blue41.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    L6 = "D";
                    break;
            }
        } else {
            blue41Count = -1;
            blue41.setBackgroundColor(Color.argb(255, 191, 191, 191));
            L6 = "";
        }
    }

    @OnClick(R.id.blue42)
    public void blue42() {
        blue42Count++;
        if (blue42Count < 6) {
            switch (blue42Count) {
                //orange
                case 0:
                    blue42.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    L7 = "F";
                    break;
                //green
                case 1:
                    blue42.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    L7 = "R";
                    break;
                //white
                case 2:
                    blue42.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    L7 = "U";
                    break;
                //red
                case 3:
                    blue42.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    L7 = "B";
                    break;
                //blue
                case 4:
                    blue42.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    L7 = "L";
                    break;
                //yellow
                case 5:
                    blue42.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    L7 = "D";
                    break;
            }
        } else {
            blue42Count = -1;
            blue42.setBackgroundColor(Color.argb(255, 191, 191, 191));
            L7 = "";
        }
    }

    @OnClick(R.id.blue43)
    public void blue43() {
        blue43Count++;
        if (blue43Count < 6) {
            switch (blue43Count) {
                //orange
                case 0:
                    blue43.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    L8 = "F";
                    break;
                //green
                case 1:
                    blue43.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    L8 = "R";
                    break;
                //white
                case 2:
                    blue43.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    L8 = "U";
                    break;
                //red
                case 3:
                    blue43.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    L8 = "B";
                    break;
                //blue
                case 4:
                    blue43.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    L8 = "L";
                    break;
                //yellow
                case 5:
                    blue43.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    L8 = "D";
                    break;
            }
        } else {
            blue43Count = -1;
            blue43.setBackgroundColor(Color.argb(255, 191, 191, 191));
            L8 = "D";
        }
    }

    @OnClick(R.id.blue44)
    public void blue44() {
        blue44Count++;
        if (blue44Count < 6) {
            switch (blue44Count) {
                //orange
                case 0:
                    blue44.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    L9 = "F";
                    break;
                //green
                case 1:
                    blue44.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    L9 = "R";
                    break;
                //white
                case 2:
                    blue44.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    L9 = "U";
                    break;
                //red
                case 3:
                    blue44.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    L9 = "B";
                    break;
                //blue
                case 4:
                    blue44.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    L9 = "L";
                    break;
                //yellow
                case 5:
                    blue44.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    L9 = "D";
                    break;
            }
        } else {
            blue44Count = -1;
            blue44.setBackgroundColor(Color.argb(255, 191, 191, 191));
            L9 = "";
        }
    }

    //Yellow
    @OnClick(R.id.yellow45)
    public void yellow45() {
        yellow45Count++;
        if (yellow45Count < 6) {
            switch (yellow45Count) {
                //orange
                case 0:
                    yellow45.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    D1 = "F";
                    break;
                //green
                case 1:
                    yellow45.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    D1 = "R";
                    break;
                //white
                case 2:
                    yellow45.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    D1 = "U";
                    break;
                //red
                case 3:
                    yellow45.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    D1 = "B";
                    break;
                //blue
                case 4:
                    yellow45.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    D1 = "L";
                    break;
                //yellow
                case 5:
                    yellow45.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    D1 = "D";
                    break;
            }
        } else {
            yellow45Count = -1;
            yellow45.setBackgroundColor(Color.argb(255, 191, 191, 191));
            D1 = "";
        }
    }

    @OnClick(R.id.yellow46)
    public void yellow46() {
        yellow46Count++;
        if (yellow46Count < 6) {
            switch (yellow46Count) {
                //orange
                case 0:
                    yellow46.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    D2 = "F";
                    break;
                //green
                case 1:
                    yellow46.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    D2 = "R";
                    break;
                //white
                case 2:
                    yellow46.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    D2 = "U";
                    break;
                //red
                case 3:
                    yellow46.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    D2 = "B";
                    break;
                //blue
                case 4:
                    yellow46.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    D2 = "L";
                    break;
                //yellow
                case 5:
                    yellow46.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    D2 = "D";
                    break;
            }
        } else {
            yellow46Count = -1;
            yellow46.setBackgroundColor(Color.argb(255, 191, 191, 191));
            D2 = "";
        }
    }

    @OnClick(R.id.yellow47)
    public void yellow47() {
        yellow47Count++;
        if (yellow47Count < 6) {
            switch (yellow47Count) {
                //orange
                case 0:
                    yellow47.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    D3 = "F";
                    break;
                //green
                case 1:
                    yellow47.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    D3 = "R";
                    break;
                //white
                case 2:
                    yellow47.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    D3 = "U";
                    break;
                //red
                case 3:
                    yellow47.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    D3 = "B";
                    break;
                //blue
                case 4:
                    yellow47.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    D3 = "L";
                    break;
                //yellow
                case 5:
                    yellow47.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    D3 = "D";
                    break;
            }
        } else {
            yellow47Count = -1;
            yellow47.setBackgroundColor(Color.argb(255, 191, 191, 191));
            D3 = "";
        }
    }

    @OnClick(R.id.yellow48)
    public void yellow48() {
        yellow48Count++;
        if (yellow48Count < 6) {
            switch (yellow48Count) {
                //orange
                case 0:
                    yellow48.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    D4 = "F";
                    break;
                //green
                case 1:
                    yellow48.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    D4 = "R";
                    break;
                //white
                case 2:
                    yellow48.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    D4 = "U";
                    break;
                //red
                case 3:
                    yellow48.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    D4 = "B";
                    break;
                //blue
                case 4:
                    yellow48.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    D4 = "L";
                    break;
                //yellow
                case 5:
                    yellow48.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    D4 = "D";
                    break;
            }
        } else {
            yellow48Count = -1;
            yellow48.setBackgroundColor(Color.argb(255, 191, 191, 191));
            D4 = "";
        }
    }

    @OnClick(R.id.yellow49)
    public void yellow49() {
        //  D5 = "F";
        Flow flow = RubricsCubeApplication.getMainFlow();
        History newHistory = flow.getHistory().buildUpon()
                .push(new YellowFaceInputStage())
                .build();
        flow.setHistory(newHistory, Flow.Direction.REPLACE);

    }

    @OnClick(R.id.yellow50)
    public void yellow50() {
        yellow50Count++;
        if (yellow50Count < 6) {
            switch (yellow50Count) {
                //orange
                case 0:
                    yellow50.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    D6 = "F";
                    break;
                //green
                case 1:
                    yellow50.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    D6 = "R";
                    break;
                //white
                case 2:
                    yellow50.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    D6 = "U";
                    break;
                //red
                case 3:
                    yellow50.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    D6 = "B";
                    break;
                //blue
                case 4:
                    yellow50.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    D6 = "L";
                    break;
                //yellow
                case 5:
                    yellow50.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    D6 = "D";
                    break;
            }
        } else {
            yellow50Count = -1;
            yellow50.setBackgroundColor(Color.argb(255, 191, 191, 191));
            D6 = "";
        }
    }

    @OnClick(R.id.yellow51)
    public void yellow51() {
        yellow51Count++;
        if (yellow51Count < 6) {
            switch (yellow51Count) {
                //orange
                case 0:
                    yellow51.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    D7 = "F";
                    break;
                //green
                case 1:
                    yellow51.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    D7 = "R";
                    break;
                //white
                case 2:
                    yellow51.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    D7 = "U";
                    break;
                //red
                case 3:
                    yellow51.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    D7 = "B";
                    break;
                //blue
                case 4:
                    yellow51.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    D7 = "L";
                    break;
                //yellow
                case 5:
                    yellow51.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    D7 = "D";
                    break;
            }
        } else {
            yellow51Count = -1;
            yellow51.setBackgroundColor(Color.argb(255, 191, 191, 191));
            D7 = "";
        }
    }

    @OnClick(R.id.yellow52)
    public void yellow52() {
        yellow52Count++;
        if (yellow52Count < 6) {
            switch (yellow52Count) {
                //orange
                case 0:
                    yellow52.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    D8 = "F";
                    break;
                //green
                case 1:
                    yellow52.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    D8 = "R";
                    break;
                //white
                case 2:
                    yellow52.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    D8 = "U";
                    break;
                //red
                case 3:
                    yellow52.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    D8 = "B";
                    break;
                //blue
                case 4:
                    yellow52.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    D8 = "L";
                    break;
                //yellow
                case 5:
                    yellow52.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    D8 = "D";
                    break;
            }
        } else {
            yellow52Count = -1;
            yellow52.setBackgroundColor(Color.argb(255, 191, 191, 191));
            D8 = "";
        }
    }

    @OnClick(R.id.yellow53)
    public void yellow53() {
        yellow53Count++;
        if (yellow53Count < 6) {
            switch (yellow53Count) {
                //orange
                case 0:
                    yellow53.setBackgroundColor(Color.argb(255, 255, 149, 0));
                    D9 = "F";
                    break;
                //green
                case 1:
                    yellow53.setBackgroundColor(Color.argb(255, 41, 198, 60));
                    D9 = "R";
                    break;
                //white
                case 2:
                    yellow53.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    D9 = "U";
                    break;
                //red
                case 3:
                    yellow53.setBackgroundColor(Color.argb(255, 255, 40, 40));
                    D9 = "B";
                    break;
                //blue
                case 4:
                    yellow53.setBackgroundColor(Color.argb(255, 0, 0, 255));
                    D9 = "L";
                    break;
                //yellow
                case 5:
                    yellow53.setBackgroundColor(Color.argb(255, 246, 255, 0));
                    D9 = "D";
                    break;
            }
        } else {
            yellow53Count = -1;
            yellow53.setBackgroundColor(Color.argb(255, 191, 191, 191));
            D9 = "";
        }
    }


}
