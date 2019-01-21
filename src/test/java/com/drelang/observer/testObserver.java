package com.drelang.observer;

import com.drelang.AppTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class testObserver extends AppTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(testObserver.class);

    @Test
    public void testObserver() {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver("烤地瓜", subject));
        subject.attach(new ConcreteObserver("烤红薯", subject));
        subject.attach(new ConcreteObserver("烤土豆", subject));

        subject.setSubjectState("火烧好了");
        subject._notify();

    }
}
