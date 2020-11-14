package Logica;

import java.time.LocalDate;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Persistencia.ControladorBD;

public class ControladorLogic {

public Usuario altaUsuario (Usuario usuario) {
return usuario;

}

public Materia altaMateria (Materia materia) {
return materia;

}

public Inasistencia altaInasistencia (Inasistencia inasistencia) {
return null;

}

public Usuario consultarUsuario (String ci) {
return null;

}

public Materia cosultarMateria () {
return null;

}

public List<Inasistencia> consultarInasistencia () {
return null;

}

public List<Estudiante> listarEstudiantesm() {
return null;

}

public List<Materia> listarMaterias () {
return null;

}

public List<Inasistencia> listarInasistencias () {
return null;

}

public List<Inasistencia> listarInasistencias (LocalDate fechaDesde, LocalDate fechaHasta) {
return null;

}

public Usuario modificarUsuario (String ci, Usuario usuario) {
return null;

}

public Materia modificarMateria (Materia codigo, Materia materia) {
return null;

}

public void bajaInasistencia (Inasistencia inasistencia) {

}

public List<Usuario> listarEstudianteConPendientes () {
return null;

}

public List<Examen> listarHistoricoDeExamenes () {
return null;

}

public List<Examen> listarHistoricoDeExamenes (String ci) {
return null;

}

public List<Materia> listarPendiendes (String ci) {
return null;

}

public Usuario login (String ci, String pass) {
return null;

}

public boolean logout () {
return false;

}

public java.util.List<Usuario> listarClase (Generacion generacion, Orientacion orientacion) {
return null;

}

public List<Docente> listarDocentes () {
return null;

}

public List<Funcionario> listarFuncionarios () {
return null;

}

}