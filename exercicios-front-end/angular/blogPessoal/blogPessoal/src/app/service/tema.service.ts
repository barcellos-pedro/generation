import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TemaService {

  constructor(private http: HttpClient) { }

  token = {
    headers: new HttpHeaders().set('Authorization', localStorage.getItem('token'))
  }

  getAllTemas(){
    return this.http.get('http://localhost:8080/temas', this.token);
  }

  getByIdTema(id: number){
    return this.http.get(`http://localhost:8080/temas/${id}`, this.token);
  }

}
