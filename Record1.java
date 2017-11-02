public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int maxscore = score[0];
        int minscore = score[0];
        int maxcount =0;
        int mincount =0;
        for(int i=1;i<n;i++){
            if(maxscore>score[i]){
                maxscore=score[i];
                maxcount++;
            }
            if(minscore<score[i]){
                minscore=score[i];
                mincount++;
            }
        }
        System.out.println(mincount +" "+maxcount);
    }
}