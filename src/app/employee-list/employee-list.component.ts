import { Component, OnInit } from '@angular/core';
import { CommonserviceService } from '../shared/commonservice.service';
import { Employee } from '../model/employee';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  emp:Employee[];
  constructor(private s1:CommonserviceService) { }

  ngOnInit(): void {
    this.s1.getData().subscribe((data:Employee[])=>{
      this.emp = data;
    });
  }

  editData(emp:Employee){
    this.s1.e = Object.assign({},emp);
  }

  deleteData(emp:Employee){
    this.s1.deleteData(emp).subscribe();
  }
}
