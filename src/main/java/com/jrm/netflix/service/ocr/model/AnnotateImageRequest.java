package com.jrm.netflix.service.ocr.model;

import java.util.Arrays;
import java.util.List;

public class AnnotateImageRequest {
  private List<ImageFeature> features;
  private ImageContext imageContext;
  private Image image;

  public AnnotateImageRequest() {
  }

  public AnnotateImageRequest(Image image) {
    this.features = Arrays.asList(new ImageFeature());
    this.imageContext = new ImageContext();
    this.image = image;
  }

  public List<ImageFeature> getFeatures() {
    return features;
  }

  public void setFeatures(List<ImageFeature> features) {
    this.features = features;
  }

  public ImageContext getImageContext() {
    return imageContext;
  }

  public void setImageContext(ImageContext imageContext) {
    this.imageContext = imageContext;
  }

  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }
}
