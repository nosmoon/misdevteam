/***************************************************************************************************
* 파일명   : SP_AD_COM_1410_L.java
* 기능     : 업무연락-광고원고수배장 / 중점확인광고리스트 조회
* 작성일자 : 2009-01-15
* 작성자   : 김재일
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/


package chosun.ciis.ad.com.rec;


/**
 * 업무연락-광고원고수배장 / 중점확인광고리스트 조회
 */


public class AD_COM_1410_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String cnfm_dt;
	public int seq;
	public String pubc_side;
	public String advcs;
	public String std;
	public String slcrg;
	public String cnfm_matt;

	public AD_COM_1410_LCURLIST2Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCnfm_dt(String cnfm_dt){
		this.cnfm_dt = cnfm_dt;
	}

	public void setSeq(int seq){
		this.seq = seq;
	}

	public void setPubc_side(String pubc_side){
		this.pubc_side = pubc_side;
	}

	public void setAdvcs(String advcs){
		this.advcs = advcs;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setSlcrg(String slcrg){
		this.slcrg = slcrg;
	}

	public void setCnfm_matt(String cnfm_matt){
		this.cnfm_matt = cnfm_matt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCnfm_dt(){
		return this.cnfm_dt;
	}

	public int getSeq(){
		return this.seq;
	}

	public String getPubc_side(){
		return this.pubc_side;
	}

	public String getAdvcs(){
		return this.advcs;
	}

	public String getStd(){
		return this.std;
	}

	public String getSlcrg(){
		return this.slcrg;
	}

	public String getCnfm_matt(){
		return this.cnfm_matt;
	}
}

/* 작성시간 : Wed Feb 04 17:44:43 KST 2009 */