/*$(document).ready(function(){
    alert("hola")

    $("#listar").on('click',function(){
        let tabla = document.querySelector('#tabla');
        $.ajax({
            url:"datos.json",
            type: "GET", 
            dataType: "JSON",
            success:function(respuesta){
                console.log(respuesta)
                for (i = 0; i<= respuesta.length; i++) {
                    tabla.innerHTML += '<tr><td>' + respuesta [i].nombre + '</td></tr>' +
                    '<tr><td>' + respuesta [i].apellido + '</td></tr>' +
                    '<tr><td>' + respuesta [i].edad + '</td></tr>'
                }
            }
        })
    })
})*/
