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


public class MC_BUDG_6140_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String non_dduc_rate;

	public MC_BUDG_6140_MCURLISTRecord(){}

	public void setNon_dduc_rate(String non_dduc_rate){
		this.non_dduc_rate = non_dduc_rate;
	}

	public String getNon_dduc_rate(){
		return this.non_dduc_rate;
	}
}

/* 작성시간 : Thu Aug 13 21:34:02 KST 2009 */