import java.util.*;

/**
 * This class encapsulates a list of Tasks input from the user which is stored in an Array List.
 */
public class List {
    private ArrayList<Task> arrayList;//Array List to store the tasks.
    private int maxSize;//the maximum number of tasks possible, defined by requirement.

    /**
     *
     * @param size: The maximum number of tasks possible which corresponds to maxSize.
     */
    public List(int size) {
        this.maxSize = size;
        this.arrayList = new ArrayList<Task>(maxSize);
    }

    public ArrayList<Task> getArrayList() {
        return this.arrayList;
    }

    /**
     * This method marks a task at a specific index in the list as done.
     * @param index: index of the task to be marked done in the array list of list
     * @return: return the task that is marked as done.
     */
    public Task markDone(int index) {
        Task task = arrayList.get(index);
        task.markDone();
        return task;
    }

    /**
     * This method marks a task at a specific index in the list as not done.
     * @param index: index of the task to be marked as not done in the array list of list.
     * @return: return the task that is marked as not done.
     */
    public Task unmarkDone(int index) {
        Task task = arrayList.get(index);
        task.unmarkDone();
        return task;
    }

    /**
     *  This method adds a task to the list.
     * @param task: the task input from the user.
     */
    public void add(Task task) {
        arrayList.add(task);
    }

    /**
     *
     * @return: Returns a string which displays the list of tasks in order of them being added.
     */
    @Override
    public String toString() {
        String str = "Here are the tasks in your list:\n";
        for (int i = 0; i < arrayList.size(); i++) {
            int index = i + 1;
            str = str + index + ". " + arrayList.get(i).toString() + "\n";
        }
        return str;
    }
}
