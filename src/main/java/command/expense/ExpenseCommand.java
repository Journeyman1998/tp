package command.expense;

import picocli.CommandLine.Command;

@Command(name = "expense", mixinStandardHelpOptions = true, subcommands = {
        AddExpenseCommand.class,
        DeleteExpenseCommand.class,
        ListExpenseCommand.class
})
public class ExpenseCommand {
}
