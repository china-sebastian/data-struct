package LinkedList;

/**
 * @Author 彬哥，邮箱：13450770408@163.com
 * @Description  链表节点
 * @Date 2023-09-26 14:06
 * github:https://github.com/china-sebastian
 */
public class Node<T> {

    /**
     * 当前节点元素的值
     */
    T elem;

    /**
     * 指向前一个链表节点
     */
    Node<T> prev;

    /**
     * 指向下一个链表节点
     */
    Node<T> next;

    Node(Node<T> prev, T elem, Node<T> next) {
        this.prev = prev;
        this.elem = elem;
        this.next = next;
    }
}

