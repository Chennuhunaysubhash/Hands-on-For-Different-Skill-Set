class Greetings{
    private x:string = "private access modifiers";
    protected y:string = "protected access modifiers";
    public z:string = "public access modifiers";
    
    constructor(){ 
        console.log("with in constructor")
       console.log("x: "+this.x);
     }  
     
    stringDisplay():void { 
        //var obj  = new Greetings();
        console.log("with in function");
        console.log("x: "+ this.x);
        console.log("y: "+ this.y);  
        console.log("z: "+ this.z);
     } 
    
}

class Msg extends Greetings{
    
    getData(greeting: Greetings, msg: Msg){
        console.log(greeting.z)
        this.y = "Msg protected";
        this.z = "Msg Public";

        console.log(msg.y);
        console.log(msg.z);
        console.log()
    }
}

var obj = new Greetings()
obj.stringDisplay()

var obj1 = new Msg()

obj1.getData(obj,obj1);