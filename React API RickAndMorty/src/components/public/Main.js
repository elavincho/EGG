// rce: nos crea la clase componente

import React, { Component } from "react";
import Cards from "./Cards";

export class Main extends Component {
  //siempre que se tenga un constructor debe recibir como parametro props
  //y se debe agregar super(props)
  constructor(props) {
    super(props);
    //inicializamos el state y le damos un valor inicial
    this.state = { mascotas: [] };
  }

  /* este metodo utiliza el hook useState*/
  /*<Cards mascotas={this.state.mascotas}/> */
  /* con el hook useEffect */
  render() {
    return (
      <div>
        <main>
          <section className="py-5 text-center container">
            <div className="row py-lg-5">
              <div className="col-lg-6 col-md-8 mx-auto">
                <h1 className="fw-light">Rick And Morty</h1>
                <p className="lead text-body-secondary">
                  Rick and Morty es una serie de televisión estadounidense de
                  animación para adultos creada por Justin Roiland y Dan Harmon
                  en 2013 para Adult Swim, también se emitió en Cartoon Network.
                  La serie sigue las desventuras de un científico, Rick Sanchez,
                  y su fácilmente influenciable nieto, Morty, quienes pasan el
                  tiempo entre la vida doméstica y los viajes espaciales,
                  temporales e intergalácticos.
                </p>
                <p>
                  <a href="https://es.wikipedia.org/wiki/Rick_y_Morty" className="btn btn-primary my-2" target="_blank">
                    Mas Info!!
                  </a>
                  <a href="https://www.youtube.com/watch?v=YRIBt_giloc" className="btn btn-secondary my-2" target="_blank">
                    Trailer Temporada 7
                  </a>
                </p>
              </div>
            </div>
          </section>

          <Cards />
        </main>
      </div>
    );
  }
}

export default Main;

