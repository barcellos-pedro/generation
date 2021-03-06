import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Tema } from '../model/Tema';

@Injectable({
  providedIn: 'root'
})
export class TemaService {

  constructor(private http: HttpClient) { }

  token = {
    headers: new HttpHeaders().set('Authorization', localStorage.getItem('token'))
  }

  getAllTemas(){
    return this.http.get('http://localhost:9000/temas', this.token);
  }

  getByIdTema(id: number){
    return this.http.get(`http://localhost:9000/temas/${id}`, this.token);
  }

  postTema(tema: Tema){
    return this.http.post(`http://localhost:9000/temas/criar-tema`, tema, this.token);
  }

  putTema(tema: Tema){
    return this.http.put(`http://localhost:9000/temas/atualizar-tema`, tema, this.token);
  }

  deleteTema(id: number){
    return this.http.delete(`http://localhost:9000/temas/excluir-tema/${id}`, this.token);
  }

  getByDescricaoTema(descricao: string){
    return this.http.get(`http://localhost:9000/temas/buscar-tema/${descricao}`, this.token)
  }

}
