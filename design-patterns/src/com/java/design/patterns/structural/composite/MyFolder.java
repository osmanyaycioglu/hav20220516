package com.java.design.patterns.structural.composite;

import java.util.ArrayList;

public class MyFolder extends MyFile {

    public MyFolder(final String nameParam) {
        super(nameParam);
    }

    @Override
    public MyFile addFile(final MyFile fileParam) {
        if (this.childs == null) {
            this.childs = new ArrayList<>();
        }
        this.childs.add(fileParam);
        fileParam.setParent(this);
        return this;
    }
}
