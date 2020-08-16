package io.api.gateway.zuul.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class Routefilters extends ZuulFilter{
	
	private Logger logger=LoggerFactory.getLogger(Routefilters.class);

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		HttpServletRequest requestctx=RequestContext.getCurrentContext().getRequest();
		logger.info("Route-Filters:"+requestctx.getRequestURI());
		return null;
	}

	@Override
	public String filterType() {
		return "Route-Filters";
	}

	@Override
	public int filterOrder() {
		return 2;
	}

}
