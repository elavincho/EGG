import {Link} from "react-router-dom";
import LogoImg from '../img/icon.png';

export default function Header(){
    return(
        <header className="header">
            <Link className="icon" to={"/"}><img src={LogoImg} alt="logo" /></Link>
            <h4>Ventas App</h4>
            <nav className="navbar">
                <Link to={"/"}>Productos</Link>
                <Link to={"/favoritos"}>Favoritos</Link>
            </nav>
        </header>
    )
}