package li.jesse.nbaccount.util;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

public class IdUtilTest {

    @Test
    public void testMySnowflakeId() throws ParseException {
        System.out.println(IdUtil.mySnowflakeId());
    }
}
