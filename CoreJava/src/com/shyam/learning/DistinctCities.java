package com.shyam.learning;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctCities {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int caseCnt = sc.nextInt();
        for(int i=0; i<caseCnt; i++){
            int cities = sc.nextInt();
            Set<String> places= new HashSet<String>();
                for(int j=0; j<cities; j++){
                    places.add(sc.next());
                }
                System.out.println(places.size());
            
        }
    }
}
