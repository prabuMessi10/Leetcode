class Solution {
    public boolean judgeCircle(String moves) {
        int hori =0;
        int ver = 0;
        for(int i=0;i<moves.length();i++){
            char a = moves.charAt(i);
            if(a == 'L') hori++;
            else if(a == 'R') hori--;
            else if(a == 'U') ver++;
            else ver--;
        }
        if(hori ==0 && ver ==0) return true;
        else return false;
    }
}