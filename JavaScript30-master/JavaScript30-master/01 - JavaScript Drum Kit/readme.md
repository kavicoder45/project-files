<kbd> this tag is used to define the keyboard input:

**\*\*\***==data attribute: ===================
data-\* => we can make the custom attribute using this data-
// in this if you click very often, it doesnot play concurrently, ir finish the existing trigger audio, then only it play the next trigger audio: which means: if you click when audio play it won't play again ,it finish the audio duration then only it play again:

\***\*\*\*\*\*\***transition end event:
In your project you can say if transition is over
you can listen the transition end event and again you put the transition:

- this event call after every transition end that you have already defined:
- eg: you defined .class{
- background-color: red;
- font-size: 2rem;
- color: white;
- which means it trigger the transition event 3 times: it listen the transition every properties of elment:
- }
  =========== code REFACTORING IS VERY IMPORTANT:
  ========
  // setTimeout(function () { // this is ok to remove class but you have to sync the transition time in csss and this time: then only it look better:
  // key.classList.remove('playing');
  // }, 100
