class DataTypesPro{
    anyFunction(x:any){
        console.log(x);
        console.log(typeof(x));
    }
    unionFunction(y:number|string){
        if(typeof(y)=="number"){
            console.log("y : "+ y+ "  data type is "+typeof(y));
        }
        else if(typeof(y)=="string"){
            console.log("y : "+ y+ "  data type is "+typeof(y));
        }
        else
        {
            console.log("other type");
        }
    }

    tupleFunction(): void{
        var myTuple = ["hunaysubhash chennu",24,26000.5];
        console.log("Name : "+myTuple[0]);
        console.log("Age : "+myTuple[1]);
        console.log("Salary : "+myTuple[2]);
    }
}

var datatype = new DataTypesPro();
datatype.anyFunction(20);
datatype.anyFunction("hello");
datatype.anyFunction(true);
console.log("\n");
datatype.unionFunction(23);
datatype.unionFunction("hello");
console.log("\n");
datatype.tupleFunction();