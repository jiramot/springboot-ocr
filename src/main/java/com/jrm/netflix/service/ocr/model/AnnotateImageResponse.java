package com.jrm.netflix.service.ocr.model;

import java.util.List;

public class AnnotateImageResponse {
  private List<TextAnnotation> textAnnotations;

  public AnnotateImageResponse() {
  }

  public List<TextAnnotation> getTextAnnotations() {
    return textAnnotations;
  }

  public void setTextAnnotations(List<TextAnnotation> textAnnotations) {
    this.textAnnotations = textAnnotations;
  }
}
