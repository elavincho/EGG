import "./App.css";
import { Routes, Route } from "react-router-dom";
import Footer from "./components/public/Footer";
import Main from "./components/public/Main";
import Navbar from "./components/public/Navbar";
import UserForm from "./components/public/UserForm";
import Detail from "./components/public/Detail";

/*sacamos el main para utilizar el metodo Route*/
/*<Main/> */
function App() {
  return (
    <div>
      <Navbar />
      <Routes>
        <Route exact path="/" element={<Main />}></Route>
        <Route exact path="/user-form" element={<UserForm />}></Route>
        <Route exact path="/detail/:id" element={<Detail />}></Route>
      </Routes>
      <Footer />
    </div>
  );
}

export default App;
