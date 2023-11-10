package week3exercise;

public class pyramidEx1 {
    int bsLength;
    int bswidth;
    int height;
    int trglBase;
    int trglHeight;

    public double calcSurface(){
        double surface =(bsLength*bsLength) + 4*(trglBase*trglHeight/2);
        return surface;
    }

    public double calcVolume(){
        double volume = bsLength*bsLength*height/3;
        return volume;
    }
}
