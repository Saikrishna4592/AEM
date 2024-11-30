package com.adobe.aem.guides.demo.core.sevices;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service =HinduArticleService.class ,immediate = true,enabled = true)
public class HinduArticleService {

    private static final Logger LOG=LoggerFactory.getLogger(HinduArticleService.class);

     @Activate
    public void activate()
    {
        LOG.info("HinduArticleService active() started");
    }
    @Deactivate
    public void deActivate()
    {
        LOG.info("HinduArticleService deactive() End");
    }
    @Modified
    public void modify()
    {
        LOG.info("HinduArticleService modify() update");
    }
    public String printData() 
    {
       return "print data of HinduPressRelease" ;

   }

}