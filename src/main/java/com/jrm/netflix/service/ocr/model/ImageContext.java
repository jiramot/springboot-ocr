package com.jrm.netflix.service.ocr.model;

import java.util.Arrays;
import java.util.List;

public class ImageContext {
  private List<String> languageHints = Arrays.asList("en", "th");

  public ImageContext() {
  }

  public List<String> getLanguageHints() {
    return languageHints;
  }

  public void setLanguageHints(List<String> languageHints) {
    this.languageHints = languageHints;
  }
}
