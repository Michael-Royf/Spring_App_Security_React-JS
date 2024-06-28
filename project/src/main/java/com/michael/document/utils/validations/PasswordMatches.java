package com.michael.document.utils.validations;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy =  PasswordMatchesValidator.class)
@Documented
public @interface PasswordMatches {
    //  String message() default  "Password do not match";
    String message() default  "Password mismatch";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}