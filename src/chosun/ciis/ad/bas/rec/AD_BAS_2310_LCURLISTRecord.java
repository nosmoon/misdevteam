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


public class AD_BAS_2310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pubc_dt;
	public String pubc_seq;
	public String sect;
	public String pubc_side;
	public String advt_cont;
	public String advt_size;
	public String pubc_clsf;
	public String remk;

	public AD_BAS_2310_LCURLISTRecord(){}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setPubc_seq(String pubc_seq){
		this.pubc_seq = pubc_seq;
	}

	public void setSect(String sect){
		this.sect = sect;
	}

	public void setPubc_side(String pubc_side){
		this.pubc_side = pubc_side;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setAdvt_size(String advt_size){
		this.advt_size = advt_size;
	}

	public void setPubc_clsf(String pubc_clsf){
		this.pubc_clsf = pubc_clsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getPubc_seq(){
		return this.pubc_seq;
	}

	public String getSect(){
		return this.sect;
	}

	public String getPubc_side(){
		return this.pubc_side;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getAdvt_size(){
		return this.advt_size;
	}

	public String getPubc_clsf(){
		return this.pubc_clsf;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Wed Apr 15 16:38:43 KST 2009 */