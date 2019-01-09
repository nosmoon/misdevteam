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


public class FC_ACCT_3151_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yyyymm;
	public String gbn;
	public String budg_cd;
	public String evnt_cd;

	public FC_ACCT_3151_LDM(){}
	public FC_ACCT_3151_LDM(String cmpy_cd, String yyyymm, String gbn, String budg_cd, String evnt_cd){
		this.cmpy_cd = cmpy_cd;
		this.yyyymm = yyyymm;
		this.gbn = gbn;
		this.budg_cd = budg_cd;
		this.evnt_cd = evnt_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYyyymm(String yyyymm){
		this.yyyymm = yyyymm;
	}

	public void setGbn(String gbn){
		this.gbn = gbn;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYyyymm(){
		return this.yyyymm;
	}

	public String getGbn(){
		return this.gbn;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_3151_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_3151_LDM dm = (FC_ACCT_3151_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yyyymm);
		cstmt.setString(5, dm.gbn);
		cstmt.setString(6, dm.budg_cd);
		cstmt.setString(7, dm.evnt_cd);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_3151_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yyyymm = [" + getYyyymm() + "]");
		System.out.println("gbn = [" + getGbn() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
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
String yyyymm = req.getParameter("yyyymm");
if( yyyymm == null){
	System.out.println(this.toString+" : yyyymm is null" );
}else{
	System.out.println(this.toString+" : yyyymm is "+yyyymm );
}
String gbn = req.getParameter("gbn");
if( gbn == null){
	System.out.println(this.toString+" : gbn is null" );
}else{
	System.out.println(this.toString+" : gbn is "+gbn );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yyyymm = Util.checkString(req.getParameter("yyyymm"));
String gbn = Util.checkString(req.getParameter("gbn"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyymm")));
String gbn = Util.Uni2Ksc(Util.checkString(req.getParameter("gbn")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYyyymm(yyyymm);
dm.setGbn(gbn);
dm.setBudg_cd(budg_cd);
dm.setEvnt_cd(evnt_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 09 17:23:07 KST 2014 */