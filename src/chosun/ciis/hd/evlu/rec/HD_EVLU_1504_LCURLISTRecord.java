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


public class HD_EVLU_1504_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String act_indx_cd;
	public String act_indx_def;
	public String db_status;
	public String gub_note;

	public HD_EVLU_1504_LCURLISTRecord(){}

	public void setAct_indx_cd(String act_indx_cd){
		this.act_indx_cd = act_indx_cd;
	}

	public void setAct_indx_def(String act_indx_def){
		this.act_indx_def = act_indx_def;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public void setGub_note(String gub_note){
		this.gub_note = gub_note;
	}

	public String getAct_indx_cd(){
		return this.act_indx_cd;
	}

	public String getAct_indx_def(){
		return this.act_indx_def;
	}

	public String getDb_status(){
		return this.db_status;
	}

	public String getGub_note(){
		return this.gub_note;
	}
}

/* 작성시간 : Wed Mar 26 16:30:35 KST 2014 */