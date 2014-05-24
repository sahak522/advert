package com.advert.admin.web;

import com.advert.admin.web.pages.AdminLandingPage;
import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 * Created by sahak_000 on 24.05.2014.
 */
public class AdminApplication extends WebApplication {

    @Autowired
    private ApplicationContext ctx;

    @Override
    public Class<? extends Page> getHomePage() {
        return AdminLandingPage.class;
    }
}
