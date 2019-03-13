import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Bc {
    public static void main(String args[]) throws Exception{
        System.out.println("BC with visitors");
        CharStream str = CharStreams.fromFileName("tests/test.bc");
        BcLexer lex = new BcLexer(str);
        TokenStream tok = new CommonTokenStream(lex);
        BcParser parser = new BcParser(tok);
        ParseTree tree = parser.s();
        BcBaseVisitor eval = new BcBaseVisitor();
        System.out.println("S Expression: " + tree.toStringTree(parser));
        eval.visit(tree);
    }
}