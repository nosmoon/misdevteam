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


public class FC_ACCT_5821_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clsf_cd;
	public String fisc_ym_fr;
	public String fisc_ym_to;
	public String acct_cd_fr;
	public String acct_cd_to;
	public String dlco_cd;
    
	public FC_ACCT_5821_LDM(){}
	public FC_ACCT_5821_LDM(String cmpy_cd, String clsf_cd, String fisc_ym_fr, String fisc_ym_to, String acct_cd_fr, String acct_cd_to, String dlco_cd){
		this.cmpy_cd = cmpy_cd;
		this.clsf_cd = clsf_cd;
		this.fisc_ym_fr = fisc_ym_fr;
		this.fisc_ym_to = fisc_ym_to;
		this.acct_cd_fr = acct_cd_fr;
		this.acct_cd_to = acct_cd_to;
		this.dlco_cd = dlco_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClsf_cd(String clsf_cd){
		this.clsf_cd = clsf_cd;
	}

	public void setFisc_ym_fr(String fisc_ym_fr){
		this.fisc_ym_fr = fisc_ym_fr;
	}

	public void setFisc_ym_to(String fisc_ym_to){
		this.fisc_ym_to = fisc_ym_to;
	}

	public void setAcct_cd_fr(String acct_cd_fr){
		this.acct_cd_fr = acct_cd_fr;
	}

	public void setAcct_cd_to(String acct_cd_to){
		this.acct_cd_to = acct_cd_to;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClsf_cd(){
		return this.clsf_cd;
	}

	public String getFisc_ym_fr(){
		return this.fisc_ym_fr;
	}

	public String getFisc_ym_to(){
		return this.fisc_ym_to;
	}

	public String getAcct_cd_fr(){
		return this.acct_cd_fr;
	}

	public String getAcct_cd_to(){
		return this.acct_cd_to;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_5821_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_5821_LDM dm = (FC_ACCT_5821_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clsf_cd);
		cstmt.setString(5, dm.fisc_ym_fr);
		cstmt.setString(6, dm.fisc_ym_to);
		cstmt.setString(7, dm.acct_cd_fr);
		cstmt.setString(8, dm.acct_cd_to);
		cstmt.setString(9, dm.dlco_cd);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_5821_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clsf_cd = [" + getClsf_cd() + "]");
		System.out.println("fisc_ym_fr = [" + getFisc_ym_fr() + "]");
		System.out.println("fisc_ym_to = [" + getFisc_ym_to() + "]");
		System.out.println("acct_cd_fr = [" + getAcct_cd_fr() + "]");
		System.out.println("acct_cd_to = [" + getAcct_cd_to() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
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
String clsf_cd = req.getParameter("clsf_cd");
if( clsf_cd == null){
	System.out.println(this.toString+" : clsf_cd is null" );
}else{
	System.out.println(this.toString+" : clsf_cd is "+clsf_cd );
}
String fisc_ym_fr = req.getParameter("fisc_ym_fr");
if( fisc_ym_fr == null){
	System.out.println(this.toString+" : fisc_ym_fr is null" );
}else{
	System.out.println(this.toString+" : fisc_ym_fr is "+fisc_ym_fr );
}
String fisc_ym_to = req.getParameter("fisc_ym_to");
if( fisc_ym_to == null){
	System.out.println(this.toString+" : fisc_ym_to is null" );
}else{
	System.out.println(this.toString+" : fisc_ym_to is "+fisc_ym_to );
}
String acct_cd_fr = req.getParameter("acct_cd_fr");
if( acct_cd_fr == null){
	System.out.println(this.toString+" : acct_cd_fr is null" );
}else{
	System.out.println(this.toString+" : acct_cd_fr is "+acct_cd_fr );
}
String acct_cd_to = req.getParameter("acct_cd_to");
if( acct_cd_to == null){
	System.out.println(this.toString+" : acct_cd_to is null" );
}else{
	System.out.println(this.toString+" : acct_cd_to is "+acct_cd_to );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
String fisc_ym_fr = Util.checkString(req.getParameter("fisc_ym_fr"));
String fisc_ym_to = Util.checkString(req.getParameter("fisc_ym_to"));
String acct_cd_fr = Util.checkString(req.getParameter("acct_cd_fr"));
String acct_cd_to = Util.checkString(req.getParameter("acct_cd_to"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf_cd")));
String fisc_ym_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_ym_fr")));
String fisc_ym_to = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_ym_to")));
String acct_cd_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd_fr")));
String acct_cd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd_to")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClsf_cd(clsf_cd);
dm.setFisc_ym_fr(fisc_ym_fr);
dm.setFisc_ym_to(fisc_ym_to);
dm.setAcct_cd_fr(acct_cd_fr);
dm.setAcct_cd_to(acct_cd_to);
dm.setDlco_cd(dlco_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 04 15:15:23 KST 2018 */