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


public class MC_COST_2017_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sub_cd;

	public MC_COST_2017_LCURLISTRecord(){}

	public void setSub_cd(String sub_cd){
		this.sub_cd = sub_cd;
	}

	public String getSub_cd(){
		return this.sub_cd;
	}
}

/* 작성시간 : Thu Jul 16 13:49:15 KST 2009 */