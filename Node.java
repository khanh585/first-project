/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author SE130585
 */
public class Node {

    Word word;
    Node left;
    Node right;
    int height;
    public Node() {
    }

    public Node(Word o) {
        word = o;
        right = left = null;
        height = 1;
    }

}
