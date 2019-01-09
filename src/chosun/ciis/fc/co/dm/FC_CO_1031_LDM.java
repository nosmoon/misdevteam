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


package chosun.ciis.fc.co.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.co.ds.*;
import chosun.ciis.fc.co.rec.*;

/**
 * 
 */


public class FC_CO_1031_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fund_mang_no;
	public String loan_repay_clsf_cd;

	public FC_CO_1031_LDM(){}
	public FC_CO_1031_LDM(String cmpy_cd, String fund_mang_no, String loan_repay_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.fund_mang_no = fund_mang_no;
		this.loan_repay_clsf_cd = loan_repay_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFund_mang_no(String fund_mang_no){
		this.fund_mang_no = fund_mang_no;
	}

	public void setLoan_repay_clsf_cd(String loan_repay_clsf_cd){
		this.loan_repay_clsf_cd = loan_repay_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFund_mang_no(){
		return this.fund_mang_no;
	}

	public String getLoan_repay_clsf_cd(){
		return this.loan_repay_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_CO_1031_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_CO_1031_LDM dm = (FC_CO_1031_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fund_mang_no);
		cstmt.setString(5, dm.loan_repay_clsf_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.co.ds.FC_CO_1031_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fund_mang_no = [" + getFund_mang_no() + "]");
		System.out.println("loan_repay_clsf_cd = [" + getLoan_repay_clsf_cd() + "]");
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
String fund_mang_no = req.getParameter("fund_mang_no");
if( fund_mang_no == null){
	System.out.println(this.toString+" : fund_mang_no is null" );
}else{
	System.out.println(this.toString+" : fund_mang_no is "+fund_mang_no );
}
String loan_repay_clsf_cd = req.getParameter("loan_repay_clsf_cd");
if( loan_repay_clsf_cd == null){
	System.out.println(this.toString+" : loan_repay_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : loan_repay_clsf_cd is "+loan_repay_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
String loan_repay_clsf_cd = Util.checkString(req.getParameter("loan_repay_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fund_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fund_mang_no")));
String loan_repay_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("loan_repay_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFund_mang_no(fund_mang_no);
dm.setLoan_repay_clsf_cd(loan_repay_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 11 11:25:54 KST 2009 */