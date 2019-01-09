/***************************************************************************************************
* 파일명 : SL_MO_L_COMM_APT_THRWDM.java
* 기능 :  해당지국의아파트 주소목록을 조회_모바일용
* 작성일자 : 2017-01-13
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 아파트코드레코드에 동리스트 추가
* 수정자 : 장선희
* 수정일자 : 2017-01-16
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 *
 */


public class SL_MO_L_COMM_APT_THRWADDRCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String addrcd;
	public String addrnm;
	public String donglist;

	public SL_MO_L_COMM_APT_THRWADDRCDCURRecord(){}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setDonglist(String donglist){
		this.donglist = donglist;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getAddrnm(){
		return this.addrnm;
	}

	public String getDonglist(){
		return this.donglist;
	}
}

/* 작성시간 : Mon Jan 16 15:25:08 KST 2017 */