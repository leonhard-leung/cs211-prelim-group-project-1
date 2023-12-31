/**
 * @author Leonhard Leung
 * Date: 09/10/2023
 */

package sort;

public interface Sorter {
    /**
     * Sorts an array
     * @param array the array of type String to be sorted
     * @return the number of times it takes to group_project_1.misc.sort an array
     */
    long sort(String[] array);

    /**
     * Method that invokes the group_project_1.misc.sort method to obtain the best, ave, and worst count
     * @param bestArray the array of type String that holds the best case scenario
     * @param aveArray the array of type String that holds the average case scenario
     * @param worstArray the array of type String that holds the worst case scenario
     */
    void count(String[] bestArray, String[] aveArray, String[] worstArray);

    /**
     * Returns the total execution count of the best case array
     * @return a value of type int
     */
    long getBestCount();

    /**
     * Returns the total execution count of the average case array
     * @return a value of type int
     */
    long getAveCount();

    /**
     * Returns the total execution count of the worst case array
     * @return a value of type int
     */
    long getWorstCount();

    /**
     * Returns the group_project_1.misc.sort type of the sorting algorithm used
     * @return a value of type String
     */
    String getSortType();
} // end of Sorter interface
