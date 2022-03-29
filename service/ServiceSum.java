package SOLIDVolosatov.service;

// Класс занимается только вычислениями
public class ServiceSum implements IService {

    @Override
    public int calculate(int a, int b) {

        return a + b;

    }
}
