/*======================================
  class MergeSortTester

  ALGORITHM:
  <INSERT YOUR DISTILLATION OF ALGO HERE>

  BIG-OH CLASSIFICATION OF ALGORITHM:
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1         time: 
  n=10        time: 
  n=100       time: 
  n=1000      time: 
  n=10000     time: 
  n=100000    time: 
  n=1000000   time: 
  n=<huge>    time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/
/*
10log10 = 33.2
100log100 = 664.4
1000log1000 = 9965.8
10000log10000 = 132877.1
100000log100000 = 1660964.0
1000000log1000000 = 19931568.6


 */

import java.util.Arrays;
public class MergeSortTester 
{
    int[] ten = new int[10];
    int[] hun = new int[100];
    int[] thou = new int[1000];
    int[] tenthou = new int[10000];
    int[] hunthou = new int[100000];
    int[] mill = new int[1000000];
    
    //populating the arrays with random numbers
    public void initArrays(){
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
	long start=100000;
	long end=100000;

	System.out.println(Arrays.toString(Test.ten));
	System.out.println(Arrays.toString(Test.hun));

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
	System.out.println("10 element array: "+runtime1+" nanoseconds");
	System.out.println("100 element array: "+runtime2+" nanoseconds");
	System.out.println("1000 element array: "+runtime3+" nanoseconds");
	System.out.println("10000 element array: "+runtime4+" nanoseconds");
	System.out.println("100000 element array: "+runtime5+" nanoseconds");
	System.out.println("1000000 element array: "+runtime6+" nanoseconds");
		   
    }//end main

}//end class
