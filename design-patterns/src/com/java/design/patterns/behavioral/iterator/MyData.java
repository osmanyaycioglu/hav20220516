package com.java.design.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyData implements Iterable<String> {

    private final List<String> datas = new ArrayList<>();
    private String             name;

    @Override
    public Iterator<String> iterator() {
        return this.datas.iterator();
    }

    public void add(final String stringParam) {
        this.datas.add(stringParam);
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public IMyIterator<String> getMyIterator() {
        return new DataIterator();
    }

    public class DataIterator implements IMyIterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return MyData.this.datas.size() > this.index;
        }

        @Override
        public String getNext() {
            String retVal = MyData.this.datas.get(this.index);
            this.index++;
            return retVal;
        }

    }


}
