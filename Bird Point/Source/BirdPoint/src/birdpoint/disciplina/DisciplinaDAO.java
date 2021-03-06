/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birdpoint.disciplina;

import birdpoint.curso.Curso;
import birdpoint.util.GenericDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Nóbrega
 */
public class DisciplinaDAO extends GenericDAO<Disciplina> {

    public DisciplinaDAO() {
        super(Disciplina.class);
    }

    public void salvar(Disciplina disciplina) {
        Object[] options = {"Sim", "Não"};
        if (disciplina.getIdDisciplina() == 0) {
            if (adicionar(disciplina)) {
                JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso!");
            }
        } else if (JOptionPane.showOptionDialog(null, "Deseja mesmo realizar essa edição"
                + "?", "BirdPoint", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            if (atualizar(disciplina)) {
                JOptionPane.showMessageDialog(null, "Disciplina editada com sucesso!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A edição foi cancelada!");
        }
    }

}
