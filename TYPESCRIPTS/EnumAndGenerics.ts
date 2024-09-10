import * as readline from 'readline';

let rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

enum Day {  
    Monday = 1,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday  
}  
rl.question('Enter the Number [1 to 7] ', (answer) => {
  console.log(Day[answer]);
  rl.close();
});