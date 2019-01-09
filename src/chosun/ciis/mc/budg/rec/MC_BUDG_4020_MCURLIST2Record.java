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


public class MC_BUDG_4020_MCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String hsty_no;

	public MC_BUDG_4020_MCURLIST2Record(){}

	public void setHsty_no(String hsty_no){
		this.hsty_no = hsty_no;
	}

	public String getHsty_no(){
		return this.hsty_no;
	}
}

/* 작성시간 : Thu May 21 19:56:53 KST 2009 */