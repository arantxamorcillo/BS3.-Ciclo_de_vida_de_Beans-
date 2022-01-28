package com.BS3.CiclodevidadeBeans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Data @AllArgsConstructor @NoArgsConstructor
public class FirstClass {
    String message;

    @Override
    public String toString() {
        return "FirstClass{" +
                "message='" + message + '\'' +
                '}';
    }
}
