/**
 * No code from this file may not be reproduced, altered or further distributed
 * by any means whether printed, electronic or otherwise without the prior
 * written consent of author. If you have any questions please do not hesitate
 * to contact me: http://www.linkedin.com/pub/valery-samovich/22/81/1bb/
 *
 * FileName - CrystalBall.java
 * Author: Valery Samovich
 * Date: 2014/05/26
 */

package com.valery.crystal.ball;

import java.util.Random;

public class CrystalBall {
    // Member variables (properties about the object)
    public String[] mAnswers = {
            "It is certain!",
            "It is decidedly so!",
            "All signs say yes!",
            "The stars are not aligned!",
            "My reply is no!",
            "It is doubtful!",
            "Better not tell you now!",
            "Concentrate and ask again!",
            "Unable to answer now!",
            "It is hard to say!"};
    
    // Methods (abilities: things the object can do)
    public String getAnAnswer(){
    
        String answer = "";
        
        // Randomly select one of three answers: Yes, No, or Maybe
        // Construct a new Random number generator
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mAnswers.length);
        
        
        // Convert the randomNumber to a text answer
        answer = mAnswers[randomNumber];
        return answer;

    }

}
