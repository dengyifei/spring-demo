package com.xefei.classload;

/**
 * class load 测试
 */
public class ClassLoaderTestMain {

    /**
     * static 再classloader 后就运行
     */
    static {
        System.out.println("ClassLoaderTestMain load");
    }
    public static B b = new B();

    public ClassLoaderTestMain(){
        System.out.println("ClassLoaderTestMain new");
    }

    public static void main(String[] args) {
        System.out.println(ClassLoaderTestMain.class.getClassLoader());
        A a = new A();
        B b = null;// 不会加载类B
    }
}
