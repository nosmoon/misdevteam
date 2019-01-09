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

public class HD_EVLU_2900_MCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String evlu_stat_cd;
	public String evlu_stat_nm;

	public HD_EVLU_2900_MCURLIST1Record(){}

	public void setEvlu_stat_cd(String evlu_stat_cd){
		this.evlu_stat_cd = evlu_stat_cd;
	}

	public void setEvlu_stat_nm(String evlu_stat_nm){
		this.evlu_stat_nm = evlu_stat_nm;
	}

	public String getEvlu_stat_cd(){
		return this.evlu_stat_cd;
	}

	public String getEvlu_stat_nm(){
		return this.evlu_stat_nm;
	}
}

/* 작성시간 : Mon May 11 11:11:21 KST 2009 */