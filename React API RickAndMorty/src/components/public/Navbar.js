import React from "react";
import { Link } from "react-router-dom";

export default function Navbar() {
  return (
    <div>
      <header className="p-3 text-bg-dark">
        <div className="container">
          <div className="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
            <span
              to={"/"}
              className="col-md-4 d-flex algin-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-dark"
            >
              <img
                className="App-logo"
                height="52"
                src="img_perro.png"
                alt="perro-giratorio"
              />
            </span>

            <ul className="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
              <li>
                <Link to={"/"} className="nav-link px-2 px-2 text-white">
                  Home
                </Link>
              </li>
              <li>
                <Link
                  to={"/user-form"}
                  className="nav-link px-2 px-2 text-white"
                >
                  Registrate
                </Link>
              </li>
              <li>
                <a href="#" className="nav-link px-2 text-white">
                  Pricing
                </a>
              </li>
              <li>
                <a href="#" className="nav-link px-2 text-white">
                  FAQs
                </a>
              </li>
              <li>
                <a href="#" className="nav-link px-2 text-white">
                  About
                </a>
              </li>
            </ul>

            <form
              className="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3"
              role="search"
            >
              <input
                type="search"
                className="form-control form-control-dark text-bg-dark"
                placeholder="Search..."
                aria-label="Search"
              />
            </form>

            <div className="text-end">
              <button type="button" className="btn btn-outline-light me-2">
                <Link
                  to={"/user-form"}
                  className="nav-link"
                >
                  Login
                </Link>
              </button>
              <button type="button" className="btn btn-warning">
                Sign-up
              </button>
            </div>
          </div>
        </div>
      </header>
    </div>
  );
}
