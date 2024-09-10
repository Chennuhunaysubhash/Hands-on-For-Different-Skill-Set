class Animal{
    //x:string;
    y:string = "Animal type";
    /*constructor(x:string){
        this.x = x;
    }*/
    displayType():void {
        console.log("Animal Base Class");
        console.log(this.y)
    }
}

class Dog extends Animal{

    displayType(): void {
        console.log("dog class extends form animal class")
    }
    displaysound(x:string){
        this.y = x;
        console.log(this.y);
    }
}

class Cat extends Animal{
    displayType(): void {
        console.log("cat class extends form animal class")
    }

    dispaysound(x:string){
        this.y = x;
        console.log(this.y);
    }
}

var animal = new Animal();
animal.displayType();
console.log("\n");
var dog = new Dog();
dog.displayType();
dog.displaysound("Booo Booo");
console.log("\n");
var cat = new Cat();
cat.displayType();
cat.dispaysound("meaw  meaw");



