//Jason Mohabir and Shanjeed Ali
//APCS2 pd10
//HW11 -- Wrapping It Up
//2016-03-11

/*======================================
  class MergeSortTester

  ALGORITHM:
  We think that the divide part of MergeSort runs in linear time. The merging and the ordering of the arrays together run in nlogn time. This gives us n+nlogn, which can be written as n(logn+1) which is equal to nlogn.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  nlogn

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1         time:           163 nanoseconds
  n=10        time:       5 581 nanoseconds
  n=100       time:      75 981 nanoseconds
  n=1000      time:   1 084 187 nanoseconds
  n=10000     time:   2 470 554 nanoseconds
  n=100000    time:  20 064 032 nanoseconds
  n=1000000   time: 180 899 992 nanoseconds
  n=<huge>    time:    nlogn

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  We graphed both our data and the runtimes we got from running mergeSort. The graphs are similar but our empirical runtime does not increase as fast as we expected.The graph for the data has a less steep increase than the graph of y=xlogx. 
  ====================================*/

import java.util.Arrays;
public class MergeSortTester 
{
    int[] one = new int[1];
    int[] ten = new int[10];
    int[] hun = new int[100];
    int[] thou = new int[1000];
    int[] tenthou = new int[10000];
    int[] hunthou = new int[100000];
    int[] mill = new int[1000000];
    
    //populating the arrays with random numbers
    public void initArrays(){
	for(int i=0; i<one.length; i++){
	    ten[i] = (int)(Math.random()*10);
	}
	for(int i=0; i<ten.length; i++){
	    ten[i] = (int)(Math.random()*100);
	}
	for(int i=0; i<hun.length; i++){
	    hun[i] = (int)(Math.random()*1000);
	}
	for(int i=0; i<thou.length; i++){
	    thou[i] = (int)(Math.random()*10000);
	}
	for(int i=0; i<tenthou.length; i++){
	    tenthou[i] = (int)(Math.random()*100000);
	}
	for(int i=0; i<hunthou.length; i++){
	    hunthou[i] = (int)(Math.random()*1000000);
	}
	for(int i=0; i<mill.length; i++){
	    mill[i] = (int)(Math.random()*10000000);
	}
    }
    
    
    
    

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {
	MergeSortTester Test = new MergeSortTester();
	Test.initArrays();
	long start=0;
	long end=0;

	/*System.out.println(Arrays.toString(Test.ten));
	  System.out.println(Arrays.toString(Test.hun));*/
	start = System.nanoTime();
	MergeSort.sort(Test.ten);
	end = System.nanoTime();

	start = System.nanoTime();
	MergeSort.sort(Test.one);
	end = System.nanoTime();
	long runtime0 = end - start;
	
	start = System.nanoTime();
	MergeSort.sort(Test.ten);
	end = System.nanoTime();
	long runtime1 = end - start;

	start = System.nanoTime();
	MergeSort.sort(Test.hun);
	end = System.nanoTime();
	long runtime2 = end - start;

	start = System.nanoTime();
	MergeSort.sort(Test.thou);
	end = System.nanoTime();
	long runtime3 = end - start;

	start = System.nanoTime();
	MergeSort.sort(Test.tenthou);
	end = System.nanoTime();
	long runtime4 = end - start;

	start = System.nanoTime();
	MergeSort.sort(Test.hunthou);
	end = System.nanoTime();
	long runtime5 = end - start;

	start = System.nanoTime();
	MergeSort.sort(Test.mill);
	end = System.nanoTime();
	long runtime6 = end - start;

	System.out.println("Runtimes:");
	System.out.println("1 element array: "+runtime0+" nanoseconds");
	System.out.println("10 element array: "+runtime1+" nanoseconds");
	System.out.println("100 element array: "+runtime2+" nanoseconds");
	System.out.println("1000 element array: "+runtime3+" nanoseconds");
	System.out.println("10000 element array: "+runtime4+" nanoseconds");
	System.out.println("100000 element array: "+runtime5+" nanoseconds");
	System.out.println("1000000 element array: "+runtime6+" nanoseconds");
		   
    }//end main

}//end class
