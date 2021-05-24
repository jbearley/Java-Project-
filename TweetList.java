/*
Name: Jacob Earley
Date: 5/4/21
Description: twitter tweet reader
Sources Cited: Adam case
*/
package tweetlist;


public class TweetList {
    private class Node
    {
        Tweet value;   
        Node next;      
        
        // Constructor for a node.
        Node(Tweet val, Node n)
        {
            value = val;
            next = n;
        } 
        
    }	
	 
    private Node head;
    
    public TweetList()
    {
    	head = null;     
    }
    
    public void print()
    {
    	Node p = head;     
        while (p != null)
        {
            // There is an element at p
            p.value.print();
            p = p.next;
        }
    	
    }
    
    public void prepend(Tweet newValue)
    {
    	Node newNode = new Node(newValue, head);
        head = newNode;

    }
    
    public int size()
    {
    	int count = 0;
        Node p = head;     
        while (p != null)
        {
            // There is an element at p
            count ++;
            p = p.next;
        }
        return count;

    }
    
    public void filter(String keyword)
    {
    	
    	Node curr = head.next;
    	Node prev = curr;
    
      
    	if (head.value.textContains(keyword) == false)
    	{
    		// Removal of first item in the list
    		head = head.next;    
    	}
      
    	while(curr != null)
    	{
    		
    		if(curr.value.textContains(keyword) == false)
    		{
    			prev.next = curr.next;
    		}
    		else
    			prev = curr;
    		curr = curr.next;
    	
    	
 
    }
    }}


