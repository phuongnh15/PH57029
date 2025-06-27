package com.example.ph57029_27062025.entity;

public class NhanVien {
    private String ma;
    private String ten;
    private int tuoi;
    private float luong;
    private int soNamLamViec;
    private String phongBan;

    public NhanVien() {
    }

    public NhanVien(String ma, String ten, int tuoi, float luong, int soNamLamViec, String phongBan) {
        setMa(ma);
        setTen(ten);
        setTuoi(tuoi);
        setLuong(luong);
        setSoNamLamViec(soNamLamViec);
        setPhongBan(phongBan);
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        if(ma==null || ma.trim().isEmpty()){
            throw new IllegalArgumentException("Khong de trong ma");
        }
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if(ten==null || ten.trim().isEmpty()){
            throw new IllegalArgumentException("Khong de trong ten");
        }
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if(tuoi<18){
            throw new IllegalArgumentException("Tuoi phai > 18");
        }
        this.tuoi = tuoi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        if(luong<=0){
            throw new IllegalArgumentException("Luong phai > 0");
        }
        this.luong = luong;
    }

    public int getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(int soNamLamViec) {
        if(soNamLamViec<=0){
            throw new IllegalArgumentException("So nam lam viec phai > 0");
        }
        this.soNamLamViec = soNamLamViec;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        if(phongBan==null || phongBan.trim().isEmpty()){
            throw new IllegalArgumentException("Khong de trong phongBan");
        }
        this.phongBan = phongBan;
    }
}
