/**
 * @(#)AppService.java, 十月 28, 2016.
 * <p>
 * Copyright 2016 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package yali.app.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhangpeng
 */
@EnableDiscoveryClient
@SpringBootApplication
public class YaLiAppService {
    public static void main(String[] args) {
        SpringApplication.run(YaLiAppService.class, args);
    }
}