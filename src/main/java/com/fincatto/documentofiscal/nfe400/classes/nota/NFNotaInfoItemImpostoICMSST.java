package com.fincatto.documentofiscal.nfe400.classes.nota;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nfe400.classes.NFNotaInfoImpostoTributacaoICMS;
import com.fincatto.documentofiscal.nfe400.classes.NFOrigem;
import com.fincatto.documentofiscal.validadores.BigDecimalParser;

public class NFNotaInfoItemImpostoICMSST extends DFBase {
	private static final long serialVersionUID = -2354449482492846488L;

	@Element(name = "orig", required = true)
	private NFOrigem origem;

	@Element(name = "CST", required = true)
	private NFNotaInfoImpostoTributacaoICMS situacaoTributaria;

	@Element(name = "vBCSTRet", required = true)
	private String valorBCICMSSTRetidoUFRemetente;

	@Element(name = "pST", required = false)
	private String aliqSuportadaConsFinal;
	
	@Element(name = "vICMSSubstituto", required = false)
    private String valorICMSSubstituto;

	@Element(name = "vICMSSTRet", required = true)
	private String valorICMSSTRetidoUFRemetente;

	@Element(name = "vBCFCPSTRet", required = false)
    private String valorBCFundoCombatePobrezaRetidoST;

    @Element(name = "pFCPSTRet", required = false)
    private String percentualFundoCombatePobrezaRetidoST;

    @Element(name = "vFCPSTRet", required = false)
    private String valorFundoCombatePobrezaRetidoST;
	    
	@Element(name = "vBCSTDest", required = true)
	private String valorBCICMSSTUFDestino;

	@Element(name = "vICMSSTDest", required = true)
	private String valorICMSSTUFDestino;
	
	@Element(name = "pRedBCEfet", required = false)
    private String percentualReducaoBCEfetiva;
	
	@Element(name = "vBCEfet", required = false)
    private String valorBCEfetiva;

    @Element(name = "pICMSEfet", required = false)
    private String percentualAliquotaICMSEfetiva;

    @Element(name = "vICMSEfet", required = false)
    private String valorICMSEfetivo;

	public void setOrigem(final NFOrigem origem) {
		this.origem = origem;
	}

	public void setSituacaoTributaria(final NFNotaInfoImpostoTributacaoICMS situacaoTributaria) {
		this.situacaoTributaria = situacaoTributaria;
	}

	public void setValorBCICMSSTRetidoUFRemetente(final BigDecimal valorBCICMSSTRetidoUFRemetente) {
		this.valorBCICMSSTRetidoUFRemetente = BigDecimalParser.tamanho15Com2CasasDecimais(valorBCICMSSTRetidoUFRemetente, "Valor BC ICMS ST Retido UF Remetente");
	}

	public void setAliqSuportadaConsFinal(final BigDecimal aliqSuportadaConsFinal) {
		this.aliqSuportadaConsFinal = BigDecimalParser.tamanho7ComAte4CasasDecimais(aliqSuportadaConsFinal, "Alíquota suportada pelo Consumidor Final");
	}
	
	public void setValorICMSSubstituto(final BigDecimal valorICMSSubstituto) {
		this.valorICMSSubstituto = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMSSubstituto, "Valor do ICMS próprio do Substituto");
	}

	public void setValorICMSSTRetidoUFRemetente(final BigDecimal valorICMSSTRetidoUFRemetente) {
		this.valorICMSSTRetidoUFRemetente = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMSSTRetidoUFRemetente, "Valor ICMS ST Retido UF Remetente");
	}

	public void setValorBCFundoCombatePobrezaRetidoST(final BigDecimal valorBCFundoCombatePobrezaRetidoST) {
        this.valorBCFundoCombatePobrezaRetidoST = BigDecimalParser.tamanho15Com2CasasDecimais(valorBCFundoCombatePobrezaRetidoST, "Valor da Base de Cálculo do FCP retido anteriormente");
    }
	
	public void setPercentualFundoCombatePobrezaRetidoST(final BigDecimal percentualFundoCombatePobrezaRetidoST) {
        if (percentualFundoCombatePobrezaRetidoST.signum() < 0) {
            throw new IllegalStateException("Percentual fundo de combate a pobreza precisa ser maior que zero!");
        }
        this.percentualFundoCombatePobrezaRetidoST = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualFundoCombatePobrezaRetidoST, "Percentual fundo combate pobreza retido ST");
    }
	
	public void setValorFundoCombatePobrezaRetidoST(final BigDecimal valorFundoCombatePobrezaRetidoST) {
        this.valorFundoCombatePobrezaRetidoST = BigDecimalParser.tamanho15Com2CasasDecimais(valorFundoCombatePobrezaRetidoST, "Valor fundo combate pobreza retido ST");
    }
	 
	public void setValorBCICMSSTUFDestino(final BigDecimal valorBCICMSSTUFDestino) {
		this.valorBCICMSSTUFDestino = BigDecimalParser.tamanho15Com2CasasDecimais(valorBCICMSSTUFDestino, "Valor BC ICMS ST UF Destino");
	}

	public void setValorICMSSTUFDestino(final BigDecimal valorICMSSTUFDestino) {
		this.valorICMSSTUFDestino = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMSSTUFDestino, "Valor ICMS ST UF Destino");
	}

	public void setPercentualReducaoBCEfetiva(final BigDecimal percentualReducaoBCEfetiva) {
        this.percentualReducaoBCEfetiva = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualReducaoBCEfetiva, "Percentual de redução da base de cálculo efetiva");
    }
	
	public void setValorBCEfetiva(final BigDecimal valorBCEfetiva) {
        this.valorBCEfetiva = BigDecimalParser.tamanho15Com2CasasDecimais(valorBCEfetiva, "Valor da base de cálculo efetiva");
    }
	
	public void setPercentualAliquotaICMSEfetiva(final BigDecimal percentualAliquotaICMSEfetiva) {
        this.percentualAliquotaICMSEfetiva = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualAliquotaICMSEfetiva, "Percentual aliquota ICMS efetiva");
    }
	
	public void setValorICMSEfetivo(final BigDecimal valorICMSEfetivo) {
        this.valorICMSEfetivo = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMSEfetivo, "Valor ICMS efetivo");
    }

	public NFOrigem getOrigem() {
		return origem;
	}

	public NFNotaInfoImpostoTributacaoICMS getSituacaoTributaria() {
		return situacaoTributaria;
	}

	public String getValorBCICMSSTRetidoUFRemetente() {
		return valorBCICMSSTRetidoUFRemetente;
	}

	public String getAliqSuportadaConsFinal() {
		return aliqSuportadaConsFinal;
	}

	public String getValorICMSSubstituto() {
		return valorICMSSubstituto;
	}

	public String getValorICMSSTRetidoUFRemetente() {
		return valorICMSSTRetidoUFRemetente;
	}

	public String getValorBCFundoCombatePobrezaRetidoST() {
		return valorBCFundoCombatePobrezaRetidoST;
	}

	public String getPercentualFundoCombatePobrezaRetidoST() {
		return percentualFundoCombatePobrezaRetidoST;
	}

	public String getValorFundoCombatePobrezaRetidoST() {
		return valorFundoCombatePobrezaRetidoST;
	}

	public String getValorBCICMSSTUFDestino() {
		return valorBCICMSSTUFDestino;
	}

	public String getValorICMSSTUFDestino() {
		return valorICMSSTUFDestino;
	}

	public String getPercentualReducaoBCEfetiva() {
		return percentualReducaoBCEfetiva;
	}
	
	public String getValorBCEfetiva() {
		return valorBCEfetiva;
	}

	public String getPercentualAliquotaICMSEfetiva() {
		return percentualAliquotaICMSEfetiva;
	}

	public String getValorICMSEfetivo() {
		return valorICMSEfetivo;
	}
	
}