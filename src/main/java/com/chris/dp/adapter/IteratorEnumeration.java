package com.chris.dp.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 迭代器枚举
 *
 * @author zhangh
 * @date 2022/03/14
 */
public class IteratorEnumeration implements Enumeration {

    private Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
