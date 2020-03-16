package demorock;
import javax.swing.JOptionPane;


public class DemoRock {

    
    public static void main(String[] args) {
    
        Rocks purpleRock = new Rocks(1,12);
        
        String one = createInfo(purpleRock);
        
        
        IgneousRock obsidian = new IgneousRock(2,13);
        
        String two = createInfo(obsidian);
        
        
        MetamorphicRock granite = new MetamorphicRock(3,4);
        
        String three = createInfo(granite);
        
        SedimentaryRock mozarkite = new SedimentaryRock(4,9); 
        
       String four = createInfo(mozarkite); 
        
        
        String myMessage = one + two + three + four;
        
        
        JOptionPane.showMessageDialog(null, myMessage, "Rock Museum Collection", JOptionPane.PLAIN_MESSAGE);  
    }
    
    static public String createInfo(Rocks rock)
    {
        String message = "Sample: #" + rock.getSampleNumb() + "    Weight: " + rock.getWeightGrams()
                + " grams \nDescription: " + rock.getDesc() + "\n\n";
    
        return message;
    }
}
