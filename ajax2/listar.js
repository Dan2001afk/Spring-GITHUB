$(document).ready(function(){
    $("#listar").on('click',function(){
        let tabla = document.querySelector('#tabla1');
        $.ajax({
            url:"http://localhost:8080/lista",
            type: "GET", 
            dataType: "JSON",
            success:function(respuesta){
                console.log(respuesta)
                for (i = 0; i<= respuesta.length; i++) {
                    tabla.innerHTML += '<tr><td>' + respuesta [i].nombre + '</td></tr>' +
                    '<tr><td>' + respuesta [i].colorf + '</td></tr>' +
                    '<tr><td>' + respuesta [i].tamaño + '</td></tr>'+
                    '<tr><td>' + respuesta [i].forma + '</td></tr>'+
                    '<tr><td>' + respuesta [i].precio + '</td></tr>'+
                    '<tr><td>' + respuesta [i].cantidad + '</td></tr>'
                }
            }
        })
    })
    $('#enviar').on('click',function(){

        let datos={
            nombre:$('#nombre').val(),
            colorf:$('#colorf').val(),
            tamaño:$('#tamaño').val(),
            forma:$('#forma').val(),
            precio:parseInt($('#precio').val()),
            cantidad:parseInt($('#cantidad').val()),

        }
        let datosenvio=JSON.stringify(datos)
        console.log(datos)
        console.log(datosenvio)
        $.ajax({
            url: "http://localhost:8080/agregarfruta/",
            type: "POST",
            data: datosenvio,
            contentType: "application/JSON",
            datatype: JSON,
            success: function(respuesta){
                alert(respuesta)
            }
        })
    })
/* $('#Buscar').on('click', function(){
        let dato = "camilo  "
        $.ajax({
            url: "http://localhost:8080/buscarPersona/" + dato,
            type: "GET",
            datatype: JSON,
            success:function(respuesta){
                if (respuesta) 
                    console.log(respuesta)
                else
                console.log("no esta en el sistema")

            }
        })

    })*/

    $('#Buscar').on('click', function(){
        let dato = $("#nom").val();
        $.ajax({
            url: "http://localhost:8080/buscarfruta/" + dato,
            type: "GET",
            datatype: JSON,
            success:function(respuesta){
                console.log(respuesta)
                if (respuesta) 
                    console.log(respuesta)
                else
                    console.log("no esta en el sistema")

            }
        })

    }) 


    $('#Eliminar').on('click',function(){
        alert("hola")
        let nombreFruta = $('#nombreFruta').val(); // obtener el nombre de la fruta a eliminar
        
        $.ajax({
            url: "http://localhost:8080/eliminarfruta/" + nombreFruta, // agregar el nombre al final de la URL
            type: "DELETE",
            success: function(respuesta){
                alert(respuesta)
            }
        })
    })
    
    

})




/*

400 error de ajax

402 no hay respuesta correcta

500 error en el servidor
*/