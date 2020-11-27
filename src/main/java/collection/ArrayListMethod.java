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
 * @date 2020/11/26 10:55
 * @description
 */
public class ArrayListMethod {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("java");
        arrayList.add("java");
        arrayList.add("java");
        arrayList.add("java");
        System.out.println("Original List: " + arrayList);
        //strings.remove(0);
        //只能删除一个对象
        arrayList.remove("java");
        System.out.println(arrayList);
        boolean b = arrayList.contains("java");
        System.out.println("contains: " + b);
        //LinkedHashSet去重
        arrayList.add("java");
        arrayList.add("java");
        arrayList.add("java");
        arrayList.add("C#");
        arrayList.add("C#");
        arrayList.add("C#");
        arrayList.add("C");
        arrayList.add(null);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(arrayList);
        arrayList.clear();
        arrayList.addAll(linkedHashSet);
        System.out.println("LinkedHashSet: " + arrayList);
        //根据index获取数据
        System.out.println(arrayList.get(1));

        //包含所有
        List<String> tmp = new ArrayList<>();
        tmp.add("java");
        tmp.add("C");
        boolean containsAll = arrayList.containsAll(tmp);
        System.out.println("containsAll: " + containsAll);

        int hashCode = arrayList.hashCode();
        System.out.println(hashCode);

        //返回index
        int indexOf = arrayList.indexOf("C");
        System.out.println(indexOf);

        //取交集，arrayList和tmp共有的元素
        tmp.add("a");
        arrayList.retainAll(tmp);
        System.out.println(arrayList);

        //foreach循环
        for (String s : arrayList) {
            System.out.println(s);
        }

        //Iterator遍历
        Iterator iter = arrayList.iterator();
        while (iter.hasNext()) {
            System.out.println((String) iter.next());
        }

        // 将ArrayList转换为数组
        //new String[0]是为了节省空间
        String[] arr = arrayList.toArray(new String[0]);
        for (String str : arr)
            System.out.println("str: " + str);

        //removeAll是为了删除某个集合里面有的元素，clear是为了删除所有元素。
        arrayList.add("Python");
        arrayList.removeAll(tmp);
        System.out.println("removeAll: " + arrayList);

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer("1");
        arrayDeque.poll();
        System.out.println(arrayDeque.isEmpty());


    }
}
