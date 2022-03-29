package SOLIDVolosatov;

import SOLIDVolosatov.Model.Module;
import SOLIDVolosatov.io.*;

import SOLIDVolosatov.service.IService;
import SOLIDVolosatov.service.ServiceSum;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {
        // File file = new File("numbers.txt");
        //Scanner scanner = new Scanner(file);
        Scanner scanner = new Scanner(System.in);
        IReader reader = new ReaderConsole(scanner);
        IPrinter printer = new PrinterStars();
        // IPrinter printer = new PrinterConsole();
        IData data = new Data(reader, printer);
        IService service = new ServiceSum();
        Module module = new Module(reader, printer, service);
        module.execute();


    }
}
