package LinkedList;

/**
 * @Author 彬哥，邮箱：13450770408@163.com
 * @Description
 * @Date 2023-09-26 14:05
 * github:https://github.com/china-sebastian
 */
public class Main {

    public static void main(String[] args) {
        Operation<Integer> linkedList = new Operation<>();
        linkedList.addFirst(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.remove(1);
        System.out.println(linkedList.get(1));
        linkedList.printList();
    }
}
