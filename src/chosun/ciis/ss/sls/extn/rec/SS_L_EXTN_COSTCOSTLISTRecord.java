/***************************************************************************************************
* 파일명 : .java
* 기능 : 사원확장비관리 조회
* 작성일자 : 2009-05-29
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 사원확장비관리 조회
 */

public class SS_L_EXTN_COSTCOSTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medinm;
	public String rdr_extnbgndd;
	public String rdr_extnto_dd;
	public String rdr_extncampnm;
	public String rdr_extncost;
	public String remk;

	public SS_L_EXTN_COSTCOSTLISTRecord(){}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setRdr_extnbgndd(String rdr_extnbgndd){
		this.rdr_extnbgndd = rdr_extnbgndd;
	}

	public void setRdr_extnto_dd(String rdr_extnto_dd){
		this.rdr_extnto_dd = rdr_extnto_dd;
	}

	public void setRdr_extncampnm(String rdr_extncampnm){
		this.rdr_extncampnm = rdr_extncampnm;
	}

	public void setRdr_extncost(String rdr_extncost){
		this.rdr_extncost = rdr_extncost;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getRdr_extnbgndd(){
		return this.rdr_extnbgndd;
	}

	public String getRdr_extnto_dd(){
		return this.rdr_extnto_dd;
	}

	public String getRdr_extncampnm(){
		return this.rdr_extncampnm;
	}

	public String getRdr_extncost(){
		return this.rdr_extncost;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Fri May 29 17:54:22 KST 2009 */