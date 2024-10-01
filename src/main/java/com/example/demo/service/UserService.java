package com.example.demo.service;

import com.example.demo.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserDto getUserByIdNumber(String idNumber) {
        // 단순히 요청받은 사번을 리턴하는 로직
        return new UserDto(idNumber);
    }
}