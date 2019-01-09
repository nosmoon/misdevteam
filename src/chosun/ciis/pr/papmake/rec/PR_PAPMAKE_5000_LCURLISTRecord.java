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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_5000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String base_make_servcost;
	public String base_make_servcost1;
	public String total;

	public PR_PAPMAKE_5000_LCURLISTRecord(){}

	public void setBase_make_servcost(String base_make_servcost){
		this.base_make_servcost = base_make_servcost;
	}

	public void setBase_make_servcost1(String base_make_servcost1){
		this.base_make_servcost1 = base_make_servcost1;
	}

	public void setTotal(String total){
		this.total = total;
	}

	public String getBase_make_servcost(){
		return this.base_make_servcost;
	}

	public String getBase_make_servcost1(){
		return this.base_make_servcost1;
	}

	public String getTotal(){
		return this.total;
	}
}

/* 작성시간 : Mon May 11 14:21:56 KST 2009 */