/**
 * This is the BoardFoot program
 * By: Troy Appleby
 * version 1.0
 * since   2024-03-02
 */

import { createPrompt } from 'bun-promptx'

function boardFoot(boardWidthFloat, boardHeightFloat) {
  // this function calculates the length of a boardFoot
  const boardFoot = 144
  const boardLength = boardFoot / (widthFloat * heightFloat)

  return boardLength
}

// input
const width = createPrompt("Enter the width(inch): ")
const widthFloat = parseFloat(width.value || "-1")
const height = createPrompt("Enter the height(inch): ")
const heightFloat = parseFloat(height.value || "-1")

// error check
let validInput = true 
if (isNaN(widthFloat) == true || widthFloat < 0) {
  console.log("Invalid input.")
  validInput = false
} else if (isNaN(heightFloat) == true || heightFloat < 0) {
  console.log("Invalid input.")
  validInput = false
} else {
  // process
  let boardLength = boardFoot(widthFloat, heightFloat)
  // output
  console.log(`Length of the board ${boardLength} inch(es) long.`)
}

console.log("\nDone.")
