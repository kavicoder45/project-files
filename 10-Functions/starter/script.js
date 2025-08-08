'use strict';

// default parameters: to overcome the undefined values:

// // overcome in ES6:
// age = age || 18;
// eligible = eligible || 'yup';
const persons = [];
const person = (
  name = 'user',
  age = 10,
  eligible = age > 18 ? 'Yes' : 'No'
) => {
  // enhanced object:
  const list = {
    name,
    age,
    eligible,
  };
  persons.push(list);
};
console.log(persons);
// you should give undefined, if you give empty character, it will take empty character as value:::
person('kavi', '', 'yes');
person();
// console.log(persons);

// const oneWord = function (str) {
//   return str.replaceAll(' ', '').toLowerCase();
// };

// const firstUpperWord = function (str) {
//   const [first, ...others] = str.split(' ');
//   return [first.toUpperCase(), ...others].join(' ');
// };

// const transform = (str, fun) => {
//   console.log(fun(str));
// };

// one word :: firstUpperWord:

// transform('javascript is best programming Language!', firstUpperWord);
// transform('javascript is best programming Language!', oneWord);

// const upperCase = function (name) {
//   return name.replaceAll(' ', '').toUpperCase();
// };
// const lowerCase = function (name) {
//   return name.replace(/ /g, '').toLowerCase();
// };
// const transform = function (str, fun) {
//   console.log(fun(str));
// };

// const greeting = greet => {
//   return function (name) {
//     console.log(`${greet}, ${name}`);
//   };
// };
// greeting('hello')('murugan');

const lufthansa = {
  airline: 'Lufthansa',
  iataCode: 'LH',
  bookings: [],
  // book: function() {}
  book(flightNum, name) {
    console.log(
      `${name} booked a seat on ${this.airline} flight ${this.iataCode}${flightNum}`
    );
    this.bookings.push({ flight: `${this.iataCode}${flightNum}`, name });
  },
};

const euroWings = {
  airline: 'euro',
  iataCode: 'EU',
  bookings: [],
};

// const book = lufthansa.book; this function this object will be undefined becuase it is in a global scope:
// const book = lufthansa.book;
// const bookLuf = book.bind(lufthansa, 23);
// bookLuf('Kaviarasan');

// book.call(euroWings, 33, 'Murugan');
// console.log(euroWings);

// console.log(lufthansa.book(23, 'Kavikumar'));
// console.log(lufthansa);

//  by using bind method we can preset the parameters:

lufthansa.planes = 300;
lufthansa.plane = function () {
  this.planes++;
  console.log(this.planes);
};
document
  .querySelector('.buy')
  .addEventListener('click', lufthansa.plane.bind(lufthansa));
// if you use call in this place: it will imediately call the function before the button events triggered:
// the order of arguments should  important::::

// const addTax = (rate, value) => {
//   return function () {
//     return value + (value * rate) / 100;
//   };
// };

// const addVAT = addTax(23, 100);
// console.log(addVAT());

const addTax = value => {
  return function (charge) {
    return value + (charge * value) / 100;
  };
};
const addVAT = addTax(0.23);
console.log(addVAT(56));

///////////////////////////////////////
// Coding Challenge #1

/* 
Let's build a simple poll app!

A poll has a question, an array of options from which people can choose, and an array with the number of replies for each option. This data is stored in the starter object below.

Here are your tasks:

1. Create a method called 'registerNewAnswer' on the 'poll' object. The method does 2 things:
  1.1. Display a prompt window for the user to input the number of the selected option. The prompt should look like this:
        What is your favourite programming language?
        0: JavaScript
        1: Python
        2: Rust
        3: C++
        (Write option number)
  
  1.2. Based on the input number, update the answers array. For example, if the option is 3, increase the value AT POSITION 3 of the array by 1. Make sure to check if the input is a number and if the number makes sense (e.g answer 52 wouldn't make sense, right?)
2. Call this method whenever the user clicks the "Answer poll" button.
3. Create a method 'displayResults' which displays the poll results. The method takes a string as an input (called 'type'), which can be either 'string' or 'array'. If type is 'array', simply display the results array as it is, using console.log(). This should be the default option. If type is 'string', display a string like "Poll results are 13, 2, 4, 1". 
4. Run the 'displayResults' method at the end of each 'registerNewAnswer' method call.

HINT: Use many of the tools you learned about in this and the last section 😉

BONUS: Use the 'displayResults' method to display the 2 arrays in the test data. Use both the 'array' and the 'string' option. Do NOT put the arrays in the poll object! So what shoud the this keyword look like in this situation?

BONUS TEST DATA 1: [5, 2, 3]
BONUS TEST DATA 2: [1, 5, 3, 9, 6, 1]


GOOD LUCK 😀
*/

const poll = {
  choices: new Array(4).fill(0),
  registerNewAnswer() {
    let option = Number(
      prompt(` What is your favourite programming language?\n
        0: JavaScript\n
        1: Python\n
        2: Rust\n
        3: C++\n`)
    );
    if (typeof option == 'number' && option < 4) {
      this.choices[option]++;
      this.displayResults();
    } else {
      alert('Enter the correct option');
    }
  },
  displayResults(type = 'array') {
    console.log(this.choices);
  },
};
document
  .querySelector('.poll')
  .addEventListener('click', poll.registerNewAnswer.bind(poll));
poll.displayResults.call({ choices: [1, 2, 3] });
// const poll = {
//   options: ['Javascript', 'Python', 'Rust', 'C++'],
//   answers: [0, 0, 0, 0],
//   registerNumber: function () {
//     const input = Number(
//       prompt(
//         `What is your Favourite Programming Language ?\n 1.JavaScript\n2.Python\n3.Rust\n4.C++ `
//       )
//     );
//     if (input > this.answers.length) {
//       alert('Enter the Number within Option');
//       return;
//     }
//     this.answers[input - 1]++;
//     this.displayResults();
//   },
//   displayResults: function (type = 'array') {
//     console.log(this.answers);
//   },
// };

// const btn = document.querySelector('.poll');
// btn.addEventListener('click', poll.registerNumber.bind(poll));

// to convert array string we use join method:

// (function () {
//   console.log('kaviarasan');
// })();

// closure/

///////////////////////////////////////
// Coding Challenge #2

/* 
This is more of a thinking challenge than a coding challenge 🤓

Take the IIFE below and at the end of the function, attach an event listener that changes the color of the selected h1 element ('header') to blue, each time the BODY element is clicked. Do NOT select the h1 element again!

And now explain to YOURSELF (or someone around you) WHY this worked! Take all the time you need. Think about WHEN exactly the callback function is executed, and what that means for the variables involved in this example.

GOOD LUCK 😀
*/

(function () {
  const header = document.querySelector('h1');
  header.style.color = 'red';

  document.querySelector('body').addEventListener('click', function () {
    header.style.color = 'blue';
  });
})();
// check the console methods: what are the console methods are therer
