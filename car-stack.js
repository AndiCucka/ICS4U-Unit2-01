/*
 * Class that defines string stack.
 *
 * @author  Andi Cucka
 * @version 1.0
 * @since   2024-01-01
 */
export class CarStack {

  // variables
  constructor() {
    this.strstack = [];
  }

  // push item to end of list
  push(input) {
    this.strstack.push(input);
  }

  // show full stack separated by commas
  show() {
    let values = "";
    for (let counter = 0; counter < this.strstack.length; counter++) {
      values = values + this.strstack[counter] + ", ";
    }
    values = values.substring(0, values.length - 2);
    return values;
  }
}
