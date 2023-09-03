import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css'
import Productos from './components/Productos';
import Header from './components/Header';
import Footer from './components/Footer';
import useProducto from './hooks/useProducto';
import Detalle from './components/Detalle';

function App() {
  
  const {productos, favoritos, agregarAFavoritos, eliminarDeFavoritos} = useProducto(); 

  return (
<div>
<BrowserRouter>
    <Header />
    <Routes>
      <Route path='/' element={<Productos productos={productos} agregarAFavoritos={agregarAFavoritos} eliminarDeFavoritos={eliminarDeFavoritos} />}></Route>
      <Route path='/favoritos' element={<Productos productos={favoritos} agregarAFavoritos={agregarAFavoritos} eliminarDeFavoritos={eliminarDeFavoritos}/>}></Route>
      <Route path='/producto/:id' element={<Detalle/>}></Route>
    </Routes>
    <Footer />
    </BrowserRouter>
</div>
  )
}

export default App

