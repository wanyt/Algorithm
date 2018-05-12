package com.wang.algorithm;

import java.util.Iterator;

/**
 * Created on 2018/5/10 下午11:50
 * <p>
 * author wang
 * <p>
 * Description: 单链表实现的栈
 * <p>
 * Remarks: 栈是一种先进后出/后进先出的数据结构
 * 比如，桌子上放置的一叠文件，新文件总会被放到最上面；
 * 电子邮箱里面的邮件，最新的也是在最上面。
 */
public class StackLinkList<Item> implements Iterable<Item> {

    private int size = 0;
    private Node first;

    /**
     * @return 栈是否为空
     */
    public boolean isEmpty() {
        return size <= 0;
    }

    /**
     * @return 获取栈的size
     */
    public int size() {
        return size;
    }

    /**
     * 添加一个元素
     * <p>
     * 根据栈的特性，被添加的新元素一定是位于栈顶（第一个）
     * 并且它指向被添加之前的栈顶元素
     *
     * @param item 被添加的元素
     */
    public void add(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        size++;
    }

    /**
     * 删除一个元素
     * <p>
     * 根据栈的特性，被删除的元素一定是位于栈顶的元素
     * 删除后第二个元素成为栈顶的元素
     */
    public Item remove() {
        Item removed = first.item;
        first = first.next;
        size--;
        return removed;
    }

    @Override
    public Iterator<Item> iterator() {
        return new StackIterator();
    }

    /**
     * 可以被遍历，迭代
     */
    class StackIterator implements Iterator<Item> {

        Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }


    /**
     * 结点
     */
    class Node {
        Item item; //当前的内容
        Node next; //下一个结点的引用
    }

}
