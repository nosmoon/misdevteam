/***************************************************************************************************
* 파일명 : SS_L_INSRCURCOMMLISTRecord.java
* 기능 : 지국지원-상해보험-목록을 위한 Record
* 작성일자 : 2004-02-10
* 작성자 : 김대섭
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
 * 지국지원-상해보험-목록 위한 Record
 */

public class SS_L_INSRCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cntryy;
	public String insrnm;
	public String insrcmpynm;
	public String aplcfrdt;
	public String aplctodt;

	public SS_L_INSRCURCOMMLISTRecord(){}

	public void setCntryy(String cntryy){
		this.cntryy = cntryy;
	}

	public void setInsrnm(String insrnm){
		this.insrnm = insrnm;
	}

	public void setInsrcmpynm(String insrcmpynm){
		this.insrcmpynm = insrcmpynm;
	}

	public void setAplcfrdt(String aplcfrdt){
		this.aplcfrdt = aplcfrdt;
	}

	public void setAplctodt(String aplctodt){
		this.aplctodt = aplctodt;
	}

	public String getCntryy(){
		return this.cntryy;
	}

	public String getInsrnm(){
		return this.insrnm;
	}

	public String getInsrcmpynm(){
		return this.insrcmpynm;
	}

	public String getAplcfrdt(){
		return this.aplcfrdt;
	}

	public String getAplctodt(){
		return this.aplctodt;
	}
}

/* 작성시간 : Mon Feb 16 13:13:33 KST 2004 */