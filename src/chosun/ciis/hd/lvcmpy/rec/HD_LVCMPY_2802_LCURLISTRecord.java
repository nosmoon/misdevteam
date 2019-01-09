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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_2802_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String search_tm;

	public HD_LVCMPY_2802_LCURLISTRecord(){}

	public void setSearch_tm(String search_tm){
		this.search_tm = search_tm;
	}

	public String getSearch_tm(){
		return this.search_tm;
	}
}

/* 작성시간 : Thu May 21 17:28:29 KST 2009 */