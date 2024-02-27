/*
 *This program calculates how long the users food takes to heat in the microwave
 *
 * By:Troy Appleby
 * Version: 1.0
 * Since:   2024-02-26
 */

import { createPrompt } from 'bun-promptx'

// Constants
const soup = 105
const sub = 60
const pizza = 45
const percentTwo = 1.5
const percentThree = 2
let totalTime = 0
let minutes = 0
let seconds = 0

// input
const userInput = prompt("Enter the food you want to heat: ")
const userInput2 = prompt("Enter the quantity of food you want to heat: ")
const itemNumber = parseFloat(userInput2)
// process & output
if (userInput === "soup" || userInput === "sub" || userInput === "pizza") {
  if (userInput === "soup") {
    totalTime = soup
  } else if (userInput === "pizza") {
    totalTime = pizza
  } else if (userInput === "sub") {
    totalTime = sub
  }

  if (itemNumber === 1 || itemNumber === 2 || itemNumber === 3) {
    if (itemNumber === 2) {
      totalTime = totalTime * percentTwo
    } else if (itemNumber === 3) {
      totalTime = totalTime * percentThree
    }
    seconds = totalTime / 60
    minutes = Math.floor(seconds)
    seconds = (seconds - minutes) * 60
    console.log(

      `\nthe total time elapsed is: ${minutes} minutes and ${seconds} seconds.`
    )
  } else {
    console.log("That is an invalid.")
  }

} else {
  console.log("That is an invalid input.")
}

console.log("\nDone.")/*
