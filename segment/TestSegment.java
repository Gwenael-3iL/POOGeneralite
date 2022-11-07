package segment;

public class TestSegment {
  public static void main(String[] args) {
    Segment segment = new Segment(Integer.parseInt(args[0]),
                                  Integer.parseInt(args[1]));
        
    segment.appartient(Integer.parseInt(args[2]));
    segment.toString();
  }
}