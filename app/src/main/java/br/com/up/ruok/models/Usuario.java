package br.com.up.ruok.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario {
    private Integer func_id;

    private Integer bem_estar;

    private String data;

    public Usuario(Integer func_id, Integer bem_estar, String data) {
        this.func_id = func_id;
        this.bem_estar = bem_estar;
        this.data = data;
    }

    public Integer getFunc_id() {
        return func_id;
    }

    public void setFunc_id(Integer func_id) {
        this.func_id = func_id;
    }

    public Integer getBem_estar() {
        return bem_estar;
    }

    public void setBem_estar(Integer bem_estar) {
        this.bem_estar = bem_estar;
    }

    public void setData() {
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        this.data = formatador.format(data);
    }
}