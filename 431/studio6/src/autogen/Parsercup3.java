
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Jul 02 19:34:00 CDT 2012
//----------------------------------------------------

package autogen;

import common.Listing;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Jul 02 19:34:00 CDT 2012
  */
public class Parsercup3 extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parsercup3() {super();}

  /** Constructor which sets the default scanner. */
  public Parsercup3(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parsercup3(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\035\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\005\000\002\004\003\000\002\004\004" +
    "\000\002\004\005\000\002\004\005\000\002\004\003\000" +
    "\002\004\004\000\002\004\005\000\002\004\005\000\002" +
    "\004\003\000\002\004\004\000\002\004\005\000\002\004" +
    "\005\000\002\005\003\000\002\005\003\000\002\005\003" +
    "\000\002\007\003\000\002\007\003\000\002\007\003\000" +
    "\002\007\003\000\002\006\003\000\002\006\003\000\002" +
    "\006\003\000\002\006\003\000\002\010\003\000\002\010" +
    "\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\041\000\026\030\020\031\010\032\016\033\007\034" +
    "\015\035\005\036\023\037\013\040\006\041\022\001\002" +
    "\000\020\030\020\031\010\032\016\033\007\040\006\041" +
    "\022\042\ufff9\001\002\000\020\030\uffe9\031\uffe9\032\uffe9" +
    "\033\uffe9\040\uffe9\041\uffe9\042\uffe9\001\002\000\024\030" +
    "\uffe6\031\uffe6\032\uffe6\033\uffe6\034\uffe6\035\uffe6\036\uffe6" +
    "\037\uffe6\042\uffe6\001\002\000\020\034\uffeb\035\uffeb\036" +
    "\uffeb\037\uffeb\040\uffeb\041\uffeb\042\uffeb\001\002\000\020" +
    "\034\uffee\035\uffee\036\uffee\037\uffee\040\uffee\041\uffee\042" +
    "\uffee\001\002\000\030\002\036\030\020\031\010\032\016" +
    "\033\007\034\015\035\005\036\023\037\013\040\006\041" +
    "\022\001\002\000\004\042\034\001\002\000\020\030\uffe7" +
    "\031\uffe7\032\uffe7\033\uffe7\040\uffe7\041\uffe7\042\uffe7\001" +
    "\002\000\020\034\015\035\005\036\023\037\013\040\006" +
    "\041\022\042\ufffd\001\002\000\020\030\uffea\031\uffea\032" +
    "\uffea\033\uffea\040\uffea\041\uffea\042\uffea\001\002\000\020" +
    "\034\uffec\035\uffec\036\uffec\037\uffec\040\uffec\041\uffec\042" +
    "\uffec\001\002\000\030\002\uffff\030\uffff\031\uffff\032\uffff" +
    "\033\uffff\034\uffff\035\uffff\036\uffff\037\uffff\040\uffff\041" +
    "\uffff\001\002\000\020\034\uffed\035\uffed\036\uffed\037\uffed" +
    "\040\uffed\041\uffed\042\uffed\001\002\000\024\030\020\031" +
    "\010\032\016\033\007\034\015\035\005\036\023\037\013" +
    "\042\ufff5\001\002\000\024\030\uffe5\031\uffe5\032\uffe5\033" +
    "\uffe5\034\uffe5\035\uffe5\036\uffe5\037\uffe5\042\uffe5\001\002" +
    "\000\020\030\uffe8\031\uffe8\032\uffe8\033\uffe8\040\uffe8\041" +
    "\uffe8\042\uffe8\001\002\000\014\030\020\031\010\032\016" +
    "\033\007\042\ufff4\001\002\000\012\034\015\035\005\036" +
    "\023\037\013\001\002\000\004\042\ufff2\001\002\000\004" +
    "\042\ufff3\001\002\000\010\040\006\041\022\042\ufffc\001" +
    "\002\000\012\034\015\035\005\036\023\037\013\001\002" +
    "\000\004\042\ufffa\001\002\000\004\042\ufffb\001\002\000" +
    "\004\043\035\001\002\000\030\002\ufffe\030\ufffe\031\ufffe" +
    "\032\ufffe\033\ufffe\034\ufffe\035\ufffe\036\ufffe\037\ufffe\040" +
    "\ufffe\041\ufffe\001\002\000\004\002\000\001\002\000\030" +
    "\002\001\030\001\031\001\032\001\033\001\034\001\035" +
    "\001\036\001\037\001\040\001\041\001\001\002\000\012" +
    "\030\020\031\010\032\016\033\007\001\002\000\010\040" +
    "\006\041\022\042\ufff8\001\002\000\004\042\ufff7\001\002" +
    "\000\004\042\ufff6\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\041\000\016\002\010\003\016\004\011\006\003\007" +
    "\013\010\020\001\001\000\006\007\040\010\037\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\003\036\004\011\006\003\007\013" +
    "\010\020\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\006\027\010\030\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\006" +
    "\023\007\024\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\007\026\001\001\000\004\006\025\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\010\032\001\001" +
    "\000\004\006\031\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\007\042\001\001\000\004\010" +
    "\041\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parsercup3$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parsercup3$actions(this);
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
    return action_obj.CUP$Parsercup3$do_action(act_num, parser, stack, top);
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
class CUP$Parsercup3$actions {
  private final Parsercup3 parser;

  /** Constructor */
  CUP$Parsercup3$actions(Parsercup3 parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parsercup3$do_action(
    int                        CUP$Parsercup3$act_num,
    java_cup.runtime.lr_parser CUP$Parsercup3$parser,
    java.util.Stack            CUP$Parsercup3$stack,
    int                        CUP$Parsercup3$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parsercup3$result;

      /* select the action based on the action number */
      switch (CUP$Parsercup3$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // Abstractness ::= NONABSTRACT 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Abstractness",6, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // Abstractness ::= ABSTRACT 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Abstractness",6, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // Type ::= OBJECT 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Type",4, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // Type ::= FLOAT 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Type",4, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // Type ::= INT 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Type",4, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // Type ::= VOID 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Type",4, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Access ::= PACKAGE 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Access",5, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Access ::= PROTECTED 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Access",5, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Access ::= PRIVATE 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Access",5, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Access ::= PUBLIC 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Access",5, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Mod ::= Abstractness 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Mod",3, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Mod ::= Type 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Mod",3, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Mod ::= Access 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Mod",3, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Mods ::= Abstractness Access Type 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Mods",2, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.elementAt(CUP$Parsercup3$top-2)), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Mods ::= Abstractness Type Access 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Mods",2, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.elementAt(CUP$Parsercup3$top-2)), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Mods ::= Abstractness Type 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Mods",2, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.elementAt(CUP$Parsercup3$top-1)), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Mods ::= Abstractness 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Mods",2, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Mods ::= Type Abstractness Access 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Mods",2, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.elementAt(CUP$Parsercup3$top-2)), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Mods ::= Type Access Abstractness 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Mods",2, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.elementAt(CUP$Parsercup3$top-2)), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Mods ::= Type Access 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Mods",2, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.elementAt(CUP$Parsercup3$top-1)), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Mods ::= Type 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Mods",2, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Mods ::= Access Abstractness Type 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Mods",2, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.elementAt(CUP$Parsercup3$top-2)), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Mods ::= Access Type Abstractness 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Mods",2, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.elementAt(CUP$Parsercup3$top-2)), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Mods ::= Access Type 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Mods",2, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.elementAt(CUP$Parsercup3$top-1)), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Mods ::= Access 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Mods",2, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Dcl ::= Mods name semi 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Dcl",1, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.elementAt(CUP$Parsercup3$top-2)), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Dcls ::= Dcl 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Dcls",0, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Dcls EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.elementAt(CUP$Parsercup3$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.elementAt(CUP$Parsercup3$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parsercup3$stack.elementAt(CUP$Parsercup3$top-1)).value;
		RESULT = start_val;
              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.elementAt(CUP$Parsercup3$top-1)), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parsercup3$parser.done_parsing();
          return CUP$Parsercup3$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Dcls ::= Dcls Dcl 
            {
              Object RESULT =null;

              CUP$Parsercup3$result = parser.getSymbolFactory().newSymbol("Dcls",0, ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.elementAt(CUP$Parsercup3$top-1)), ((java_cup.runtime.Symbol)CUP$Parsercup3$stack.peek()), RESULT);
            }
          return CUP$Parsercup3$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

