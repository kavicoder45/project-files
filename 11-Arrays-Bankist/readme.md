// both array and string have slice method:
// console.log(movements.slice());
// and also we have splice method: which mutate the array:
// and also we have reverse array: actuall the reverse method mutate the array:
// console.log(movements.at(-1));
// join() -> it convert the array to string:

// const updateUI = function (acc) {
// calcPrintBalance(acc);
// calcDisplaySummary(acc);
// displayMovements(acc.movements);
// };

// //<-display Movement->

// const displayMovements = (movements, type = false) => {
// // this line remove the static element that we have already defined in our html page:
// containerMovements.innerHTML = '';
// const movs = type ? movements.slice().sort((a, b) => a - b) : movements;

// movs.forEach(function (mov, i) {
// const type = mov > 0 ? 'deposit' : 'withdrawal';
// const html = `//       <div class="movements__row">
//           <div class="movements__type movements__type--${type}">${
//       i + 1
//     } ${type}</div>
//           <div class="movements__date">3 days ago</div>
//           <div class="movements__value">${mov}€</div>
//       </div>
//        `;
// containerMovements.insertAdjacentHTML('afterbegin', html);
// });
// };

// // calc current balance:
// const calcPrintBalance = function (acc) {
// acc.balance = acc.movements.reduce((acc, curr) => acc + curr);
// labelBalance.textContent = `${acc.balance}€`;
// console.log(acc);
// };

// const calcDisplaySummary = function (acc) {
// // income
// const incomes = acc.movements
// .filter(mov => mov > 0)
// .reduce((acc, cur) => acc + cur, 0);

// labelSumIn.textContent = `${incomes}€`;
// // outcome
// const outcomes = acc.movements
// .filter(mov => mov < 0)
// .reduce((acc, cur) => acc + cur, 0);

// labelSumOut.textContent = `${Math.abs(outcomes)}€`;

// // interest: for every deposits:
// const interest = acc.movements
// .filter(mov => mov > 0)
// .map(cur => (cur \* acc.interestRate) / 100)
// // interest should atleast one euro:
// .filter(int => int >= 1)
// .reduce((acc, tot) => tot + acc, 0);
// labelSumInterest.textContent = `${interest}€`;
// };

// const createUsernames = function (accs) {
// accs.forEach(function (acc) {
// acc.username = acc.owner
// .toLowerCase()
// .split(' ')
// .map(names => names[0])
// .join('');
// });
// };

// createUsernames(accounts);

// let currentAccount;
// btnLogin.addEventListener('click', function (event) {
// // prevent from submitting:
// event.preventDefault();

// currentAccount = accounts.find(function (acc) {
// if (acc.username === inputLoginUsername.value) return acc;
// });

// if (currentAccount?.pin === Number(inputLoginPin.value)) {
// labelWelcome.textContent = `Welcome ${currentAccount.owner.split(' ')[0]}`;

// containerApp.style.opacity = 100;
// inputLoginPin.value = inputLoginUsername.value = '';
// inputLoginPin.blur();
// updateUI(currentAccount);
// }
// });

// // trasnfer:
// btnTransfer.addEventListener('click', function (event) {
// event.preventDefault();
// const amount = inputTransferAmount.value;
// const recieverAcc = accounts.find(
// acc => acc.username === inputTransferTo.value
// );
// if (
// amount > 0 &&
// recieverAcc &&
// currentAccount.balance >= amount &&
// recieverAcc?.username !== currentAccount.username
// ) {
// currentAccount.movements.push(-amount);
// recieverAcc.movements.push(amount);
// updateUI(currentAccount);
// }
// inputTransferAmount.value = inputTransferTo.value = '';
// });

// // first if user want to close the account, the close account should be current account:
// btnClose.addEventListener('click', function (event) {
// event.preventDefault();
// const user = inputCloseUsername.value;
// const pin = Number(inputClosePin.value);
// });

// btnLoan.addEventListener('click', function (e) {
// e.preventDefault();
// const amount = Number(inputLoanAmount.value);
// if (
// amount > 0 &&
// currentAccount.movements.some(move => move >= amount \* 0.1)
// ) {
// //add movements:
// currentAccount.movements.push(amount);
// updateUI(currentAccount);
// }
// });

// // sorting:
// let sorted = false;
// btnSort.addEventListener('click', function (event) {
// event.preventDefault();
// displayMovements(currentAccount.movements, !sorted);
// sorted = !sorted;
// });

// ArrayMethod practice:

// const allSum = accounts.map(acc => acc.movements).flat();
// const allSum = accounts
// .flatMap(acc => acc.movements)
// .filter(acc => acc > 0)
// .reduce((acc, cur) => acc + cur);
// console.log(allSum);

// 2.

// const allDeposit = accounts
// .flatMap(acc => acc.movements)
// .filter(ele => ele > 1000).length;
// console.log(allDeposit);

// using reduce:
// readuce method expect accumulator value for each iteration:

// const allDeopsit = accounts
// .flatMap(acc => acc.movements)
// .reduce((acc, cur) => (cur >= 1000 ? ++acc : acc), 0);
// console.log(allDeopsit);

// 3.
/_
const obj ={
sumwith: x,
sumdep: y
};
_/

// recreate this in array:
// const { deposit, withDrawal } = accounts
// .flatMap(ele => ele.movements)
// .reduce(
// (acc, cur) => {
// acc[cur > 0 ? 'deposit' : 'withDrawal'] += cur;
// return acc;
// },
// {
// deposit: 0,
// withDrawal: 0,
// }
// );

// convert string title_case ( some exceptions may there):

//case: convertor: => do one javascript: project:

// const convertTitleCase = function (title) {
// const exceptions = ['a', 'an', 'the', 'but', 'or', 'on', 'in', 'with', 'not'];
// const str = title
// .toLowerCase()
// .split(' ')
// .map(ele =>
// exceptions.includes(ele) ? ele : ele[0].toUpperCase() + ele.slice(1)
// )
// .join(' ');
// return str;
// };
// console.log(convertTitleCase('this is a title'));
// console.log(convertTitleCase('this is LONG title but not too long'));

///////////////////////////////////////
// Coding Challenge #4

/\*
Julia and Kate are still studying dogs, and this time they are studying if dogs are eating too much or too little.
Eating too much means the dog's current food portion is larger than the recommended portion, and eating too little is the opposite.
Eating an okay amount means the dog's current food portion is within a range 10% above and 10% below the recommended portion (see hint).

1. Loop over the array containing dog objects, and for each dog, calculate the recommended food portion and add it to the object as a new property.
   Do NOT create a new array, simply loop over the array. Forumla: recommendedFood = weight \*_ 0.75 _ 28. (The result is in grams of food, and the weight needs to be in kg)

2. Find Sarah's dog and log to the console whether it's eating too much or too little. HINT: Some dogs have multiple owners, so you first need to find Sarah in the owners array, and so this one is a bit tricky (on purpose) 🤓

3. Create an array containing all owners of dogs who eat too much ('ownersEatTooMuch') and an array with all owners of dogs who eat too little ('ownersEatTooLittle').

4. Log a string to the console for each array created in 3., like this: "Matilda and Alice and Bob's dogs eat too much!" and "Sarah and John and Michael's dogs eat too little!"

5. Log to the console whether there is any dog eating EXACTLY the amount of food that is recommended (just true or false)

6. Log to the console whether there is any dog eating an OKAY amount of food (just true or false)

7. Create an array containing the dogs that are eating an OKAY amount of food (try to reuse the condition used in 6.)
8. Create a shallow copy of the dogs array and sort it by recommended food portion in an ascending order (keep in mind that the portions are inside the array's objects)

HINT 1: Use many different tools to solve these challenges, you can use the summary lecture to choose between them 😉
HINT 2: Being within a range 10% above and below the recommended portion means: current > (recommended _ 0.90) && current < (recommended _ 1.10). Basically, the current portion should be between 90% and 110% of the recommended portion.

TEST DATA:
const dogs = [
{ weight: 22, curFood: 250, owners: ['Alice', 'Bob'] },
{ weight: 8, curFood: 200, owners: ['Matilda'] },
{ weight: 13, curFood: 275, owners: ['Sarah', 'John'] },
{ weight: 32, curFood: 340, owners: ['Michael'] }
];

GOOD LUCK 😀
\*/

// const dogs = [
// { weight: 22, curFood: 284, owners: ['Alice', 'Bob'] },
// { weight: 8, curFood: 200, owners: ['Matilda'] },
// { weight: 13, curFood: 275, owners: ['Sarah', 'John'] },
// { weight: 32, curFood: 340, owners: ['Michael'] },
// ];

// 1.
// ** exponential operator:
// dogs.forEach(dog => {
// dog.recommendedFood = Math.trunc(dog.weight ** 0.75 \* 28);
// });

// console.log(dogs);

// 2.find sarah dog:
// dogs.forEach(dog => {
// if (dog.owners.includes('Sarah')) {
// // find dog food Level:
// console.log(dog);
// console.log(
// `${
//         dog.curFood > dog.recommendedFood
//           ? 'Eating Too Much'
//           : 'Eating Too Little'
//       }`
// );
// }
// });

// it return the sarah dog:

// const dogSarah = dogs.find(dog => dog.owners.includes('Sarah'));
// console.log(
// `${dogSarah.curFood > dogSarah.recommendedFood ? 'Too Much' : 'To Little'}`
// );

// 3:
// we can use flatMap() combining:
// const ownersEatTooMuch = dogs
// .filter(dog => dog.curFood > dog.recommendedFood)
// .map(dog => dog.owners)
// .flat(1);
// const ownersEatTooLittle = dogs
// .filter(dog => dog.curFood < dog.recommendedFood)
// .map(dog => dog.owners)
// .flat(1);

// console.log(ownersEatTooLittle);
// **console**.log(ownersEatTooMuch);

// // 4.
// console.log(`"${ownersEatTooMuch.join(' and ')}dogs Eat Too Much!"`);
// console.log(`"${ownersEatTooLittle.join(' and ')} dogs Eat Too Little"`);

// // 5:
// // return true or false:
// const exactFood = dogs.some(dog => dog.recommendedFood === dog.curFood);
// console.log(exactFood);

// console.log(
// dogs.some(
// dog =>
// dog.curFood > dog.recommendedFood _ 0.9 &&
// dog.curFood < dog.recommendedFood _ 1.1
// )
// );
// // use filter: if you use map it will simply return the true false; vlaue not dog:

// const okAmount = dogs.filter(
// dog =>
// dog.curFood > dog.recommendedFood _ 0.9 &&
// dog.curFood < dog.recommendedFood _ 1.1
// );
// console.log(okAmount);
// // 7:
// const shallowCopy = dogs.slice().sort((a, b) => {
// if (a.recommendedFood < b.recommendedFood) {
// return -1;
// } else {
// return 1;
// }
// });

// console.log(shallowCopy);
