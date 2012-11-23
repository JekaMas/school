
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Jul 02 19:53:41 CDT 2012
//----------------------------------------------------

package autogen;

import common.Listing;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Jul 02 19:53:41 CDT 2012
  */
public class Parsercup5 extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parsercup5() {super();}

  /** Constructor which sets the default scanner. */
  public Parsercup5(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parsercup5(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\005\000\002\002\006\000\002\002\004\000\002\002" +
    "\003\000\002\003\004\000\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\013\000\006\004\004\014\006\001\002\000\004\002" +
    "\uffff\001\002\000\004\002\015\001\002\000\004\012\007" +
    "\001\002\000\004\013\010\001\002\000\010\004\004\014" +
    "\006\015\011\001\002\000\006\004\004\014\006\001\002" +
    "\000\004\002\ufffd\001\002\000\004\002\001\001\002\000" +
    "\004\002\ufffe\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\013\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\002\011\003\012\001\001\000\004\002\013\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parsercup5$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parsercup5$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parsercup5$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parsercup5$actions {
  private final Parsercup5 parser;

  /** Constructor */
  CUP$Parsercup5$actions(Parsercup5 parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parsercup5$do_action(
    int                        CUP$Parsercup5$act_num,
    java_cup.runtime.lr_parser CUP$Parsercup5$parser,
    java.util.Stack            CUP$Parsercup5$stack,
    int                        CUP$Parsercup5$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parsercup5$result;

      /* select the action based on the action number */
      switch (CUP$Parsercup5$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // R ::= S 
            {
              Object RESULT =null;

              CUP$Parsercup5$result = parser.getSymbolFactory().newSymbol("R",1, ((java_cup.runtime.Symbol)CUP$Parsercup5$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parsercup5$stack.peek()), RESULT);
            }
          return CUP$Parsercup5$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // R ::= ELSE S 
            {
              Object RESULT =null;

              CUP$Parsercup5$result = parser.getSymbolFactory().newSymbol("R",1, ((java_cup.runtime.Symbol)CUP$Parsercup5$stack.elementAt(CUP$Parsercup5$top-1)), ((java_cup.runtime.Symbol)CUP$Parsercup5$stack.peek()), RESULT);
            }
          return CUP$Parsercup5$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // S ::= x 
            {
              Object RESULT =null;

              CUP$Parsercup5$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$Parsercup5$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parsercup5$stack.peek()), RESULT);
            }
          return CUP$Parsercup5$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= S EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parsercup5$stack.elementAt(CUP$Parsercup5$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parsercup5$stack.elementAt(CUP$Parsercup5$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parsercup5$stack.elementAt(CUP$Parsercup5$top-1)).value;
		RESULT = start_val;
              CUP$Parsercup5$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parsercup5$stack.elementAt(CUP$Parsercup5$top-1)), ((java_cup.runtime.Symbol)CUP$Parsercup5$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parsercup5$parser.done_parsing();
          return CUP$Parsercup5$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // S ::= IF lparen rparen R 
            {
              Object RESULT =null;

              CUP$Parsercup5$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$Parsercup5$stack.elementAt(CUP$Parsercup5$top-3)), ((java_cup.runtime.Symbol)CUP$Parsercup5$stack.peek()), RESULT);
            }
          return CUP$Parsercup5$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

