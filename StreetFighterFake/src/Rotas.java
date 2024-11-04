import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Database.DatabaseConnection;
import Personagem.Personagem;
import Torneio.Torneio;
import Torneio.TorneioEquipe;
import Torneio.TorneioIndividual;
import Tecnica.Tecnica;

public class Rotas {

    // CRUD para Personagem
    public static void criarPersonagem(int id, String nome, int forca) {
        String sql = "INSERT INTO Personagens (id, nome, forca) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.setString(2, nome);
            stmt.setInt(3, forca);

            stmt.executeUpdate();
            System.out.println("Personagem criado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Personagem buscarPersonagemPorNome(String nome) {
        String sql = "SELECT * FROM Personagens WHERE nome = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("nome");
                int age = rs.getInt("idade");
                int strength = rs.getInt("forca");
                int speed = rs.getInt("velocidade");
                int life = rs.getInt("vida");
                int level = rs.getInt("nivel");

                return new Personagem(name, age, strength, speed, life, level);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void atualizarForcaPersonagem(int id, int novaForca) {
        String sql = "UPDATE Personagens SET forca = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, novaForca);
            stmt.setInt(2, id);

            stmt.executeUpdate();
            System.out.println("Força do personagem atualizada com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deletarPersonagem(int id) {
        String sql = "DELETE FROM Personagens WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            stmt.executeUpdate();
            System.out.println("Personagem deletado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // CRUD para Torneio
    public static void criarTorneio(int id, String nome, String tipo) {
        String sql = "INSERT INTO Torneios (id, nome, tipo) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.setString(2, nome);
            stmt.setString(3, tipo);

            stmt.executeUpdate();
            System.out.println("Torneio criado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Torneio buscarTorneioPorNome(String nome) {
        String sql = "SELECT * FROM Torneios WHERE nome = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("nome");
                String type = rs.getString("tipo");
                String prize = rs.getString("premio");
                int maxParticipants = rs.getInt("maxParticipantes");

                Torneio torneio;

                if (type.equalsIgnoreCase("Individual")) {
                    int rounds = rs.getInt("rodadas");
                    torneio = new TorneioIndividual(name, prize, maxParticipants, rounds);
                } else if (type.equalsIgnoreCase("Equipe")) {
                    torneio = new TorneioEquipe(name, prize, maxParticipants);
                } else {
                    throw new IllegalArgumentException("Tipo de torneio desconhecido: " + type);
                }

                return torneio;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void atualizarTorneio(int id, String novoNome, String novoTipo) {
        String sql = "UPDATE Torneios SET nome = ?, tipo = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, novoNome);
            stmt.setString(2, novoTipo);
            stmt.setInt(3, id);

            stmt.executeUpdate();
            System.out.println("Torneio atualizado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deletarTorneio(int id) {
        String sql = "DELETE FROM Torneios WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            stmt.executeUpdate();
            System.out.println("Torneio deletado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // CRUD para Tecnica
    public static void criarTecnica(int id, String nome, String tipo) {
        String sql = "INSERT INTO Tecnicas (id, nome, tipo) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.setString(2, nome);
            stmt.setString(3, tipo);

            stmt.executeUpdate();
            System.out.println("Tecnica criada com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Tecnica buscarTecnicaPorNome(String nome) {
        String sql = "SELECT * FROM Tecnicas WHERE nome = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String name = rs.getString("nome");
                int power = rs.getInt("poder");
                int energyCost = rs.getInt("custoEnergia");
                String type = rs.getString("tipo");
                int cooldown = rs.getInt("cooldown");
                String description = rs.getString("descricao");

                return new Tecnica(name, power, energyCost, type, cooldown, description);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void atualizarTecnica(int id, String novoNome, String novoTipo) {
        String sql = "UPDATE Tecnicas SET nome = ?, tipo = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, novoNome);
            stmt.setString(2, novoTipo);
            stmt.setInt(3, id);

            stmt.executeUpdate();
            System.out.println("Tecnica atualizada com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deletarTecnica(int id) {
        String sql = "DELETE FROM Tecnicas WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            stmt.executeUpdate();
            System.out.println("Tecnica deletada com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
