/**
 * Follow instructions in the Readme.md 
 * IMPORTANT:  You can only use:
 *      hop()
 *      plant()
 *
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
//        new JerooGUI();
        runJerooCode();
    }

    /**
     * Put your main Jeroo code here.
     */
    public static void runJerooCode() {
{
   // instantiate the Jeroo (i.e. create it) 
   // and then make a remote control pointing to it called kim
   Jeroo kim = new Jeroo(0, 0, EAST, 5);
   kim.hop();
   kim.plant();
   kim.hop();
}    
    }

}
