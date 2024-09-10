class functionProgram{
     normal_param(s1:string) { 
        console.log(s1) 
     } 

     msg = function() { 
        return "Anonymous function";  
     } 

     res = function(a:number,b:number) { 
        return a*b;  
     }; 


    foo = ()=> {    
        console.log("Arrow funcion")
     } 

    foo1 = (x:number)=> {    
        x = 10 + x 
        console.log(x)  
     } 
}

var obj2 = new functionProgram();
obj2.normal_param("normal function")
console.log(obj2.msg());
console.log(obj2.res(10,20));
obj2.foo();
obj2.foo1(100);