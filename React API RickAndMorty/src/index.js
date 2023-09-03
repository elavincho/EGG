import React from 'react';
import ReactDOM from 'react-dom'; //'react-dom/client'
//import './index.css';
import App from './App';
import { BrowserRouter } from 'react-router-dom';
//import reportWebVitals from './reportWebVitals';
//import { render } from '@testing-library/react';


// **** en el video se ve distinto el codigo ****
// **** si no funciona 1er video min 7.00

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
//ReactDOM.render(
  <React.StrictMode>
    <BrowserRouter>
    <App />
    </BrowserRouter>
    
  </React.StrictMode> //agregue una coma
  //document.getElementById("root")  // agregue esta linea
);

// **** en el video lo elimina ****

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
//reportWebVitals();
