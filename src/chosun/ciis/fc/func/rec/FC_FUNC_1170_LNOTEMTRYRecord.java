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

public class FC_FUNC_1170_LNOTEMTRYRecord extends java.lang.Object implements java.io.Serializable{

	public String mtry_dt;
	public String note_amtsum;

	public FC_FUNC_1170_LNOTEMTRYRecord(){}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setNote_amtsum(String note_amtsum){
		this.note_amtsum = note_amtsum;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getNote_amtsum(){
		return this.note_amtsum;
	}
}

/* 작성시간 : Thu Feb 05 14:42:56 KST 2009 */