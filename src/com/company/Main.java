package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] p = new int[n];
            for(int i=0;i<n;i++) p[i]= scan.nextInt();
            int max = 0;
            for(int j: p){
                if (j > max) max = j;
            }
            System.out.println(max);
        }
    }