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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_4050_MCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String max_ymcym;

	public MC_BUDG_4050_MCURLIST3Record(){}

	public void setMax_ymcym(String max_ymcym){
		this.max_ymcym = max_ymcym;
	}

	public String getMax_ymcym(){
		return this.max_ymcym;
	}
}

/* 작성시간 : Tue Jun 02 09:43:29 KST 2009 */