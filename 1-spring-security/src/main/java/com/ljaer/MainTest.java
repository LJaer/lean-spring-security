package com.ljaer;

import org.springframework.security.crypto.password.NoOpPasswordEncoder;

public class MainTest {

    public static void main(String[] args) {
        String password = NoOpPasswordEncoder.getInstance().encode("123456");
        System.out.println(password);
    }
}
