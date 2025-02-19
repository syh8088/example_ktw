package LeetCode.p_21_Merge_Two_Sorted_Lists;


/**
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
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

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {


         return null;
    }

    public static void main(String[] args) {

        Solution T = new Solution();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));

        System.out.println(T.mergeTwoLists(list1, list2));
    }


    /**
     * 정답
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode result = new ListNode();
        ListNode temp = result;

        while (list1 != null && list2 != null) {

            if (list1.val > list2.val) {
                temp.next = list2;
                list2 = list2.next;
            }
            else {
                temp.next = list1;
                list1 = list1.next;
            }

            temp = temp.next;
        }

        if (list1 == null) {
            temp.next = list2;
        }
        else {
            temp.next = list1;
        }

        return result.next;
    }
}