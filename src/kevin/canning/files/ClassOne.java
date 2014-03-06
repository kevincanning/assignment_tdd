/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kevin.canning.files;

import java.util.ArrayList;
import kevin.canning.impl.ClassInterface;

/**
 *
 * @author Kevin Canning - 211149381
 */

public class ClassOne implements ClassInterface {
    @Override
    public int getInt()
    {
        return 100;
    }
    
    @Override
    public float getFloat()
    {
        return (float)5.555;
    }
    
    @Override
    public ExampleObject getObject()
    {
        return new ExampleObject("Name", 21);
    }
    
    @Override
    public boolean getTruth()
    {
        return true;
    }
    
    @Override
    public boolean getFalse()
    {
        return false;
    }
    
    @Override
    public ArrayList getArrayList()
    {
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        
        return a;
    }
    
    @Override
    public String [] getArray()
    {
        return new String [] {"First", "Second", "Third"};
    }
}
