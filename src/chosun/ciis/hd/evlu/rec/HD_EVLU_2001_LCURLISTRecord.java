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

public class HD_EVLU_2001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String prz_pnsh_clsf_cd;
	public String dtls_clsf_cd;
	public String scor;
	public String db_status;

	public HD_EVLU_2001_LCURLISTRecord(){}

	public void setPrz_pnsh_clsf_cd(String prz_pnsh_clsf_cd){
		this.prz_pnsh_clsf_cd = prz_pnsh_clsf_cd;
	}

	public void setDtls_clsf_cd(String dtls_clsf_cd){
		this.dtls_clsf_cd = dtls_clsf_cd;
	}

	public void setScor(String scor){
		this.scor = scor;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public String getPrz_pnsh_clsf_cd(){
		return this.prz_pnsh_clsf_cd;
	}

	public String getDtls_clsf_cd(){
		return this.dtls_clsf_cd;
	}

	public String getScor(){
		return this.scor;
	}

	public String getDb_status(){
		return this.db_status;
	}
}

/* 작성시간 : Mon May 18 22:34:25 KST 2009 */