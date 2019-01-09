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


public class MT_PAPINOUT_5401_LCURLIST_FACRecord extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf_nm;

	public MT_PAPINOUT_5401_LCURLIST_FACRecord(){}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}
}

/* 작성시간 : Thu Aug 20 21:35:13 KST 2009 */