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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_3010_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cont;

	public HD_INFO_3010_SCURLISTRecord(){}

	public void setCont(String cont){
		this.cont = cont;
	}

	public String getCont(){
		return this.cont;
	}
}

/* 작성시간 : Tue Aug 25 21:34:23 KST 2009 */