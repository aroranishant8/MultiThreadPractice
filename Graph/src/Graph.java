import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
	
	private int numberOfEdges;
	private List<Integer>[] adjListArray;
	
	public Graph(int numberOfEdges)
	{
		this.numberOfEdges=numberOfEdges;	
		adjListArray=new LinkedList[numberOfEdges];
		for(int i=0;i<numberOfEdges;i++)
		{
			adjListArray[i]=new LinkedList<Integer>();			
		}
	}
	


	void addEdge(int ui,int vi)
	{
		adjListArray[ui].add(vi);
		
	}
	
	void dfs(int source)
	{
		boolean[] visited=new boolean[numberOfEdges];
		dfsUtil(source,visited);
		
	}
	
	void dfsUtil(int source, boolean[] visited)
	{
		
		if(visited[source]!=true)
		{
			System.out.println(source);
			visited[source]=true;
			for(Integer in:adjListArray[source])
			{
				dfsUtil(in,visited);			
			}
		}
		
	}

	
	void bfs(int source)
	{
		Queue q=new LinkedList<Integer>();
		q.add(source);	
		System.out.print(q.poll());
		for(int i:adjListArray[source])
		{ 
			q.add(i);
		}
		System.out.println(q.poll());
		System.out.println(q.poll());
		
		for(int i:adjListArray[source])
		{
			q.add(i);
		}
		System.out.println(q);
		
	}
	 
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			StringBuffer sb=new StringBuffer();
			int j=0;
			for(List<Integer> i:adjListArray)
			{
				sb.append(j++);
				sb.append(i);
				sb.append("\n");
			}
			return sb.toString();
		}

}
