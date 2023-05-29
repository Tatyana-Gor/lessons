public class GearBox {
    /**
     *  0 - neutral
     *  -1 - rear
     *  1-6
     */

    private int gear = 0;
    private int minGear = 1;
    private int maxGear = 6;

    public void shiftUp() {
        gear = gear < maxGear ? gear + 1 : gear;
    }
    public void shiftDown() {
        gear = gear > minGear ? gear - 1 : gear;
    }
}



