class Solution {
    public double[] internalAngles(int[] sides) {
        Arrays.sort(sides);
        
        if(sides[0]+sides[1] <= sides[2]) return new double[0];
        double[] res = new double[3];
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];
         
        res[0] = Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2.0 * b * c)));
        res[1] = Math.toDegrees(Math.acos((a*a + c*c - b*b) / (2.0 * a * c)));
        res[2] = Math.toDegrees(Math.acos((a*a + b*b - c*c) / (2.0 * a * b)));

        return res;
    }
}