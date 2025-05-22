/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackboard;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class mysort {
    public static void main(String[] args) {

        Blackboard blackboard = new Blackboard();  
        DataReader dataReader = new DataReader(blackboard);
        dataReader.readInput();

        List<String> wordsList = new ArrayList<>(blackboard.getWords());
        Quicksort quicksort = new Quicksort(wordsList);
        quicksort.sort();
        
        System.out.println("Sıralı benzersiz kelimeler:");
        for (String word : quicksort.getSortedWords()) {
            System.out.println(word);
        }
    }
}



