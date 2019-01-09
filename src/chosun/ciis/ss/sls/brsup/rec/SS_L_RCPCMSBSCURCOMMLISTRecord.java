/***************************************************************************************************
* 파일명 : SS_L_RCPCMSBSCURCOMMLISTRecord.java
* 기능 : 지국지원-빌링-수납수수료-기준-목록
* 작성일자 : 2004-02-23
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국지원-빌링-수납수수료-기준-목록
 *
 */


public class SS_L_RCPCMSBSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String comscd;
	public String comsnm;
	public String clamtmthdcd;
	public String calcbasiclsf;
	public String coms;
	public String comsrate;
	public String remk;
	public String etc1;
	public String etc2;
	public String etc3;

	public SS_L_RCPCMSBSCURCOMMLISTRecord(){}

	public void setComscd(String comscd){
		this.comscd = comscd;
	}

	public void setComsnm(String comsnm){
		this.comsnm = comsnm;
	}

	public void setClamtmthdcd(String clamtmthdcd){
		this.clamtmthdcd = clamtmthdcd;
	}

	public void setCalcbasiclsf(String calcbasiclsf){
		this.calcbasiclsf = calcbasiclsf;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setComsrate(String comsrate){
		this.comsrate = comsrate;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setEtc1(String etc1){
		this.etc1 = etc1;
	}

	public void setEtc2(String etc2){
		this.etc2 = etc2;
	}

	public void setEtc3(String etc3){
		this.etc3 = etc3;
	}

	public String getComscd(){
		return this.comscd;
	}

	public String getComsnm(){
		return this.comsnm;
	}

	public String getClamtmthdcd(){
		return this.clamtmthdcd;
	}

	public String getCalcbasiclsf(){
		return this.calcbasiclsf;
	}

	public String getComs(){
		return this.coms;
	}

	public String getComsrate(){
		return this.comsrate;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getEtc1(){
		return this.etc1;
	}

	public String getEtc2(){
		return this.etc2;
	}

	public String getEtc3(){
		return this.etc3;
	}
}

/* 작성시간 : Wed Feb 25 10:45:34 KST 2004 */