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

public class HD_EVLU_1701_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String grad_cd;
	public String divn_ratio;
	public String remk;
	public String db_status;

	public HD_EVLU_1701_LCURLISTRecord(){}

	public void setGrad_cd(String grad_cd){
		this.grad_cd = grad_cd;
	}

	public void setDivn_ratio(String divn_ratio){
		this.divn_ratio = divn_ratio;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public String getGrad_cd(){
		return this.grad_cd;
	}

	public String getDivn_ratio(){
		return this.divn_ratio;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDb_status(){
		return this.db_status;
	}
}

/* 작성시간 : Mon May 18 17:34:24 KST 2009 */