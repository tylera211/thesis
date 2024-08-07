/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

public class App {
    public static void main(String[] args) {

        // Initialize the appropriate quiz type and execute it
        AbstractQuiz quiz = new MathQuiz();
        quiz.run();
    }
}
