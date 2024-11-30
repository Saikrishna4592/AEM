package com.adobe.aem.guides.demo.core.sevices;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true)
public class ArticleService {

    private static final Logger LOG=LoggerFactory.getLogger(ArticleService.class);

 
    @Activate
    public void activate()
    {
        LOG.info("ArticleService active() started");
    }
    @Deactivate
    public void deActivate()
    {
        LOG.info("ArticleService active() End");
    }
    @Modified
    public void update()
    {
        LOG.info("ArticleService active() update");
    }

}
