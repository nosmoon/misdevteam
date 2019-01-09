/***************************************************************************************************
* 파일명 : SS_L_OTHQTYCURCOMMLISTRecord.java
* 기능 : 정보공유-타사발송부수-목록을 위한 Record
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.share.rec;

import java.sql.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * 정보공유-타사발송부수-목록을 위한 Record
 */


public class SS_L_OTHQTYCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String invsgdt;
	public String bonm;
	public String deptcd;
	public String deptnm;
	public String areacd;
	public String areanm;
	public int joong_qty;
	public int dong_qty;
	public int etc_qty;

	public SS_L_OTHQTYCURCOMMLISTRecord(){}

	public void setInvsgdt(String invsgdt){
		this.invsgdt = invsgdt;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setJoong_qty(int joong_qty){
		this.joong_qty = joong_qty;
	}

	public void setDong_qty(int dong_qty){
		this.dong_qty = dong_qty;
	}

	public void setEtc_qty(int etc_qty){
		this.etc_qty = etc_qty;
	}

	public String getInvsgdt(){
		return this.invsgdt;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public int getJoong_qty(){
		return this.joong_qty;
	}

	public int getDong_qty(){
		return this.dong_qty;
	}

	public int getEtc_qty(){
		return this.etc_qty;
	}
}

/* 작성시간 : Sat Jul 03 15:53:19 KST 2004 */