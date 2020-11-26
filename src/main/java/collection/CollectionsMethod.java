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
import java.util.Collections;
import java.util.List;

/**
 * @author kaciry
 * @date 2020/11/26 09:39
 * @description  CollectionsMethod
 */
public class CollectionsMethod {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //Collections工具类，添加方法
        Collections.addAll(list,1,2,9,4,5,6,7);

        //排序方法
        Collections.sort(list);
        System.out.println("sort: " + list);

        //交换index
        Collections.swap(list,1,3);
        System.out.println("swap: " + list);

        //倒序
        Collections.reverse(list);
        System.out.println("reverse: " + list);

        //随机置换
        Collections.shuffle(list);
        System.out.println("shuffle: " + list);

        //二分法查找，先排序，否则可能是负数
        Collections.sort(list);
        System.out.println("sort first: " + list);
        System.out.println("binarySearch index: " + Collections.binarySearch(list, 5));

        //static void copy(List dest, List src) :是把源列表中的数据覆盖到目标列表 list2 <- list
        //注意：目标列表的长度至少等于源列表的长度
        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2,8,2,6,1,3,7,3,72,4,8);
        Collections.copy(list2,list);
        System.out.println("list2: " + list2);

        //最大值
        System.out.println("max: " + Collections.max(list));


        //返回大小为n的List，List不可改变,其中的所有引用都指向o
        System.out.println(Collections.nCopies(5, "hello"));

        //用指定元素填充所有元素
        Collections.fill(list,0);
        System.out.println("fill: " + list);

    }
}
