public class Libs {  
	
    /* This program generates a mad libbed story.
       In this game, call a friend or declare variables yourself, maintaining the structure below.
       I left some names, verbs, and places as an example—change them as you wish.
       Author: Miguel F. S Moraes
       Date: 01/03/2025
    */

    public static void main(String[] args) {  

        String name1 = "Miguel";
        String adjective1 = "Genius";
        String adjective2 = "Beautiful";
        String adjective3 = "Stronger";
        String verb1 = "walking";
        String noun1 = "Nicole";
        String noun2 = "Gabriel";
        String noun3 = "Isaac";
        String noun4 = "Gislene";
        String noun5 = "Vitória"; // Corrigido problema de acentuação
        String noun6 = "Erick";
        String name2 = "Maria";
        int number = 25;
        String place1 = "Tokyo";

        // The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + 
                       ". 'It is going to be a " + adjective2 + " day!' Outside, a bunch of " + 
                       noun1 + "s were protesting to keep " + noun2 + " in stores. They began to " + 
                       verb1 + " to the rhythm of the " + noun3 + ", which made all the " + noun4 + 
                       " very " + adjective3 + ". Concerned, " + name1 + " texted " + name2 + 
                       ", who flew " + number + " miles to " + place1 + 
                       " and stood in front of the " + noun5 + 
                       ". She then said: 'Let's celebrate with " + noun6 + "'.";

        System.out.println(story);  
    }
}

