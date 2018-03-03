package com.jrm.netflix.service.ocr.model;

public class TextAnnotation {
  private String locale;
  private String description;

  public TextAnnotation() {
  }

  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
