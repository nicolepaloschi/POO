package controller;

import dao.ProfissionalDAO;
import model.Profissional;
import model.Pessoa;

public class ProfissionalController {

    public void createProfissional(Pessoa pessoa, String especialidade, String registroConselho, java.sql.Date dataInscricao) throws Exception {
        if (pessoa.getIdPessoa() > 0 && especialidade != null && registroConselho != null && dataInscricao != null) {
            Profissional profissional = new Profissional();
            profissional.createProfissional(profissional);
        } else {
            throw new Exception("Preencha os campos corretamente!");
        }
    }

    public void updateProfissional(int idProfissional, String especialidade, String registroConselho, java.sql.Date dataInscricao) throws Exception {
        if (idProfissional > 0 && especialidade != null && registroConselho != null && dataInscricao != null) {
            Profissional profissional = new Profissional();
            profissional.setIdProfissional(idProfissional);
            profissional.setEspecialidade(especialidade);
            profissional.setRegistroConselho(registroConselho);
            profissional.setDataInscricao(dataInscricao);
            profissional.updateProfisssional(profissional);
        } else {
            throw new Exception("Preencha os campos corretamente!");
        }
    }

    public void deleteProfissional(int idProfissional) throws Exception {
        if (idProfissional > 0) {
            new ProfissionalDAO().deleteProfissional(idProfissional);
        } else {
            throw new Exception("ID do Profissional é inválido!");
        }
    }

    public Profissional getProfissionalById(int idProfissional) throws Exception {
        if (idProfissional > 0) {
            return new ProfissionalDAO().getProfissionalById(idProfissional);
        } else {
            throw new Exception("ID do Profissional é inválido!");
        }
    }

    public Profissional getProfissionalByRegistro(String registroConselho) throws Exception {
        if (registroConselho != null && !registroConselho.isEmpty()) {
            return new ProfissionalDAO().getProfissionalByRegistro(registroConselho);
        } else {
            throw new Exception("Registro de conselho é inválido!");
        }
    }
}