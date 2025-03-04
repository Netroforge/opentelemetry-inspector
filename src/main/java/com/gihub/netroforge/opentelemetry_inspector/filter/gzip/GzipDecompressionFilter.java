package com.gihub.netroforge.opentelemetry_inspector.filter.gzip;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebFilter
public class GzipDecompressionFilter implements Filter {
    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain
    ) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        if ("gzip".equalsIgnoreCase(httpRequest.getHeader("Content-Encoding"))) {
            GzipHttpServletRequestWrapper decompressedRequest = new GzipHttpServletRequestWrapper(httpRequest);
            chain.doFilter(decompressedRequest, response);
        } else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void init(FilterConfig filterConfig) {
        // Initialization code, if needed
    }

    @Override
    public void destroy() {
        // Cleanup code, if needed
    }
}