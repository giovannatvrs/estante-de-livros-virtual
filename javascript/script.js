const selecao = document.getElementById("caixa-de-selecao");

function marcarTarefa(){
    if(selecao.textContent == 'check_box_outline_blank'){
        selecao.textContent = 'check_box';
    }
    else{
        selecao.textContent = 'check_box_outline_blank'
    }
    
}

selecao.addEventListener('click', marcarTarefa);