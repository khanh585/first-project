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
public class Word implements Comparable<Object> {

    String word;
    LinkedList<String> mean;

    public Word() {
    }

    public Word(String word) {
        this.word = word;
        mean = new LinkedList<>();
    }

    public String getWord() {
        return word;
    }

    public LinkedList<String> getMean() {
        return mean;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setMean(LinkedList<String> mean) {
        this.mean = mean;
    }

    public void addMean(LinkedList<String> mean) {
        for (int i = 0; i < mean.size(); i++) {
            String m = mean.get(i);
            if (!this.mean.contains(m)) {
                this.mean.add(mean.get(i));
            }
        }
    }

    public void addMean(String mean) {
        if (!this.mean.contains(mean)) {
            this.mean.add(mean);
        }
    }

    @Override
    public String toString() {
        String mean = "";
        for (int i = 0; i < this.mean.size(); i++) {
            mean += this.mean.get(i) + ",";
        }
        return word + ": " + mean;
    }

    @Override
    public int compareTo(Object o) {
        Word t = (Word) o;
        return this.word.compareToIgnoreCase(t.word);
    }

}
