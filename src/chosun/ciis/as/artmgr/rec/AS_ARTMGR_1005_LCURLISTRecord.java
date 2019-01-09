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


package chosun.ciis.as.artmgr.rec;

import java.sql.*;
import chosun.ciis.as.artmgr.dm.*;
import chosun.ciis.as.artmgr.ds.*;

/**
 * 
 */


public class AS_ARTMGR_1005_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String art_prod_no;

	public AS_ARTMGR_1005_LCURLISTRecord(){}

	public void setArt_prod_no(String art_prod_no){
		this.art_prod_no = art_prod_no;
	}

	public String getArt_prod_no(){
		return this.art_prod_no;
	}
}

/* 작성시간 : Mon Mar 23 19:06:46 KST 2009 */