package controlador;

import sql.Conexion;
import modelo.Encomiendas;
import java.sql.*;
import java.util.ArrayList;

public class Registro {

   public static boolean agregarRegistro(Encomiendas dto) {
       try {
           Connection conexion = Conexion.getConexion();
           String query = "INSERT INTO encomienda(en_id, en_destinatario, en_direccion, en_tipo, en_entregadomicilio, en_tamano, en_remitente) VALUES (?, ?, ?, ?, ?, ?, ?)";
           PreparedStatement insertar = conexion.prepareStatement(query);
           insertar.setInt(1, dto.getId());
           insertar.setString(2, dto.getDestinatario());
           insertar.setString(3, dto.getDireccion());
           insertar.setString(4, dto.getTipoEncomienda());
           insertar.setBoolean(5, dto.getEntrega());
           insertar.setString(6, dto.getTamano());
           insertar.setString(7, dto.getRemitente());
           insertar.execute();
           insertar.close();
           conexion.close();
           return true;
       } catch (SQLException s) {
           System.out.println("Error SQL al agregar registro: " + s.getMessage());
           return false;
       } catch (Exception e) {
           System.out.println("Error al agregar registro: " + e.getMessage());
           return false;
       }
   }

    public static boolean editarRegistro(Encomiendas dto) {
        try {
            Connection conexion = Conexion.getConexion();
            String query = "UPDATE encomienda SET en_destinatario=?, en_direccion=?, en_tipo=?, en_entregadomicilio=?, en_tamano=?, en_remitente=? WHERE en_id=?";
            PreparedStatement editar = conexion.prepareStatement(query);
            editar.setString(1, dto.getDestinatario());
            editar.setString(2, dto.getDireccion());
            editar.setString(3, dto.getTipoEncomienda());
            editar.setBoolean(4, dto.getEntrega());
            editar.setString(5, dto.getTamano());
            editar.setString(6, dto.getRemitente());
            editar.setInt(7, dto.getId());
            editar.execute();
            editar.close();
            conexion.close();
            return true;
        } catch (SQLException s) {
            System.out.println("Error SQL al editar registro: " + s.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al editar registro: " + e.getMessage());
            return false;
        }
    }
    
    public static void eliminarRegistro(int idEliminar) {
        try {
            Connection conexion = Conexion.getConexion();
            String query = "DELETE FROM encomienda WHERE en_id=?";
            PreparedStatement eliminar = conexion.prepareStatement(query);
            eliminar.setInt(1, idEliminar);
            eliminar.execute();
            eliminar.close();
            conexion.close();
        } catch (SQLException s) {
            System.out.println("Error SQL al eliminar registro: " + s.getMessage());
        } catch (Exception e) {
            System.out.println("Error al eliminar registro: " + e.getMessage());
        }
    }
    
    public static ArrayList<Encomiendas> mostrarTodo() {
        ArrayList<Encomiendas> listaRegistros = new ArrayList<Encomiendas>();
        try {
            Connection conexion = Conexion.getConexion();
            String query = "SELECT * FROM encomienda";
            PreparedStatement listarTodo = conexion.prepareStatement(query);
            ResultSet rs = listarTodo.executeQuery();
            while (rs.next()) {
                Encomiendas dto = new Encomiendas();
                dto.setId(rs.getInt("en_id"));
                dto.setDestinatario(rs.getString("en_destinatario"));
                dto.setDireccion(rs.getString("en_direccion"));
                dto.setTipoEncomienda(rs.getString("en_tipo"));
                dto.setEntrega(rs.getInt("en_entregadomicilio") == 1);
                dto.setTamano(rs.getString("en_tamano"));
                dto.setRemitente(rs.getString("en_remitente"));
                listaRegistros.add(dto);
            }
            listarTodo.close();
            conexion.close();
        } catch (SQLException s) {
            System.out.println("Error SQL al listar registros: " + s.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar registros: " + e.getMessage());
        }
        return listaRegistros;
    }
    
    public static Encomiendas buscarPorEncomienda(int idBuscado) {
        Encomiendas encomiendaBuscada = null;
        try {
            Connection conexion = Conexion.getConexion();
            String query = "SELECT en_id, en_destinatario, en_direccion, en_tipo, en_entregadomicilio, en_tamano, en_remitente FROM encomienda WHERE en_id=?";
            PreparedStatement buscarPorRegistro = conexion.prepareStatement(query);
            buscarPorRegistro.setInt(1, idBuscado);
            ResultSet rs = buscarPorRegistro.executeQuery();
            if (rs.next()) {
                encomiendaBuscada = new Encomiendas();
                encomiendaBuscada.setId(rs.getInt("en_id"));
                encomiendaBuscada.setDestinatario(rs.getString("en_destinatario"));
                encomiendaBuscada.setDireccion(rs.getString("en_direccion"));
                encomiendaBuscada.setTipoEncomienda(rs.getString("en_tipo"));
                encomiendaBuscada.setEntrega(rs.getBoolean("en_entregadomicilio"));
                encomiendaBuscada.setTamano(rs.getString("en_tamano"));
                encomiendaBuscada.setRemitente(rs.getString("en_remitente"));
            }
            buscarPorRegistro.close();
            conexion.close();
        } catch (SQLException s) {
            System.out.println("Error SQL al buscar por encomienda: " + s.getMessage());
        } catch (Exception e) {
            System.out.println("Error al buscar por encomienda: " + e.getMessage());
        }
        return encomiendaBuscada;
    }
}
