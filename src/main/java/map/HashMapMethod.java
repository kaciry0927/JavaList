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
package map;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kaciry
 * @date 2020/11/26 15:16
 * @description HashMapMethod
 */
public class HashMapMethod {
    /*
        Tip:
        HashMap允许key和value都为null;key具有唯一性；
        HashMap与HashTable不同之处是，HashMap不同步，HashTable不允许key，value为null；
        HashMap无法保证Map中内容的顺序
    */
    public static void main(String[] args) {
        /**
         * The load factor used when none specified in constructor.
         * 默认负载因子为 0.75f
         */
        // static final float DEFAULT_LOAD_FACTOR = 0.75f;初始化容量为16
        /**
         * The default initial capacity - MUST be a power of two.
         * 必须为2的n次幂
         */
        //static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
        System.out.println("DEFAULT_INITIAL_CAPACITY: " + (1 << 4));
        //HashMap的扩容算法，0.75 * 16 = 12；那么也就是插入12 个数之后HashMap会发生扩容；
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("name", "ky");
        map.put("sex", "man");
        map.put("age", "24");
        map.put("pro", new Room("1", "2", "3", "4"));

        //输出顺序与put的不一致，HashMap无法保证Map中内容的顺序
        System.out.println(map);

        //map转json
        JSONObject jsonObject = new JSONObject(map);
        System.out.println(jsonObject);

        boolean containsKey = map.containsKey("age");
        boolean containsKey1 = map.containsKey("age1");
        System.out.println("containsKey age: " + containsKey);
        System.out.println("containsKey age1: " + containsKey1);

        //HashMap允许键值为null
        map.put(null, null);
        System.out.println(map);

        //Hashtable不允许
        //Hashtable hashtable = new Hashtable();
        //hashtable.put(null,null);
        //System.out.println(hashtable);

    }

}
