package service;

import entity.SanPham;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SanPhamServiceTest {

    private SanPhamService service;

    @BeforeEach
    void setUp(){
        service = new SanPhamService();
    }

    // Test thêm sản phẩm (phân vùng tương đương - hợp lệ)
    @Test
    public void testAdd(){
        SanPham sp = new SanPham(1,"Áo",10,20.0000,"Áo thun");

        service.addSanPham(sp);

        assertEquals(1,service.getAll().size());
    }

    // Test validate (trường trống)
    @Test
    public void testValidate(){
        SanPham sp = new SanPham();

        String message = service.addSanPham(sp);

        assertEquals("Không được để trống",message);
    }

    // Test update
    @Test
    public void testUpdate(){
        SanPham sp1 = new SanPham(1,"Áo",10,20.0000,"Áo thun");
        service.addSanPham(sp1);

        SanPham sp2 = new SanPham(1,"Áo polo",15,30.0000,"Áo mới");

        service.updateSanPham(sp2,1);

        assertAll(
                ()-> assertEquals("Áo polo",service.findById(1).getTen()),
                ()-> assertEquals(15,service.findById(1).getSoLuong()),
                ()-> assertEquals(30.0000,service.findById(1).getDonGia()),
                ()-> assertEquals("Áo mới",service.findById(1).getMoTa())
        );
    }

    // Test delete
    @Test
    public void testDelete(){
        SanPham sp = new SanPham(1,"Áo",10,20.0000,"Áo thun");

        service.addSanPham(sp);

        service.deleteSanPham(1);

        assertEquals(0,service.getAll().size());
    }

    // Test findById
    @Test
    public void testFindById(){
        SanPham sp = new SanPham(1,"Áo",10,20.0000,"Áo thun");

        service.addSanPham(sp);

        SanPham spFound = service.findById(1);

        assertAll(
                ()-> assertEquals("Áo",spFound.getTen()),
                ()-> assertEquals(10,spFound.getSoLuong()),
                ()-> assertEquals(20.0000,spFound.getDonGia()),
                ()-> assertEquals("Áo thun",spFound.getMoTa())
        );
    }
}