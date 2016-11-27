package com.teamcube.rubricscube.Cube;

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


    public void resetCube() { //populates array to create solved cube
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    cube[i][j][k] = i;
                }
            }
        }
    }


}
