package zzz.luke.arraygame.util;


import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: lzhou
 * Date: 24/10/2016
 * Time: 8:04 AM
 */
public class NumberGenUtil {
    protected static Random random = new Random(System.currentTimeMillis());

    public static Integer randomGenerateNumber(Integer lowerBound, Integer upperBound) {
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    public static Integer randomGenerateNumber(Integer upperBound) {
        return random.nextInt(upperBound) + 1;
    }

}
