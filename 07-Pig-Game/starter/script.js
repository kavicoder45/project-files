'use strict';

const player0El = document.querySelector('.player--0');
const player1El = document.querySelector('.player--1');
const score0El = document.querySelector('#score--0');
const score1El = document.getElementById('score--1');
const current0El = document.getElementById('current--0');
const current1El = document.getElementById('current--1');
const diceEl = document.querySelector('.dice');
const btnNew = document.querySelector('.btn--new');
const btnRoll = document.querySelector('.btn--roll');
const btnHold = document.querySelector('.btn--hold');

score0El.textContent = 0;
score1El.textContent = 0;
diceEl.classList.add('hidden');

//we declare this at global variable becuase we using this two variable in two different functions:
// it is global variable:

const scores = [0, 0];
let currentScore = 0;
let activePlayer = 0;
let playing = true;

const init = function () {
  document
    .querySelector(`.player--${activePlayer}`)
    .classList.remove('player--winner');
  currentScore = 0;
  activePlayer = 0;
  scores[0] = 0;
  scores[1] = 0;

  diceEl.classList.remove('hidden');

  score0El.textContent = scores[0];
  score1El.textContent = scores[1];
  document.querySelector('.player--0').classList.add('player--active');
  document.querySelector('.player--1').classList.remove('player--active');
  current0El.textContent = currentScore;
  current1El.textContent = currentScore;

  playing = true;
};
// switch player:

const switchPlayer = function () {
  //switch the player:
  document.getElementById(`current--${activePlayer}`).textContent = 0;

  activePlayer = activePlayer === 0 ? 1 : 0;
  currentScore = 0;
  //this method:
  //it add the class if class is not there:
  //if class is there it remove it
  //we can also check this manually, what I did:
  player0El.classList.toggle('player--active');
  player1El.classList.toggle('player--active');
};

//rolling the dice:
//we change the dice image by manipulating the src attribute of image:
btnRoll.addEventListener('click', function () {
  //generate random number:

  if (playing) {
    const dice = Math.trunc(Math.random() * 6) + 1;
    //   show the dice:
    diceEl.classList.remove('hidden');
    diceEl.src = `dice-${dice}.png`;

    if (dice !== 1) {
      currentScore += dice;
      document.getElementById(`current--${activePlayer}`).textContent =
        currentScore;
      // current0El.textContent = currentScore;
    } else if (dice === 1) {
      switchPlayer();
    }
  }
});

// btn holods
btnHold.addEventListener('click', function () {
  // add current score to active player:
  if (playing) {
    scores[activePlayer] += currentScore;
    document.querySelector(`#score--${activePlayer}`).textContent =
      scores[activePlayer];
    //check the score is atleast 100
    if (scores[activePlayer] >= 20) {
      playing = false;

      diceEl.classList.add('hidden');
      document
        .querySelector(`.player--${activePlayer}`)
        .classList.remove('player--active');
      document
        .querySelector(`.player--${activePlayer}`)
        .classList.add('player--winner');
    } else {
      switchPlayer();
    }
  }
  //switch to next player:
});

//reset the game:
btnNew.addEventListener('click', init);
