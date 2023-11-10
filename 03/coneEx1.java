package week3exercise;

public class coneEx1 {
    int rad;
    int height;
    int painterLine;
    double phi = 3.14;

    public double calcSurface(){
        double surface;
        surface = (phi*rad)+(phi*rad*painterLine);
        return surface;
    }

    public double calcVolume(){
        double volume;
        volume = (phi*phi*2*height)/3;
        return volume;
    }
}
