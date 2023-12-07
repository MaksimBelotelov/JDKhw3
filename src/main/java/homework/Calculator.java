package homework;
/*
    2. Написать класс Калькулятор (необобщенный), который содержит обобщенные статиче-
ские методы: sum(), multiply(), divide(), subtract(). Параметры этих методов – два
числа разного типа, над которыми должна быть произведена операция.
 */
public class Calculator {
    public static <T extends Number, E extends Number> double sum(T n1, E n2) {
        return n1.doubleValue() + n2.doubleValue();
    }

    public static <T extends Number, E extends Number> double multiply(T n1, E n2) {
        return n1.doubleValue() * n2.doubleValue();
    }

    public static <T extends Number, E extends Number> double divide(T n1, E n2) {
        return n1.doubleValue() / n2.doubleValue();
    }

    public static <T extends Number, E extends Number> double subtract(T n1, E n2) {
        return n1.doubleValue() - n2.doubleValue();
    }
}
