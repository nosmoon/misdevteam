/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 *
 */

public class HD_EVLU_1502_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sel_chk;
	public String evlu_indx_cd;
	public String db_status;

	public HD_EVLU_1502_LCURLISTRecord(){}

	public void setSel_chk(String sel_chk){
		this.sel_chk = sel_chk;
	}

	public void setEvlu_indx_cd(String evlu_indx_cd){
		this.evlu_indx_cd = evlu_indx_cd;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public String getSel_chk(){
		return this.sel_chk;
	}

	public String getEvlu_indx_cd(){
		return this.evlu_indx_cd;
	}

	public String getDb_status(){
		return this.db_status;
	}
}

/* 작성시간 : Sat May 16 18:24:04 KST 2009 */