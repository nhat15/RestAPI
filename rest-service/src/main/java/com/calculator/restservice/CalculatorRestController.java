package com.calculator.restservice;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorRestController {
    
    @GetMapping("/calculator")
    public Map<String, String> getCalculcalculator(@RequestParam int a, int b, String str) {
        String result;
        if (str.equals("+")) {
            result = Integer.toString(a + b);
        } else if (str.equals("-")) {
            result = Integer.toString(a - b);
        } else if (str.equals("*")) {
            result = Integer.toString(a * b);
        } else if (str.equals("/")) {
            if(b == 0) {
                result = "Vui lòng nhập lại số thứ 2 khác 0";
            } else {
                result = Integer.toString(a / b);
            }
        } else if (str.equals("**")) {
            result = Integer.toString((int)Math.pow(a, b));
        } else {
            result = "Invalid";
        }
        Map<String, String> obj = new HashMap<String, String>();
        obj.put("result", result);
        return obj;
    }
}
