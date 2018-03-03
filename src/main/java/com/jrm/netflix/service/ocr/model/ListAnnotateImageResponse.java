package com.jrm.netflix.service.ocr.model;

import java.util.List;

public class ListAnnotateImageResponse {
  private List<AnnotateImageResponse> responses;

  public ListAnnotateImageResponse() {
  }

  public ListAnnotateImageResponse(List<AnnotateImageResponse> responses) {
    this.responses = responses;
  }

  public List<AnnotateImageResponse> getResponses() {
    return responses;
  }

  public void setResponses(List<AnnotateImageResponse> responses) {
    this.responses = responses;
  }
}
