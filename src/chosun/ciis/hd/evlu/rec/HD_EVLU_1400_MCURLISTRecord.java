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

public class HD_EVLU_1400_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_lcls_grp_cd;
	public String evlu_lcls_grp_nm;

	public HD_EVLU_1400_MCURLISTRecord(){}

	public void setEvlu_lcls_grp_cd(String evlu_lcls_grp_cd){
		this.evlu_lcls_grp_cd = evlu_lcls_grp_cd;
	}

	public void setEvlu_lcls_grp_nm(String evlu_lcls_grp_nm){
		this.evlu_lcls_grp_nm = evlu_lcls_grp_nm;
	}

	public String getEvlu_lcls_grp_cd(){
		return this.evlu_lcls_grp_cd;
	}

	public String getEvlu_lcls_grp_nm(){
		return this.evlu_lcls_grp_nm;
	}
}

/* 작성시간 : Fri May 15 15:59:59 KST 2009 */