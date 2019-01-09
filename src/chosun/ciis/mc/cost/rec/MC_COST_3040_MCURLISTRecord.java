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


public class MC_COST_3040_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;

	public MC_COST_3040_MCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public String getYymm(){
		return this.yymm;
	}
}

/* 작성시간 : Wed May 06 15:08:25 KST 2009 */