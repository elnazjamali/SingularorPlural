package Kataforloop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TamrineKataTest {
    @Test
    void singular_or_plural() {

        String[] number = {"5"};
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

    @Test
    void pluar_bashad() {
        String[] next_number = {"5"};
        String result = nametwo(next_number);


        assertEquals("apples", result);

    }
    private String nametwo(String[] next_number ){
        return  "apples" ;

    }


    @Test
    void javabe_asli() {
       int f = 5;
       boolean shart = isPlural(f);

       assertEquals(true,shart);
}
private boolean isPlural (int f ){
        return (f != 1);

}
}

