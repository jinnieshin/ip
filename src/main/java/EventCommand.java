public class EventCommand extends Command {
    private String content;

    public EventCommand(String content) {
        this.content = content;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        if (!FormatChecker.isCorrectEventCmd(this.content)) {
            throw new DukeException(
                "Please use the correct format to add an event.");
        }
        String[] eventTask = content.split("/from|/to");
        eventTask[0] = eventTask[0].trim();
        eventTask[1] = eventTask[1].trim();
        eventTask[2] = eventTask[2].trim();
        if (!FormatChecker.isCorrectDateInput(eventTask[1]) || !FormatChecker.isCorrectDateInput(eventTask[2])) {
            throw new DukeException("Please use the correct format for date (dd/MM/yyyy HH:mm)");
        }
        try {
            tasks.add(eventTask[0], eventTask[1], eventTask[2], true);
        } catch (DukeException e) {
            throw e;
        }
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
