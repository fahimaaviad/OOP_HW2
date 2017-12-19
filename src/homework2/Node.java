package homework2;

import java.util.*;
/**
 * This class implements a Node for a graph. A typical Node consists of
 * a set of properties: {label,fathers,sons,color (white/black) }.
 */
public class Node<E> {
	private E label;
	private List<Node<E>> fathers;
	private List<Node<E>> sons;
	private boolean white; //true when node is white
	
    //Abstraction Function
	// this.label holds the label of the object,this.fathers is an array which contains all of the node's fathers
	// this.sons is an array which contains all the node's sons. this.white is true when the node is defined as white,
	// and false when it is defined as black
	//Representation Invariant
	// this.label != null, fathers and sons are arrays that do not have two nodes with the same label
	
	public Node(E label ,boolean white) {
		this.label = label;
		this.white = white;
		checkRep();
	}
	
	public void checkRep() {
		
	}
	public void addFather(Node<E> father) {
		fathers.add(father);
		
	}
	
	public getFathers() {
		
	}
	public void addSon (Node<E> son) {
		sons.add(son);
	}
	
	public void removeFather (Node<E> father) {
		fathers.remove(father);
	}
	
	public E getLabel() {
		return this.label;
	}

	public void setLabel(E label) {
		this.label = label;
	}
	
	public boolean getWhite() {
		boolean newWhite= this.white;
		return newWhite;
	}
	public void removeSon (Node<E> son) {
		sons.remove(son);
	}
}
