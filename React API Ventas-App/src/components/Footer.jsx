export default function Footer(){
    return (
        <footer className="footer">
            &copy; ventas-app <span>{new Date().getFullYear()}</span>
        </footer>
    )
}