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
public class ConvertSortedArrayToBST {
    /**
     * https://www.youtube.com/watch?v=PZYTs9y4f4o
     * @param args the command line arguments
     */
    
    public Node sortedArrayToBST(int[] nums){
        if(nums == null || nums.length == 0) {return null;}
        
        return constructBST(nums, 0, nums.length - 1);
    }
    
    private Node constructBST(int[] nums, int left, int right){
        // when the two ends accross, should terminate the function
        if(left > right){return null;}
        
        // everytime we're going to set up every middle element as the root of current subarray
        int mid = left + (right - left)/2;
        Node node = new Node(nums[mid], "null");
        System.out.println(node.key);
        node.leftchild = constructBST(nums, left, mid - 1);
        node.rightchild = constructBST(nums, mid + 1, right);
        return node;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = {-10,-3,0,5,9};
        ConvertSortedArrayToBST s_BST = new ConvertSortedArrayToBST();
        s_BST.sortedArrayToBST(nums);
    }    
}
