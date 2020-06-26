package cn.cnsuh.ms0201_removeDuplicateNodes;

import java.util.HashSet;
import java.util.Set;

/**
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 */
public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(1);
        listNode.next.next = new ListNode(3);


        ListNode listNode1 = removeDuplicateNodes(listNode);
        System.out.println(listNode1.val);
        while(listNode1.next!=null){
            System.out.println(listNode1.next.val);
            listNode1=listNode1.next;
        }

    }

    static ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return head;
        }
        Set<Integer> set = new HashSet<>();
        set.add(head.val);
        ListNode tmp = head;
        while (tmp.next != null) {
            ListNode cur = tmp.next;
            if (set.add(cur.val)) {
                tmp = tmp.next;
            } else {
                tmp.next = tmp.next.next;
            }

        }
        tmp.next = null;
        return head;

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}