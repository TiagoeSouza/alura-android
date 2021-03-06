package br.com.android.tiago.agendaIII.converter;

import org.json.JSONException;
import org.json.JSONStringer;

import java.util.List;

import br.com.android.tiago.agendaIII.modelo.Aluno;

/**
 * Created by Tiago on 06/11/2017.
 */

public class AlunoConverter {

    public String converteParaJSON(List<Aluno> alunos) {
        JSONStringer js = new JSONStringer();
        try {
            js.object().key("list").array().object().key("aluno").array();

            for (Aluno aluno : alunos) {
                js.object();
                js.key("nome").value(aluno.getNome());
                js.key("nota").value(aluno.getNota());
                js.endObject();
            }

            js.endArray().endObject().endArray().endObject();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return js.toString();
    }
}
