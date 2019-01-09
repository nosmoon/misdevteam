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

public class HD_EVLU_1901_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_item_grad_cd;
	public String grad_clsi_scor;
	public String mean;
	public String db_status;

	public HD_EVLU_1901_LCURLISTRecord(){}

	public void setEvlu_item_grad_cd(String evlu_item_grad_cd){
		this.evlu_item_grad_cd = evlu_item_grad_cd;
	}

	public void setGrad_clsi_scor(String grad_clsi_scor){
		this.grad_clsi_scor = grad_clsi_scor;
	}

	public void setMean(String mean){
		this.mean = mean;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public String getEvlu_item_grad_cd(){
		return this.evlu_item_grad_cd;
	}

	public String getGrad_clsi_scor(){
		return this.grad_clsi_scor;
	}

	public String getMean(){
		return this.mean;
	}

	public String getDb_status(){
		return this.db_status;
	}
}

/* 작성시간 : Mon May 18 21:53:34 KST 2009 */