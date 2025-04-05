package LeetCode.p_206_Reverse_Linked_List;


/**
 * https://leetcode.com/problems/reverse-linked-list/description/
 *
 * 💥풀이
 * https://jeonji.tistory.com/27
 */
public class Solution {



     // Definition for singly-linked list.
     public static class ListNode {

        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
     }

    public ListNode reverseList2(ListNode head) {

         ListNode prev = null;






         return prev;
    }

    public static void main(String[] args) {

        Solution T = new Solution();

        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));

        System.out.println(T.reverseList2(listNode));
    }



    /**
     * 정답
     */
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;

        while (head != null) {
            ListNode current = head;
            head = head.next;
            current.next = prev;
            prev = current;
        }

        ListNode prev = null;
        while (head != null) {


        }


        return prev;
    }

}