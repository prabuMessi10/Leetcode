class Solution {
    public int totalNumbers(int[] digits) {
        int[] avail = new int[10];
        for(int i : digits){
            avail[i]++;
        }
        int count = 0;
        for(int i = 100;i<1000;i +=2){
            int hundred = i/100;
            int ten = (i/10)%10;
            int one = i%10;

            int[] req = new int[10];
            req[hundred]++;
            req[ten]++;
            req[one]++;

            if(avail[hundred] >= req[hundred] && avail[ten] >= req[ten] && avail[one] >= req[one]) count++;
        }
        return count;
    }
}
