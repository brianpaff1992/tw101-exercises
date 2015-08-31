package com.thoughtworks.tw101.exercises.exercise9;

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
        if(name.compareTo(nameOfNewNode) < 0)
        {
            //if nameOfNewNode belongs on the left side of our tree, make sure the current node is not a leaf node.
            //if it is, create a new node
            //if not, call add() on the left node
            if(left == null)
            {
                left = new Node(nameOfNewNode);
            }
            else {
                left.add(nameOfNewNode);
            }
        }

        //if nameOfNewNode belongs on the right side of our tree, make sure the current node is not a leaf node.
        //if it is, create a new node
        //if not, call add() on the right node
        else if (name.compareTo(nameOfNewNode) > 0)
        {
            if(right == null)
            {
                right = new Node(nameOfNewNode);
            }
            else {
                right.add(nameOfNewNode);
            }
        }
        else
        {
            //do nothing, exercise did not mention whether to keep all entires, or remove duplicates
        }

    }

    public List<String> names() {

        if(left == null)
        {
            return name;
        }

        List<String> returnList = left.names();
        List<String> rightList = right.names();

        returnList.addAll(rightList);

    }

    public String name()
    {
        return name;
    }
}
