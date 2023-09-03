
import { useState } from 'react';
import { Link } from 'react-router-dom'
import FavImg from '../img/me-gusta.png';
import NoFavImg from '../img/corazon.png';


export default function Producto({ producto, agregarAFavoritos, eliminarDeFavoritos }) {
    const [favorito, setFavorito] = useState(false);

    function handleClick() {
        if (!favorito) {
            agregarAFavoritos(producto)
            setFavorito(true)
        } else {
            eliminarDeFavoritos(producto)
            setFavorito(false)
        }
    }

    return (
        <div className="producto">
            <Link to={`/producto/${producto.id}`}><img src={producto.image} alt="imagenproducto" /></Link>
            <div className="info">
                <p>{producto.title}</p>
                <mark>${producto.price}</mark>
            </div>
            {favorito ?
                <img className="fav-icon" src={FavImg} onClick={handleClick} />
                :
                <img className="fav-icon" src={NoFavImg} onClick={handleClick} />
            }
        </div>
    )

}


