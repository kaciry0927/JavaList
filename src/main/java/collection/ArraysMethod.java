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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author kaciry
 * @date 2020/11/27 17:26
 * @description
 */
public class ArraysMethod implements InterfaceTest {

    public static void main(String[] args) {
        int[] num = new int[9];

        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }

        //输出int[]
        System.out.println("int[] num: " + Arrays.toString(num));

        //Java8新特性，int[]转化为Integer[]
        Integer[] integers = Arrays.stream(num).boxed().toArray(Integer[]::new);
        //Integer[]转化为List<Integer>
        List<Integer> listInteger = Arrays.asList(integers);
        System.out.println("List<Integer> listInteger: " + listInteger);

        //int[]转化为List<Integer>
        List<Integer> list = new ArrayList<>();
        for (int value : num) {
            list.add(value);
        }

        Collections.shuffle(list);

        System.out.println("Collections.shuffle(list): " + list);

        // List<Integer> 转成 int[]
        int[] ints = list.stream().mapToInt(Integer::valueOf).toArray(); // 转成流 再转成Integer[] 再转int
        System.out.println("int[] ints: " + Arrays.toString(ints));

        String[] strings = new String[1];
        strings[0] = "asd";
        List<String> stringList = Arrays.asList(strings);
        System.out.println("List<String> stringList: " + stringList);

        Integer[] integers1 = new Integer[1];
        integers1[0] = 99999;
        //Arrays.asList(args) 的args不可以为基本对象，如int、byte、boolean
        List<Integer> integerList = Arrays.asList(integers1);
        System.out.println("List<Integer> integerList" + integerList);

        Arrays.sort(ints);
        System.out.println("Arrays.sort(ints): " + Arrays.toString(ints));

        //这里的stream是接口里的默认方法default修饰的，Java8之后的新特性。接口里可以有default和static修饰的方法。
        long[] longs = Arrays.stream(ints).mapToLong(Long::valueOf).toArray();
        System.out.println(Arrays.toString(longs));

        //尝试
        ArraysMethod arraysMethod = new ArraysMethod();
        System.out.println(arraysMethod.interfaceTest());

    }
}
