package com.java.design.patterns.lab.atmv3.validate;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Retention(RUNTIME)
@Target({
          ElementType.FIELD
})
public @interface ValidateList {

    int max();

    int min() default 1;
}
