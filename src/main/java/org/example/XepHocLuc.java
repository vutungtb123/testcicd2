package org.example;

public class XepHocLuc {
    public String xeploai(double diem){
        if(diem >=9.0){
            return "Xuất sắc";
        }

       else if(7.0<=diem && diem<9.0){
            return"Giỏi";
        }
        else if(5.0<=diem && diem<=7.0){
            return "Trung bình";
        }

        else
            return "Yếu";

    }

}
