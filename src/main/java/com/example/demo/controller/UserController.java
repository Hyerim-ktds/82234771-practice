package com.example.demo.controller;

import com.example.demo.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RequestMapping("/api/v1/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    private static final String DEFAULT_USER_ID = "82234771";

    @GetMapping
    public ResponseEntity<?> getUserIdNumber(HttpServletRequest request) {
        try {
            String serverName = request.getServerName();

            if(StringUtils.hasText(serverName)) {
                serverName = serverName.split("-")[0];

                if(serverName == null || !serverName.matches("\\d+")) {
                    serverName = DEFAULT_USER_ID;
                }
            }
//            String idNumber = "82234771";
            return ResponseEntity.ok(userService.getUserByIdNumber(serverName));
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
