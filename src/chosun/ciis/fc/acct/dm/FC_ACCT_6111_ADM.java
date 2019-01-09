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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_6111_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String stmt_fr;
	public String stmt_to;
	public String kind;
	public String qq;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_ACCT_6111_ADM(){}
	public FC_ACCT_6111_ADM(String cmpy_cd, String stmt_fr, String stmt_to, String kind, String qq, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.stmt_fr = stmt_fr;
		this.stmt_to = stmt_to;
		this.kind = kind;
		this.qq = qq;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setStmt_fr(String stmt_fr){
		this.stmt_fr = stmt_fr;
	}

	public void setStmt_to(String stmt_to){
		this.stmt_to = stmt_to;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public void setQq(String qq){
		this.qq = qq;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getStmt_fr(){
		return this.stmt_fr;
	}

	public String getStmt_to(){
		return this.stmt_to;
	}

	public String getKind(){
		return this.kind;
	}

	public String getQq(){
		return this.qq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6111_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6111_ADM dm = (FC_ACCT_6111_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.stmt_fr);
		cstmt.setString(5, dm.stmt_to);
		cstmt.setString(6, dm.kind);
		cstmt.setString(7, dm.qq);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6111_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("stmt_fr = [" + getStmt_fr() + "]");
		System.out.println("stmt_to = [" + getStmt_to() + "]");
		System.out.println("kind = [" + getKind() + "]");
		System.out.println("qq = [" + getQq() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String stmt_fr = req.getParameter("stmt_fr");
if( stmt_fr == null){
	System.out.println(this.toString+" : stmt_fr is null" );
}else{
	System.out.println(this.toString+" : stmt_fr is "+stmt_fr );
}
String stmt_to = req.getParameter("stmt_to");
if( stmt_to == null){
	System.out.println(this.toString+" : stmt_to is null" );
}else{
	System.out.println(this.toString+" : stmt_to is "+stmt_to );
}
String kind = req.getParameter("kind");
if( kind == null){
	System.out.println(this.toString+" : kind is null" );
}else{
	System.out.println(this.toString+" : kind is "+kind );
}
String qq = req.getParameter("qq");
if( qq == null){
	System.out.println(this.toString+" : qq is null" );
}else{
	System.out.println(this.toString+" : qq is "+qq );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String stmt_fr = Util.checkString(req.getParameter("stmt_fr"));
String stmt_to = Util.checkString(req.getParameter("stmt_to"));
String kind = Util.checkString(req.getParameter("kind"));
String qq = Util.checkString(req.getParameter("qq"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String stmt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("stmt_fr")));
String stmt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("stmt_to")));
String kind = Util.Uni2Ksc(Util.checkString(req.getParameter("kind")));
String qq = Util.Uni2Ksc(Util.checkString(req.getParameter("qq")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setStmt_fr(stmt_fr);
dm.setStmt_to(stmt_to);
dm.setKind(kind);
dm.setQq(qq);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 18 16:51:11 KST 2009 */