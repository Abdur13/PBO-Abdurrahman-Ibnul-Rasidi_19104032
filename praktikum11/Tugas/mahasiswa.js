var mhsArray = [];
var app = (function() {
  const prompt = require('prompt-sync')();
const prodiArray = ["S1 SE", "S1 IF", "S1 SI"]
function addMahasiswa () {
        console.log("\n--- Tambah data mahasiswa ---");
        nama            = prompt("Masukan nama mahasiswa : ")
        tanggalLahir    = prompt("Masukan tanggal lahir : ")
        nim             = prompt("Masukan NIM : ")

        // cetak data prodinya dulu
        app.getProdi()
        
        // tanyakan data prodi
        tanyaProdi = prompt("Masukan prodi : ")

        if(tanyaProdi > prodiArray.length) {
            throw "Prodi tidak tersedia";
        } else {
            prodi = tanyaProdi
        }

        return {
            nama: nama, 
            tanggalLahir: tanggalLahir, 
            nim: nim, 
            prodi: prodi,
            grade: null
        }
    }
     function ask(inputName) {
        return prompt(inputName);
    }
    function getGrade(nilai) {
        if(nilai >= 80 && nilai <= 100 ) {
            return 'A'
        } else if(nilai >= 60 && nilai <= 79) {
            return 'B'
        } else if(nilai >= 40 && nilai <= 59) {
            return 'C'
        } else if(nilai >= 0 && nilai <= 39) {
            return 'D'
        }
    }
    function printMenu() {
        console.log("\n--- Menu Penilaian ---");
        console.log("1. Tambah mahasiswa");
        console.log("2. Penilaian");
        console.log("3. Lihat seluruh mahasiswa");
        console.log("4. keluar");
    }
    function getProdi() {
        for (let i = 0; i < prodiArray.length; i++) {
            console.log( (i + 0) + ". " + prodiArray[i] );
        }
    }
    function getProdiArray() {
        return prodiArray
    }

    return {
        addMahasiswa: addMahasiswa,
        ask: ask,
        getGrade: getGrade,
        printMenu: printMenu,
        getProdi: getProdi,
        getProdiArray: getProdiArray
    }

}())
var loop = 1;
 
 while (loop > 0) {
     // tampilkan semua menu yang ada
     app.printMenu()

     // menanyakan menu yang diinginkan
     var menuYangDipilih = app.ask("Masukan menu : ")

     switch (menuYangDipilih) {
         case '1':
            // tanyakan inputan kepada pengguna, 
            // lalu simpan data object kedalam array
            mhsArray.push(app.addMahasiswa())
            break;

        case '2':
            for (let m = 0; m < mhsArray.length; m++) {
                console.log("\n# No Urut Mahasiswa : " + (m + 1));
                console.log("Nama : " + mhsArray[m].nama);
                console.log("Tanggal lahir : " + mhsArray[m].tanggalLahir);
                console.log("Nim : " + mhsArray[m].nim);
                console.log("Prodi : " + app.getProdiArray()[mhsArray[m].prodi]);
                console.log("Grade : " + mhsArray[m].grade);
            }

            console.log("\n");

            var dataYangInginDiEdit = app.ask("Masukan nomor urut mahasiswa : ")
            var index = dataYangInginDiEdit - 1;

            // tanyakan nilai
            var tanyaNilai = app.ask("Masukan nilai mahasiswa : ")

            // ubah data nilai berdasarkan index
            mhsArray[index].grade =  app.getGrade(tanyaNilai)

            console.log("Berhasil mengubah data.. ");

            break;

        case '3':
            for (let m = 0; m < mhsArray.length; m++) {
                console.log("\n# No Urut Mahasiswa : " + (m + 1));
                console.log("Nama : " + mhsArray[m].nama);
                console.log("Tanggal lahir : " + mhsArray[m].tanggalLahir);
                console.log("Nim : " + mhsArray[m].nim);
                console.log("Prodi : " + app.getProdiArray()[mhsArray[m].prodi]);
                console.log("Grade : " + mhsArray[m].grade);
            }
            break;

        case '4':
            console.log("Bye...");
            loop = 0
            break;
     
         default:
             console.log("Error : Menu " + menuYangDipilih + " tidak tersedia!");
     }
 }