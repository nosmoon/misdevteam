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


public class FC_ACCT_5520_PDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fisc_yymm;
	public String dlco_clsf_cd;
	public String dlco_cd_fr;
	public String dlco_cd_to;

	public FC_ACCT_5520_PDM(){}
	public FC_ACCT_5520_PDM(String cmpy_cd, String fisc_yymm, String dlco_clsf_cd, String dlco_cd_fr, String dlco_cd_to){
		this.cmpy_cd = cmpy_cd;
		this.fisc_yymm = fisc_yymm;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd_fr = dlco_cd_fr;
		this.dlco_cd_to = dlco_cd_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFisc_yymm(String fisc_yymm){
		this.fisc_yymm = fisc_yymm;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd_fr(String dlco_cd_fr){
		this.dlco_cd_fr = dlco_cd_fr;
	}

	public void setDlco_cd_to(String dlco_cd_to){
		this.dlco_cd_to = dlco_cd_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFisc_yymm(){
		return this.fisc_yymm;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd_fr(){
		return this.dlco_cd_fr;
	}

	public String getDlco_cd_to(){
		return this.dlco_cd_to;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_5520_P(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_5520_PDM dm = (FC_ACCT_5520_PDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fisc_yymm);
		cstmt.setString(5, dm.dlco_clsf_cd);
		cstmt.setString(6, dm.dlco_cd_fr);
		cstmt.setString(7, dm.dlco_cd_to);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_5520_PDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fisc_yymm = [" + getFisc_yymm() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd_fr = [" + getDlco_cd_fr() + "]");
		System.out.println("dlco_cd_to = [" + getDlco_cd_to() + "]");
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
String fisc_yymm = req.getParameter("fisc_yymm");
if( fisc_yymm == null){
	System.out.println(this.toString+" : fisc_yymm is null" );
}else{
	System.out.println(this.toString+" : fisc_yymm is "+fisc_yymm );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd_fr = req.getParameter("dlco_cd_fr");
if( dlco_cd_fr == null){
	System.out.println(this.toString+" : dlco_cd_fr is null" );
}else{
	System.out.println(this.toString+" : dlco_cd_fr is "+dlco_cd_fr );
}
String dlco_cd_to = req.getParameter("dlco_cd_to");
if( dlco_cd_to == null){
	System.out.println(this.toString+" : dlco_cd_to is null" );
}else{
	System.out.println(this.toString+" : dlco_cd_to is "+dlco_cd_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fisc_yymm = Util.checkString(req.getParameter("fisc_yymm"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd_fr = Util.checkString(req.getParameter("dlco_cd_fr"));
String dlco_cd_to = Util.checkString(req.getParameter("dlco_cd_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fisc_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_yymm")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd_fr")));
String dlco_cd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFisc_yymm(fisc_yymm);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd_fr(dlco_cd_fr);
dm.setDlco_cd_to(dlco_cd_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 10 15:46:31 KST 2009 */