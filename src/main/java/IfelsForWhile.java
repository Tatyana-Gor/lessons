public class IfelsForWhile {
    public static void main(String[] args) {

        int firstYear = 1922;
        int lastYear = 2022;

        for(int year = firstYear; year <= lastYear; year++) {
            if (year % 4 != 0) {
                continue;
            }
            System.out.println(year);

            for (int month = 1; month <=12; month++) {
                String zero = month < 10 ? "0" : "";
                System.out.println("29." + zero + month + "." + year);
            }
        }
    }
}
