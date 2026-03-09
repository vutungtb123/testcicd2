package entity;

public class BaiHat {
    private String ma;
    private String ten;
    private String tenCaSi;
    private float thoiLuong;
    private String theLoai;

    public BaiHat() {
    }

    public BaiHat(String ma, String ten, String tenCaSi, float thoiLuong, String theLoai) {
        this.ma = ma;
        this.ten = ten;
        this.tenCaSi = tenCaSi;
        this.thoiLuong = thoiLuong;
        this.theLoai = theLoai;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public float getThoiLuong() {
        return thoiLuong;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    public void setThoiLuong(float thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
}
