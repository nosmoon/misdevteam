/***************************************************************************************************
* 파일명 : SE_BNS_1140_LCURLISTRecord.java
* 기능 : 판촉물관리 - 판촉물등록
* 작성일자 : 2009-03-16
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bns.rec;

import java.sql.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.ds.*;

/**
 * 
 */


public class SE_BNS_1140_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dscn_seq;
	public String qunt;
	public String dscn_uprc;
	public String remk;

	public SE_BNS_1140_LCURLISTRecord(){}

	public void setDscn_seq(String dscn_seq){
		this.dscn_seq = dscn_seq;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setDscn_uprc(String dscn_uprc){
		this.dscn_uprc = dscn_uprc;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getDscn_seq(){
		return this.dscn_seq;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getDscn_uprc(){
		return this.dscn_uprc;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Fri Mar 20 11:14:41 KST 2009 */