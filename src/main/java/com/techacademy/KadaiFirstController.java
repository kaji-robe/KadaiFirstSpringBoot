package com.techacademy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Calendar;//課題用追加

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{val1}")
    public String dispDayOfWeek(@PathVariable String val1) {
        String day = val1;
        String nen = day.substring(0,4);
        String tsuki = day.substring(4,6);
        String nichi = day.substring(6,8);
        int year =  Integer.parseInt(nen);
        int month =  Integer.parseInt(tsuki) -1;
        int date =  Integer.parseInt(nichi);
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, date);
        String weekDay[] = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Tursday","Friday"};
        return weekDay[cal.get(Calendar.DAY_OF_WEEK)];
        }

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int resPlus = 0;
        resPlus = val1 + val2;
        return "実行結果：" + resPlus;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int resMinus = 0;
        resMinus = val1 - val2;
        return "実行結果：" + resMinus;
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int resTimes = 0;
        resTimes = val1 * val2;
        return "実行結果：" + resTimes;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcDvide(@PathVariable int val1, @PathVariable int val2) {
        int resDivide = 0;
        resDivide = val1 / val2;
        return "実行結果：" + resDivide;
    }



}
