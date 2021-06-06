package li.jesse.nbaccount.util;

import li.jesse.volcanocommon.util.SnowflakeIdUtil;

import java.text.ParseException;

public class IdUtil {

    public static long mySnowflakeId() throws ParseException {
        return SnowflakeIdUtil.snowflakeIdGenerator(2010, 10, 1, 2, 5);
    }
}
