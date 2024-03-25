/*
 * This is a program that calculates the area of a circle.
 *
 * @author  Andi Cucka
 * @version 1.0
 * @since   2024-01-01
 */

import { CarStack } from './car-stack.js';

let fruits = new CarStack();
fruits.push("apple");
fruits.push("banana");
console.log("fruits: " + fruits.show());


let colours = new CarStack();
colours.push("red");
colours.push("green");
colours.push("blue");
console.log("colours: " + colours.show());

let cars = new CarStack();
cars.push("");
cars.push("1999 Toyota Supra A80 MkIV");
cars.push("2002 Nissan Skyline GTR R34 ");
cars.push("1992 Mazda Rx7 FD");
cars.push("1680 Farffler Tricycle 6 Speed Fuel injection Turbocharged Custom Widebody");
console.log("cars: " + cars.show());

console.log("\nDone.");
