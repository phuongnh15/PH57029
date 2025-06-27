package com.example.ph57029_27062025;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebdriveTest {
    private WebDriver webDriver;

    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Test
    public void webVeMayBay() throws InterruptedException {
        webDriver.get("https://www.vietjetair.com/vi/ve-may-bay/bay-dang-cap-boss-gia-chi-eco-uu-dai-20-ngay-20-hang-thang/?utm_source=google-vj-sg&utm_medium=cpc&utm_campaign=pmax_singaporesunbird2025_ci_perfmax_0125intflt-sale20_promo-destn-sgp-skyboss-kv_sgpawo2024_cpa_ob&gad_source=1&gclid=Cj0KCQiAkoe9BhDYARIsAH85cDORe2krBlFPX0WLX2b8-jbIkCWMIKBWK8_gIojxLNRwUvz25GcCcnEaAk54EALw_wcB");

        //chon chieu di
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"input-departure\"]")).click();

        Thread.sleep(2000);

        webDriver.findElement(By.xpath("//*[@id=\"origin-Vietnam\"]/div[2]/div/div/div/div/div[2]/div[2]")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"input-calendar_1\"]")).click();

//        Thread.sleep(3000);
//        webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/table/tbody/tr[5]/td[5]")).click();


        //chon ngay ve
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"input-departure-2\"]")).click();
        Thread.sleep(2000);

        webDriver.findElement(By.xpath("//*[@id=\"destination-Vietnam\"]/div[2]/div/div/div/div/div[1]/div[2]")).click();

//        Thread.sleep(1000);
//        webDriver.findElement(By.xpath("//*[@id=\"input-calendar_2\"]")).click();
//
//        Thread.sleep(3000);
//        webDriver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/table/tbody/tr[5]/td[6]")).click();

    }
}
