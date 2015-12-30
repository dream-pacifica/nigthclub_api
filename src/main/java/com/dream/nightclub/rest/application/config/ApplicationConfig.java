/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dream.nightclub.rest.application.config;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

/**
 * アプリケーションコンフィグ
 * 
 * @author masaya.tezuka
 */
@javax.ws.rs.ApplicationPath("webresource")
public class ApplicationConfig extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.dream.nightclub.rest.CastResource.class);
    }
}
