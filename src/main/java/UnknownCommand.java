public class UnknownCommand extends Command {
    public UnknownCommand() {}

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        System.out.println("I'm sorry, but I don't know what that means :-(");
    }

    @Override
    public boolean isExit() {
        return false;
    }
}