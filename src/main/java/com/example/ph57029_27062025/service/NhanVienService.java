package com.example.ph57029_27062025.service;

import com.example.ph57029_27062025.entity.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    private List<NhanVien> nhanVienList = new ArrayList<>();

    public void addNhanVien(NhanVien nhanVien){
        if(nhanVien==null){
            throw new IllegalArgumentException("Nhan vien khong duoc null");
        }
        nhanVienList.add(nhanVien);
    }

    public List<NhanVien> getAll(){return new ArrayList<>(nhanVienList);}
}
