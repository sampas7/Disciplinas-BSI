import Link from 'next/link'; 
import styles from '../styles/Header.module.css';


const Header = () => {
  return (
    <header className={styles.header}>
      <nav className={styles.nav}>
        <ul className={styles['nav-links']}>
          <li>
            <Link href="/clientes">Clientes</Link>
          </li>
          <li>
            <Link href="/criarclientes">Criar Clientes</Link>
          </li>
          <li>
            <Link href="/vendas">Vendas</Link>
          </li>
          <li>
            <Link href="/produtos">Produtos</Link>
          </li>
        </ul>
      </nav>
    </header>
  );
};

export default Header;