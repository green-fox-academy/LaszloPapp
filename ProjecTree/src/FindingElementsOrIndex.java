public class FindingElementsOrIndex {

  public static void main(String[] args) {

    String where = "this is what I'm searching in";
    String what = "searching";
    int index;

    index = stringFinder(where,what);

    if(index != -1){
      System.out.println("The word starts from index " + index);
    }else{
      System.out.println("The word not in the sentence.");
    }
  }

  public static int stringFinder(String stringLong, String stringShort){
    int indexBack = 0;
    for (int i = 0; i < stringLong.length(); i++) {
      if(stringLong.contains(stringShort)){
        indexBack = stringLong.indexOf(stringShort);
      }else{
        return -1;
      }
    }
    return indexBack;
  }
}

//Create a function that takes two strings as a parameter
//Returns the starting index where the second one is starting in the first one
//Returns -1 if the second string is not in the first one
