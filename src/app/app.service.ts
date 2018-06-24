import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class AppService {

  
  constructor(private httpClient:HttpClient) { }


  public sendData(path:string,payload:any):Observable<any>{
    var headerParams:HttpHeaders = new HttpHeaders();
    headerParams.append('Content-Type','application/json');
    return this.httpClient.post(path,payload,{headers:headerParams});
  }

  public getData(path:string):Observable<any>{
    var headerParams:HttpHeaders = new HttpHeaders();
    headerParams.append('Content-Type','application/json');
    return this.httpClient.get(path,{headers:headerParams});
  }

  public getPostData(path:string,payload:any):Observable<any>{
    var headerParams:HttpHeaders = new HttpHeaders();
    headerParams.append('Content-Type','application/json');
    return this.httpClient.post(path,payload,{headers:headerParams});
  }

  public updateData(path:string,payload:any):Observable<any>{
    var headerParams:HttpHeaders = new HttpHeaders();
    headerParams.append('Content-Type','application/json');
    return this.httpClient.put(path,payload,{headers:headerParams});
  }

  public deleteData(path:string):Observable<any>{
    var headerParams:HttpHeaders = new HttpHeaders();
    headerParams.append('Content-Type','application/json');
    return this.httpClient.delete(path,{headers:headerParams});
  }

  
/*
  public getObservable():Observable<any>{
    
    var obs = new Observable(obsObject=>{
      setInterval(_=>{
        obsObject.next(Math.random());
      },1000);
      //obsObject.complete();
    });

    return obs;
  }
  */

}
