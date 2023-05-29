public class Box {  // суперкласс
    int width;
    int height;
    int depth;

    Box(int w, int h, int d) {  // конструктор
        width = w;
        height = h;
        depth = d;
    }

    public Box() {
    }

    public int getVolume() {
        return width * height * depth;
    }
}






