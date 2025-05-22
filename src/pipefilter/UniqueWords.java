/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipefilter;
/**
 *
 * @author deniz
 */

import blackboard.Blackboard;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueWords {
    public static void main(String[] args) {
       Blackboard blackboard = new Blackboard();
        Scanner scanner = new Scanner(System.in);

        // System.in üzerinden veri okuma
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split("\\s+"); 
            for (String word : words) {
                if (!word.isEmpty()) {
                    blackboard.addWord(word.toLowerCase()); 
                }
            }
        }
        scanner.close();

        // Eşsiz kelimeleri yazdır
        for (String word : blackboard.getWords()) {
            System.out.println(word);
        }
    }
}