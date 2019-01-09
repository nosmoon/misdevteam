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

public class HD_EVLU_2202_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String appmt_cd;
	public String remk;
	public String db_status;

	public HD_EVLU_2202_LCURLISTRecord(){}

	public void setAppmt_cd(String appmt_cd){
		this.appmt_cd = appmt_cd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public String getAppmt_cd(){
		return this.appmt_cd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDb_status(){
		return this.db_status;
	}
}

/* 작성시간 : Tue May 19 10:45:10 KST 2009 */