/***************************************************************************************************
* 파일명 : .java
* 기능 : 관리자-지국월마감-상세
* 작성일자 : 2005-02-02
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 관리자-지국월마감-상세
 */


public class SS_S_BOCLOSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String closyn;
	public String closfrdt;
	public String clostodt;
	public String clos_dt;
	public String remk;

	public SS_S_BOCLOSCURCOMMLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public void setClosfrdt(String closfrdt){
		this.closfrdt = closfrdt;
	}

	public void setClostodt(String clostodt){
		this.clostodt = clostodt;
	}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public String getClosfrdt(){
		return this.closfrdt;
	}

	public String getClostodt(){
		return this.clostodt;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Wed Feb 02 11:54:15 KST 2005 */