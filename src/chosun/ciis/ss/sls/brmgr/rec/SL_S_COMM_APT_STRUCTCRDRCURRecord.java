/***************************************************************************************************
 * 파일명   : SP_SL_S_COMM_APT_STRUCT.java
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

public class SL_S_COMM_APT_STRUCTCRDRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dlvdong;
	public String dlvser_no;

	public SL_S_COMM_APT_STRUCTCRDRCURRecord(){}

	public void setDlvdong(String dlvdong){
		this.dlvdong = dlvdong;
	}

	public void setDlvser_no(String dlvser_no){
		this.dlvser_no = dlvser_no;
	}

	public String getDlvdong(){
		return this.dlvdong;
	}

	public String getDlvser_no(){
		return this.dlvser_no;
	}
}

/* 작성시간 : Mon Mar 13 17:11:10 KST 2006 */