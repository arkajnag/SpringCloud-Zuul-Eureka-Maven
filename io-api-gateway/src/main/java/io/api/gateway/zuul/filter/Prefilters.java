package io.api.gateway.zuul.filter;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class Prefilters extends ZuulFilter{

	private Logger logger=LoggerFactory.getLogger(Prefilters.class);

	@Override
	public boolean shouldFilter() {
		logger.info("Filtering Prefilter request");
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx=RequestContext.getCurrentContext();
		HttpServletRequest servletRequest=ctx.getRequest();
		logger.info("Pre-filter - and Request Details:"+servletRequest.getMethod()+" and Request URI:"+servletRequest.getRequestURI());
		return null;
	}

	@Override
	public String filterType() {
		return "Pre-Filter";
	}

	@Override
	public int filterOrder() {
		return 1;
	}
}
