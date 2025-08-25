function convert() {
  let from = document.getElementById("from").value;
  let to = document.getElementById("to").value;
  let number = document.getElementById("number").value;

  if (number === "") {
    document.getElementById("output").innerText = "Please enter a number.";
    return;
  }

  let decimalValue;

  try {
    // Convert input to decimal first
    if (from === "decimal") decimalValue = parseInt(number, 10);
    else if (from === "binary") decimalValue = parseInt(number, 2);
    else if (from === "octal") decimalValue = parseInt(number, 8);
    else if (from === "hex") decimalValue = parseInt(number, 16);

    // Convert decimal to target base
    let result;
    if (to === "decimal") result = decimalValue.toString(10);
    else if (to === "binary") result = decimalValue.toString(2);
    else if (to === "octal") result = decimalValue.toString(8);
    else if (to === "hex") result = decimalValue.toString(16).toUpperCase();

    document.getElementById("output").innerText = result;
  } catch (err) {
    document.getElementById("output").innerText = "Invalid Input!";
  }
}
