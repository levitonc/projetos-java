package dio.padroesprojetos.Model;

import jakarta.persistence.Id;

public class Endereco {

    @Id
private String cep;

public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

private String logradouro;
public String getLogradouro() {
    return logradouro;
}

public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
}

private String complemento;
public String getComplemento() {
    return complemento;
}

public void setComplemento(String complemento) {
    this.complemento = complemento;
}

private String bairro;
public String getBairro() {
    return bairro;
}

public void setBairro(String bairro) {
    this.bairro = bairro;
}

private String localidade;
public String getLocalidade() {
    return localidade;
}

public void setLocalidade(String localidade) {
    this.localidade = localidade;
}

private String uf;
public String getUf() {
    return uf;
}

public void setUf(String uf) {
    this.uf = uf;
}

private String ibge;
public String getIbge() {
    return ibge;
}

public void setIbge(String ibge) {
    this.ibge = ibge;
}

private String gia;
public String getGia() {
    return gia;
}

public void setGia(String gia) {
    this.gia = gia;
}

private String ddd;
public String getDdd() {
    return ddd;
}

public void setDdd(String ddd) {
    this.ddd = ddd;
}

private String siafi;

public String getSiafi() {
    return siafi;
}

public void setSiafi(String siafi) {
    this.siafi = siafi;
}

public Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf,
        String ibge, String gia, String ddd, String siafi) {
    this.cep = cep;
    this.logradouro = logradouro;
    this.complemento = complemento;
    this.bairro = bairro;
    this.localidade = localidade;
    this.uf = uf;
    this.ibge = ibge;
    this.gia = gia;
    this.ddd = ddd;
    this.siafi = siafi;
}
    
}
