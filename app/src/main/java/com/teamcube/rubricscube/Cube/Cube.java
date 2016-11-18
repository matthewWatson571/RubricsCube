package com.teamcube.rubricscube.Cube;

import java.util.HashMap;

/**
 * Created by Matthew.Watson on 11/16/16.
 */

public class Cube {

	/*
	 *            Cube Layout
	 *
	 *                   555
	 *                   555
	 *                   555
	 *            000 111 222 333
	 *            000 111 222 333
	 *            000 111 222 333
	 *                   444
	 *                   444
	 *                   444
	 */

    private int[][][] cube = new int[6][3][3];

    // i = row
    //j = column

    private int leftColor, frontColor, rightColor, backColor, topColor, bottomColor = 0;
    private int[] colors = {leftColor, frontColor, rightColor, backColor, topColor, bottomColor};

    // colorMap is a map for RGB value to 0-5.
    private HashMap<Integer, Integer> colorMap = new HashMap<Integer, Integer>();
    // when there is a full cube rotation, because 0 is always on the left, 1
    // facing user, etc, all int values need to be remapped
    private HashMap<Integer, Integer> faceMap = new HashMap<Integer, Integer>();


    public Cube() {
        resetCube();
    }

    public Cube(int[][][] cube, int[] colors) {
        this.cube = cube;
        this.colors = colors;
    }

    // Copy constructor
    public Cube(Cube c) {
        for (int f = 0; f < 6; f++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    setSquare(f, i, j, c.getSquare(f, i, j));
                }
            }
            setColorValue(f, getColorValue(f));
        }
        colorMap = new HashMap<Integer, Integer>(c.colorMap);
        faceMap = new HashMap<Integer, Integer>(c.faceMap);
    }

    public void resetCube(){ //populates array to create solved cube
        for(int i = 0; i<6; i++){
            for(int j = 0; j<3; j++){
                for(int k = 0; k<3; k++){
                    cube[i][j][k] = i;
                }
            }
        }
    }


    public void setSquare(int face, int i, int j, int Color) {//sets square to specific color
        cube[face][i][j] = Color;
    }

    public int getSquare(int face, int i, int j) { //returns color value of square

        return cube[face][i][j];
    }

    public void setColorValue(int face, int colorValue){

        colors[face] = colorValue;
    }

    public int getColorValue(int face){

        return colors [face];
    }

    public int getComplementaryEdgeColor(int face, int i, int j){
        if(face == 5 && i == 2 && j == 1) return getSquare(1, 0, 1);
        if(face == 5 && i == 1 && j == 0) return getSquare(0, 0, 1);
        if(face == 5 && i == 1 && j == 2) return getSquare(2, 0, 1);
        if(face == 5 && i == 0 && j == 1) return getSquare(3, 0, 1);

        //face 1
        if(face == 1 && i == 2 && j == 1) return getSquare(4, 0, 1); //technically not needed
        if(face == 1 && i == 1 && j == 0) return getSquare(0, 1, 1);
        if(face == 1 && i == 1 && j == 2) return getSquare(2, 1, 1);
        if(face == 1 && i == 0 && j == 1) return getSquare(5, 2, 1);

        else return 88;
    }



}
