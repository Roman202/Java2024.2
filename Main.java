// Розрахунок відстані, проходження світла
// з застосуванням змінної типу long

class Light {
    public static void main(String[] args) {
        int lightseed;
        long days;
        long seconds;
        long distance;

        // Приблизна швидкість світла в милях за секунду.
        lightseed = 186000;
        days = 1000;                            // Кількість днів
        seconds = days * 24 * 60 * 60;          // Перетворити в секунди
        distance = lightseed * seconds;         // Розрахунок відстані

        // Вивести приблизну відстань в милях, походжання світла
        // За вказану кількість днів

         System.out.println("За " + days);
         System.out.println("днів світло пройде близько ");
         System.out.println(distance + " миль.");
    }
        }