package com.drelang.reflectionAndAbstractFactory;

import com.drelang.AppTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class testPackage extends AppTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(testPackage.class);

    @Test
    public void testPackage() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        User user1 = new User();
        user1.setId(1);
        user1.setName("Xiong lang yu");

        Department department1 = new Department();
        department1.setId(1);
        department1.setDeptName("Tech Part");

        LOGGER.info("Insert a user and a department");
        IUser iUser = DataAccess.createUser();
        iUser.insert(user1);

        IDepartment iDepartment = DataAccess.createDepartment();
        iDepartment.insert(department1);

        LOGGER.info("Get user 1 and department 1");
        iUser.getUser(1);
        iDepartment.getDepartment(1);
    }
}
