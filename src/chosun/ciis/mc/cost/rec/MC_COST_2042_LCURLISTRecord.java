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


public class MC_COST_2042_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String mang_cd_3;

	public MC_COST_2042_LCURLISTRecord(){}

	public void setMang_cd_3(String mang_cd_3){
		this.mang_cd_3 = mang_cd_3;
	}

	public String getMang_cd_3(){
		return this.mang_cd_3;
	}
}

/* 작성시간 : Tue May 12 09:54:07 KST 2009 */