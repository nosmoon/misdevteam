package chosun.ciis.co.base.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class ErrorHandlerFilter implements Filter {

    /*   
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)  
     */  
    public void init(FilterConfig arg0) throws ServletException {   
    }   
    
       
    /*   
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)  
     */  
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,   
            FilterChain filterChain) throws IOException, ServletException {   
    
        HttpServletResponse response = (HttpServletResponse) servletResponse;   
           
        if (!(response instanceof ErrorAwareRequestWrapper)) {   
            response = new ErrorAwareRequestWrapper(response);   
        }   
    
        filterChain.doFilter(servletRequest, response);   
    
  
    }   
    
    /*   
     * @see javax.servlet.Filter#destroy()  
     */      
    public void destroy() {   
           
    
    }  
}
