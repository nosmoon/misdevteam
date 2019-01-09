/***************************************************************************************************
* 파일명 : SL_MO_L_COMM_APT_THRWTHRWLISTCURRecord.java
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


public class SL_MO_L_COMM_APT_THRWTHRWLISTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String invsgdt;
	public String invsgno;
	public String invsghhmm;
	public String addrnm;
	public String invsgpers;
	public String addrcd;
	public String dongno;
	public String regdt;

	public SL_MO_L_COMM_APT_THRWTHRWLISTCURRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setInvsgdt(String invsgdt){
		this.invsgdt = invsgdt;
	}

	public void setInvsgno(String invsgno){
		this.invsgno = invsgno;
	}

	public void setInvsghhmm(String invsghhmm){
		this.invsghhmm = invsghhmm;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setInvsgpers(String invsgpers){
		this.invsgpers = invsgpers;
	}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setDongno(String dongno){
		this.dongno = dongno;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getInvsgdt(){
		return this.invsgdt;
	}

	public String getInvsgno(){
		return this.invsgno;
	}

	public String getInvsghhmm(){
		return this.invsghhmm;
	}

	public String getAddrnm(){
		return this.addrnm;
	}

	public String getInvsgpers(){
		return this.invsgpers;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getDongno(){
		return this.dongno;
	}

	public String getRegdt(){
		return this.regdt;
	}
}

/* 작성시간 : Mon Jan 16 15:25:08 KST 2017 */