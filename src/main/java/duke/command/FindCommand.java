package duke.command;

import duke.DukeException;
import duke.Storage;
import duke.TaskList;
import duke.Ui;

/**
 * Command that finds the list of tasks that contains the given content when executed.
 */
public class FindCommand extends Command {
    private String content;

    /**
     * Class constructor of FindCommand.
     * @param content the content to be searched
     */
    public FindCommand(String content) {
        this.content = content;
    }

    /**
     * Finds the list of tasks that contains the given content.
     * @param tasks the TaskList of the Duke
     * @param ui the Ui of the Duke
     * @param storage the storage of the Duke
     * @return the list of tasks that contains the given content
     * @throws DukeException if error occurs during addition of the todo task
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        String res = tasks.find(content);
        return res;
    }

    /**
     * Returns true when the command indicates the closure of the software.
     * @return false
     */
    @Override
    public boolean isExit() {
        return false;
    }
}
