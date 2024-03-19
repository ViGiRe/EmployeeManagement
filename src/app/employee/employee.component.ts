import { Component, OnInit } from '@angular/core';
import { CommonserviceService } from '../shared/commonservice.service';
import { Employee } from '../model/employee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
emp:Employee[];
  constructor(public s :CommonserviceService) { }

  ngOnInit(): void {
  }

  submitData(emp:Employee){
    if(emp.id==null){
      this.s.postData(emp).subscribe();
      location.reload();
    }
    else{
      this.s.updateData(emp).subscribe();
      location.reload();
    }
  }

  resetData(){
    this.s.e = Object.assign({},null);
    location.reload();
  }

}
