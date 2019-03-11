import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-checkin',
  templateUrl: './checkin.component.html',
  styleUrls: ['./checkin.component.css']
})
export class CheckinComponent implements OnInit {
  
  data:any;

  constructor(private router:ActivatedRoute, private service:DataService) { }

  ngOnInit() {
    var id = Number.parseInt(this.router.snapshot.paramMap.get("id"));
    this.service.getReservation(id).subscribe(res => {
      this.data = res;
    });
  }
}
