/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kevin.canning.impl;

import java.util.ArrayList;
import kevin.canning.files.ExampleObject;

/**
 *
 * @author Kevin Canning - 211149381
 */
public interface ClassInterface {
    public int getInt();    
    public float getFloat();
    public ExampleObject getObject();
    public boolean getTruth();
    public boolean getFalse();
    public ArrayList getArrayList();
    public String [] getArray();
}