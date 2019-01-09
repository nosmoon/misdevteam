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


package chosun.ciis.mt.etcbook.rec;

import java.sql.*;
import chosun.ciis.mt.etcbook.dm.*;
import chosun.ciis.mt.etcbook.ds.*;

/**
 * 
 */


public class MT_ETCBOOK_2002_ACURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String book_cd;

	public MT_ETCBOOK_2002_ACURLIST1Record(){}

	public void setBook_cd(String book_cd){
		this.book_cd = book_cd;
	}

	public String getBook_cd(){
		return this.book_cd;
	}
}

/* 작성시간 : Tue Apr 07 19:55:15 KST 2009 */