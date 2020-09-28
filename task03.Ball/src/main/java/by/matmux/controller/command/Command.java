/**
 * Contains a method for calling the command
 */

package by.matmux.controller.command;

import by.matmux.bean.BasketList;
import by.matmux.view.Consumer;

public interface Command {
    String execute(BasketList basketList, Consumer consumer);
}
