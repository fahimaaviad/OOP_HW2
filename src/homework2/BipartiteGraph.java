package homework2;

import java.util.*;


/**
 * This class implements a Bipartite Graph. 
 */
public class BipartiteGraph<E> {
	
	
    //  Abstraction Function:
	// for a BipartiteGraph named BG:
	// BG.graphName is the name of the graph
	// BG.blackNodes is a list of all black nodes in the graph
	// BG.whiteNodes is a list of all white nodes in the graph
	// BG.edgeList is a list of all edges connecting between the nodes
	
    // Representation Invariant:
	// BG.graphName != null
	// BG.blackNodes does not contain two nodes with the same label
	// BG.whiteNodes does not contain two nodes with the same label
	// BG.edgeList  does not contain two edges with the same label that have the same
	// father or son 
	
	
	private String graphName;
	private List<Node<E>> blackNodes;
	private List<Node<E>> whiteNodes;
	private List<Edges<E>> edgesList;
	
    /**
     * @modifies this
     * @effects Constructs a new Bipartite Graph.
     */
    public BipartiteGraph (String graphName) {
    	// TODO: Implement this constructor
    	this.graphName = graphName;
    	this.blackNodes = new ArrayList<>();
    	this.whiteNodes = new ArrayList<>();
    	this.edgesList = new ArrayList<>();
       
    }
    
    /**
     * @modifies this
     * @effects Adds a black node represented by the String nodeName to this
     */
    public void addBlackNode(E nodeName) {
    	// TODO: Implement this method
<<<<<<< HEAD
    	nodesList.add(e)
    	List<String> nodeName = new ArrayList<>();
=======
    	
    	// Check if a node with 'nameName' does not exist
    	for (Node<E> n : this.blackNodes) {
    		if (n.getName() == nodeName) {
    			return;
    		}
    	}
    	Node<E> newBlackNode = new Node<E>(nodeName, null, false);
    	this.blackNodes.add(newBlackNode);
    	return;
    }
    

    /**
     * @modifies this
     * @effects Adds a black node represented by the String nodeName to this
     */
    public void addWhiteNode(E nodeName) {
    	// TODO: Implement this method
    	// Check if a node with 'nameName' does not exist
    	for (Node<E> n : this.whiteNodes) {
    		if (n.getName() == nodeName) {
    			return;
    		}
    	}
    	Node<E> newWhiteNode = new Node<E>(nodeName, null, false);
    	this.whiteNodes.add(newWhiteNode);
    	return;
    }
    
    /**
     * @effects return node with the name 'nodeName', if exists. returns null otherwise.
     */
    public Node<E> getNode(E nodeName) {
    	
    	// return white node with the name 'nodeName', if exists
    	if (this.whiteNodes != null ) {
        	for (Node<E> n : this.whiteNodes) {
        		if (n.getName() == nodeName) {
        			return n;
        		}
        	}	
    	}

    	// return black node with the name 'nodeName', if exists
    	if (this.whiteNodes != null ) {
        	for (Node<E> n : this.blackNodes) {
        		if (n.getName() == nodeName) {
        			return n;
        		}
        	}	
    	}
    	
    	// haven't found node with the name nodeName
    	return null;

    }

    
    /**
     * @requires createGraph(graphName)
     *           && ((addBlackNode(parentName) && addWhiteNode(childName))
     *              || (addWhiteNode(parentName) && addBlackNode(childName)))
     *           && edgeLabel != null
     *           && node named parentName has no other outgoing edge labeled
     * 				edgeLabel
     *           && node named childName has no other incoming edge labeled
     * 				edgeLabel
     * @modifies graph named graphName
     * @effects Adds an edge from the node parentName to the node childName
     * 			in the graph graphName. The new edge's label is the String
     * 			edgeLabel.
     */
    public void addEdge(E parentName, E childName, E edgeLabel) {
    	//TODO: Implement this method
    	
    	// Check that an edge with the same label that have the same
    	// father or son does not already exist in the edgesList
    	for (Edge<E> e : this.edgesList) {
    		if (e.getName() == edgeLabel) {
    			if ((e.getFather() == parentName) || (e.getSon() == parentName)) {
    				return;
    			}
    		}
    	}
    	
    	// Create and add new edge to edgeList
    	Edge<E> edge = new Edge<E>(parentName, childName, edgeLabel);
    	this.edgesList.add(edge);
    	
    	// Update parentName & childName with their new father/son
    	Node<E> father = this.getNode(parentName);
    	Node<E> son = this.getNode(childName);
    	father.addSon(son);
    	son.addFather(father);
    	
    }

    
    /**
     * @requires createGraph(graphName)
     * @return a space-separated list of the names of all the black nodes
     * 		   in the graph graphName, in alphabetical order.
     */
    public String listBlackNodes(String graphName) {
    	//TODO: Implement this method
    	
    	
    }

    
    /**
     * @requires createGraph(graphName)
     * @return a space-separated list of the names of all the white nodes
     * 		   in the graph graphName, in alphabetical order.
     */
    public String listWhiteNodes(String graphName) {
    	//TODO: Implement this method
    	
>>>>>>> 4bf0d752e41ae229943afc432bb79c074e5eb195
    	
    }

    
    /**
     * @requires createGraph(graphName) && createNode(parentName)
     * @return a space-separated list of the names of the children of
     * 		   parentName in the graph graphName, in alphabetical order.
     */
    public String listChildren(String graphName, String parentName) {
    	//TODO: Implement this method
    	
    	
    }

    
    /**
     * @requires createGraph(graphName) && createNode(childName)
     * @return a space-separated list of the names of the parents of
     * 		   childName in the graph graphName, in alphabetical order.
     */
    public String listParents(String graphName, String childName) {
    	//TODO: Implement this method
    	
    	
    }

    
    /**
     * @requires addEdge(graphName, parentName, str, edgeLabel) for some
     * 			 string str
     * @return the name of the child of parentName that is connected by the
     * 		   edge labeled edgeLabel, in the graph graphName.
     */
    public String getChildByEdgeLabel(String graphName, String parentName,
    								   String edgeLabel) {
    	//TODO: Implement this method
    	
    	
    }

    
    /**
     * @requires addEdge(graphName, str, childName, edgeLabel) for some
     * 			 string str
     * @return the name of the parent of childName that is connected by the 
     * 		   edge labeled edgeLabel, in the graph graphName.
     */
    public String getParentByEdgeLabel(String graphName, String childName,
    									String edgeLabel) {
    	//TODO: Implement this method
    	
    }

}
