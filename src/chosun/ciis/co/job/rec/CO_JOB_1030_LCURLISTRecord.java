/***************************************************************************************************
* 파일명   : SP_AD_COM_1030_L.java
* 기능     : 업무연락-업무지시답변 조회
* 작성일자 : 2009-01-15
* 작성자   : 김재일
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/


package chosun.ciis.co.job.rec;


/**
 * 업무연락-업무지시답변 조회
 */


public class CO_JOB_1030_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_clsf;
	public int cntc_seq;
	public int answer_seq;
	public String answer_pers;
	public String answer_cont;
	public String add_file_nm;
	public String answer_dt;
	public String team_cd;
	public String part_cd;

	public CO_JOB_1030_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setCntc_seq(int cntc_seq){
		this.cntc_seq = cntc_seq;
	}

	public void setAnswer_seq(int answer_seq){
		this.answer_seq = answer_seq;
	}

	public void setAnswer_pers(String answer_pers){
		this.answer_pers = answer_pers;
	}

	public void setAnswer_cont(String answer_cont){
		this.answer_cont = answer_cont;
	}

	public void setAdd_file_nm(String add_file_nm){
		this.add_file_nm = add_file_nm;
	}

	public void setAnswer_dt(String answer_dt){
		this.answer_dt = answer_dt;
	}

	public void setTeam_cd(String team_cd){
		this.team_cd = team_cd;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public int getCntc_seq(){
		return this.cntc_seq;
	}

	public int getAnswer_seq(){
		return this.answer_seq;
	}

	public String getAnswer_pers(){
		return this.answer_pers;
	}

	public String getAnswer_cont(){
		return this.answer_cont;
	}

	public String getAdd_file_nm(){
		return this.add_file_nm;
	}

	public String getAnswer_dt(){
		return this.answer_dt;
	}

	public String getTeam_cd(){
		return this.team_cd;
	}

	public String getPart_cd(){
		return this.part_cd;
	}
}

/* 작성시간 : Fri Jan 23 14:11:28 KST 2009 */