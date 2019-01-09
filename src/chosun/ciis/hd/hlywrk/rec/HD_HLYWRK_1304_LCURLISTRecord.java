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


package chosun.ciis.hd.hlywrk.rec;

import java.sql.*;
import chosun.ciis.hd.hlywrk.dm.*;
import chosun.ciis.hd.hlywrk.ds.*;

/**
 * 
 */


public class HD_HLYWRK_1304_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String base_alon;
	public String cmpn_alon;

	public HD_HLYWRK_1304_LCURLISTRecord(){}

	public void setBase_alon(String base_alon){
		this.base_alon = base_alon;
	}

	public void setCmpn_alon(String cmpn_alon){
		this.cmpn_alon = cmpn_alon;
	}

	public String getBase_alon(){
		return this.base_alon;
	}

	public String getCmpn_alon(){
		return this.cmpn_alon;
	}
}

/* 작성시간 : Thu May 07 18:54:09 KST 2015 */