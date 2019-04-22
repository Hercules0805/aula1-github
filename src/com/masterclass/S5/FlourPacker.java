package com.masterclass.S5;

public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(2,2,11));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int sum = bigCount * 5 + smallCount;

        if (sum < goal) {
            return false;
        }
        if (sum == goal) {
            return true;
        }

        if (sum > goal) {
            if (smallCount < goal % 5) {
                return false;
            }
        }
        return true;
    }
}
