//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Enot enot1 = new Enot("Вася", 3, true);
        Enot enot2 = new Enot("Петя", 1, false);
        enot1.info();
        enot2.info();
        enot1.info1();
    }
}

class Enot {
    String name;
    int age;
    boolean sost;

    public Enot(String name, int age, boolean sost) {
        this.name = name;
        this.age = age;
        this.sost = sost;
    }

    void info() {
        if (sost == true) {
            System.out.println("Енот "+name+" голодный "+ "ему " +age+ " годика" );
        } else {
            System.out.println("Енот "+name+" не голодный "+ "ему " +age+ "годика");
        }
    }
    void info1(){
        String [] str = name.split(""); // присвоить массиву name с разделением сплит ( посимвольно делим ) эта строка заполняет масиив Str
        // а str это массив. Чтобы разделить строку надо заполнить массив символами из строки. Для этого мы создаем стринговый массив String [] это объявили
        // массив, а зтем запоняем его вот так name.split("") сплит это метод, который делит строку, а кавычки это он делит на символы так он работает.
        // Затем циклом фор нам надо прочитать этот массив, что мы и делаем.
        for (int i=0; i< str.length;i++)

        System.out.print(str[i]+ "-" ); // выводим чтобы было через дефис ставим "-"
    }
}
