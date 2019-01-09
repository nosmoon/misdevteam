/***************************************************************************************************
* 파일명 : .java
* 기능 : 공통 - 세금계산서 사용자 삭제
* 작성일자 : 2011-05-16
* 작성자 : 전병희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.smtb.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.smtb.ds.*;
import chosun.ciis.co.smtb.rec.*;

/**
 * 공통 - 세금계산서 사용자 삭제
 */


public class CO_SMTB_1074_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String fnd_user;
	public String fnd_regno;

	public CO_SMTB_1074_DDM(){}
	public CO_SMTB_1074_DDM(String fnd_user, String fnd_regno, String fnd_user_name, String smart_id, String smart_password, String smart_email){
		this.fnd_user = fnd_user;
		this.fnd_regno = fnd_regno;
	}

	public void setFnd_user(String fnd_user){
		this.fnd_user = fnd_user;
	}

	public void setFnd_regno(String fnd_regno){
		this.fnd_regno = fnd_regno;
	}

	public String getFnd_user(){
		return this.fnd_user;
	}

	public String getFnd_regno(){
		return this.fnd_regno;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_SMTB_1074_D(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_SMTB_1074_DDM dm = (CO_SMTB_1074_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.fnd_user);
		cstmt.setString(4, dm.fnd_regno);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.smtb.ds.CO_SMTB_1074_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("fnd_user = [" + getFnd_user() + "]");
		System.out.println("fnd_regno = [" + getFnd_regno() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String fnd_user = req.getParameter("fnd_user");
if( fnd_user == null){
	System.out.println(this.toString+" : fnd_user is null" );
}else{
	System.out.println(this.toString+" : fnd_user is "+fnd_user );
}
String fnd_regno = req.getParameter("fnd_regno");
if( fnd_regno == null){
	System.out.println(this.toString+" : fnd_regno is null" );
}else{
	System.out.println(this.toString+" : fnd_regno is "+fnd_regno );
}
String fnd_user_name = req.getParameter("fnd_user_name");
if( fnd_user_name == null){
	System.out.println(this.toString+" : fnd_user_name is null" );
}else{
	System.out.println(this.toString+" : fnd_user_name is "+fnd_user_name );
}
String smart_id = req.getParameter("smart_id");
if( smart_id == null){
	System.out.println(this.toString+" : smart_id is null" );
}else{
	System.out.println(this.toString+" : smart_id is "+smart_id );
}
String smart_password = req.getParameter("smart_password");
if( smart_password == null){
	System.out.println(this.toString+" : smart_password is null" );
}else{
	System.out.println(this.toString+" : smart_password is "+smart_password );
}
String smart_email = req.getParameter("smart_email");
if( smart_email == null){
	System.out.println(this.toString+" : smart_email is null" );
}else{
	System.out.println(this.toString+" : smart_email is "+smart_email );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String fnd_user = Util.checkString(req.getParameter("fnd_user"));
String fnd_regno = Util.checkString(req.getParameter("fnd_regno"));
String fnd_user_name = Util.checkString(req.getParameter("fnd_user_name"));
String smart_id = Util.checkString(req.getParameter("smart_id"));
String smart_password = Util.checkString(req.getParameter("smart_password"));
String smart_email = Util.checkString(req.getParameter("smart_email"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String fnd_user = Util.Uni2Ksc(Util.checkString(req.getParameter("fnd_user")));
String fnd_regno = Util.Uni2Ksc(Util.checkString(req.getParameter("fnd_regno")));
String fnd_user_name = Util.Uni2Ksc(Util.checkString(req.getParameter("fnd_user_name")));
String smart_id = Util.Uni2Ksc(Util.checkString(req.getParameter("smart_id")));
String smart_password = Util.Uni2Ksc(Util.checkString(req.getParameter("smart_password")));
String smart_email = Util.Uni2Ksc(Util.checkString(req.getParameter("smart_email")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFnd_user(fnd_user);
dm.setFnd_regno(fnd_regno);
dm.setFnd_user_name(fnd_user_name);
dm.setSmart_id(smart_id);
dm.setSmart_password(smart_password);
dm.setSmart_email(smart_email);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 16 10:53:39 KST 2011 */