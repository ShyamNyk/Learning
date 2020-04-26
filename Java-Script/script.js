var a = 'Hello!';


function first() {
    console.log("Shyam1");
}

function second() {
    console.log("2nd");

    console.log(a)
    var a = 5;
}

var X = { Foo: 1 };
var Output = (function() {
    delete X.foo;
    return X.foo;
})();
console.log(Output);



first();
second();