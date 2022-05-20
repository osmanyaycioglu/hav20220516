package com.java.design.patterns.structural.composite;

import java.util.List;

public class MyFile {

    protected List<MyFile> childs;
    private MyFile         parent;
    private String         name;

    public MyFile(final String nameParam) {
        super();
        this.name = nameParam;
    }

    public MyFile addFile(final MyFile fileParam) {
        return this;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public List<MyFile> getChilds() {
        return this.childs;
    }

    public void setChilds(final List<MyFile> childsParam) {
        this.childs = childsParam;
    }


    @Override
    public String toString() {
        return this.name;
    }

    public String toDir(final int level) {
        StringBuilder builderLoc = new StringBuilder();
        for (int iLoc = 0; iLoc < level; iLoc++) {
            builderLoc.append("\t");
        }
        builderLoc.append(this.name);
        builderLoc.append("\n");
        int nextLevel = level + 1;
        if (this.childs != null) {
            for (MyFile myFileLoc : this.childs) {
                builderLoc.append("\n");
                builderLoc.append(myFileLoc.toDir(nextLevel));
            }
        }
        return builderLoc.toString();
    }

    public MyFile getParent() {
        return this.parent;
    }

    public void setParent(final MyFile parentParam) {
        this.parent = parentParam;
    }
}
