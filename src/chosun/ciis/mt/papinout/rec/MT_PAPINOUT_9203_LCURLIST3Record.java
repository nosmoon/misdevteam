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


public class MT_PAPINOUT_9203_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String matr_cd;

	public MT_PAPINOUT_9203_LCURLIST3Record(){}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}
}

/* 작성시간 : Wed May 20 08:58:24 KST 2009 */