'use strict';
//football betting application:
///////////////////////////////////////
// Coding Challenge #1

/* 
We're building a football betting app (soccer for my American friends 😅)!

Suppose we get data from a web service about a certain game (below). In this challenge we're gonna work with the data. So here are your tasks:

1. Create one player array for each team (variables 'players1' and 'players2')
2. The first player in any player array is the goalkeeper and the others are field players.
 For Bayern Munich (team 1) create one variable ('gk') with the goalkeeper's name, and one array ('fieldPlayers') with all the remaining 10 field players
3. Create an array 'allPlayers' containing all players of both teams (22 players)
4. During the game, Bayern Munich (team 1) used 3 substitute players. So create a new array ('players1Final') containing all the original team1 players plus 'Thiago', 'Coutinho' and 'Perisic'
5. Based on the game.odds objetc, create one variable for each odd (called 'team1', 'draw' and 'team2')

6. Write a function ('printGoals') that receives an arbitrary number of player names (NOT an array) and prints each of them to the console, along with the number of goals that were scored in total (number of player names passed in)
7. The team with the lower odd is more likely to win. Print to the console which team is more likely to win, WITHOUT using an if/else statement or the ternary operator.

TEST DATA FOR 6: Use players 'Davies', 'Muller', 'Lewandowski' and 'Kimmich'. Then, call the function again with players from game.scored

GOOD LUCK 😀
*/

// 1. Create one player array for each team (variables 'players1' and 'players2')

// 1.
// const [players1, players2] = game.players;

// 2.
// const [GK, ...fieldPlayers] = players1;

// 3.
// const allPlayers = [...players1, ...players2];
// 4.
// const players1Final = [...players1, 'Thiago', 'coutinho', 'perisic'];
// 5.
// const {
//   odds: { team1, x: draw, team2 },
// } = game;

// 6.
// const printGoals = function (...players) {
//   console.log(`${players.length} goals were scored`);
// };
// console.log(printGoals(...game.score));
// 7.
// console.log(
//   `team 1 is likey to win ${
//     game.odds.team1 < game.odds.team2 && game.odds.team1
//   }` || `team 2 is likey to win ${game.odds.team2}`
// );
// const odds = {
//   team1: 7.33,
//   x: 3.25,
//   team2: 6.5,
// };

// const days = ['mon', 'tue', 'wed'];
// const restaurant = {
//   name: 'Classico Italiano',
//   location: 'Via Angelo Tavanti 23, Firenze, Italy',
//   categories: ['Italian', 'Pizzeria', 'Vegetarian', 'Organic'],
//   starterMenu: ['Focaccia', 'Bruschetta', 'Garlic Bread', 'Caprese Salad'],
//   mainMenu: ['Pizza', 'Pasta', 'Risotto'],
//   order(param) {
//     console.log(`${this[param]}`);
//   },
//   [days[0]]: 'kaviarasan',
//   odds,
// };
// const menu = [...restaurant.starterMenu, ...restaurant.mainMenu];
// for (const item of menu.entries()) {
//   console.log(`${item[0] + 1}`, item[1]);
// }

// we can destructuring directly
// console.log(restaurant);
// console.log(restaurant.kavi);
// const weekdays = ['mon', 'tue', 'wed', 'fri'];

// const restaurant = {
//   [weekdays[0]]: {
//     open: 0,
//     close: 5,
//   },
//   [weekdays[1]]: {
//     open: 2,
//     close: 4,
//   },
//   [weekdays[2]]: {
//     open: 7,
//     close: 9,
//   },
// };

// const entries = Object.entries(restaurant);
// console.log(entries);

// for (const [x, { open, close }] of entries) {
//   console.log(`resutaurant open on ${x} at ${open}am and close at ${close}pm`);
// }
// const odds = {
//   team1: 1.33,
//   x: 3.25,
//   team2: 6.5,
// };

// Coding Challenge #2

// Let's continue with our football betting app!

// 1. Loop over the game.scored array and print each player name to the console, along with the goal number (Example: "Goal 1: Lewandowski")

// for (const [a, b] of Object.entries(game.scored)) {
//   console.log(`${Number(a) + 1} : ${b}`);
// }
// console.log(Object.entries(game.scored));
// 2. Use a loop to calculate the average odd and log it to the console (We already studied how to calculate averages, you can go check if you don't remember)
// const properties = Object.values(game.odds);
// let sum = 0;
// for (const x of properties) {
//   sum += x;
// }
// console.log(Math.floor(sum / properties.length));
// 3. Print the 3 odds to the console, but in a nice formatted way, exaclty like this:
//       Odd of victory Bayern Munich: 1.33
//       Odd of draw: 3.25
//       Odd of victory Borrussia Dortmund: 6.5
// Get the team names directly from the game object, don't hardcode them (except for "draw"). HINT: Note how the odds and the game objects have the same property names 😉

// for (const [x, y] of Object.entries(game.odds)) {
//   let teamStr = x === 'x' ? 'draw' : ` Victory ${game[x]}`;
//   console.log(`Odd of ${teamStr} ${y}`);
// }

// BONUS: Create an object called 'scorers' which contains the names of the players who scored as properties, and the number of goals as the value. In this game, it will look like this:
//       {
//         Gnarby: 1,
//         Hummels: 1,
//         Lewandowski: 2
//       }

// GOOD LUCK 😀

// create new Ojbect:

// const scorers = {};

// const checkScore = function (player) {
//   if (scorers[player]) {
//     scorers[player]++;
//   } else {
//     scorers[player] = 1;
//   }
// };

// for (const player of game.scored) {
//   checkScore(player, game.scored);
// }

// console.log(scorers);

// const arr = ['kavi', 'arasan', 'anandh', 'kumar'];
// let openStr = arr.join(', ');
// console.log(openStr);

// remove unique elements in the array:
// const arr = [1, 2, 1, 3, 4, 2, 3];

// const unique = [...new Set(arr)];
// console.log(unique.length);

//maps:

// to add the element to map :

// rest.set('name', 'Saravanbhavan');
// rest.set(1, 'Main Menu');
// rest.set(2, 'Starter Menu');

// rest.set({ kavi: 'arasan' }, 'hello');
// rest.set(document.querySelector('.btns'), 'hello kaviarasan');
// console.log(rest);

// Iterator:

//map:

const game = {
  team1: 'Bayern Munich',
  team2: 'Borrussia Dortmund',
  players: [
    [
      'Neuer',
      'Pavard',
      'Martinez',
      'Alaba',
      'Davies',
      'Kimmich',
      'Goretzka',
      'Coman',
      'Muller',
      'Gnarby',
      'Lewandowski',
    ],
    [
      'Burki',
      'Schulz',
      'Hummels',
      'Akanji',
      'Hakimi',
      'Weigl',
      'Witsel',
      'Hazard',
      'Brandt',
      'Sancho',
      'Gotze',
    ],
  ],
  score: '4:0',
  scored: ['Lewandowski', 'Gnarby', 'Lewandowski', 'Hummels'],
  date: 'Nov 9th, 2037',
};
///////////////////////////////////////
// Coding Challenge #3

/* 
Let's continue with our football betting app! This time, we have a map with a log of the events that happened during the game. The values are the events themselves, and the keys are the minutes in which each event happened (a football game has 90 minutes plus some extra time).

1. Create an array 'events' of the different game events that happened (no duplicates)
2. After the game has finished, is was found that the yellow card from minute 64 was unfair. So remove this event from the game events log.
3. Print the following string to the console: "An event happened, on average, every 9 minutes" (keep in mind that a game has 90 minutes)
4. Loop over the events and log them to the console, marking whether it's in the first half or second half (after 45 min) of the game, like this:
      [FIRST HALF] 17: ⚽️ GOAL

GOOD LUCK 😀
*/
const gameEvents = new Map([
  [17, '⚽️ GOAL'],
  [36, '🔁 Substitution'],
  [47, '⚽️ GOAL'],
  [61, '🔁 Substitution'],
  [64, '🔶 Yellow card'],
  [69, '🔴 Red card'],
  [70, '🔁 Substitution'],
  [72, '🔁 Substitution'],
  [76, '⚽️ GOAL'],
  [80, '⚽️ GOAL'],
  [92, '🔶 Yellow card'],
]);

// indexOf();
// lastIndexOF();
// console.log(airLines.lastIndexOf('a'));

// change price(288,97#) = to Us dollar:

// look replaceAll();

// return boolean methods:
// 1) name.includes('some stirng');('A320');
// 2)name.startsWith();
// 3)name.endsWith();

// practice exercise:
// checkbaggage():
// if a person has gun or knife not allowed to plane :

// split string method:
// 1)split('')
// 2)join(' '),it join the array of vlaue in single string separated by what we given:
//3)padding a string:
// padStart(); - >untill we get the desired length it pad the what we given in beginning :
// padEnd(); = > it pad the end:
// 4)repeat()=>to repeat the string number of times you want:

// the name has firstname and lastname separated by space:
//if one of the operand is string with plus ,then it convert all others also string:

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

// const text = document.createElement('textarea');
// document.body.appendChild(text);
// const btn = document.createElement('button');
// document.body.appendChild(btn);
// btn.textContent = 'submit';

// const convertCamelCase = str => {
//   const names = str.split('\n');

//   // otherwise you can use for of loop with entries:
//   for (let i = 0; i < names.length; i++) {
//     let [first, second] = names[i].split('_');
//     let secLower = second.toLowerCase();
//     let secChanged = secLower.replace(secLower[0], secLower[0].toUpperCase());
//     const res = first.toLowerCase() + secChanged;
//     console.log(res.trim(), '📌'.repeat(i + 1));
//   }
// };
// btn.addEventListener('click', function () {
//   convertCamelCase(text.value);
// });

const flights =
  '_Delayed_Departure;fao93766109;txl2133758440;11:25+_Arrival;bru0943384722;fao93766109;11:45+_Delayed_Arrival;hel7439299980;fao93766109;12:05+_Departure;fao93766109;lis2323639855;12:30';

// 🔴 Delayed Departure from FAO to TXL (11h25)
//              Arrival from BRU to FAO (11h45)
//   🔴 Delayed Arrival from HEL to FAO (12h05)
//            Departure from FAO to LIS (12h30)

// const flightTime = flights.split('+');

// for (const x of flightTime) {
//   const [a, b, c, d] = x.replaceAll('_', ' ').split(';');
//   const alterb = b.slice(0, 4).toUpperCase();
//   const alterc = c.slice(0, 4).toUpperCase();
//   const alterd = d.replace(':', 'h');
//   const altera = a.startsWith('Delayed') ? '📌
//   console.log(altera, alterb, alterc, alterd);
// }
