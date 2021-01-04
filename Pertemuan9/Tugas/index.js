const prompt = require("prompt-sync")()

var perulangan = true;

var arrayHewan = [];

var hewan = {};

let index;

var pilihan;

function Hewan(namaHewan,jenisHewan,umurHewan,makananHewan,riwayatPenyakit){
    this.namaHewan = namaHewan;
    this.jenisHewan = jenisHewan;
    this.umurHewan = umurHewan;
    this.makananHewan = makananHewan;
    this.riwayatPenyakit = riwayatPenyakit;
    this.outputData = function(){
        console.log("Nama Hewan\t: ",this.namaHewan)
        console.log("Jenis Hewan\t: ",this.jenisHewan)
        console.log("Umur Hewan\t: ",this.umurHewan)
        console.log("Makanan Hewan\t: ",this.makananHewan)
        console.log("Riwayat Penyakit\t: ",this.riwayatPenyakit)
    }
}

function pilihanMenu(){
    console.log("\t\t\tSelamat Datang di Ba Ba PetShop\t\t\t")
    console.log("1. Tambah Hewan")
    console.log("2. Edit Data Hewan")
    console.log("3. Tampilkan Data Hewan")
    console.log("4. Exit")
}

while (perulangan == true){

    pilihanMenu();
    pilihan = prompt("Masukan Pilihan\t: ");

    switch(pilihan){
        case '1':
            console.log("\t\t\tTambah Hewan\t\t\t")
            let jumlahHewan = prompt("Masukan Jumlah Hewan\t: ")
            for (let i=1; i<=jumlahHewan; i++){
                console.log(`\nHewan ke-${i}`)
                hewan = new Hewan(
                    prompt(`Masukan Nama Hewan\t: `),
                    prompt(`Masukan Jenis Hewan\t: `),
                    prompt(`Masukan Umur Hewan\t: `),
                    prompt(`Masukan Makanan Hewan\t: `),
                    prompt(`Masukan Riwayat Penyakit\t: `)
                )
                arrayHewan.push(hewan)
            }
            break;
        case '2':
            console.log("\t\t\tEdit Data\t\t\t")
            var noHewan = prompt('Masukan Nomor Urut Hewan\t: ')
            Hewan.prototype.edit = function(){
                namaHewan = prompt('Masukan Nama Hewan\t: ')
                jenisHewan = prompt('Masukan Jenis Hewan\t: ')
                umurHewan = prompt('Masukan Umur Hewan\t: ')
                makananHewan = prompt('Masukan Makanan Hewan\t: ')
                riwayatPenyakit = prompt('Masukan Riwayat Penyakit\t: ')
                outputData = this.outputData
                return{namaHewan,jenisHewan,umurHewan,makananHewan
                        ,riwayatPenyakit,outputData}
            }
            index = noHewan - 1
            arrayHewan[index] = arrayHewan[index].edit()
            break;
        case '3':
            console.log("\t\t\tTampilkan Data\t\t\t")
            index = 1
            for(let i in arrayHewan){
                console.log(`Hewan ke-${index}`)
                index++
                arrayHewan[i].outputData()
            }
            break;
        case '4':
            perulangan = false;
            console.log("Bye!!!!")
            break;
        default :
            console.log("Masukan inputan yang benar!")
            break;
    }
}