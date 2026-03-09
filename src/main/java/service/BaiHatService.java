package service;

import entity.BaiHat;

import java.util.ArrayList;
import java.util.List;

public class BaiHatService {
    private List<BaiHat> baihatList=new ArrayList<>();

    public List<BaiHat> getAll(){
        return baihatList;
    }

    public String addBaihat(BaiHat bh){
       if(bh.getTen().isEmpty() || bh.getMa().isEmpty() || bh.getTenCaSi().isEmpty() || bh.getTheLoai().isEmpty() ){
           return "Không được để trống";
       }
       if( bh.getThoiLuong() <2.0 || bh.getThoiLuong() >5.59){
           return"thời gian phải từ 2.0 -> 5.59";
       }
       baihatList.add(bh);
       return "Thêm thành công";
    }

}
