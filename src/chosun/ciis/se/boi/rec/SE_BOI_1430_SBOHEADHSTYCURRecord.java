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


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_1430_SBOHEADHSTYCURRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String hsty_matt;

	public SE_BOI_1430_SBOHEADHSTYCURRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setHsty_matt(String hsty_matt){
		this.hsty_matt = hsty_matt;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getHsty_matt(){
		return this.hsty_matt;
	}
}

/* 작성시간 : Wed Feb 04 21:28:13 KST 2009 */