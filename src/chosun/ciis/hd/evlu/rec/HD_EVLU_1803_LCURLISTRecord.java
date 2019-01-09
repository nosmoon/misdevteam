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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_1803_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sel_chk;
	public String evlu_part_nm;
	public String evlu_indx_nm;
	public String act_indx_def;
	public String db_status;
	public String evlu_part_cd;
	public String evlu_indx_cd;
	public String act_indx_cd;
	public String gub_note;

	public HD_EVLU_1803_LCURLISTRecord(){}

	public void setSel_chk(String sel_chk){
		this.sel_chk = sel_chk;
	}

	public void setEvlu_part_nm(String evlu_part_nm){
		this.evlu_part_nm = evlu_part_nm;
	}

	public void setEvlu_indx_nm(String evlu_indx_nm){
		this.evlu_indx_nm = evlu_indx_nm;
	}

	public void setAct_indx_def(String act_indx_def){
		this.act_indx_def = act_indx_def;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public void setEvlu_part_cd(String evlu_part_cd){
		this.evlu_part_cd = evlu_part_cd;
	}

	public void setEvlu_indx_cd(String evlu_indx_cd){
		this.evlu_indx_cd = evlu_indx_cd;
	}

	public void setAct_indx_cd(String act_indx_cd){
		this.act_indx_cd = act_indx_cd;
	}

	public void setGub_note(String gub_note){
		this.gub_note = gub_note;
	}

	public String getSel_chk(){
		return this.sel_chk;
	}

	public String getEvlu_part_nm(){
		return this.evlu_part_nm;
	}

	public String getEvlu_indx_nm(){
		return this.evlu_indx_nm;
	}

	public String getAct_indx_def(){
		return this.act_indx_def;
	}

	public String getDb_status(){
		return this.db_status;
	}

	public String getEvlu_part_cd(){
		return this.evlu_part_cd;
	}

	public String getEvlu_indx_cd(){
		return this.evlu_indx_cd;
	}

	public String getAct_indx_cd(){
		return this.act_indx_cd;
	}

	public String getGub_note(){
		return this.gub_note;
	}
}

/* 작성시간 : Wed Mar 26 16:56:40 KST 2014 */