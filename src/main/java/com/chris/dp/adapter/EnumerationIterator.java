package com.chris.dp.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 枚举迭代器
 *
 * @author zhangh
 * @date 2022/03/14
 */
public class EnumerationIterator implements Iterator {

    private Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
}
