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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_2090_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cdnm;
	public String cd;

	public MC_BUDG_2090_MCURLISTRecord(){}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getCd(){
		return this.cd;
	}
}

/* 작성시간 : Sat Jul 11 10:54:09 KST 2009 */