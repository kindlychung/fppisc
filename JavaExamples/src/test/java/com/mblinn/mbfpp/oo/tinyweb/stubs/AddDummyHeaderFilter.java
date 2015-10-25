/***
 * Excerpted from "Functional Programming Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/mbfpp for more book information.
***/
package com.mblinn.mbfpp.oo.tinyweb.stubs;

import com.mblinn.oo.tinyweb.Filter;
import com.mblinn.oo.tinyweb.HttpRequest;

public class AddDummyHeaderFilter implements Filter {

	@Override
  public HttpRequest doFilter(HttpRequest request) {
		return HttpRequest.Builder.builderFrom(request).addHeader("dummyHeader", "dummyHeaderValue").build();
  }

}
