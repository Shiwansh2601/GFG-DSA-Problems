<h2><a href="https://www.geeksforgeeks.org/problems/postfix-to-prefix-conversion/1">Postfix to Prefix Conversion</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p dir="ltr"><span style="font-size: 18px;">You are given a string <strong>s</strong> that represents the <strong>postfix </strong>form of a valid mathematical expression. Convert it to its <strong>prefix </strong>form.</span></p>
<p dir="ltr"><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> s = "ab+"
<strong>Output: "</strong>+ab"
<strong>Explanation:</strong> In prefix form, operator comes before operands.<br>Postfix to Infix: ab+ becomes a + b <br>Infix to Prefix: a + b becomes +ab </span></pre>
<pre><span style="font-size: 14pt;"><strong data-start="259" data-end="269">Input: </strong>s = "ab+c*"<br data-start="283" data-end="286"><strong data-start="286" data-end="297">Output:</strong> "*+abc"<br data-start="305" data-end="308" data-is-only-node=""><strong data-start="308" data-end="324">Explanation:</strong><br data-start="324" data-end="327">Postfix to Infix: ab+ becomes (a + b), then with c gives (a + b)*c<br data-start="403" data-end="406">Infix to Prefix: (a + b) becomes +ab, then with c gives *+abc</span></pre>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input:</strong><span style="font-size: 18px;"> s = "ABC/-AK/L-*"
</span><strong style="font-size: 18px;">Output: "</strong><span style="font-size: 18px;">*-A/BC-/AKL"
</span><strong style="font-size: 18px;">Explanation:</strong><span style="font-size: 18px;"> 
Postfix to infix: ABC/-AK/L-* becomes (A - (B / C)) * ((A / K) - L)
Convert left part to Prefix: (A - (B / C)) becomes -A/BC
Convert right part to Prefix: ((A / K) - L) becomes -/AKL
Combine both with * to get *-A/BC-/AKL</span></span></pre>
<p dir="ltr"><span style="font-size: 18px;"><strong>Constraints:</strong></span></p>
<p dir="ltr"><span style="font-size: 18px;">3 ≤ s.size() ≤ 1.6*10<sup>4</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Stack</code>&nbsp;