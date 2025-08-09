
import java_cup.runtime.*;
import java.io.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b beta 20140226 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\112\000\002\002\004\000\002\002\004\000\002\016" +
    "\004\000\002\016\002\000\002\017\005\000\002\017\005" +
    "\000\002\022\003\000\002\022\003\000\002\020\003\000" +
    "\002\031\002\000\002\020\006\000\002\021\004\000\002" +
    "\023\002\000\002\023\006\000\002\003\004\000\002\003" +
    "\003\000\002\003\004\000\002\004\003\000\002\004\003" +
    "\000\002\004\006\000\002\004\005\000\002\004\004\000" +
    "\002\027\011\000\002\027\003\000\002\027\003\000\002" +
    "\027\003\000\002\027\005\000\002\030\006\000\002\030" +
    "\011\000\002\005\004\000\002\005\006\000\002\005\006" +
    "\000\002\005\006\000\002\006\005\000\002\006\005\000" +
    "\002\024\005\000\002\024\005\000\002\024\005\000\002" +
    "\024\005\000\002\013\002\000\002\014\002\000\002\015" +
    "\006\000\002\025\005\000\002\025\005\000\002\025\005" +
    "\000\002\025\005\000\002\012\002\000\002\007\005\000" +
    "\002\007\005\000\002\007\004\000\002\007\006\000\002" +
    "\007\005\000\002\007\005\000\002\007\005\000\002\007" +
    "\005\000\002\007\005\000\002\007\005\000\002\007\005" +
    "\000\002\007\005\000\002\007\005\000\002\007\003\000" +
    "\002\007\003\000\002\007\003\000\002\007\004\000\002" +
    "\007\004\000\002\007\005\000\002\010\003\000\002\010" +
    "\003\000\002\011\003\000\002\011\003\000\002\026\003" +
    "\000\002\026\006\000\002\026\006\000\002\026\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\217\000\022\003\ufffe\006\ufffe\007\ufffe\010\ufffe\013" +
    "\ufffe\016\ufffe\042\ufffe\043\ufffe\001\002\000\022\003\024" +
    "\006\023\007\014\010\013\013\015\016\026\042\025\043" +
    "\007\001\002\000\004\002\006\001\002\000\004\002\001" +
    "\001\002\000\006\003\ufffa\013\ufffa\001\002\000\024\002" +
    "\uffe8\003\uffe8\006\uffe8\007\uffe8\010\uffe8\012\uffe8\013\uffe8" +
    "\016\uffe8\017\uffe8\001\002\000\022\003\uffff\006\uffff\007" +
    "\uffff\010\uffff\013\uffff\016\uffff\042\uffff\043\uffff\001\002" +
    "\000\006\003\207\013\205\001\002\000\006\003\171\014" +
    "\172\001\002\000\006\003\140\014\141\001\002\000\044" +
    "\003\uffbb\015\uffbb\020\uffbb\022\132\024\uffbb\025\uffbb\026" +
    "\uffbb\027\uffbb\030\uffbb\031\uffbb\032\uffbb\033\uffbb\034\uffbb" +
    "\035\uffbb\036\uffbb\037\uffbb\040\uffbb\001\002\000\020\002" +
    "\000\003\117\006\023\007\014\010\013\013\015\016\026" +
    "\001\002\000\024\002\uffea\003\uffea\006\uffea\007\uffea\010" +
    "\uffea\012\uffea\013\uffea\016\uffea\017\uffea\001\002\000\006" +
    "\020\125\036\124\001\002\000\024\002\uffe9\003\uffe9\006" +
    "\uffe9\007\uffe9\010\uffe9\012\uffe9\013\uffe9\016\uffe9\017\uffe9" +
    "\001\002\000\024\002\ufff0\003\ufff0\006\ufff0\007\ufff0\010" +
    "\ufff0\012\ufff0\013\ufff0\016\ufff0\017\ufff0\001\002\000\006" +
    "\003\120\013\015\001\002\000\024\003\117\006\023\007" +
    "\014\010\013\013\015\016\026\020\037\023\041\036\036" +
    "\001\002\000\006\003\ufffb\013\ufffb\001\002\000\016\003" +
    "\031\006\023\007\014\010\013\013\015\016\026\001\002" +
    "\000\024\002\uffef\003\uffef\006\uffef\007\uffef\010\uffef\012" +
    "\uffef\013\uffef\016\uffef\017\uffef\001\002\000\022\002\ufff2" +
    "\003\ufff2\006\ufff2\007\ufff2\010\ufff2\013\ufff2\016\ufff2\017" +
    "\ufff2\001\002\000\026\003\117\006\023\007\014\010\013" +
    "\013\015\016\026\017\115\020\037\023\041\036\036\001" +
    "\002\000\020\003\035\006\023\007\014\010\013\013\015" +
    "\016\026\017\033\001\002\000\024\002\uffe7\003\uffe7\006" +
    "\uffe7\007\uffe7\010\uffe7\012\uffe7\013\uffe7\016\uffe7\017\uffe7" +
    "\001\002\000\022\002\ufff3\003\ufff3\006\ufff3\007\ufff3\010" +
    "\ufff3\013\ufff3\016\ufff3\017\ufff3\001\002\000\012\017\040" +
    "\020\037\023\041\036\036\001\002\000\020\003\050\004" +
    "\044\005\047\013\015\014\042\025\043\041\051\001\002" +
    "\000\024\002\uffec\003\uffec\006\uffec\007\uffec\010\uffec\012" +
    "\uffec\013\uffec\016\uffec\017\uffec\001\002\000\024\002\uffee" +
    "\003\uffee\006\uffee\007\uffee\010\uffee\012\uffee\013\uffee\016" +
    "\uffee\017\uffee\001\002\000\042\003\uffb8\015\uffb8\020\uffb8" +
    "\024\uffb8\025\uffb8\026\uffb8\027\uffb8\030\uffb8\031\uffb8\032" +
    "\uffb8\033\uffb8\034\uffb8\035\uffb8\036\uffb8\037\uffb8\040\uffb8" +
    "\001\002\000\020\003\112\004\044\005\047\013\015\014" +
    "\042\025\043\041\051\001\002\000\006\004\110\005\107" +
    "\001\002\000\042\003\uffc4\015\uffc4\020\uffc4\024\uffc4\025" +
    "\uffc4\026\uffc4\027\uffc4\030\uffc4\031\uffc4\032\uffc4\033\uffc4" +
    "\034\uffc4\035\uffc4\036\uffc4\037\uffc4\040\uffc4\001\002\000" +
    "\042\003\uffc5\015\uffc5\020\uffc5\024\uffc5\025\uffc5\026\uffc5" +
    "\027\uffc5\030\uffc5\031\uffc5\032\uffc5\033\uffc5\034\uffc5\035" +
    "\uffc5\036\uffc5\037\uffc5\040\uffc5\001\002\000\036\020\106" +
    "\024\062\025\054\026\061\027\064\030\070\031\066\032" +
    "\057\033\056\034\065\035\055\036\063\037\053\040\067" +
    "\001\002\000\042\003\uffc3\015\uffc3\020\uffc3\024\uffc3\025" +
    "\uffc3\026\uffc3\027\uffc3\030\uffc3\031\uffc3\032\uffc3\033\uffc3" +
    "\034\uffc3\035\uffc3\036\uffc3\037\uffc3\040\uffc3\001\002\000" +
    "\004\023\041\001\002\000\020\003\050\004\044\005\047" +
    "\013\015\014\042\025\043\041\051\001\002\000\042\003" +
    "\uffd0\015\uffd0\020\uffd0\024\062\025\054\026\061\027\064" +
    "\030\070\031\066\032\057\033\056\034\065\035\055\036" +
    "\063\037\uffd0\040\uffd0\001\002\000\020\003\050\004\044" +
    "\005\047\013\015\014\042\025\043\041\051\001\002\000" +
    "\020\003\050\004\044\005\047\013\015\014\042\025\043" +
    "\041\051\001\002\000\020\003\uffbc\004\uffbc\005\uffbc\013" +
    "\uffbc\014\uffbc\025\uffbc\041\uffbc\001\002\000\020\003\uffbe" +
    "\004\uffbe\005\uffbe\013\uffbe\014\uffbe\025\uffbe\041\uffbe\001" +
    "\002\000\020\003\uffbf\004\uffbf\005\uffbf\013\uffbf\014\uffbf" +
    "\025\uffbf\041\uffbf\001\002\000\020\003\050\004\044\005" +
    "\047\013\015\014\042\025\043\041\051\001\002\000\020" +
    "\003\050\004\044\005\047\013\015\014\042\025\043\041" +
    "\051\001\002\000\020\003\050\004\044\005\047\013\015" +
    "\014\042\025\043\041\051\001\002\000\004\036\077\001" +
    "\002\000\020\003\050\004\044\005\047\013\015\014\042" +
    "\025\043\041\051\001\002\000\020\003\uffbd\004\uffbd\005" +
    "\uffbd\013\uffbd\014\uffbd\025\uffbd\041\uffbd\001\002\000\020" +
    "\003\050\004\044\005\047\013\015\014\042\025\043\041" +
    "\051\001\002\000\020\003\050\004\044\005\047\013\015" +
    "\014\042\025\043\041\051\001\002\000\020\003\050\004" +
    "\044\005\047\013\015\014\042\025\043\041\051\001\002" +
    "\000\020\003\050\004\044\005\047\013\015\014\042\025" +
    "\043\041\051\001\002\000\042\003\uffcc\015\uffcc\020\uffcc" +
    "\024\062\025\054\026\061\027\064\030\070\031\066\032" +
    "\057\033\056\034\065\035\055\036\063\037\053\040\067" +
    "\001\002\000\042\003\uffce\015\uffce\020\uffce\024\062\025" +
    "\054\026\061\027\064\030\uffce\031\uffce\032\uffce\033\uffce" +
    "\034\uffce\035\uffce\036\uffce\037\uffce\040\uffce\001\002\000" +
    "\042\003\uffd1\015\uffd1\020\uffd1\024\062\025\054\026\061" +
    "\027\064\030\070\031\066\032\057\033\056\034\065\035" +
    "\055\036\063\037\053\040\uffd1\001\002\000\042\003\uffcd" +
    "\015\uffcd\020\uffcd\024\062\025\054\026\061\027\064\030" +
    "\uffcd\031\uffcd\032\uffcd\033\uffcd\034\uffcd\035\uffcd\036\uffcd" +
    "\037\uffcd\040\uffcd\001\002\000\042\003\uffc7\015\uffc7\020" +
    "\uffc7\024\uffc7\025\uffc7\026\uffc7\027\uffc7\030\uffc7\031\uffc7" +
    "\032\uffc7\033\uffc7\034\uffc7\035\uffc7\036\uffc7\037\uffc7\040" +
    "\uffc7\001\002\000\020\003\050\004\044\005\047\013\015" +
    "\014\042\025\043\041\051\001\002\000\042\003\uffcf\015" +
    "\uffcf\020\uffcf\024\062\025\054\026\061\027\064\030\uffcf" +
    "\031\uffcf\032\uffcf\033\uffcf\034\uffcf\035\uffcf\036\uffcf\037" +
    "\uffcf\040\uffcf\001\002\000\042\003\uffca\015\uffca\020\uffca" +
    "\024\uffca\025\uffca\026\061\027\064\030\uffca\031\uffca\032" +
    "\uffca\033\uffca\034\uffca\035\uffca\036\uffca\037\uffca\040\uffca" +
    "\001\002\000\042\003\uffc8\015\uffc8\020\uffc8\024\uffc8\025" +
    "\uffc8\026\uffc8\027\uffc8\030\uffc8\031\uffc8\032\uffc8\033\uffc8" +
    "\034\uffc8\035\uffc8\036\uffc8\037\uffc8\040\uffc8\001\002\000" +
    "\042\003\uffcb\015\uffcb\020\uffcb\024\062\025\054\026\061" +
    "\027\064\030\070\031\066\032\057\033\056\034\065\035" +
    "\055\036\063\037\053\040\067\001\002\000\042\003\uffc9" +
    "\015\uffc9\020\uffc9\024\uffc9\025\uffc9\026\061\027\064\030" +
    "\uffc9\031\uffc9\032\uffc9\033\uffc9\034\uffc9\035\uffc9\036\uffc9" +
    "\037\uffc9\040\uffc9\001\002\000\042\003\uffd2\015\uffd2\020" +
    "\uffd2\024\062\025\054\026\061\027\064\030\070\031\066" +
    "\032\057\033\056\034\065\035\055\036\063\037\uffd2\040" +
    "\uffd2\001\002\000\024\002\uffe1\003\uffe1\006\uffe1\007\uffe1" +
    "\010\uffe1\012\uffe1\013\uffe1\016\uffe1\017\uffe1\001\002\000" +
    "\042\003\uffc1\015\uffc1\020\uffc1\024\uffc1\025\uffc1\026\uffc1" +
    "\027\uffc1\030\uffc1\031\uffc1\032\uffc1\033\uffc1\034\uffc1\035" +
    "\uffc1\036\uffc1\037\uffc1\040\uffc1\001\002\000\042\003\uffc2" +
    "\015\uffc2\020\uffc2\024\uffc2\025\uffc2\026\uffc2\027\uffc2\030" +
    "\uffc2\031\uffc2\032\uffc2\033\uffc2\034\uffc2\035\uffc2\036\uffc2" +
    "\037\uffc2\040\uffc2\001\002\000\036\015\114\024\062\025" +
    "\054\026\061\027\064\030\070\031\066\032\057\033\056" +
    "\034\065\035\055\036\063\037\053\040\067\001\002\000" +
    "\006\015\113\023\041\001\002\000\042\003\uffc0\015\uffc0" +
    "\020\uffc0\024\uffc0\025\uffc0\026\uffc0\027\uffc0\030\uffc0\031" +
    "\uffc0\032\uffc0\033\uffc0\034\uffc0\035\uffc0\036\uffc0\037\uffc0" +
    "\040\uffc0\001\002\000\042\003\uffc6\015\uffc6\020\uffc6\024" +
    "\uffc6\025\uffc6\026\uffc6\027\uffc6\030\uffc6\031\uffc6\032\uffc6" +
    "\033\uffc6\034\uffc6\035\uffc6\036\uffc6\037\uffc6\040\uffc6\001" +
    "\002\000\024\002\uffed\003\uffed\006\uffed\007\uffed\010\uffed" +
    "\012\uffed\013\uffed\016\uffed\017\uffed\001\002\000\022\002" +
    "\ufff1\003\ufff1\006\ufff1\007\ufff1\010\ufff1\013\ufff1\016\ufff1" +
    "\017\ufff1\001\002\000\010\020\037\023\041\036\036\001" +
    "\002\000\006\020\123\023\041\001\002\000\004\020\122" +
    "\001\002\000\024\002\uffe0\003\uffe0\006\uffe0\007\uffe0\010" +
    "\uffe0\012\uffe0\013\uffe0\016\uffe0\017\uffe0\001\002\000\024" +
    "\002\uffdf\003\uffdf\006\uffdf\007\uffdf\010\uffdf\012\uffdf\013" +
    "\uffdf\016\uffdf\017\uffdf\001\002\000\020\003\127\004\044" +
    "\005\047\013\015\014\042\025\043\041\051\001\002\000" +
    "\024\002\uffe4\003\uffe4\006\uffe4\007\uffe4\010\uffe4\012\uffe4" +
    "\013\uffe4\016\uffe4\017\uffe4\001\002\000\036\020\131\024" +
    "\062\025\054\026\061\027\064\030\070\031\066\032\057" +
    "\033\056\034\065\035\055\036\063\037\053\040\067\001" +
    "\002\000\006\020\130\023\041\001\002\000\024\002\uffe2" +
    "\003\uffe2\006\uffe2\007\uffe2\010\uffe2\012\uffe2\013\uffe2\016" +
    "\uffe2\017\uffe2\001\002\000\024\002\uffe3\003\uffe3\006\uffe3" +
    "\007\uffe3\010\uffe3\012\uffe3\013\uffe3\016\uffe3\017\uffe3\001" +
    "\002\000\006\004\134\013\133\001\002\000\004\023\136" +
    "\001\002\000\004\023\135\001\002\000\042\003\uffba\015" +
    "\uffba\020\uffba\024\uffba\025\uffba\026\uffba\027\uffba\030\uffba" +
    "\031\uffba\032\uffba\033\uffba\034\uffba\035\uffba\036\uffba\037" +
    "\uffba\040\uffba\001\002\000\042\003\uffb9\015\uffb9\020\uffb9" +
    "\024\uffb9\025\uffb9\026\uffb9\027\uffb9\030\uffb9\031\uffb9\032" +
    "\uffb9\033\uffb9\034\uffb9\035\uffb9\036\uffb9\037\uffb9\040\uffb9" +
    "\001\002\000\016\003\uffda\006\uffda\007\uffda\010\uffda\013" +
    "\uffda\016\uffda\001\002\000\020\003\050\004\044\005\047" +
    "\013\015\014\042\025\043\041\051\001\002\000\020\003" +
    "\143\004\044\005\047\013\015\014\042\025\043\041\051" +
    "\001\002\000\040\003\146\015\145\024\062\025\054\026" +
    "\061\027\064\030\070\031\066\032\057\033\056\034\065" +
    "\035\055\036\063\037\053\040\067\001\002\000\006\015" +
    "\144\023\041\001\002\000\016\003\uffdd\006\uffdd\007\uffdd" +
    "\010\uffdd\013\uffdd\016\uffdd\001\002\000\016\003\uffde\006" +
    "\uffde\007\uffde\010\uffde\013\uffde\016\uffde\001\002\000\016" +
    "\003\uffdb\006\uffdb\007\uffdb\010\uffdb\013\uffdb\016\uffdb\001" +
    "\002\000\036\015\150\024\062\025\054\026\061\027\064" +
    "\030\070\031\066\032\057\033\056\034\065\035\055\036" +
    "\063\037\053\040\067\001\002\000\016\003\uffdc\006\uffdc" +
    "\007\uffdc\010\uffdc\013\uffdc\016\uffdc\001\002\000\016\003" +
    "\155\006\023\007\014\010\013\013\015\016\154\001\002" +
    "\000\024\002\uffe6\003\uffe6\006\uffe6\007\uffe6\010\uffe6\012" +
    "\166\013\uffe6\016\uffe6\017\uffe6\001\002\000\004\012\157" +
    "\001\002\000\016\003\024\006\023\007\014\010\013\013" +
    "\015\016\026\001\002\000\006\023\041\036\036\001\002" +
    "\000\020\003\117\006\023\007\014\010\013\013\015\016" +
    "\026\017\033\001\002\000\016\003\uffd9\006\uffd9\007\uffd9" +
    "\010\uffd9\013\uffd9\016\uffd9\001\002\000\016\003\155\006" +
    "\023\007\162\010\013\013\015\016\154\001\002\000\024" +
    "\002\uffe5\003\uffe5\006\uffe5\007\uffe5\010\uffe5\012\uffe5\013" +
    "\uffe5\016\uffe5\017\uffe5\001\002\000\006\003\140\014\141" +
    "\001\002\000\016\003\uffda\006\uffda\007\uffda\010\uffda\013" +
    "\uffda\016\uffda\001\002\000\016\003\155\006\023\007\162" +
    "\010\013\013\015\016\154\001\002\000\004\012\166\001" +
    "\002\000\016\003\uffd9\006\uffd9\007\uffd9\010\uffd9\013\uffd9" +
    "\016\uffd9\001\002\000\016\003\155\006\023\007\162\010" +
    "\013\013\015\016\154\001\002\000\024\002\uffeb\003\uffeb" +
    "\006\uffeb\007\uffeb\010\uffeb\012\uffeb\013\uffeb\016\uffeb\017" +
    "\uffeb\001\002\000\020\003\050\004\044\005\047\013\015" +
    "\014\042\025\043\041\051\001\002\000\020\003\177\004" +
    "\044\005\047\013\015\014\042\025\043\041\051\001\002" +
    "\000\016\003\uffd3\006\uffd3\007\uffd3\010\uffd3\013\uffd3\016" +
    "\uffd3\001\002\000\016\003\117\006\023\007\014\010\013" +
    "\013\015\016\026\001\002\000\024\002\uffd8\003\uffd8\006" +
    "\uffd8\007\uffd8\010\uffd8\012\uffd8\013\uffd8\016\uffd8\017\uffd8" +
    "\001\002\000\040\003\202\015\201\024\062\025\054\026" +
    "\061\027\064\030\070\031\066\032\057\033\056\034\065" +
    "\035\055\036\063\037\053\040\067\001\002\000\006\015" +
    "\200\023\041\001\002\000\016\003\uffd6\006\uffd6\007\uffd6" +
    "\010\uffd6\013\uffd6\016\uffd6\001\002\000\016\003\uffd7\006" +
    "\uffd7\007\uffd7\010\uffd7\013\uffd7\016\uffd7\001\002\000\016" +
    "\003\uffd4\006\uffd4\007\uffd4\010\uffd4\013\uffd4\016\uffd4\001" +
    "\002\000\036\015\204\024\062\025\054\026\061\027\064" +
    "\030\070\031\066\032\057\033\056\034\065\035\055\036" +
    "\063\037\053\040\067\001\002\000\016\003\uffd5\006\uffd5" +
    "\007\uffd5\010\uffd5\013\uffd5\016\uffd5\001\002\000\010\020" +
    "\ufff5\021\ufff5\022\ufff5\001\002\000\006\020\213\021\212" +
    "\001\002\000\004\020\211\001\002\000\006\020\ufff9\021" +
    "\ufff9\001\002\000\022\003\ufffc\006\ufffc\007\ufffc\010\ufffc" +
    "\013\ufffc\016\ufffc\042\ufffc\043\ufffc\001\002\000\004\013" +
    "\ufff8\001\002\000\022\003\ufffd\006\ufffd\007\ufffd\010\ufffd" +
    "\013\ufffd\016\ufffd\042\ufffd\043\ufffd\001\002\000\004\013" +
    "\205\001\002\000\006\020\ufff7\021\ufff7\001\002\000\010" +
    "\020\ufff6\021\ufff6\022\217\001\002\000\004\004\220\001" +
    "\002\000\004\023\221\001\002\000\010\020\ufff4\021\ufff4" +
    "\022\ufff4\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\217\000\006\002\004\016\003\001\001\000\026\003" +
    "\015\004\027\005\020\006\007\015\016\017\010\022\011" +
    "\026\017\027\021\030\026\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\020\205\021\207\001\001\000\004\025" +
    "\172\001\001\000\004\024\136\001\001\000\002\001\001" +
    "\000\020\004\033\005\020\006\007\015\016\026\017\027" +
    "\021\030\026\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\026\120\001" +
    "\001\000\020\004\115\005\020\006\007\015\016\026\017" +
    "\027\021\030\026\001\001\000\002\001\001\000\022\003" +
    "\031\004\027\005\020\006\007\015\016\026\017\027\021" +
    "\030\026\001\001\000\002\001\001\000\002\001\001\000" +
    "\020\004\115\005\020\006\007\015\016\026\017\027\021" +
    "\030\026\001\001\000\020\004\033\005\020\006\007\015" +
    "\016\026\017\027\021\030\026\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\007\045\026" +
    "\044\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\007\110\026\044\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\010\070" +
    "\011\057\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\007\051\026\044\001\001\000\006\010\070\011\057" +
    "\001\001\000\006\007\104\026\044\001\001\000\006\007" +
    "\103\026\044\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\007\102\026\044\001\001\000" +
    "\006\007\101\026\044\001\001\000\006\007\100\026\044" +
    "\001\001\000\002\001\001\000\006\007\075\026\044\001" +
    "\001\000\002\001\001\000\006\007\074\026\044\001\001" +
    "\000\006\007\073\026\044\001\001\000\006\007\072\026" +
    "\044\001\001\000\006\007\071\026\044\001\001\000\006" +
    "\010\070\011\057\001\001\000\006\010\070\011\057\001" +
    "\001\000\006\010\070\011\057\001\001\000\006\010\070" +
    "\011\057\001\001\000\006\010\070\011\057\001\001\000" +
    "\006\007\077\026\044\001\001\000\006\010\070\011\057" +
    "\001\001\000\006\010\070\011\057\001\001\000\006\010" +
    "\070\011\057\001\001\000\006\010\070\011\057\001\001" +
    "\000\006\010\070\011\057\001\001\000\006\010\070\011" +
    "\057\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\010\070\011\057\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\007\125\026\044\001\001\000\002\001\001\000\006\010" +
    "\070\011\057\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\013\150\001\001\000\006\007\146\026\044\001\001\000" +
    "\006\007\141\026\044\001\001\000\006\010\070\011\057" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\010\070\011\057\001\001" +
    "\000\002\001\001\000\016\005\020\006\007\015\016\026" +
    "\017\027\151\030\152\001\001\000\002\001\001\000\002" +
    "\001\001\000\022\003\155\004\027\005\020\006\007\015" +
    "\016\026\017\027\021\030\026\001\001\000\002\001\001" +
    "\000\020\004\033\005\020\006\007\015\016\026\017\027" +
    "\021\030\026\001\001\000\004\014\157\001\001\000\014" +
    "\005\020\006\007\015\016\026\017\027\160\001\001\000" +
    "\002\001\001\000\004\024\162\001\001\000\004\013\163" +
    "\001\001\000\014\005\020\006\007\015\016\026\017\027" +
    "\164\001\001\000\002\001\001\000\004\014\166\001\001" +
    "\000\014\005\020\006\007\015\016\026\017\027\167\001" +
    "\001\000\002\001\001\000\006\007\202\026\044\001\001" +
    "\000\006\007\175\026\044\001\001\000\004\012\173\001" +
    "\001\000\020\004\174\005\020\006\007\015\016\026\017" +
    "\027\021\030\026\001\001\000\002\001\001\000\006\010" +
    "\070\011\057\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\010\070\011" +
    "\057\001\001\000\002\001\001\000\004\023\215\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\031\213\001\001\000\002\001\001" +
    "\000\004\021\214\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
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
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

    // buffer che conterrà l'output program
    outputBuffer = new StringBuffer();

 Tree = new DisegnaAlbero();   }public static DisegnaAlbero Tree;

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 Symbol s=_scanner.next_token(); Tree.push(s.toString(), 0); return s;   }



    public boolean isCorrect = true;

    // numero della first usable label
    public int label = 0;

    // file di output (stdout oppure file [to dumb program in a file])
    public static String dumpOutput;

    // true se il semantic check è attivo
    public boolean enableSem = true;

    // string buffer per l'output program (inizializzato sopra con init)
    public StringBuffer outputBuffer;

    // generazione del numero della next label
    public int genLabel(){
        label++;
        return label;
    }
    
    // Redefinition of error functions
    public void report_error(String message, Object info) {
        System.err.print("ERROR: Syntax error");
        if (info instanceof Symbol)
            if (((Symbol)info).left != -1){
                int line = (((Symbol)info).left)+1;
                int column = (((Symbol)info).right)+1;
                System.err.print(" (linea "+line+", colonna "+column+"): ");
            } else System.err.print(": ");
        else System.err.print(": ");
    }
    public void syntax_error(Symbol cur_token){}

    // ritorna actual symbol (tos = top of stack) [dalla teoria]
    public Symbol getToken() {
        return ((Symbol)stack.elementAt(tos));
    }

    // ritorna il semantic value del simbolo alla posizione pos [dalla teoria]
    public Object stack(int pos) {
        return (((Symbol)stack.elementAt(tos + pos)).value);
    }

    // Return the line number of actual symbol
    public int getLine() {
        if (((Symbol)stack.elementAt(tos)).left != -1){
            return ((Symbol)stack.elementAt(tos)).left+1;
        }else return -1;
    }
    // Return the column number of actual symbol
    public int getColumn() {
        if (((Symbol)stack.elementAt(tos)).left != -1){
            return ((Symbol)stack.elementAt(tos)).right+1;
        }else return -1;
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {


    // disabilita semantic check
    private void disableSem() {
        parser.enableSem = false;
    }
    // ritorna true se semantic check è attivo (o no)
    private boolean sem() {
        return parser.enableSem;
    }

    // Error Management
    private void pSemError(String message){
        System.err.println("SEM ERROR: line: "+parser.getLine()+" col: "+parser.getColumn()+": "+message);
        parser.done_parsing();
    }
    private void pSemWarning(String message){
        System.err.println("SEM WARNING: line: "+parser.getLine()+" col: "+parser.getColumn()+": "+message);
    }
    private void pSynError(String message){
        System.err.println("SYN ERROR: line: "+parser.getLine()+" col: "+parser.getColumn()+": "+message);
        parser.isCorrect = false;
        parser.done_parsing();
    }
    private void pSynWarning(String message){
        System.err.println("SYN WARNING: line: "+parser.getLine()+" col: "+parser.getColumn()+": "+message);
        parser.isCorrect = false;
        disableSem();       // se c'è errore sintattico continuo parsing, ma disabilito semantica
    }

    // scrive una String in output
    private void dump(String s){
        if(parser.dumpOutput == "stdout") {System.out.print(s);}
        else {parser.outputBuffer.append(s);}
    }
    private void dumpln(String s){
        if(parser.dumpOutput == "stdout") System.out.println(s);
        else parser.outputBuffer.append(s+"\n");
    } 

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= prog EOF 
            { 
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // prog ::= decl_list stmt_list 
            { parser.Tree.reduce(2,"prog",0);
              Object RESULT =null;
		
                dumpln("\tEND");
                if (parser.dumpOutput == null || parser.dumpOutput.equals("stdout")){
                    System.out.println(parser.outputBuffer);
                }
                else {
                    try {
                        BufferedWriter out = new BufferedWriter(new FileWriter(parser.dumpOutput));
                        String outText = parser.outputBuffer.toString();
                        out.write(outText);
                        out.close();
                    }
                    catch (IOException e){
                        e.printStackTrace();
                    }
                }

              CUP$parser$result = parser.getSymbolFactory().newSymbol("prog",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // decl_list ::= decl_list decl 
            { parser.Tree.reduce(2,"decl_list",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl_list",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // decl_list ::= 
            { parser.Tree.reduce(0,"decl_list",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl_list",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // decl ::= type var_list S 
            { parser.Tree.reduce(3,"decl",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // decl ::= type error S 
            { parser.Tree.reduce(3,"decl",0);
              Object RESULT =null;
		 pSynWarning("Error in declaration"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // type ::= INT_TYPE 
            { parser.Tree.reduce(1,"type",0);
              String RESULT =null;
		 RESULT = new String("INT"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // type ::= DOUBLE_TYPE 
            { parser.Tree.reduce(1,"type",0);
              String RESULT =null;
		 RESULT = new String("DOUBLE"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // var_list ::= var 
            { parser.Tree.reduce(1,"var_list",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("var_list",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // NT$0 ::= 
            { parser.Tree.reduce(0,"NT$0",0);
              Object RESULT =null;
 RESULT = parser.stack(-2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",23, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // var_list ::= var_list CM NT$0 var 
            { parser.Tree.reduce(4,"var_list",0);
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("var_list",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // var ::= ID array 
            { parser.Tree.reduce(2,"var",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String y = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 dumpln("\t" + parser.stack(-2) + " " + x + y); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("var",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // array ::= 
            { parser.Tree.reduce(0,"array",0);
              String RESULT =null;
		 RESULT = new String(""); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("array",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // array ::= array SO INT SC 
            { parser.Tree.reduce(4,"array",0);
              String RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Integer y = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = x + "[" + y.toString() + "]"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("array",17, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // stmt_list ::= stmt_list stmt 
            { parser.Tree.reduce(2,"stmt_list",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt_list",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // stmt_list ::= stmt 
            { parser.Tree.reduce(1,"stmt_list",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt_list",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // stmt_list ::= error stmt 
            { parser.Tree.reduce(2,"stmt_list",1);
              Object RESULT =null;
		 pSynWarning("Error in statement"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt_list",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // stmt ::= matched_stmt 
            { parser.Tree.reduce(1,"stmt",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // stmt ::= unmatched_stmt 
            { parser.Tree.reduce(1,"stmt",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // stmt ::= BO stmt_list error BC 
            { parser.Tree.reduce(4,"stmt",0);
              Object RESULT =null;
		 pSynWarning("Missing ; before }"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // stmt ::= BO error BC 
            { parser.Tree.reduce(3,"stmt",0);
              Object RESULT =null;
		 pSynWarning("Missing ; before }"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // stmt ::= error S 
            { parser.Tree.reduce(2,"stmt",0);
              Object RESULT =null;
		 pSynWarning("Error in statement"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // matched_stmt ::= IF if_condition nt0_if matched_stmt ELSE nt1_if matched_stmt 
            { parser.Tree.reduce(7,"matched_stmt",0);
              Object RESULT =null;
		
                    if (sem()) {dump("L" + parser.stack(-1) + ":");}
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("matched_stmt",21, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // matched_stmt ::= while 
            { parser.Tree.reduce(1,"matched_stmt",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("matched_stmt",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // matched_stmt ::= assignment 
            { parser.Tree.reduce(1,"matched_stmt",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("matched_stmt",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // matched_stmt ::= print 
            { parser.Tree.reduce(1,"matched_stmt",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("matched_stmt",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // matched_stmt ::= BO stmt_list BC 
            { parser.Tree.reduce(3,"matched_stmt",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("matched_stmt",21, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // unmatched_stmt ::= IF if_condition nt0_if matched_stmt 
            { parser.Tree.reduce(4,"unmatched_stmt",0);
              Object RESULT =null;
		 if (sem()) {dump("L" + parser.stack(-1) + ":");} 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("unmatched_stmt",22, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // unmatched_stmt ::= IF if_condition nt0_if unmatched_stmt ELSE nt1_if matched_stmt 
            { parser.Tree.reduce(7,"unmatched_stmt",0);
              Object RESULT =null;
		 if (sem()) {dump("L" + parser.stack(-1) + ":");} 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("unmatched_stmt",22, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // assignment ::= id S 
            { parser.Tree.reduce(2,"assignment",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 if (sem()) {dumpln("\t" + x);} 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // assignment ::= id EQ exp S 
            { parser.Tree.reduce(4,"assignment",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 if (sem()) {dumpln("\tEVAL " + y.toString() + "\n\tASS " + x);} 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // assignment ::= id EQ error S 
            { parser.Tree.reduce(4,"assignment",0);
              Object RESULT =null;
		 pSynWarning("Error in expression"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // assignment ::= error EQ exp S 
            { parser.Tree.reduce(4,"assignment",0);
              Object RESULT =null;
		 pSynWarning("Error in assigment"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // print ::= PRINT id S 
            { parser.Tree.reduce(3,"print",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 if (sem()) {dumpln("\tPRINT " + x);} 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("print",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // print ::= PRINT error S 
            { parser.Tree.reduce(3,"print",0);
              Object RESULT =null;
		 pSynWarning("Error in 'print' instruction"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("print",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // if_condition ::= RO exp RC 
            { parser.Tree.reduce(3,"if_condition",0);
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = (String)e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("if_condition",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // if_condition ::= RO error RC 
            { parser.Tree.reduce(3,"if_condition",0);
              String RESULT =null;
		 pSynWarning("Error in 'if' condition"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("if_condition",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // if_condition ::= error exp RC 
            { parser.Tree.reduce(3,"if_condition",0);
              String RESULT =null;
		 pSynWarning("Error '(' expected in 'if' instruciton"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("if_condition",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // if_condition ::= RO exp error 
            { parser.Tree.reduce(3,"if_condition",0);
              String RESULT =null;
		 pSynWarning("Error ')' expected in 'if' instruciton"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("if_condition",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // nt0_if ::= 
            { parser.Tree.reduce(0,"nt0_if",0);
              Integer RESULT =null;
		
        if (sem()) {
            RESULT = parser.genLabel();
            dumpln("\tEVAL " + parser.stack(0) + "\t\t/* if (line " + parser.getLine() + ") */\n\tGOTOF L" + RESULT);
        }

              CUP$parser$result = parser.getSymbolFactory().newSymbol("nt0_if",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // nt1_if ::= 
            { parser.Tree.reduce(0,"nt1_if",0);
              Integer RESULT =null;
		
        if (sem()) {
            RESULT = parser.genLabel();
            dumpln("\tGOTO L" + RESULT);
            dump("L" + parser.stack(-2) + ":");
        }

              CUP$parser$result = parser.getSymbolFactory().newSymbol("nt1_if",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // while ::= WHILE while_condition nt0_while stmt 
            { parser.Tree.reduce(4,"while",0);
              Object RESULT =null;
		
                    if (sem()) {
                        Integer[] l = (Integer[])parser.stack(-1);
                        dumpln("\tGOTO L" + l[0]);
                        dump("L" + l[1] + ":");
                    }

              CUP$parser$result = parser.getSymbolFactory().newSymbol("while",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // while_condition ::= RO exp RC 
            { parser.Tree.reduce(3,"while_condition",0);
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = (String)e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("while_condition",19, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // while_condition ::= RO error RC 
            { parser.Tree.reduce(3,"while_condition",0);
              String RESULT =null;
		 pSynWarning("Error in 'while' condition"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("while_condition",19, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // while_condition ::= error exp RC 
            { parser.Tree.reduce(3,"while_condition",0);
              String RESULT =null;
		 pSynWarning("Error '(' expected in 'while' instruciton"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("while_condition",19, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // while_condition ::= RO exp error 
            { parser.Tree.reduce(3,"while_condition",0);
              String RESULT =null;
		 pSynWarning("Error ')' expected in 'while' instruciton"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("while_condition",19, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // nt0_while ::= 
            { parser.Tree.reduce(0,"nt0_while",0);
              Integer[] RESULT =null;
		
        if (sem()) {
            RESULT = new Integer[2];
            RESULT[0] = (Integer)parser.genLabel();
            RESULT[1] = (Integer)parser.genLabel();
            dumpln("L" + RESULT[0] + ":\tEVAL " + parser.stack(0) + "\t\t/* while (line " + parser.getLine() + ") */\n\tGOTOF L" + RESULT[1]);
        }

              CUP$parser$result = parser.getSymbolFactory().newSymbol("nt0_while",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // exp ::= exp AND exp 
            { parser.Tree.reduce(3,"exp",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new String(x + " " + y + " & "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // exp ::= exp OR exp 
            { parser.Tree.reduce(3,"exp",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new String(x + " " + y + " | "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // exp ::= NOT exp 
            { parser.Tree.reduce(2,"exp",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new String(x + " ! "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // exp ::= exp EQ EQ exp 
            { parser.Tree.reduce(4,"exp",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new String(x + " " + y + " == "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // exp ::= exp MIN exp 
            { parser.Tree.reduce(3,"exp",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new String(x + " " + y + " < "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // exp ::= exp MAJ exp 
            { parser.Tree.reduce(3,"exp",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new String(x + " " + y + " > "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // exp ::= exp mineq exp 
            { parser.Tree.reduce(3,"exp",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new String(x + " " + y + " <= "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // exp ::= exp majeq exp 
            { parser.Tree.reduce(3,"exp",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new String(x + " " + y + " >= "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 55: // exp ::= exp PLUS exp 
            { parser.Tree.reduce(3,"exp",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new String(x + " " + y + " + "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 56: // exp ::= exp MINUS exp 
            { parser.Tree.reduce(3,"exp",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new String(x + " " + y + " - "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 57: // exp ::= exp STAR exp 
            { parser.Tree.reduce(3,"exp",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new String(x + " " + y + " * "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 58: // exp ::= exp DIV exp 
            { parser.Tree.reduce(3,"exp",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new String(x + " " + y + " / "); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 59: // exp ::= RO exp RC 
            { parser.Tree.reduce(3,"exp",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = x; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 60: // exp ::= id 
            { parser.Tree.reduce(1,"exp",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = x; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 61: // exp ::= INT 
            { parser.Tree.reduce(1,"exp",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer x = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new String(x.toString()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 62: // exp ::= DOUBLE 
            { parser.Tree.reduce(1,"exp",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double x = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new String(x.toString()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 63: // exp ::= MINUS INT 
            { parser.Tree.reduce(2,"exp",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer x = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new String("-" + x.toString()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 64: // exp ::= MINUS DOUBLE 
            { parser.Tree.reduce(2,"exp",0);
              Object RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double x = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new String("-" + x.toString()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 65: // exp ::= RO error RC 
            { parser.Tree.reduce(3,"exp",0);
              Object RESULT =null;
		 pSynWarning("Error in expression"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 66: // mineq ::= MIN_EQ 
            { parser.Tree.reduce(1,"mineq",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("mineq",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 67: // mineq ::= EQ_MIN 
            { parser.Tree.reduce(1,"mineq",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("mineq",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 68: // majeq ::= MAJ_EQ 
            { parser.Tree.reduce(1,"majeq",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("majeq",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 69: // majeq ::= EQ_MAJ 
            { parser.Tree.reduce(1,"majeq",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("majeq",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 70: // id ::= ID 
            { parser.Tree.reduce(1,"id",0);
              String RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = x; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("id",20, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 71: // id ::= ID SO INT SC 
            { parser.Tree.reduce(4,"id",0);
              String RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Integer y = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new String(x.toString() + "[" + y.toString() + "]"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("id",20, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 72: // id ::= ID SO ID SC 
            { parser.Tree.reduce(4,"id",0);
              String RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String x = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String y = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new String(x.toString() + "[" + y.toString() + "]"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("id",20, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 73: // id ::= error SC 
            { parser.Tree.reduce(2,"id",0);
              String RESULT =null;
		 pSynWarning("Error in vector"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("id",20, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
