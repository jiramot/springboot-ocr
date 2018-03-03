package com.jrm.netflix.service.ocr.model;

public class ImageFeature {
  private String type = "TEXT_DETECTION";
  private int maxResults = 10;

  public ImageFeature() {
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(int maxResults) {
    this.maxResults = maxResults;
  }
}
