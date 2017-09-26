/*****************************************************
***  Class Name: EnDeQueue
***  Class Author: Gabriel Winkler
******************************************************
*** Purpose of the class: This class will add integers to a linked list in a queue.
*** This will also allow the GUI to remove integers from the queue in order.
******************************************************
*** Date: September 26th, 2017
******************************************************
*** List of changes with dates:
*** September 19th: Create the EnDeQueue class.
***               - Double check all variables and where they point.
*** September 26th: Re-do the circle method to return answer.
*******************************************************/
package QueuedLinkList;

/**
 *
 * @author Gabriel
 */
public class EnDeQueue {
    public IntLL head;
    public IntLL tail;
    
    public EnDeQueue() //Constructor
    {
        head = null;
        tail = null;
    }
/*****************************************************
***  Method Name: enqueue
***  Method Author: Gabriel Winkler
******************************************************
*** Purpose of the method: To add integers to a queue in the linked list.
******************************************************
*** Date: September 19th, 2017
******************************************************/
    public void enqueue(int value)//create a link!
    {
        if(head == null)
        {
            IntLL temp = new IntLL();
            temp.value = value;
            head = temp;
            tail = temp;// these two make head and tail point to temp.
        }
        else
        {
            IntLL temp = new IntLL();
            temp.value = value;
            tail.nextLL = temp;
            tail = temp;
        }
    }
/*****************************************************
***  Method Name: dequeue
***  Method Author: Gabriel Winkler
******************************************************
*** Purpose of the method: To remove integers from a queue in the linked list.
******************************************************
*** Date: September 19th, 2017
******************************************************/
    public int dequeue()
    {
        int toBeReturned;
        if(head != null)
        {
            toBeReturned = head.value;// now set pointer head to next in line
            head = head.nextLL;//now, the first value is cut from the list
        }
        else //a.k.a.- what to do when the list is finished dequeuing...
        {
            toBeReturned = 0;
        }// we set the value of toBeReturned to 0 because an int needs a number
        return toBeReturned;
    }
    // now write a method to print the list without changing it.
/*****************************************************
***  Method Name: circle
***  Method Author: Gabriel Winkler
******************************************************
*** Purpose of the method: To add a way to print the linked list.
******************************************************
*** Date: September 19th, 2017
******************************************************/
    public String circle()
    {
        String answer = "";
        IntLL temp = head;
        while (temp != null)
        {
            answer += temp.value + ", ";
            //System.out.println("Value is "+ temp.value);// not appropriate for homework... 
            temp = temp.nextLL;
        }// this will run until temp is null.
        return answer;
    }    
}
