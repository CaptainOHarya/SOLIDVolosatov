package SOLIDVolosatov.Model;

import SOLIDVolosatov.io.Data;
import SOLIDVolosatov.io.IData;
import SOLIDVolosatov.io.IPrinter;
import SOLIDVolosatov.io.IReader;
import SOLIDVolosatov.service.IService;

public class Module {
    private IReader reader;
    private IPrinter printer;
    private IService service;
    private IData data;


    public Module(IReader reader, IPrinter printer, IService service) {
        super();
        this.reader = reader;
        this.printer = printer;
        this.service = service;
        this.data = new Data(reader, printer);
    }

    public void execute() {
        Model model = new Model();
        model.init(data);
        model.calc(service);
        model.done(printer);
    }


}
