package ch.uzh.ifi.GraphAlgorithms;

import static org.junit.Assert.*;
import org.junit.Test;

public class testPriorityQueueMax {

	@Test
	public void testMaxPriorityQueue() {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		VertexCell vc1 = new VertexCell(v1, 0.1);
		VertexCell vc2 = new VertexCell(v2, 0.2);
		VertexCell vc3 = new VertexCell(v3, 0.3);
		VertexCell vc4 = new VertexCell(v4, 0.4);
		VertexCell vc5 = new VertexCell(v5, 0.5);
		
		PriorityQueueMax<VertexCell> q = new PriorityQueueMax<VertexCell>(10);
		vc1._v.setShortestPathEst(0.1, 0);
		vc2._v.setShortestPathEst(0.2, 0);
		vc3._v.setShortestPathEst(0.3, 0);
		vc4._v.setShortestPathEst(0.4, 0);
		vc5._v.setShortestPathEst(0.5, 0);

		q.insert(vc1);
		q.insert(vc2);
		q.insert(vc3);
		q.insert(vc5);
		q.insert(vc4);
		//System.out.println("Test " + q.toString());
		assertTrue(q.max()._v.getID()==5);
		assertTrue(q.extractMax() == vc5);
		assertTrue(q.max()._v.getID()==4);
		assertTrue(q.extractMax() == vc4);
		assertTrue(q.max()._v.getID()==3);
		assertTrue(q.extractMax() == vc3);
		assertTrue(q.max()._v.getID()==2);
		assertTrue(q.extractMax() == vc2);
		assertTrue(q.max()._v.getID()==1);
		assertTrue(q.extractMax() == vc1);
	}

	@Test
	public void testMinPriorityQueue() {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		VertexCell vc1 = new VertexCell(v1, 0.1);
		VertexCell vc2 = new VertexCell(v2, 0.2);
		VertexCell vc3 = new VertexCell(v3, 0.3);
		VertexCell vc4 = new VertexCell(v4, 0.4);
		VertexCell vc5 = new VertexCell(v5, 0.5);
		
		PriorityQueueMin<VertexCell> q = new PriorityQueueMin<VertexCell>(10);
		vc1._v.setShortestPathEst(0.1, 0);
		vc2._v.setShortestPathEst(0.2, 0);
		vc3._v.setShortestPathEst(0.3, 0);
		vc4._v.setShortestPathEst(0.4, 0);
		vc5._v.setShortestPathEst(0.5, 0);

		q.insert(vc5, 0);
		q.insert(vc1, 0);
		q.insert(vc3, 0);
		q.insert(vc2, 0);
		q.insert(vc4, 0);
		//System.out.println("Test " + q.toString());
		assertTrue(q.min()._v.getID()==1);
		assertTrue(q.extractMin(0) == vc1);
		assertTrue(q.min()._v.getID()==2);
		assertTrue(q.extractMin(0) == vc2);
		assertTrue(q.min()._v.getID()==3);
		assertTrue(q.extractMin(0) == vc3);
		assertTrue(q.min()._v.getID()==4);
		assertTrue(q.extractMin(0) == vc4);
		assertTrue(q.min()._v.getID()==5);
		assertTrue(q.extractMin(0) == vc5);
	}
}
