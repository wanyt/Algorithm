package com.wang.algorithm;

import java.util.Iterator;

/**
 * Created on 2018/5/16 下午10:55
 * <p>
 * author wang
 * <p>
 * Description: 本类代码是基于单链表实现的队列
 * <p>
 * Remarks: 队列是先进先出的数据结构模型
 * 比如，先排队的人先进站
 */
public class QueueLinkList<Item> implements Iterable<Item> {

    private int size;

    private Node first;

    public Item getFirst() {
        return first.item;
    }

    public Item getLast() {
        return last.item;
    }

    private Node last;

    /**
     * 是否为空
     */
    public boolean isEmpty() {
        return size <= 0;
    }

    /**
     * 当前的容量
     */
    public int size() {
        return size;
    }

    /**
     * 添加元素，添加到队列的尾部
     * 最后一个元素的next指向当前被添加的元素
     */
    public void add(Item addItem) {
        Node newLast = new Node();
        newLast.item = addItem;
        if (last != null) {
            last.next = newLast;
        }
        last = newLast;
        size++;

        if (size == 1) {
            first = newLast;
        }
    }

    /**
     * 移除元素，从队列的头部移除元素
     * 获取到第二个元素准备作为新的第一个元素
     * 把第一个元素的next置为null
     * 把第二个元素置为第一个元素
     */
    public void remove() {
        if (size <= 0) {
            return;
        }

        if (size == 1) {
            first = null;
            return;
        }

        Node newFirst = first.next;
        first.next = null;
        first = newFirst;
        size--;
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {

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
        };
    }

    /**
     * 结点，节点内包含当前结点的元素，以及下个结点的索引
     */
    class Node {
        Item item;
        Node next;
    }

}
