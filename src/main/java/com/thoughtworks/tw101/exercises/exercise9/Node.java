package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;
// Exercise #9: Create a class Node that implements a binary tree for Strings. It should have an add(String name) method
// that recursively finds the correct place to add a new node and a names() method that returns the names of all of the
// nodes in alphabetical order (this should also be implemented using recursion).
public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        //check if nameOfNewNode is smaller alphabetically
        if(name.compareTo(nameOfNewNode) > 0)
        {
           addLeft(nameOfNewNode);
        }

        //if nameOfNewNode belongs on the right side of our tree, make sure the current node is not a leaf node.
        //if it is, create a new node
        //if not, call add() on the right node
        else if (name.compareTo(nameOfNewNode) < 0)
        {
          addRight(nameOfNewNode);
        }
        else
        {
            //do nothing, exercise did not mention whether to keep all entries, or remove duplicates
        }

    }

    private void addLeft(String nameOfNewNode)
    {
        //if nameOfNewNode belongs on the left side of our tree, make sure the current node is not a leaf node.
        //if it is, create a new node
        //if not, call add() on the left node
        if(left == null)
        {
            //is a leaf node
            left = new Node(nameOfNewNode);
        }
        else {
            left.add(nameOfNewNode);
        }
    }

    private void addRight(String nameOfNewNode)
    {
        if(right == null)
        {
            //is a leaf node
            right = new Node(nameOfNewNode);
        }
        else {
            right.add(nameOfNewNode);
        }
    }

    public List<String> names() {
        List<String> returnList = new ArrayList<String>();

        if(left != null)
        {
            returnList.addAll(left.names());
        }

        returnList.add(name);

        if(right != null)
        {
            returnList.addAll(right.names());
        }

        return returnList;

    }
}
