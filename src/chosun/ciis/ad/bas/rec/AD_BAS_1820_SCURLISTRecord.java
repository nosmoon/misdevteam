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


public class AD_BAS_1820_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String basi_dt;
	public String mang_mortg_surp_amt;
	public String busn_mortg_surp_amt;
	public String cover_note;
	public String advcs_note;
	public String dhon_note;

	public AD_BAS_1820_SCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setMang_mortg_surp_amt(String mang_mortg_surp_amt){
		this.mang_mortg_surp_amt = mang_mortg_surp_amt;
	}

	public void setBusn_mortg_surp_amt(String busn_mortg_surp_amt){
		this.busn_mortg_surp_amt = busn_mortg_surp_amt;
	}

	public void setCover_note(String cover_note){
		this.cover_note = cover_note;
	}

	public void setAdvcs_note(String advcs_note){
		this.advcs_note = advcs_note;
	}

	public void setDhon_note(String dhon_note){
		this.dhon_note = dhon_note;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getMang_mortg_surp_amt(){
		return this.mang_mortg_surp_amt;
	}

	public String getBusn_mortg_surp_amt(){
		return this.busn_mortg_surp_amt;
	}

	public String getCover_note(){
		return this.cover_note;
	}

	public String getAdvcs_note(){
		return this.advcs_note;
	}

	public String getDhon_note(){
		return this.dhon_note;
	}
}

/* 작성시간 : Wed Jul 22 13:40:08 KST 2009 */