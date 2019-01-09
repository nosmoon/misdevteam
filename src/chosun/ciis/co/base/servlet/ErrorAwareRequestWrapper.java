package chosun.ciis.co.base.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class ErrorAwareRequestWrapper extends HttpServletResponseWrapper {
    /**  
     * Default Constructor.   
     * @param httpServletResponse  
     */  
    public ErrorAwareRequestWrapper(HttpServletResponse httpServletResponse) {   
        super(httpServletResponse);   
    }   
    
    /**  
     * Intercepting the errorCode and determing the kind of error using  
     * the errorCode.      
     * @param errorCode - The error status code   
     * @throws IOException  
     */  
    public void sendError(int errorCode) throws IOException {   
    	System.out.println("ENTERING THE SENDERROR:" +errorCode);   
        if (errorCode == HttpServletResponse.SC_INTERNAL_SERVER_ERROR){   
            throw new RuntimeException();     
        }   
           
        super.sendError(errorCode);   
    }   
}
