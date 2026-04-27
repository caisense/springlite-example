package com.handa.springlite.service;

import com.handa.springlite.annotation.Autowired;
import com.handa.springlite.annotation.Component;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class DbInitializer {

    final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    UserService userService;

    @PostConstruct
    void init() {
        logger.info("init database...");
        userService.initDb();
    }
}
