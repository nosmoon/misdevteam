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


package chosun.ciis.mt.papord.rec;

import java.sql.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

/**
 * 
 */


public class MT_PAPORD_5005_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String papcmpy_cd;
	public String papcmpy_ratio;

	public MT_PAPORD_5005_LCURLIST2Record(){}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setPapcmpy_ratio(String papcmpy_ratio){
		this.papcmpy_ratio = papcmpy_ratio;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getPapcmpy_ratio(){
		return this.papcmpy_ratio;
	}
}

/* 작성시간 : Fri Jul 17 11:52:14 KST 2009 */