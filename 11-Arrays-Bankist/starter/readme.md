// ArrayMethod practice:

// const allSum = accounts.map(acc => acc.movements).flat();
const allSum = accounts
.flatMap(acc => acc.movements)\*\*\*\*
.filter(acc => acc > 0)
.reduce((acc, cur) => acc + cur);
console.log(allSum);

<!-- ex: 2 -->

const { deposit, withDrawal } = accounts
.flatMap(ele => ele.movements)
.reduce(
function (acc, ele) {
if (ele > 0) {
acc.deposit += ele;
return acc;
} else {
acc.withDrawal += ele;
return acc;
}
},
{
deposit: 0,
withDrawal: 0,
}
);
