package com.wang.algorithm;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        testQueueLinkList();
    }

    /**
     * {@link QueueLinkList} 的测试方法
     */
    private static void testQueueLinkList() {
        QueueLinkList<String> queue = new QueueLinkList<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.add("5");
        queue.add("6");

        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();

        System.out.println(queue.getFirst());
        System.out.println(queue.getLast());


        for (String element : queue) {
            System.out.println(element);
        }



    }

    /**
     * {@link StackLinkList}的测试内容
     */
    private void testStackLinkList() {
        StackLinkList<String> stack = new StackLinkList<>();
        System.out.println("初始容量：" + stack.size());

        stack.add("1");
        stack.add("2");
        stack.add("3");
        stack.add("4");
        stack.add("5");
        stack.add("6");
        stack.add("7");
        stack.add("8");

        System.out.println("容量：" + stack.size());

        String remove = stack.remove();

        System.out.println("移除后容量：" + stack.size() + "<<被移除元素>>" + remove);


//        Iterator<String> iterator = stack.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        for (String element :
                stack) {
            System.out.println(element);
        }
    }

}
