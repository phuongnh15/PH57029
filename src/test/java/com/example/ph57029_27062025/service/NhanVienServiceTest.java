package com.example.ph57029_27062025.service;

import com.example.ph57029_27062025.entity.NhanVien;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {
    private NhanVienService nhanVienService;

    @BeforeEach
    void setUp(){
        nhanVienService = new NhanVienService();
    }

    @Test
    void testAddNhanVienHopLe() {
        NhanVien nhanVien = new NhanVien("NV1","Phuong",28,2000f,2,"Ke toan");
        nhanVienService.addNhanVien(nhanVien);

        Assertions.assertEquals(1,nhanVienService.getAll().size());
    }

    @Test
    void testAddNhanVienWithInvalidNhanVien(){
        Assertions.assertThrows(IllegalArgumentException.class,()->nhanVienService.addNhanVien(null));
    }

    @Test
    void testAddNhanVienWithInvalidMa(){
        Assertions.assertThrows(IllegalArgumentException.class,()->nhanVienService.addNhanVien(new NhanVien("","Phuong Anh",28,3000f,1,"Ke toan")));
    }

    @Test
    void testAddNhanVienWithInvalidTen(){
        Assertions.assertThrows(IllegalArgumentException.class,()->nhanVienService.addNhanVien(new NhanVien("NV2","",28,3000f,1,"Ke toan")));
    }

    @Test
    void testAddNhanVienWithInvalidTuoi(){
        Assertions.assertThrows(IllegalArgumentException.class,()->nhanVienService.addNhanVien(new NhanVien("NV1","Phuong Anh",16,3000f,1,"Ke toan")));
    }

    @Test
    void testAddNhanVienWithInvalidLuong(){
        Assertions.assertThrows(IllegalArgumentException.class,()->nhanVienService.addNhanVien(new NhanVien("NV1","Phuong Anh",20,-3000f,1,"Ke toan")));
    }

    @Test
    void testAddNhanVienWithInvalidSoNamLamViec(){
        Assertions.assertThrows(IllegalArgumentException.class,()->nhanVienService.addNhanVien(new NhanVien("NV1","Phuong Anh",23,3000f,-1,"Ke toan")));
    }

    @Test
    void testAddNhanVienWithInvalidPhongBan(){
        Assertions.assertThrows(IllegalArgumentException.class,()->nhanVienService.addNhanVien(new NhanVien("NV1","Phuong Anh",24,3000f,1,"")));
    }
}