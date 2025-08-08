const blue = document.getElementById("blue");
const red = document.getElementById("red");
const green = document.getElementById("green");
const bgColor = document.querySelector(".body");

const display = (color) => {
  console.log(`${color} is clicked`);
};

///next add some transition when the color is changed:

const handleEvent = function () {
  if (blue.checked) {
    display(blue.value);
    bgColor.style.backgroundColor = "lightblue";
  }
  if (red.checked) {
    display(red.value);
    bgColor.style.backgroundColor = "red";
  }
  if (green.checked) {
    display(green.value);
    bgColor.style.backgroundColor = "lightgreen";
  }
};

blue.addEventListener("click", handleEvent);
red.addEventListener("click", handleEvent);
green.addEventListener("click", handleEvent);
