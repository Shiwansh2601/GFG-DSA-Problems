<h2><a href="https://www.geeksforgeeks.org/problems/disjoint-set-union-find/1">Disjoint set (Union-Find)</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p data-start="199" data-end="296">You are given <strong><code data-start="213" data-end="216">n</code></strong> elements numbered from <strong><code data-start="240" data-end="243">1</code></strong> to <strong><code data-start="247" data-end="250">n</code></strong>. Initially, each element is in its own group.</p>
<p data-start="298" data-end="372">You need to process <strong><code data-start="318" data-end="321">k</code></strong> queries. Each query is one of the following types:</p>
<ol data-start="374" data-end="677">
<li data-start="374" data-end="511">
<p data-start="377" data-end="511"><strong data-start="377" data-end="390">UNION x z</strong> – Merge the groups that contain elements <strong><code data-start="432" data-end="435">x</code></strong> and <strong><code data-start="440" data-end="443">z</code></strong>. After this operation, both elements will belong to the same group.</p>
</li>
<li data-start="512" data-end="677">
<p data-start="515" data-end="677"><strong data-start="515" data-end="525">FIND x</strong> – Output the <strong data-start="539" data-end="566">ultimate representative</strong> of the group containing element <strong><code data-start="599" data-end="602">x</code></strong>. The representative is the element that acts as the "leader" of the group.</p>
</li>
</ol>
<p data-start="679" data-end="735">Initially, every element is the leader of its own group.</p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 5, k = 4, queries[] = {{find 4}, {find 1}, {unionSet 3 1}, {find 3}}
<strong>Output: </strong>4 1 1
<strong>Explanation:</strong>
1. The parent of 4 is 4. Hence the output is 4.
2. The parent of 1 is 1. Hence the output is 1.
3. After performing unionSet 3 1, parent of 3 becomes 1, since, parent of 1 is currently 1 itself.
4. The parent of 3 is now 1. Hence, the output is 1.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= n,k &lt;= 100</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Samsung</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>union-find</code>&nbsp;<code>Algorithms</code>&nbsp;