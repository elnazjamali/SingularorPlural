package Kataforloop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TamrineKataTest {

    @Test
    void singular_or_plural() {
       int number = 5;
       boolean shart = isPlural(number);

       assertEquals(true,shart);
}
private boolean isPlural (int number ){
        return (number != 1);

}
}

