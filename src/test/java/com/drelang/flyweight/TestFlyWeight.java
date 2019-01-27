package com.drelang.flyweight;

import com.drelang.AppTest;
import org.junit.Test;

/**
  *  测试享元模式
  * Created by Drelang on 2019/01/27
  */
public class TestFlyWeight extends AppTest {

    @Test
    public void testFlyWeight() {
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite fx = webSiteFactory.getWebSiteCategory("产品展示");
        fx.use(new User("小菜"));

        WebSite fy = webSiteFactory.getWebSiteCategory("产品展示");
        fy.use(new User("大鸟"));

        WebSite fz = webSiteFactory.getWebSiteCategory("产品展示");
        fz.use(new User("娇娇"));

        WebSite fl = webSiteFactory.getWebSiteCategory("博客");
        fl.use(new User("老顽童"));

        WebSite fm = webSiteFactory.getWebSiteCategory("博客");
        fm.use(new User("桃谷六仙"));

        WebSite fn = webSiteFactory.getWebSiteCategory("博客");
        fn.use(new User("南海鳄神"));

        System.out.println("得到网站分类总数为 " + webSiteFactory.getWebSiteCount());
    }
}
