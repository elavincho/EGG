import Producto from "./Producto";

export default function Productos({productos, agregarAFavoritos, eliminarDeFavoritos}){

    return (
        <div className="productos">
            {productos.length > 0 ? productos.map(producto => <Producto key={producto.id} producto={producto} agregarAFavoritos={agregarAFavoritos} eliminarDeFavoritos={eliminarDeFavoritos}/>)
                : <p>No hay productos en Favoritos</p>
        }
        </div>
    )
}
