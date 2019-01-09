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


public class MC_BUDG_6303_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String hdqt_aply_rate;
	public String lcl_aply_rate;

	public MC_BUDG_6303_LCURLIST2Record(){}

	public void setHdqt_aply_rate(String hdqt_aply_rate){
		this.hdqt_aply_rate = hdqt_aply_rate;
	}

	public void setLcl_aply_rate(String lcl_aply_rate){
		this.lcl_aply_rate = lcl_aply_rate;
	}

	public String getHdqt_aply_rate(){
		return this.hdqt_aply_rate;
	}

	public String getLcl_aply_rate(){
		return this.lcl_aply_rate;
	}
}

/* 작성시간 : Fri May 22 13:40:29 KST 2009 */