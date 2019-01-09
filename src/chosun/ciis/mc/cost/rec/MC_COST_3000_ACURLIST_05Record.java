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


public class MC_COST_3000_ACURLIST_05Record extends java.lang.Object implements java.io.Serializable{

	public String ndstb_cd;

	public MC_COST_3000_ACURLIST_05Record(){}

	public void setNdstb_cd(String ndstb_cd){
		this.ndstb_cd = ndstb_cd;
	}

	public String getNdstb_cd(){
		return this.ndstb_cd;
	}
}

/* 작성시간 : Wed May 20 12:54:27 KST 2009 */