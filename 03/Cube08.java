package week3cube;

public class Cube08 {
    int length;
    int width;
    int height;

    public Cube08(int l, int w, int h){
        length = l;
        width = w;
        height = h;
    }

    public int CalculateVolume(){
        int volume;
        volume = length*width*height;
        return volume;
    }
}
