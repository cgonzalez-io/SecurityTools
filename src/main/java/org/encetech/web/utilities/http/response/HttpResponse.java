package org.encetech.web.utilities.http.response;

import java.util.HashMap;
import java.util.Map;

public class HttpResponse {
  private Map<String, String> headers;
  private String body;
  private int statusCode;

  public HttpResponse(
    Map<String, String> headers,
    String body,
    int statusCode
  ) {
    this.headers = headers;
    this.body = body;
    this.statusCode = statusCode;
  }

  public HttpResponse() {
    this.headers = new HashMap<>();
  }

  public void setHeader(String key, String value) {
    this.headers.put(key, value);
  }

  public void setBody(String body) {
    this.body = body;
  }

  public void setStatusCode(int statusCode) {
    this.statusCode = statusCode;
  }

  // getters
  public Map<String, String> getHeaders() {
    return headers;
  }

  public String getBody() {
    return body;
  }

  public int getStatusCode() {
    return statusCode;
  }

  // Optional: You might want to override toString method for testing or debugging
  @Override
  public String toString() {
    return (
      "HttpResponse [headers=" +
      headers +
      ", body=" +
      body +
      ", statusCode=" +
      statusCode +
      "]"
    );
  }
}
