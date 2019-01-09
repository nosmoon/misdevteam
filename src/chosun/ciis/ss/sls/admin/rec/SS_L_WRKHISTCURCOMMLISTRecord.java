/***************************************************************************************************
* 파일명 : SS_L_WRKHISTCURCOMMLISTRecord.java
* 기능 : 관리자-작업이력-목록을 위한 Record
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
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
 * 관리자-작업이력-목록을 위한 Record
 */


public class SS_L_WRKHISTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String id;
	public String execno;
	public String descri;
	public Timestamp workfrdt;
	public Timestamp worktodt;
	public String execocom;
	public String workremk1;
	public String work_pers;

	public SS_L_WRKHISTCURCOMMLISTRecord(){}

	public void setId(String id){
		this.id = id;
	}

	public void setExecno(String execno){
		this.execno = execno;
	}

	public void setDescri(String descri){
		this.descri = descri;
	}

	public void setWorkfrdt(Timestamp workfrdt){
		this.workfrdt = workfrdt;
	}

	public void setWorktodt(Timestamp worktodt){
		this.worktodt = worktodt;
	}

	public void setExecocom(String execocom){
		this.execocom = execocom;
	}

	public void setWorkremk1(String workremk1){
		this.workremk1 = workremk1;
	}

	public void setWork_pers(String work_pers){
		this.work_pers = work_pers;
	}

	public String getId(){
		return this.id;
	}

	public String getExecno(){
		return this.execno;
	}

	public String getDescri(){
		return this.descri;
	}

	public Timestamp getWorkfrdt(){
		return this.workfrdt;
	}

	public Timestamp getWorktodt(){
		return this.worktodt;
	}

	public String getExecocom(){
		return this.execocom;
	}

	public String getWorkremk1(){
		return this.workremk1;
	}

	public String getWork_pers(){
		return this.work_pers;
	}
}

/* 작성시간 : Tue Jul 06 14:29:54 KST 2004 */