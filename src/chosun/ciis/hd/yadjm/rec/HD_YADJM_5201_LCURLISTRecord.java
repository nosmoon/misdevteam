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


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_5201_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tmp1;
	public String tmp2;

	public HD_YADJM_5201_LCURLISTRecord(){}

	public void setTmp1(String tmp1){
		this.tmp1 = tmp1;
	}

	public void setTmp2(String tmp2){
		this.tmp2 = tmp2;
	}

	public String getTmp1(){
		return this.tmp1;
	}

	public String getTmp2(){
		return this.tmp2;
	}
}

/* 작성시간 : Fri Jan 22 16:03:01 KST 2010 */