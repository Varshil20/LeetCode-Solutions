class Solution {
    public boolean isBoomerang(int[][] points) {

        //(Y2-Y1)/(X2-X1) = (Y3-Y2)/(X3-X2)    it is for slope in a single line
        //if it is not equal means three points are not in same line means its boomering
        return (points[1][1]-points[0][1])*(points[2][0]-points[1][0]) != (points[2][1]-points[1][1])*(points[1][0]-points[0][0]);
    }
}