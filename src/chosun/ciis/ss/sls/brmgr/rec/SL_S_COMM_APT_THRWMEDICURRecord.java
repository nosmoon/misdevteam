/***************************************************************************************************
 * 파일명   : SP_SL_S_COMM_APT_THRW.java
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

public class SL_S_COMM_APT_THRWMEDICURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medinm;
	public String qty;
	public String thrwrate;
	public String bgndlvtm;
	public String enddlvtm;
	public String dlvstatcd;
	public String leaffeednosh;

	public SL_S_COMM_APT_THRWMEDICURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setThrwrate(String thrwrate){
		this.thrwrate = thrwrate;
	}

	public void setBgndlvtm(String bgndlvtm){
		this.bgndlvtm = bgndlvtm;
	}

	public void setEnddlvtm(String enddlvtm){
		this.enddlvtm = enddlvtm;
	}

	public void setDlvstatcd(String dlvstatcd){
		this.dlvstatcd = dlvstatcd;
	}

	public void setLeaffeednosh(String leaffeednosh){
		this.leaffeednosh = leaffeednosh;
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

	public String getThrwrate(){
		return this.thrwrate;
	}

	public String getBgndlvtm(){
		return this.bgndlvtm;
	}

	public String getEnddlvtm(){
		return this.enddlvtm;
	}

	public String getDlvstatcd(){
		return this.dlvstatcd;
	}

	public String getLeaffeednosh(){
		return this.leaffeednosh;
	}
}

/* 작성시간 : Mon Mar 13 16:22:03 KST 2006 */