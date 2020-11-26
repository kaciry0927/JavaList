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
 * @description
 */
public class HashMapMethod {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "ky");
        map.put("sex", "man");
        map.put("age", "24");
        map.put("pro", new Room("1", "2", "3", "4"));

        System.out.println(map);

        //map转json
        JSONObject jsonObject = new JSONObject(map);
        System.out.println(jsonObject);

        boolean containsKey = map.containsKey("age");
        boolean containsKey1 = map.containsKey("age1");
        System.out.println("containsKey age: " + containsKey);
        System.out.println("containsKey age1: " + containsKey1);

    }

}
