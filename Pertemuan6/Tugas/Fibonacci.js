//Deklarasi
var judul = "Fibonacci = "
var a = 0
var b = 1
var hasil = 0

//Method
for (var i = 0; i<=10 ;i++){
    a = a + b;
    b = a - b;
    hasil = hasil + b + ',' 
}

//output
console.log(judul + hasil)
