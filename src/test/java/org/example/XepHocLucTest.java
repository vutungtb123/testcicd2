package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XepHocLucTest {
    public XepHocLuc xephocluc;
    @BeforeEach
    void setUp(){
        xephocluc=new XepHocLuc();
    }
    //Test học lực yếu
    @Test
    void diem4() {
        assertEquals("Yếu",xephocluc.xeploai(4));
    }

    //Test học lực trung bình
    @Test
    void diem5() {
        assertEquals("Trung bình",xephocluc.xeploai(5));

    }

    @Test
    void diem6() {
        assertEquals("Trung bình",xephocluc.xeploai(6));

    }

    //test học lực giỏi
    @Test
    void diem7() {
        assertEquals("Giỏi",xephocluc.xeploai(7));

    }

    @Test
    void diem8() {

        assertEquals("Giỏi",xephocluc.xeploai(8));

    }

    @Test
    void diem9() {
        assertEquals("Xuất sắc",xephocluc.xeploai(9));

    }

    @Test
    void diem10() {
        assertEquals("Xuất sắc",xephocluc.xeploai(10));

    }
}