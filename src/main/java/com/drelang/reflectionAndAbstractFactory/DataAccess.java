package com.drelang.reflectionAndAbstractFactory;
/**
  *  利用反射机制去除 switch 或 if
 *   包名和数据库名完全可以用 xml 文件配置，从 xml 文件读取
  * Created by Drelang on 2019/01/21
  */
public class DataAccess {
    private static final String packageName = "com.drelang.reflectionAndAbstractFactory";
    private static final String db = "SqlServer";

    public static IUser createUser() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String className = packageName + "." + db + "User";
        return (IUser) Class.forName(className).newInstance();
    }

    public static IDepartment createDepartment() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = packageName + "." + db + "Department";
        return (IDepartment)Class.forName(className).newInstance();
    }
}
