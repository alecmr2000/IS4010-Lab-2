class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int total;
    double blue, brown, green, orange, red, yellow;

    total = 55 * 11;
    //Above is accounting for the 11 bags we are experimenting with.

    blue = total * .24;
    brown = total * .13;
    green = total * .16;
    orange = total * .20;
    red = total * .13;
    yellow = total * .14;
    //Above is adding in color distribution expected in each bag.

    System.out.println("Blue: " + blue);
    System.out.println("Brown: " + brown);
    System.out.println("Green: " + green);
    System.out.println("Orange: " + orange);
    System.out.println("Red: " + red);
    System.out.println("Yellow: " + yellow);
    //Above is displaying the data with appropriate lables.

    double checktotal;
    checktotal = blue + brown + green + orange + red + yellow;
    System.out.println("Total: " + checktotal);
    //Above creates a variable to check the percentages match up to the number of M&Ms.

    if (blue > brown && red > orange) {
      System.out.println("Blue over Brown and Red over Orange.");
    }

    if (brown <= green) {
      System.out.println("Brown is less than or equal to Green.");
    }

    if ( total == checktotal){
      System.out.println("Numbers match.");
    }

  }
}