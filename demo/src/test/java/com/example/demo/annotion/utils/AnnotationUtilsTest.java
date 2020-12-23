package com.example.demo.annotion.utils;

import com.example.demo.annotion.AnnotationTestDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnnotationUtilsTest {

    @Test
    void annotationTest() throws IllegalAccessException {
        AnnotationUtils.analysisAnnotation(new AnnotationTestDto());
    }

}