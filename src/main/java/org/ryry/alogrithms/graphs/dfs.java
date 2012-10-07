package org.ryry.alogrithms.graphs;


public class dfs {
	
	int vertexCount = 10;
	
	enum VertexState {
        White, Gray, Black 
    }

    public void DFS() {

          VertexState state[] = new VertexState[vertexCount];

          for (int i = 0; i < vertexCount; i++)

                state[i] = VertexState.White;

          runDFS(0, state);

    }   

    public void runDFS(int u, VertexState[] state) {

    	state[u] = VertexState.Gray;

    	for (int v = 0; v < vertexCount; v++)

    		if (isEdge(u, v) && state[v] == VertexState.White)

    			runDFS(v, state);

    	state[u] = VertexState.Black;

    }
    
    public boolean isEdge(int u, int v) {
    	return true;
    }
}
