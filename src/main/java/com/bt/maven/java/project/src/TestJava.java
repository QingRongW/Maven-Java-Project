package com.bt.maven.java.project.src;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class TestJava {


    public String TextCompressor(String input) {
        if (StringUtils.isEmpty(input)) {
            return "";
        }
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            int count = 0;
            char cur = input.charAt(i);
            for (int j = i + 1; j < input.length(); j++) {
                if (cur == input.charAt(j)) {
                    count++;
                } else {
                    i = j+1;
                    break;
                }
            }
            output = output + cur;
            if (count != 0) {
                output = output + count;
            }
        }
        return output;
    }
}
