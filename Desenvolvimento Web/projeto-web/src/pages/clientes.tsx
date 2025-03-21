import styles from "../styles/Clientes.module.css";
import Header from '../components/Header';
import Footer from '../components/Footer';
import Head from 'next/head';
import React, { useEffect, useState } from "react";

interface Cliente {
    id_cliente: number;
    nome: string;
    email: string;
    telefone: string;
    endereco: string;
    data_nascimento: string;
}

export default function Clientes() {
    const [clientes, setClientes] = useState<Cliente[]>([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState("");
  
    useEffect(() => {
      const fetchClientes = async () => {
        try {
          const response = await fetch("/api/clientes");
          if (!response.ok) {
            throw new Error("Erro ao buscar clientes.");
          }
          const data = await response.json();
          setClientes(data.clientes);
        } catch (error) {
          setError("Erro ao carregar clientes.");
        } finally {
          setLoading(false);
        }
      };
  
      fetchClientes();
    }, []);

    return(
        <>
        
        <Head>
            <title>Clientes</title>
        </Head>

        <Header />

        <div className={styles.container}>

      <h1 className={styles.heading}>Lista de Clientes</h1>
      {loading ? (
        <p>Carregando...</p>
      ) : error ? (
        <p className={styles.error}>{error}</p>
      ) : clientes.length === 0 ? (
        <p>Nenhum cliente cadastrado.</p>
      ) : (
        <table className={styles.table}>
          <thead>
            <tr>
              <th>ID</th>
              <th>Nome</th>
              <th>Email</th>
              <th>Telefone</th>
              <th>Endereço</th>
              <th>Data de Nascimento</th>
            </tr>
          </thead>
          <tbody>
            {clientes.map((cliente) => (
              <tr key={cliente.id_cliente}>
                <td>{cliente.id_cliente}</td>
                <td>{cliente.nome}</td>
                <td>{cliente.email}</td>
                <td>{cliente.telefone}</td>
                <td>{cliente.endereco}</td>
                <td>{new Date(cliente.data_nascimento).toLocaleDateString()}</td>
              </tr>
            ))}
          </tbody>
        </table>
      )}
    </div>

        <Footer />
        </>
    );
}