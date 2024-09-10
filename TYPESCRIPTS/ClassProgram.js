var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Animal = /** @class */ (function () {
    function Animal() {
        //x:string;
        this.y = "Animal type";
    }
    /*constructor(x:string){
        this.x = x;
    }*/
    Animal.prototype.displayType = function () {
        console.log("Animal Base Class");
        console.log(this.y);
    };
    return Animal;
}());
var Dog = /** @class */ (function (_super) {
    __extends(Dog, _super);
    function Dog() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Dog.prototype.displayType = function () {
        console.log("dog class extends form animal class");
    };
    Dog.prototype.displaysound = function (x) {
        this.y = x;
        console.log(this.y);
    };
    return Dog;
}(Animal));
var Cat = /** @class */ (function (_super) {
    __extends(Cat, _super);
    function Cat() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Cat.prototype.displayType = function () {
        console.log("cat class extends form animal class");
    };
    Cat.prototype.dispaysound = function (x) {
        this.y = x;
        console.log(this.y);
    };
    return Cat;
}(Animal));
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
