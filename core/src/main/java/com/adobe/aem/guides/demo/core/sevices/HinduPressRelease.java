package com.adobe.aem.guides.demo.core.sevices;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate=true)
public class HinduPressRelease {

    private static final Logger LOG=LoggerFactory.getLogger(HinduPressRelease.class);

     @Reference
     HinduArticleService has;
     
     @Activate
    public void activate()
    {
         String result= has.printData();
        LOG.info("HinduPressRelease active() started");

        LOG.info("result{}",result);

        
    }
    @Deactivate
    public void deActivate()
    {
        LOG.info("HinduPressRelease deactive() End");
    }
    @Modified
    public void modify()
    {
        LOG.info("HinduPressRelease() update");
  }

}