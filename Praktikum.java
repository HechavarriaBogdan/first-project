public class Praktikum {
  public static void main(String[] args) {
        int freeHours = 1; // Объявили переменную с количеством свободного времени в часах и присвоили ей значение
                        
        checkReading(freeHours); // вызываем метод с циклом и передаём в него количество свободного времени
  }

  public static void checkReading(int freeHours) {// метод принимает количество свободного времени как параметр
    if (freeHours >= 2) { // Цикл сработает, только если есть два или больше часа свободного времени
        for (int i = 1; i < 4; i = i + 1) {
          System.out.println("Анатолий прочитал " + i + "-ю главу");
        }
    } else {
        System.out.println("Сегодня не читаем.");
    }
	System.out.println("first_conflict");
	System.out.println("second_my_conflict");
	System.out.println("Third_my_conflict");
  }

}
