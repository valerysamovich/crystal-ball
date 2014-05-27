/**
 * FileName - CrystalBall.java
 * Copyright (c) Valery Samovich. All rights reserved.
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
