package com.jrm.netflix.service.ocr.client;

import com.jrm.netflix.service.ocr.config.GoogleConfig;
import com.jrm.netflix.service.ocr.model.ListAnnotateImageRequest;
import com.jrm.netflix.service.ocr.model.ListAnnotateImageResponse;
import org.springframework.web.client.RestTemplate;

public class GoogleVisionClient {

  private GoogleConfig googleConfig;

  public GoogleVisionClient(GoogleConfig googleConfig) {
    this.googleConfig = googleConfig;
  }

  public ListAnnotateImageResponse ocr(ListAnnotateImageRequest requests) {
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://vision.googleapis.com/v1/images:annotate?key=" + googleConfig.key;
    return restTemplate.postForObject(url, requests, ListAnnotateImageResponse.class);
  }
}
