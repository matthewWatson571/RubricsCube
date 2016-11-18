package com.teamcube.rubricscube;

import android.util.Log;

import com.teamcube.rubricscube.Models.LegendModel;

import java.util.ArrayList;

/**
 * Created by aaroncampbell on 11/17/16.
 */

public class Utils {

    public static void getData() {

        ArrayList<LegendModel> liM = new ArrayList<>();

        int[] images = {
                R.drawable.notau,
                R.drawable.notabu,
                R.drawable.notad,
                R.drawable.notabd,
                R.drawable.notar,
                R.drawable.notabr,
                R.drawable.notal,
                R.drawable.notabl,
                R.drawable.notaf,
                R.drawable.notabf,
                R.drawable.notab,
                R.drawable.notabb,
                R.drawable.notax,
                R.drawable.notabx,
                R.drawable.notay,
                R.drawable.notaby,
                R.drawable.notaz,
                R.drawable.notabz
        };

        int[] icons = {
                R.drawable.letteru,
                R.drawable.letteru1,
                R.drawable.letterd,
                R.drawable.letterd1,
                R.drawable.letterr,
                R.drawable.letterr1,
                R.drawable.letterl,
                R.drawable.letterl1,
                R.drawable.letterf,
                R.drawable.letterf1,
                R.drawable.letterb,
                R.drawable.letterb1,
                R.drawable.letterx,
                R.drawable.letterx1,
                R.drawable.lettery,
                R.drawable.lettery1,
                R.drawable.letterz,
                R.drawable.letterz1
        };

//        for (int i = 0; i <= images.length; i++) {
//            for (int j = 0; i <= icons.length; j++) {
//                LegendModel imageModel = new LegendModel();
//
//                imageModel.setImageOneId(images[i]);
//                imageModel.setImageTwoId(icons[j]);
//                legendImageModels.add(imageModel);
//            }
        for (int i = 0; i <= images.length; i++) {
            Log.d(">>>>>>>>>", String.valueOf(i));
        }
    }
}
