package service;

import entity.SanPham;
import java.util.ArrayList;
import java.util.List;

public class SanPhamService {

    private List<SanPham> list = new ArrayList<>();

    public List<SanPham> getAll(){
        return list;
    }

    public SanPham findById(int id){
        for(SanPham sp : list){
            if(sp.getIdSP() == id){
                return sp;
            }
        }
        return null;
    }

    public String addSanPham(SanPham sp){
        if(sp.getTen() == null || sp.getMoTa() == null){
            return "Không được để trống";
        }

        list.add(sp);
        return "Thêm thành công";
    }

    public void deleteSanPham(int id){
        list.removeIf(sp -> sp.getIdSP() == id);
    }

    public void updateSanPham(SanPham spMoi, int id){
        for(SanPham sp : list){
            if(sp.getIdSP() == id){
                sp.setTen(spMoi.getTen());
                sp.setSoLuong(spMoi.getSoLuong());
                sp.setDonGia(spMoi.getDonGia());
                sp.setMoTa(spMoi.getMoTa());
            }
        }
    }
}