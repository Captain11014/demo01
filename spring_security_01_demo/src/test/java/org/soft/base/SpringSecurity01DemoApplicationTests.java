package org.soft.base;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.UUID;

@SpringBootTest
class SpringSecurity01DemoApplicationTests {

    private long time = 1000*60*60*24;
    private String signature = "admin";

    @Test
    void contextLoads() {

    }

    /**
     * jwt加密
     */
//    @Test
//    public void jwt(){
//
//        JwtBuilder jwtBuilder = Jwts.builder();
//        String jwtToken = jwtBuilder
//                //header
//                .setHeaderParam("type","JWT")
//                .setHeaderParam("alg","HS256")
//                //payload
//                .claim("userName","Tom")
//                .claim("role","Admin")
//                .setSubject("admin-test")
//                .setExpiration(new Date(System.currentTimeMillis()+time))
//                .setId(UUID.randomUUID().toString())
//                //signature
//                .signWith(SignatureAlgorithm.HS256,signature)
//                .compact();//拼接
//
//
//        System.out.println(jwtToken);
//
//    }

}
