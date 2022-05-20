package com.java.design.patterns.behavioral.memento;


public class Document {

    private String doc;
    private String name;
    private String desc;

    public String getDoc() {
        return this.doc;
    }

    public void setDoc(final String docParam) {
        this.doc = docParam;
    }

    public String getName() {
        return this.name;
    }


    public String getDesc() {
        return this.desc;
    }

    public DocumentMemento backup() {
        DocumentMemento documentMementoLoc = new DocumentMemento();
        documentMementoLoc.setDoc(this.doc);
        return documentMementoLoc;
    }

    public void restore(final DocumentMemento memento) {
        this.doc = memento.getDoc();
    }
}
