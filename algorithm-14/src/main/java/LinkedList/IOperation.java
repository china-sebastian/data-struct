package LinkedList;

/**
 * @Author 彬哥，邮箱：13450770408@163.com
 * @Description
 * @Date 2023-09-26 14:56
 * github:https://github.com/china-sebastian
 */
public interface IOperation<T> {

    void add(T elem);
    /**
     * 头插
     * @param elem
     */
    void addFirst(T elem);

    /**
     * 尾插
     * @param elem
     */
    void addLast(T elem);

    /**
     * 删除元素
     * @param elem
     * @return
     */
    boolean remove(T elem);

    /**
     * 获取指定位置的元素
     * @param index
     * @return
     */
    T get(int index);

    /**
     * 打印元素列表
     */
    void printList();

}
