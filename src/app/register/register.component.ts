import { Component, OnInit, OnDestroy, AfterViewInit } from '@angular/core';
import { AppService } from '../app.service';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  public registerationObj:any = {};
  private srvSub:Subscription;
  constructor(private srv:AppService) { }

  public ngOnInit() {
    
  }

  public ngOnDestroy(){
    if(this.srvSub){
      this.srvSub.unsubscribe();
    } 
  }

  public ngAfterViewInit(){
    
  }

  public onSubmitFrom(){
    console.log(this.registerationObj);

    
    this.srvSub = this.srv.sendData('http://localhost:8080/Frontend/api/employee/adding',this.registerationObj).subscribe(data => {

      console.log("Success");

    });
    
  } 

}
