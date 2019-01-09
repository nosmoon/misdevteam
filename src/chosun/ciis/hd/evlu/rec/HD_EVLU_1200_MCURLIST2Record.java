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

public class HD_EVLU_1200_MCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String evlu_grp_cd_2tms;
	public String evlu_grp_nm_2tms;

	public HD_EVLU_1200_MCURLIST2Record(){}

	public void setEvlu_grp_cd_2tms(String evlu_grp_cd_2tms){
		this.evlu_grp_cd_2tms = evlu_grp_cd_2tms;
	}

	public void setEvlu_grp_nm_2tms(String evlu_grp_nm_2tms){
		this.evlu_grp_nm_2tms = evlu_grp_nm_2tms;
	}

	public String getEvlu_grp_cd_2tms(){
		return this.evlu_grp_cd_2tms;
	}

	public String getEvlu_grp_nm_2tms(){
		return this.evlu_grp_nm_2tms;
	}
}

/* 작성시간 : Thu Oct 15 14:45:41 KST 2009 */