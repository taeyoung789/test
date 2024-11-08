package com.exam5;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Random rand = new Random();

        int N = 2 * (rand.nextInt(5000) + 1);

        int[] nums = new int[N];

        for (int i = 0 ; i < N ; i ++){
            nums[i] = rand.nextInt(200000) + 1 ;
        }

        for ( int num : nums ) {
            System.out.println(num+ ",");
        }

        int count = N / 2;
        HashSet<Integer>set = new HashSet<>();
        for (int i = 0; i < N && set.size() < count; i++) {
            set.add(nums[i]);
        }


        System.out.println("result :" + set.size());

        answer = set.size();

        return answer;
    }
}