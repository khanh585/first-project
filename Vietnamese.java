/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.LinkedList;

/**
 *
 * @author SE130585
 */
public class Vietnamese extends BST{

    public Vietnamese() {
    }
    
    public void addWord(String word, LinkedList<String> mean) {
        Word w = new Word(word);
        if (!mean.isEmpty()) {
            w.addMean(mean);
        }
        this.insert(w);
    }
    
     public void addWord(String word,String mean) {
        Word w = new Word(word);
        if (!mean.isEmpty()) {
            w.addMean(mean);
        }
        this.insert(w);
    }
}
