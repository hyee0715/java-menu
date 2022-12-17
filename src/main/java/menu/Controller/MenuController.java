package menu.Controller;

import menu.Service.InitializationService;
import menu.view.InputView;
import menu.view.OutputView;

import static menu.view.OutputView.printStartMessage;

public class MenuController {
    InitializationService initializationService;
    InputView inputView;
    OutputView outputView;

    public MenuController() {
        initializationService = new InitializationService();
        inputView = new InputView();
        outputView = new OutputView();
    }

    public void run() {
        initializationService.initializeCategory();
        printStartMessage();

        takeNamesOfCoaches();
    }

    public void takeNamesOfCoaches() {
        String name = inputView.readCoachNames();
    }
}
