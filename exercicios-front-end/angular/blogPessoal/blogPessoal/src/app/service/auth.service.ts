import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { UserLogin } from '../model/UserLogin';
import { Usuario } from '../model/Usuario';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  cadastrar(user: Usuario) {
    return this.http.post('http://localhost:8080/usuarios/cadastrar', user);
  }

  logar(userLogin: UserLogin) {
    return this.http.post('http://localhost:8080/usuarios/logar', userLogin);
  }

  btnSair() {
    let ok = false;
    let token = localStorage.getItem('token');

    if (token != null) {
      ok = true;
    }
    return ok;
  }

  btnLogin() {
    let ok = false;
    let token = localStorage.getItem('token');

    if (token == null) {
      ok = true;
    }
    return ok;
  }

  btnFeed() {
    let ok = false;
    let token = localStorage.getItem('token');

    if (token != null) {
      ok = true;
    }
    return ok;
  }
}

