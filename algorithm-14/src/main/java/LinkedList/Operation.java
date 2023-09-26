package LinkedList;

/**
 * @Author 彬哥，邮箱：13450770408@163.com
 * @Description  链表的相关操作
 * @Date 2023-09-26 14:10
 * github:https://github.com/china-sebastian
 */
public class Operation <T> implements IOperation<T>{


    private Node<T> first = null;
    private Node<T> last = null;
    private int size;
    Operation(){
        System.out.println("调用Operation无参构造函数");
    }

    /**
     *  1.头插节点
     * @param elem
     */
    private void linkFirst(T elem) {
        final Node<T> f = first;
        Node<T> newNode = new Node<>(null,elem,f);
        first = newNode;
        if(f == null) {
            last = newNode;
        } else {
            f.prev = newNode;
        }
        size++;
    }

    /**
     *  2.尾插节点
     * @param elem
     */
    private void linkLast(T elem) {
        final Node<T> l = last;
        Node<T> newNode = new Node<>(l,elem,null);
        last = newNode;
        if(l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    /**
     * 3.拆链操作
     * @param node
     * @return
     */
    private T unlink(Node<T> node) {
        final T elem = node.elem;
        final Node<T> next = node.next;
        final Node<T> prev = node.prev;
        if(prev == null) {
            first = next;
        } else {
            prev.next = next;
            node.prev = null;
        }

        if(next == null) {
            last = prev;
        } else {
            next.prev = prev;
            node.next = null;
        }
        node.elem = null;
        size--;
        return elem;


    }

    /**
     * 4.删除节点
     * @param obj
     */
    private boolean remove01(Object obj) {
        if(obj == null) {
            for(Node<T> node = first; node != null; node = node.next) {
                if(node.elem == null) {
                    unlink(node);
                    return true;
                }
            }
        } else {
            for(Node<T> node = first; node != null; node = node.next) {
                if(obj.equals(node.elem)) {
                    unlink(node);
                    return true;
                }
            }
        }

        return false;
    }

    public Node<T> node(int index) {
        if(index < (size >> 1)) {
            Node<T> x = first;
            for(int i = 0; i < index; i++) {
                x = x.next;
            }
            return x;
        } else {
            Node<T> x = last;
            for(int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
        }
    }

    @Override
    public void add(T elem) {
        linkLast(elem);
    }

    /**
     * 头插
     * @param elem
     */
    @Override
    public void addFirst(T elem) {
        linkFirst(elem);
    }

    /**
     * 尾插
     * @param elem
     */
    @Override
    public void addLast(T elem) {
        linkLast(elem);
    }

    /**
     * 删除元素
     * @param elem
     * @return
     */
    @Override
    public boolean remove(T elem){
        return remove01(elem);
    }

    @Override
    public T get(int index) {

        return node(index - 1).elem;
    }

    @Override
    public void printList() {
        Node<T> f = first;
        System.out.print("列表中的元素总共有" + size + "个, 分别是:");
        while(f!=null) {
            System.out.print(f.elem + " ");
            f = f.next;
        }
        System.out.println();
    }
}
