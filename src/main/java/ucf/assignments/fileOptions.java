/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Joseph Schander
 */
package ucf.assignments;

import java.io.File;
import java.util.List;
// note these will most likely be booleans in the future
public class fileOptions {
    public void saveList(List todoList){ // also has to take in location somehow
        /*
            Create file of file type pertaining to todoList
            copy the data of todoList to the file
            send file to external area
            returns true/false based on success of saving
         */
    }
    public void saveAllLists(List<List> listOfLists){
        /*
            Create folder for all the files
            call saveList for each list in listOfLists
            send all the lists to the folder
            returns true/false based on success of saving
         */
    }
    public void loadOneList(List<List> listOfLists, File listFile){
        /*
            convert the file to a list
            add the todolist to the listOfLists
            returns new listOfLists
         */
    }
    public void loadManyLists(List<List>listOfLists,List<List> listOfListsFile){
        /*
            call loadOneList for each file in the folder/group of lists user selects
            returns new listOfLists
         */
    }
}
