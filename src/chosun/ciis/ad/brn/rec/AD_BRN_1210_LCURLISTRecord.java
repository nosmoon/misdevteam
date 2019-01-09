/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.brn.rec;


/**
 * 
 */


public class AD_BRN_1210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_nm;
	public String dlco_nm;
	public String agn_nm;
	public String slcrg_pers_nm;
	public String pubc_slip_no;
	public String advt_fee;
	public String vat;
	public String unrcp_amt;

	public AD_BRN_1210_LCURLISTRecord(){}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAgn_nm(String agn_nm){
		this.agn_nm = agn_nm;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setUnrcp_amt(String unrcp_amt){
		this.unrcp_amt = unrcp_amt;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAgn_nm(){
		return this.agn_nm;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getVat(){
		return this.vat;
	}

	public String getUnrcp_amt(){
		return this.unrcp_amt;
	}
}

/* 작성시간 : Sat Jul 11 14:38:38 KST 2009 */