/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kevin.canning.files;

/**
 *
 * @author Kevin Canning - 211149381
 */

public class ExampleObject {   
    public String a;
    public int b;    
    
    public ExampleObject(String x, int y)
    {
           a = x;
           b = y;
    }
    
    public String getName()
    {        
        return a;
    }
    
    public int getNum()
    {
        return b;
    }
    
    public String toString()
    {
        return a + " " + b;
    }
}
