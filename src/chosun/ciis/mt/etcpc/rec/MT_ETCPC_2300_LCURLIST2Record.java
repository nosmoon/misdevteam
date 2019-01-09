/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.etcpc.rec;

import java.sql.*;
import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.ds.*;

/**
 * 
 */


public class MT_ETCPC_2300_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String swver;
	public String scnt;
	public String swlics_cnt;
	public String swclsf;

	public MT_ETCPC_2300_LCURLIST2Record(){}

	public void setSwver(String swver){
		this.swver = swver;
	}

	public void setScnt(String scnt){
		this.scnt = scnt;
	}

	public void setSwlics_cnt(String swlics_cnt){
		this.swlics_cnt = swlics_cnt;
	}

	public void setSwclsf(String swclsf){
		this.swclsf = swclsf;
	}

	public String getSwver(){
		return this.swver;
	}

	public String getScnt(){
		return this.scnt;
	}

	public String getSwlics_cnt(){
		return this.swlics_cnt;
	}

	public String getSwclsf(){
		return this.swclsf;
	}
}

/* 작성시간 : Tue Jul 07 11:20:32 KST 2009 */