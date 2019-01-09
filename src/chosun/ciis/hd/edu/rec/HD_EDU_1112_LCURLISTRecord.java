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


package chosun.ciis.hd.edu.rec;

import java.sql.*;

import chosun.ciis.hd.edu.dm.*;
import chosun.ciis.hd.edu.ds.*;

/**
 * 
 */


public class HD_EDU_1112_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cont;

	public HD_EDU_1112_LCURLISTRecord(){}

	public void setCont(String cont){
		this.cont = cont;
	}

	public String getCont(){
		return this.cont;
	}
}

/* 작성시간 : Tue Aug 25 18:40:26 KST 2009 */