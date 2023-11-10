package week3exercise;

public class beamEx1 {
    int length;
    int width;
    int height;

    public double calcSurface(){
        double surface;
        surface= 4 *(length+width+height);
        return surface;
    }

    public double calcVolume(){
        double volume;
        volume=length*width*height;
        return volume;
}
