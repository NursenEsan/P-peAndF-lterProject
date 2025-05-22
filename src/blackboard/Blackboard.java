/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackboard;

/**
 *
 * @author nuren
 */
import java.util.HashSet;
import java.util.Set;

public class Blackboard {
    private Set<String> words; 

   
    public Blackboard() {
        this.words = new HashSet<>();
    }


    public void addWord(String word) {
        words.add(word); 
    }

    
    public Set<String> getWords() {
        return words;
    }
     public int size() {
        return words.size();
    }

    public boolean contains(String word) {
        return words.contains(word);
    }

}
