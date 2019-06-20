import edu.stanford.nlp.trees.Tree;

public class ParseResult {
    public boolean success;
    public Tree parse;
    public double score;
    public ParseResult(boolean s, Tree p, double sc) { success=s; parse=p; score=sc; }
}
