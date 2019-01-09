/***************************************************************************************************
* 파일명 : .java
* 기능 : 거래처인물정보
* 작성일자 : 2010.07.16
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.bas.rec;


/**
 * 
 */


public class AD_BAS_3721_SCURLISTRecord extends java.lang.Object implements java.io.Serializable
{
	public String seq;
	public String sect_nm_cd;
	public String sect_nm_detail;
	public String sect_cd;
	public String tot_pcnt;
	public String tot_dn;
	public String tot_clr_dn;
	public String tot_pubc_amt;
	public String advt_ocpy_rate;

	public AD_BAS_3721_SCURLISTRecord(){}

	public String getAdvt_ocpy_rate() {
		return advt_ocpy_rate;
	}

	public void setAdvt_ocpy_rate(String advt_ocpy_rate) {
		this.advt_ocpy_rate = advt_ocpy_rate;
	}

	public String getSect_cd() {
		return sect_cd;
	}

	public void setSect_cd(String sect_cd) {
		this.sect_cd = sect_cd;
	}

	public String getSect_nm_cd() {
		return sect_nm_cd;
	}

	public void setSect_nm_cd(String sect_nm_cd) {
		this.sect_nm_cd = sect_nm_cd;
	}

	public String getSect_nm_detail() {
		return sect_nm_detail;
	}

	public void setSect_nm_detail(String sect_nm_detail) {
		this.sect_nm_detail = sect_nm_detail;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getTot_clr_dn() {
		return tot_clr_dn;
	}

	public void setTot_clr_dn(String tot_clr_dn) {
		this.tot_clr_dn = tot_clr_dn;
	}

	public String getTot_dn() {
		return tot_dn;
	}

	public void setTot_dn(String tot_dn) {
		this.tot_dn = tot_dn;
	}

	public String getTot_pcnt() {
		return tot_pcnt;
	}

	public void setTot_pcnt(String tot_pcnt) {
		this.tot_pcnt = tot_pcnt;
	}

	public String getTot_pubc_amt() {
		return tot_pubc_amt;
	}

	public void setTot_pubc_amt(String tot_pubc_amt) {
		this.tot_pubc_amt = tot_pubc_amt;
	}

	
}

/* 작성시간 : Tue Jan 20 16:17:09 KST 2009 */