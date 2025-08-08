'use strict';
// queryselector select the element ,where matches its first:
// queryselector select  all the element,where it match and return the nodeList:

// we give dot only for the selector :
const showModal = document.querySelectorAll('.show-modal');
const modal = document.querySelector('.modal');
const overlay = document.querySelector('.overlay');
const closeModal = document.querySelector('.close-modal');

// classList return the DomTokenlist of class in the selected elements:
// console.log(modal.classList);
// click is the name of the event:

for (let i = 0; i < showModal.length; i++) {
  showModal[i].addEventListener('click', function () {
    console.log('Button Clicked');
    // we know we gave display:none in hidden class: so if you remove that class we can see our box: so we remove that:
    // it is the main way of changing style
    modal.classList.remove('hidden');
    overlay.classList.remove('hidden');
    // modal.style.display = 'block';
  });
}

// const btnCloseModal = function () {
//   modal.classList.add('hidden');
//   overlay.classList.add('hidden');
// };
// if click the button it will close:
// closeModal.addEventListener('click', function () {
//   btnCloseModal();
// });

// if you click the overlay then also button will close:

// overlay.addEventListener('click', function () {
//   btnCloseModal();
// });

// another method for remove dryCoder

const btnCloseModal = function () {
  modal.classList.add('hidden');
  overlay.classList.add('hidden');
  console.log('return');
};

// btnCloseModal is just like a function declaration:

overlay.addEventListener('click', btnCloseModal);
closeModal.addEventListener('click', btnCloseModal);

// by using Esc Key:  Keyboard event:

// if you add the event listener to your document,it instead of listening particular events it listening all the event on the webpage:

// javascript return the ojbec of that event as an arguments;
document.addEventListener('keydown', function (event) {
  if (event.key === 'Escape') {
    console.log('Escape');
    if (!modal.classList.contains('hidden')) {
      btnCloseModal();
    }
  }
});
