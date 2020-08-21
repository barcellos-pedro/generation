let botao = document.querySelector("button");
let form = document.querySelector("form");

function enviar (event){
    event.preventDefault();
    let email = document.querySelector("#email");

    if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1) {
        alert('Preencha todos os campos corretamente antes de enviar o formulário!')
    } else {
        form.reset();
        alert('Formulário enviado com sucesso!')
    }
}

botao.addEventListener("click", enviar);