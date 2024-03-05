/**
 * This is a program is the dice game
 *
 * By:  Troy Appleby
 * Version: 1.0
 * Since:  2024-02-26
 */

import { createPrompt } from 'bun-promptx'

// constants & variables
const randomNumber = Math.floor((Math.random() * 6) + 1)
let totalGuesses = 0

while (true) {
  // input
  const userGuess = createPrompt("Guess a number between 1 - 6: ")
  const userGuessInt = parseInt(userGuess.value || "-1")
  // error check
  if (isNaN(userGuessInt) == true || userGuessInt < 1 || userGuessInt > 6) {
    console.log("Invalid input")
  } else {
    // process
    totalGuesses += 1
    if (userGuessInt > randomNumber) {
      console.log(`You guessed too high, try again!\n`)
    } else if (userGuessInt < randomNumber) {
      console.log(`You guessed too low, try again!\n`)
    } else {
      // output
      console.log(`You are correct!\nTotal guesses: ${totalGuesses}`)
      break
    }
  }
}

console.log("\nDone.")
