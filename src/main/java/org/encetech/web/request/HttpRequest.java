package org.encetech.web.request;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
  private Map<String, String> headers;
  private String body;
  private int statusCode;

  public HttpRequest(Map<String, String> headers, String body, int statusCode) {
    this.headers = headers;
    this.body = body;
    this.statusCode = statusCode;
  }

  public HttpRequest() {
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
      "HttpRequest [headers=" +
      headers +
      ", body=" +
      body +
      ", statusCode=" +
      statusCode +
      "]"
    );
  }
}
