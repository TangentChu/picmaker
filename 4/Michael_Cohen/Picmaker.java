import java.util.*;
import java.io.*;

public class Picmaker {
    
    public static void makeImage() {
	//generates a PPM file
	try  {
	    PrintStream out = new PrintStream("picmaker.ppm"); 
	    int x = 500, y = 500;
	    out.print("P3\n" + x + " " + y + " 255\n");
	    int r, g, b;
	    for(int i = 0;i < 500;i++) {
		for(int j = 0;j < 500;j++) {
		    r = (int)(Math.random() * 256);
		    g = (int)(Math.random() * 256);
		    b = (int)(Math.random() * 256);
		    out.print(r + " " + g + " " + b + " ");
		}
	    }
	    out.close();
	}
	catch (FileNotFoundException e) { }
    }

    public static void main(String args[]) {
	Picmaker.makeImage();
    }

}