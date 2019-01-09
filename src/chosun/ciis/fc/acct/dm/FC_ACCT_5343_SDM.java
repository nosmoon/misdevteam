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


public class FC_ACCT_5343_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fisc_fr;
	public String fisc_to;
	public String kind;

	public FC_ACCT_5343_SDM(){}
	public FC_ACCT_5343_SDM(String cmpy_cd, String fisc_fr, String fisc_to, String kind){
		this.cmpy_cd = cmpy_cd;
		this.fisc_fr = fisc_fr;
		this.fisc_to = fisc_to;
		this.kind = kind;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFisc_fr(String fisc_fr){
		this.fisc_fr = fisc_fr;
	}

	public void setFisc_to(String fisc_to){
		this.fisc_to = fisc_to;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFisc_fr(){
		return this.fisc_fr;
	}

	public String getFisc_to(){
		return this.fisc_to;
	}

	public String getKind(){
		return this.kind;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_5343_S(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_5343_SDM dm = (FC_ACCT_5343_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fisc_fr);
		cstmt.setString(5, dm.fisc_to);
		cstmt.setString(6, dm.kind);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_5343_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fisc_fr = [" + getFisc_fr() + "]");
		System.out.println("fisc_to = [" + getFisc_to() + "]");
		System.out.println("kind = [" + getKind() + "]");
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
String fisc_fr = req.getParameter("fisc_fr");
if( fisc_fr == null){
	System.out.println(this.toString+" : fisc_fr is null" );
}else{
	System.out.println(this.toString+" : fisc_fr is "+fisc_fr );
}
String fisc_to = req.getParameter("fisc_to");
if( fisc_to == null){
	System.out.println(this.toString+" : fisc_to is null" );
}else{
	System.out.println(this.toString+" : fisc_to is "+fisc_to );
}
String kind = req.getParameter("kind");
if( kind == null){
	System.out.println(this.toString+" : kind is null" );
}else{
	System.out.println(this.toString+" : kind is "+kind );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fisc_fr = Util.checkString(req.getParameter("fisc_fr"));
String fisc_to = Util.checkString(req.getParameter("fisc_to"));
String kind = Util.checkString(req.getParameter("kind"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fisc_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_fr")));
String fisc_to = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_to")));
String kind = Util.Uni2Ksc(Util.checkString(req.getParameter("kind")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFisc_fr(fisc_fr);
dm.setFisc_to(fisc_to);
dm.setKind(kind);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 24 12:12:36 KST 2009 */