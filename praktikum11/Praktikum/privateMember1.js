function Person (paramName){
    var name = paramName
    var age = 20
  
    this.setName = function(newName){
      name = newName
    }
  
    this.getName = function(){
      return name
    }
  
    this.setAge = function(newAge){
      age = newAge
    }
  
    this.getAge = function(){
      return age
    }
  
    this.growOLder = function(){
      age++
    }
  }
  
  var person = new Person('Ajo')
  
    console.log('Nama person\t: ', person.getName());
    console.log('Umur person\t: ', person.getAge());
    
    //mengganti umur
    person.setAge(100)
    console.log('Umur person yang diganti\t: ', person.getAge());
    
    person.growOLder()
    console.log('Umur person yang ditambah\t: ', person.getAge());