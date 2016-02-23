package ch.uzh.ifi.GraphAlgorithms;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

public class testGraph {


	/*
	 * 
	 */
	@Test
	public void testVertex() {
		Vertex v = new Vertex(23);
		assertTrue(v.getID()==23);
	}
	
	/*
	 * Test for undirected unweighted graph
	 */
	@Test
	public void testConstructor() {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);
		vertices.add(v5);
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();
		List<VertexCell> adjList5 = new LinkedList<VertexCell>();
		adjList1.add(new VertexCell(v2,1));
		adjList1.add(new VertexCell(v5,1));
		
		adjList2.add(new VertexCell(v1,1));
		adjList2.add(new VertexCell(v5,1));
		adjList2.add(new VertexCell(v3,1));
		adjList2.add(new VertexCell(v4,1));
		
		adjList3.add(new VertexCell(v2,1));
		adjList3.add(new VertexCell(v4,1));
		
		adjList4.add(new VertexCell(v2,1));
		adjList4.add(new VertexCell(v5,1));
		adjList4.add(new VertexCell(v3,1));
		
		adjList5.add(new VertexCell(v4,1));
		adjList5.add(new VertexCell(v1,1));
		adjList5.add(new VertexCell(v2,1));
		Graph g = new Graph(vertices, adjList1, adjList2, adjList3, adjList4, adjList5);
	}
	
	/*
	 * Test for undirected weighted graph
	 */
	@Test
	public void testConstructor1() {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);
		vertices.add(v5);

		List<VertexCell> adjList1 = new LinkedList<VertexCell>();
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();
		List<VertexCell> adjList5 = new LinkedList<VertexCell>();
		adjList1.add(new VertexCell(v2, 0.5));
		adjList1.add(new VertexCell(v5, 0.1));
		
		adjList2.add(new VertexCell(v1, 0.1));
		adjList2.add(new VertexCell(v5, 0.2));
		adjList2.add(new VertexCell(v3, 0.3));
		adjList2.add(new VertexCell(v4, 0.4));
		
		adjList3.add(new VertexCell(v2, 0.3));
		adjList3.add(new VertexCell(v4, 0.7));
		
		adjList4.add(new VertexCell(v2, 0.3));
		adjList4.add(new VertexCell(v5, 0.3));
		adjList4.add(new VertexCell(v3, 0.3));
		
		adjList5.add(new VertexCell(v4, 0.3));
		adjList5.add(new VertexCell(v1, 0.3));
		adjList5.add(new VertexCell(v2, 0.3));
		Graph g = new Graph(vertices, adjList1, adjList2, adjList3, adjList4, adjList5);
		assertTrue(g.getOutputDegree(1)==2);
		assertTrue(g.getOutputDegree(2)==4);
		assertTrue(g.getOutputDegree(3)==2);
		assertTrue(g.getOutputDegree(4)==3);
		assertTrue(g.getOutputDegree(5)==3);
		
		assertTrue(g.getInputDegree(1)==2);
		assertTrue(g.getInputDegree(2)==4);
		assertTrue(g.getInputDegree(3)==2);
		assertTrue(g.getInputDegree(4)==3);
		assertTrue(g.getInputDegree(5)==3);
	}
	
	//@Test
	/*
	 * Test for directed weighted graph
	 */
	@Test
	public void testConstructor2() {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);
		vertices.add(v5);
		vertices.add(v6);
		
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();
		List<VertexCell> adjList5 = new LinkedList<VertexCell>();
		List<VertexCell> adjList6 = new LinkedList<VertexCell>();
		
		adjList1.add(new VertexCell(v2, 0.5));
		adjList1.add(new VertexCell(v4, 0.1));
		adjList2.add(new VertexCell(v5, 0.15));
		adjList3.add(new VertexCell(v6, 0.3));
		adjList3.add(new VertexCell(v5, 0.7));
		adjList4.add(new VertexCell(v2, 0.3));
		adjList5.add(new VertexCell(v4, 0.3));
		adjList6.add(new VertexCell(v6, 0.3));
		
		Graph g = new Graph(vertices, adjList1, adjList2, adjList3, adjList4, adjList5, adjList6);
		assertTrue(g.getOutputDegree(1)==2);
		assertTrue(g.getOutputDegree(2)==1);
		assertTrue(g.getOutputDegree(3)==2);
		assertTrue(g.getOutputDegree(4)==1);
		assertTrue(g.getOutputDegree(5)==1);
		assertTrue(g.getOutputDegree(6)==1);
		
		assertTrue(g.getInputDegree(1)==0);
		assertTrue(g.getInputDegree(2)==2);
		assertTrue(g.getInputDegree(3)==0);
		assertTrue(g.getInputDegree(4)==2);
		assertTrue(g.getInputDegree(5)==2);
		assertTrue(g.getInputDegree(6)==2);
		
		assertTrue(g.isAdjacent(v1, v2));
		assertFalse(g.isAdjacent(v2, v1));
		
		assertTrue(g.BellmanFord(v1, 0));
		//System.out.println(g.toString());
	}
	
	//@Test
	/*
	 * Test for directed weighted graph
	 */
	@Test
	public void testDijkstra() {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);
		vertices.add(v5);
		vertices.add(v6);
		
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();
		List<VertexCell> adjList5 = new LinkedList<VertexCell>();
		List<VertexCell> adjList6 = new LinkedList<VertexCell>();
		
		adjList1.add(new VertexCell(v2, 0.5));
		adjList1.add(new VertexCell(v4, 0.1));
		adjList2.add(new VertexCell(v5, 0.15));
		adjList3.add(new VertexCell(v6, 0.3));
		adjList3.add(new VertexCell(v5, 0.7));
		adjList4.add(new VertexCell(v2, 0.3));
		adjList5.add(new VertexCell(v4, 0.3));
		adjList6.add(new VertexCell(v6, 0.3));
		
		Graph g = new Graph(vertices, adjList1, adjList2, adjList3, adjList4, adjList5, adjList6);
		assertTrue(g.getOutputDegree(1)==2);
		assertTrue(g.getOutputDegree(2)==1);
		assertTrue(g.getOutputDegree(3)==2);
		assertTrue(g.getOutputDegree(4)==1);
		assertTrue(g.getOutputDegree(5)==1);
		assertTrue(g.getOutputDegree(6)==1);
		
		assertTrue(g.getInputDegree(1)==0);
		assertTrue(g.getInputDegree(2)==2);
		assertTrue(g.getInputDegree(3)==0);
		assertTrue(g.getInputDegree(4)==2);
		assertTrue(g.getInputDegree(5)==2);
		assertTrue(g.getInputDegree(6)==2);
		
		assertTrue(g.isAdjacent(v1, v2));
		assertFalse(g.isAdjacent(v2, v1));
		
		g.Dijkstra(v1, 0);
		//System.out.println(g.toString());
	}
	
	//@Test
	/*
	 * Test for undirected  graph
	 */
	@Test
	public void testBFSundirected() {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		Vertex v7 = new Vertex(7);
		Vertex v8 = new Vertex(8);
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);
		vertices.add(v5);
		vertices.add(v6);
		vertices.add(v7);
		vertices.add(v8);
		
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();
		List<VertexCell> adjList5 = new LinkedList<VertexCell>();
		List<VertexCell> adjList6 = new LinkedList<VertexCell>();
		List<VertexCell> adjList7 = new LinkedList<VertexCell>();
		List<VertexCell> adjList8 = new LinkedList<VertexCell>();
		
		adjList1.add(new VertexCell(v2, 0));
		adjList2.add(new VertexCell(v1, 0));
		adjList2.add(new VertexCell(v3, 0));
		adjList3.add(new VertexCell(v2, 0));
		adjList3.add(new VertexCell(v4, 0));
		adjList4.add(new VertexCell(v3, 0));
		adjList4.add(new VertexCell(v5, 0));
		adjList4.add(new VertexCell(v6, 0));
		adjList5.add(new VertexCell(v4, 0));
		adjList5.add(new VertexCell(v6, 0));
		adjList5.add(new VertexCell(v8, 0));
		adjList6.add(new VertexCell(v4, 0));
		adjList6.add(new VertexCell(v5, 0));
		adjList6.add(new VertexCell(v7, 0));
		adjList6.add(new VertexCell(v8, 0));
		adjList7.add(new VertexCell(v6, 0));
		adjList7.add(new VertexCell(v8, 0));
		adjList8.add(new VertexCell(v5, 0));
		adjList8.add(new VertexCell(v6, 0));
		adjList8.add(new VertexCell(v7, 0));
		
		Graph g = new Graph(vertices, adjList1, adjList2, adjList3, adjList4, adjList5, adjList6, adjList7, adjList8);
		g.BFS(v2);
		assertTrue(v1.getPredecessor(0) == v2.getID());
		assertTrue(v1.getShortestPathEst(0) == 1);
		assertTrue(v3.getPredecessor(0) == v2.getID());
		assertTrue(v3.getShortestPathEst(0) == 1);
		assertTrue(v4.getPredecessor(0) == v3.getID());
		assertTrue(v4.getShortestPathEst(0) == 2);
		assertTrue(v5.getPredecessor(0) == v4.getID());
		assertTrue(v5.getShortestPathEst(0) == 3);
		assertTrue(v6.getPredecessor(0) == v4.getID());
		assertTrue(v6.getShortestPathEst(0) == 3);
		assertTrue(v7.getPredecessor(0) == v6.getID());
		assertTrue(v7.getShortestPathEst(0) == 4);
		assertTrue(v8.getPredecessor(0) == v5.getID());
		assertTrue(v8.getShortestPathEst(0) == 4);
	}
	
	//@Test
	/*
	 * Test for directed  graph
	 */
	@Test
	public void testBFSdirected() {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		Vertex v7 = new Vertex(7);
		Vertex v8 = new Vertex(8);
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);
		vertices.add(v5);
		vertices.add(v6);
		vertices.add(v7);
		vertices.add(v8);
		
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();
		List<VertexCell> adjList5 = new LinkedList<VertexCell>();
		List<VertexCell> adjList6 = new LinkedList<VertexCell>();
		List<VertexCell> adjList7 = new LinkedList<VertexCell>();
		List<VertexCell> adjList8 = new LinkedList<VertexCell>();
		
		adjList2.add(new VertexCell(v1, 0));
		adjList2.add(new VertexCell(v3, 0));
		adjList3.add(new VertexCell(v4, 0));
		adjList4.add(new VertexCell(v5, 0));
		adjList4.add(new VertexCell(v6, 0));
		adjList5.add(new VertexCell(v6, 0));
		adjList5.add(new VertexCell(v8, 0));
		adjList7.add(new VertexCell(v6, 0));
		adjList7.add(new VertexCell(v8, 0));
		adjList8.add(new VertexCell(v6, 0));
		
		Graph g = new Graph(vertices, adjList1, adjList2, adjList3, adjList4, adjList5, adjList6, adjList7, adjList8);
		g.BFS(v2);
		assertTrue(v1.getPredecessor(0) == v2.getID());
		assertTrue(v1.getShortestPathEst(0) == 1);
		assertTrue(v3.getPredecessor(0) == v2.getID());
		assertTrue(v3.getShortestPathEst(0) == 1);
		assertTrue(v4.getPredecessor(0) == v3.getID());
		assertTrue(v4.getShortestPathEst(0) == 2);
		assertTrue(v5.getPredecessor(0) == v4.getID());
		assertTrue(v5.getShortestPathEst(0) == 3);
		assertTrue(v6.getPredecessor(0) == v4.getID());
		assertTrue(v6.getShortestPathEst(0) == 3);
		assertTrue(v7.getPredecessor(0) == 0);
		assertTrue(v8.getPredecessor(0) == v5.getID());
		assertTrue(v8.getShortestPathEst(0) == 4);
	}
	
	//@Test
	/*
	 * Test for undirected  graph
	 */
	@Test
	public void testBuildResidualNetwork() {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);
		vertices.add(v5);
		vertices.add(v6);
		
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();
		List<VertexCell> adjList5 = new LinkedList<VertexCell>();
		List<VertexCell> adjList6 = new LinkedList<VertexCell>();
		
		adjList1.add(new VertexCell(v2, 16, 11));
		adjList1.add(new VertexCell(v3, 13, 8));
		adjList2.add(new VertexCell(v3, 10, 0));
		adjList2.add(new VertexCell(v4, 12, 12));
		adjList3.add(new VertexCell(v2, 4, 1));
		adjList3.add(new VertexCell(v5, 14, 11));
		adjList4.add(new VertexCell(v3, 9, 4));
		adjList4.add(new VertexCell(v6, 20, 15));
		adjList5.add(new VertexCell(v4, 7, 7));
		adjList5.add(new VertexCell(v6, 4, 4));
		
		Graph g = new Graph(vertices, adjList1, adjList2, adjList3, adjList4, adjList5, adjList6);
		Graph residualNetwork = g.buildResidualNetwork();
		residualNetwork.BFS(v1);
		//System.out.println(residualNetwork.toString());
		List<VertexCell> path = residualNetwork.getPath(v1, v6);
		//System.out.println("D= " + path.toString());
		assertTrue(path.get(0)._v.getID()==6 && path.get(0)._w==5);
		assertTrue(path.get(1)._v.getID()==4 && path.get(1)._w==4);
		assertTrue(path.get(2)._v.getID()==3 && path.get(2)._w==5);
		//System.out.println(residualNetwork.toString());
	}
	
	//@Test
	/*
	 * Test for undirected  graph
	 */
	@Test
	public void testFordFalkerson() {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);
		vertices.add(v5);
		vertices.add(v6);
		
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();
		List<VertexCell> adjList5 = new LinkedList<VertexCell>();
		List<VertexCell> adjList6 = new LinkedList<VertexCell>();
		
		adjList1.add(new VertexCell(v2, 16, 0));
		adjList1.add(new VertexCell(v3, 13, 0));
		adjList2.add(new VertexCell(v3, 10, 0));
		adjList2.add(new VertexCell(v4, 12, 0));
		adjList3.add(new VertexCell(v2, 4, 0));
		adjList3.add(new VertexCell(v5, 14, 0));
		adjList4.add(new VertexCell(v3, 9, 0));
		adjList4.add(new VertexCell(v6, 20, 0));
		adjList5.add(new VertexCell(v4, 7, 0));
		adjList5.add(new VertexCell(v6, 4, 0));
		
		Graph g = new Graph(vertices, adjList1, adjList2, adjList3, adjList4, adjList5, adjList6);
		//System.out.println(g.toString());
		
		g.FordFulkerson(v1, v6);
		//System.out.println(g.toString());
	}
	
	//@Test
	/*public void testSimpleMCF1() {
		Vertex s1 = new Vertex(1);
		Vertex s2 = new Vertex(2);
		Vertex t1 = new Vertex(3);
		Vertex t2 = new Vertex(4);
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(s1);
		vertices.add(s2);
		vertices.add(t1);
		vertices.add(t2);
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();	//for s1
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();	//for s2
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();	//for t1
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();	//for t2
		adjList1.add(new VertexCell(s2,1));
		adjList1.add(new VertexCell(t2,1));
		
		adjList2.add(new VertexCell(t2,1));
		adjList2.add(new VertexCell(t1,3));
		
		adjList3.add(new VertexCell(t2,2));
		
		adjList4.add(new VertexCell(t1,1));

		Graph g = new Graph(vertices, adjList1, adjList2, adjList3, adjList4);
		assertTrue(g.getNumberOfEdges() == 6);
		
		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(s1);
		sources.add(s2);
		sinks.add(t1);
		sinks.add(t2);
		double[] demands = new double[2];
		demands[0] = 2.0;
		demands[1] = 3.0;
		
		//System.out.println("MCF for the 1st simple topology");
		g.MCF(sources, sinks, demands);
		List<Edge> edges = g.getEdges();
		
		assertTrue(Math.abs(edges.get(0).getFlow(0) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(0).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(0) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(1) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(0) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(1) - 2.0) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(1) - 2.0) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(0) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(1) - 0.0) < 1e-6);
	}
	
	//@Test
	public void testSimpleMCF2() {
		Vertex s1 = new Vertex(1);
		Vertex s2 = new Vertex(2);
		Vertex t1 = new Vertex(3);
		Vertex t2 = new Vertex(4);
		Vertex v  = new Vertex(5);
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(s1);
		vertices.add(s2);
		vertices.add(t1);
		vertices.add(t2);
		vertices.add(v);
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();	//for s1
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();	//for s2
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();	//for t1
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();	//for t2
		List<VertexCell> adjList5 = new LinkedList<VertexCell>(); 	//for v
		adjList1.add(new VertexCell(s2,1));
		adjList1.add(new VertexCell(t2,2));
		adjList1.add(new VertexCell(v, 2));
		
		adjList2.add(new VertexCell(v,2));
		adjList2.add(new VertexCell(t1,1));
				
		adjList4.add(new VertexCell(t1,0.5));
		
		adjList5.add(new VertexCell(t1,1.5));
		adjList5.add(new VertexCell(s1,2));
		adjList5.add(new VertexCell(t2,1));

		Graph g = new Graph(vertices, adjList1, adjList2, adjList3, adjList4, adjList5);
		assertTrue(g.getNumberOfEdges() == 9);
		
		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(s1);
		sources.add(s2);
		sinks.add(t1);
		sinks.add(t2);
		double[] demands = new double[2];
		demands[0] = 3.0;
		demands[1] = 2.0;
		
		//System.out.println("MCF for the 2nd simple topology");
		g.MCF(sources, sinks, demands);
		List<Edge> edges = g.getEdges();

		assertTrue(Math.abs(edges.get(0).getFlow(0) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(0).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(1) - 2.0) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(0) - 2.0) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(1) - 2.0) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(0) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(0) - 0.5) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(6).getFlow(0) - 1.5) < 1e-6);
		assertTrue(Math.abs(edges.get(6).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(7).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(7).getFlow(1) - 2.0) < 1e-6);
		assertTrue(Math.abs(edges.get(8).getFlow(0) - 0.5) < 1e-6);
		assertTrue(Math.abs(edges.get(8).getFlow(1) - 0.0) < 1e-6);
	}*/
	
	//@Test
	/*
	 * Test for a MCF problem with the mesh topology. Search for a feasible solution
	 */
	/*public void testSimpleMCF_Mesh() {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		Vertex v7 = new Vertex(7);
		Vertex v8 = new Vertex(8);
		Vertex v9 = new Vertex(9);
		Vertex v10 = new Vertex(10);
		Vertex v11 = new Vertex(11);
		Vertex v12 = new Vertex(12);
		Vertex v13 = new Vertex(13);
		Vertex v14 = new Vertex(14);
		Vertex v15 = new Vertex(15);
		Vertex v16 = new Vertex(16); 
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);
		vertices.add(v5);
		vertices.add(v6);
		vertices.add(v7);
		vertices.add(v8);
		vertices.add(v9);
		vertices.add(v10);
		vertices.add(v11);
		vertices.add(v12);
		vertices.add(v13);
		vertices.add(v14);
		vertices.add(v15);
		vertices.add(v16);
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();	//for v1
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();	//for v2
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();	//for v3
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();	// ...
		List<VertexCell> adjList5 = new LinkedList<VertexCell>(); 	// ...
		List<VertexCell> adjList6 = new LinkedList<VertexCell>();
		List<VertexCell> adjList7 = new LinkedList<VertexCell>();
		List<VertexCell> adjList8 = new LinkedList<VertexCell>();
		List<VertexCell> adjList9 = new LinkedList<VertexCell>();
		List<VertexCell> adjList10 = new LinkedList<VertexCell>();
		List<VertexCell> adjList11 = new LinkedList<VertexCell>();
		List<VertexCell> adjList12 = new LinkedList<VertexCell>();
		List<VertexCell> adjList13 = new LinkedList<VertexCell>();
		List<VertexCell> adjList14 = new LinkedList<VertexCell>();
		List<VertexCell> adjList15 = new LinkedList<VertexCell>();
		List<VertexCell> adjList16 = new LinkedList<VertexCell>();
		
		adjList1.add(new VertexCell(v2,1));			//edge 0
		adjList1.add(new VertexCell(v5,1));
		
		adjList2.add(new VertexCell(v1,1));
		adjList2.add(new VertexCell(v3,1));
		adjList2.add(new VertexCell(v6,1));
				
		adjList3.add(new VertexCell(v2,1));			//edge 5
		adjList3.add(new VertexCell(v4,1));
		adjList3.add(new VertexCell(v7,1));
		
		adjList4.add(new VertexCell(v3,1));
		adjList4.add(new VertexCell(v8,1));
		
		adjList5.add(new VertexCell(v1,1));			//edge 10
		adjList5.add(new VertexCell(v6,1));
		adjList5.add(new VertexCell(v9,1));
		
		adjList6.add(new VertexCell(v5,1));
		adjList6.add(new VertexCell(v2,1));
		adjList6.add(new VertexCell(v10,1));		//edge 15
		adjList6.add(new VertexCell(v7,1));
		
		adjList7.add(new VertexCell(v6,1));
		adjList7.add(new VertexCell(v3,1));
		adjList7.add(new VertexCell(v11,1));
		adjList7.add(new VertexCell(v8,1));			//edge 20
		
		adjList8.add(new VertexCell(v7,1));
		adjList8.add(new VertexCell(v4,1));
		adjList8.add(new VertexCell(v12,1));
		
		adjList9.add(new VertexCell(v5,1));
		adjList9.add(new VertexCell(v10,1));		//edge 25
		adjList9.add(new VertexCell(v13,1));
		
		adjList10.add(new VertexCell(v9,1));
		adjList10.add(new VertexCell(v6,1));
		adjList10.add(new VertexCell(v11,1));
		adjList10.add(new VertexCell(v14,1));		//edge 30
		
		adjList11.add(new VertexCell(v10,1));
		adjList11.add(new VertexCell(v7,1));
		adjList11.add(new VertexCell(v12,1));
		adjList11.add(new VertexCell(v15,1));

		adjList12.add(new VertexCell(v8,1));		//edge 35
		adjList12.add(new VertexCell(v11,1));
		adjList12.add(new VertexCell(v16,1));
		
		adjList13.add(new VertexCell(v9,1));
		adjList13.add(new VertexCell(v14,1));
		
		adjList14.add(new VertexCell(v13,1));		//edge 40
		adjList14.add(new VertexCell(v10,1));
		adjList14.add(new VertexCell(v15,1));
		
		adjList15.add(new VertexCell(v14,1));
		adjList15.add(new VertexCell(v11,1));
		adjList15.add(new VertexCell(v16,1));		//edge 45
		
		adjList16.add(new VertexCell(v12,1));
		adjList16.add(new VertexCell(v15,1));
		
		Graph g = new Graph(vertices, adjList1, adjList2, adjList3, adjList4, adjList5, adjList6, adjList7, adjList8,
												adjList9, adjList10, adjList11, adjList12, adjList13, adjList14, adjList15, adjList16);
		assertTrue(g.getNumberOfEdges() == 48);
		
		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(v1);
		sources.add(v5);
		sources.add(v9);
		sources.add(v13);
		sinks.add(v4);
		sinks.add(v8);
		sinks.add(v12);
		sinks.add(v16);
		double[] demands = new double[4];
		demands[0] = 1.0;
		demands[1] = 0.5;
		demands[2] = 0.25;
		demands[3] = 0.125;
		
		//System.out.println("MCF for mesh topology");
		g.MCF(sources, sinks, demands);
		
		List<Edge> edges = g.getEdges();
		
		//Flow 0
		assertTrue(Math.abs(edges.get(0).getFlow(0) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(0) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(6).getFlow(0) - 1.0) < 1e-6);
		//Flow 1
		assertTrue(Math.abs(edges.get(11).getFlow(1) - 0.5) < 1e-6);
		assertTrue(Math.abs(edges.get(15).getFlow(1) - 0.75) < 1e-6);		//There's a loop
		assertTrue(Math.abs(edges.get(29).getFlow(1) - 0.75) < 1e-6);
		//Flow 2
		assertTrue(Math.abs(edges.get(24).getFlow(2) - 0.25) < 1e-6);		//There're also loops
		assertTrue(Math.abs(edges.get(11).getFlow(2) - 0.25) < 1e-6);
		assertTrue(Math.abs(edges.get(16).getFlow(2) - 0.25) < 1e-6);
		assertTrue(Math.abs(edges.get(20).getFlow(2) - 0.25) < 1e-6);
		assertTrue(Math.abs(edges.get(22).getFlow(2) - 0.25) < 1e-6);
		assertTrue(Math.abs(edges.get(8).getFlow(2) - 0.25) < 1e-6);
		assertTrue(Math.abs(edges.get(7).getFlow(2) - 0.25) < 1e-6);
		assertTrue(Math.abs(edges.get(19).getFlow(2) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(32).getFlow(2) - 0.75) < 1e-6);
		assertTrue(Math.abs(edges.get(33).getFlow(2) - 0.25) < 1e-6);
		//FLow 3
		//assertTrue(Math.abs(edges.get().getFlow(3) - 1.0) < 1e-6);
		//assertTrue(Math.abs(edges.get().getFlow(3) - 1.0) < 1e-6);
		//assertTrue(Math.abs(edges.get().getFlow(3) - 1.0) < 1e-6);
	}*/
	
	//@Test
	/*
	 * Test for a MCF problem with the minimization of the flows maximum time as an objective function
	 */
	/*public void testSimpleMCFMinFlowTime1() {
		Vertex s1 = new Vertex(1);
		Vertex s2 = new Vertex(2);
		Vertex t1 = new Vertex(3);
		Vertex t2 = new Vertex(4);
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(s1);
		vertices.add(s2);
		vertices.add(t1);
		vertices.add(t2);
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();	//for s1
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();	//for s2
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();	//for t1
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();	//for t2
		adjList1.add(new VertexCell(s2,1));
		adjList1.add(new VertexCell(t2,1));
		
		adjList2.add(new VertexCell(t2,1));
		adjList2.add(new VertexCell(t1,1));
		
		adjList3.add(new VertexCell(t2,1));
		
		adjList4.add(new VertexCell(t1,1));

		Graph g = new Graph(vertices, adjList1, adjList2, adjList3, adjList4);
		assertTrue(g.getNumberOfEdges() == 6);
		
		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(s1);
		sources.add(s2);
		sinks.add(t1);
		sinks.add(t2);
		double[] demands = new double[2];
		demands[0] = 10.0;		//E.g. [bytes]
		demands[1] = 20.0;		//E.g. [bytes]
		
		//System.out.println("MCF for the 1st simple topology (Min Flow Time)");
		g.MCFMinFlowTimeObj(sources, sinks, demands);
		List<Edge> edges = g.getEdges();
		//for(Edge e: edges)
		//	System.out.println(e.toString());
		
		assertTrue(Math.abs(edges.get(0).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(0).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(0) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(1) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(1) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(1) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(0) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(1) - 0.0) < 1e-6);
	}*/
	
	//@Test
	/*
	 * Test for a MCF problem with the minimization of the flows maximum time as an objective function
	 */
	/*public void testSimpleMCFMinFlowTime2() {
		Vertex s1 = new Vertex(1);
		Vertex s2 = new Vertex(2);
		Vertex t1 = new Vertex(3);
		Vertex t2 = new Vertex(4);
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(s1);
		vertices.add(s2);
		vertices.add(t1);
		vertices.add(t2);
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();	//for s1
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();	//for s2
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();	//for t1
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();	//for t2
		adjList1.add(new VertexCell(s2,1));
		adjList1.add(new VertexCell(t2,1));

		adjList2.add(new VertexCell(t2,1));
		adjList2.add(new VertexCell(t1,1));

		adjList3.add(new VertexCell(t2,1));

		adjList4.add(new VertexCell(t1,1));

		Graph g = new Graph(vertices, adjList1, adjList2, adjList3, adjList4);
		assertTrue(g.getNumberOfEdges() == 6);

		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(s1);
		sources.add(s2);
		sinks.add(t1);
		sinks.add(t2);
		double[] demands = new double[2];
		demands[0] = 20.0;		//E.g. [bytes]
		demands[1] = 10.0;		//E.g. [bytes]

		//System.out.println("MCF for the 1st simple topology (Min Flow Time). Test 2");
		g.MCFMinFlowTimeObj(sources, sinks, demands);
		List<Edge> edges = g.getEdges();

		assertTrue(Math.abs(edges.get(0).getFlow(0) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(0).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(0) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(1) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(0) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(0) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(1) - 0.0) < 1e-6);
	}
	
	//@Test
	public void testSimpleMCFMinFlowTime3() {
		Vertex s1 = new Vertex(1);
		Vertex s2 = new Vertex(2);
		Vertex t1 = new Vertex(3);
		Vertex t2 = new Vertex(4);
		Vertex v  = new Vertex(5);
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(s1);
		vertices.add(s2);
		vertices.add(t1);
		vertices.add(t2);
		vertices.add(v);
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();	//for s1
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();	//for s2
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();	//for t1
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();	//for t2
		List<VertexCell> adjList5 = new LinkedList<VertexCell>(); 	//for v
		adjList1.add(new VertexCell(s2,1));
		adjList1.add(new VertexCell(t2,1));
		adjList1.add(new VertexCell(v, 1));
		
		adjList2.add(new VertexCell(v,1));
		adjList2.add(new VertexCell(t1,1));
				
		adjList4.add(new VertexCell(t1,1));
		
		adjList5.add(new VertexCell(t1,1));
		adjList5.add(new VertexCell(s1,1));
		adjList5.add(new VertexCell(t2,1));

		Graph g = new Graph(vertices, adjList1, adjList2, adjList3, adjList4, adjList5);
		assertTrue(g.getNumberOfEdges() == 9);
		
		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(s1);
		sources.add(s2);
		sinks.add(t1);
		sinks.add(t2);
		double[] demands = new double[2];
		demands[0] = 30.0;		//E.g. [bytes]
		demands[1] = 20.0;		//E.g. [bytes]
		
		//System.out.println("MCF max flow time minimization for the 2nd simple topology");
		g.MCFMinFlowTimeObj(sources, sinks, demands);
		List<Edge> edges = g.getEdges();

		//for(Edge e: edges)
		//	System.out.println(e.toString());
		
		assertTrue(Math.abs(edges.get(0).getFlow(0) - 0.5) < 1e-6);
		assertTrue(Math.abs(edges.get(0).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(0) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(1) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(0) - 0.5) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(6).getFlow(0) - 1.0) < 1e-6);
		assertTrue(Math.abs(edges.get(6).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(7).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(7).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(8).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(8).getFlow(1) - 1.0) < 1e-6);
	}
	
	//@Test
	public void testMesh2D() {
		Mesh2D mesh = new Mesh2D(4,4);
		//System.out.println(mesh.toString());		
	}
	
	//@Test
	public void testMCFMinFlowMesh2D()
	{
		Mesh2D mesh = new Mesh2D(4, 4);
		assertTrue(mesh.getNumberOfEdges() == 48);
		
		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(new Vertex(1));
		sources.add(new Vertex(5));
		sources.add(new Vertex(9));
		sources.add(new Vertex(13));
		sinks.add(new Vertex(4));
		sinks.add(new Vertex(8));
		sinks.add(new Vertex(12));
		sinks.add(new Vertex(16));
		double[] demands = new double[4];
		demands[0] = 30.0;		//E.g. [bytes]
		demands[1] = 20.0;		//E.g. [bytes]
		demands[2] = 20.0;
		demands[3] = 30.0;
		
		//System.out.println("MCF max flow time minimization for the Mesh topology");
		mesh.MCFMinFlowTimeObj(sources, sinks, demands);;
		List<Edge> edges = mesh.getEdges();

		//for(Edge e: edges)
		//	System.out.println(e.toString());
	}*/
	
/*
	public void testMCFMinFlowMesh2DLarge()
	{
		int meshRadix = 20;
		Mesh2D mesh = new Mesh2D(meshRadix, meshRadix);
		//assertTrue(mesh.getNumberOfEdges() == 48);
		
		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		final int numberOfCommodities = 10;
		double[] demands = new double[numberOfCommodities];
		for(int i = 0; i < numberOfCommodities; ++i)
		{
			sources.add(new Vertex(i*meshRadix+1));
			sinks.add(new Vertex((i+1)*meshRadix));
			demands[i] = 10*(i+1);
		}
		
		System.out.println("MCF max flow time minimization for the Mesh topology");
		mesh.MCFMinFlowTimeObj(sources, sinks, demands);;
		List<Edge> edges = mesh.getEdges();

		for(Edge e: edges)
			System.out.println(e.toString());
	}
	*/
	//@Test
	/*public void testMCFMinFlowTimeFatTreeSmall()
	{
		Vertex s1 = new Vertex(1);
		Vertex s2 = new Vertex(2);
		Vertex t1 = new Vertex(3);
		Vertex t2 = new Vertex(4);
		
		Vertex ve1 = new Vertex(5);
		Vertex ve2 = new Vertex(6);
		Vertex va1 = new Vertex(7);
		Vertex va2 = new Vertex(8);
		
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(s1);
		vertices.add(s2);
		vertices.add(t1);
		vertices.add(t2);
		vertices.add(ve1);
		vertices.add(ve2);
		vertices.add(va1);
		vertices.add(va2);
		
		List<VertexCell> adjListS1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe1= new LinkedList<VertexCell>();
		List<VertexCell> adjListVe2= new LinkedList<VertexCell>();
		List<VertexCell> adjListVa1= new LinkedList<VertexCell>();
		List<VertexCell> adjListVa2= new LinkedList<VertexCell>();
		
		double CAP = 5;
		adjListS1.add(new VertexCell(ve1, CAP));	//edge #0
		adjListS2.add(new VertexCell(ve1, CAP));
		adjListT1.add(new VertexCell(ve2, CAP));
		adjListT2.add(new VertexCell(ve2, CAP));
		
		adjListVe1.add(new VertexCell(s1, CAP));	//edge #4
		adjListVe1.add(new VertexCell(s2, CAP));
		adjListVe1.add(new VertexCell(va1, CAP));
		adjListVe1.add(new VertexCell(va2, CAP));

		adjListVe2.add(new VertexCell(t1, CAP));  	//edge #8
		adjListVe2.add(new VertexCell(t2, CAP));
		adjListVe2.add(new VertexCell(va1, CAP));
		adjListVe2.add(new VertexCell(va2, CAP));
		
		adjListVa1.add(new VertexCell(ve1, CAP));	//edge #12
		adjListVa1.add(new VertexCell(ve2, CAP));
		
		adjListVa2.add(new VertexCell(ve1, CAP));
		adjListVa2.add(new VertexCell(ve2, CAP));
		
		Graph g = new Graph(vertices, adjListS1, adjListS2, adjListT1, adjListT2, adjListVe1, adjListVe2, adjListVa1, adjListVa2);
		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(s1);
		sources.add(s2);
		sinks.add(t1);
		sinks.add(t2);
		double[] demands = new double[2];
		demands[0] = 100;
		demands[1] = 200;
		//System.out.println("\n\n MCF for small fat tree");
		g.MCFMinFlowTimeObj(sources, sinks, demands);

		List<Edge> edges = g.getEdges();

		//for(Edge e: edges)
		//	System.out.println(e.toString());

		assertTrue(Math.abs(edges.get(0).getFlow(0) - 2.5) < 1e-6);
		assertTrue(Math.abs(edges.get(0).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(1) - 5.0) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(6).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(6).getFlow(1) - 2.5) < 1e-6);
		assertTrue(Math.abs(edges.get(7).getFlow(0) - 2.5) < 1e-6);
		assertTrue(Math.abs(edges.get(7).getFlow(1) - 2.5) < 1e-6);
		assertTrue(Math.abs(edges.get(8).getFlow(0) - 2.5) < 1e-6);
		assertTrue(Math.abs(edges.get(8).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(9).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(9).getFlow(1) - 5.0) < 1e-6);
		assertTrue(Math.abs(edges.get(10).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(10).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(11).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(11).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(12).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(12).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(13).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(13).getFlow(1) - 2.5) < 1e-6);
		assertTrue(Math.abs(edges.get(14).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(14).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(15).getFlow(0) - 2.5) < 1e-6);
		assertTrue(Math.abs(edges.get(15).getFlow(1) - 2.5) < 1e-6);
		
		int numberOfFlows = 2;
		g.constructFlowTables(numberOfFlows);
		double[][][] flowTables = g.getFlowTables();
		//for(int i = 0; i < numberOfFlows; ++i)
		//{
		//	System.out.println("Flow " + i);
		//	for(int j = 0; j < vertices.size(); ++j)
		//	{
		//		for(int k = 0; k < vertices.size(); ++k)
		//			System.out.print(" " + flowTables[i][j][k]);
		//		System.out.println(" ");
		//	}
		//}
	}
	
	//@Test
	public void testMCFMinFlowTimeFatNonDirectTreeSmall()
	{
		Vertex s1 = new Vertex(1);
		Vertex s2 = new Vertex(2);
		Vertex t1 = new Vertex(3);
		Vertex t2 = new Vertex(4);
		
		Vertex ve1 = new Vertex(5);
		Vertex ve2 = new Vertex(6);
		Vertex va1 = new Vertex(7);
		Vertex va2 = new Vertex(8);
		
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(s1);
		vertices.add(s2);
		vertices.add(t1);
		vertices.add(t2);
		vertices.add(ve1);
		vertices.add(ve2);
		vertices.add(va1);
		vertices.add(va2);
		
		List<VertexCell> adjListS1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe1= new LinkedList<VertexCell>();
		List<VertexCell> adjListVe2= new LinkedList<VertexCell>();
		List<VertexCell> adjListVa1= new LinkedList<VertexCell>();
		List<VertexCell> adjListVa2= new LinkedList<VertexCell>();
		
		double CAP = 5;
		adjListS1.add(new VertexCell(ve1, CAP));	//edge #0
		adjListS2.add(new VertexCell(ve1, CAP));
		adjListT1.add(new VertexCell(ve2, CAP));
		adjListT2.add(new VertexCell(ve2, CAP));
		
		adjListVe1.add(new VertexCell(s1, CAP));	//edge #4
		adjListVe1.add(new VertexCell(s2, CAP));
		adjListVe1.add(new VertexCell(va1, CAP));
		adjListVe1.add(new VertexCell(va2, CAP));

		adjListVe2.add(new VertexCell(t1, CAP));  	//edge #8
		adjListVe2.add(new VertexCell(t2, CAP));
		adjListVe2.add(new VertexCell(va1, CAP));
		adjListVe2.add(new VertexCell(va2, CAP));
		
		adjListVa1.add(new VertexCell(ve1, CAP));	//edge #12
		adjListVa1.add(new VertexCell(ve2, CAP));
		
		adjListVa2.add(new VertexCell(ve1, CAP));
		adjListVa2.add(new VertexCell(ve2, CAP));
		
		Graph g = new Graph(vertices, adjListS1, adjListS2, adjListT1, adjListT2, adjListVe1, adjListVe2, adjListVa1, adjListVa2);
		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(s1);
		sources.add(s2);
		sinks.add(t1);
		sinks.add(t2);
		double[] demands = new double[2];
		demands[0] = 100;
		demands[1] = 200;
		//System.out.println("\n\n MCF for small non-directed fat tree");
		g.MCFMinFlowTimeObjNonDirected(sources, sinks, demands);

		List<Edge> edges = g.getEdges();

		//for(Edge e: edges)
		//	System.out.println(e.toString());

		assertTrue(Math.abs(edges.get(0).getFlow(0) - 2.5) < 1e-6);
		assertTrue(Math.abs(edges.get(0).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(1) - 5.0) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(6).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(6).getFlow(1) - 5.0) < 1e-6);
		assertTrue(Math.abs(edges.get(7).getFlow(0) - 2.5) < 1e-6);
		assertTrue(Math.abs(edges.get(7).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(8).getFlow(0) - 2.5) < 1e-6);
		assertTrue(Math.abs(edges.get(8).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(9).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(9).getFlow(1) - 5.0) < 1e-6);
		assertTrue(Math.abs(edges.get(10).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(10).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(11).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(11).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(12).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(12).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(13).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(13).getFlow(1) - 5.0) < 1e-6);
		assertTrue(Math.abs(edges.get(14).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(14).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(15).getFlow(0) - 2.5) < 1e-6);
		assertTrue(Math.abs(edges.get(15).getFlow(1) - 0.0) < 1e-6);
		
		int numberOfFlows = 2;
		g.constructFlowTables(numberOfFlows);
		double[][][] flowTables = g.getFlowTables();
		//for(int i = 0; i < numberOfFlows; ++i)
		//{
			//System.out.println("Flow " + i);
		//	for(int j = 0; j < vertices.size(); ++j)
		//	{
		//		for(int k = 0; k < vertices.size(); ++k)
		//			System.out.print(" " + flowTables[i][j][k]);
		//		System.out.println(" ");
		//	}
		//}
	}
	
	//@Test
	public void testMCFMinFlowTimeFatNonDirectTreeSmallAllToAll()
	{
		Vertex s1 = new Vertex(1);
		Vertex s2 = new Vertex(2);
		Vertex t1 = new Vertex(3);
		Vertex t2 = new Vertex(4);
		
		Vertex ve1 = new Vertex(5);
		Vertex ve2 = new Vertex(6);
		Vertex va1 = new Vertex(7);
		Vertex va2 = new Vertex(8);
		
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(s1);
		vertices.add(s2);
		vertices.add(t1);
		vertices.add(t2);
		vertices.add(ve1);
		vertices.add(ve2);
		vertices.add(va1);
		vertices.add(va2);
		
		List<VertexCell> adjListS1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe1= new LinkedList<VertexCell>();
		List<VertexCell> adjListVe2= new LinkedList<VertexCell>();
		List<VertexCell> adjListVa1= new LinkedList<VertexCell>();
		List<VertexCell> adjListVa2= new LinkedList<VertexCell>();
		
		double CAP = 5;
		adjListS1.add(new VertexCell(ve1, CAP));	//edge #0
		adjListS2.add(new VertexCell(ve1, CAP));
		adjListT1.add(new VertexCell(ve2, CAP));
		adjListT2.add(new VertexCell(ve2, CAP));
		
		adjListVe1.add(new VertexCell(s1, CAP));	//edge #4
		adjListVe1.add(new VertexCell(s2, CAP));
		adjListVe1.add(new VertexCell(va1, CAP));
		adjListVe1.add(new VertexCell(va2, CAP));

		adjListVe2.add(new VertexCell(t1, CAP));  	//edge #8
		adjListVe2.add(new VertexCell(t2, CAP));
		adjListVe2.add(new VertexCell(va1, CAP));
		adjListVe2.add(new VertexCell(va2, CAP));
		
		adjListVa1.add(new VertexCell(ve1, CAP));	//edge #12
		adjListVa1.add(new VertexCell(ve2, CAP));
		
		adjListVa2.add(new VertexCell(ve1, CAP));
		adjListVa2.add(new VertexCell(ve2, CAP));
		
		Graph g = new Graph(vertices, adjListS1, adjListS2, adjListT1, adjListT2, adjListVe1, adjListVe2, adjListVa1, adjListVa2);
		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(s1);
		sources.add(s2);
		sources.add(t1);
		sources.add(t2);
		sinks.add(t1);
		sinks.add(t2);
		sinks.add(s1);
		sinks.add(s2);
		double[] demands = new double[4];
		demands[0] = 100;
		demands[1] = 200;
		demands[2] = 200;
		demands[3] = 100;
		//System.out.println("\n\n MCF for small non-directed fat tree ALL-2-ALL");
		g.MCFMinFlowTimeObjNonDirected(sources, sinks, demands);

		List<Edge> edges = g.getEdges();

		//for(Edge e: edges)
		//	System.out.println(e.toString());

		assertTrue(Math.abs(edges.get(0).getFlow(0) - 1.666) < 1e-3);
		assertTrue(Math.abs(edges.get(0).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(0).getFlow(2) - 0.0) < 1e-1);
		assertTrue(Math.abs(edges.get(0).getFlow(3) - 0.0) < 1e-6);
		
		assertTrue(Math.abs(edges.get(1).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(1) - 3.333) < 1e-3);
		assertTrue(Math.abs(edges.get(1).getFlow(2) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(3) - 0.0) < 1e-1);
		
		assertTrue(Math.abs(edges.get(2).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(2) - 3.333) < 1e-3);
		assertTrue(Math.abs(edges.get(2).getFlow(3) - 0.0) < 1e-6);
		
		assertTrue(Math.abs(edges.get(3).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(2) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(3) - 1.666) < 1e-3);
		
		assertTrue(Math.abs(edges.get(4).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(2) - 3.333) < 1e-3);
		assertTrue(Math.abs(edges.get(4).getFlow(3) - 0.0) < 1e-6);
		
		assertTrue(Math.abs(edges.get(5).getFlow(0) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(1) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(2) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(3) - 1.666) < 1e-3);
		
		assertTrue(Math.abs(edges.get(6).getFlow(0) - 1.666) < 1e-3);
		assertTrue(Math.abs(edges.get(6).getFlow(1) - 1.666) < 1e-3);
		assertTrue(Math.abs(edges.get(6).getFlow(2) - 0.0) < 1e-6);
		assertTrue(Math.abs(edges.get(6).getFlow(3) - 0.0) < 1e-6);
						
	}*/
	
	//@Test
	/*
	 * The test for concurrent MCF with full 16-leaves fat tree topology
	 */
	/*public void testMCFMinFlowTimeFatTree() {
		Vertex s1 = new Vertex(1);
		Vertex s2 = new Vertex(2);
		Vertex s3 = new Vertex(3);
		Vertex s4 = new Vertex(4);
		Vertex s5 = new Vertex(5);
		Vertex s6 = new Vertex(6);
		Vertex s7 = new Vertex(7);
		Vertex s8 = new Vertex(8);
		
		Vertex t1 = new Vertex(9);
		Vertex t2 = new Vertex(10);
		Vertex t3 = new Vertex(11);
		Vertex t4 = new Vertex(12);
		Vertex t5 = new Vertex(13);
		Vertex t6 = new Vertex(14);
		Vertex t7 = new Vertex(15);
		Vertex t8 = new Vertex(16);
		
		//pod1
		Vertex ve11 = new Vertex(17);
		Vertex ve12 = new Vertex(18);
		Vertex va11 = new Vertex(19);
		Vertex va12 = new Vertex(20);

		//pod2
		Vertex ve21 = new Vertex(21);
		Vertex ve22 = new Vertex(22);
		Vertex va21 = new Vertex(23);
		Vertex va22 = new Vertex(24);
		
		//pod3
		Vertex ve31 = new Vertex(25);
		Vertex ve32 = new Vertex(26);
		Vertex va31 = new Vertex(27);
		Vertex va32 = new Vertex(28);
		
		//pod4
		Vertex ve41 = new Vertex(29);
		Vertex ve42 = new Vertex(30);
		Vertex va41 = new Vertex(31);
		Vertex va42 = new Vertex(32);
		
		//core
		Vertex vc1 = new Vertex(33);
		Vertex vc2 = new Vertex(34);
		Vertex vc3 = new Vertex(35);
		Vertex vc4 = new Vertex(36);
		
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(s1);
		vertices.add(s2);
		vertices.add(s3);
		vertices.add(s4);
		vertices.add(s5);
		vertices.add(s6);
		vertices.add(s7);
		vertices.add(s8);
		
		vertices.add(t1);
		vertices.add(t2);
		vertices.add(t3);
		vertices.add(t4);
		vertices.add(t5);
		vertices.add(t6);
		vertices.add(t7);
		vertices.add(t8);
		
		vertices.add(ve11);
		vertices.add(ve12);
		vertices.add(va11);
		vertices.add(va12);

		vertices.add(ve21);
		vertices.add(ve22);
		vertices.add(va21);
		vertices.add(va22);

		vertices.add(ve31);
		vertices.add(ve32);
		vertices.add(va31);
		vertices.add(va32);
		
		vertices.add(ve41);
		vertices.add(ve42);
		vertices.add(va41);
		vertices.add(va42);
		
		vertices.add(vc1);
		vertices.add(vc2);
		vertices.add(vc3);
		vertices.add(vc4);
		
		List<VertexCell> adjListS1 = new LinkedList<VertexCell>();	//for s1
		List<VertexCell> adjListS2 = new LinkedList<VertexCell>();	//for s2
		List<VertexCell> adjListS3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS4 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS5 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS6 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS7 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS8 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListT1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT4 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT5 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT6 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT7 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT8 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe11 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe12 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa11 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa12 = new LinkedList<VertexCell>(); 

		List<VertexCell> adjListVe21 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe22 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa21 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa22 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe31 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe32 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa31 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa32 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe41 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe42 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa41 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa42 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVc1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc4 = new LinkedList<VertexCell>();
		
		double CAP = 5;
		adjListS1.add(new VertexCell(ve11, CAP));
		adjListS2.add(new VertexCell(ve11, CAP));
		adjListS3.add(new VertexCell(ve21, CAP));
		adjListS4.add(new VertexCell(ve31, CAP));
		adjListS5.add(new VertexCell(ve41, CAP));
		adjListS6.add(new VertexCell(ve32, CAP));
		adjListS7.add(new VertexCell(ve22, CAP));
		adjListS8.add(new VertexCell(ve12, CAP));
		
		adjListT1.add(new VertexCell(ve12, CAP));
		adjListT2.add(new VertexCell(ve42, CAP));
		adjListT3.add(new VertexCell(ve31, CAP));
		adjListT4.add(new VertexCell(ve21, CAP));
		adjListT5.add(new VertexCell(ve22, CAP));
		adjListT6.add(new VertexCell(ve41, CAP));
		adjListT7.add(new VertexCell(ve32, CAP));
		adjListT8.add(new VertexCell(ve42, CAP));
		
		//POD 1
		adjListVe11.add(new VertexCell(s1, CAP));
		adjListVe11.add(new VertexCell(s2, CAP));
		adjListVe11.add(new VertexCell(va11, CAP));
		adjListVe11.add(new VertexCell(va12, CAP));
		
		adjListVe12.add(new VertexCell(t1, CAP));
		adjListVe12.add(new VertexCell(s8, CAP));
		adjListVe12.add(new VertexCell(va11, CAP));
		adjListVe12.add(new VertexCell(va12, CAP));

		adjListVa11.add(new VertexCell(vc1, CAP));
		adjListVa11.add(new VertexCell(vc2, CAP));
		adjListVa11.add(new VertexCell(ve11, CAP));
		adjListVa11.add(new VertexCell(ve12, CAP));

		adjListVa12.add(new VertexCell(vc3, CAP));
		adjListVa12.add(new VertexCell(vc4, CAP));
		adjListVa12.add(new VertexCell(ve11, CAP));
		adjListVa12.add(new VertexCell(ve12, CAP));

		//POD 2
		adjListVe21.add(new VertexCell(s3, CAP));
		adjListVe21.add(new VertexCell(t4, CAP));
		adjListVe21.add(new VertexCell(va21, CAP));
		adjListVe21.add(new VertexCell(va22, CAP));
		
		adjListVe22.add(new VertexCell(s7, CAP));
		adjListVe22.add(new VertexCell(t5, CAP));
		adjListVe22.add(new VertexCell(va21, CAP));
		adjListVe22.add(new VertexCell(va22, CAP));

		adjListVa21.add(new VertexCell(vc1, CAP));
		adjListVa21.add(new VertexCell(vc2, CAP));
		adjListVa21.add(new VertexCell(ve21, CAP));
		adjListVa21.add(new VertexCell(ve22, CAP));

		adjListVa22.add(new VertexCell(vc3, CAP));
		adjListVa22.add(new VertexCell(vc4, CAP));
		adjListVa22.add(new VertexCell(ve21, CAP));
		adjListVa22.add(new VertexCell(ve22, CAP));
		
		//POD 3
		adjListVe31.add(new VertexCell(s4, CAP));
		adjListVe31.add(new VertexCell(t3, CAP));
		adjListVe31.add(new VertexCell(va31, CAP));
		adjListVe31.add(new VertexCell(va32, CAP));
		
		adjListVe32.add(new VertexCell(t7, CAP));
		adjListVe32.add(new VertexCell(s6, CAP));
		adjListVe32.add(new VertexCell(va31, CAP));
		adjListVe32.add(new VertexCell(va32, CAP));

		adjListVa31.add(new VertexCell(vc1, CAP));
		adjListVa31.add(new VertexCell(vc2, CAP));
		adjListVa31.add(new VertexCell(ve31, CAP));
		adjListVa31.add(new VertexCell(ve32, CAP));

		adjListVa32.add(new VertexCell(vc3, CAP));
		adjListVa32.add(new VertexCell(vc4, CAP));
		adjListVa32.add(new VertexCell(ve31, CAP));
		adjListVa32.add(new VertexCell(ve32, CAP));

		//POD 4
		adjListVe41.add(new VertexCell(t6, CAP));
		adjListVe41.add(new VertexCell(s5, CAP));
		adjListVe41.add(new VertexCell(va41, CAP));
		adjListVe41.add(new VertexCell(va42, CAP));
		
		adjListVe42.add(new VertexCell(t8, CAP));
		adjListVe42.add(new VertexCell(t2, CAP));
		adjListVe42.add(new VertexCell(va41, CAP));
		adjListVe42.add(new VertexCell(va42, CAP));

		adjListVa41.add(new VertexCell(vc1, CAP));
		adjListVa41.add(new VertexCell(vc2, CAP));
		adjListVa41.add(new VertexCell(ve41, CAP));
		adjListVa41.add(new VertexCell(ve42, CAP));

		adjListVa42.add(new VertexCell(vc3, CAP));
		adjListVa42.add(new VertexCell(vc4, CAP));
		adjListVa42.add(new VertexCell(ve41, CAP));
		adjListVa42.add(new VertexCell(ve42, CAP));
		
		//Cores
		adjListVc1.add(new VertexCell(va11, CAP));
		adjListVc1.add(new VertexCell(va21, CAP));
		adjListVc1.add(new VertexCell(va31, CAP));
		adjListVc1.add(new VertexCell(va41, CAP));
		
		adjListVc2.add(new VertexCell(va11, CAP));
		adjListVc2.add(new VertexCell(va21, CAP));
		adjListVc2.add(new VertexCell(va31, CAP));
		adjListVc2.add(new VertexCell(va41, CAP));

		adjListVc3.add(new VertexCell(va12, CAP));
		adjListVc3.add(new VertexCell(va22, CAP));
		adjListVc3.add(new VertexCell(va32, CAP));
		adjListVc3.add(new VertexCell(va42, CAP));

		adjListVc4.add(new VertexCell(va12, CAP));
		adjListVc4.add(new VertexCell(va22, CAP));
		adjListVc4.add(new VertexCell(va32, CAP));
		adjListVc4.add(new VertexCell(va42, CAP));

		Graph g = new Graph(vertices, adjListS1, adjListS2, adjListS3, adjListS4, adjListS5, adjListS6, adjListS7, adjListS8,
				                      adjListT1, adjListT2, adjListT3, adjListT4, adjListT5, adjListT6, adjListT7, adjListT8,
				                      adjListVe11, adjListVe12, adjListVa11, adjListVa12,
				                      adjListVe21, adjListVe22, adjListVa21, adjListVa22,
				                      adjListVe31, adjListVe32, adjListVa31, adjListVa32,
				                      adjListVe41, adjListVe42, adjListVa41, adjListVa42,
				                      adjListVc1, adjListVc2, adjListVc3, adjListVc4);
		assertTrue(g.getNumberOfEdges() == 16*3 * 2);

		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(s1);
		sources.add(s2);
		sources.add(s3);
		sources.add(s4);
		sources.add(s5);
		sources.add(s6);
		sources.add(s7);
		sources.add(s8);
		
		sinks.add(t1);
		sinks.add(t2);
		sinks.add(t3);
		sinks.add(t4);
		sinks.add(t5);
		sinks.add(t6);
		sinks.add(t7);
		sinks.add(t8);
		double[] demands = new double[8];
		demands[0] = 1 * 10*8*10;
		demands[1] = 2 * 10*8*10;
		demands[2] = 3 * 10*8*10;
		demands[3] = 4 * 10*8*10;
		demands[4] = 5 * 10*8*10;
		demands[5] = 6 * 10*8*10;
		demands[6] = 7 * 10*8*10;
		demands[7] = 8 * 10*8*10;
		
		//System.out.println("MCF max flow time minimization for the Fat Tree (k=4)");
		g.MCFMinFlowTimeObj(sources, sinks, demands);
		List<Edge> edges = g.getEdges();

		//for(Edge e: edges)
		//	System.out.println(e.toString());
		
		double minFlow = 0.625;
		assertTrue(Math.abs(edges.get(0).getFlow(0) - minFlow) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(1) - minFlow*2) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(2) - minFlow*3) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(3) - minFlow*4) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(4) - minFlow*5) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(5) - minFlow*6) < 1e-6);
		assertTrue(Math.abs(edges.get(6).getFlow(6) - minFlow*7) < 1e-6);
		assertTrue(Math.abs(edges.get(7).getFlow(7) - minFlow*8) < 1e-6);
	}*/
	
	
	
	/*
	 * The test for concurrent MCF with full 16-leaves fat tree topology
	 */
	/*public void testMCFMinFlowTimeFatTree11() {
		Vertex s1 = new Vertex(1);
		Vertex s2 = new Vertex(2);
		Vertex s3 = new Vertex(3);
		Vertex s4 = new Vertex(4);
		Vertex s5 = new Vertex(5);
		Vertex s6 = new Vertex(6);
		Vertex s7 = new Vertex(7);
		Vertex s8 = new Vertex(8);
		
		Vertex t1 = new Vertex(9);
		Vertex t2 = new Vertex(10);
		Vertex t3 = new Vertex(11);
		Vertex t4 = new Vertex(12);
		Vertex t5 = new Vertex(13);
		Vertex t6 = new Vertex(14);
		Vertex t7 = new Vertex(15);
		Vertex t8 = new Vertex(16);
		
		//pod1
		Vertex ve11 = new Vertex(17);
		Vertex ve12 = new Vertex(18);
		Vertex va11 = new Vertex(19);
		Vertex va12 = new Vertex(20);

		//pod2
		Vertex ve21 = new Vertex(21);
		Vertex ve22 = new Vertex(22);
		Vertex va21 = new Vertex(23);
		Vertex va22 = new Vertex(24);
		
		//pod3
		Vertex ve31 = new Vertex(25);
		Vertex ve32 = new Vertex(26);
		Vertex va31 = new Vertex(27);
		Vertex va32 = new Vertex(28);
		
		//pod4
		Vertex ve41 = new Vertex(29);
		Vertex ve42 = new Vertex(30);
		Vertex va41 = new Vertex(31);
		Vertex va42 = new Vertex(32);
		
		//core
		Vertex vc1 = new Vertex(33);
		Vertex vc2 = new Vertex(34);
		Vertex vc3 = new Vertex(35);
		Vertex vc4 = new Vertex(36);
		
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(s1);
		vertices.add(s2);
		vertices.add(s3);
		vertices.add(s4);
		vertices.add(s5);
		vertices.add(s6);
		vertices.add(s7);
		vertices.add(s8);
		
		vertices.add(t1);
		vertices.add(t2);
		vertices.add(t3);
		vertices.add(t4);
		vertices.add(t5);
		vertices.add(t6);
		vertices.add(t7);
		vertices.add(t8);
		
		vertices.add(ve11);
		vertices.add(ve12);
		vertices.add(va11);
		vertices.add(va12);

		vertices.add(ve21);
		vertices.add(ve22);
		vertices.add(va21);
		vertices.add(va22);

		vertices.add(ve31);
		vertices.add(ve32);
		vertices.add(va31);
		vertices.add(va32);
		
		vertices.add(ve41);
		vertices.add(ve42);
		vertices.add(va41);
		vertices.add(va42);
		
		vertices.add(vc1);
		vertices.add(vc2);
		vertices.add(vc3);
		vertices.add(vc4);
		
		List<VertexCell> adjListS1 = new LinkedList<VertexCell>();	//for s1
		List<VertexCell> adjListS2 = new LinkedList<VertexCell>();	//for s2
		List<VertexCell> adjListS3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS4 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS5 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS6 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS7 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS8 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListT1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT4 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT5 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT6 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT7 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT8 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe11 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe12 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa11 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa12 = new LinkedList<VertexCell>(); 

		List<VertexCell> adjListVe21 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe22 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa21 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa22 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe31 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe32 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa31 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa32 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe41 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe42 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa41 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa42 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVc1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc4 = new LinkedList<VertexCell>();
		
		double CAP = 2;
		adjListS1.add(new VertexCell(ve11, CAP));
		adjListS2.add(new VertexCell(ve11, CAP));
		adjListS3.add(new VertexCell(ve12, CAP));
		adjListS4.add(new VertexCell(ve12, CAP));
		adjListS5.add(new VertexCell(ve21, CAP));
		adjListS6.add(new VertexCell(ve21, CAP));
		adjListS7.add(new VertexCell(ve22, CAP));
		adjListS8.add(new VertexCell(ve22, CAP));
		
		adjListT1.add(new VertexCell(ve31, CAP));
		adjListT2.add(new VertexCell(ve31, CAP));
		adjListT3.add(new VertexCell(ve32, CAP));
		adjListT4.add(new VertexCell(ve32, CAP));
		adjListT5.add(new VertexCell(ve41, CAP));
		adjListT6.add(new VertexCell(ve41, CAP));
		adjListT7.add(new VertexCell(ve42, CAP));
		adjListT8.add(new VertexCell(ve42, CAP));
		
		//POD 1
		adjListVe11.add(new VertexCell(s1, CAP));
		adjListVe11.add(new VertexCell(s2, CAP));
		adjListVe11.add(new VertexCell(va11, CAP));
		adjListVe11.add(new VertexCell(va12, CAP));
		
		adjListVe12.add(new VertexCell(s3, CAP));
		adjListVe12.add(new VertexCell(s4, CAP));
		adjListVe12.add(new VertexCell(va11, CAP));
		adjListVe12.add(new VertexCell(va12, CAP));

		adjListVa11.add(new VertexCell(vc1, CAP));
		adjListVa11.add(new VertexCell(vc2, CAP));
		adjListVa11.add(new VertexCell(ve11, CAP));
		adjListVa11.add(new VertexCell(ve12, CAP));

		adjListVa12.add(new VertexCell(vc3, CAP));
		adjListVa12.add(new VertexCell(vc4, CAP));
		adjListVa12.add(new VertexCell(ve11, CAP));
		adjListVa12.add(new VertexCell(ve12, CAP));

		//POD 2
		adjListVe21.add(new VertexCell(s5, CAP));
		adjListVe21.add(new VertexCell(s6, CAP));
		adjListVe21.add(new VertexCell(va21, CAP));
		adjListVe21.add(new VertexCell(va22, CAP));
		
		adjListVe22.add(new VertexCell(s7, CAP));
		adjListVe22.add(new VertexCell(s8, CAP));
		adjListVe22.add(new VertexCell(va21, CAP));
		adjListVe22.add(new VertexCell(va22, CAP));

		adjListVa21.add(new VertexCell(vc1, CAP));
		adjListVa21.add(new VertexCell(vc2, CAP));
		adjListVa21.add(new VertexCell(ve21, CAP));
		adjListVa21.add(new VertexCell(ve22, CAP));

		adjListVa22.add(new VertexCell(vc3, CAP));
		adjListVa22.add(new VertexCell(vc4, CAP));
		adjListVa22.add(new VertexCell(ve21, CAP));
		adjListVa22.add(new VertexCell(ve22, CAP));
		
		//POD 3
		adjListVe31.add(new VertexCell(t1, CAP));
		adjListVe31.add(new VertexCell(t2, CAP));
		adjListVe31.add(new VertexCell(va31, CAP));
		adjListVe31.add(new VertexCell(va32, CAP));
		
		adjListVe32.add(new VertexCell(t3, CAP));
		adjListVe32.add(new VertexCell(t4, CAP));
		adjListVe32.add(new VertexCell(va31, CAP));
		adjListVe32.add(new VertexCell(va32, CAP));

		adjListVa31.add(new VertexCell(vc1, CAP));
		adjListVa31.add(new VertexCell(vc2, CAP));
		adjListVa31.add(new VertexCell(ve31, CAP));
		adjListVa31.add(new VertexCell(ve32, CAP));

		adjListVa32.add(new VertexCell(vc3, CAP));
		adjListVa32.add(new VertexCell(vc4, CAP));
		adjListVa32.add(new VertexCell(ve31, CAP));
		adjListVa32.add(new VertexCell(ve32, CAP));

		//POD 4
		adjListVe41.add(new VertexCell(t5, CAP));
		adjListVe41.add(new VertexCell(t6, CAP));
		adjListVe41.add(new VertexCell(va41, CAP));
		adjListVe41.add(new VertexCell(va42, CAP));
		
		adjListVe42.add(new VertexCell(t7, CAP));
		adjListVe42.add(new VertexCell(t8, CAP));
		adjListVe42.add(new VertexCell(va41, CAP));
		adjListVe42.add(new VertexCell(va42, CAP));

		adjListVa41.add(new VertexCell(vc1, CAP));
		adjListVa41.add(new VertexCell(vc2, CAP));
		adjListVa41.add(new VertexCell(ve41, CAP));
		adjListVa41.add(new VertexCell(ve42, CAP));

		adjListVa42.add(new VertexCell(vc3, CAP));
		adjListVa42.add(new VertexCell(vc4, CAP));
		adjListVa42.add(new VertexCell(ve41, CAP));
		adjListVa42.add(new VertexCell(ve42, CAP));
		
		//Cores
		adjListVc1.add(new VertexCell(va11, CAP));
		adjListVc1.add(new VertexCell(va21, CAP));
		adjListVc1.add(new VertexCell(va31, CAP));
		adjListVc1.add(new VertexCell(va41, CAP));
		
		adjListVc2.add(new VertexCell(va11, CAP));
		adjListVc2.add(new VertexCell(va21, CAP));
		adjListVc2.add(new VertexCell(va31, CAP));
		adjListVc2.add(new VertexCell(va41, CAP));

		adjListVc3.add(new VertexCell(va12, CAP));
		adjListVc3.add(new VertexCell(va22, CAP));
		adjListVc3.add(new VertexCell(va32, CAP));
		adjListVc3.add(new VertexCell(va42, CAP));

		adjListVc4.add(new VertexCell(va12, CAP));
		adjListVc4.add(new VertexCell(va22, CAP));
		adjListVc4.add(new VertexCell(va32, CAP));
		adjListVc4.add(new VertexCell(va42, CAP));

		Graph g = new Graph(vertices, adjListS1, adjListS2, adjListS3, adjListS4, adjListS5, adjListS6, adjListS7, adjListS8,
				                      adjListT1, adjListT2, adjListT3, adjListT4, adjListT5, adjListT6, adjListT7, adjListT8,
				                      adjListVe11, adjListVe12, adjListVa11, adjListVa12,
				                      adjListVe21, adjListVe22, adjListVa21, adjListVa22,
				                      adjListVe31, adjListVe32, adjListVa31, adjListVa32,
				                      adjListVe41, adjListVe42, adjListVa41, adjListVa42,
				                      adjListVc1, adjListVc2, adjListVc3, adjListVc4);
		assertTrue(g.getNumberOfEdges() == 16*3 * 2);

		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(s1);
		sources.add(s2);

		
		sinks.add(t1);
		sinks.add(t2);

		double[] demands = new double[8];
		demands[0] = 1 * 10*8*10;
		demands[1] = 2 * 10*8*10;
		//demands[2] = 3 * 10*8*10;
		//demands[3] = 4 * 10*8*10;
		//demands[4] = 5 * 10*8*10;
		//demands[5] = 6 * 10*8*10;
		//demands[6] = 7 * 10*8*10;
		//demands[7] = 8 * 10*8*10;
		
		//System.out.println("MCF max flow time minimization for the Fat Tree (k=4)");
		g.MCFMinFlowTimeObj(sources, sinks, demands);
		List<Edge> edges = g.getEdges();

		for(Edge e: edges)
			System.out.println(e.toString());
		
		//double minFlow = 0.625;
		//assertTrue(Math.abs(edges.get(0).getFlow(0) - minFlow) < 1e-6);
		//assertTrue(Math.abs(edges.get(1).getFlow(1) - minFlow*2) < 1e-6);
		//assertTrue(Math.abs(edges.get(2).getFlow(2) - minFlow*3) < 1e-6);
		//assertTrue(Math.abs(edges.get(3).getFlow(3) - minFlow*4) < 1e-6);
		//assertTrue(Math.abs(edges.get(4).getFlow(4) - minFlow*5) < 1e-6);
		//assertTrue(Math.abs(edges.get(5).getFlow(5) - minFlow*6) < 1e-6);
		//assertTrue(Math.abs(edges.get(6).getFlow(6) - minFlow*7) < 1e-6);
		//assertTrue(Math.abs(edges.get(7).getFlow(7) - minFlow*8) < 1e-6);
	}*/
	
	//@Test
	/*
	 * The test for concurrent MCF with full 16-leaves fat tree topology
	 */
	/*public void testMCFMinFlowTimeFatTreeTCTest() {
		Vertex s1 = new Vertex(1);
		Vertex s2 = new Vertex(2);
		Vertex s3 = new Vertex(3);
		Vertex s4 = new Vertex(4);
		Vertex s5 = new Vertex(5);
		Vertex s6 = new Vertex(6);
		Vertex s7 = new Vertex(7);
		Vertex s8 = new Vertex(8);
		
		Vertex t1 = new Vertex(9);
		Vertex t2 = new Vertex(10);
		Vertex t3 = new Vertex(11);
		Vertex t4 = new Vertex(12);
		Vertex t5 = new Vertex(13);
		Vertex t6 = new Vertex(14);
		Vertex t7 = new Vertex(15);
		Vertex t8 = new Vertex(16);
		
		//pod1
		Vertex ve11 = new Vertex(17);
		Vertex ve12 = new Vertex(18);
		Vertex va11 = new Vertex(19);
		Vertex va12 = new Vertex(20);

		//pod2
		Vertex ve21 = new Vertex(21);
		Vertex ve22 = new Vertex(22);
		Vertex va21 = new Vertex(23);
		Vertex va22 = new Vertex(24);
		
		//pod3
		Vertex ve31 = new Vertex(25);
		Vertex ve32 = new Vertex(26);
		Vertex va31 = new Vertex(27);
		Vertex va32 = new Vertex(28);
		
		//pod4
		Vertex ve41 = new Vertex(29);
		Vertex ve42 = new Vertex(30);
		Vertex va41 = new Vertex(31);
		Vertex va42 = new Vertex(32);
		
		//core
		Vertex vc1 = new Vertex(33);
		Vertex vc2 = new Vertex(34);
		Vertex vc3 = new Vertex(35);
		Vertex vc4 = new Vertex(36);
		
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(s1);
		vertices.add(s2);
		vertices.add(s3);
		vertices.add(s4);
		vertices.add(s5);
		vertices.add(s6);
		vertices.add(s7);
		vertices.add(s8);
		
		vertices.add(t1);
		vertices.add(t2);
		vertices.add(t3);
		vertices.add(t4);
		vertices.add(t5);
		vertices.add(t6);
		vertices.add(t7);
		vertices.add(t8);
		
		vertices.add(ve11);
		vertices.add(ve12);
		vertices.add(va11);
		vertices.add(va12);

		vertices.add(ve21);
		vertices.add(ve22);
		vertices.add(va21);
		vertices.add(va22);

		vertices.add(ve31);
		vertices.add(ve32);
		vertices.add(va31);
		vertices.add(va32);
		
		vertices.add(ve41);
		vertices.add(ve42);
		vertices.add(va41);
		vertices.add(va42);
		
		vertices.add(vc1);
		vertices.add(vc2);
		vertices.add(vc3);
		vertices.add(vc4);
		
		List<VertexCell> adjListS1 = new LinkedList<VertexCell>();	//for s1
		List<VertexCell> adjListS2 = new LinkedList<VertexCell>();	//for s2
		List<VertexCell> adjListS3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS4 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS5 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS6 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS7 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS8 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListT1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT4 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT5 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT6 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT7 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT8 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe11 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe12 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa11 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa12 = new LinkedList<VertexCell>(); 

		List<VertexCell> adjListVe21 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe22 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa21 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa22 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe31 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe32 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa31 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa32 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe41 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe42 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa41 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa42 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVc1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc4 = new LinkedList<VertexCell>();
		
		double CAP = 2;
		adjListS1.add(new VertexCell(ve11, CAP));
		adjListS2.add(new VertexCell(ve11, CAP));
		adjListS3.add(new VertexCell(ve21, CAP));
		adjListS4.add(new VertexCell(ve31, CAP));
		adjListS5.add(new VertexCell(ve41, CAP));
		adjListS6.add(new VertexCell(ve32, CAP));
		adjListS7.add(new VertexCell(ve22, CAP));
		adjListS8.add(new VertexCell(ve12, CAP));
		
		adjListT1.add(new VertexCell(ve12, CAP));
		adjListT2.add(new VertexCell(ve42, CAP));
		adjListT3.add(new VertexCell(ve31, CAP));
		adjListT4.add(new VertexCell(ve21, CAP));
		adjListT5.add(new VertexCell(ve22, CAP));
		adjListT6.add(new VertexCell(ve41, CAP));
		adjListT7.add(new VertexCell(ve32, CAP));
		adjListT8.add(new VertexCell(ve42, CAP));
		
		//POD 1
		adjListVe11.add(new VertexCell(s1, CAP));
		adjListVe11.add(new VertexCell(s2, CAP));
		adjListVe11.add(new VertexCell(va11, CAP));
		adjListVe11.add(new VertexCell(va12, CAP));
		
		adjListVe12.add(new VertexCell(t1, CAP));
		adjListVe12.add(new VertexCell(s8, CAP));
		adjListVe12.add(new VertexCell(va11, CAP));
		adjListVe12.add(new VertexCell(va12, CAP));

		adjListVa11.add(new VertexCell(vc1, CAP));
		adjListVa11.add(new VertexCell(vc2, CAP));
		adjListVa11.add(new VertexCell(ve11, CAP));
		adjListVa11.add(new VertexCell(ve12, CAP));

		adjListVa12.add(new VertexCell(vc3, CAP));
		adjListVa12.add(new VertexCell(vc4, CAP));
		adjListVa12.add(new VertexCell(ve11, CAP));
		adjListVa12.add(new VertexCell(ve12, CAP));

		//POD 2
		adjListVe21.add(new VertexCell(s3, CAP));
		adjListVe21.add(new VertexCell(t4, CAP));
		adjListVe21.add(new VertexCell(va21, CAP));
		adjListVe21.add(new VertexCell(va22, CAP));
		
		adjListVe22.add(new VertexCell(s7, CAP));
		adjListVe22.add(new VertexCell(t5, CAP));
		adjListVe22.add(new VertexCell(va21, CAP));
		adjListVe22.add(new VertexCell(va22, CAP));

		adjListVa21.add(new VertexCell(vc1, CAP));
		adjListVa21.add(new VertexCell(vc2, CAP));
		adjListVa21.add(new VertexCell(ve21, CAP));
		adjListVa21.add(new VertexCell(ve22, CAP));

		adjListVa22.add(new VertexCell(vc3, CAP));
		adjListVa22.add(new VertexCell(vc4, CAP));
		adjListVa22.add(new VertexCell(ve21, CAP));
		adjListVa22.add(new VertexCell(ve22, CAP));
		
		//POD 3
		adjListVe31.add(new VertexCell(s4, CAP));
		adjListVe31.add(new VertexCell(t3, CAP));
		adjListVe31.add(new VertexCell(va31, CAP));
		adjListVe31.add(new VertexCell(va32, CAP));
		
		adjListVe32.add(new VertexCell(t7, CAP));
		adjListVe32.add(new VertexCell(s6, CAP));
		adjListVe32.add(new VertexCell(va31, CAP));
		adjListVe32.add(new VertexCell(va32, CAP));

		adjListVa31.add(new VertexCell(vc1, CAP));
		adjListVa31.add(new VertexCell(vc2, CAP));
		adjListVa31.add(new VertexCell(ve31, CAP));
		adjListVa31.add(new VertexCell(ve32, CAP));

		adjListVa32.add(new VertexCell(vc3, CAP));
		adjListVa32.add(new VertexCell(vc4, CAP));
		adjListVa32.add(new VertexCell(ve31, CAP));
		adjListVa32.add(new VertexCell(ve32, CAP));

		//POD 4
		adjListVe41.add(new VertexCell(t6, CAP));
		adjListVe41.add(new VertexCell(s5, CAP));
		adjListVe41.add(new VertexCell(va41, CAP));
		adjListVe41.add(new VertexCell(va42, CAP));
		
		adjListVe42.add(new VertexCell(t8, CAP));
		adjListVe42.add(new VertexCell(t2, CAP));
		adjListVe42.add(new VertexCell(va41, CAP));
		adjListVe42.add(new VertexCell(va42, CAP));

		adjListVa41.add(new VertexCell(vc1, CAP));
		adjListVa41.add(new VertexCell(vc2, CAP));
		adjListVa41.add(new VertexCell(ve41, CAP));
		adjListVa41.add(new VertexCell(ve42, CAP));

		adjListVa42.add(new VertexCell(vc3, CAP));
		adjListVa42.add(new VertexCell(vc4, CAP));
		adjListVa42.add(new VertexCell(ve41, CAP));
		adjListVa42.add(new VertexCell(ve42, CAP));
		
		//Cores
		adjListVc1.add(new VertexCell(va11, CAP));
		adjListVc1.add(new VertexCell(va21, CAP));
		adjListVc1.add(new VertexCell(va31, CAP));
		adjListVc1.add(new VertexCell(va41, CAP));
		
		adjListVc2.add(new VertexCell(va11, CAP));
		adjListVc2.add(new VertexCell(va21, CAP));
		adjListVc2.add(new VertexCell(va31, CAP));
		adjListVc2.add(new VertexCell(va41, CAP));

		adjListVc3.add(new VertexCell(va12, CAP));
		adjListVc3.add(new VertexCell(va22, CAP));
		adjListVc3.add(new VertexCell(va32, CAP));
		adjListVc3.add(new VertexCell(va42, CAP));

		adjListVc4.add(new VertexCell(va12, CAP));
		adjListVc4.add(new VertexCell(va22, CAP));
		adjListVc4.add(new VertexCell(va32, CAP));
		adjListVc4.add(new VertexCell(va42, CAP));

		Graph g = new Graph(vertices, adjListS1, adjListS2, adjListS3, adjListS4, adjListS5, adjListS6, adjListS7, adjListS8,
				                      adjListT1, adjListT2, adjListT3, adjListT4, adjListT5, adjListT6, adjListT7, adjListT8,
				                      adjListVe11, adjListVe12, adjListVa11, adjListVa12,
				                      adjListVe21, adjListVe22, adjListVa21, adjListVa22,
				                      adjListVe31, adjListVe32, adjListVa31, adjListVa32,
				                      adjListVe41, adjListVe42, adjListVa41, adjListVa42,
				                      adjListVc1, adjListVc2, adjListVc3, adjListVc4);
		assertTrue(g.getNumberOfEdges() == 16*3 * 2);

		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(t7);
		sources.add(t7);
		sources.add(s7);
		sources.add(t4);
		
		sinks.add(s8);
		sinks.add(s6);
		sinks.add(t5);
		sinks.add(t2);
		
		double[] demands = new double[4];
		demands[0] = 80 * 10*8*10;
		demands[1] = 10 * 10*8*10;
		demands[2] = 10 * 10*8*10;
		demands[3] = 10 * 10*8*10;
		
		//System.out.println("MCF max flow time minimization for the Fat Tree (k=4)");
		g.MCFMinFlowTimeObj(sources, sinks, demands);
		List<Edge> edges = g.getEdges();

		System.out.println("RESULTS:");
		for(Edge e: edges)
			System.out.println(e.toString());
		*/
		/*double minFlow = 0.625;
		assertTrue(Math.abs(edges.get(0).getFlow(0) - minFlow) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(1) - minFlow*2) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(2) - minFlow*3) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(3) - minFlow*4) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(4) - minFlow*5) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(5) - minFlow*6) < 1e-6);
		assertTrue(Math.abs(edges.get(6).getFlow(6) - minFlow*7) < 1e-6);
		assertTrue(Math.abs(edges.get(7).getFlow(7) - minFlow*8) < 1e-6);*/
	//}
	
	//@Test
	/*
	 * The test for concurrent MCF with full 16-leaves fat tree topology
	 */
	/*public void testMCFMinFlowTimeFatTreeCartesian2() {
		Vertex s1 = new Vertex(1);
		Vertex s2 = new Vertex(2);
		Vertex s3 = new Vertex(3);
		Vertex s4 = new Vertex(4);
		Vertex s5 = new Vertex(5);
		Vertex s6 = new Vertex(6);
		Vertex s7 = new Vertex(7);
		Vertex s8 = new Vertex(8);
		
		Vertex t1 = new Vertex(9);
		Vertex t2 = new Vertex(10);
		Vertex t3 = new Vertex(11);
		Vertex t4 = new Vertex(12);
		Vertex t5 = new Vertex(13);
		Vertex t6 = new Vertex(14);
		Vertex t7 = new Vertex(15);
		Vertex t8 = new Vertex(16);
		
		//pod1
		Vertex ve11 = new Vertex(17);
		Vertex ve12 = new Vertex(18);
		Vertex va11 = new Vertex(19);
		Vertex va12 = new Vertex(20);

		//pod2
		Vertex ve21 = new Vertex(21);
		Vertex ve22 = new Vertex(22);
		Vertex va21 = new Vertex(23);
		Vertex va22 = new Vertex(24);
		
		//pod3
		Vertex ve31 = new Vertex(25);
		Vertex ve32 = new Vertex(26);
		Vertex va31 = new Vertex(27);
		Vertex va32 = new Vertex(28);
		
		//pod4
		Vertex ve41 = new Vertex(29);
		Vertex ve42 = new Vertex(30);
		Vertex va41 = new Vertex(31);
		Vertex va42 = new Vertex(32);
		
		//core
		Vertex vc1 = new Vertex(33);
		Vertex vc2 = new Vertex(34);
		Vertex vc3 = new Vertex(35);
		Vertex vc4 = new Vertex(36);
		
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(s1);
		vertices.add(s2);
		vertices.add(s3);
		vertices.add(s4);
		vertices.add(s5);
		vertices.add(s6);
		vertices.add(s7);
		vertices.add(s8);
		
		vertices.add(t1);
		vertices.add(t2);
		vertices.add(t3);
		vertices.add(t4);
		vertices.add(t5);
		vertices.add(t6);
		vertices.add(t7);
		vertices.add(t8);
		
		vertices.add(ve11);
		vertices.add(ve12);
		vertices.add(va11);
		vertices.add(va12);

		vertices.add(ve21);
		vertices.add(ve22);
		vertices.add(va21);
		vertices.add(va22);

		vertices.add(ve31);
		vertices.add(ve32);
		vertices.add(va31);
		vertices.add(va32);
		
		vertices.add(ve41);
		vertices.add(ve42);
		vertices.add(va41);
		vertices.add(va42);
		
		vertices.add(vc1);
		vertices.add(vc2);
		vertices.add(vc3);
		vertices.add(vc4);
		
		List<VertexCell> adjListS1 = new LinkedList<VertexCell>();	//for s1
		List<VertexCell> adjListS2 = new LinkedList<VertexCell>();	//for s2
		List<VertexCell> adjListS3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS4 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS5 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS6 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS7 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS8 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListT1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT4 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT5 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT6 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT7 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT8 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe11 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe12 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa11 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa12 = new LinkedList<VertexCell>(); 

		List<VertexCell> adjListVe21 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe22 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa21 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa22 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe31 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe32 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa31 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa32 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe41 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe42 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa41 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa42 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVc1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc4 = new LinkedList<VertexCell>();
		
		double CAP = 2;
		adjListS1.add(new VertexCell(ve11, CAP));
		adjListS2.add(new VertexCell(ve11, CAP));
		adjListS3.add(new VertexCell(ve21, CAP));
		adjListS4.add(new VertexCell(ve31, CAP));
		adjListS5.add(new VertexCell(ve41, CAP));
		adjListS6.add(new VertexCell(ve32, CAP));
		adjListS7.add(new VertexCell(ve22, CAP));
		adjListS8.add(new VertexCell(ve12, CAP));
		
		adjListT1.add(new VertexCell(ve12, CAP));
		adjListT2.add(new VertexCell(ve42, CAP));
		adjListT3.add(new VertexCell(ve31, CAP));
		adjListT4.add(new VertexCell(ve21, CAP));
		adjListT5.add(new VertexCell(ve22, CAP));
		adjListT6.add(new VertexCell(ve41, CAP));
		adjListT7.add(new VertexCell(ve32, CAP));
		adjListT8.add(new VertexCell(ve42, CAP));
		
		//POD 1
		adjListVe11.add(new VertexCell(s1, CAP));
		adjListVe11.add(new VertexCell(s2, CAP));
		adjListVe11.add(new VertexCell(va11, CAP));
		adjListVe11.add(new VertexCell(va12, CAP));
		
		adjListVe12.add(new VertexCell(t1, CAP));
		adjListVe12.add(new VertexCell(s8, CAP));
		adjListVe12.add(new VertexCell(va11, CAP));
		adjListVe12.add(new VertexCell(va12, CAP));

		adjListVa11.add(new VertexCell(vc1, CAP));
		adjListVa11.add(new VertexCell(vc2, CAP));
		adjListVa11.add(new VertexCell(ve11, CAP));
		adjListVa11.add(new VertexCell(ve12, CAP));

		adjListVa12.add(new VertexCell(vc3, CAP));
		adjListVa12.add(new VertexCell(vc4, CAP));
		adjListVa12.add(new VertexCell(ve11, CAP));
		adjListVa12.add(new VertexCell(ve12, CAP));

		//POD 2
		adjListVe21.add(new VertexCell(s3, CAP));
		adjListVe21.add(new VertexCell(t4, CAP));
		adjListVe21.add(new VertexCell(va21, CAP));
		adjListVe21.add(new VertexCell(va22, CAP));
		
		adjListVe22.add(new VertexCell(s7, CAP));
		adjListVe22.add(new VertexCell(t5, CAP));
		adjListVe22.add(new VertexCell(va21, CAP));
		adjListVe22.add(new VertexCell(va22, CAP));

		adjListVa21.add(new VertexCell(vc1, CAP));
		adjListVa21.add(new VertexCell(vc2, CAP));
		adjListVa21.add(new VertexCell(ve21, CAP));
		adjListVa21.add(new VertexCell(ve22, CAP));

		adjListVa22.add(new VertexCell(vc3, CAP));
		adjListVa22.add(new VertexCell(vc4, CAP));
		adjListVa22.add(new VertexCell(ve21, CAP));
		adjListVa22.add(new VertexCell(ve22, CAP));
		
		//POD 3
		adjListVe31.add(new VertexCell(s4, CAP));
		adjListVe31.add(new VertexCell(t3, CAP));
		adjListVe31.add(new VertexCell(va31, CAP));
		adjListVe31.add(new VertexCell(va32, CAP));
		
		adjListVe32.add(new VertexCell(t7, CAP));
		adjListVe32.add(new VertexCell(s6, CAP));
		adjListVe32.add(new VertexCell(va31, CAP));
		adjListVe32.add(new VertexCell(va32, CAP));

		adjListVa31.add(new VertexCell(vc1, CAP));
		adjListVa31.add(new VertexCell(vc2, CAP));
		adjListVa31.add(new VertexCell(ve31, CAP));
		adjListVa31.add(new VertexCell(ve32, CAP));

		adjListVa32.add(new VertexCell(vc3, CAP));
		adjListVa32.add(new VertexCell(vc4, CAP));
		adjListVa32.add(new VertexCell(ve31, CAP));
		adjListVa32.add(new VertexCell(ve32, CAP));

		//POD 4
		adjListVe41.add(new VertexCell(t6, CAP));
		adjListVe41.add(new VertexCell(s5, CAP));
		adjListVe41.add(new VertexCell(va41, CAP));
		adjListVe41.add(new VertexCell(va42, CAP));
		
		adjListVe42.add(new VertexCell(t8, CAP));
		adjListVe42.add(new VertexCell(t2, CAP));
		adjListVe42.add(new VertexCell(va41, CAP));
		adjListVe42.add(new VertexCell(va42, CAP));

		adjListVa41.add(new VertexCell(vc1, CAP));
		adjListVa41.add(new VertexCell(vc2, CAP));
		adjListVa41.add(new VertexCell(ve41, CAP));
		adjListVa41.add(new VertexCell(ve42, CAP));

		adjListVa42.add(new VertexCell(vc3, CAP));
		adjListVa42.add(new VertexCell(vc4, CAP));
		adjListVa42.add(new VertexCell(ve41, CAP));
		adjListVa42.add(new VertexCell(ve42, CAP));
		
		//Cores
		adjListVc1.add(new VertexCell(va11, CAP));
		adjListVc1.add(new VertexCell(va21, CAP));
		adjListVc1.add(new VertexCell(va31, CAP));
		adjListVc1.add(new VertexCell(va41, CAP));
		
		adjListVc2.add(new VertexCell(va11, CAP));
		adjListVc2.add(new VertexCell(va21, CAP));
		adjListVc2.add(new VertexCell(va31, CAP));
		adjListVc2.add(new VertexCell(va41, CAP));

		adjListVc3.add(new VertexCell(va12, CAP));
		adjListVc3.add(new VertexCell(va22, CAP));
		adjListVc3.add(new VertexCell(va32, CAP));
		adjListVc3.add(new VertexCell(va42, CAP));

		adjListVc4.add(new VertexCell(va12, CAP));
		adjListVc4.add(new VertexCell(va22, CAP));
		adjListVc4.add(new VertexCell(va32, CAP));
		adjListVc4.add(new VertexCell(va42, CAP));

		Graph g = new Graph(vertices, adjListS1, adjListS2, adjListS3, adjListS4, adjListS5, adjListS6, adjListS7, adjListS8,
				                      adjListT1, adjListT2, adjListT3, adjListT4, adjListT5, adjListT6, adjListT7, adjListT8,
				                      adjListVe11, adjListVe12, adjListVa11, adjListVa12,
				                      adjListVe21, adjListVe22, adjListVa21, adjListVa22,
				                      adjListVe31, adjListVe32, adjListVa31, adjListVa32,
				                      adjListVe41, adjListVe42, adjListVa41, adjListVa42,
				                      adjListVc1, adjListVc2, adjListVc3, adjListVc4);
		assertTrue(g.getNumberOfEdges() == 16*3 * 2);

		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(t5);
		sources.add(t5);
		sources.add(t7);
		sources.add(t7);
		sources.add(s2);
		sources.add(s2);
		sources.add(t6);
		sources.add(t1);
		sources.add(t1);
		sources.add(s1);
		sources.add(s1);
		sources.add(s5);
		sources.add(s5);
		sources.add(s8);
		sources.add(t8);
		sources.add(t8);
		sources.add(t4);
		sources.add(t4);
		sources.add(s3);
		sources.add(s3);
		sources.add(t3);
		sources.add(t2);
		sources.add(s4);
		sources.add(s7);
		
		sinks.add(t7);
		sinks.add(t1);
		sinks.add(s2);
		sinks.add(s1);
		sinks.add(t6);
		sinks.add(s5);
		sinks.add(s8);
		sinks.add(s1);
		sinks.add(t8);
		sinks.add(s5);
		sinks.add(t4);
		sinks.add(s8);
		sinks.add(s3);
		sinks.add(t3);
		sinks.add(t4);
		sinks.add(t2);
		sinks.add(s3);
		sinks.add(s4);
		sinks.add(t3);
		sinks.add(s7);
		sinks.add(s6);
		sinks.add(s4);
		sinks.add(s7);
		sinks.add(s6);
		
		double[] demands = new double[24];
		demands[0] = 80 * 10*8*10;
		demands[1] = 10 * 10*8*10;
		demands[2] = 10 * 10*8*10;
		demands[3] = 10 * 10*8*10;
		demands[4] = 20 * 10*8*10;
		demands[5] = 30 * 10*8*10;
		demands[6] = 30 * 10*8*10;
		demands[7] = 10 * 10*8*10;
		demands[8] = 20 * 10*8*10;
		demands[9] = 40 * 10*8*10;
		demands[10] = 10 * 10*8*10;
		demands[11] = 70 * 10*8*10;
		demands[12] = 10 * 10*8*10;
		demands[13] = 10 * 10*8*10;
		demands[14] = 50 * 10*8*10;
		demands[15] = 10 * 10*8*10;
		demands[16] = 10 * 10*8*10;
		demands[17] = 10 * 10*8*10;
		demands[18] = 10 * 10*8*10;
		demands[19] = 20 * 10*8*10;
		demands[20] = 20 * 10*8*10;
		demands[21] = 30 * 10*8*10;
		demands[22] = 10 * 10*8*10;
		demands[23] = 10 * 10*8*10;
		
		//System.out.println("MCF max flow time minimization for the Fat Tree (k=4)");
		g.MCFMinFlowTimeObj(sources, sinks, demands);
		List<Edge> edges = g.getEdges();

		System.out.println("RESULTS:");
		for(Edge e: edges)
			System.out.println(e.toString());
	*/	
		/*double minFlow = 0.625;
		assertTrue(Math.abs(edges.get(0).getFlow(0) - minFlow) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(1) - minFlow*2) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(2) - minFlow*3) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(3) - minFlow*4) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(4) - minFlow*5) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(5) - minFlow*6) < 1e-6);
		assertTrue(Math.abs(edges.get(6).getFlow(6) - minFlow*7) < 1e-6);
		assertTrue(Math.abs(edges.get(7).getFlow(7) - minFlow*8) < 1e-6);*/
	//}
	
	//@Test
	/*
	 * The test for concurrent MCF with full 16-leaves fat tree topology
	 */
	/*public void testMCFMinFlowTimeFatTreeCartesian1() {
		Vertex s1 = new Vertex(1);
		Vertex s2 = new Vertex(2);
		Vertex s3 = new Vertex(3);
		Vertex s4 = new Vertex(4);
		Vertex s5 = new Vertex(5);
		Vertex s6 = new Vertex(6);
		Vertex s7 = new Vertex(7);
		Vertex s8 = new Vertex(8);
		
		Vertex t1 = new Vertex(9);
		Vertex t2 = new Vertex(10);
		Vertex t3 = new Vertex(11);
		Vertex t4 = new Vertex(12);
		Vertex t5 = new Vertex(13);
		Vertex t6 = new Vertex(14);
		Vertex t7 = new Vertex(15);
		Vertex t8 = new Vertex(16);
		
		//pod1
		Vertex ve11 = new Vertex(17);
		Vertex ve12 = new Vertex(18);
		Vertex va11 = new Vertex(19);
		Vertex va12 = new Vertex(20);

		//pod2
		Vertex ve21 = new Vertex(21);
		Vertex ve22 = new Vertex(22);
		Vertex va21 = new Vertex(23);
		Vertex va22 = new Vertex(24);
		
		//pod3
		Vertex ve31 = new Vertex(25);
		Vertex ve32 = new Vertex(26);
		Vertex va31 = new Vertex(27);
		Vertex va32 = new Vertex(28);
		
		//pod4
		Vertex ve41 = new Vertex(29);
		Vertex ve42 = new Vertex(30);
		Vertex va41 = new Vertex(31);
		Vertex va42 = new Vertex(32);
		
		//core
		Vertex vc1 = new Vertex(33);
		Vertex vc2 = new Vertex(34);
		Vertex vc3 = new Vertex(35);
		Vertex vc4 = new Vertex(36);
		
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(s1);
		vertices.add(s2);
		vertices.add(s3);
		vertices.add(s4);
		vertices.add(s5);
		vertices.add(s6);
		vertices.add(s7);
		vertices.add(s8);
		
		vertices.add(t1);
		vertices.add(t2);
		vertices.add(t3);
		vertices.add(t4);
		vertices.add(t5);
		vertices.add(t6);
		vertices.add(t7);
		vertices.add(t8);
		
		vertices.add(ve11);
		vertices.add(ve12);
		vertices.add(va11);
		vertices.add(va12);

		vertices.add(ve21);
		vertices.add(ve22);
		vertices.add(va21);
		vertices.add(va22);

		vertices.add(ve31);
		vertices.add(ve32);
		vertices.add(va31);
		vertices.add(va32);
		
		vertices.add(ve41);
		vertices.add(ve42);
		vertices.add(va41);
		vertices.add(va42);
		
		vertices.add(vc1);
		vertices.add(vc2);
		vertices.add(vc3);
		vertices.add(vc4);
		
		List<VertexCell> adjListS1 = new LinkedList<VertexCell>();	//for s1
		List<VertexCell> adjListS2 = new LinkedList<VertexCell>();	//for s2
		List<VertexCell> adjListS3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS4 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS5 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS6 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS7 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS8 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListT1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT4 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT5 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT6 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT7 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT8 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe11 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe12 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa11 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa12 = new LinkedList<VertexCell>(); 

		List<VertexCell> adjListVe21 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe22 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa21 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa22 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe31 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe32 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa31 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa32 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe41 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe42 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa41 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa42 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVc1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc4 = new LinkedList<VertexCell>();
		
		double CAP = 2;
		adjListS1.add(new VertexCell(ve11, CAP));
		adjListS2.add(new VertexCell(ve11, CAP));
		adjListS3.add(new VertexCell(ve21, CAP));
		adjListS4.add(new VertexCell(ve31, CAP));
		adjListS5.add(new VertexCell(ve41, CAP));
		adjListS6.add(new VertexCell(ve32, CAP));
		adjListS7.add(new VertexCell(ve22, CAP));
		adjListS8.add(new VertexCell(ve12, CAP));
		
		adjListT1.add(new VertexCell(ve12, CAP));
		adjListT2.add(new VertexCell(ve42, CAP));
		adjListT3.add(new VertexCell(ve31, CAP));
		adjListT4.add(new VertexCell(ve21, CAP));
		adjListT5.add(new VertexCell(ve22, CAP));
		adjListT6.add(new VertexCell(ve41, CAP));
		adjListT7.add(new VertexCell(ve32, CAP));
		adjListT8.add(new VertexCell(ve42, CAP));
		
		//POD 1
		adjListVe11.add(new VertexCell(s1, CAP));
		adjListVe11.add(new VertexCell(s2, CAP));
		adjListVe11.add(new VertexCell(va11, CAP));
		adjListVe11.add(new VertexCell(va12, CAP));
		
		adjListVe12.add(new VertexCell(t1, CAP));
		adjListVe12.add(new VertexCell(s8, CAP));
		adjListVe12.add(new VertexCell(va11, CAP));
		adjListVe12.add(new VertexCell(va12, CAP));

		adjListVa11.add(new VertexCell(vc1, CAP));
		adjListVa11.add(new VertexCell(vc2, CAP));
		adjListVa11.add(new VertexCell(ve11, CAP));
		adjListVa11.add(new VertexCell(ve12, CAP));

		adjListVa12.add(new VertexCell(vc3, CAP));
		adjListVa12.add(new VertexCell(vc4, CAP));
		adjListVa12.add(new VertexCell(ve11, CAP));
		adjListVa12.add(new VertexCell(ve12, CAP));

		//POD 2
		adjListVe21.add(new VertexCell(s3, CAP));
		adjListVe21.add(new VertexCell(t4, CAP));
		adjListVe21.add(new VertexCell(va21, CAP));
		adjListVe21.add(new VertexCell(va22, CAP));
		
		adjListVe22.add(new VertexCell(s7, CAP));
		adjListVe22.add(new VertexCell(t5, CAP));
		adjListVe22.add(new VertexCell(va21, CAP));
		adjListVe22.add(new VertexCell(va22, CAP));

		adjListVa21.add(new VertexCell(vc1, CAP));
		adjListVa21.add(new VertexCell(vc2, CAP));
		adjListVa21.add(new VertexCell(ve21, CAP));
		adjListVa21.add(new VertexCell(ve22, CAP));

		adjListVa22.add(new VertexCell(vc3, CAP));
		adjListVa22.add(new VertexCell(vc4, CAP));
		adjListVa22.add(new VertexCell(ve21, CAP));
		adjListVa22.add(new VertexCell(ve22, CAP));
		
		//POD 3
		adjListVe31.add(new VertexCell(s4, CAP));
		adjListVe31.add(new VertexCell(t3, CAP));
		adjListVe31.add(new VertexCell(va31, CAP));
		adjListVe31.add(new VertexCell(va32, CAP));
		
		adjListVe32.add(new VertexCell(t7, CAP));
		adjListVe32.add(new VertexCell(s6, CAP));
		adjListVe32.add(new VertexCell(va31, CAP));
		adjListVe32.add(new VertexCell(va32, CAP));

		adjListVa31.add(new VertexCell(vc1, CAP));
		adjListVa31.add(new VertexCell(vc2, CAP));
		adjListVa31.add(new VertexCell(ve31, CAP));
		adjListVa31.add(new VertexCell(ve32, CAP));

		adjListVa32.add(new VertexCell(vc3, CAP));
		adjListVa32.add(new VertexCell(vc4, CAP));
		adjListVa32.add(new VertexCell(ve31, CAP));
		adjListVa32.add(new VertexCell(ve32, CAP));

		//POD 4
		adjListVe41.add(new VertexCell(t6, CAP));
		adjListVe41.add(new VertexCell(s5, CAP));
		adjListVe41.add(new VertexCell(va41, CAP));
		adjListVe41.add(new VertexCell(va42, CAP));
		
		adjListVe42.add(new VertexCell(t8, CAP));
		adjListVe42.add(new VertexCell(t2, CAP));
		adjListVe42.add(new VertexCell(va41, CAP));
		adjListVe42.add(new VertexCell(va42, CAP));

		adjListVa41.add(new VertexCell(vc1, CAP));
		adjListVa41.add(new VertexCell(vc2, CAP));
		adjListVa41.add(new VertexCell(ve41, CAP));
		adjListVa41.add(new VertexCell(ve42, CAP));

		adjListVa42.add(new VertexCell(vc3, CAP));
		adjListVa42.add(new VertexCell(vc4, CAP));
		adjListVa42.add(new VertexCell(ve41, CAP));
		adjListVa42.add(new VertexCell(ve42, CAP));
		
		//Cores
		adjListVc1.add(new VertexCell(va11, CAP));
		adjListVc1.add(new VertexCell(va21, CAP));
		adjListVc1.add(new VertexCell(va31, CAP));
		adjListVc1.add(new VertexCell(va41, CAP));
		
		adjListVc2.add(new VertexCell(va11, CAP));
		adjListVc2.add(new VertexCell(va21, CAP));
		adjListVc2.add(new VertexCell(va31, CAP));
		adjListVc2.add(new VertexCell(va41, CAP));

		adjListVc3.add(new VertexCell(va12, CAP));
		adjListVc3.add(new VertexCell(va22, CAP));
		adjListVc3.add(new VertexCell(va32, CAP));
		adjListVc3.add(new VertexCell(va42, CAP));

		adjListVc4.add(new VertexCell(va12, CAP));
		adjListVc4.add(new VertexCell(va22, CAP));
		adjListVc4.add(new VertexCell(va32, CAP));
		adjListVc4.add(new VertexCell(va42, CAP));

		Graph g = new Graph(vertices, adjListS1, adjListS2, adjListS3, adjListS4, adjListS5, adjListS6, adjListS7, adjListS8,
				                      adjListT1, adjListT2, adjListT3, adjListT4, adjListT5, adjListT6, adjListT7, adjListT8,
				                      adjListVe11, adjListVe12, adjListVa11, adjListVa12,
				                      adjListVe21, adjListVe22, adjListVa21, adjListVa22,
				                      adjListVe31, adjListVe32, adjListVa31, adjListVa32,
				                      adjListVe41, adjListVe42, adjListVa41, adjListVa42,
				                      adjListVc1, adjListVc2, adjListVc3, adjListVc4);
		assertTrue(g.getNumberOfEdges() == 16*3 * 2);

		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(t5);
		sources.add(t7);
		sources.add(s2);
		sources.add(t6);
		sources.add(t1);
		sources.add(s1);
		sources.add(s5);
		sources.add(s8);
		sources.add(t8);
		sources.add(t4);
		sources.add(s3);
		sources.add(t3);
		sources.add(t2);
		sources.add(s4);
		sources.add(s7);
		
		sinks.add(t7);
		sinks.add(s2);
		sinks.add(t6);
		sinks.add(t1);
		sinks.add(s1);
		sinks.add(s5);
		sinks.add(s8);
		sinks.add(t8);
		sinks.add(t4);
		sinks.add(s3);
		sinks.add(t3);
		sinks.add(t2);
		sinks.add(s4);
		sinks.add(s7);
		sinks.add(s6);
		
		double[] demands = new double[15];
		demands[0] = 80 * 10*8*10;
		demands[1] = 10 * 10*8*10;
		demands[2] = 20 * 10*8*10;
		demands[3] = 30 * 10*8*10;
		demands[4] = 10 * 10*8*10;
		demands[5] = 40 * 10*8*10;
		demands[6] = 70 * 10*8*10;
		demands[7] = 60 * 10*8*10;
		demands[8] = 50 * 10*8*10;
		demands[9] = 10 * 10*8*10;
		demands[10] = 10 * 10*8*10;
		demands[11] = 20 * 10*8*10;
		demands[12] = 30 * 10*8*10;
		demands[13] = 10 * 10*8*10;
		demands[14] = 10 * 10*8*10;
		
		//System.out.println("MCF max flow time minimization for the Fat Tree (k=4)");
		g.MCFMinFlowTimeObj(sources, sinks, demands);
		List<Edge> edges = g.getEdges();

		System.out.println("RESULTS:");
		for(Edge e: edges)
			System.out.println(e.toString());
		*/
		/*double minFlow = 0.625;
		assertTrue(Math.abs(edges.get(0).getFlow(0) - minFlow) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(1) - minFlow*2) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(2) - minFlow*3) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(3) - minFlow*4) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(4) - minFlow*5) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(5) - minFlow*6) < 1e-6);
		assertTrue(Math.abs(edges.get(6).getFlow(6) - minFlow*7) < 1e-6);
		assertTrue(Math.abs(edges.get(7).getFlow(7) - minFlow*8) < 1e-6);*/
	//}
	
	//@Test
	/*
	 * The test for concurrent MCF with full 24-leaves fat tree topology
	 */
	/*public void testMCFMinFlowTimeFatTree24() {
		Vertex s1 = new Vertex(1);
		Vertex s2 = new Vertex(2);
		Vertex s3 = new Vertex(3);
		Vertex s4 = new Vertex(4);
		Vertex s5 = new Vertex(5);
		Vertex s6 = new Vertex(6);
		Vertex s7 = new Vertex(7);
		Vertex s8 = new Vertex(8);
		
		Vertex t1 = new Vertex(9);
		Vertex t2 = new Vertex(10);
		Vertex t3 = new Vertex(11);
		Vertex t4 = new Vertex(12);
		Vertex t5 = new Vertex(13);
		Vertex t6 = new Vertex(14);
		Vertex t7 = new Vertex(15);
		Vertex t8 = new Vertex(16);
		
		Vertex s1n = new Vertex(37);
		Vertex s2n = new Vertex(38);
		Vertex s3n = new Vertex(39);
		Vertex s4n = new Vertex(40);
		Vertex t1n = new Vertex(41);
		Vertex t2n = new Vertex(42);
		Vertex t3n = new Vertex(43);
		Vertex t4n = new Vertex(44);
		Vertex ve11n = new Vertex(45);
		Vertex ve12n = new Vertex(46);
		Vertex va11n = new Vertex(47);
		Vertex va12n = new Vertex(48);
		Vertex ve21n = new Vertex(49);
		Vertex ve22n = new Vertex(50);
		Vertex va21n = new Vertex(51);
		Vertex va22n = new Vertex(52);
		
		//pod1
		Vertex ve11 = new Vertex(17);
		Vertex ve12 = new Vertex(18);
		Vertex va11 = new Vertex(19);
		Vertex va12 = new Vertex(20);

		//pod2
		Vertex ve21 = new Vertex(21);
		Vertex ve22 = new Vertex(22);
		Vertex va21 = new Vertex(23);
		Vertex va22 = new Vertex(24);
		
		//pod3
		Vertex ve31 = new Vertex(25);
		Vertex ve32 = new Vertex(26);
		Vertex va31 = new Vertex(27);
		Vertex va32 = new Vertex(28);
		
		//pod4
		Vertex ve41 = new Vertex(29);
		Vertex ve42 = new Vertex(30);
		Vertex va41 = new Vertex(31);
		Vertex va42 = new Vertex(32);
		
		//core
		Vertex vc1 = new Vertex(33);
		Vertex vc2 = new Vertex(34);
		Vertex vc3 = new Vertex(35);
		Vertex vc4 = new Vertex(36);
		
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(s1);
		vertices.add(s2);
		vertices.add(s3);
		vertices.add(s4);
		vertices.add(s5);
		vertices.add(s6);
		vertices.add(s7);
		vertices.add(s8);
		
		vertices.add(t1);
		vertices.add(t2);
		vertices.add(t3);
		vertices.add(t4);
		vertices.add(t5);
		vertices.add(t6);
		vertices.add(t7);
		vertices.add(t8);
		
		vertices.add(ve11);
		vertices.add(ve12);
		vertices.add(va11);
		vertices.add(va12);

		vertices.add(ve21);
		vertices.add(ve22);
		vertices.add(va21);
		vertices.add(va22);

		vertices.add(ve31);
		vertices.add(ve32);
		vertices.add(va31);
		vertices.add(va32);
		
		vertices.add(ve41);
		vertices.add(ve42);
		vertices.add(va41);
		vertices.add(va42);
		
		vertices.add(vc1);
		vertices.add(vc2);
		vertices.add(vc3);
		vertices.add(vc4);
		
		vertices.add(s1n);
		vertices.add(s2n);
		vertices.add(s3n);
		vertices.add(s4n);
		vertices.add(t1n);
		vertices.add(t2n);
		vertices.add(t3n);
		vertices.add(t4n);
		vertices.add(ve11n);
		vertices.add(ve12n);
		vertices.add(va11n);
		vertices.add(va12n);
		vertices.add(ve21n);
		vertices.add(ve22n);
		vertices.add(va21n);
		vertices.add(va22n);
		
		
		List<VertexCell> adjListS1 = new LinkedList<VertexCell>();	//for s1
		List<VertexCell> adjListS2 = new LinkedList<VertexCell>();	//for s2
		List<VertexCell> adjListS3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS4 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS5 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS6 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS7 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS8 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListT1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT4 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT5 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT6 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT7 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT8 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe11 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe12 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa11 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa12 = new LinkedList<VertexCell>(); 

		List<VertexCell> adjListVe21 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe22 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa21 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa22 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe31 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe32 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa31 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa32 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe41 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe42 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa41 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa42 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVc1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc4 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListS1n = new LinkedList<VertexCell>();
		List<VertexCell> adjListS2n = new LinkedList<VertexCell>();
		List<VertexCell> adjListS3n = new LinkedList<VertexCell>();
		List<VertexCell> adjListS4n = new LinkedList<VertexCell>();
		List<VertexCell> adjListT1n = new LinkedList<VertexCell>();
		List<VertexCell> adjListT2n = new LinkedList<VertexCell>();
		List<VertexCell> adjListT3n = new LinkedList<VertexCell>();
		List<VertexCell> adjListT4n = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe11n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe12n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa11n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa12n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe21n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe22n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa21n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa22n = new LinkedList<VertexCell>();
		
		double CAP = 5;
		adjListS1.add(new VertexCell(ve11, CAP));
		adjListS2.add(new VertexCell(ve11, CAP));
		adjListS3.add(new VertexCell(ve21, CAP));
		adjListS4.add(new VertexCell(ve31, CAP));
		adjListS5.add(new VertexCell(ve41, CAP));
		adjListS6.add(new VertexCell(ve32, CAP));
		adjListS7.add(new VertexCell(ve22, CAP));
		adjListS8.add(new VertexCell(ve12, CAP));
		
		adjListT1.add(new VertexCell(ve12, CAP));
		adjListT2.add(new VertexCell(ve42, CAP));
		adjListT3.add(new VertexCell(ve31, CAP));
		adjListT4.add(new VertexCell(ve21, CAP));
		adjListT5.add(new VertexCell(ve22, CAP));
		adjListT6.add(new VertexCell(ve41, CAP));
		adjListT7.add(new VertexCell(ve32, CAP));
		adjListT8.add(new VertexCell(ve42, CAP));
		
		//POD 1
		adjListVe11.add(new VertexCell(s1, CAP));
		adjListVe11.add(new VertexCell(s2, CAP));
		adjListVe11.add(new VertexCell(va11, CAP));
		adjListVe11.add(new VertexCell(va12, CAP));
		
		adjListVe12.add(new VertexCell(t1, CAP));
		adjListVe12.add(new VertexCell(s8, CAP));
		adjListVe12.add(new VertexCell(va11, CAP));
		adjListVe12.add(new VertexCell(va12, CAP));

		adjListVa11.add(new VertexCell(vc1, CAP));
		adjListVa11.add(new VertexCell(vc2, CAP));
		adjListVa11.add(new VertexCell(ve11, CAP));
		adjListVa11.add(new VertexCell(ve12, CAP));

		adjListVa12.add(new VertexCell(vc3, CAP));
		adjListVa12.add(new VertexCell(vc4, CAP));
		adjListVa12.add(new VertexCell(ve11, CAP));
		adjListVa12.add(new VertexCell(ve12, CAP));

		//POD 2
		adjListVe21.add(new VertexCell(s3, CAP));
		adjListVe21.add(new VertexCell(t4, CAP));
		adjListVe21.add(new VertexCell(va21, CAP));
		adjListVe21.add(new VertexCell(va22, CAP));
		
		adjListVe22.add(new VertexCell(s7, CAP));
		adjListVe22.add(new VertexCell(t5, CAP));
		adjListVe22.add(new VertexCell(va21, CAP));
		adjListVe22.add(new VertexCell(va22, CAP));

		adjListVa21.add(new VertexCell(vc1, CAP));
		adjListVa21.add(new VertexCell(vc2, CAP));
		adjListVa21.add(new VertexCell(ve21, CAP));
		adjListVa21.add(new VertexCell(ve22, CAP));

		adjListVa22.add(new VertexCell(vc3, CAP));
		adjListVa22.add(new VertexCell(vc4, CAP));
		adjListVa22.add(new VertexCell(ve21, CAP));
		adjListVa22.add(new VertexCell(ve22, CAP));
		
		//POD 3
		adjListVe31.add(new VertexCell(s4, CAP));
		adjListVe31.add(new VertexCell(t3, CAP));
		adjListVe31.add(new VertexCell(va31, CAP));
		adjListVe31.add(new VertexCell(va32, CAP));
		
		adjListVe32.add(new VertexCell(t7, CAP));
		adjListVe32.add(new VertexCell(s6, CAP));
		adjListVe32.add(new VertexCell(va31, CAP));
		adjListVe32.add(new VertexCell(va32, CAP));

		adjListVa31.add(new VertexCell(vc1, CAP));
		adjListVa31.add(new VertexCell(vc2, CAP));
		adjListVa31.add(new VertexCell(ve31, CAP));
		adjListVa31.add(new VertexCell(ve32, CAP));

		adjListVa32.add(new VertexCell(vc3, CAP));
		adjListVa32.add(new VertexCell(vc4, CAP));
		adjListVa32.add(new VertexCell(ve31, CAP));
		adjListVa32.add(new VertexCell(ve32, CAP));

		//POD 4
		adjListVe41.add(new VertexCell(t6, CAP));
		adjListVe41.add(new VertexCell(s5, CAP));
		adjListVe41.add(new VertexCell(va41, CAP));
		adjListVe41.add(new VertexCell(va42, CAP));
		
		adjListVe42.add(new VertexCell(t8, CAP));
		adjListVe42.add(new VertexCell(t2, CAP));
		adjListVe42.add(new VertexCell(va41, CAP));
		adjListVe42.add(new VertexCell(va42, CAP));

		adjListVa41.add(new VertexCell(vc1, CAP));
		adjListVa41.add(new VertexCell(vc2, CAP));
		adjListVa41.add(new VertexCell(ve41, CAP));
		adjListVa41.add(new VertexCell(ve42, CAP));

		adjListVa42.add(new VertexCell(vc3, CAP));
		adjListVa42.add(new VertexCell(vc4, CAP));
		adjListVa42.add(new VertexCell(ve41, CAP));
		adjListVa42.add(new VertexCell(ve42, CAP));
		
		//Cores
		adjListVc1.add(new VertexCell(va11, CAP));
		adjListVc1.add(new VertexCell(va21, CAP));
		adjListVc1.add(new VertexCell(va31, CAP));
		adjListVc1.add(new VertexCell(va41, CAP));
		adjListVc1.add(new VertexCell(va11n, CAP));
		adjListVc1.add(new VertexCell(va21n, CAP));
		
		adjListVc2.add(new VertexCell(va11, CAP));
		adjListVc2.add(new VertexCell(va21, CAP));
		adjListVc2.add(new VertexCell(va31, CAP));
		adjListVc2.add(new VertexCell(va41, CAP));
		adjListVc2.add(new VertexCell(va11n, CAP));
		adjListVc2.add(new VertexCell(va21n, CAP));

		adjListVc3.add(new VertexCell(va12, CAP));
		adjListVc3.add(new VertexCell(va22, CAP));
		adjListVc3.add(new VertexCell(va32, CAP));
		adjListVc3.add(new VertexCell(va42, CAP));
		adjListVc3.add(new VertexCell(va12n, CAP));
		adjListVc3.add(new VertexCell(va22n, CAP));

		adjListVc4.add(new VertexCell(va12, CAP));
		adjListVc4.add(new VertexCell(va22, CAP));
		adjListVc4.add(new VertexCell(va32, CAP));
		adjListVc4.add(new VertexCell(va42, CAP));
		adjListVc4.add(new VertexCell(va12n, CAP));
		adjListVc4.add(new VertexCell(va22n, CAP));
		
		adjListS1n.add(new VertexCell(ve11n, CAP));
		adjListS2n.add(new VertexCell(ve11n, CAP));
		adjListS3n.add(new VertexCell(ve12n, CAP));
		adjListS4n.add(new VertexCell(ve12n, CAP));
		
		adjListT1n.add(new VertexCell(ve21n, CAP));
		adjListT2n.add(new VertexCell(ve21n, CAP));
		adjListT3n.add(new VertexCell(ve22n, CAP));
		adjListT4n.add(new VertexCell(ve22n, CAP));
		
		adjListVe11n.add(new VertexCell(s1n, CAP));
		adjListVe11n.add(new VertexCell(s2n, CAP));
		adjListVe11n.add(new VertexCell(va11n, CAP));
		adjListVe11n.add(new VertexCell(va12n, CAP));
		
		adjListVe12n.add(new VertexCell(s3n, CAP));
		adjListVe12n.add(new VertexCell(s4n, CAP));
		adjListVe12n.add(new VertexCell(va11n, CAP));
		adjListVe12n.add(new VertexCell(va12n, CAP));
		
		adjListVa11n.add(new VertexCell(ve11n, CAP));
		adjListVa11n.add(new VertexCell(ve12n, CAP));
		adjListVa11n.add(new VertexCell(vc1, CAP));
		adjListVa11n.add(new VertexCell(vc2, CAP));

		adjListVa12n.add(new VertexCell(ve11n, CAP));
		adjListVa12n.add(new VertexCell(ve12n, CAP));
		adjListVa12n.add(new VertexCell(vc3, CAP));
		adjListVa12n.add(new VertexCell(vc4, CAP));
		
		adjListVe21n.add(new VertexCell(t1n, CAP));
		adjListVe21n.add(new VertexCell(t2n, CAP));
		adjListVe21n.add(new VertexCell(va21n, CAP));
		adjListVe21n.add(new VertexCell(va22n, CAP));
		
		adjListVe22n.add(new VertexCell(t3n, CAP));
		adjListVe22n.add(new VertexCell(t4n, CAP));
		adjListVe22n.add(new VertexCell(va21n, CAP));
		adjListVe22n.add(new VertexCell(va22n, CAP));
		
		adjListVa21n.add(new VertexCell(ve21n, CAP));
		adjListVa21n.add(new VertexCell(ve22n, CAP));
		adjListVa21n.add(new VertexCell(vc1, CAP));
		adjListVa21n.add(new VertexCell(vc2, CAP));

		adjListVa22n.add(new VertexCell(ve21n, CAP));
		adjListVa22n.add(new VertexCell(ve22n, CAP));
		adjListVa22n.add(new VertexCell(vc3, CAP));
		adjListVa22n.add(new VertexCell(vc4, CAP));
		
		Graph g = new Graph(vertices, adjListS1, adjListS2, adjListS3, adjListS4, adjListS5, adjListS6, adjListS7, adjListS8,
				                      adjListT1, adjListT2, adjListT3, adjListT4, adjListT5, adjListT6, adjListT7, adjListT8,
				                      adjListVe11, adjListVe12, adjListVa11, adjListVa12,
				                      adjListVe21, adjListVe22, adjListVa21, adjListVa22,
				                      adjListVe31, adjListVe32, adjListVa31, adjListVa32,
				                      adjListVe41, adjListVe42, adjListVa41, adjListVa42,
				                      adjListVc1, adjListVc2, adjListVc3, adjListVc4, 
				                      adjListS1n, adjListS2n, adjListS3n, adjListS4n, adjListT1n, adjListT2n, adjListT3n, adjListT4n,
				                      adjListVe11n, adjListVe12n, adjListVa11n, adjListVa12n, adjListVe21n, adjListVe22n, adjListVa21n, adjListVa22n);
		assertTrue(g.getNumberOfEdges() == (16+8)*3 * 2);

		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(s1);
		sources.add(s2);
		sources.add(s3);
		sources.add(s4);
		sources.add(s5);
		sources.add(s6);
		sources.add(s7);
		sources.add(s8);
		sources.add(s1n);
		sources.add(s2n);
		sources.add(s3n);
		sources.add(s4n);
		
		sinks.add(t1);
		sinks.add(t2);
		sinks.add(t3);
		sinks.add(t4);
		sinks.add(t5);
		sinks.add(t6);
		sinks.add(t7);
		sinks.add(t8);
		sinks.add(t1n);
		sinks.add(t2n);
		sinks.add(t3n);
		sinks.add(t4n);
		double[] demands = new double[8+4];
		demands[0] = 1 * 10*8*10;
		demands[1] = 2 * 10*8*10;
		demands[2] = 3 * 10*8*10;
		demands[3] = 4 * 10*8*10;
		demands[4] = 5 * 10*8*10;
		demands[5] = 6 * 10*8*10;
		demands[6] = 7 * 10*8*10;
		demands[7] = 8 * 10*8*10;
		demands[8] = 1 * 10*8*10;
		demands[9] = 2 * 10*8*10;
		demands[10] = 3 * 10*8*10;
		demands[11] = 4 * 10*8*10;
		
		//System.out.println("MCF max flow time minimization for the Fat Tree (k=4)");
		g.MCFMinFlowTimeObj(sources, sinks, demands);
		List<Edge> edges = g.getEdges();

		//for(Edge e: edges)
		//	System.out.println(e.toString());
		
		double minFlow = 0.625;
		assertTrue(Math.abs(edges.get(0).getFlow(0) - minFlow) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(1) - minFlow*2) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(2) - minFlow*3) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(3) - minFlow*4) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(4) - minFlow*5) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(5) - minFlow*6) < 1e-6);
		assertTrue(Math.abs(edges.get(6).getFlow(6) - minFlow*7) < 1e-6);
		assertTrue(Math.abs(edges.get(7).getFlow(7) - minFlow*8) < 1e-6);
	}*/
	
	//@Test
	/*
	 * The test for concurrent MCF with full 24-leaves fat tree topology
	 */
	/*public void testMCFMinFlowTimeFatTree32() {
		Vertex s1 = new Vertex(1);
		Vertex s2 = new Vertex(2);
		Vertex s3 = new Vertex(3);
		Vertex s4 = new Vertex(4);
		Vertex s5 = new Vertex(5);
		Vertex s6 = new Vertex(6);
		Vertex s7 = new Vertex(7);
		Vertex s8 = new Vertex(8);
		
		Vertex t1 = new Vertex(9);
		Vertex t2 = new Vertex(10);
		Vertex t3 = new Vertex(11);
		Vertex t4 = new Vertex(12);
		Vertex t5 = new Vertex(13);
		Vertex t6 = new Vertex(14);
		Vertex t7 = new Vertex(15);
		Vertex t8 = new Vertex(16);
		
		Vertex s1n = new Vertex(37);
		Vertex s2n = new Vertex(38);
		Vertex s3n = new Vertex(39);
		Vertex s4n = new Vertex(40);
		Vertex t1n = new Vertex(41);
		Vertex t2n = new Vertex(42);
		Vertex t3n = new Vertex(43);
		Vertex t4n = new Vertex(44);
		Vertex ve11n = new Vertex(45);
		Vertex ve12n = new Vertex(46);
		Vertex va11n = new Vertex(47);
		Vertex va12n = new Vertex(48);
		Vertex ve21n = new Vertex(49);
		Vertex ve22n = new Vertex(50);
		Vertex va21n = new Vertex(51);
		Vertex va22n = new Vertex(52);
		
		Vertex s1m = new Vertex(53);
		Vertex s2m = new Vertex(54);
		Vertex s3m = new Vertex(55);
		Vertex s4m = new Vertex(56);
		Vertex t1m = new Vertex(57);
		Vertex t2m = new Vertex(58);
		Vertex t3m = new Vertex(59);
		Vertex t4m = new Vertex(60);
		Vertex ve11m = new Vertex(61);
		Vertex ve12m = new Vertex(62);
		Vertex va11m = new Vertex(63);
		Vertex va12m = new Vertex(64);
		Vertex ve21m = new Vertex(65);
		Vertex ve22m = new Vertex(66);
		Vertex va21m = new Vertex(67);
		Vertex va22m = new Vertex(68);
		
		//pod1
		Vertex ve11 = new Vertex(17);
		Vertex ve12 = new Vertex(18);
		Vertex va11 = new Vertex(19);
		Vertex va12 = new Vertex(20);

		//pod2
		Vertex ve21 = new Vertex(21);
		Vertex ve22 = new Vertex(22);
		Vertex va21 = new Vertex(23);
		Vertex va22 = new Vertex(24);
		
		//pod3
		Vertex ve31 = new Vertex(25);
		Vertex ve32 = new Vertex(26);
		Vertex va31 = new Vertex(27);
		Vertex va32 = new Vertex(28);
		
		//pod4
		Vertex ve41 = new Vertex(29);
		Vertex ve42 = new Vertex(30);
		Vertex va41 = new Vertex(31);
		Vertex va42 = new Vertex(32);
		
		//core
		Vertex vc1 = new Vertex(33);
		Vertex vc2 = new Vertex(34);
		Vertex vc3 = new Vertex(35);
		Vertex vc4 = new Vertex(36);
		
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(s1);
		vertices.add(s2);
		vertices.add(s3);
		vertices.add(s4);
		vertices.add(s5);
		vertices.add(s6);
		vertices.add(s7);
		vertices.add(s8);
		
		vertices.add(t1);
		vertices.add(t2);
		vertices.add(t3);
		vertices.add(t4);
		vertices.add(t5);
		vertices.add(t6);
		vertices.add(t7);
		vertices.add(t8);
		
		vertices.add(ve11);
		vertices.add(ve12);
		vertices.add(va11);
		vertices.add(va12);

		vertices.add(ve21);
		vertices.add(ve22);
		vertices.add(va21);
		vertices.add(va22);

		vertices.add(ve31);
		vertices.add(ve32);
		vertices.add(va31);
		vertices.add(va32);
		
		vertices.add(ve41);
		vertices.add(ve42);
		vertices.add(va41);
		vertices.add(va42);
		
		vertices.add(vc1);
		vertices.add(vc2);
		vertices.add(vc3);
		vertices.add(vc4);
		
		vertices.add(s1n);
		vertices.add(s2n);
		vertices.add(s3n);
		vertices.add(s4n);
		vertices.add(t1n);
		vertices.add(t2n);
		vertices.add(t3n);
		vertices.add(t4n);
		vertices.add(ve11n);
		vertices.add(ve12n);
		vertices.add(va11n);
		vertices.add(va12n);
		vertices.add(ve21n);
		vertices.add(ve22n);
		vertices.add(va21n);
		vertices.add(va22n);
		
		vertices.add(s1m);
		vertices.add(s2m);
		vertices.add(s3m);
		vertices.add(s4m);
		vertices.add(t1m);
		vertices.add(t2m);
		vertices.add(t3m);
		vertices.add(t4m);
		vertices.add(ve11m);
		vertices.add(ve12m);
		vertices.add(va11m);
		vertices.add(va12m);
		vertices.add(ve21m);
		vertices.add(ve22m);
		vertices.add(va21m);
		vertices.add(va22m);
		
		
		List<VertexCell> adjListS1 = new LinkedList<VertexCell>();	//for s1
		List<VertexCell> adjListS2 = new LinkedList<VertexCell>();	//for s2
		List<VertexCell> adjListS3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS4 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS5 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS6 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS7 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS8 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListT1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT4 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT5 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT6 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT7 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT8 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe11 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe12 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa11 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa12 = new LinkedList<VertexCell>(); 

		List<VertexCell> adjListVe21 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe22 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa21 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa22 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe31 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe32 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa31 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa32 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe41 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe42 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa41 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa42 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVc1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc4 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListS1n = new LinkedList<VertexCell>();
		List<VertexCell> adjListS2n = new LinkedList<VertexCell>();
		List<VertexCell> adjListS3n = new LinkedList<VertexCell>();
		List<VertexCell> adjListS4n = new LinkedList<VertexCell>();
		List<VertexCell> adjListT1n = new LinkedList<VertexCell>();
		List<VertexCell> adjListT2n = new LinkedList<VertexCell>();
		List<VertexCell> adjListT3n = new LinkedList<VertexCell>();
		List<VertexCell> adjListT4n = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe11n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe12n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa11n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa12n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe21n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe22n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa21n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa22n = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListS1m = new LinkedList<VertexCell>();
		List<VertexCell> adjListS2m = new LinkedList<VertexCell>();
		List<VertexCell> adjListS3m = new LinkedList<VertexCell>();
		List<VertexCell> adjListS4m = new LinkedList<VertexCell>();
		List<VertexCell> adjListT1m = new LinkedList<VertexCell>();
		List<VertexCell> adjListT2m = new LinkedList<VertexCell>();
		List<VertexCell> adjListT3m = new LinkedList<VertexCell>();
		List<VertexCell> adjListT4m = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe11m = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe12m = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa11m = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa12m = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe21m = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe22m = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa21m = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa22m = new LinkedList<VertexCell>();
		
		double CAP = 5;
		adjListS1.add(new VertexCell(ve11, CAP));
		adjListS2.add(new VertexCell(ve11, CAP));
		adjListS3.add(new VertexCell(ve21, CAP));
		adjListS4.add(new VertexCell(ve31, CAP));
		adjListS5.add(new VertexCell(ve41, CAP));
		adjListS6.add(new VertexCell(ve32, CAP));
		adjListS7.add(new VertexCell(ve22, CAP));
		adjListS8.add(new VertexCell(ve12, CAP));
		
		adjListT1.add(new VertexCell(ve12, CAP));
		adjListT2.add(new VertexCell(ve42, CAP));
		adjListT3.add(new VertexCell(ve31, CAP));
		adjListT4.add(new VertexCell(ve21, CAP));
		adjListT5.add(new VertexCell(ve22, CAP));
		adjListT6.add(new VertexCell(ve41, CAP));
		adjListT7.add(new VertexCell(ve32, CAP));
		adjListT8.add(new VertexCell(ve42, CAP));
		
		//POD 1
		adjListVe11.add(new VertexCell(s1, CAP));
		adjListVe11.add(new VertexCell(s2, CAP));
		adjListVe11.add(new VertexCell(va11, CAP));
		adjListVe11.add(new VertexCell(va12, CAP));
		
		adjListVe12.add(new VertexCell(t1, CAP));
		adjListVe12.add(new VertexCell(s8, CAP));
		adjListVe12.add(new VertexCell(va11, CAP));
		adjListVe12.add(new VertexCell(va12, CAP));

		adjListVa11.add(new VertexCell(vc1, CAP));
		adjListVa11.add(new VertexCell(vc2, CAP));
		adjListVa11.add(new VertexCell(ve11, CAP));
		adjListVa11.add(new VertexCell(ve12, CAP));

		adjListVa12.add(new VertexCell(vc3, CAP));
		adjListVa12.add(new VertexCell(vc4, CAP));
		adjListVa12.add(new VertexCell(ve11, CAP));
		adjListVa12.add(new VertexCell(ve12, CAP));

		//POD 2
		adjListVe21.add(new VertexCell(s3, CAP));
		adjListVe21.add(new VertexCell(t4, CAP));
		adjListVe21.add(new VertexCell(va21, CAP));
		adjListVe21.add(new VertexCell(va22, CAP));
		
		adjListVe22.add(new VertexCell(s7, CAP));
		adjListVe22.add(new VertexCell(t5, CAP));
		adjListVe22.add(new VertexCell(va21, CAP));
		adjListVe22.add(new VertexCell(va22, CAP));

		adjListVa21.add(new VertexCell(vc1, CAP));
		adjListVa21.add(new VertexCell(vc2, CAP));
		adjListVa21.add(new VertexCell(ve21, CAP));
		adjListVa21.add(new VertexCell(ve22, CAP));

		adjListVa22.add(new VertexCell(vc3, CAP));
		adjListVa22.add(new VertexCell(vc4, CAP));
		adjListVa22.add(new VertexCell(ve21, CAP));
		adjListVa22.add(new VertexCell(ve22, CAP));
		
		//POD 3
		adjListVe31.add(new VertexCell(s4, CAP));
		adjListVe31.add(new VertexCell(t3, CAP));
		adjListVe31.add(new VertexCell(va31, CAP));
		adjListVe31.add(new VertexCell(va32, CAP));
		
		adjListVe32.add(new VertexCell(t7, CAP));
		adjListVe32.add(new VertexCell(s6, CAP));
		adjListVe32.add(new VertexCell(va31, CAP));
		adjListVe32.add(new VertexCell(va32, CAP));

		adjListVa31.add(new VertexCell(vc1, CAP));
		adjListVa31.add(new VertexCell(vc2, CAP));
		adjListVa31.add(new VertexCell(ve31, CAP));
		adjListVa31.add(new VertexCell(ve32, CAP));

		adjListVa32.add(new VertexCell(vc3, CAP));
		adjListVa32.add(new VertexCell(vc4, CAP));
		adjListVa32.add(new VertexCell(ve31, CAP));
		adjListVa32.add(new VertexCell(ve32, CAP));

		//POD 4
		adjListVe41.add(new VertexCell(t6, CAP));
		adjListVe41.add(new VertexCell(s5, CAP));
		adjListVe41.add(new VertexCell(va41, CAP));
		adjListVe41.add(new VertexCell(va42, CAP));
		
		adjListVe42.add(new VertexCell(t8, CAP));
		adjListVe42.add(new VertexCell(t2, CAP));
		adjListVe42.add(new VertexCell(va41, CAP));
		adjListVe42.add(new VertexCell(va42, CAP));

		adjListVa41.add(new VertexCell(vc1, CAP));
		adjListVa41.add(new VertexCell(vc2, CAP));
		adjListVa41.add(new VertexCell(ve41, CAP));
		adjListVa41.add(new VertexCell(ve42, CAP));

		adjListVa42.add(new VertexCell(vc3, CAP));
		adjListVa42.add(new VertexCell(vc4, CAP));
		adjListVa42.add(new VertexCell(ve41, CAP));
		adjListVa42.add(new VertexCell(ve42, CAP));
		
		//Cores
		adjListVc1.add(new VertexCell(va11, CAP));
		adjListVc1.add(new VertexCell(va21, CAP));
		adjListVc1.add(new VertexCell(va31, CAP));
		adjListVc1.add(new VertexCell(va41, CAP));
		adjListVc1.add(new VertexCell(va11n, CAP));
		adjListVc1.add(new VertexCell(va21n, CAP));
		adjListVc1.add(new VertexCell(va11m, CAP));
		adjListVc1.add(new VertexCell(va21m, CAP));
		
		adjListVc2.add(new VertexCell(va11, CAP));
		adjListVc2.add(new VertexCell(va21, CAP));
		adjListVc2.add(new VertexCell(va31, CAP));
		adjListVc2.add(new VertexCell(va41, CAP));
		adjListVc2.add(new VertexCell(va11n, CAP));
		adjListVc2.add(new VertexCell(va21n, CAP));
		adjListVc2.add(new VertexCell(va11m, CAP));
		adjListVc2.add(new VertexCell(va21m, CAP));

		adjListVc3.add(new VertexCell(va12, CAP));
		adjListVc3.add(new VertexCell(va22, CAP));
		adjListVc3.add(new VertexCell(va32, CAP));
		adjListVc3.add(new VertexCell(va42, CAP));
		adjListVc3.add(new VertexCell(va12n, CAP));
		adjListVc3.add(new VertexCell(va22n, CAP));
		adjListVc3.add(new VertexCell(va12m, CAP));
		adjListVc3.add(new VertexCell(va22m, CAP));

		adjListVc4.add(new VertexCell(va12, CAP));
		adjListVc4.add(new VertexCell(va22, CAP));
		adjListVc4.add(new VertexCell(va32, CAP));
		adjListVc4.add(new VertexCell(va42, CAP));
		adjListVc4.add(new VertexCell(va12n, CAP));
		adjListVc4.add(new VertexCell(va22n, CAP));
		adjListVc4.add(new VertexCell(va12m, CAP));
		adjListVc4.add(new VertexCell(va22m, CAP));
		
		
		
		adjListS1n.add(new VertexCell(ve11n, CAP));
		adjListS2n.add(new VertexCell(ve11n, CAP));
		adjListS3n.add(new VertexCell(ve12n, CAP));
		adjListS4n.add(new VertexCell(ve12n, CAP));
		
		adjListT1n.add(new VertexCell(ve21n, CAP));
		adjListT2n.add(new VertexCell(ve21n, CAP));
		adjListT3n.add(new VertexCell(ve22n, CAP));
		adjListT4n.add(new VertexCell(ve22n, CAP));
		
		adjListVe11n.add(new VertexCell(s1n, CAP));
		adjListVe11n.add(new VertexCell(s2n, CAP));
		adjListVe11n.add(new VertexCell(va11n, CAP));
		adjListVe11n.add(new VertexCell(va12n, CAP));
		
		adjListVe12n.add(new VertexCell(s3n, CAP));
		adjListVe12n.add(new VertexCell(s4n, CAP));
		adjListVe12n.add(new VertexCell(va11n, CAP));
		adjListVe12n.add(new VertexCell(va12n, CAP));
		
		adjListVa11n.add(new VertexCell(ve11n, CAP));
		adjListVa11n.add(new VertexCell(ve12n, CAP));
		adjListVa11n.add(new VertexCell(vc1, CAP));
		adjListVa11n.add(new VertexCell(vc2, CAP));

		adjListVa12n.add(new VertexCell(ve11n, CAP));
		adjListVa12n.add(new VertexCell(ve12n, CAP));
		adjListVa12n.add(new VertexCell(vc3, CAP));
		adjListVa12n.add(new VertexCell(vc4, CAP));
		
		adjListVe21n.add(new VertexCell(t1n, CAP));
		adjListVe21n.add(new VertexCell(t2n, CAP));
		adjListVe21n.add(new VertexCell(va21n, CAP));
		adjListVe21n.add(new VertexCell(va22n, CAP));
		
		adjListVe22n.add(new VertexCell(t3n, CAP));
		adjListVe22n.add(new VertexCell(t4n, CAP));
		adjListVe22n.add(new VertexCell(va21n, CAP));
		adjListVe22n.add(new VertexCell(va22n, CAP));
		
		adjListVa21n.add(new VertexCell(ve21n, CAP));
		adjListVa21n.add(new VertexCell(ve22n, CAP));
		adjListVa21n.add(new VertexCell(vc1, CAP));
		adjListVa21n.add(new VertexCell(vc2, CAP));

		adjListVa22n.add(new VertexCell(ve21n, CAP));
		adjListVa22n.add(new VertexCell(ve22n, CAP));
		adjListVa22n.add(new VertexCell(vc3, CAP));
		adjListVa22n.add(new VertexCell(vc4, CAP));
		
		adjListS1m.add(new VertexCell(ve11m, CAP));
		adjListS2m.add(new VertexCell(ve11m, CAP));
		adjListS3m.add(new VertexCell(ve12m, CAP));
		adjListS4m.add(new VertexCell(ve12m, CAP));
		
		adjListT1m.add(new VertexCell(ve21m, CAP));
		adjListT2m.add(new VertexCell(ve21m, CAP));
		adjListT3m.add(new VertexCell(ve22m, CAP));
		adjListT4m.add(new VertexCell(ve22m, CAP));
		
		adjListVe11m.add(new VertexCell(s1m, CAP));
		adjListVe11m.add(new VertexCell(s2m, CAP));
		adjListVe11m.add(new VertexCell(va11m, CAP));
		adjListVe11m.add(new VertexCell(va12m, CAP));
		
		adjListVe12m.add(new VertexCell(s3m, CAP));
		adjListVe12m.add(new VertexCell(s4m, CAP));
		adjListVe12m.add(new VertexCell(va11m, CAP));
		adjListVe12m.add(new VertexCell(va12m, CAP));
		
		adjListVa11m.add(new VertexCell(ve11m, CAP));
		adjListVa11m.add(new VertexCell(ve12m, CAP));
		adjListVa11m.add(new VertexCell(vc1, CAP));
		adjListVa11m.add(new VertexCell(vc2, CAP));

		adjListVa12m.add(new VertexCell(ve11m, CAP));
		adjListVa12m.add(new VertexCell(ve12m, CAP));
		adjListVa12m.add(new VertexCell(vc3, CAP));
		adjListVa12m.add(new VertexCell(vc4, CAP));
		
		adjListVe21m.add(new VertexCell(t1m, CAP));
		adjListVe21m.add(new VertexCell(t2m, CAP));
		adjListVe21m.add(new VertexCell(va21m, CAP));
		adjListVe21m.add(new VertexCell(va22m, CAP));
		
		adjListVe22m.add(new VertexCell(t3m, CAP));
		adjListVe22m.add(new VertexCell(t4m, CAP));
		adjListVe22m.add(new VertexCell(va21m, CAP));
		adjListVe22m.add(new VertexCell(va22m, CAP));
		
		adjListVa21m.add(new VertexCell(ve21m, CAP));
		adjListVa21m.add(new VertexCell(ve22m, CAP));
		adjListVa21m.add(new VertexCell(vc1, CAP));
		adjListVa21m.add(new VertexCell(vc2, CAP));

		adjListVa22m.add(new VertexCell(ve21m, CAP));
		adjListVa22m.add(new VertexCell(ve22m, CAP));
		adjListVa22m.add(new VertexCell(vc3, CAP));
		adjListVa22m.add(new VertexCell(vc4, CAP));
		
		Graph g = new Graph(vertices, adjListS1, adjListS2, adjListS3, adjListS4, adjListS5, adjListS6, adjListS7, adjListS8,
				                      adjListT1, adjListT2, adjListT3, adjListT4, adjListT5, adjListT6, adjListT7, adjListT8,
				                      adjListVe11, adjListVe12, adjListVa11, adjListVa12,
				                      adjListVe21, adjListVe22, adjListVa21, adjListVa22,
				                      adjListVe31, adjListVe32, adjListVa31, adjListVa32,
				                      adjListVe41, adjListVe42, adjListVa41, adjListVa42,
				                      adjListVc1, adjListVc2, adjListVc3, adjListVc4, 
				                      adjListS1n, adjListS2n, adjListS3n, adjListS4n, adjListT1n, adjListT2n, adjListT3n, adjListT4n,
				                      adjListVe11n, adjListVe12n, adjListVa11n, adjListVa12n, adjListVe21n, adjListVe22n, adjListVa21n, adjListVa22n,
				                      adjListS1m, adjListS2m, adjListS3m, adjListS4m, adjListT1m, adjListT2m, adjListT3m, adjListT4m,
				                      adjListVe11m, adjListVe12m, adjListVa11m, adjListVa12m, adjListVe21m, adjListVe22m, adjListVa21m, adjListVa22m);
		assertTrue(g.getNumberOfEdges() == (16+8 + 8)*3 * 2);

		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(s1);
		sources.add(s2);
		sources.add(s3);
		sources.add(s4);
		sources.add(s5);
		sources.add(s6);
		sources.add(s7);
		sources.add(s8);
		sources.add(s1n);
		sources.add(s2n);
		sources.add(s3n);
		sources.add(s4n);
		sources.add(s1m);
		sources.add(s2m);
		sources.add(s3m);
		sources.add(s4m);
		
		sinks.add(t1);
		sinks.add(t2);
		sinks.add(t3);
		sinks.add(t4);
		sinks.add(t5);
		sinks.add(t6);
		sinks.add(t7);
		sinks.add(t8);
		sinks.add(t1n);
		sinks.add(t2n);
		sinks.add(t3n);
		sinks.add(t4n);
		sinks.add(t1m);
		sinks.add(t2m);
		sinks.add(t3m);
		sinks.add(t4m);
		double[] demands = new double[8+4 + 4];
		demands[0] = 1 * 10*8*10;
		demands[1] = 2 * 10*8*10;
		demands[2] = 3 * 10*8*10;
		demands[3] = 4 * 10*8*10;
		demands[4] = 5 * 10*8*10;
		demands[5] = 6 * 10*8*10;
		demands[6] = 7 * 10*8*10;
		demands[7] = 8 * 10*8*10;
		demands[8] = 1 * 10*8*10;
		demands[9] = 2 * 10*8*10;
		demands[10] = 3 * 10*8*10;
		demands[11] = 4 * 10*8*10;
		demands[12] = 1 * 10*8*10;
		demands[13] = 2 * 10*8*10;
		demands[14] = 3 * 10*8*10;
		demands[15] = 4 * 10*8*10;
		
		//System.out.println("MCF max flow time minimization for the Fat Tree (k=4)");
		g.MCFMinFlowTimeObj(sources, sinks, demands);
		List<Edge> edges = g.getEdges();

		//for(Edge e: edges)
		//	System.out.println(e.toString());
		
		double minFlow = 0.625;
		assertTrue(Math.abs(edges.get(0).getFlow(0) - minFlow) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(1) - minFlow*2) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(2) - minFlow*3) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(3) - minFlow*4) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(4) - minFlow*5) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(5) - minFlow*6) < 1e-6);
		assertTrue(Math.abs(edges.get(6).getFlow(6) - minFlow*7) < 1e-6);
		assertTrue(Math.abs(edges.get(7).getFlow(7) - minFlow*8) < 1e-6);
	}
	*/
	//@Test
	/*
	 * The test for concurrent MCF with full 40-leaves fat tree topology
	 */
	/*public void testMCFMinFlowTimeFatTree40() {
		Vertex s1 = new Vertex(1);
		Vertex s2 = new Vertex(2);
		Vertex s3 = new Vertex(3);
		Vertex s4 = new Vertex(4);
		Vertex s5 = new Vertex(5);
		Vertex s6 = new Vertex(6);
		Vertex s7 = new Vertex(7);
		Vertex s8 = new Vertex(8);
		
		Vertex t1 = new Vertex(9);
		Vertex t2 = new Vertex(10);
		Vertex t3 = new Vertex(11);
		Vertex t4 = new Vertex(12);
		Vertex t5 = new Vertex(13);
		Vertex t6 = new Vertex(14);
		Vertex t7 = new Vertex(15);
		Vertex t8 = new Vertex(16);
		
		Vertex s1n = new Vertex(37);
		Vertex s2n = new Vertex(38);
		Vertex s3n = new Vertex(39);
		Vertex s4n = new Vertex(40);
		Vertex t1n = new Vertex(41);
		Vertex t2n = new Vertex(42);
		Vertex t3n = new Vertex(43);
		Vertex t4n = new Vertex(44);
		Vertex ve11n = new Vertex(45);
		Vertex ve12n = new Vertex(46);
		Vertex va11n = new Vertex(47);
		Vertex va12n = new Vertex(48);
		Vertex ve21n = new Vertex(49);
		Vertex ve22n = new Vertex(50);
		Vertex va21n = new Vertex(51);
		Vertex va22n = new Vertex(52);
		
		Vertex s1m = new Vertex(53);
		Vertex s2m = new Vertex(54);
		Vertex s3m = new Vertex(55);
		Vertex s4m = new Vertex(56);
		Vertex t1m = new Vertex(57);
		Vertex t2m = new Vertex(58);
		Vertex t3m = new Vertex(59);
		Vertex t4m = new Vertex(60);
		Vertex ve11m = new Vertex(61);
		Vertex ve12m = new Vertex(62);
		Vertex va11m = new Vertex(63);
		Vertex va12m = new Vertex(64);
		Vertex ve21m = new Vertex(65);
		Vertex ve22m = new Vertex(66);
		Vertex va21m = new Vertex(67);
		Vertex va22m = new Vertex(68);
		
		Vertex s1q = new Vertex(69);
		Vertex s2q = new Vertex(70);
		Vertex s3q = new Vertex(71);
		Vertex s4q = new Vertex(72);
		Vertex t1q = new Vertex(73);
		Vertex t2q = new Vertex(74);
		Vertex t3q = new Vertex(75);
		Vertex t4q = new Vertex(76);
		Vertex ve11q = new Vertex(77);
		Vertex ve12q = new Vertex(78);
		Vertex va11q = new Vertex(79);
		Vertex va12q = new Vertex(80);
		Vertex ve21q = new Vertex(81);
		Vertex ve22q = new Vertex(82);
		Vertex va21q = new Vertex(83);
		Vertex va22q = new Vertex(84);
		
		//pod1
		Vertex ve11 = new Vertex(17);
		Vertex ve12 = new Vertex(18);
		Vertex va11 = new Vertex(19);
		Vertex va12 = new Vertex(20);

		//pod2
		Vertex ve21 = new Vertex(21);
		Vertex ve22 = new Vertex(22);
		Vertex va21 = new Vertex(23);
		Vertex va22 = new Vertex(24);
		
		//pod3
		Vertex ve31 = new Vertex(25);
		Vertex ve32 = new Vertex(26);
		Vertex va31 = new Vertex(27);
		Vertex va32 = new Vertex(28);
		
		//pod4
		Vertex ve41 = new Vertex(29);
		Vertex ve42 = new Vertex(30);
		Vertex va41 = new Vertex(31);
		Vertex va42 = new Vertex(32);
		
		//core
		Vertex vc1 = new Vertex(33);
		Vertex vc2 = new Vertex(34);
		Vertex vc3 = new Vertex(35);
		Vertex vc4 = new Vertex(36);
		
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(s1);
		vertices.add(s2);
		vertices.add(s3);
		vertices.add(s4);
		vertices.add(s5);
		vertices.add(s6);
		vertices.add(s7);
		vertices.add(s8);
		
		vertices.add(t1);
		vertices.add(t2);
		vertices.add(t3);
		vertices.add(t4);
		vertices.add(t5);
		vertices.add(t6);
		vertices.add(t7);
		vertices.add(t8);
		
		vertices.add(ve11);
		vertices.add(ve12);
		vertices.add(va11);
		vertices.add(va12);

		vertices.add(ve21);
		vertices.add(ve22);
		vertices.add(va21);
		vertices.add(va22);

		vertices.add(ve31);
		vertices.add(ve32);
		vertices.add(va31);
		vertices.add(va32);
		
		vertices.add(ve41);
		vertices.add(ve42);
		vertices.add(va41);
		vertices.add(va42);
		
		vertices.add(vc1);
		vertices.add(vc2);
		vertices.add(vc3);
		vertices.add(vc4);
		
		vertices.add(s1n);
		vertices.add(s2n);
		vertices.add(s3n);
		vertices.add(s4n);
		vertices.add(t1n);
		vertices.add(t2n);
		vertices.add(t3n);
		vertices.add(t4n);
		vertices.add(ve11n);
		vertices.add(ve12n);
		vertices.add(va11n);
		vertices.add(va12n);
		vertices.add(ve21n);
		vertices.add(ve22n);
		vertices.add(va21n);
		vertices.add(va22n);
		
		vertices.add(s1m);
		vertices.add(s2m);
		vertices.add(s3m);
		vertices.add(s4m);
		vertices.add(t1m);
		vertices.add(t2m);
		vertices.add(t3m);
		vertices.add(t4m);
		vertices.add(ve11m);
		vertices.add(ve12m);
		vertices.add(va11m);
		vertices.add(va12m);
		vertices.add(ve21m);
		vertices.add(ve22m);
		vertices.add(va21m);
		vertices.add(va22m);
		
		vertices.add(s1q);
		vertices.add(s2q);
		vertices.add(s3q);
		vertices.add(s4q);
		vertices.add(t1q);
		vertices.add(t2q);
		vertices.add(t3q);
		vertices.add(t4q);
		vertices.add(ve11q);
		vertices.add(ve12q);
		vertices.add(va11q);
		vertices.add(va12q);
		vertices.add(ve21q);
		vertices.add(ve22q);
		vertices.add(va21q);
		vertices.add(va22q);
		
		
		List<VertexCell> adjListS1 = new LinkedList<VertexCell>();	//for s1
		List<VertexCell> adjListS2 = new LinkedList<VertexCell>();	//for s2
		List<VertexCell> adjListS3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS4 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS5 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS6 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS7 = new LinkedList<VertexCell>();
		List<VertexCell> adjListS8 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListT1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT4 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT5 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT6 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT7 = new LinkedList<VertexCell>();
		List<VertexCell> adjListT8 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe11 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe12 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa11 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa12 = new LinkedList<VertexCell>(); 

		List<VertexCell> adjListVe21 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe22 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa21 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa22 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe31 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe32 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa31 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa32 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe41 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe42 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa41 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa42 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVc1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc4 = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListS1n = new LinkedList<VertexCell>();
		List<VertexCell> adjListS2n = new LinkedList<VertexCell>();
		List<VertexCell> adjListS3n = new LinkedList<VertexCell>();
		List<VertexCell> adjListS4n = new LinkedList<VertexCell>();
		List<VertexCell> adjListT1n = new LinkedList<VertexCell>();
		List<VertexCell> adjListT2n = new LinkedList<VertexCell>();
		List<VertexCell> adjListT3n = new LinkedList<VertexCell>();
		List<VertexCell> adjListT4n = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe11n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe12n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa11n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa12n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe21n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe22n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa21n = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa22n = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListS1m = new LinkedList<VertexCell>();
		List<VertexCell> adjListS2m = new LinkedList<VertexCell>();
		List<VertexCell> adjListS3m = new LinkedList<VertexCell>();
		List<VertexCell> adjListS4m = new LinkedList<VertexCell>();
		List<VertexCell> adjListT1m = new LinkedList<VertexCell>();
		List<VertexCell> adjListT2m = new LinkedList<VertexCell>();
		List<VertexCell> adjListT3m = new LinkedList<VertexCell>();
		List<VertexCell> adjListT4m = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe11m = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe12m = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa11m = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa12m = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe21m = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe22m = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa21m = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa22m = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListS1q = new LinkedList<VertexCell>();
		List<VertexCell> adjListS2q = new LinkedList<VertexCell>();
		List<VertexCell> adjListS3q = new LinkedList<VertexCell>();
		List<VertexCell> adjListS4q = new LinkedList<VertexCell>();
		List<VertexCell> adjListT1q = new LinkedList<VertexCell>();
		List<VertexCell> adjListT2q = new LinkedList<VertexCell>();
		List<VertexCell> adjListT3q = new LinkedList<VertexCell>();
		List<VertexCell> adjListT4q = new LinkedList<VertexCell>();
		
		List<VertexCell> adjListVe11q = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe12q = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa11q = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa12q = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe21q = new LinkedList<VertexCell>();
		List<VertexCell> adjListVe22q = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa21q = new LinkedList<VertexCell>();
		List<VertexCell> adjListVa22q = new LinkedList<VertexCell>();
		
		double CAP = 5;
		adjListS1.add(new VertexCell(ve11, CAP));
		adjListS2.add(new VertexCell(ve11, CAP));
		adjListS3.add(new VertexCell(ve21, CAP));
		adjListS4.add(new VertexCell(ve31, CAP));
		adjListS5.add(new VertexCell(ve41, CAP));
		adjListS6.add(new VertexCell(ve32, CAP));
		adjListS7.add(new VertexCell(ve22, CAP));
		adjListS8.add(new VertexCell(ve12, CAP));
		
		adjListT1.add(new VertexCell(ve12, CAP));
		adjListT2.add(new VertexCell(ve42, CAP));
		adjListT3.add(new VertexCell(ve31, CAP));
		adjListT4.add(new VertexCell(ve21, CAP));
		adjListT5.add(new VertexCell(ve22, CAP));
		adjListT6.add(new VertexCell(ve41, CAP));
		adjListT7.add(new VertexCell(ve32, CAP));
		adjListT8.add(new VertexCell(ve42, CAP));
		
		//POD 1
		adjListVe11.add(new VertexCell(s1, CAP));
		adjListVe11.add(new VertexCell(s2, CAP));
		adjListVe11.add(new VertexCell(va11, CAP));
		adjListVe11.add(new VertexCell(va12, CAP));
		
		adjListVe12.add(new VertexCell(t1, CAP));
		adjListVe12.add(new VertexCell(s8, CAP));
		adjListVe12.add(new VertexCell(va11, CAP));
		adjListVe12.add(new VertexCell(va12, CAP));

		adjListVa11.add(new VertexCell(vc1, CAP));
		adjListVa11.add(new VertexCell(vc2, CAP));
		adjListVa11.add(new VertexCell(ve11, CAP));
		adjListVa11.add(new VertexCell(ve12, CAP));

		adjListVa12.add(new VertexCell(vc3, CAP));
		adjListVa12.add(new VertexCell(vc4, CAP));
		adjListVa12.add(new VertexCell(ve11, CAP));
		adjListVa12.add(new VertexCell(ve12, CAP));

		//POD 2
		adjListVe21.add(new VertexCell(s3, CAP));
		adjListVe21.add(new VertexCell(t4, CAP));
		adjListVe21.add(new VertexCell(va21, CAP));
		adjListVe21.add(new VertexCell(va22, CAP));
		
		adjListVe22.add(new VertexCell(s7, CAP));
		adjListVe22.add(new VertexCell(t5, CAP));
		adjListVe22.add(new VertexCell(va21, CAP));
		adjListVe22.add(new VertexCell(va22, CAP));

		adjListVa21.add(new VertexCell(vc1, CAP));
		adjListVa21.add(new VertexCell(vc2, CAP));
		adjListVa21.add(new VertexCell(ve21, CAP));
		adjListVa21.add(new VertexCell(ve22, CAP));

		adjListVa22.add(new VertexCell(vc3, CAP));
		adjListVa22.add(new VertexCell(vc4, CAP));
		adjListVa22.add(new VertexCell(ve21, CAP));
		adjListVa22.add(new VertexCell(ve22, CAP));
		
		//POD 3
		adjListVe31.add(new VertexCell(s4, CAP));
		adjListVe31.add(new VertexCell(t3, CAP));
		adjListVe31.add(new VertexCell(va31, CAP));
		adjListVe31.add(new VertexCell(va32, CAP));
		
		adjListVe32.add(new VertexCell(t7, CAP));
		adjListVe32.add(new VertexCell(s6, CAP));
		adjListVe32.add(new VertexCell(va31, CAP));
		adjListVe32.add(new VertexCell(va32, CAP));

		adjListVa31.add(new VertexCell(vc1, CAP));
		adjListVa31.add(new VertexCell(vc2, CAP));
		adjListVa31.add(new VertexCell(ve31, CAP));
		adjListVa31.add(new VertexCell(ve32, CAP));

		adjListVa32.add(new VertexCell(vc3, CAP));
		adjListVa32.add(new VertexCell(vc4, CAP));
		adjListVa32.add(new VertexCell(ve31, CAP));
		adjListVa32.add(new VertexCell(ve32, CAP));

		//POD 4
		adjListVe41.add(new VertexCell(t6, CAP));
		adjListVe41.add(new VertexCell(s5, CAP));
		adjListVe41.add(new VertexCell(va41, CAP));
		adjListVe41.add(new VertexCell(va42, CAP));
		
		adjListVe42.add(new VertexCell(t8, CAP));
		adjListVe42.add(new VertexCell(t2, CAP));
		adjListVe42.add(new VertexCell(va41, CAP));
		adjListVe42.add(new VertexCell(va42, CAP));

		adjListVa41.add(new VertexCell(vc1, CAP));
		adjListVa41.add(new VertexCell(vc2, CAP));
		adjListVa41.add(new VertexCell(ve41, CAP));
		adjListVa41.add(new VertexCell(ve42, CAP));

		adjListVa42.add(new VertexCell(vc3, CAP));
		adjListVa42.add(new VertexCell(vc4, CAP));
		adjListVa42.add(new VertexCell(ve41, CAP));
		adjListVa42.add(new VertexCell(ve42, CAP));
		
		//Cores
		adjListVc1.add(new VertexCell(va11, CAP));
		adjListVc1.add(new VertexCell(va21, CAP));
		adjListVc1.add(new VertexCell(va31, CAP));
		adjListVc1.add(new VertexCell(va41, CAP));
		adjListVc1.add(new VertexCell(va11n, CAP));
		adjListVc1.add(new VertexCell(va21n, CAP));
		adjListVc1.add(new VertexCell(va11m, CAP));
		adjListVc1.add(new VertexCell(va21m, CAP));
		adjListVc1.add(new VertexCell(va11q, CAP));
		adjListVc1.add(new VertexCell(va21q, CAP));
		
		adjListVc2.add(new VertexCell(va11, CAP));
		adjListVc2.add(new VertexCell(va21, CAP));
		adjListVc2.add(new VertexCell(va31, CAP));
		adjListVc2.add(new VertexCell(va41, CAP));
		adjListVc2.add(new VertexCell(va11n, CAP));
		adjListVc2.add(new VertexCell(va21n, CAP));
		adjListVc2.add(new VertexCell(va11m, CAP));
		adjListVc2.add(new VertexCell(va21m, CAP));
		adjListVc1.add(new VertexCell(va11q, CAP));
		adjListVc1.add(new VertexCell(va21q, CAP));

		adjListVc3.add(new VertexCell(va12, CAP));
		adjListVc3.add(new VertexCell(va22, CAP));
		adjListVc3.add(new VertexCell(va32, CAP));
		adjListVc3.add(new VertexCell(va42, CAP));
		adjListVc3.add(new VertexCell(va12n, CAP));
		adjListVc3.add(new VertexCell(va22n, CAP));
		adjListVc3.add(new VertexCell(va12m, CAP));
		adjListVc3.add(new VertexCell(va22m, CAP));
		adjListVc3.add(new VertexCell(va12q, CAP));
		adjListVc3.add(new VertexCell(va22q, CAP));

		adjListVc4.add(new VertexCell(va12, CAP));
		adjListVc4.add(new VertexCell(va22, CAP));
		adjListVc4.add(new VertexCell(va32, CAP));
		adjListVc4.add(new VertexCell(va42, CAP));
		adjListVc4.add(new VertexCell(va12n, CAP));
		adjListVc4.add(new VertexCell(va22n, CAP));
		adjListVc4.add(new VertexCell(va12m, CAP));
		adjListVc4.add(new VertexCell(va22m, CAP));
		adjListVc3.add(new VertexCell(va12q, CAP));
		adjListVc3.add(new VertexCell(va22q, CAP));
		
		
		
		adjListS1n.add(new VertexCell(ve11n, CAP));
		adjListS2n.add(new VertexCell(ve11n, CAP));
		adjListS3n.add(new VertexCell(ve12n, CAP));
		adjListS4n.add(new VertexCell(ve12n, CAP));
		
		adjListT1n.add(new VertexCell(ve21n, CAP));
		adjListT2n.add(new VertexCell(ve21n, CAP));
		adjListT3n.add(new VertexCell(ve22n, CAP));
		adjListT4n.add(new VertexCell(ve22n, CAP));
		
		adjListVe11n.add(new VertexCell(s1n, CAP));
		adjListVe11n.add(new VertexCell(s2n, CAP));
		adjListVe11n.add(new VertexCell(va11n, CAP));
		adjListVe11n.add(new VertexCell(va12n, CAP));
		
		adjListVe12n.add(new VertexCell(s3n, CAP));
		adjListVe12n.add(new VertexCell(s4n, CAP));
		adjListVe12n.add(new VertexCell(va11n, CAP));
		adjListVe12n.add(new VertexCell(va12n, CAP));
		
		adjListVa11n.add(new VertexCell(ve11n, CAP));
		adjListVa11n.add(new VertexCell(ve12n, CAP));
		adjListVa11n.add(new VertexCell(vc1, CAP));
		adjListVa11n.add(new VertexCell(vc2, CAP));

		adjListVa12n.add(new VertexCell(ve11n, CAP));
		adjListVa12n.add(new VertexCell(ve12n, CAP));
		adjListVa12n.add(new VertexCell(vc3, CAP));
		adjListVa12n.add(new VertexCell(vc4, CAP));
		
		adjListVe21n.add(new VertexCell(t1n, CAP));
		adjListVe21n.add(new VertexCell(t2n, CAP));
		adjListVe21n.add(new VertexCell(va21n, CAP));
		adjListVe21n.add(new VertexCell(va22n, CAP));
		
		adjListVe22n.add(new VertexCell(t3n, CAP));
		adjListVe22n.add(new VertexCell(t4n, CAP));
		adjListVe22n.add(new VertexCell(va21n, CAP));
		adjListVe22n.add(new VertexCell(va22n, CAP));
		
		adjListVa21n.add(new VertexCell(ve21n, CAP));
		adjListVa21n.add(new VertexCell(ve22n, CAP));
		adjListVa21n.add(new VertexCell(vc1, CAP));
		adjListVa21n.add(new VertexCell(vc2, CAP));

		adjListVa22n.add(new VertexCell(ve21n, CAP));
		adjListVa22n.add(new VertexCell(ve22n, CAP));
		adjListVa22n.add(new VertexCell(vc3, CAP));
		adjListVa22n.add(new VertexCell(vc4, CAP));
		
		//----
		adjListS1m.add(new VertexCell(ve11m, CAP));
		adjListS2m.add(new VertexCell(ve11m, CAP));
		adjListS3m.add(new VertexCell(ve12m, CAP));
		adjListS4m.add(new VertexCell(ve12m, CAP));
		
		adjListT1m.add(new VertexCell(ve21m, CAP));
		adjListT2m.add(new VertexCell(ve21m, CAP));
		adjListT3m.add(new VertexCell(ve22m, CAP));
		adjListT4m.add(new VertexCell(ve22m, CAP));
		
		adjListVe11m.add(new VertexCell(s1m, CAP));
		adjListVe11m.add(new VertexCell(s2m, CAP));
		adjListVe11m.add(new VertexCell(va11m, CAP));
		adjListVe11m.add(new VertexCell(va12m, CAP));
		
		adjListVe12m.add(new VertexCell(s3m, CAP));
		adjListVe12m.add(new VertexCell(s4m, CAP));
		adjListVe12m.add(new VertexCell(va11m, CAP));
		adjListVe12m.add(new VertexCell(va12m, CAP));
		
		adjListVa11m.add(new VertexCell(ve11m, CAP));
		adjListVa11m.add(new VertexCell(ve12m, CAP));
		adjListVa11m.add(new VertexCell(vc1, CAP));
		adjListVa11m.add(new VertexCell(vc2, CAP));

		adjListVa12m.add(new VertexCell(ve11m, CAP));
		adjListVa12m.add(new VertexCell(ve12m, CAP));
		adjListVa12m.add(new VertexCell(vc3, CAP));
		adjListVa12m.add(new VertexCell(vc4, CAP));
		
		adjListVe21m.add(new VertexCell(t1m, CAP));
		adjListVe21m.add(new VertexCell(t2m, CAP));
		adjListVe21m.add(new VertexCell(va21m, CAP));
		adjListVe21m.add(new VertexCell(va22m, CAP));
		
		adjListVe22m.add(new VertexCell(t3m, CAP));
		adjListVe22m.add(new VertexCell(t4m, CAP));
		adjListVe22m.add(new VertexCell(va21m, CAP));
		adjListVe22m.add(new VertexCell(va22m, CAP));
		
		adjListVa21m.add(new VertexCell(ve21m, CAP));
		adjListVa21m.add(new VertexCell(ve22m, CAP));
		adjListVa21m.add(new VertexCell(vc1, CAP));
		adjListVa21m.add(new VertexCell(vc2, CAP));

		adjListVa22m.add(new VertexCell(ve21m, CAP));
		adjListVa22m.add(new VertexCell(ve22m, CAP));
		adjListVa22m.add(new VertexCell(vc3, CAP));
		adjListVa22m.add(new VertexCell(vc4, CAP));
		
		//----
				adjListS1q.add(new VertexCell(ve11q, CAP));
				adjListS2q.add(new VertexCell(ve11q, CAP));
				adjListS3q.add(new VertexCell(ve12q, CAP));
				adjListS4q.add(new VertexCell(ve12q, CAP));
				
				adjListT1q.add(new VertexCell(ve21q, CAP));
				adjListT2q.add(new VertexCell(ve21q, CAP));
				adjListT3q.add(new VertexCell(ve22q, CAP));
				adjListT4q.add(new VertexCell(ve22q, CAP));
				
				adjListVe11q.add(new VertexCell(s1q, CAP));
				adjListVe11q.add(new VertexCell(s2q, CAP));
				adjListVe11q.add(new VertexCell(va11q, CAP));
				adjListVe11q.add(new VertexCell(va12q, CAP));
				
				adjListVe12q.add(new VertexCell(s3q, CAP));
				adjListVe12q.add(new VertexCell(s4q, CAP));
				adjListVe12q.add(new VertexCell(va11q, CAP));
				adjListVe12q.add(new VertexCell(va12q, CAP));
				
				adjListVa11q.add(new VertexCell(ve11q, CAP));
				adjListVa11q.add(new VertexCell(ve12q, CAP));
				adjListVa11q.add(new VertexCell(vc1, CAP));
				adjListVa11q.add(new VertexCell(vc2, CAP));

				adjListVa12q.add(new VertexCell(ve11q, CAP));
				adjListVa12q.add(new VertexCell(ve12q, CAP));
				adjListVa12q.add(new VertexCell(vc3, CAP));
				adjListVa12q.add(new VertexCell(vc4, CAP));
				
				adjListVe21q.add(new VertexCell(t1q, CAP));
				adjListVe21q.add(new VertexCell(t2q, CAP));
				adjListVe21q.add(new VertexCell(va21q, CAP));
				adjListVe21q.add(new VertexCell(va22q, CAP));
				
				adjListVe22q.add(new VertexCell(t3q, CAP));
				adjListVe22q.add(new VertexCell(t4q, CAP));
				adjListVe22q.add(new VertexCell(va21q, CAP));
				adjListVe22q.add(new VertexCell(va22q, CAP));
				
				adjListVa21q.add(new VertexCell(ve21q, CAP));
				adjListVa21q.add(new VertexCell(ve22q, CAP));
				adjListVa21q.add(new VertexCell(vc1, CAP));
				adjListVa21q.add(new VertexCell(vc2, CAP));

				adjListVa22q.add(new VertexCell(ve21q, CAP));
				adjListVa22q.add(new VertexCell(ve22q, CAP));
				adjListVa22q.add(new VertexCell(vc3, CAP));
				adjListVa22q.add(new VertexCell(vc4, CAP));
		Graph g = new Graph(vertices, adjListS1, adjListS2, adjListS3, adjListS4, adjListS5, adjListS6, adjListS7, adjListS8,
				                      adjListT1, adjListT2, adjListT3, adjListT4, adjListT5, adjListT6, adjListT7, adjListT8,
				                      adjListVe11, adjListVe12, adjListVa11, adjListVa12,
				                      adjListVe21, adjListVe22, adjListVa21, adjListVa22,
				                      adjListVe31, adjListVe32, adjListVa31, adjListVa32,
				                      adjListVe41, adjListVe42, adjListVa41, adjListVa42,
				                      adjListVc1, adjListVc2, adjListVc3, adjListVc4, 
				                      adjListS1n, adjListS2n, adjListS3n, adjListS4n, adjListT1n, adjListT2n, adjListT3n, adjListT4n,
				                      adjListVe11n, adjListVe12n, adjListVa11n, adjListVa12n, adjListVe21n, adjListVe22n, adjListVa21n, adjListVa22n,
				                      adjListS1m, adjListS2m, adjListS3m, adjListS4m, adjListT1m, adjListT2m, adjListT3m, adjListT4m,
				                      adjListVe11m, adjListVe12m, adjListVa11m, adjListVa12m, adjListVe21m, adjListVe22m, adjListVa21m, adjListVa22m,
				                      adjListS1q, adjListS2q, adjListS3q, adjListS4q, adjListT1q, adjListT2q, adjListT3q, adjListT4q,
				                      adjListVe11q, adjListVe12q, adjListVa11q, adjListVa12q, adjListVe21q, adjListVe22q, adjListVa21q, adjListVa22q);
		assertTrue(g.getNumberOfEdges() == (16 + 8 + 8 + 8)*3 * 2);

		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(s1);
		sources.add(s2);
		sources.add(s3);
		sources.add(s4);
		sources.add(s5);
		sources.add(s6);
		sources.add(s7);
		sources.add(s8);
		sources.add(s1n);
		sources.add(s2n);
		sources.add(s3n);
		sources.add(s4n);
		sources.add(s1m);
		sources.add(s2m);
		sources.add(s3m);
		sources.add(s4m);
		sources.add(s1q);
		sources.add(s2q);
		sources.add(s3q);
		sources.add(s4q);
		
		sinks.add(t1);
		sinks.add(t2);
		sinks.add(t3);
		sinks.add(t4);
		sinks.add(t5);
		sinks.add(t6);
		sinks.add(t7);
		sinks.add(t8);
		sinks.add(t1n);
		sinks.add(t2n);
		sinks.add(t3n);
		sinks.add(t4n);
		sinks.add(t1m);
		sinks.add(t2m);
		sinks.add(t3m);
		sinks.add(t4m);
		sinks.add(t1q);
		sinks.add(t2q);
		sinks.add(t3q);
		sinks.add(t4q);
		
		double[] demands = new double[8+4 + 4 + 4];
		demands[0] = 1 * 10*8*10;
		demands[1] = 2 * 10*8*10;
		demands[2] = 3 * 10*8*10;
		demands[3] = 4 * 10*8*10;
		demands[4] = 5 * 10*8*10;
		demands[5] = 6 * 10*8*10;
		demands[6] = 7 * 10*8*10;
		demands[7] = 8 * 10*8*10;
		demands[8] = 1 * 10*8*10;
		demands[9] = 2 * 10*8*10;
		demands[10] = 3 * 10*8*10;
		demands[11] = 4 * 10*8*10;
		demands[12] = 1 * 10*8*10;
		demands[13] = 2 * 10*8*10;
		demands[14] = 3 * 10*8*10;
		demands[15] = 4 * 10*8*10;
		demands[16] = 1 * 10*8*10;
		demands[17] = 2 * 10*8*10;
		demands[18] = 3 * 10*8*10;
		demands[19] = 4 * 10*8*10;
		
		//System.out.println("MCF max flow time minimization for the Fat Tree (k=4)");
		g.MCFMinFlowTimeObj(sources, sinks, demands);
		List<Edge> edges = g.getEdges();

		//for(Edge e: edges)
		//	System.out.println(e.toString());
		
		double minFlow = 0.625;
		assertTrue(Math.abs(edges.get(0).getFlow(0) - minFlow) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(1) - minFlow*2) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(2) - minFlow*3) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(3) - minFlow*4) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(4) - minFlow*5) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(5) - minFlow*6) < 1e-6);
		assertTrue(Math.abs(edges.get(6).getFlow(6) - minFlow*7) < 1e-6);
		assertTrue(Math.abs(edges.get(7).getFlow(7) - minFlow*8) < 1e-6);
	}*/
	
	//@Test
	/*
	 * The test for concurrent MCF with full 400-leaves fat tree topology
	 */
	/*public void testMCFMinFlowTimeFatTree400() {
		
		int numberOfPods = 50;
		int id = 1;
		double CAP = 5;
		List<Vertex> vertices = new LinkedList<Vertex>();
		List< List<VertexCell> > adjLists = new LinkedList< List<VertexCell> >();
		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks   = new LinkedList<Vertex>();
		
		Vertex vc1 = new Vertex(id++);			vertices.add(vc1);
		Vertex vc2 = new Vertex(id++);			vertices.add(vc2);
		Vertex vc3 = new Vertex(id++);			vertices.add(vc3);
		Vertex vc4 = new Vertex(id++);			vertices.add(vc4);
		List<VertexCell> adjListVc1 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc2 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc3 = new LinkedList<VertexCell>();
		List<VertexCell> adjListVc4 = new LinkedList<VertexCell>();
		adjLists.add(adjListVc1);
		adjLists.add(adjListVc2);
		adjLists.add(adjListVc3);
		adjLists.add(adjListVc4);
		
		for( int i = 0; i < numberOfPods; ++i)
		{
			//Leaf nodes
			Vertex v1 = new Vertex(id++);		vertices.add(v1);
			Vertex v2 = new Vertex(id++);		vertices.add(v2);
			Vertex v3 = new Vertex(id++);		vertices.add(v3);
			Vertex v4 = new Vertex(id++);		vertices.add(v4);
			
			if( (i+1) % 2 == 1 )
			{
				sources.add(v1);
				sources.add(v2);
				sources.add(v3);
				sources.add(v4);
			}
			else
			{
				sinks.add(v1);
				sinks.add(v2);
				sinks.add(v3);
				sinks.add(v4);
			}
			
			//Edge nodes
			Vertex ve1 = new Vertex(id++);		vertices.add(ve1);
			Vertex ve2 = new Vertex(id++);		vertices.add(ve2);
			
			//Aggregate nodes
			Vertex va1 = new Vertex(id++);		vertices.add(va1);
			Vertex va2 = new Vertex(id++);		vertices.add(va2);
			
			List<VertexCell> adjListV1  = new LinkedList<VertexCell>();
			List<VertexCell> adjListV2  = new LinkedList<VertexCell>();
			List<VertexCell> adjListV3  = new LinkedList<VertexCell>();
			List<VertexCell> adjListV4  = new LinkedList<VertexCell>();
			List<VertexCell> adjListVe1 = new LinkedList<VertexCell>();
			List<VertexCell> adjListVe2 = new LinkedList<VertexCell>();
			List<VertexCell> adjListVa1 = new LinkedList<VertexCell>();
			List<VertexCell> adjListVa2 = new LinkedList<VertexCell>();
			
			adjListV1.add(new VertexCell(ve1, CAP));	adjLists.add(adjListV1);
			adjListV2.add(new VertexCell(ve1, CAP));	adjLists.add(adjListV2);
			adjListV3.add(new VertexCell(ve2, CAP));	adjLists.add(adjListV3);
			adjListV4.add(new VertexCell(ve2, CAP));	adjLists.add(adjListV4);
			
			adjListVe1.add(new VertexCell(v1, CAP));
			adjListVe1.add(new VertexCell(v2, CAP));
			adjListVe1.add(new VertexCell(va1, CAP));
			adjListVe1.add(new VertexCell(va2, CAP));
			adjLists.add(adjListVe1);
			
			adjListVe2.add(new VertexCell(v3, CAP));
			adjListVe2.add(new VertexCell(v4, CAP));
			adjListVe2.add(new VertexCell(va1, CAP));
			adjListVe2.add(new VertexCell(va2, CAP));
			adjLists.add(adjListVe2);
			
			adjListVa1.add(new VertexCell(ve1, CAP));
			adjListVa1.add(new VertexCell(ve2, CAP));
			adjListVa1.add(new VertexCell(vc1, CAP));
			adjListVa1.add(new VertexCell(vc2, CAP));
			adjLists.add(adjListVa1);
			
			adjListVa2.add(new VertexCell(ve1, CAP));
			adjListVa2.add(new VertexCell(ve2, CAP));
			adjListVa2.add(new VertexCell(vc3, CAP));
			adjListVa2.add(new VertexCell(vc4, CAP));
			adjLists.add(adjListVa2);
			
			adjListVc1.add(new VertexCell(va1, CAP));
			adjListVc2.add(new VertexCell(va1, CAP));
			adjListVc3.add(new VertexCell(va2, CAP));
			adjListVc4.add(new VertexCell(va2, CAP));
		}
		
		Graph g = new Graph(vertices, adjLists);
		assertTrue(g.getNumberOfEdges() == ( 8*numberOfPods/2 )*3 * 2);
				
		double[] demands = new double[numberOfPods * 2];
		for(int i = 0 ; i < numberOfPods; ++i)
			demands[i] = 10 * (1+ i%4);
				
		g.MCFMinFlowTimeObj(sources, sinks, demands);
		List<Edge> edges = g.getEdges();
		
		double minFlow = 0.625;*/
		/*assertTrue(Math.abs(edges.get(0).getFlow(0) - minFlow) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(1) - minFlow*2) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(2) - minFlow*3) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(3) - minFlow*4) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(4) - minFlow*5) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(5) - minFlow*6) < 1e-6);
		assertTrue(Math.abs(edges.get(6).getFlow(6) - minFlow*7) < 1e-6);
		assertTrue(Math.abs(edges.get(7).getFlow(7) - minFlow*8) < 1e-6);*/
	//}
	
	//@Test
	/*
	 * the same test case as the previous one, but automatically generated
	 */
	/*public void testMCFMinFlowTimeFatTree1() {
		
		int k = 4;
		double CAP = 5;
		
		Vertex[] hosts = new Vertex[k*k + 2*k + 2*k + k];
		
		//Hosts
		for(int i = 0; i < k*k; ++i)
			hosts[i] = new Vertex(i+1);
		
		//Edge switches
		for(int i = k*k; i < k*k + 2*k; ++i)
			hosts[i] = new Vertex(i+1);
		
		//Aggregate switches
		for(int i = k*k + 2*k; i < k*k + 2*k + 2*k; ++i)
			hosts[i] = new Vertex(i+1);
		
		//Core switches
		for(int i = k*k + 2*k + 2*k; i < k*k + 2*k + 2*k + k; ++i)
			hosts[i] = new Vertex(i+1);
				
		List<Vertex> vertices = new LinkedList<Vertex>();
		for(Vertex v : hosts)
			vertices.add(v);

		List< List<VertexCell> > adjLists = new LinkedList< List<VertexCell> >();
		for(int i = 0; i < k*k + 2*k + 2*k + k; ++i)
		{
			adjLists.add( new LinkedList<VertexCell>());
		}
		for(List<VertexCell> adjList : adjLists)
		{
			adjList = new LinkedList<VertexCell>();
		}
		
		//Connect hosts to edge switches
		for(int i = 0; i < k*k ; i += 2)
		{
			adjLists.get( i ).add( new VertexCell(hosts[k*k + i/2], CAP) );			//Connect left host to an edge switch
			adjLists.get(i+1).add( new VertexCell(hosts[k*k + i/2], CAP) );			//Connect right host to an edge switch
			adjLists.get(k*k + i/2).add( new VertexCell(hosts[i], CAP) );			//Connect the edge switch to the left host
			adjLists.get(k*k + i/2).add( new VertexCell(hosts[i + 1], CAP) );		//Connect the edge switch to the right switch
		}

		//Connect edge switches to aggregate switches
		for(int i = k*k; i < k*k + 2*k; ++i)
		{
			if( i % 2 == 0)
			{
				adjLists.get(i).add( new VertexCell(hosts[i + 2*k], CAP) );			//Connect an edge switch to the left aggregate switch
				adjLists.get(i).add( new VertexCell(hosts[i + 2*k + 1], CAP) );		//Connect the edge switch to the right aggregate switch
				adjLists.get(i + 2*k).add( new VertexCell(hosts[i], CAP) );			//Connect the left aggregate switch to the edge switch
				adjLists.get(i + 2*k + 1).add( new VertexCell(hosts[i], CAP) );		//Connect the right aggregate switch to the edge switch
			}
			else
			{
				adjLists.get(i).add( new VertexCell(hosts[i + 2*k - 1], CAP) );		//Connect an edge switch to the left aggregate switch
				adjLists.get(i).add( new VertexCell(hosts[i + 2*k], CAP) );			//Connect the edge switch to the right aggregate switch
				adjLists.get(i + 2*k - 1).add( new VertexCell(hosts[i], CAP) );		//Connect the left aggregate switch to the edge switch
				adjLists.get(i + 2*k).add( new VertexCell(hosts[i], CAP) );			//Connect the right aggregate switch to the edge switch
			}
		}

		int leftmostCoreSw = k*k + 2*k + 2*k;
		for(int i = k*k + 2*k; i < k*k + 2*k + 2*k; ++i)
		{
			if( i % 2 == 0)
			{
				adjLists.get(i).add( new VertexCell(hosts[ leftmostCoreSw ], CAP) );
				adjLists.get(i).add( new VertexCell(hosts[leftmostCoreSw+1], CAP) );
				adjLists.get(leftmostCoreSw).add( new VertexCell(hosts[ i ], CAP) );
				adjLists.get(leftmostCoreSw+1).add( new VertexCell(hosts[i], CAP) );
			}
			else
			{
				adjLists.get(i).add( new VertexCell(hosts[ leftmostCoreSw + 2 ], CAP) );
				adjLists.get(i).add( new VertexCell(hosts[leftmostCoreSw + 3], CAP) );
				adjLists.get(leftmostCoreSw+2).add( new VertexCell(hosts[ i ], CAP) );
				adjLists.get(leftmostCoreSw+3).add( new VertexCell(hosts[i], CAP) );
			}
		}


		Graph g = new Graph(vertices, adjLists);
		//System.out.println("\n********************   Fat Tree (auto)   **********************\n");
		//System.out.println(g.toString());
		assertTrue(g.getNumberOfEdges() == 16*3 * 2);

		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(hosts[0]);
		sources.add(hosts[1]);
		sources.add(hosts[2]);
		sources.add(hosts[3]);
		sources.add(hosts[4]);
		sources.add(hosts[5]);
		sources.add(hosts[6]);
		sources.add(hosts[7]);
		
		sinks.add(hosts[8]);
		sinks.add(hosts[9]);
		sinks.add(hosts[10]);
		sinks.add(hosts[11]);
		sinks.add(hosts[12]);
		sinks.add(hosts[13]);
		sinks.add(hosts[14]);
		sinks.add(hosts[15]);
		
		double[] demands = new double[8];
		demands[0] = 1 * 10*8*10;
		demands[1] = 2 * 10*8*10;
		demands[2] = 3 * 10*8*10;
		demands[3] = 4 * 10*8*10;
		demands[4] = 5 * 10*8*10;
		demands[5] = 6 * 10*8*10;
		demands[6] = 7 * 10*8*10;
		demands[7] = 8 * 10*8*10;
		
		//System.out.println("MCF max flow time minimization for the Fat Tree (k=4)");
		g.MCFMinFlowTimeObj(sources, sinks, demands);
		List<Edge> edges = g.getEdges();

		//for(Edge e: edges)
		//	System.out.println(e.toString());
		
		double minFlow = 0.625;
		assertTrue(Math.abs(edges.get(0).getFlow(0) - minFlow) < 1e-6);
		assertTrue(Math.abs(edges.get(1).getFlow(1) - minFlow*2) < 1e-6);
		assertTrue(Math.abs(edges.get(2).getFlow(2) - minFlow*3) < 1e-6);
		assertTrue(Math.abs(edges.get(3).getFlow(3) - minFlow*4) < 1e-6);
		assertTrue(Math.abs(edges.get(4).getFlow(4) - minFlow*5) < 1e-6);
		assertTrue(Math.abs(edges.get(5).getFlow(5) - minFlow*6) < 1e-6);
		assertTrue(Math.abs(edges.get(6).getFlow(6) - minFlow*7) < 1e-6);
		assertTrue(Math.abs(edges.get(7).getFlow(7) - minFlow*8) < 1e-6);
		//System.out.println("*****     FIN     *****");
	}
	*/
	//@Test
	/*
	 * the same test case as the previous one, but automatically generated
	 */
	/*public void testMCFMinFlowTimeNonDirectedFatTreeAllToAll() {
		
		int k = 4;
		double CAP = 5;
		
		Vertex[] hosts = new Vertex[k*k + 2*k + 2*k + k];
		
		//Hosts
		for(int i = 0; i < k*k; ++i)
			hosts[i] = new Vertex(i+1);
		
		//Edge switches
		for(int i = k*k; i < k*k + 2*k; ++i)
			hosts[i] = new Vertex(i+1);
		
		//Aggregate switches
		for(int i = k*k + 2*k; i < k*k + 2*k + 2*k; ++i)
			hosts[i] = new Vertex(i+1);
		
		//Core switches
		for(int i = k*k + 2*k + 2*k; i < k*k + 2*k + 2*k + k; ++i)
			hosts[i] = new Vertex(i+1);
				
		List<Vertex> vertices = new LinkedList<Vertex>();
		for(Vertex v : hosts)
			vertices.add(v);

		List< List<VertexCell> > adjLists = new LinkedList< List<VertexCell> >();
		for(int i = 0; i < k*k + 2*k + 2*k + k; ++i)
		{
			adjLists.add( new LinkedList<VertexCell>());
		}
		for(List<VertexCell> adjList : adjLists)
		{
			adjList = new LinkedList<VertexCell>();
		}
		
		//Connect hosts to edge switches
		for(int i = 0; i < k*k ; i += 2)
		{
			adjLists.get( i ).add( new VertexCell(hosts[k*k + i/2], CAP) );			//Connect left host to an edge switch
			adjLists.get(i+1).add( new VertexCell(hosts[k*k + i/2], CAP) );			//Connect right host to an edge switch
			adjLists.get(k*k + i/2).add( new VertexCell(hosts[i], CAP) );			//Connect the edge switch to the left host
			adjLists.get(k*k + i/2).add( new VertexCell(hosts[i + 1], CAP) );		//Connect the edge switch to the right switch
		}

		//Connect edge switches to aggregate switches
		for(int i = k*k; i < k*k + 2*k; ++i)
		{
			if( i % 2 == 0)
			{
				adjLists.get(i).add( new VertexCell(hosts[i + 2*k], CAP) );			//Connect an edge switch to the left aggregate switch
				adjLists.get(i).add( new VertexCell(hosts[i + 2*k + 1], CAP) );		//Connect the edge switch to the right aggregate switch
				adjLists.get(i + 2*k).add( new VertexCell(hosts[i], CAP) );			//Connect the left aggregate switch to the edge switch
				adjLists.get(i + 2*k + 1).add( new VertexCell(hosts[i], CAP) );		//Connect the right aggregate switch to the edge switch
			}
			else
			{
				adjLists.get(i).add( new VertexCell(hosts[i + 2*k - 1], CAP) );		//Connect an edge switch to the left aggregate switch
				adjLists.get(i).add( new VertexCell(hosts[i + 2*k], CAP) );			//Connect the edge switch to the right aggregate switch
				adjLists.get(i + 2*k - 1).add( new VertexCell(hosts[i], CAP) );		//Connect the left aggregate switch to the edge switch
				adjLists.get(i + 2*k).add( new VertexCell(hosts[i], CAP) );			//Connect the right aggregate switch to the edge switch
			}
		}

		int leftmostCoreSw = k*k + 2*k + 2*k;
		for(int i = k*k + 2*k; i < k*k + 2*k + 2*k; ++i)
		{
			if( i % 2 == 0)
			{
				adjLists.get(i).add( new VertexCell(hosts[ leftmostCoreSw ], CAP) );
				adjLists.get(i).add( new VertexCell(hosts[leftmostCoreSw+1], CAP) );
				adjLists.get(leftmostCoreSw).add( new VertexCell(hosts[ i ], CAP) );
				adjLists.get(leftmostCoreSw+1).add( new VertexCell(hosts[i], CAP) );
			}
			else
			{
				adjLists.get(i).add( new VertexCell(hosts[ leftmostCoreSw + 2 ], CAP) );
				adjLists.get(i).add( new VertexCell(hosts[leftmostCoreSw + 3], CAP) );
				adjLists.get(leftmostCoreSw+2).add( new VertexCell(hosts[ i ], CAP) );
				adjLists.get(leftmostCoreSw+3).add( new VertexCell(hosts[i], CAP) );
			}
		}


		Graph g = new Graph(vertices, adjLists);
		//System.out.println("\n********************   Fat Tree (auto)   **********************\n");
		//System.out.println(g.toString());
		assertTrue(g.getNumberOfEdges() == 16*3 * 2);

		List<Vertex> sources = new LinkedList<Vertex>();
		List<Vertex> sinks = new LinkedList<Vertex>();
		sources.add(hosts[0]);
		sources.add(hosts[1]);
		sources.add(hosts[2]);
		sources.add(hosts[3]);
		sources.add(hosts[4]);
		sources.add(hosts[5]);
		sources.add(hosts[6]);
		sources.add(hosts[7]);
		sources.add(hosts[8]);
		sources.add(hosts[8]);
		sources.add(hosts[10]);
		sources.add(hosts[11]);
		sources.add(hosts[12]);
		sources.add(hosts[13]);
		sources.add(hosts[14]);
		sources.add(hosts[15]);
		
		sinks.add(hosts[8]);
		sinks.add(hosts[9]);
		sinks.add(hosts[10]);
		sinks.add(hosts[11]);
		sinks.add(hosts[12]);
		sinks.add(hosts[13]);
		sinks.add(hosts[14]);
		sinks.add(hosts[15]);
		sinks.add(hosts[1]);
		sinks.add(hosts[3]);
		sinks.add(hosts[2]);
		sinks.add(hosts[4]);
		sinks.add(hosts[4]);
		sinks.add(hosts[0]);
		sinks.add(hosts[7]);
		sinks.add(hosts[6]);
		
		double[] demands = new double[sources.size()];
		demands[0] = 1 * 10*8*10;
		demands[1] = 2 * 10*8*10;
		demands[2] = 3 * 10*8*10;
		demands[3] = 4 * 10*8*10;
		demands[4] = 5 * 10*8*10;
		demands[5] = 6 * 10*8*10;
		demands[6] = 7 * 10*8*10;
		demands[7] = 8 * 10*8*10;
		
		demands[8] = 3 * 10*8*10;
		demands[9] = 5 * 10*8*10;
		demands[10] = 7 * 10*8*10;
		demands[11] = 9 * 10*8*10;
		demands[12] = 1 * 10*8*10;
		demands[13] = 2 * 10*8*10;
		demands[14] = 4 * 10*8*10;
		demands[15] = 6 * 10*8*10;
		
		//System.out.println("MCF max flow time minimization for the Fat Tree All-2-All (k=4)");
		g.MCFMinFlowTimeObj(sources, sinks, demands);
		List<Edge> edges = g.getEdges();

		//for(Edge e: edges)
		//	System.out.println(e.toString());
		
		double minFlow = 0.625;

		//System.out.println("*****     FIN     *****");
	}*/

	/*
	 * Test for directed weighted graph
	 */
	@Test
	public void testLowStretchSpanTree() throws CloneNotSupportedException {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);
		vertices.add(v5);
		vertices.add(v6);
		
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();
		List<VertexCell> adjList5 = new LinkedList<VertexCell>();
		List<VertexCell> adjList6 = new LinkedList<VertexCell>();
		
		adjList1.add(new VertexCell(v2, 0.9));
		adjList1.add(new VertexCell(v3, 0.2));
		adjList1.add(new VertexCell(v4, 0.8));
		adjList1.add(new VertexCell(v5, 0.2));
		adjList1.add(new VertexCell(v6, 0.5));
		
		adjList2.add(new VertexCell(v1, 0.9));
		adjList2.add(new VertexCell(v3, 0.4));
		adjList2.add(new VertexCell(v6, 0.3));
		
		adjList3.add(new VertexCell(v1, 0.2));
		adjList3.add(new VertexCell(v2, 0.4));
		adjList3.add(new VertexCell(v4, 0.8));
		adjList3.add(new VertexCell(v6, 0.2));
		
		adjList4.add(new VertexCell(v1, 0.8));
		adjList4.add(new VertexCell(v3, 0.8));
		adjList4.add(new VertexCell(v5, 0.1));
		adjList4.add(new VertexCell(v6, 0.7));
		
		adjList5.add(new VertexCell(v1, 0.2));
		adjList5.add(new VertexCell(v4, 0.1));

		adjList6.add(new VertexCell(v1, 0.5));
		adjList6.add(new VertexCell(v2, 0.3));
		adjList6.add(new VertexCell(v3, 0.2));
		adjList6.add(new VertexCell(v4, 0.7));
		
		Graph g = new Graph(vertices, adjList1, adjList2, adjList3, adjList4, adjList5, adjList6);

		List<Edge> edges = g.getEdges();
		assertTrue( edges.size() == 22);
		double radius = g.getRadius(v1, true);
		assertTrue(Math.abs(radius - 0.6) < 1e-6);
				
        Graph ball = g.getBall(v1, 0.3, false);
        List<Vertex> ballVertices = ball.getVertices();
        List<Vertex> ballShell = g.getBallShell(v1, 0.3, false);
        
        assertTrue(ballVertices.get(0).getID() == 1);
        assertTrue(ballVertices.get(1).getID() == 3);
        assertTrue(ballVertices.get(2).getID() == 4);
        assertTrue(ballVertices.get(3).getID() == 5);
        assertTrue(ballShell.get(0).getID() == 2);
        assertTrue(ballShell.get(1).getID() == 6);
        assertTrue(ballShell.size() == 2);
        
        List<Edge> boundary = g.getBoundary(ball.getVertices());
        assertTrue(boundary.get(0).getSource().getID() == 1 && boundary.get(0).getSink().getID() == 2);
        assertTrue(boundary.get(1).getSource().getID() == 1 && boundary.get(1).getSink().getID() == 6);
        assertTrue(boundary.get(2).getSource().getID() == 3 && boundary.get(2).getSink().getID() == 2);
        assertTrue(boundary.get(3).getSource().getID() == 3 && boundary.get(3).getSink().getID() == 6);
        assertTrue(boundary.get(4).getSource().getID() == 4 && boundary.get(4).getSink().getID() == 6);
        assertTrue( Math.abs( g.computeCost(boundary) - 12.0397) < 1e-3);
        
        //System.out.println(" " + g.BallCut(v1, radius, 1/3));
        
        Graph gNew = g.induceGraph(ball.getVertices());
        //System.out.println(gNew.toString());
	}

	//@Test
	/*
	 * Test for directed weighted graph
	 */
	@Test
	public void testCone() {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		Vertex v7 = new Vertex(7);
		Vertex v8 = new Vertex(8);
		Vertex v9 = new Vertex(9);
		Vertex v10 = new Vertex(10);
		Vertex v11 = new Vertex(11);
		Vertex v12 = new Vertex(12);
		Vertex v13 = new Vertex(13);
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);
		vertices.add(v5);
		vertices.add(v6);
		vertices.add(v7);
		vertices.add(v8);
		vertices.add(v9);
		vertices.add(v10);
		vertices.add(v11);
		vertices.add(v12);
		vertices.add(v13);
		
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();
		List<VertexCell> adjList5 = new LinkedList<VertexCell>();
		List<VertexCell> adjList6 = new LinkedList<VertexCell>();
		List<VertexCell> adjList7 = new LinkedList<VertexCell>();
		List<VertexCell> adjList8 = new LinkedList<VertexCell>();
		List<VertexCell> adjList9 = new LinkedList<VertexCell>();
		List<VertexCell> adjList10 = new LinkedList<VertexCell>();
		List<VertexCell> adjList11 = new LinkedList<VertexCell>();
		List<VertexCell> adjList12 = new LinkedList<VertexCell>();
		List<VertexCell> adjList13 = new LinkedList<VertexCell>();
		
		adjList1.add(new VertexCell(v3, 1));
		adjList1.add(new VertexCell(v5, 1));
		
		adjList2.add(new VertexCell(v6, 1));
		adjList2.add(new VertexCell(v7, 1));
		adjList2.add(new VertexCell(v3, 0.5));
		
		adjList3.add(new VertexCell(v1, 1));
		adjList3.add(new VertexCell(v2, 0.5));
		adjList3.add(new VertexCell(v5, 1));
		
		adjList4.add(new VertexCell(v5, 0.5));
		adjList4.add(new VertexCell(v11, 1));
		
		adjList5.add(new VertexCell(v1, 1));
		adjList5.add(new VertexCell(v4, 0.5));
		adjList5.add(new VertexCell(v3, 1));

		adjList6.add(new VertexCell(v2, 1));
		
		adjList7.add(new VertexCell(v2, 1));
		adjList7.add(new VertexCell(v8, 0.5));
		adjList7.add(new VertexCell(v10, 10));
		
		adjList8.add(new VertexCell(v7, 0.5));
		adjList8.add(new VertexCell(v9, 0.5));
		
		adjList9.add(new VertexCell(v8, 0.5));
		adjList9.add(new VertexCell(v10, 1));
		
		adjList10.add(new VertexCell(v7, 10));
		adjList10.add(new VertexCell(v9, 1));
		adjList10.add(new VertexCell(v11, 1));
		
		adjList11.add(new VertexCell(v4, 1));
		adjList11.add(new VertexCell(v10, 1));
		adjList11.add(new VertexCell(v12, 1));
		
		adjList12.add(new VertexCell(v11, 1));
		adjList12.add(new VertexCell(v13, 1));
		
		adjList13.add(new VertexCell(v12, 1));
		
		Graph g = new Graph(vertices, adjList1, adjList2, adjList3, adjList4, adjList5, adjList6, 
				            adjList7, adjList8, adjList9, adjList10, adjList11, adjList12, adjList13);

		List<Edge> edges = g.getEdges();
		assertTrue( edges.size() == 15*2);
		
		List<Vertex> vrts = new LinkedList<Vertex>();
		vrts.add(v2);
		vrts.add(v4);
		vrts.add(v6);
		vrts.add(v7);
		vrts.add(v8);
		vrts.add(v9);
		vrts.add(v10);
		vrts.add(v11);
		vrts.add(v12);
		vrts.add(v13);
		List<Vertex> ballShell = g.getBallShell(v1, 1.1, true);
		assertTrue(ballShell.get(0).getID() == 2);
		assertTrue(ballShell.get(1).getID() == 4);

		Graph subGraph = g.induceGraph(vrts);		
		
		List<Vertex> cone = subGraph.getCone(v4, 0, ballShell);
		assertTrue(cone.get(0).getID() == 4);
		assertTrue(cone.get(1).getID() == 10);
		assertTrue(cone.get(2).getID() == 11);
		assertTrue(cone.get(3).getID() == 12);
		assertTrue(cone.get(4).getID() == 13);
				
		cone = subGraph.getCone(v2, 0, ballShell);
		assertTrue(cone.get(0).getID() == 2);
		assertTrue(cone.get(1).getID() == 6);
		assertTrue(cone.get(2).getID() == 7);
		assertTrue(cone.get(3).getID() == 8);
		assertTrue(cone.get(4).getID() == 9);
		
		cone = subGraph.getCone(v4, 1.1, ballShell);
		assertTrue(cone.get(0).getID() == 4);
		assertTrue(cone.get(1).getID() == 9);
		assertTrue(cone.get(2).getID() == 10);
		assertTrue(cone.get(3).getID() == 11);
		assertTrue(cone.get(4).getID() == 12);
		assertTrue(cone.get(5).getID() == 13);
		assertTrue(cone.size() == 6);
		
		cone = subGraph.getCone(v2, 1.6, ballShell);
		assertTrue(cone.get(0).getID() == 2);
		assertTrue(cone.get(1).getID() == 6);
		assertTrue(cone.get(2).getID() == 7);
		assertTrue(cone.get(3).getID() == 8);
		assertTrue(cone.get(4).getID() == 9);
		assertTrue(cone.get(5).getID() == 10);
		assertTrue(cone.size() == 6);
		
		List<Vertex> coneVertices = new LinkedList<Vertex>();
		List< List<Vertex> > res = subGraph.coneDecomp(ballShell, 0.1*g.getRadius(v1, true) / 2, coneVertices);
		assertTrue( (res.get(0).get(0).getID() == 2 && res.get(1).get(0).getID() == 4)  ||
				    (res.get(0).get(0).getID() == 4 && res.get(1).get(0).getID() == 2));
		assertTrue( (res.get(0).get(1).getID() == 6 && res.get(1).get(1).getID() == 10) ||
				    (res.get(0).get(1).getID() == 10 && res.get(1).get(1).getID() == 6));
		assertTrue( (res.get(0).get(2).getID() == 7 && res.get(1).get(2).getID() == 11) ||
				    (res.get(0).get(2).getID() == 11 && res.get(1).get(2).getID() == 7));
		assertTrue( (res.get(0).get(3).getID() == 8 && res.get(1).get(3).getID() == 12) ||
				    (res.get(0).get(3).getID() == 12 && res.get(1).get(3).getID() == 8));
		assertTrue( (res.get(0).get(4).getID() == 9 && res.get(1).get(4).getID() == 13) || 
				    (res.get(0).get(4).getID() == 13 && res.get(1).get(4).getID() == 9));
		
		//assertTrue( (coneVertices.get(0).equals(v2) && coneVertices.get(0).equals(v4)) ||
		//		    (coneVertices.get(0).equals(v4) && coneVertices.get(0).equals(v2)));

	}
	
	//@Test
	/*
	 * Test for directed weighted graph
	 */
	@Test
	public void testConeLarge() {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		Vertex v7 = new Vertex(7);
		Vertex v8 = new Vertex(8);
		Vertex v9 = new Vertex(9);
		Vertex v10 = new Vertex(10);
		Vertex v11 = new Vertex(11);
		Vertex v12 = new Vertex(12);
		Vertex v13 = new Vertex(13);
		Vertex v14 = new Vertex(14);
		Vertex v15 = new Vertex(15);
		Vertex v16 = new Vertex(16);
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);
		vertices.add(v5);
		vertices.add(v6);
		vertices.add(v7);
		vertices.add(v8);
		vertices.add(v9);
		vertices.add(v10);
		vertices.add(v11);
		vertices.add(v12);
		vertices.add(v13);
		vertices.add(v14);
		vertices.add(v15);
		vertices.add(v16);
		
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();
		List<VertexCell> adjList5 = new LinkedList<VertexCell>();
		List<VertexCell> adjList6 = new LinkedList<VertexCell>();
		List<VertexCell> adjList7 = new LinkedList<VertexCell>();
		List<VertexCell> adjList8 = new LinkedList<VertexCell>();
		List<VertexCell> adjList9 = new LinkedList<VertexCell>();
		List<VertexCell> adjList10 = new LinkedList<VertexCell>();
		List<VertexCell> adjList11 = new LinkedList<VertexCell>();
		List<VertexCell> adjList12 = new LinkedList<VertexCell>();
		List<VertexCell> adjList13 = new LinkedList<VertexCell>();
		List<VertexCell> adjList14 = new LinkedList<VertexCell>();
		List<VertexCell> adjList15 = new LinkedList<VertexCell>();
		List<VertexCell> adjList16 = new LinkedList<VertexCell>();
		
		adjList1.add(new VertexCell(v3, 1));
		adjList1.add(new VertexCell(v5, 1));
		adjList1.add(new VertexCell(v14, 1.5));
		
		adjList2.add(new VertexCell(v6, 1));
		adjList2.add(new VertexCell(v7, 1));
		adjList2.add(new VertexCell(v3, 0.5));
		
		adjList3.add(new VertexCell(v1, 1));
		adjList3.add(new VertexCell(v2, 0.5));
		adjList3.add(new VertexCell(v5, 1));
		
		adjList4.add(new VertexCell(v5, 0.5));
		adjList4.add(new VertexCell(v11, 1));
		
		adjList5.add(new VertexCell(v1, 1));
		adjList5.add(new VertexCell(v4, 0.5));
		adjList5.add(new VertexCell(v3, 1));

		adjList6.add(new VertexCell(v2, 1));
		adjList6.add(new VertexCell(v15, 10));
		
		adjList7.add(new VertexCell(v2, 1));
		adjList7.add(new VertexCell(v8, 0.5));
		adjList7.add(new VertexCell(v10, 10));
		
		adjList8.add(new VertexCell(v7, 0.5));
		adjList8.add(new VertexCell(v9, 0.5));
		
		adjList9.add(new VertexCell(v8, 0.5));
		adjList9.add(new VertexCell(v10, 1));
		
		adjList10.add(new VertexCell(v7, 10));
		adjList10.add(new VertexCell(v9, 1));
		adjList10.add(new VertexCell(v11, 1));
		
		adjList11.add(new VertexCell(v4, 1));
		adjList11.add(new VertexCell(v10, 1));
		adjList11.add(new VertexCell(v12, 1));
		
		adjList12.add(new VertexCell(v11, 1));
		adjList12.add(new VertexCell(v13, 1));
		
		adjList13.add(new VertexCell(v12, 1));
		
		adjList14.add(new VertexCell(v1, 1.5));
		adjList14.add(new VertexCell(v15, 1));
		adjList14.add(new VertexCell(v16, 1));
		
		adjList15.add(new VertexCell(v14, 1));
		adjList15.add(new VertexCell(v6, 10));
		
		adjList16.add(new VertexCell(v14, 1));
		
		Graph g = new Graph(vertices, adjList1, adjList2, adjList3, adjList4, adjList5, adjList6, 
				            adjList7, adjList8, adjList9, adjList10, adjList11, adjList12, adjList13, adjList14, adjList15, adjList16);

		List<Edge> edges = g.getEdges();
		assertTrue( edges.size() == 19*2);
		
		List<Vertex> vrts = new LinkedList<Vertex>();
		vrts.add(v2);
		vrts.add(v4);
		vrts.add(v6);
		vrts.add(v7);
		vrts.add(v8);
		vrts.add(v9);
		vrts.add(v10);
		vrts.add(v11);
		vrts.add(v12);
		vrts.add(v13);
		vrts.add(v14);
		vrts.add(v15);
		vrts.add(v16);
		List<Vertex> ballShell = g.getBallShell(v1, 1.1, true);
		assertTrue(ballShell.size() == 3);
		assertTrue(ballShell.get(0).getID() == 14);
		assertTrue(ballShell.get(1).getID() == 2);
		assertTrue(ballShell.get(2).getID() == 4);

		Graph subGraph = g.induceGraph(vrts);
		
		List<Vertex> cone = subGraph.getCone(v4, 0, ballShell);
		assertTrue(cone.get(0).getID() == 4);
		assertTrue(cone.get(1).getID() == 10);
		assertTrue(cone.get(2).getID() == 11);
		assertTrue(cone.get(3).getID() == 12);
		assertTrue(cone.get(4).getID() == 13);
		assertTrue(cone.size() == 5);
				
		cone = subGraph.getCone(v2, 0, ballShell);
		assertTrue(cone.get(0).getID() == 2);
		assertTrue(cone.get(1).getID() == 6);
		assertTrue(cone.get(2).getID() == 7);
		assertTrue(cone.get(3).getID() == 8);
		assertTrue(cone.get(4).getID() == 9);
		assertTrue(cone.size() == 5);
		
		cone = subGraph.getCone(v14, 0, ballShell);
		assertTrue(cone.get(0).getID() == 14);
		assertTrue(cone.get(1).getID() == 15);
		assertTrue(cone.get(2).getID() == 16);
		assertTrue(cone.size() == 3);
		
		cone = subGraph.getCone(v4, 1.1, ballShell);
		assertTrue(cone.get(0).getID() == 4);
		assertTrue(cone.get(1).getID() == 9);
		assertTrue(cone.get(2).getID() == 10);
		assertTrue(cone.get(3).getID() == 11);
		assertTrue(cone.get(4).getID() == 12);
		assertTrue(cone.get(5).getID() == 13);
		assertTrue(cone.size() == 6);
		
		cone = subGraph.getCone(v2, 1.6, ballShell);
		assertTrue(cone.get(0).getID() == 2);
		assertTrue(cone.get(1).getID() == 6);
		assertTrue(cone.get(2).getID() == 7);
		assertTrue(cone.get(3).getID() == 8);
		assertTrue(cone.get(4).getID() == 9);
		assertTrue(cone.get(5).getID() == 10);
		assertTrue(cone.size() == 6);
		
		List<Vertex> coneVertices = new LinkedList<Vertex>();
		List< List<Vertex> > res = subGraph.coneDecomp(ballShell, 0.1*g.getRadius(v1, true) / 2, coneVertices);
		for(List<Vertex> Vk : res)
		{
			for(Vertex v : Vk)
				System.out.print(v.getID() + " ");
			System.out.println(" ");
		}
		for(Vertex v : coneVertices)
			System.out.println(v.getID());
		//assertTrue( res.get(0).get(0).getID() == 2 || (res.get(1).get(0).getID() == 4  || res.get(2).get(0).getID() == 14)  );
		//assertTrue( res.get(0).get(1).getID() == 6 || res.get(1).get(1).getID() == 10 || res.get(2).get(1).getID() == 15  );
		//assertTrue( res.get(0).get(2).getID() == 7 || res.get(1).get(2).getID() == 11 || res.get(2).get(2).getID() == 16  );
		//assertTrue( (res.get(0).get(3).getID() == 8 && res.get(1).get(3).getID() == 12) ||
		//		    (res.get(0).get(3).getID() == 12 && res.get(1).get(3).getID() == 8));
		//assertTrue( (res.get(0).get(4).getID() == 9 && res.get(1).get(4).getID() == 13) || 
		//		    (res.get(0).get(4).getID() == 13 && res.get(1).get(4).getID() == 9));

	}

	//@Test
	/*
	 * Test for directed weighted graph
	 */
	@Test
	public void testStarDecomp() {

		
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		Vertex v7 = new Vertex(7);
		Vertex v8 = new Vertex(8);
		Vertex v9 = new Vertex(9);
		Vertex v10 = new Vertex(10);
		Vertex v11 = new Vertex(11);
		Vertex v12 = new Vertex(12);
		Vertex v13 = new Vertex(13);
		Vertex v14 = new Vertex(14);
		Vertex v15 = new Vertex(15);
		Vertex v16 = new Vertex(16);
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);
		vertices.add(v5);
		vertices.add(v6);
		vertices.add(v7);
		vertices.add(v8);
		vertices.add(v9);
		vertices.add(v10);
		vertices.add(v11);
		vertices.add(v12);
		vertices.add(v13);
		vertices.add(v14);
		vertices.add(v15);
		vertices.add(v16);
		
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();
		List<VertexCell> adjList5 = new LinkedList<VertexCell>();
		List<VertexCell> adjList6 = new LinkedList<VertexCell>();
		List<VertexCell> adjList7 = new LinkedList<VertexCell>();
		List<VertexCell> adjList8 = new LinkedList<VertexCell>();
		List<VertexCell> adjList9 = new LinkedList<VertexCell>();
		List<VertexCell> adjList10 = new LinkedList<VertexCell>();
		List<VertexCell> adjList11 = new LinkedList<VertexCell>();
		List<VertexCell> adjList12 = new LinkedList<VertexCell>();
		List<VertexCell> adjList13 = new LinkedList<VertexCell>();
		List<VertexCell> adjList14 = new LinkedList<VertexCell>();
		List<VertexCell> adjList15 = new LinkedList<VertexCell>();
		List<VertexCell> adjList16 = new LinkedList<VertexCell>();
		
		adjList1.add(new VertexCell(v3, 1));
		adjList1.add(new VertexCell(v5, 1));
		adjList1.add(new VertexCell(v14, 1.5));
		
		adjList2.add(new VertexCell(v6, 1));
		adjList2.add(new VertexCell(v7, 1));
		adjList2.add(new VertexCell(v3, 0.5));
		
		adjList3.add(new VertexCell(v1, 1));
		adjList3.add(new VertexCell(v2, 0.5));
		adjList3.add(new VertexCell(v5, 1));
		
		adjList4.add(new VertexCell(v5, 0.5));
		adjList4.add(new VertexCell(v11, 1));
		
		adjList5.add(new VertexCell(v1, 1));
		adjList5.add(new VertexCell(v4, 0.5));
		adjList5.add(new VertexCell(v3, 1));

		adjList6.add(new VertexCell(v2, 1));
		adjList6.add(new VertexCell(v15, 10));
		
		adjList7.add(new VertexCell(v2, 1));
		adjList7.add(new VertexCell(v8, 0.5));
		adjList7.add(new VertexCell(v10, 10));
		
		adjList8.add(new VertexCell(v7, 0.5));
		adjList8.add(new VertexCell(v9, 0.5));
		
		adjList9.add(new VertexCell(v8, 0.5));
		adjList9.add(new VertexCell(v10, 1));
		
		adjList10.add(new VertexCell(v7, 10));
		adjList10.add(new VertexCell(v9, 1));
		adjList10.add(new VertexCell(v11, 1));
		
		adjList11.add(new VertexCell(v4, 1));
		adjList11.add(new VertexCell(v10, 1));
		adjList11.add(new VertexCell(v12, 1));
		
		adjList12.add(new VertexCell(v11, 1));
		adjList12.add(new VertexCell(v13, 1));
		
		adjList13.add(new VertexCell(v12, 1));
		
		adjList14.add(new VertexCell(v1, 1.5));
		adjList14.add(new VertexCell(v15, 1));
		adjList14.add(new VertexCell(v16, 1));
		
		adjList15.add(new VertexCell(v14, 1));
		adjList15.add(new VertexCell(v6, 10));
		
		adjList16.add(new VertexCell(v14, 1));
		
		Graph g = new Graph(vertices, adjList1, adjList2, adjList3, adjList4, adjList5, adjList6, 
				            adjList7, adjList8, adjList9, adjList10, adjList11, adjList12, adjList13, adjList14, adjList15, adjList16);

		List<Edge> edges = g.getEdges();
		assertTrue( edges.size() == 19*2);
		
		List<Vertex> y = new LinkedList<Vertex>();
		List<Vertex> x = new LinkedList<Vertex>();
		List< List<Vertex> > star = g.starDecomp(v1, 1/3, 0.05, y, x);
		for(List<Vertex> Vk : star)
		{
			for(Vertex v: Vk)
				System.out.print(v.getID() + " ");
			System.out.println(" ");
		}
		System.out.println("Ball vertices:");
		for(Vertex yV : y)
			System.out.println(" " + yV.getID());

	}
	
	
	/*
	 * Test for directed weighted graph
	 */
	@Test
	public void testLowStretchTree() {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		Vertex v7 = new Vertex(7);
		Vertex v8 = new Vertex(8);
		Vertex v9 = new Vertex(9);
		Vertex v10 = new Vertex(10);
		Vertex v11 = new Vertex(11);
		Vertex v12 = new Vertex(12);
		Vertex v13 = new Vertex(13);
		Vertex v14 = new Vertex(14);
		Vertex v15 = new Vertex(15);
		Vertex v16 = new Vertex(16);
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);
		vertices.add(v5);
		vertices.add(v6);
		vertices.add(v7);
		vertices.add(v8);
		vertices.add(v9);
		vertices.add(v10);
		vertices.add(v11);
		vertices.add(v12);
		vertices.add(v13);
		vertices.add(v14);
		vertices.add(v15);
		vertices.add(v16);
		
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();
		List<VertexCell> adjList5 = new LinkedList<VertexCell>();
		List<VertexCell> adjList6 = new LinkedList<VertexCell>();
		List<VertexCell> adjList7 = new LinkedList<VertexCell>();
		List<VertexCell> adjList8 = new LinkedList<VertexCell>();
		List<VertexCell> adjList9 = new LinkedList<VertexCell>();
		List<VertexCell> adjList10 = new LinkedList<VertexCell>();
		List<VertexCell> adjList11 = new LinkedList<VertexCell>();
		List<VertexCell> adjList12 = new LinkedList<VertexCell>();
		List<VertexCell> adjList13 = new LinkedList<VertexCell>();
		List<VertexCell> adjList14 = new LinkedList<VertexCell>();
		List<VertexCell> adjList15 = new LinkedList<VertexCell>();
		List<VertexCell> adjList16 = new LinkedList<VertexCell>();
		
		adjList1.add(new VertexCell(v3, 1));
		adjList1.add(new VertexCell(v5, 1));
		adjList1.add(new VertexCell(v14, 1.5));
		
		adjList2.add(new VertexCell(v6, 1));
		adjList2.add(new VertexCell(v7, 1));
		adjList2.add(new VertexCell(v3, 0.5));
		
		adjList3.add(new VertexCell(v1, 1));
		adjList3.add(new VertexCell(v2, 0.5));
		adjList3.add(new VertexCell(v5, 1));
		
		adjList4.add(new VertexCell(v5, 0.5));
		adjList4.add(new VertexCell(v11, 1));
		
		adjList5.add(new VertexCell(v1, 1));
		adjList5.add(new VertexCell(v4, 0.5));
		adjList5.add(new VertexCell(v3, 1));

		adjList6.add(new VertexCell(v2, 1));
		adjList6.add(new VertexCell(v15, 10));
		
		adjList7.add(new VertexCell(v2, 1));
		adjList7.add(new VertexCell(v8, 0.5));
		adjList7.add(new VertexCell(v10, 10));
		
		adjList8.add(new VertexCell(v7, 0.5));
		adjList8.add(new VertexCell(v9, 0.5));
		
		adjList9.add(new VertexCell(v8, 0.5));
		adjList9.add(new VertexCell(v10, 1));
		
		adjList10.add(new VertexCell(v7, 10));
		adjList10.add(new VertexCell(v9, 1));
		adjList10.add(new VertexCell(v11, 1));
		
		adjList11.add(new VertexCell(v4, 1));
		adjList11.add(new VertexCell(v10, 1));
		adjList11.add(new VertexCell(v12, 1));
		
		adjList12.add(new VertexCell(v11, 1));
		adjList12.add(new VertexCell(v13, 1));
		
		adjList13.add(new VertexCell(v12, 1));
		
		adjList14.add(new VertexCell(v1, 1.5));
		adjList14.add(new VertexCell(v15, 1));
		adjList14.add(new VertexCell(v16, 1));
		
		adjList15.add(new VertexCell(v14, 1));
		adjList15.add(new VertexCell(v6, 10));
		
		adjList16.add(new VertexCell(v14, 1));
		
		Graph g = new Graph(vertices, adjList1, adjList2, adjList3, adjList4, adjList5, adjList6, 
				            adjList7, adjList8, adjList9, adjList10, adjList11, adjList12, adjList13, adjList14, adjList15, adjList16);

		List<Edge> edges = g.getEdges();
		assertTrue( edges.size() == 19*2);
		
		double betta = 0.5 / Math.ceil( Math.log(2*vertices.size() + 32) / Math.log(4./3) );

		List<Edge> bridges = new LinkedList<Edge>();
		List<Graph> T = g.lowStretchTree(v1, betta, bridges);
		
		System.out.println("betta = " + betta);
		for( Graph Ti : T)
			System.out.println(Ti.toString());
		
		System.out.println("Bridges: ");
		for( Edge e : bridges)
			System.out.println(e.toString());
	}
}