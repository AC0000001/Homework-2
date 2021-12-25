package triangle;

import static java.lang.Math.sqrt;

public class Triangle {
    float a;
    float b;
    float c;

    float get_zhouChang(){
        return a + b + c;
    }

    float get_mianJi() {
        float S = (a + b + c) / 2;

        float area = (float) sqrt(S * (S - a) * (S - b) * (S - c));

        return area;
    }
    //可加上是否能构成三角形的判断
}
