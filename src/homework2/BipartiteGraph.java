package homework2;

import java.util.*;

/**
 * This class implements a Bipartite Graph. 
 */
public class BipartiteGraph<E> {
	private String graphName;
	private List<E> nodesList;
	
    /**
     * @modifies this
     * @effects Constructs a new Bipartite Graph.
     */
    public BipartiteGraph (String graphName) {
    	// TODO: Implement this constructor
    	this.graphName = graphName;
    	List<E> nodesList = new ArrayList<>();
    	//List<E> blackNodesList = new ArrayList<>();
    	//List<E> whiteNodesList = new ArrayList<>();
       
    }
    /**
     * @requires createGraph(graphName)
     *           && nodeName != null
     *           && neither addBlackNode(graphName,nodeName) 
     *                  nor addWhiteNode(graphName,nodeName)
     *                      has already been called on this
     * @modifies graph named graphName
     * @effects Adds a black node represented by the String nodeName to the
     * 			graph named graphName.
     */
    public void addBlackNode(E nodeName) {
    	// TODO: Implement this method
    	nodesList.add(e)
    	List<String> nodeName = new ArrayList<>();
    	
    }
    

}
