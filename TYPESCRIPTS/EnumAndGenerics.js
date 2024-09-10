"use strict";
exports.__esModule = true;
var readline = require("readline");
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
var Day;
(function (Day) {
    Day[Day["Monday"] = 1] = "Monday";
    Day[Day["Tuesday"] = 2] = "Tuesday";
    Day[Day["Wednesday"] = 3] = "Wednesday";
    Day[Day["Thursday"] = 4] = "Thursday";
    Day[Day["Friday"] = 5] = "Friday";
    Day[Day["Saturday"] = 6] = "Saturday";
    Day[Day["Sunday"] = 7] = "Sunday";
})(Day || (Day = {}));
rl.question('Enter the Number [1 to 7] ', function (answer) {
    console.log(Day[answer]);
    rl.close();
});
