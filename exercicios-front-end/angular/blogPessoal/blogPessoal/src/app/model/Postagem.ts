import { Tema } from "./Tema";
import { Usuario } from './Usuario';

export class Postagem {
    public id: number;
    public descricao: string;
    public curtidas: number;
    public tema: Tema;
    public usuario: Usuario;
}