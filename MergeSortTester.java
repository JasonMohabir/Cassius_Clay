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
Trial 1:
10 element array: 5798 nanoseconds
100 element array: 78882 nanoseconds
1000 element array: 1182709 nanoseconds
10000 element array: 28089683 nanoseconds
100000 element array: 18878690 nanoseconds
1000000 element array: 180049793 nanoseconds

Trial 2:
10 element array: 5542 nanoseconds
100 element array: 73451 nanoseconds
1000 element array: 1091453 nanoseconds
10000 element array: 29327172 nanoseconds
100000 element array: 19094337 nanoseconds
1000000 element array: 182073914 nanoseconds

Trial 3:
10 element array: 5403 nanoseconds
100 element array: 75610 nanoseconds
1000 element array: 978398 nanoseconds
10000 element array: 16699807 nanoseconds
100000 element array: 22219069 nanoseconds
1000000 element array: 180576269 nanoseconds

Averages:
10 element array:            5 581 nanoseconds
100 element array:          75 981 nanoseconds
1000 element array:      1 084 187 nanoseconds
10000 element array:     2 470 554 nanoseconds
100000 element array:   20 064 032 nanoseconds
1000000 element array: 180 899 992 nanoseconds

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
	long start=0;
	long end=0;

	/*System.out.println(Arrays.toString(Test.ten));
	  System.out.println(Arrays.toString(Test.hun));*/
	start = System.nanoTime();
	MergeSort.sort(Test.ten);
	end = System.nanoTime();
	
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
