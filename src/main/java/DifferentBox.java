public class DifferentBox {  // работа с методами и вывод результатов
    public static void main(String[] args) {
        Box box = new Box(15, 10, 25); //Создаем коробку и вводим параметры для стандартной коробки
        ColorBox colorBox = new ColorBox(15, 10, 25, "зеленый"); // Создаем цветную коробку
        HeavyBox heavyBox = new HeavyBox(15, 10, 25, 15); // Создаем тяжелую коробку

        System.out.println("Объем коробки: " + box.getVolume());
        System.out.println("Объем коробки: " + colorBox.getVolume() + " Цвет: " + colorBox.color);
        System.out.println("Объем коробки: " + heavyBox.getVolume() + " Вес: " + heavyBox.weight);
    }
}










