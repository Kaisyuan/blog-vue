package com.kaisyuan.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {

    @Test
    public void contextLoads() throws ParseException {

       /* double f = 0.000123123123;
        DecimalFormat df =new DecimalFormat(".###");
        df.setRoundingMode(RoundingMode.HALF_DOWN);*/

       /* double doublef1 = b.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();*/
        /*SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.println(df.parse(df.format(new Date())).getTime());*/
        /*double waterLevel = getRandomNum(512.0, 512.6, 1);
        System.out.println(waterLevel);
        waterLevel = new BigDecimal(515.5).subtract(new BigDecimal(waterLevel)).setScale(2, RoundingMode.HALF_UP).doubleValue();
        System.out.println(waterLevel);*/
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date zero = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = simpleDateFormat.format(zero);
        System.out.println("时间：" + time);

    }
    private double getRandomNum(double min, double max, int scale) {
        double value = new Random().nextDouble() * (max - min) + min;
        double num = new BigDecimal(value).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
        return num;
    }

}
