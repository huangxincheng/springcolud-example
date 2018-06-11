package com.qs.domain;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Date:   2018/6/11 18:47
 * Author: huangxincheng
 * 请用一句话描述这个类:
 *
 * <author>              <time>            <version>          <desc>
 * huangxincheng     2018/6/11 18:47         1.0.0
 * <p>
 * 春风十里不如你
 **/
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Banner {

    private long bannerId;

    private int width;

    private int heigth;

    private int size;

    private static List<Banner> banners = new ArrayList<Banner>();

    static {
        for (int i = 1; i <= 100; i++) {
            banners.add(new Banner(100 + i, i, i, i));
        }
    }
    public static List<Banner> initBanners() {
        return banners;
    }
}
