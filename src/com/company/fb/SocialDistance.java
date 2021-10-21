package com.company.fb;

public class SocialDistance {

    private static boolean checkLeft(int index, long[] seats, long K) {
        if(index == 0) return true;
        if(K == 0) return true;

        long wrtK = K;

        while(index >= 0) {
            index--;
            wrtK--;

            if(seats[index] == 1) return false;
            if(wrtK == 0 || index == 0) return true;
        }

        return true;
    }

    private static boolean checkRight(int index, long[] seats, long K) {
        if(index == seats.length-1) return true;
        if(K == 0) return true;

        long wrtK = K;

        while(index <= seats.length-1) {
            index++;
            wrtK--;

            if(seats[index] == 1) return false;
            if(wrtK == 0 || index == 0) return true;
        }

        return true;
    }

    public long getMaxAdditionalDinersCount(long N, long K, int M, long[] S) {

        long count = 0;

        long[] seats = new long[(int)N];

        long sIndex = 0;

        for(int i = 0; i < N; i++) {
            seats[i] = 0;
        }

        for(long num: S) {
            seats[(int)num] = 1;
        }

        for(int i = 0; i < N; i++) {
            if(seats[i] != 1 && checkLeft(i, seats, K) && checkRight(i, seats, K)) {
                seats[i] = 1;
                count++;
            }
        }

        for(long s: seats) {
            System.out.print(s + " | ");
        }

        return count;
    }


}
