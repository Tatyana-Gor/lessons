public class ColorBox extends Box{ // субкласс, наследует параметры и метод от суперкласса
    String color; // добавляется парамерт

    public ColorBox(int width, int height, int depth, String color) {  // конструктор
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
    }

    public ColorBox() {

    }
}



