/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2020 kaciry@126.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package collection;

import java.util.*;

/**
 * @author kaciry
 * @date 2020/11/26 11:54
 * @description LinkedListMethod
 */
public class LinkedListMethod {
    public static void main(String[] args) {


        /**
         * LinkedList 的迭代器都是 fail-fast 的: 如果在并发环境下，
         * 其他线程使用迭代器以外的方法修改数据，会导致 ConcurrentModificationException.
        **/


        List<String> linkedList = Collections.synchronizedList(new LinkedList<>());
        linkedList.add("Java");
        linkedList.add("C++");
        linkedList.add("C");
        //允许为null
        linkedList.add(null);
        //会替换该位置的元素
        linkedList.set(2,"set");
        System.out.println("set: " + linkedList);

        //指定位置添加元素
        linkedList.add(0,"add");
        System.out.println("add:" + linkedList);

        linkedList.remove(0);
        System.out.println("remove: " + linkedList);

        //实现队列
        Queue<String> queue = new LinkedList<>();
        //尾部添加元素 add offer
        //add()会在长度不够时抛出异常：IllegalStateException;  offer()则不会,只返回false
        queue.add("1");
        queue.offer("2");
        queue.add("3");
        System.out.println(queue);

        //查看头部元素 (element, peek)，返回头部元素，但不改变队列
        //element()会在没元素时抛出异常：NoSuchElementException;  peek()返回null;
        System.out.println("element: " + queue.element());
        System.out.println("peek: " + queue.peek());

        //删除头部元素 (remove, poll)，返回头部元素，并且从队列中删除
        //remove()会在没元素时抛出异常：NoSuchElementException;  poll()返回null;
        queue.poll();
        queue.poll();
        queue.poll();
        //当前只有3个，poll不会抛异常
        queue.poll();
        try {
            //当前已无对象
            queue.remove();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(queue);



        //双端队列
        Deque<String> deque = new LinkedList<>();

        //add与queue一样
        deque.add("1");
        deque.add("2");
        deque.add("3");
        deque.offer("3");
        //从此deque中删除指定元素的第一个匹配项。
        deque.removeFirstOccurrence("3");
        deque.removeLastOccurrence("3");
        //在头部add
        deque.addFirst("0");
        //在尾部add
        deque.addLast("-1");

        //取出第一个元素，不抛异常
        String pollFirst = deque.pollFirst();
        System.out.println("pollFirst: " + pollFirst);
        //同上，抛异常
        deque.pop();

        //头部入栈，无空间抛异常
        deque.push("-0");
        System.out.println("Contains '-1' ? " + deque.contains("-1"));

        System.out.println(deque);
    }
}
