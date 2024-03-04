// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;
import java.util.List;

public class ExctraCandey {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int large = candies[0];
        for(int i=0;i<candies.length-1;i++){
            if(candies[i]>large)
                large = candies[i];
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies < large){
                list.add(false);
            }else{
                list.add(true);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies,3));
    }
}
