/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

import java.util.Arrays;

/**
 * REFERENCE： http://www.newthinktank.com/2013/03/binary-tree-in-java/#comment-409356
 * Youtube: https://www.youtube.com/watch?v=M6lYob8STMI
 * 
 * TODO： https://www.youtube.com/watch?v=UcOxGmj45AA 【remove node by certain key】
 * Binary Search Tree aka BST, is the tree that always has at most 2 children(left and right)
 * left child is less than its parent, right child is greater than its parent.
 * Inorder traversal is the most useful/important way to traverse the BST, because
 * it always gives a sorted result due to BST's special structure. 
 * @author zhangqiumin
 */


public class BinarySearchTree {

    /**
     * @param args the command line arguments
     */
    
    Node root;
    
    public void addNode(int key, String name){
        // create a node and initialize it
        Node newNode = new Node(key, name);
        
        if(root == null){
            root = newNode;
        }else {
            // Start traversal with the root node
            // The focusNode is always the node we are travesing
            Node focusNode = root;
            Node parent;
            
            // If the key is less than the focusNode, go to the left child of the focusNode
            while(true){
                parent = focusNode;
                if(key < focusNode.key){
                    // go to the right child of the current focusNode
                    focusNode = focusNode.leftchild;
                    
                    // if the rightchild is null, give the rightchild the key and name then return
                    if(focusNode == null){
                        parent.leftchild = newNode;
                        return;
                    }
                }
                if(key > focusNode.key){
                    focusNode = focusNode.rightchild;
                    
                    if(focusNode == null){
                        parent.rightchild = newNode;
                        return;
                    }
                }
            }
        }
    }
    
    public void InorderTraversal(Node rootNode){
        if(rootNode == null){return;}
        
        InorderTraversal(rootNode.leftchild);
        System.out.println(rootNode);
        InorderTraversal(rootNode.rightchild);
    }
    
    public void PreorderTraversal(Node rootNode){
        if(rootNode == null){return;}
        
        System.out.println(rootNode);
        PreorderTraversal(rootNode.leftchild);
        PreorderTraversal(rootNode.rightchild);
    }
    
    public void PostorderTraversal(Node rootNode){
        if(rootNode == null){return;}
        
        PostorderTraversal(rootNode.leftchild);
        PostorderTraversal(rootNode.rightchild);
        System.out.println(rootNode);
    }
    
    public Node findNode(int key){
        Node focusNode = root;
        
        while(focusNode.key != key){
            if(key < focusNode.key){
                focusNode = focusNode.leftchild;
            }
            if(key > focusNode.key){
                focusNode = focusNode.rightchild;
            }
            if(focusNode == null){
                return null;
            }
        }
        
        return focusNode;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        BinarySearchTree BST = new BinarySearchTree();
        BST.addNode(20, "Junior");
        BST.addNode(30, "Undergraduate");
        BST.addNode(15, "Primary School");
        BST.addNode(10, "Kindergarten");
        BST.addNode(25, "High School");
        
        System.out.println("\nInreorder:");
        BST.InorderTraversal(BST.root);
        
        System.out.println("\nPreorder:");
        BST.PreorderTraversal(BST.root);
        
        System.out.println("\nPostorder:");
        BST.PostorderTraversal(BST.root);
        
        Node find = BST.findNode(25);
        System.out.println("\nfind: " + find);
        
        int[] nums = {1,2,3};
        int[] left = Arrays.copyOfRange(nums, 0, 2);
        System.out.println(Arrays.toString(left));

        
    }
    
}
