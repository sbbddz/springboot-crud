package com.sbdiaz.proyectosistemas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

class ResponseData {
  public String translatedText;
}

class Result {
  public ResponseData responseData;
}

@Service
public class TraduceService {

  final String BASEURL = "https://api.mymemory.translated.net/get?q=";

  @Autowired
  RestTemplate restTemplate;

  public String translateToEnglish(String word) {
    String parsedURL = BASEURL + word + "&langpair=es|en";
    Result result = restTemplate.getForObject(parsedURL, Result.class);
    return result.responseData.translatedText;
  }

}
