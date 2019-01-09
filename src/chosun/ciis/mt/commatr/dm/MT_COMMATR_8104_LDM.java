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


package chosun.ciis.mt.commatr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_8104_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String search_mm_fr;
	public String search_mm_to;
	public String list_gbn;

	public MT_COMMATR_8104_LDM(){}
	public MT_COMMATR_8104_LDM(String cmpy_cd, String search_mm_fr, String search_mm_to, String list_gbn){
		this.cmpy_cd = cmpy_cd;
		this.search_mm_fr = search_mm_fr;
		this.search_mm_to = search_mm_to;
		this.list_gbn = list_gbn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSearch_mm_fr(String search_mm_fr){
		this.search_mm_fr = search_mm_fr;
	}

	public void setSearch_mm_to(String search_mm_to){
		this.search_mm_to = search_mm_to;
	}

	public void setList_gbn(String list_gbn){
		this.list_gbn = list_gbn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSearch_mm_fr(){
		return this.search_mm_fr;
	}

	public String getSearch_mm_to(){
		return this.search_mm_to;
	}

	public String getList_gbn(){
		return this.list_gbn;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_8104_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_8104_LDM dm = (MT_COMMATR_8104_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.search_mm_fr);
		cstmt.setString(5, dm.search_mm_to);
		cstmt.setString(6, dm.list_gbn);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_8104_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("search_mm_fr = [" + getSearch_mm_fr() + "]");
		System.out.println("search_mm_to = [" + getSearch_mm_to() + "]");
		System.out.println("list_gbn = [" + getList_gbn() + "]");
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
String search_mm_fr = req.getParameter("search_mm_fr");
if( search_mm_fr == null){
	System.out.println(this.toString+" : search_mm_fr is null" );
}else{
	System.out.println(this.toString+" : search_mm_fr is "+search_mm_fr );
}
String search_mm_to = req.getParameter("search_mm_to");
if( search_mm_to == null){
	System.out.println(this.toString+" : search_mm_to is null" );
}else{
	System.out.println(this.toString+" : search_mm_to is "+search_mm_to );
}
String list_gbn = req.getParameter("list_gbn");
if( list_gbn == null){
	System.out.println(this.toString+" : list_gbn is null" );
}else{
	System.out.println(this.toString+" : list_gbn is "+list_gbn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String search_mm_fr = Util.checkString(req.getParameter("search_mm_fr"));
String search_mm_to = Util.checkString(req.getParameter("search_mm_to"));
String list_gbn = Util.checkString(req.getParameter("list_gbn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String search_mm_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("search_mm_fr")));
String search_mm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("search_mm_to")));
String list_gbn = Util.Uni2Ksc(Util.checkString(req.getParameter("list_gbn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSearch_mm_fr(search_mm_fr);
dm.setSearch_mm_to(search_mm_to);
dm.setList_gbn(list_gbn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 28 16:21:29 KST 2013 */