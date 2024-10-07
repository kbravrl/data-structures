/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stackheap;

public class GarbageCollector {

    public static void main(String[] args) {
        
        GarbageCollector obj=new GarbageCollector();  
	obj=null;
        
        GarbageCollector a = new GarbageCollector();
	GarbageCollector b = new GarbageCollector();
	b = a;
	System.gc();
    }  
    
    
    @Override
    public void finalize()
    {
        System.out.println("Garbage collection is performed");
    }
   
}

