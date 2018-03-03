package com.jrm.netflix.service.ocr.model;


import java.util.List;

public class ListAnnotateImageRequest {
  private List<AnnotateImageRequest> requests;

  public ListAnnotateImageRequest() {
  }

  public ListAnnotateImageRequest(List<AnnotateImageRequest> requests) {
    this.requests = requests;
  }

  public List<AnnotateImageRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<AnnotateImageRequest> requests) {
    this.requests = requests;
  }
}
