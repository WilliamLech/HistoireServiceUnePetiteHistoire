package com.java.user.controller;

public record UserDto(
        String username,
        String roles,
        Boolean enabled
) {}
