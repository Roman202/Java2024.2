class Symvoly_formuvannia_tekstu {

    public static void main(String[] args) {

        // для переміщення (початок нового рядка) використовується код \n
        System.out.println("Перший рядок\nДругий рядок");

        // знак табуляції помагає оформити вихідний текст в колонки. Він виводиться з допомогою кода \t
        System.out.println("A\tB\tH");
        System.out.println("D\tE\tF");
    }
}


Ця програма на Java демонструє деякі основні концепції введення-виведення в Java, а саме використання методу println() з класу System.out. Ось що вона робить:

Оформлення тексту в рядки:

Використовуючи метод println(), програма виводить рядки тексту на консоль.
Наприклад, System.out.println("Перший рядок\nДругий рядок"); виводить два рядки тексту, розділені новим рядком (\n), на консоль. Перший рядок містить "Перший рядок", після чого відбувається переміщення на новий рядок, і наступний рядок містить "Другий рядок".
Форматування тексту в колонки:

Програма використовує символ табуляції (\t), щоб розділити текст на колонки.
Наприклад, System.out.println("A\tB\tH"); виводить текст "A", після чого вставляє символ табуляції, потім "B", знову табуляцію, і "H".
Таким чином, текст виводиться у вигляді таблиці з колонками.
Метод main():

Метод main() є точкою входу в програму Java. Всі програми на Java повинні містити метод main(), і виконання програми починається саме з нього.
У цьому випадку, виконання починається з методу main(String[] args), де args є масивом рядків, які можуть бути передані програмі через командний рядок.
Отже, загалом, ця програма демонструє, як можна використовувати метод println() для виведення тексту на консоль та як можна оформляти текст з використанням символів нового рядка та табуляції.
