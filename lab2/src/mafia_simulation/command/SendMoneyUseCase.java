package mafia_simulation.command;

public class SendMoneyUseCase {
    public void submit(SendMoney command) {
        command.execute();
    }
}
