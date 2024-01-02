package com.example;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.annotation.Filter;
import io.micronaut.http.filter.HttpServerFilter;
import io.micronaut.http.filter.ServerFilterChain;
import io.micronaut.http.filter.ServerFilterPhase;
import lombok.RequiredArgsConstructor;
import org.reactivestreams.Publisher;


@Filter("/**")
@RequiredArgsConstructor
public class AuthFilter implements HttpServerFilter {

  private final User user;
  /**
   * Filter order is set here so that it runs after the security step.
   *
   * @return The required position in the filter order.
   */
  @Override
  public int getOrder() {
    return ServerFilterPhase.SECURITY.after();
  }

  /**
   * Obtain the Authentication object from the request attributes, and set the fields in
   * identity(RequestScoped).
   *
   * @param request The request
   * @param chain The chain
   */
  @Override
  public Publisher<MutableHttpResponse<?>> doFilter(
      HttpRequest<?> request, ServerFilterChain chain) {
//    System.out.println("user.getName():"+user.getName());
    return chain.proceed(request);
  }

}
