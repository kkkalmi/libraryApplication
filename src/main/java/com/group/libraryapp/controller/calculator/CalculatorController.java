package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.caculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.caculator.request.CalculatorMultiplyRequest;
import org.springframework.web.bind.annotation.*;

@RestController //CalculatorConntroller 클래스를 api의 진입지점으로 만들어줌 (Controller 등록)
public class CalculatorController {
    //아래 함수를 http method가 get이고 path가 /add인 api로 지정한다
    @GetMapping("/add") //HTTP METHOD GET / API 명세
    public int addTwoNumbers(CalculatorAddRequest request) {
        return request.getNumber1() + request.getNumber2();
    }

    @PostMapping("/multiply")
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request) {
        return request.getNumber1() * request.getNumber2();

    }
}
