package com.jrm.netflix.service.ocr.controller;

import com.jrm.netflix.service.ocr.client.GoogleVisionClient;
import com.jrm.netflix.service.ocr.config.GoogleConfig;
import com.jrm.netflix.service.ocr.model.AnnotateImageRequest;
import com.jrm.netflix.service.ocr.model.Image;
import com.jrm.netflix.service.ocr.model.ListAnnotateImageRequest;
import com.jrm.netflix.service.ocr.model.ListAnnotateImageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RestController
public class HelloControlelr {

  @Autowired
  private GoogleConfig googleConfig;

  @PostMapping(value = "/")
  public ListAnnotateImageResponse orc(@RequestBody Image image) throws IOException {
    GoogleVisionClient googleVisionClient = new GoogleVisionClient(googleConfig);
    List<AnnotateImageRequest> requests = Arrays.asList(new AnnotateImageRequest(image));
    return googleVisionClient.ocr(new ListAnnotateImageRequest(requests));
  }
}
