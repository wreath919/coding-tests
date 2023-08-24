package codility.lessons.leetcode;

import leetcode.IntersectionOfTwoLinkedLists;
import leetcode.ListNode;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class IntersectionOfTwoLinkedListsTest {
    IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists;

    @BeforeAll
    void setup(){
        intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();
    }

    @Test
    void should_find_intersection_node_1(){
        int[] a = {4, 1, 8, 4, 5};
        int[] b = {5, 6, 1};
        ListNode headA = createNodes(a);
        ListNode headB = createNodes(b);
        headB.next.next.next = headA.next.next;
        ListNode expected = headA.next.next;
        ListNode actual = intersectionOfTwoLinkedLists.getIntersectionNode(headA, headB);
        assertEquals(expected, actual);
    }

    @Test
    void should_not_find_intersection_node_1(){
        int[] a = {2, 6, 4};
        int[] b = {1, 5};
        ListNode headA = createNodes(a);
        ListNode headB = createNodes(b);
        ListNode expected = null;
        ListNode actual = intersectionOfTwoLinkedLists.getIntersectionNode(headA, headB);
        assertEquals(expected, actual);
    }

    private ListNode createNodes(int[] array){
        ListNode headNode = new ListNode(array[0]);
        ListNode curNode = headNode;
        for(int i = 1; i < array.length; i++){
            curNode.next = new ListNode(array[i]);
            curNode = curNode.next;
        }
        return headNode;
    }
}