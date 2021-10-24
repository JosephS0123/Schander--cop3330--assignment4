/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Joseph Schander
 */
package ucf.assignments;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// note that items will be hashmaps with their name/description/due date/check for complete as keys
// but for now ill just list them with just a name string and info string for simplicity.
// note2 these will be accessed by the user through the gui and communicated between the controller and these classes
// meaning the variables input into them will most likely be different (im not well versed in this gui stuff yet)
public class itemOptions {
    public void addItem(List<Map<String,String>> todoList, String itemName, String itemDesc,String itemDate){
        /*
            create item using itemName and itemDesc and ItemDate
            set its completion mark to false
            add item to todolist
            returns nothing
         */
    }
    public void removeItem(List todoList,String itemName){
        /*
            Find item with itemName in the todoList
            remove it from the todoList
            returns Nothing
         */

    }
    public void editItemDescription(List todoList,String itemName,String newItemDesc){
        /*
            Find item with itemName in the todoList
            replace its current itemDesc with newItemDesc
            returns nothing
         */
    }
    public void editItemDate(List todoList,String itemName,String newItemDate){
        /*
            Find item with itemName in the todoList
            replace its current itemDate with newItemDate
            returns nothing
         */
    }
    public void editItemMark(List todoList,String itemName){
         /*
            Find item with itemName in the todoList
            switch its mark to true if it's currently false and vice versa
            returns nothing
         */
    }
    public void showCompletedItems(List todoList){
        /*
            creates a new list
            adds all items from todoList where mark is True
            doesn't replace information of the original todoList
            returns the new list
         */
    }
    public void showIncompleteItems(List todoList){
        /*
            creates a new list
            adds all items from todoList where mark is false
            doesn't replace information of the original todoList
            returns the new list
         */
    }
    public void showAllItems(List<List> listOfLists,List todoList){
        /*
            This is the default
            finds todoList from listOfLists using the name of todoList
            returns todoList found from listOfLists
         */
    }
    public void sortByDueDate(List todoList){
        /*
            create a newList
            goes through the todoList in order of date and adds to the newList
            return newList
         */
    }
}
