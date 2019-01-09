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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_2100_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String descri;

	public MT_PAPINOUT_2100_LCURLIST3Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setDescri(String descri){
		this.descri = descri;
	}

	public String getCd(){
		return this.cd;
	}

	public String getDescri(){
		return this.descri;
	}
}

/* 작성시간 : Mon Jun 22 19:00:22 KST 2009 */