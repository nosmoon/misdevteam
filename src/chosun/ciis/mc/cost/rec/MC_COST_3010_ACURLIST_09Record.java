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


package chosun.ciis.mc.cost.rec;

import java.sql.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.ds.*;

/**
 * 
 */


public class MC_COST_3010_ACURLIST_09Record extends java.lang.Object implements java.io.Serializable{

	public String excp_dstb_cd;

	public MC_COST_3010_ACURLIST_09Record(){}

	public void setExcp_dstb_cd(String excp_dstb_cd){
		this.excp_dstb_cd = excp_dstb_cd;
	}

	public String getExcp_dstb_cd(){
		return this.excp_dstb_cd;
	}
}

/* 작성시간 : Mon May 11 14:20:32 KST 2009 */