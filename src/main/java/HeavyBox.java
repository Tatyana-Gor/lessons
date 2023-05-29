public class HeavyBox extends Box { // субкласс, наследует параметры и метод от суперкласса
    int weight; // добавляется парамерт

    public HeavyBox(int width, int height, int depth, int weight) {  // конструктор
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }
    public HeavyBox() {

    }
    @Override
    public int getVolume() {
     return width + height;
    }
}





