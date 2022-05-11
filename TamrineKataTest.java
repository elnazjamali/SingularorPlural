package Kataforloop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TamrineKataTest {
    @Test
    void singular_or_plural() {

        String[] number = {"1"};
        String result = name(number);


        assertEquals("apple",result);

    }

    private String name(String[] number) {
        if(number.length == 1){
            return number[0]="apple";
        }else {
            return number[0]="apples";

        }
    }

    
}
