package databingdingbyjava.myapplication;

import java.util.Random;

public class UrlUtil {
    private static final Random sRandom = new Random();

    private static final String[] IMG_URLS = new String[]{
            "http://ww2.sinaimg.cn/large/7a8aed7bjw1ex8h4lnq3oj20hs0qoadj.jpg",
            "http://pic9.photophoto.cn/20081128/0033033999061521_b.jpg",
            "http://photocdn.sohu.com/20150512/mp14709109_1431417225494_2.jpeg"
    };

    public static String nextImgUrl() {
        return IMG_URLS[sRandom.nextInt(IMG_URLS.length)];
    }
}
