/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package blackboard;

import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author deniz
 */
public class DataReader {
   private Blackboard blackboard;
    public DataReader(Blackboard blackboard) {
        this.blackboard = blackboard;
    } 
    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıralanacak kelimeleri girin (her kelime için Enter'a basın, bitirmek için boş bir satır girin):");
        while (true) {
            String word = scanner.nextLine();
            if (word.isEmpty()) {
                break; 
            }
            blackboard.addWord(word.toLowerCase()); 
        }
        scanner.close();
    }

  
}
