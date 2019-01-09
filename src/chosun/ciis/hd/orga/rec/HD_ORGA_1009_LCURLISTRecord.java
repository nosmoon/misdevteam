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


package chosun.ciis.hd.orga.rec;

import java.sql.*;
import chosun.ciis.hd.orga.dm.*;
import chosun.ciis.hd.orga.ds.*;

/**
 * 
 */


public class HD_ORGA_1009_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String orga_reorga_dd;

	public HD_ORGA_1009_LCURLISTRecord(){}

	public void setOrga_reorga_dd(String orga_reorga_dd){
		this.orga_reorga_dd = orga_reorga_dd;
	}

	public String getOrga_reorga_dd(){
		return this.orga_reorga_dd;
	}
}

/* 작성시간 : Wed Jun 17 11:39:48 KST 2009 */