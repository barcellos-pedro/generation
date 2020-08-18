/* Página home */
let imagem = document.querySelector(".imagem");

function arredondarImagem(){
    imagem.style.borderRadius = "50%";
}

function voltarImagem(){
    imagem.style.borderRadius = "5px";
}

/* ########################################## */

/* Página de contato */
let botao = document.querySelector("button");

function enviar(){
    alert("Mensagem encaminhada com sucesso!");
}