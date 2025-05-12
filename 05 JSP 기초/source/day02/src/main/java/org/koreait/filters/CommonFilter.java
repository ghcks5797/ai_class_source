package org.koreait.filters;

import jakarta.servlet.*;

import java.io.IOException;

public class ComminFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        chain.doFilter(request, request);

    }
}
