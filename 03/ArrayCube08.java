package week3cube;

public class ArrayCube08 {
    public static void main(String[] args) {
        Cube08[] cubeArr = new Cube08[3];

        cubeArr[0] = new Cube08(100,30,12);
        cubeArr[1] = new Cube08(50,40,22);
        cubeArr[2] = new Cube08(80,500,25);

        for (int i=0; i<3; i++){
            System.out.println("Volume of " +i+ "th cube is : " +cubeArr[i].CalculateVolume());
        } 
    }
}
