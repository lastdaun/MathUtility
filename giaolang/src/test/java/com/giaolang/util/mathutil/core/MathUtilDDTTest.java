package com.giaolang.util.mathutil.core;

import org.junit.jupiter.params.Parameter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilDDTTest {
    //chuẩn bị bộ data de863 riêng - DD - DATA DRIVEN
    //lát hồi fill vào hàm so sánh T TESTING
    //fill vào qua tham số hàm - hàm làm việc với nhiều data
    //DDT coòn gọi tên khác: ParameteRized TESTING -> kiểm thử theo kiểu tham số hoá

    // bộ data: năằm trong hàm static - tĩnh 1 chỗ để các nơi vào lấy
    //bộ data: thường là mảng 2 chiều, giá trị  đầu vào và giá trị kì vọng

    public static Object[][] initData(){
        //int[] a = {5,10,15,20}; //mảng 1 chiều
        return new Object[][]{{0, 1},
                {1, 1},
                {2, 2},
                {3,6},
                {4,24},
                {5,120},
                {6,720}};
    }
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgsRunWell(int n, long expected){
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}
