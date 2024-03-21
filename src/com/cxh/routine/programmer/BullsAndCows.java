package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2024-03-12 16:48
 */
public class BullsAndCows {
    public static void main(String[] args) {
        BullsAndCows bullsAndCows = new BullsAndCows();
        System.out.println(bullsAndCows.getHint("1122", "1222"));
    }
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] s = new int[10];
        int[] g = new int[10];
        for (int i=0;i<secret.length();i++){
            if (secret.charAt(i)==guess.charAt(i)){
                bulls++;
            }else{
                s[secret.charAt(i)-'0']++;
                g[guess.charAt(i)-'0']++;
            }
        }
        for (int i=0;i<10;i++){
            cows += Math.min(s[i],g[i]);
        }
        return bulls + "A" + cows + "B";
    }
}
