import React, { useEffect } from 'react'
import { useParams } from 'react-router-dom';
import { useState } from 'react';
import { obtenerProductoById } from '../services/productoService';

export default function Detalle() {

  const [producto, setProducto] = useState({});
  const { id } = useParams();

  useEffect(() => {
    obtenerProductoById(id).then(data => {
      setProducto(data);
    })
  }, [id]);
  return (
    <div className='detalle'>
      <img src={producto.image} alt='imgProducto'></img>
      <div>
        <h3>{producto.title}</h3>
        <blockquote>{producto.description}</blockquote>
        <mark>{producto.price}</mark>
      </div>
    </div>
  )
}
