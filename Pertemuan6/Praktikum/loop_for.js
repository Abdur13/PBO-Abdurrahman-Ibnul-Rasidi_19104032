for(var i = 0; i < 5; i++){
    console.log(i+ '. Berfikir')
}
console.log('\n')

// for/in
var nama = [{fName : 'Rahmat', lname : 'Dian', age : 19}, {fName : 'Ismail', lname : 'Bin mail', age : 15}]

for(var x in nama){
    console.log('Keluarga\t: ')
    console.log(nama[x].fName)
    console.log(nama[x].lname)
    console.log(nama[x].age)
    console.log('\n')
}

// for/of
var buah = ['apel','anggur','jeruk']
for(var x of buah){
    console.log('ini buah' + x)
}