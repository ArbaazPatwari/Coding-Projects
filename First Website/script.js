function myArray() {

  var person = prompt("Please enter a name", "Arbaaz / Stefan / Mohammed");
  myArray = ["Arbaaz ", "Stefan ", "Mohammed "];

  document.write("Hello "+ myArray[0] + "there are 6 letters in your name.\n");
  document.write("Hello "+ myArray[1] + "there are 6 letters in your name.\n");
  document.write("Hello "+ myArray[2] + "there are 8 letters in your name.\n");

    document.write(myArray.sort());

    document.write(myArray.reverse());
  
}
