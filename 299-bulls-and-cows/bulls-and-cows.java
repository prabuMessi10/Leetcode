class Solution {
    public String getHint(String secret, String guess) {
        int bull =0;
        int cow = 0;
        HashMap<Character,Integer> sec = new HashMap<>();
        HashMap<Character,Integer> guss = new HashMap<>();

        for(int i=0;i<secret.length();i++){
            char pos = secret.charAt(i);
            char g = guess.charAt(i);
            if(secret.charAt(i) == guess.charAt(i))
                bull++;
            sec.put(pos,sec.getOrDefault(pos,0)+1);
            guss.put(g,guss.getOrDefault(g,0)+1);
        }
        int f =0;
       for (Character k : sec.keySet()) {
            int x = sec.getOrDefault(k, 0);
            int y = guss.getOrDefault(k, 0);
            f += Math.min(x, y);
}
    cow = f - bull;
    System.out.print(bull+" " + f);
    return bull+"A"+cow+"B";

    }
}