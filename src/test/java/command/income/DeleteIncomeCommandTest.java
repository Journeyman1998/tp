package command.income;

import command.CommandLineFactory;
import entity.Income;
import entity.IncomeList;
import org.junit.jupiter.api.Test;
import picocli.CommandLine;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteIncomeCommandTest {

    @Test
    public void testDeleteIncomeByName() {
        Income income = new Income("Salary", 1000, "14-Nov-2011");
        IncomeList.addIncome(income);

        CommandLine cmd = CommandLineFactory.getCmd();
        int exitCode = cmd.execute("income", "delete", "-n Salary");
        assertEquals(0, exitCode);
    }

    @Test
    public void testDeleteIncomeById() {
        Income income = new Income("Salary", 1000, "14-Nov-2011");
        IncomeList.addIncome(income);

        CommandLine cmd = CommandLineFactory.getCmd();
        int exitCode = cmd.execute("income", "delete", "-i=1");
        assertEquals(0, exitCode);
    }
}
