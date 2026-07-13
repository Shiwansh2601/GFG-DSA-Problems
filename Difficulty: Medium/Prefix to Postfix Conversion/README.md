<h2><a href="https://www.geeksforgeeks.org/problems/prefix-to-postfix-conversion/1">Prefix to Postfix Conversion</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p dir="ltr"><span style="font-size: 18px;">You are given a string <strong>s</strong> that represents the <strong>prefix</strong> form of a valid mathematical expression. Convert it to its <strong>postfix</strong> form.</span></p>
<p dir="ltr"><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre dir="ltr"><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">s = "+AB"<br><strong>Output: </strong>"AB+"<br><strong>Explanation:</strong> In postfix form, operands come first followed by operator.<br>Prefix to Infix: +AB becomes A + B<br>Infix to Postfix: A + B becomes AB+<br></span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> s = "*+ABC"<br><strong>Output:</strong> </span><span style="font-size: 14pt;">AB+C*<br><strong>Explanation:</strong> <br>Prefix to Infix: *+ABC becomes (A + B)*C<br>Infix to Postfix: (A + B)*C becomes AB+C* </span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> s = "</span><span style="font-size: 18px;">*-A/BC-/AKL"</span>
<strong><span style="font-size: 18px;">Output: "</span></strong><span style="font-size: 18px;">ABC/-AK/L-*"</span>
<span style="font-size: 18px;"><strong style="font-size: 18px;">Explanation:<br></strong><span style="font-size: 18px;">Prefix to infix: *-A/BC-/AKL becomes (A - (B / C)) * ((A / K) - L)
Convert left part to Postfix: (A - (B / C)) becomes ABC/-
Convert right part to Postfix: ((A / K) - L) becomes AK/L-
Combine both with * to get ABC/-AK/L-*</span></span>
</pre>
<p dir="ltr"><strong><span style="font-size: 18px;">Constraints:<br></span></strong><span style="font-size: 14pt;">3 ≤ s.size() ≤ 100</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Stack</code>&nbsp;