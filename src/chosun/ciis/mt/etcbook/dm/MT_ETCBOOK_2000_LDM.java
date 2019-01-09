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


package chosun.ciis.mt.etcbook.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcbook.ds.*;
import chosun.ciis.mt.etcbook.rec.*;

/**
 * 
 */


public class MT_ETCBOOK_2000_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String book_cd;
	public String book_kind;
	public String book_seq;
	public String book_nm;

	public MT_ETCBOOK_2000_LDM(){}
	public MT_ETCBOOK_2000_LDM(String cmpy_cd, String book_cd, String book_kind, String book_seq, String book_nm){
		this.cmpy_cd = cmpy_cd;
		this.book_cd = book_cd;
		this.book_kind = book_kind;
		this.book_seq = book_seq;
		this.book_nm = book_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBook_cd(String book_cd){
		this.book_cd = book_cd;
	}

	public void setBook_kind(String book_kind){
		this.book_kind = book_kind;
	}

	public void setBook_seq(String book_seq){
		this.book_seq = book_seq;
	}

	public void setBook_nm(String book_nm){
		this.book_nm = book_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBook_cd(){
		return this.book_cd;
	}

	public String getBook_kind(){
		return this.book_kind;
	}

	public String getBook_seq(){
		return this.book_seq;
	}

	public String getBook_nm(){
		return this.book_nm;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCBOOK_2000_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCBOOK_2000_LDM dm = (MT_ETCBOOK_2000_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.book_cd);
		cstmt.setString(5, dm.book_kind);
		cstmt.setString(6, dm.book_seq);
		cstmt.setString(7, dm.book_nm);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcbook.ds.MT_ETCBOOK_2000_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("book_cd = [" + getBook_cd() + "]");
		System.out.println("book_kind = [" + getBook_kind() + "]");
		System.out.println("book_seq = [" + getBook_seq() + "]");
		System.out.println("book_nm = [" + getBook_nm() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String book_cd = req.getParameter("book_cd");
if( book_cd == null){
	System.out.println(this.toString+" : book_cd is null" );
}else{
	System.out.println(this.toString+" : book_cd is "+book_cd );
}
String book_kind = req.getParameter("book_kind");
if( book_kind == null){
	System.out.println(this.toString+" : book_kind is null" );
}else{
	System.out.println(this.toString+" : book_kind is "+book_kind );
}
String book_seq = req.getParameter("book_seq");
if( book_seq == null){
	System.out.println(this.toString+" : book_seq is null" );
}else{
	System.out.println(this.toString+" : book_seq is "+book_seq );
}
String book_nm = req.getParameter("book_nm");
if( book_nm == null){
	System.out.println(this.toString+" : book_nm is null" );
}else{
	System.out.println(this.toString+" : book_nm is "+book_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String book_cd = Util.checkString(req.getParameter("book_cd"));
String book_kind = Util.checkString(req.getParameter("book_kind"));
String book_seq = Util.checkString(req.getParameter("book_seq"));
String book_nm = Util.checkString(req.getParameter("book_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String book_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("book_cd")));
String book_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("book_kind")));
String book_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("book_seq")));
String book_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("book_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBook_cd(book_cd);
dm.setBook_kind(book_kind);
dm.setBook_seq(book_seq);
dm.setBook_nm(book_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 07 17:14:09 KST 2009 */