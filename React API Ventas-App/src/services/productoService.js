export async function obtenerProductos(){
    const response = await fetch("http://fakestoreapi.com/products")
    const data = await response.json();
    return data;
}

export async function obtenerProductoById(id){
    const response = await fetch(`http://fakestoreapi.com/products/${id}`)
    const data = await response.json();
    return data;
}