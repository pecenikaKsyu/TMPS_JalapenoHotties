package mafia_simulation.command;

public class SendMoney implements ICommand {

    public SendMoney(AccountEntity sourceAccount, AccountEntity targetAccount, MoneyEntity money) {
        this.sourceAccount = sourceAccount;
        this.targetAccount = targetAccount;
        this.money = money;
    }

    @Override
    public void execute() {
        sourceAccount.withdraw(money, targetAccount.getId());
        targetAccount.deposit(money, sourceAccount.getId());
    }
}
