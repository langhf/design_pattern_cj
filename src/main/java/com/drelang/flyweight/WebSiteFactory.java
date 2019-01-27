package com.drelang.flyweight;

import java.util.Hashtable;

/**
  *  网站工厂类
  * Created by Drelang on 2019/01/27
  */
public class WebSiteFactory {
    private Hashtable<String, WebSite> flyweights = new Hashtable<>();

    /**
     * 获得网站分类
     * @param key 键
     * @return WebSite
     */
    public WebSite getWebSiteCategory(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteWebSite(key));
        }
        return flyweights.get(key);
    }

    /**
     * 获得网站分类总数
     * @return Integer
     */
    public Integer getWebSiteCount() {
        return flyweights.size();
    }

}
