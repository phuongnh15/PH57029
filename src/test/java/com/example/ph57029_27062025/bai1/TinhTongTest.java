package com.example.ph57029_27062025.bai1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongTest {
    private TinhTong tinhTong;

    @BeforeEach
    void setUp(){
        tinhTong = new TinhTong();
    }

    @Test
    void testTinhTongChiaHetCho3WithSoHopLe() {
        Assertions.assertEquals(18,tinhTong.tinhTongChiaHetCho3(10));
    }

    @Test
    void testTinhTongChiaHetCho3WithInValidSo() {
        Assertions.assertThrows(IllegalArgumentException.class,()->tinhTong.tinhTongChiaHetCho3(-1));
    }
}