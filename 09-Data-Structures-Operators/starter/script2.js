'use strict';
// restaurant details are packed into object:
const restaurant = {
  name: 'Classico Italiano',
  location: 'Via Angelo Tavanti 23, Firenze, Italy',
  categories: ['Italian', 'Pizzeria', 'Vegetarian', 'Organic'],
  starterMenu: ['Focaccia', 'Bruschetta', 'Garlic Bread', 'Caprese Salad'],
  mainMenu: ['Pizza', 'Pasta', 'Risotto'],
  order: function () {
    return [this.starterMenu[0], this.starterMenu[1]];
  },
  mon: {
    open: 11,
    close: 12,
  },
  tue: {
    open: 12,
    close: 8,
  },
  orderDelivery: function ({ mainIndex, starterIndex = 0 }) {
    return [this.starterMenu[starterIndex], this.mainMenu[mainIndex]];
  },
  addItemToStarter(arr) {
    this.starterMenu = [...this.starterMenu, ...arr];
  },
  orderPasta(mainIng, ...optional) {
    // console.log(mainIng, optional);
  },
};

// restaurant.orderPasta('mushroom');

const [a, ...arr] = [1, 2, 3, 4];
// console.log(a, arr);
function take(...args) {
  return args;
}
// console.log(take(1, 2, 3));
const order = restaurant.orderDelivery({
  time: '2:30',
  address: 'kamaraj street',
  mainIndex: 2,
  starterIndex: 2,
});
// console.log(order);

// const items = ['apple', 'orange', 'grapes'];
// restaurant.addItemToStarter(items);
// console.log(restaurant.starterMenu);
// to copy the porperty of objects: we can use sperad operator:
const obj = { ...restaurant, kavi: 'arasan' };
// console.log(obj);
// let {
//   mon: { open, close },
// } = restaurant;
// console.log(open, close);
// mutate values:
// let a = 23;
// let b = 35;
// ({ b, a } = { a, b });
// console.log(a, b);
// destructuring:
// const { fri: shedule = { value: 'does not exist' }, location: locate = [] } =
//   restaurant;
// console.log(shedule, locate);
// we can skip the element:
// const [first, , second] = restaurant.categories;
// console.log(first, second);
// swap the element:
// let [main, secondary] = restaurant.categories;
// console.log(main, secondary);
// [secondary, main] = [main, secondary];
// console.log(main, secondary);
// const arr = [1, 2, [3, 4], 5, 6];
// const [a, b, [c, d]] = arr;
// console.log(a, b, c, d);

// const [one, two] = restaurant.order();
// console.log(one, two);
// const [a, b, c = 2] = [1, 2];
// console.log(a, b, c);

// string: Methods:
// indexOf() ->both array and string return the position of specified character or element:
// lastIndexOf()--> return the lastOccurence of the character -> or string: -> it return index if it occured else it return the -1;
// console.log(airline.indexOf('Top'));
// slice method: it is not mutate the array:

// console.log(airline.slice(4, 7));

// extract the first word: and last word of the string:
// console.log(airline.slice(0, airline.indexOf(' ')));
// console.log(airline.slice(airline.lastIndexOf(' ') + 1));

function checkSeat(seat) {
  const last = seat.slice(-1);
  if (last === 'B' || last === 'E') return true;
  else return false;
}

// console.log(checkSeat('11E'));
// what is boxing in js
// javascript automatically conver the string into string object when we call the method on the string:

const airline = 'TAP Air Portugal';
const plane = 'A230';

// console.log(airline.toLowerCase());
// console.log(airline.toUpperCase());
// console.log(typeof airline.slice(-1));
// trim () is used to trim the leading spaces:
// trimStart();
// trimEnd();
// function checkingEmail(email) {
//   const defaults = 'akavi846@gmail.com';
//   const trimmedMail = email.toLowerCase().trim();
//   console.log(trimmedMail);
// }

// checkingEmail('  akavi846@Gmail.com  ');

const priceGB = '288,97##';
// it replace the first occurence;
// const priceUS = priceGB.replace('#', '$');
const priceUS = priceGB.replaceAll('#', '$');
// console.log(priceUS);
// inclucdes();
// startswith();
// endsWith();
// split();
// padStart();
// padEnd();
// const message = 'All is well';
// const demo = message.repeat(4);
// console.log(demo);

// object looping:
// Object.keys() return the [array of keys:];
// Object.values() return the [array of values]
// for (const x of Object.keys(restaurant)) {
//   console.log(x);
// }
// for (const x of Object.entries(restaurant)) {
//   console.log(x);
// }

///////////////////////////////////////
// Coding Challenge #4

/* 
Write a program that receives a list of variable names written in underscore_case and convert them to camelCase.

The input will come from a textarea inserted into the DOM (see code below), and conversion will happen when the button is pressed.

THIS TEST DATA (pasted to textarea)
underscore_case
 first_name
Some_Variable 
  calculate_AGE
delayed_departure

SHOULD PRODUCE THIS OUTPUT (5 separate console.log outputs)
underscoreCase      ✅
firstName           ✅✅
someVariable        ✅✅✅
calculateAge        ✅✅✅✅
delayedDeparture    ✅✅✅✅✅

HINT 1: Remember which character defines a new line in the textarea 😉
HINT 2: The solution only needs to work for a variable made out of 2 words, like a_b
HINT 3: Start without worrying about the ✅. Tackle that only after you have the variable name conversion working 😉
HINT 4: This challenge is difficult on purpose, so start watching the solution in case you're stuck. Then pause and continue!

Afterwards, test with your own test data!

GOOD LUCK 😀
*/

const input = document.querySelector('textarea[name="username"]');
const btn = document.querySelector('button[type="submit"');
const camelCase = function (username) {
  const name = username.toLowerCase().trim().split('\n');
  name.forEach((names, i) => {
    const [firstName, lastName] = names.trim().split('_');
    const secChanged = lastName.replace(lastName[0], lastName[0].toUpperCase());
    let fullName = (firstName + secChanged).padEnd(22, '_');
    console.log(fullName + '🎯'.repeat(i + 1));
  });
};
btn.addEventListener('click', function (event) {
  event.preventDefault();
  camelCase(input.value);
});
// / ===================
const getFrom = function (data) {
  return data.slice(0, 4).toUpperCase();
};
const flighTime = function (timeDetails) {
  for (const x of timeDetails.split('+')) {
    const [a, b, c, d] = x.split(';');
    const output = `${a.startsWith('_Delayed') ? '🔴' : ''} ${a.replaceAll(
      '_',
      ' '
    )} ${getFrom(b)} ${getFrom(c)} (${d.replace(':', 'h:')})`.padStart(36, ' ');
    // console.log(output);
  }
};

var flights =
  '_Delayed_Departure;fao93766109;txl2133758440;11:25+_Arrival;bru0943384722;fao93766109;11:45+_Delayed_Arrival;hel7439299980;fao93766109;12:05+_Departure;fao93766109;lis2323639855;12:30';

// 🔴 Delayed Departure from FAO to TXL (11h25)
//              Arrival from BRU to FAO (11h45)
//   🔴 Delayed Arrival from HEL to FAO (12h05)
//            Departure from FAO to LIS (12h30)
flighTime(flights);

// default parameter in function; to set the default value of the function parameter:

const booking = [];

const createBooking = function (
  username,
  flightNum,
  numOfPassenger = 1,
  price = numOfPassenger * 5
) {
  const flight = {
    username,
    flighTime,
    numOfPassenger,
    price,
  };
  booking.push(flight);
  return flight;
};
// console.log(createBooking('LBH2'));
// console.log(createBooking('kaviarasan', 'LBH2', 3, 10));
console.log(booking);

// const inputs = prompt('Enter your name');

// const upperCase = function (str) {
//   return str.toUpperCase();
// };
// const lowerCase = function (str) {
//   return str.toLowerCase();
// };

// const transformer = function (str, fn) {
//   console.log(`The string was transformed by : ${fn(str)}`);
// };
// transformer(inputs, lowerCase);

const lufthansa = {
  airline: 'Lufthansa',
  iataCode: 'LH',
  booking: [],
  book(flightNum, name) {
    console.log(`${name} booked a seat on ${this.airline} ${flightNum}`);
    this.booking.push({ name, flightNum });
  },
};
const euroWings = {
  airline: 'euroWings',
  iataCode: 'eu',
  booking: [],
};
const swiss = {
  airline: 'swiss',
  iataCode: 'sw',
  booking: [],
};
// console.log(lufthansa.book(234, 'kaviarasan'));
const book = lufthansa.book;
// usage of call methods:
// apply method does not receive the list of arguments after the object name, instead it will take array of parameter:
const bookEu = book.bind(euroWings);
const bookLuf = book.bind(lufthansa);
const bookSiws = book.bind(swiss, 44);

bookSiws('Kaviarasan');
console.log(swiss.booking);
