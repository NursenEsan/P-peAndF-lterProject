/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackboard;


import java.util.List;


public class Partitioner {
    private List<String> wordsList;

    public Partitioner(List<String> wordsList) {
        this.wordsList = wordsList;
    }

    public int partition(int low, int high) {
        String pivot = wordsList.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (wordsList.get(j).compareTo(pivot) < 0) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        String temp = wordsList.get(i);
        wordsList.set(i, wordsList.get(j));
        wordsList.set(j, temp);
    }

    public List<String> getWords() {
        return wordsList;
    }
}


