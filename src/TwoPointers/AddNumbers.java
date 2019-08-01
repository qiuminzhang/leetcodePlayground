/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoPointers;

/**
 *
 * @author zhangqiumin
 */
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

class Solution {
    // never operate on the linked list directly, create a new variable to point to it instead.
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode curr = result, p1 = l1, p2 = l2;
        int carry = 0;
        while(p1 != null || p2 != null){
            int x = (p1 == null) ? 0: p1.val;
            int y = (p2 == null) ? 0: p2.val;
            int sum = x + y + carry;
            curr.next = new ListNode(sum % 10);
            carry = sum / 10;
            curr = curr.next;
            
            
            if(p1 != null) p1 = p1.next;
            if(p2 != null) p2 = p2.next;
        }
        System.out.println(result.next.val);
        return result.next;
    }
}
public class AddNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        
        Solution solution = new Solution();
        solution.addTwoNumbers(l1, l2);
        double c = 3.0/2.0;
        System.out.println("result " + c);
        System.out.println(c + "  " + Math.ceil(c));
        System.out.println(Math.ceil(c) == 2);
        double stop = Math.ceil((double)3 / 2.0);
        System.out.println("" + stop);
    }
    }   
}
