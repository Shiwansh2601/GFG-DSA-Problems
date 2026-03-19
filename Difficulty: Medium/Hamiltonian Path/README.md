<h2><a href="https://www.geeksforgeeks.org/problems/hamiltonian-path2522/1">Hamiltonian Path</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p data-start="24" data-end="245"><span style="font-size: 14pt;">Given an undirected graph with <strong>n</strong> vertices and <strong>m</strong> edges, your task is to determine if a Hamiltonian path exists in the graph. </span></p>
<p data-start="24" data-end="245"><span style="font-size: 14pt;">A<a href="https://www.geeksforgeeks.org/hamiltonian-cycle/"> <strong data-start="154" data-end="174">Hamiltonian path</strong></a> is a path in an undirected graph that visits each vertex exactly once.</span></p>
<p data-start="247" data-end="278"><span style="font-size: 14pt;">You are provided the following:</span></p>
<p><span style="font-size: 14pt;"> </span></p>
<ul data-start="280" data-end="498">
<li data-start="280" data-end="325"><span style="font-size: 14pt;"><strong data-start="282" data-end="287">n</strong>: The number of vertices in the graph.</span></li>
<li data-start="326" data-end="368"><span style="font-size: 14pt;"><strong data-start="328" data-end="333">m</strong>: The number of edges in the graph.</span></li>
<li data-start="369" data-end="498"><span style="font-size: 14pt;"><strong data-start="371" data-end="384">edges[][]</strong>: A 2D list where each element edges[i] represents an edge between two vertices edges[i][0] and edges[i][1].&nbsp;</span></li>
</ul>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 4, m = 4
edges[][]= { {1,2}, {2,3}, {3,4}, {2,4} }
<strong>Output: </strong>1 
<strong>Explanation: </strong>There is a hamiltonian path: 1 -&gt; 2 -&gt; 3 -&gt; 4 </span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 4, m = 3 
edges[][] = { {1,2}, {2,3}, {2,4} } 
<strong>Output: </strong>0 
<strong>Explanation: </strong>It can be proved that there is no hamiltonian path in the given graph.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 ≤ n ≤ 10</span><br><span style="font-size: 18px;">1 ≤ m ≤ 15</span><br><span style="font-size: 18px;">Size of edges[i] is 2</span><br><span style="font-size: 18px;">1 ≤ edges[i][0],edges[i][1] ≤ n</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>DFS</code>&nbsp;<code>Graph</code>&nbsp;<code>Backtracking</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;