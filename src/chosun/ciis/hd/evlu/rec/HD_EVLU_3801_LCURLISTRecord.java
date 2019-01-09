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

public class HD_EVLU_3801_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_grp_cd_2tms;
	public String evlu_grp_nm_2tms;
	public String db_status;

	public HD_EVLU_3801_LCURLISTRecord(){}

	public void setEvlu_grp_cd_2tms(String evlu_grp_cd_2tms){
		this.evlu_grp_cd_2tms = evlu_grp_cd_2tms;
	}

	public void setEvlu_grp_nm_2tms(String evlu_grp_nm_2tms){
		this.evlu_grp_nm_2tms = evlu_grp_nm_2tms;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public String getEvlu_grp_cd_2tms(){
		return this.evlu_grp_cd_2tms;
	}

	public String getEvlu_grp_nm_2tms(){
		return this.evlu_grp_nm_2tms;
	}

	public String getDb_status(){
		return this.db_status;
	}
}

/* 작성시간 : Thu Oct 15 11:50:19 KST 2009 */