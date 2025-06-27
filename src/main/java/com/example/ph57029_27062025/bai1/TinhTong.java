package com.example.ph57029_27062025.bai1;

public class TinhTong {
    public int tinhTongChiaHetCho3(int n){
        if(n<1){
            throw new IllegalArgumentException("n phai > 1");
        }
        int tong = 0;
        for (int i = 1;i<=n;i++){
            if(i%3==0){
                tong+=i;
            }
        }
        return tong;
    }
}
