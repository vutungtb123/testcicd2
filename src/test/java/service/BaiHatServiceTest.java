package service;

import entity.BaiHat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class BaiHatServiceTest {
private BaiHatService service;

@BeforeEach
void setUp(){
    service=new BaiHatService();
}

    @Test
    void addBaihat() {
        BaiHat bh1= new BaiHat("PN00333","Đom đóm","Jack", 59,"Nhạc thiếu nhi");
        service.addBaihat(bh1);
        assertEquals(1,service.getAll().size());
    }

    @Test
    void testThemtime(){
        BaiHat bh=new BaiHat("abc","abc","ab",1.9f,"abc");
        String massage=service.addBaihat(bh);
        assertEquals("thời gian phải từ 2.0 -> 5.59",massage);
    }



    @Test
    void TestValidate(){
    BaiHat bh=new BaiHat("","abc","ab",2.3f,"abc");
    String massage=service.addBaihat(bh);
    assertEquals("Không được để trống",massage);
    }

}