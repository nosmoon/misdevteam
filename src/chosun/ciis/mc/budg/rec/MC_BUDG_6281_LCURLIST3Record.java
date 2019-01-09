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


public class MC_BUDG_6281_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String float_cost;

	public MC_BUDG_6281_LCURLIST3Record(){}

	public void setFloat_cost(String float_cost){
		this.float_cost = float_cost;
	}

	public String getFloat_cost(){
		return this.float_cost;
	}
}

/* 작성시간 : Sat May 23 17:08:27 KST 2009 */