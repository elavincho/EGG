import React from "react";
import { Link } from "react-router-dom";
//atrapamos el objeto(mascota) haciendo un destructuring
// cambie el svg por img para poder importar las imagenes
//agregue un h3 para poner los nombres de las imagenes
export default function Card({ mascota }) {
  return (
    <div className="col">
      <div className="card shadow-sm">
        <img width="100%"  src={mascota.image} alt="personajeImagen"/>
        <p className="especie text-success">{mascota.species}</p>
         <h3 className="mb-0 text-dark"> {mascota.name}</h3>
        <div className="card-body">
          <p className="text">Estatus: {mascota.status}, Genero: {mascota.gender}, Fec. Creación: {mascota.created}</p>
          <div className="d-flex justify-content-between align-items-center">
            <div className="btn-group">
              
              <button
                type="button"
                className="btn btn-sm btn-outline-secondary"
              >
                <Link to={`/detail/${mascota.id}`} className="nav-link px-2 text-secondary">Detalle</Link>
              </button>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}
