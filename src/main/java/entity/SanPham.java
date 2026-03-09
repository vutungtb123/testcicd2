package entity;

public class SanPham {
    private int idSP;
    private String ten;
    private int soLuong;
    private Double donGia;
    private String moTa;

    public SanPham() {
    }

    public SanPham(int idSP, String ten, int soLuong, Double donGia, String moTa) {
        this.idSP = idSP;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.moTa = moTa;
    }

    public int getIdSP() {
        return idSP;
    }

    public String getTen() {
        return ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public Double getDonGia() {
        return donGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setIdSP(int idSP) {
        this.idSP = idSP;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
