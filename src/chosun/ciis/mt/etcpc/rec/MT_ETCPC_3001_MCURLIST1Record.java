/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.etcpc.rec;

import java.sql.*;
import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.ds.*;

/**
 * 
 */


public class MT_ETCPC_3001_MCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String swmang_no;
	public String swnm;
	public String swver;
	public String cdnm;

	public MT_ETCPC_3001_MCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSwmang_no(String swmang_no){
		this.swmang_no = swmang_no;
	}

	public void setSwnm(String swnm){
		this.swnm = swnm;
	}

	public void setSwver(String swver){
		this.swver = swver;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSwmang_no(){
		return this.swmang_no;
	}

	public String getSwnm(){
		return this.swnm;
	}

	public String getSwver(){
		return this.swver;
	}

	public String getCdnm(){
		return this.cdnm;
	}
}

/* 작성시간 : Thu Mar 26 11:20:57 KST 2009 */