package com.java.design.patterns.behavioral.memento;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HistoryManager {

    private final Map<String, CareTaker> careTakerMap = new ConcurrentHashMap<>();

    public void addHistory(final Document document) {
        CareTaker careTakerLoc = this.careTakerMap.get(document.getName());
        if (careTakerLoc == null) {
            careTakerLoc = new CareTaker();
            this.careTakerMap.put(document.getName(),
                                  careTakerLoc);
        }
        careTakerLoc.addHistory(document);
    }

    public Document undo(final Document document) {
        CareTaker careTakerLoc = this.careTakerMap.get(document.getName());
        if (careTakerLoc == null) {
            return null;
        }
        careTakerLoc.undo(document);
        return document;
    }

    public Document restoreHistory(final Document document,
                                   final int index) {
        CareTaker careTakerLoc = this.careTakerMap.get(document.getName());
        if (careTakerLoc == null) {
            return null;
        }
        careTakerLoc.restoreHistory(document,
                                    index);
        return document;
    }
}
