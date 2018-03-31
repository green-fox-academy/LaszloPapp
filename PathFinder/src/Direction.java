public class Direction {

   MyPosition directedPosition;
   double facing;


   public Direction(double facing) {
      this.facing = facing;
   }

   public MyPosition getDirectedPosition() {
      return directedPosition;
   }

   public void setDirectedPosition(MyPosition directedPosition) {
      this.directedPosition = directedPosition;
   }

   /**
    * Method to calculate the displacement by using projection.
    * @param distance
    */
   public void walk(double distance){
      double alpha = facing;

      if (facing > 180){
         alpha = facing - 360;
      }
      double projection = Math.abs(distance * (1-Math.sin(Math.toRadians(Math.abs(alpha)))));

      Double distance2 = Math.pow(distance,2);
      Double projection2 = Math.pow(projection, 2);
      double elevation = Math.sqrt(distance2 - projection2);

      if ((alpha >= 0) && (alpha <= 90)){
         directedPosition.setPositionX(directedPosition.getPositionX() + projection);
         directedPosition.setPositionY(directedPosition.getPositionY() + elevation);
      }else if ((alpha >90) && (alpha <= 180)){
         directedPosition.setPositionX(directedPosition.getPositionX() - projection);
         directedPosition.setPositionY(directedPosition.getPositionY() + elevation);
      }else if ((alpha > -90) && (alpha < 0)) {
         directedPosition.setPositionX(directedPosition.getPositionX() + projection);
         directedPosition.setPositionY(directedPosition.getPositionY() - elevation);
      }else {
         directedPosition.setPositionX(directedPosition.getPositionX() - projection);
         directedPosition.setPositionY(directedPosition.getPositionY() - elevation);
      }
   }
}
