/***************************************************************************************************
* 파일명 : SP_CO_L_RDRCRTS_GRAD_APLC.java
* 기능 :  독자-독자인증요청 조회
* 작성일자 : 2004-05-17
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 :   
* 수정일자 : 
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 독자-독자인증요청 조회
 */

public class FC_FUNC_1160_LMMDHONNOTEBALRecord extends java.lang.Object implements java.io.Serializable{

	public String basiyymm;
	public String occrcnt;
	public String occramt;
	public String extnccnt;
	public String extncamt;
	public String bddbcnt;
	public String bddbamt;
	public String balcnt;
	public String balamt;

	public FC_FUNC_1160_LMMDHONNOTEBALRecord(){}

	public void setBasiyymm(String basiyymm){
		this.basiyymm = basiyymm;
	}

	public void setOccrcnt(String occrcnt){
		this.occrcnt = occrcnt;
	}

	public void setOccramt(String occramt){
		this.occramt = occramt;
	}

	public void setExtnccnt(String extnccnt){
		this.extnccnt = extnccnt;
	}

	public void setExtncamt(String extncamt){
		this.extncamt = extncamt;
	}

	public void setBddbcnt(String bddbcnt){
		this.bddbcnt = bddbcnt;
	}

	public void setBddbamt(String bddbamt){
		this.bddbamt = bddbamt;
	}

	public void setBalcnt(String balcnt){
		this.balcnt = balcnt;
	}

	public void setBalamt(String balamt){
		this.balamt = balamt;
	}

	public String getBasiyymm(){
		return this.basiyymm;
	}

	public String getOccrcnt(){
		return this.occrcnt;
	}

	public String getOccramt(){
		return this.occramt;
	}

	public String getExtnccnt(){
		return this.extnccnt;
	}

	public String getExtncamt(){
		return this.extncamt;
	}

	public String getBddbcnt(){
		return this.bddbcnt;
	}

	public String getBddbamt(){
		return this.bddbamt;
	}

	public String getBalcnt(){
		return this.balcnt;
	}

	public String getBalamt(){
		return this.balamt;
	}
}

/* 작성시간 : Thu Feb 05 11:36:23 KST 2009 */