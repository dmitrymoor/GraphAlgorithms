package ch.uzh.ifi.GraphAlgorithms;

public class VertexMDP extends Vertex
{

	public VertexMDP(int id, int time)
	{
		super(id);
		setTime(time);
		_utility = 0.;
	}
	
	public void setTime(int t)
	{
		_timeStamp = t;
	}
	
	public int getTime()
	{
		return _timeStamp;
	}
	
	public void setUtility(double u)
	{
		_utility = u;
	}
	
	public double getUtility()
	{
		return _utility;
	}
	
	private int _timeStamp;
	private double _utility;
}
