package com.adobe.aem.guides.demo.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;

@Component(service=Servlet.class,immediate = true)
 @SlingServletResourceTypes(resourceTypes="/bin/krishna/resource") 
public class ArticleServlet extends SlingAllMethodsServlet {

    @Override
     protected void doGet(SlingHttpServletRequest request,SlingHttpServletResponse response)
     throws ServletException,IOException{
        response.getWriter().write("Response is coming from the Article Servlet -->GET");
     }
     @Override
     protected void doPut(SlingHttpServletRequest request,SlingHttpServletResponse response)
     throws ServletException,IOException{
        response.getWriter().write("Response is coming from the Article Servlet -->PUT");
     }
     @Override
     protected void doPost(SlingHttpServletRequest request,SlingHttpServletResponse response)
     throws ServletException,IOException{
        response.getWriter().write("Response is coming from the Article Servlet -->POST");
     }
     @Override
     protected void doDelete(SlingHttpServletRequest request,SlingHttpServletResponse response)
     throws ServletException,IOException{
        response.getWriter().write("Response is coming from the Article Servlet -->DELETE");
     }
    
}

