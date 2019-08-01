/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author zhangqiumin
 */

class Node {
    public String name;
    public int key;
    public Node leftchild;
    public Node rightchild;
    
    Node(int key, String name) {
        this.key = key;
        this.name = name;
    }
    
    // data
    public void setKey(int key) {
        this.key = key;
        this.leftchild = null;
        this.rightchild = null;
    }
    public int getKey() {
        return this.key;
    }
    
    // leftchild
    public void setLeftchild(Node leftchild) {
        this.leftchild = leftchild;
    }
    public Node getLeftchild() {
        return this.leftchild;
    }
    
    // rightchild
    public void setRightchild(Node rightchild) {
        this.rightchild = rightchild;
    }
    public Node getRightchild() {
        return this.rightchild;
    }
    
    @Override
    public String toString(){
        return String.valueOf(String.valueOf(this.key) + " is " + this.name);
    }
}

public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    
    // No matter what it is, it's gonna hava a node value
    Node root;
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
