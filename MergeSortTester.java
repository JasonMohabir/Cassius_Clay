/*======================================
  class MergeSortTester

  ALGORITHM:
  <INSERT YOUR DISTILLATION OF ALGO HERE>

  BIG-OH CLASSIFICATION OF ALGORITHM:
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester 
{
    int[] ten = new int[10];
    int[] hun = new int[100];
    int[] thou = new int[1000];
    int[] tenthou = new int[10000];
    /*run only if it seems possible
      int[] hunthou = new int[100000];
      int[] mill = new int[1000000];*/
    
    //populating the arrays with random numbers
    for(int i : ten){
	i = (int)Math.random()*100;
    }
    for(int i : hun){
	i = (int)Math.random()*1000;
    }
    for(int i : thou){
	i = (int)Math.random()*10000;
    }
    for(int i : tenthou){
	i = (int)Math.random()*100000;
    }
    
    

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {

    }//end main

}//end class
