/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackboard;
import java.util.List;

public class Quicksort {
    private List<String> wordsList;

    public Quicksort(List<String> wordsList) {
        this.wordsList = wordsList;
    }

    public void sort() {
        quicksort(0, wordsList.size() - 1);
    }

    private void quicksort(int low, int high) {
        if (low < high) {
            Partitioner partitioner = new Partitioner(wordsList);
            int pivotIndex = partitioner.partition(low, high);
            quicksort(low, pivotIndex - 1);
            quicksort(pivotIndex + 1, high);
        }
    }

    public List<String> getSortedWords() {
        return wordsList;
    }
}