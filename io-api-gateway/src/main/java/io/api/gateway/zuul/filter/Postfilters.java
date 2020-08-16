package io.api.gateway.zuul.filter;

import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class Postfilters extends ZuulFilter{
	
	private Logger logger=LoggerFactory.getLogger(Postfilters.class);

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		HttpServletResponse response=RequestContext.getCurrentContext().getResponse();
		logger.info("Post-Filter -  and Response Details:"+response.getStatus());
		return null;
	}

	@Override
	public String filterType() {
		return "Post-Filter";
	}

	@Override
	public int filterOrder() {
		return 3;
	}

}
