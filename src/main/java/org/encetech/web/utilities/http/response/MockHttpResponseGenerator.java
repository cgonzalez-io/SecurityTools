package org.encetech.web.utilities.http.response;

import java.util.Objects;
import org.encetech.web.utilities.http.request.HttpRequest;

public class MockHttpResponseGenerator {
  public static String body;

  public MockHttpResponseGenerator(String calloutString) {
    if (Objects.equals(calloutString, "Search")) {
      body =
        "{\"noteResultTO\":{\"id\":\"1808222\",\"totalPages\":1,\"lastPageRecd\":1}}";
    } else if (Objects.equals(calloutString, "Read")) {
      body =
        "{\"noteResultTO\":{\"id\":\"1808222\",\"totalPages\":1,\"lastPageRecd\":1}}";
    } else if (Objects.equals(calloutString, "FlagMessages")) {
      body =
        "{\"noteResultTO\":{\"id\":\"1808222\",\"totalPages\":1,\"lastPageRecd\":1}}";
    } else if (Objects.equals(calloutString, "Write")) {
      body =
        "{\"noteResultTO\":{\"id\":\"1808222\",\"totalPages\":1,\"lastPageRecd\":1}}";
    } else if (Objects.equals(calloutString, "Registration")) {
      body =
        "{\"textTO\":{\"text\":\"Success : EncounterString : 2289;3210824.131819;A\"},\"noteResultTO\":{\"id\":\"1808222\",\"totalPages\":1,\"lastPageRecd\":1}}";
    }
  }

  public HttpResponse sendResponse(HttpRequest request) {
    HttpResponse response = new HttpResponse();
    response.setHeader("Content-Type", "application/json");
    response.setBody(body);
    response.setStatusCode(200);
    return response;
  }
}
