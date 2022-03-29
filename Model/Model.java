package SOLIDVolosatov.Model;

import SOLIDVolosatov.io.IData;
import SOLIDVolosatov.io.IPrinter;
import SOLIDVolosatov.service.IService;

// Здесь реализуем ввод(иницилизации), вывод(завершение) и вычисление
public class Model {
    int a, b, sum;


    public void init(IData data) {
        a = data.input("Введите число a: ");
        b = data.input("Введите число b: ");
    }

    public void calc(IService service) {

        sum = service.calculate(a, b);

    }

    public void done(IPrinter printer) {
        printer.print("Результат: ");
        printer.print(sum);
    }
}
