/***************************************************************************************************
 * 파일명   : SP_SL_A_COMM_APT_THRW.java
 * 기능     : 투입율조사
 * 작성일자 : 2006/03/08
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  투입율조사-현황등록
**/

public class SL_A_COMM_APT_THRWMEDICURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medinm;
	public String qty;
	public String qtyratio;

	public SL_A_COMM_APT_THRWMEDICURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setQtyratio(String qtyratio){
		this.qtyratio = qtyratio;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getQty(){
		return this.qty;
	}

	public String getQtyratio(){
		return this.qtyratio;
	}
}

/* 작성시간 : Fri Mar 10 10:05:43 KST 2006 */