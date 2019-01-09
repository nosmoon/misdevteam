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

public class HD_EVLU_3700_MCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String evlu_grad_cd;
	public String evlu_grad_nm;

	public HD_EVLU_3700_MCURLIST3Record(){}

	public void setEvlu_grad_cd(String evlu_grad_cd){
		this.evlu_grad_cd = evlu_grad_cd;
	}

	public void setEvlu_grad_nm(String evlu_grad_nm){
		this.evlu_grad_nm = evlu_grad_nm;
	}

	public String getEvlu_grad_cd(){
		return this.evlu_grad_cd;
	}

	public String getEvlu_grad_nm(){
		return this.evlu_grad_nm;
	}
}

/* 작성시간 : Thu Sep 24 16:46:17 KST 2009 */