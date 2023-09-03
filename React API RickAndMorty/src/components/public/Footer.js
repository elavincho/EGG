// rfc = react funtional component: crea una constante llamada footer
// que es una funcion flecha que retorna una porcion de codigo (en este caso un div)

import React, { useState } from "react";

const Footer = () => {
  //Creamos el hook
  //React nos permite manejar variables
  // Partes del useState. Una constante, abre un array [variable, funcionalidad encargada de cambiar la variable]
  // entre parentesis va el valor inicial

  const [clicks, setClicks] = useState(0);

  const year = new Date().getFullYear();

  const companyName = "elavincho Corporation";

  const handleClick = () => {
    //Tomamos el valor anterior de setClicks y le sumamos 1
    //cada vez que le hagamos click
    setClicks(clicks + 1);
  };
  return (
    <div className="container">
      <footer className="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
        <p className="col-md-4 mb-0 text-body-secondary">
          &copy; {year} {companyName}, Inc. Clicks: {clicks}
        </p>
        <span
          to={"/"}
          className="col-md-4 d-flex algin-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-dark"
          //Agregamos un evento para llamar a la funcion
          onClick={handleClick}
        >
          <img
            className="App-logo"
            height="52"
            src="img_perro.png"
            alt="perro-giratorio"
          />
        </span>
        <ul className="nav col-md-4 justify-content-end">
          <li className="nav-item">
            <a href="#" className="nav-link px-2 text-body-secondary">
              Home
            </a>
          </li>
          <li className="nav-item">
            <a href="#" className="nav-link px-2 text-body-secondary">
              Features
            </a>
          </li>
          <li className="nav-item">
            <a href="#" className="nav-link px-2 text-body-secondary">
              Pricing
            </a>
          </li>
          <li className="nav-item">
            <a href="#" className="nav-link px-2 text-body-secondary">
              FAQs
            </a>
          </li>
          <li className="nav-item">
            <a href="#" className="nav-link px-2 text-body-secondary">
              About
            </a>
          </li>
        </ul>
      </footer>
    </div>
  );
};

export default Footer;
