package com.wang.algorithm;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

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
