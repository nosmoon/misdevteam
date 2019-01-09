/***************************************************************************************************
* 파일명 : .java
* 기능 : 공통 - 세금계산서 사용자 수정
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
 * 공통 - 세금계산서 사용자 수정
 */


public class CO_SMTB_1073_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fnd_user;
	public String fnd_regno;
	public String fnd_user_name;
	public String smart_id;
	public String smart_password;
	public String smart_email;

	public CO_SMTB_1073_UDM(){}
	public CO_SMTB_1073_UDM(String cmpy_cd, String fnd_user, String fnd_regno, String fnd_user_name, String smart_id, String smart_password, String smart_email){
		this.cmpy_cd = cmpy_cd;
		this.fnd_user = fnd_user;
		this.fnd_regno = fnd_regno;
		this.fnd_user_name = fnd_user_name;
		this.smart_id = smart_id;
		this.smart_password = smart_password;
		this.smart_email = smart_email;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFnd_user(String fnd_user){
		this.fnd_user = fnd_user;
	}

	public void setFnd_regno(String fnd_regno){
		this.fnd_regno = fnd_regno;
	}

	public void setFnd_user_name(String fnd_user_name){
		this.fnd_user_name = fnd_user_name;
	}

	public void setSmart_id(String smart_id){
		this.smart_id = smart_id;
	}

	public void setSmart_password(String smart_password){
		this.smart_password = smart_password;
	}

	public void setSmart_email(String smart_email){
		this.smart_email = smart_email;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFnd_user(){
		return this.fnd_user;
	}

	public String getFnd_regno(){
		return this.fnd_regno;
	}

	public String getFnd_user_name(){
		return this.fnd_user_name;
	}

	public String getSmart_id(){
		return this.smart_id;
	}

	public String getSmart_password(){
		return this.smart_password;
	}

	public String getSmart_email(){
		return this.smart_email;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_SMTB_1073_U(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_SMTB_1073_UDM dm = (CO_SMTB_1073_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fnd_user);
		cstmt.setString(5, dm.fnd_regno);
		cstmt.setString(6, dm.fnd_user_name);
		cstmt.setString(7, dm.smart_id);
		cstmt.setString(8, dm.smart_password);
		cstmt.setString(9, dm.smart_email);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.smtb.ds.CO_SMTB_1073_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fnd_user = [" + getFnd_user() + "]");
		System.out.println("fnd_regno = [" + getFnd_regno() + "]");
		System.out.println("fnd_user_name = [" + getFnd_user_name() + "]");
		System.out.println("smart_id = [" + getSmart_id() + "]");
		System.out.println("smart_password = [" + getSmart_password() + "]");
		System.out.println("smart_email = [" + getSmart_email() + "]");
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


/* 작성시간 : Mon May 16 10:52:59 KST 2011 */