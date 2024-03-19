import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from '../model/employee';

@Injectable({
  providedIn: 'root'
})
export class CommonserviceService {
url:string="http://localhost:8080/api/";

e:Employee={
  id:null,
  name:"",
  uname:"",
  pass:""
}
constructor(public http:HttpClient) { }
getData(){
  return this.http.get(this.url+"emps");
}

postData(emp:Employee){
  return this.http.post(this.url+"emp",emp);
}

updateData(emp:Employee){
  return this.http.put(this.url+"emp/"+emp.id,emp)
}

deleteData(emp:Employee){
  return this.http.delete(this.url+"emp/"+emp.id)
}
}
