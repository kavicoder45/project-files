// const items = ["Item-1", "Item-2", "Item-3", "Item-4"];
// console.log(items);
// const years = new Array(1991, 1891, 1234);
// console.log(years);
// console.log(years.length);
// const graduation = 2025;

// const person = ["Kavi", "arasan", 20, ["skcet", "ece"], graduation];

// console.log(person);
// console.log(person[3].length);

// const calcAge = (birthYear) => {
//   return 2023 - birthYear;
// };

// const ages = [calcAge(1991), calcAge(1993), calcAge(2003)];

// console.log(ages);

// const friends = ["steve", "sherbil", "antony"];
// console.log(friends.push("kavi"));
// console.log(friends);
// friends.pop();
// console.log(friends);
// friends.unshift("kaviarasan");
// console.log(friends);
// console.log(friends.shift());
// console.log(friends);

// this index function and includes uses strict equality operator for comparison:
//mainly includes used inside the conditional context

// /

// console.log(jonas);
// console.log(jonas.lastName);
// console.log(jonas["job"]);
// const nameKey = "Name";
// console.log(jonas["first" + nameKey]);

// const what = prompt("what do want to know about me ?");
// console.log(jonas[what]);
// if (jonas[what]) {
//   console.log(jonas[what]);
// } else {
//   console.log("wrogn request....!");
// }

// jonas.location = "delhi";
// jonas["tiwtter"] = "kavi@twitter.com";

// console.log(jonas);
// console.log(
//   `${jonas.firstName} has ${jonas.friends.length} friends, and his best friends is called ${jonas.friends}`
// );

// const jonas = {
//   firstName: "Jonas",
//   lastName: "Schemdtmann",
//   birthYear: 2003,
//   job: "teacher",
//   hasDriverLicense: false,
//   friends: ["Michael", "Peter", "Steven"],
//   calcAge: function () {
//     this.age = 2023 - this.birthYear;
//     return this.age;
//   },
//   getSummary: function () {
//     this.summary = `${
//       jonas.firstName
//     } is a ${this.calcAge()} year old teacher, and he ${
//       this.hasDriverLicense
//         ? "has a driver's License"
//         : "has no diver's License"
//     }`;
//   },
// };
// console.log(jonas.calcAge());
// console.log(jonas.getSummary());
// console.log(jonas.age);
// console.log(jonas.summary);

// for (let i = 1; i <= 10; i++) {
//   console.log(`The repuation of weight is ${i}`);
// }

// const items = ["Item-1", "Item-2", "Item-3", "Item-4"];

// for (let i = 0; i < items.length; i++) {
//   console.log(items[i]);
// }

const person = ["Kavi", "arasan", 20, ["skcet", "ece"], "graduation"];
// const type = [];

// for (let i = 0; i < person.length; i++) {
//   console.log(person[i]);
//   type.push(typeof person[i]);
// }
// console.log(type);

// const birthYear = [2003, 2005, 2006, 2007];
// const ages = [];
// const currentYear = 2023;

// for (let i = 0; i < birthYear.length; i++) {
//   ages.push(currentYear - birthYear[i]);
// }
// console.log(ages);

// console.log("___ONTY STRING___");

// for (let i = 0; i < person.length; i++) {
//   if (typeof person[i] !== "string") break;

//   console.log(`${person[i]} ${typeof person[i]}`);
// }

// for (let i = person.length - 1; i >= 0; i--) {
//   console.log(person[i], i);
// }

// for (exercise = 1; exercise < 4; exercise++) {
//   console.log(`Starting exercise is ${exercise}`);

//   for (rep = 1; rep < 3; rep++) {
//     console.log(`The ${exercise}: reputation ${rep} 🏋️‍♂️`);
//   }
// }

const dice = Math.random();
console.log(dice);
