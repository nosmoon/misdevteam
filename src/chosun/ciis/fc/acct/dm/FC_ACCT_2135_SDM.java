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


public class FC_ACCT_2135_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String uid;
	public String slip_clsf_cd;
	public String dlco_cd;
	public String ask_dept_cd;
	public String budg_cd;

	public FC_ACCT_2135_SDM(){}
	public FC_ACCT_2135_SDM(String cmpy_cd, String uid, String slip_clsf_cd, String dlco_cd, String ask_dept_cd, String budg_cd){
		this.cmpy_cd = cmpy_cd;
		this.uid = uid;
		this.slip_clsf_cd = slip_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.ask_dept_cd = ask_dept_cd;
		this.budg_cd = budg_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setAsk_dept_cd(String ask_dept_cd){
		this.ask_dept_cd = ask_dept_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getAsk_dept_cd(){
		return this.ask_dept_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2135_S(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2135_SDM dm = (FC_ACCT_2135_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.uid);
		cstmt.setString(5, dm.slip_clsf_cd);
		cstmt.setString(6, dm.dlco_cd);
		cstmt.setString(7, dm.ask_dept_cd);
		cstmt.setString(8, dm.budg_cd);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2135_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("uid = [" + getUid() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("ask_dept_cd = [" + getAsk_dept_cd() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
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
String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String ask_dept_cd = req.getParameter("ask_dept_cd");
if( ask_dept_cd == null){
	System.out.println(this.toString+" : ask_dept_cd is null" );
}else{
	System.out.println(this.toString+" : ask_dept_cd is "+ask_dept_cd );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String uid = Util.checkString(req.getParameter("uid"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String ask_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ask_dept_cd")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setUid(uid);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setAsk_dept_cd(ask_dept_cd);
dm.setBudg_cd(budg_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Aug 08 11:15:42 KST 2009 */