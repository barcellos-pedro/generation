import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Postagem } from '../model/Postagem';

@Injectable({
  providedIn: 'root'
})
export class PostagemService {

  constructor(private http: HttpClient) { }

  token = {
    headers: new HttpHeaders().set('Authorization', localStorage.getItem('token'))
  }

  getAllPostagens(){
    return this.http.get('http://localhost:9000/postagens', this.token);
  }

  getByIdPostagem(id: number){
    return this.http.get(`http://localhost:9000/postagens/${id}`, this.token);
  }

  postPostagem(postagem: Postagem){
    return this.http.post('http://localhost:9000/postagens/criar-postagem', postagem, this.token);
  }

  putPostagem(postagem: Postagem){
    return this.http.put('http://localhost:9000/postagens/atualizar-postagem', postagem, this.token);
  }

  deletePostagem(id: number){
    return this.http.delete(`http://localhost:9000/postagens/excluir-Postagem/${id}`, this.token);
  }

  getByTituloPostagem(titulo: string){
    return this.http.get(`http://localhost:9000/postagens/buscar-postagem/${titulo}`, this.token)
  }

}
