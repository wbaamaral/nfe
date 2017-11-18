package com.fincatto.documentofiscal.cte300.classes.evento.cancelamento;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.cte300.classes.evento.CTeInfoEventoRetorno;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "retCancCTe")
public class CTeRetornoCancelamento extends DFBase {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "infEvento")
    private CTeInfoEventoRetorno infoCancelamento;

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final String versao) {
        this.versao = versao;
    }

    public CTeInfoEventoRetorno getInfoCancelamento() {
        return infoCancelamento;
    }

    public void setInfoCancelamento(CTeInfoEventoRetorno infoCancelamento) {
        this.infoCancelamento = infoCancelamento;
    }
}