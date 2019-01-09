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


public class FC_ACCT_1121_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String impt_expn_clsf_cd;
	public String pay_cycl_cd;
	public String use_yn;

	public FC_ACCT_1121_LDM(){}
	public FC_ACCT_1121_LDM(String cmpy_cd, String impt_expn_clsf_cd, String pay_cycl_cd, String use_yn){
		this.cmpy_cd = cmpy_cd;
		this.impt_expn_clsf_cd = impt_expn_clsf_cd;
		this.pay_cycl_cd = pay_cycl_cd;
		this.use_yn = use_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setImpt_expn_clsf_cd(String impt_expn_clsf_cd){
		this.impt_expn_clsf_cd = impt_expn_clsf_cd;
	}

	public void setPay_cycl_cd(String pay_cycl_cd){
		this.pay_cycl_cd = pay_cycl_cd;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getImpt_expn_clsf_cd(){
		return this.impt_expn_clsf_cd;
	}

	public String getPay_cycl_cd(){
		return this.pay_cycl_cd;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_1121_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_1121_LDM dm = (FC_ACCT_1121_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.impt_expn_clsf_cd);
		cstmt.setString(5, dm.pay_cycl_cd);
		cstmt.setString(6, dm.use_yn);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_1121_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("impt_expn_clsf_cd = [" + getImpt_expn_clsf_cd() + "]");
		System.out.println("pay_cycl_cd = [" + getPay_cycl_cd() + "]");
		System.out.println("use_yn = [" + getUse_yn() + "]");
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
String impt_expn_clsf_cd = req.getParameter("impt_expn_clsf_cd");
if( impt_expn_clsf_cd == null){
	System.out.println(this.toString+" : impt_expn_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : impt_expn_clsf_cd is "+impt_expn_clsf_cd );
}
String pay_cycl_cd = req.getParameter("pay_cycl_cd");
if( pay_cycl_cd == null){
	System.out.println(this.toString+" : pay_cycl_cd is null" );
}else{
	System.out.println(this.toString+" : pay_cycl_cd is "+pay_cycl_cd );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String impt_expn_clsf_cd = Util.checkString(req.getParameter("impt_expn_clsf_cd"));
String pay_cycl_cd = Util.checkString(req.getParameter("pay_cycl_cd"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String impt_expn_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_expn_clsf_cd")));
String pay_cycl_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_cycl_cd")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setImpt_expn_clsf_cd(impt_expn_clsf_cd);
dm.setPay_cycl_cd(pay_cycl_cd);
dm.setUse_yn(use_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 06 17:59:19 KST 2009 */