package com.java.design.patterns.lab.atmv1.common;

import java.util.List;

public interface IOutputSource {

    void writeLine(String str);

    void writeLines(List<String> str);
}
