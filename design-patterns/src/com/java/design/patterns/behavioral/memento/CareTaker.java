package com.java.design.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private final List<DocumentMemento> history = new ArrayList<>();

    public void addHistory(final Document document) {
        this.history.add(document.backup());
    }

    public Document undo(final Document document) {
        DocumentMemento documentMementoLoc = this.history.get(this.history.size() - 1);
        document.restore(documentMementoLoc);
        return document;
    }

    public Document restoreHistory(final Document document,
                                   final int index) {
        DocumentMemento documentMementoLoc = this.history.get(index);
        document.restore(documentMementoLoc);
        return document;
    }


}
