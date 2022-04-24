package Tests;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import Assignment02.*;

public class BSTTests {

    private final BinarySearchTree bst = new BinarySearchTree();

    private ArrayList<Integer> sampleTreeEntries(){
        var treeEntries = new ArrayList<Integer>();
        treeEntries.add(3);
        treeEntries.add(1);
        treeEntries.add(4);
        treeEntries.add(9);
        treeEntries.add(5);
        treeEntries.add(2);
        treeEntries.add(7);
        treeEntries.add(6);
        treeEntries.add(8);
        return treeEntries;
    }

    @Test
    public void addsRootNodeIfTreeIsEmpty() {
        int data = 12;
        long size = 1;
        var result = bst.add(data);
        assertEquals(data, result.getData(), 0.0001);
        assertEquals(size, bst.getSize());
        bst.clear();
    }

    @Test
    public void returnsTrueIfDataExists() {

        var treeEntries = this.sampleTreeEntries();
        for (Integer data : treeEntries) {
            bst.add(data);
        }
        
        var testData = new ArrayList<Integer>();
        testData.add(9);
        testData.add(5);
        testData.add(2);

        for (Integer testCase : testData) {
            boolean computedResult = bst.search(testCase);
            assertTrue(computedResult == true);  
        }
        bst.clear();
    }

    @Test
    public void returnsFalseIfDataDoesNotExist(){
        var treeEntries = this.sampleTreeEntries();
        for (Integer data : treeEntries) {
            bst.add(data);
        }

        var testData = new ArrayList<Integer>();
        testData.add(20);
        testData.add(-1);
        testData.add(100);
    
        for (Integer testCase : testData) {
            boolean computedResult = bst.search(testCase);
            assertTrue(computedResult == false);  
        }
        bst.clear();

    }

    

}
