/***************************************************************************************************
* 파일명 : SS_MO_L_APTINPIVSTAPTINPIVSTCURRecord.java
* 기능 :  저장하기 위한 아파트투입률조회(아파트형태리스트 or 투입률등록리스트)_모바일용(ciis용)
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


public class SS_MO_L_APTINPIVSTAPTINPIVSTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dlvqty;
	public String dlvqty2;
	public String dlvqty3;
	public String apt_dong;
	public String apt_floor;
	public String apt_ho;
	public String bk_dongno;
	public String bk_addr_ho;

	public SS_MO_L_APTINPIVSTAPTINPIVSTCURRecord(){}

	public void setDlvqty(String dlvqty){
		this.dlvqty = dlvqty;
	}

	public void setDlvqty2(String dlvqty2){
		this.dlvqty2 = dlvqty2;
	}

	public void setDlvqty3(String dlvqty3){
		this.dlvqty3 = dlvqty3;
	}

	public void setApt_dong(String apt_dong){
		this.apt_dong = apt_dong;
	}

	public void setApt_floor(String apt_floor){
		this.apt_floor = apt_floor;
	}

	public void setApt_ho(String apt_ho){
		this.apt_ho = apt_ho;
	}

	public void setBk_dongno(String bk_dongno){
		this.bk_dongno = bk_dongno;
	}

	public void setBk_addr_ho(String bk_addr_ho){
		this.bk_addr_ho = bk_addr_ho;
	}

	public String getDlvqty(){
		return this.dlvqty;
	}

	public String getDlvqty2(){
		return this.dlvqty2;
	}

	public String getDlvqty3(){
		return this.dlvqty3;
	}

	public String getApt_dong(){
		return this.apt_dong;
	}

	public String getApt_floor(){
		return this.apt_floor;
	}

	public String getApt_ho(){
		return this.apt_ho;
	}

	public String getBk_dongno(){
		return this.bk_dongno;
	}

	public String getBk_addr_ho(){
		return this.bk_addr_ho;
	}
}

/* 작성시간 : Fri Jan 13 16:24:08 KST 2017 */