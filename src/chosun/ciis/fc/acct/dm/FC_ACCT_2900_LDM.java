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


public class FC_ACCT_2900_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_clsf;
	public String rmtt_dd;

	public FC_ACCT_2900_LDM(){}
	public FC_ACCT_2900_LDM(String cmpy_cd, String slip_occr_clsf, String rmtt_dd){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_clsf = slip_occr_clsf;
		this.rmtt_dd = rmtt_dd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_occr_clsf(String slip_occr_clsf){
		this.slip_occr_clsf = slip_occr_clsf;
	}

	public void setRmtt_dd(String rmtt_dd){
		this.rmtt_dd = rmtt_dd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_occr_clsf(){
		return this.slip_occr_clsf;
	}

	public String getRmtt_dd(){
		return this.rmtt_dd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2900_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2900_LDM dm = (FC_ACCT_2900_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_clsf);
		cstmt.setString(5, dm.rmtt_dd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2900_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_occr_clsf = [" + getSlip_occr_clsf() + "]");
		System.out.println("rmtt_dd = [" + getRmtt_dd() + "]");
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
String slip_occr_clsf = req.getParameter("slip_occr_clsf");
if( slip_occr_clsf == null){
	System.out.println(this.toString+" : slip_occr_clsf is null" );
}else{
	System.out.println(this.toString+" : slip_occr_clsf is "+slip_occr_clsf );
}
String rmtt_dd = req.getParameter("rmtt_dd");
if( rmtt_dd == null){
	System.out.println(this.toString+" : rmtt_dd is null" );
}else{
	System.out.println(this.toString+" : rmtt_dd is "+rmtt_dd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_occr_clsf = Util.checkString(req.getParameter("slip_occr_clsf"));
String rmtt_dd = Util.checkString(req.getParameter("rmtt_dd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_clsf")));
String rmtt_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("rmtt_dd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_clsf(slip_occr_clsf);
dm.setRmtt_dd(rmtt_dd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 18 11:11:53 KST 2009 */