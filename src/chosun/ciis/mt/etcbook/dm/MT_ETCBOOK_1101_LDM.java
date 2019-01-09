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


public class MT_ETCBOOK_1101_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String book_cd;
	public String book_nm;
	public String cmpy_cd;

	public MT_ETCBOOK_1101_LDM(){}
	public MT_ETCBOOK_1101_LDM(String book_cd, String book_nm, String cmpy_cd){
		this.book_cd = book_cd;
		this.book_nm = book_nm;
		this.cmpy_cd = cmpy_cd;
	}

	public void setBook_cd(String book_cd){
		this.book_cd = book_cd;
	}

	public void setBook_nm(String book_nm){
		this.book_nm = book_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getBook_cd(){
		return this.book_cd;
	}

	public String getBook_nm(){
		return this.book_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCBOOK_1101_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCBOOK_1101_LDM dm = (MT_ETCBOOK_1101_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.book_cd);
		cstmt.setString(4, dm.book_nm);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcbook.ds.MT_ETCBOOK_1101_LDataSet();
	}



    public void print(){
        System.out.println("book_cd = " + getBook_cd());
        System.out.println("book_nm = " + getBook_nm());
        System.out.println("cmpy_cd = " + getCmpy_cd());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String book_cd = req.getParameter("book_cd");
if( book_cd == null){
	System.out.println(this.toString+" : book_cd is null" );
}else{
	System.out.println(this.toString+" : book_cd is "+book_cd );
}
String book_nm = req.getParameter("book_nm");
if( book_nm == null){
	System.out.println(this.toString+" : book_nm is null" );
}else{
	System.out.println(this.toString+" : book_nm is "+book_nm );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String book_cd = Util.checkString(req.getParameter("book_cd"));
String book_nm = Util.checkString(req.getParameter("book_nm"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String book_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("book_cd")));
String book_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("book_nm")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBook_cd(book_cd);
dm.setBook_nm(book_nm);
dm.setCmpy_cd(cmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 10 15:09:49 KST 2009 */