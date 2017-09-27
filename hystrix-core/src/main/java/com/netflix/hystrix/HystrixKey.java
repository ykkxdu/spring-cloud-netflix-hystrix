package com.netflix.hystrix;
/*
 date:  2017-9-27
 fun:   1.定义一个Hystrix接口，并定义了一个返回String类型name方法。
        2.使用一个抽象的类实现接口，并实现里面的name方法.
*/

/**
 * Basic class for hystrix keys
 */
public interface HystrixKey {
    /**
     * The word 'name' is used instead of 'key' so that Enums can implement this interface and it work natively.
     *
     * @return String
     */
    String name();

    /**
     * Default implementation of the interface
     */
    abstract class HystrixKeyDefault implements HystrixKey {
        private final String name;

        public HystrixKeyDefault(String name) {
            this.name = name;
        }

        @Override
        public String name() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
