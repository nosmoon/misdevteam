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


package chosun.ciis.co.mng.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.mng.ds.*;
import chosun.ciis.co.mng.rec.*;

/**
 * 
 */


public class CO_MNG_2000_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String user_id;
	public String page_id;

	public CO_MNG_2000_IDM(){}
	public CO_MNG_2000_IDM(String cmpy_cd, String user_id, String page_id){
		this.cmpy_cd = cmpy_cd;
		this.user_id = user_id;
		this.page_id = page_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setUser_id(String user_id){
		this.user_id = user_id;
	}

	public void setPage_id(String page_id){
		this.page_id = page_id;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getUser_id(){
		return this.user_id;
	}

	public String getPage_id(){
		return this.page_id;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_MNG_2000_I(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_MNG_2000_IDM dm = (CO_MNG_2000_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.user_id);
		cstmt.setString(5, dm.page_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.mng.ds.CO_MNG_2000_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("user_id = [" + getUser_id() + "]");
		System.out.println("page_id = [" + getPage_id() + "]");
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
String user_id = req.getParameter("user_id");
if( user_id == null){
	System.out.println(this.toString+" : user_id is null" );
}else{
	System.out.println(this.toString+" : user_id is "+user_id );
}
String page_id = req.getParameter("page_id");
if( page_id == null){
	System.out.println(this.toString+" : page_id is null" );
}else{
	System.out.println(this.toString+" : page_id is "+page_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String user_id = Util.checkString(req.getParameter("user_id"));
String page_id = Util.checkString(req.getParameter("page_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String user_id = Util.Uni2Ksc(Util.checkString(req.getParameter("user_id")));
String page_id = Util.Uni2Ksc(Util.checkString(req.getParameter("page_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setUser_id(user_id);
dm.setPage_id(page_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 01 19:17:57 KST 2018 */