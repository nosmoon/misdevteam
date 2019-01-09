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


public class AD_BAS_1540_SCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String rept_clsf;
	public String make_dt;
	public int rept_no;
	public int add_file_no;
	public String add_file_nm;

	public AD_BAS_1540_SCURLIST2Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRept_clsf(String rept_clsf){
		this.rept_clsf = rept_clsf;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setRept_no(int rept_no){
		this.rept_no = rept_no;
	}

	public void setAdd_file_no(int add_file_no){
		this.add_file_no = add_file_no;
	}

	public void setAdd_file_nm(String add_file_nm){
		this.add_file_nm = add_file_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRept_clsf(){
		return this.rept_clsf;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public int getRept_no(){
		return this.rept_no;
	}

	public int getAdd_file_no(){
		return this.add_file_no;
	}

	public String getAdd_file_nm(){
		return this.add_file_nm;
	}
}

/* 작성시간 : Tue Jun 23 09:36:40 KST 2009 */