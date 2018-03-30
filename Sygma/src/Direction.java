public class Direction {

   MyPosition start;
   MyPosition end;

   public Direction() {
   }

   public Direction(MyPosition start) {
      this.start = start;
   }

   public MyPosition getStart() {
      return start;
   }

   public void setStart(MyPosition start) {
      this.start = start;
   }

   public MyPosition getEnd() {
      return end;
   }

   public void setEnd(MyPosition end) {
      this.end = end;
   }
}
