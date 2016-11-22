
package com.teamcube.rubricscube.Components;

import android.graphics.drawable.Drawable;
import android.util.Log;

import com.teamcube.rubricscube.R;

import java.util.ArrayList;

/**
 * Created by jessemaynard on 11/21/16.
 */

public class Utils {

    public static ArrayList<Integer> instructionImages = new ArrayList<>();
    public static void printInstructions(String[] splitRub) {

        for (int i = 0; i < splitRub.length; i++) {
            Log.d(">>>>>>>>>>>", splitRub[i]);
            switch (splitRub[i]) {
                case "F":
//                    instructionImages.add(R.drawable.clock_front);
                    break;
                case "F2":
                    instructionImages.add(R.drawable.clock_front);
                    instructionImages.add(R.drawable.clock_front);
                    break;
                case "F'":
                    instructionImages.add(R.drawable.counter_front);
                    break;
                case "F'2":
                    instructionImages.add(R.drawable.counter_front);
                    instructionImages.add(R.drawable.counter_front);
                    break;
                case "U":
                    instructionImages.add(R.drawable.clock_upper);
                    break;
                case "U2":
                    instructionImages.add(R.drawable.clock_upper);
                    instructionImages.add(R.drawable.clock_upper);
                    break;
                case "U'":
                    instructionImages.add(R.drawable.counter_upper);
                    break;
                case "U'2":
                    instructionImages.add(R.drawable.counter_upper);
                    instructionImages.add(R.drawable.counter_upper);
                    break;
                case "L":
                    instructionImages.add(R.drawable.clock_left);
                    break;
                case "L2":
                    instructionImages.add(R.drawable.clock_left);
                    instructionImages.add(R.drawable.clock_left);
                    break;
                case "L'":
                    instructionImages.add(R.drawable.counter_left);
                    break;
                case "L'2":
                    instructionImages.add(R.drawable.counter_left);
                    instructionImages.add(R.drawable.counter_left);
                    break;
                case "R":
                    instructionImages.add(R.drawable.clock_right);
                    break;
                case "R2":
                    instructionImages.add(R.drawable.clock_right);
                    instructionImages.add(R.drawable.clock_right);
                    break;
                case "R'":
                    instructionImages.add(R.drawable.counter_right);
                    break;
                case "R'2":
                    instructionImages.add(R.drawable.counter_right);
                    instructionImages.add(R.drawable.counter_right);
                    break;
                case "D":
                    instructionImages.add(R.drawable.clock_down);
                    break;
                case "D2":
                    instructionImages.add(R.drawable.clock_down);
                    instructionImages.add(R.drawable.clock_down);
                    break;
                case "D'":
                    instructionImages.add(R.drawable.counter_down);
                    break;
                case "D'2":
                    instructionImages.add(R.drawable.counter_down);
                    instructionImages.add(R.drawable.counter_down);
                    break;
                case "B":
                    instructionImages.add(R.drawable.clock_back);
                    break;
                case "B2":
                    instructionImages.add(R.drawable.clock_back);
                    instructionImages.add(R.drawable.clock_back);
                    break;
                case "B'":
                    instructionImages.add(R.drawable.counter_back);
                    break;
                case "B'2":
                    instructionImages.add(R.drawable.counter_back);
                    instructionImages.add(R.drawable.counter_back);
                    break;
            }
        }
    }

}
