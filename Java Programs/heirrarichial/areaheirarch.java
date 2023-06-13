class parent {
   void display() {
      System.out.println("Area calculation");
   }
}

class rect extends parent {
   int l;
   int b;
   
   rect(int ll, int bb) {
      l = ll;
      b = bb;
   }
   
   void display() {
	  int total =l*b;
      System.out.println("Area of rectangle: " + total);
   }
}

class triangle extends parent {
   int b;
   int h;
   
   triangle(int kk, int hh) {
      b = kk;
      h = hh;
   }
   
   void display() {
	   double total=(0.5 * b * h);
      System.out.println("Area of triangle: " + total);
   }
}

class areaheirarch {
   public static void main(String[] args) {
      rect r = new rect(10, 20);
      triangle t = new triangle(30, 40);
      
      r.display();
      t.display();
   }
}
