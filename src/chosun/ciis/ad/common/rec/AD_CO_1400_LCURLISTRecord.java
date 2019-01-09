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


package chosun.ciis.ad.common.rec;


/**
 * 
 */


public class AD_CO_1400_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String grp_cmpy_cd;
	public String grp_cmpy_nm;
	public String dlco_no;
	public String dlco_nm;

	public AD_CO_1400_LCURLISTRecord(){}

	public void setGrp_cmpy_cd(String grp_cmpy_cd){
		this.grp_cmpy_cd = grp_cmpy_cd;
	}

	public void setGrp_cmpy_nm(String grp_cmpy_nm){
		this.grp_cmpy_nm = grp_cmpy_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public String getGrp_cmpy_cd(){
		return this.grp_cmpy_cd;
	}

	public String getGrp_cmpy_nm(){
		return this.grp_cmpy_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}
}

/* 작성시간 : Wed Jul 01 10:00:25 KST 2009 */