import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.function.Predicate;

public class MensajesDAO {
    public static void CrearMensajeDB(Mensajes mensaje){
        Conexion cd_connect = new Conexion();

        try (Connection conexion = cd_connect.get_connection()){
            PreparedStatement ps = null;

            try {
                String query = "INSERT INTO `mensajes` (`mensaje`, `autor_mensaje`) VALUES (?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                ps.executeUpdate();

                System.out.println("mensaje creado");

            }catch (SQLException e){
                System.out.println(e);
            }


        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static void leerMensajesDB(){

    }

    public static void borrarMensajeDB(int id_mensaje){

    }

    public static void actualizarMensajeDB(Mensajes mensaje){

    }

}
