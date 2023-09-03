// rafc: creamos un funtional component
import React from "react";
import Card from "./Card";
import RickAndMortyService from "../../services/RickAndMorty.service";

//*****  Esto es con el hook useState

//enviamos info a travez de un destructuring
//export const Cards = ({mascotas}) => {
// hacemos una lista de cartas
//cardList(es un jsx) es igual al mapeo de mascotas y dentro del mapa
//creamos una variable (m) y devuelve un Card component
//Agregamos el jsx en el return
//Tenemos que pasarle el objeto(mascota) a la carta y una key

//const cardList = mascotas.map((m) => <Card mascota={m} key={m.id} />)

//***** Con el hook useEffect

//no le pasamos nada como parametro
export const Cards = () => {
  // creamos un metodo useState con una lista vacia
  const [mascotas, setMascotas] = React.useState([]);
  //
  //creamos un metodo useEffect
  React.useEffect(() => {
    //useEffect se encarga de una escucha activa ante cambios
    RickAndMortyService.getAllCharacters()
      .then((data) => setMascotas(data.results))
      .catch((error) => console.log(error));
      //aca va la variable a escuchar ante cambios
  }, [mascotas]);

  const cardList = mascotas.map((m) => <Card mascota={m} key={m.id} />);
  
  return (
    <div className="album py-5 bg-body-tertiary">
      <div className="container">
        <div className="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
          {cardList}
        </div>
      </div>
    </div>
  );
};

export default Cards;
