package ch.uzh.ifi.GraphAlgorithms;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class SpectralGraphTest {

	
	@Test
	public void testContractIt()
	{
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		Vertex v7 = new Vertex(7);
		List<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);
		vertices.add(v5);
		vertices.add(v6);
		vertices.add(v7);
		
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();
		List<VertexCell> adjList5 = new LinkedList<VertexCell>();
		List<VertexCell> adjList6 = new LinkedList<VertexCell>();
		List<VertexCell> adjList7 = new LinkedList<VertexCell>();
		
		adjList1.add( new VertexCell(v3, 0.1) );
		adjList1.add( new VertexCell(v2, 1) );
		adjList1.add( new VertexCell(v4, 1) );
		
		adjList2.add( new VertexCell(v1, 1) );
		
		adjList3.add( new VertexCell(v1, 0.1) );
		adjList3.add( new VertexCell(v5, 1) );
		adjList3.add( new VertexCell(v6, 1) );
		
		adjList4.add( new VertexCell(v1, 1) );
		adjList4.add( new VertexCell(v7, 1) );
		
		adjList5.add( new VertexCell(v3, 1) );
		adjList5.add( new VertexCell(v7, 1) );
		
		adjList6.add( new VertexCell(v3, 1) );
		
		adjList7.add( new VertexCell(v4, 1) );
		adjList7.add( new VertexCell(v5, 1) );
		
		SpectralGraph g = new SpectralGraph(vertices, adjList1, adjList2, adjList3, adjList4, adjList5, adjList6, adjList7 );
		Graph contractedGraph = g.contractIt(0.5);
		
		assertTrue( contractedGraph.getVertices().get(0).getID() == 1);
		assertTrue( contractedGraph.getVertices().get(1).getID() == 2);
		assertTrue( contractedGraph.getVertices().get(2).getID() == 4);
		assertTrue( contractedGraph.getVertices().get(3).getID() == 5);
		assertTrue( contractedGraph.getVertices().get(4).getID() == 6);
		assertTrue( contractedGraph.getVertices().get(5).getID() == 7);
		
		int idx = contractedGraph.getVertices().get(0).getAdjacencyListIndex();
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(0)._v.getID() == 2  );
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(1)._v.getID() == 4  );
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(2)._v.getID() == 5  );
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(3)._v.getID() == 6  );
		assertTrue( contractedGraph.getAdjacencyLists().get(idx).size() == 4);
		
		idx = contractedGraph.getVertices().get(1).getAdjacencyListIndex();
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(0)._v.getID() == 1  );
		assertTrue( contractedGraph.getAdjacencyLists().get(idx).size() == 1);
		
		idx = contractedGraph.getVertices().get(2).getAdjacencyListIndex();
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(0)._v.getID() == 1  );
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(1)._v.getID() == 7  );
		assertTrue( contractedGraph.getAdjacencyLists().get(idx).size() == 2);
		
		idx = contractedGraph.getVertices().get(3).getAdjacencyListIndex();
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(0)._v.getID() == 1  );
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(1)._v.getID() == 7  );
		assertTrue( contractedGraph.getAdjacencyLists().get(idx).size() == 2);
		
		idx = contractedGraph.getVertices().get(4).getAdjacencyListIndex();
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(0)._v.getID() == 1  );
		assertTrue( contractedGraph.getAdjacencyLists().get(idx).size() == 1);
		
		idx = contractedGraph.getVertices().get(5).getAdjacencyListIndex();
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(0)._v.getID() == 4  );
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(1)._v.getID() == 5  );
		assertTrue( contractedGraph.getAdjacencyLists().get(idx).size() == 2);
	}

	@Test
	public void testContractIt1()
	{
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		Vertex v7 = new Vertex(7);
		Vertex v8 = new Vertex(8);
		Vertex v9 = new Vertex(9);
		Vertex v10= new Vertex(10);
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
		
		List<VertexCell> adjList1 = new LinkedList<VertexCell>();
		List<VertexCell> adjList2 = new LinkedList<VertexCell>();
		List<VertexCell> adjList3 = new LinkedList<VertexCell>();
		List<VertexCell> adjList4 = new LinkedList<VertexCell>();
		List<VertexCell> adjList5 = new LinkedList<VertexCell>();
		List<VertexCell> adjList6 = new LinkedList<VertexCell>();
		List<VertexCell> adjList7 = new LinkedList<VertexCell>();
		List<VertexCell> adjList8 = new LinkedList<VertexCell>();
		List<VertexCell> adjList9 = new LinkedList<VertexCell>();
		List<VertexCell> adjList10= new LinkedList<VertexCell>();
		
		adjList1.add( new VertexCell(v3, 0.1) );
		adjList1.add( new VertexCell(v2, 1) );
		adjList1.add( new VertexCell(v4, 1) );
		adjList1.add( new VertexCell(v10, 0.1) );
		
		adjList2.add( new VertexCell(v1, 1) );
		
		adjList3.add( new VertexCell(v1, 0.1) );
		adjList3.add( new VertexCell(v5, 1) );
		adjList3.add( new VertexCell(v6, 1) );
		adjList3.add( new VertexCell(v8, 0.1) );
		
		adjList4.add( new VertexCell(v1, 1) );
		adjList4.add( new VertexCell(v7, 1) );
		
		adjList5.add( new VertexCell(v3, 1) );
		adjList5.add( new VertexCell(v7, 1) );
		
		adjList6.add( new VertexCell(v3, 1) );
		
		adjList7.add( new VertexCell(v4, 1) );
		adjList7.add( new VertexCell(v5, 1) );
		
		adjList8.add( new VertexCell(v3, 0.1) );
		adjList8.add( new VertexCell(v9, 1) );
		
		adjList9.add( new VertexCell(v8, 1) );
		
		adjList10.add( new VertexCell(v1, 0.1) );
		
		SpectralGraph g = new SpectralGraph(vertices, adjList1, adjList2, adjList3, adjList4, adjList5, adjList6, adjList7, adjList8, adjList9, adjList10 );
		Graph contractedGraph = g.contractIt(0.5);
				
		assertTrue( contractedGraph.getVertices().get(0).getID() == 2);
		assertTrue( contractedGraph.getVertices().get(1).getID() == 4);
		assertTrue( contractedGraph.getVertices().get(2).getID() == 5);
		assertTrue( contractedGraph.getVertices().get(3).getID() == 6);
		assertTrue( contractedGraph.getVertices().get(4).getID() == 7);
		assertTrue( contractedGraph.getVertices().get(5).getID() == 8);
		assertTrue( contractedGraph.getVertices().get(6).getID() == 9);
		assertTrue( contractedGraph.getVertices().size() == 7);
		
		int idx = contractedGraph.getVertices().get(0).getAdjacencyListIndex();
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(0)._v.getID() == 8  );
		assertTrue( contractedGraph.getAdjacencyLists().get(idx).size() == 1);
		
		idx = contractedGraph.getVertices().get(1).getAdjacencyListIndex();
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(0)._v.getID() == 8  );
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(1)._v.getID() == 7  );
		assertTrue( contractedGraph.getAdjacencyLists().get(idx).size() == 2);
		
		idx = contractedGraph.getVertices().get(2).getAdjacencyListIndex();
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(0)._v.getID() == 8  );
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(1)._v.getID() == 7  );
		assertTrue( contractedGraph.getAdjacencyLists().get(idx).size() == 2);
		
		idx = contractedGraph.getVertices().get(3).getAdjacencyListIndex();
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(0)._v.getID() == 8  );
		assertTrue( contractedGraph.getAdjacencyLists().get(idx).size() == 1);
		
		idx = contractedGraph.getVertices().get(4).getAdjacencyListIndex();
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(0)._v.getID() == 4  );
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(1)._v.getID() == 5  );
		assertTrue( contractedGraph.getAdjacencyLists().get(idx).size() == 2);
		
		idx = contractedGraph.getVertices().get(5).getAdjacencyListIndex();
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(0)._v.getID() == 9  );
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(1)._v.getID() == 2  );
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(2)._v.getID() == 4  );
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(3)._v.getID() == 5  );
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(4)._v.getID() == 6  );
		assertTrue( contractedGraph.getAdjacencyLists().get(idx).size() == 5);
		
		idx = contractedGraph.getVertices().get(6).getAdjacencyListIndex();
		assertTrue( contractedGraph.getAdjacencyLists().get( idx ).get(0)._v.getID() == 8  );
		assertTrue( contractedGraph.getAdjacencyLists().get(idx).size() == 1);
	}
	
	@Test
	public void testLowStretchTreeWithContraction()
	{
		
	}
	

}
