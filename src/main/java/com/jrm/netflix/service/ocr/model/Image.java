package com.jrm.netflix.service.ocr.model;

public class Image {
  private String content;

  public Image() {
  }

  public Image(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
