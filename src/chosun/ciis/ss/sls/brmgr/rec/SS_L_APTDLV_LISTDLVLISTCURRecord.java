/***************************************************************************************************
* 파일명 : SS_L_APTDLV_LISTDLVLISTCURRecord.java
* 기능 :  해당지국의아파트 배달카드 조회_모바일용(ciis용)
* 작성일자 : 2017-01-13
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 *
 */


public class SS_L_APTDLV_LISTDLVLISTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dlvqty;
	public String dlvqty2;
	public String dlvdong;
	public String dlvser_no;
	public String dongno;
	public String rdrmisuyn;

	public SS_L_APTDLV_LISTDLVLISTCURRecord(){}

	public void setDlvqty(String dlvqty){
		this.dlvqty = dlvqty;
	}

	public void setDlvqty2(String dlvqty2){
		this.dlvqty2 = dlvqty2;
	}

	public void setDlvdong(String dlvdong){
		this.dlvdong = dlvdong;
	}

	public void setDlvser_no(String dlvser_no){
		this.dlvser_no = dlvser_no;
	}

	public void setDongno(String dongno){
		this.dongno = dongno;
	}

	public void setRdrmisuyn(String rdrmisuyn){
		this.rdrmisuyn = rdrmisuyn;
	}

	public String getDlvqty(){
		return this.dlvqty;
	}

	public String getDlvqty2(){
		return this.dlvqty2;
	}

	public String getDlvdong(){
		return this.dlvdong;
	}

	public String getDlvser_no(){
		return this.dlvser_no;
	}

	public String getDongno(){
		return this.dongno;
	}

	public String getRdrmisuyn(){
		return this.rdrmisuyn;
	}
}

/* 작성시간 : Fri Jan 13 15:30:46 KST 2017 */