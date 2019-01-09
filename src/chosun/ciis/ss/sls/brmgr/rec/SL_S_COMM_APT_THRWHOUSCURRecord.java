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

public class SL_S_COMM_APT_THRWHOUSCURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicdnm;
	public String flor;
	public String hous;

	public SL_S_COMM_APT_THRWHOUSCURRecord(){}

	public void setMedicdnm(String medicdnm){
		this.medicdnm = medicdnm;
	}

	public void setFlor(String flor){
		this.flor = flor;
	}

	public void setHous(String hous){
		this.hous = hous;
	}

	public String getMedicdnm(){
		return this.medicdnm;
	}

	public String getFlor(){
		return this.flor;
	}

	public String getHous(){
		return this.hous;
	}
}

/* 작성시간 : Mon Mar 13 16:22:03 KST 2006 */