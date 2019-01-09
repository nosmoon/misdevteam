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


package chosun.ciis.ad.bas.rec;


/**
 * 
 */


public class AD_BAS_2750_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String team_nm;
	public String part_nm;
	public String acct_id;
	public String acct_nm;
	public String posi_nm;
	public String part_posi;
	public String chrg_clsf;
	public String chrg_medi_nm;
	public String frdt;
	public String todt;

	public AD_BAS_2750_LCURLISTRecord(){}

	public void setTeam_nm(String team_nm){
		this.team_nm = team_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setAcct_id(String acct_id){
		this.acct_id = acct_id;
	}

	public void setAcct_nm(String acct_nm){
		this.acct_nm = acct_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setPart_posi(String part_posi){
		this.part_posi = part_posi;
	}

	public void setChrg_clsf(String chrg_clsf){
		this.chrg_clsf = chrg_clsf;
	}

	public void setChrg_medi_nm(String chrg_medi_nm){
		this.chrg_medi_nm = chrg_medi_nm;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public String getTeam_nm(){
		return this.team_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getAcct_id(){
		return this.acct_id;
	}

	public String getAcct_nm(){
		return this.acct_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getPart_posi(){
		return this.part_posi;
	}

	public String getChrg_clsf(){
		return this.chrg_clsf;
	}

	public String getChrg_medi_nm(){
		return this.chrg_medi_nm;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}
}

/* 작성시간 : Sat Jul 11 15:41:10 KST 2009 */