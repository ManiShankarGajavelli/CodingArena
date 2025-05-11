package org.codearena.annnotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ProblemMetadata {
    String[] tags();
    String difficulty();

    String title() default "";
    String link() default "";

    String problemId() default "-1";
}
