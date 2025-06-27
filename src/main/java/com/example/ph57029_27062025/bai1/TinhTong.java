package com.example.ph57029_27062025.bai1;

public class TinhTong {
    public int tinhTongChiaHetCho3(int n){

        int tong = 0;
        for (int i = 1;i<=n;i++){
            if(i%3==0){
                tong+=i;
            }
        }
        return tong;
    }
}
