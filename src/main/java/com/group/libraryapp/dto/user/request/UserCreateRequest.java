package com.group.libraryapp.dto.user.request;

public class UserCreateRequest {
    private String name;
    private Integer age; // int는 null 표현할 수 없고 Integer는 null표현 가능

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
