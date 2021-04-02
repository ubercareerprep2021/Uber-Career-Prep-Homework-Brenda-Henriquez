import java.util.*;

public class Part1{

    public static boolean isStringPermutation(String s1, String s2){
        //edge case
        if(s2.length() != s1.length()) return false;

        HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();

        //populate hashmap with key as character and value as frequency
        for(int i = 0; i < s1.length(); i++){
            hm1.put(s1.charAt(i), hm1.getOrDefault(s1.charAt(i), 0) + 1);
            hm2.put(s2.charAt(i), hm2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        //return true if hashmap for s1 and s2 are equal
        if(hm1.equals(hm2)) return true;
        return false;
    }


    public static List<List<Integer>> pairsThatEqualSum(List<Integer> inputArray, Integer targetSum) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        //edge case
        if(inputArray.size() <= 1) return result;

        //sliding window approach, keep comparing first element to the elments to its right
        //populate arraylist if add up to target
        int first = 0;
        int index = 1;
        while(first < inputArray.size()){
            for(int i = index; i < inputArray.size();i++){
                if(inputArray.get(first) + inputArray.get(i) == targetSum){
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(0, inputArray.get(first));
                    temp.add(1, inputArray.get(i));
                    result.add(temp);
                }
            }
            index++;
            first++;
        }
        return result;
    }

    public static void main(String[] args){
        String s1 = "abcd";
        String s2 = "adb";
        System.out.println(isStringPermutation(s1,s2));
        List<Integer> res = new ArrayList<Integer>();
        res.add(0,1);
        res.add(1,2);
        res.add(2,3);
        res.add(3,4);
        res.add(4,5);
        int tar = 7;
        System.out.println(pairsThatEqualSum(res, tar));
    }

}
