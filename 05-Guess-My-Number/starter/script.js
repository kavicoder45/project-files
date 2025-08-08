'use strict';

// console.log(document.querySelector('.message').textContent);
// // by using this we can change the actual textcontent
// document.querySelector('.message').textContent = 'correct Number....🎯';
// console.log(document.querySelector('.message').textContent);
// //and also we can store the value to the variable,the return value of query selector:
// document.querySelector('.number').textContent = 23;
// document.querySelector('.score').textContent = 10;
// document.querySelector('section > .btn');
// // to select the content of input field:
// console.log((document.querySelector('.guess').value = 23));
// console.log(document.querySelector('.guess').value);

// handling the events:

// 1.select the element,which event will happen
//if you dont give any value to input field by you clicke the returnv value should be zero:

// to generate random number:
let secretNumber = Math.floor(Math.random() * 20 + 1);
let score = 20;
let HighScore = 0;
console.log(secretNumber);

// function to display the message:

const displayMessage = function (message) {
  document.querySelector('.message').textContent = message;
};

// handling click event  of input field:
document.querySelector('.check').addEventListener('click', function () {
  const guess = Number(document.querySelector('.guess').value);

  //   when no input
  if (!guess) {
    displayMessage('No Number.....!!!');
  }
  //   when player wins
  else if (guess === secretNumber) {
    document.querySelector('.number').textContent = secretNumber;
    displayMessage('Correct Number...!!!🎯');

    if (score > HighScore) {
      HighScore = score;
      document.querySelector('.highscore').textContent = HighScore;
    }
    // when ever we manipulate a dom we specified as string:
    //what ever styles we given here is applied to inlinse style of that element:
    document.querySelector('body').style.backgroundColor = '#60b347';
    document.querySelector('.number').style.width = '30rem';
  }
  //   REFRACTING OUR CODE:
  else if (guess !== secretNumber) {
    if (score > 1) {
      displayMessage(guess > secretNumber ? 'Too High....!' : 'To Low.....!!!');
      score--;
      document.querySelector('.score').textContent = score;
    } else {
      displayMessage('You Loose the Game....!!!');
      document.querySelector('.score').textContent = 0;
    }
  }
  //   when guess high:
  //   else if (guess > secretNumber) {
  //     if (score > 1)
  //      {
  //       document.querySelector('.message').textContent = 'Too High...!!!👆';
  //       score--;
  //       document.querySelector('.score').textContent = score;
  //     } else {
  //       document.querySelector('.message').textContent = 'You Loose...!!!😆';
  //       document.querySelector('.score').textContent = 0;
  //     }
  //   } else if (guess < secretNumber) {
  //     if (score > 1) {
  //       document.querySelector('.message').textContent = 'To Low...!!!👇';
  //       score--;
  //       document.querySelector('.score').textContent = score;
  //     } else {
  //       document.querySelector('.message').textContent = 'You Loose...!!!😆';
  //       document.querySelector('.score').textContent = 0;
  //     }
  //   }
});

//handling: reset Button:
//no name for this because, we don't call this function js call this function automatically when the event happens:
document.querySelector('.again').addEventListener('click', function () {
  // reset the score:
  score = 20;
  secretNumber = Math.floor(Math.random() * 20 + 1);
  console.log(secretNumber);
  document.querySelector('.score').textContent = score;
  document.querySelector('.number').textContent = '?';
  document.querySelector('body').style.backgroundColor = '#222';
  document.querySelector('.number').style.width = '15rem';
  document.querySelector('.guess').value = '';
  displayMessage('Start Guessing....!!!');
});
// refactoring means = > restructure our code: = > without changing its functionality:
//because our code violate = > DRY PRINCIPLE:
// we should refactoring our code:

//also good refactoring technique is using  functions:

// DON'T DRY YOUR CODE:
