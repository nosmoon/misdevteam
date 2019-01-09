/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_7014_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fund_mang_no;
	public String loan_no;
	public String int_rate_chg_dt;

	public FC_FUNC_7014_DDM(){}
	public FC_FUNC_7014_DDM(String cmpy_cd, String fund_mang_no, String loan_no, String int_rate_chg_dt){
		this.cmpy_cd = cmpy_cd;
		this.fund_mang_no = fund_mang_no;
		this.loan_no = loan_no;
		this.int_rate_chg_dt = int_rate_chg_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFund_mang_no(String fund_mang_no){
		this.fund_mang_no = fund_mang_no;
	}

	public void setLoan_no(String loan_no){
		this.loan_no = loan_no;
	}

	public void setInt_rate_chg_dt(String int_rate_chg_dt){
		this.int_rate_chg_dt = int_rate_chg_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFund_mang_no(){
		return this.fund_mang_no;
	}

	public String getLoan_no(){
		return this.loan_no;
	}

	public String getInt_rate_chg_dt(){
		return this.int_rate_chg_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_7014_D(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_7014_DDM dm = (FC_FUNC_7014_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fund_mang_no);
		cstmt.setString(5, dm.loan_no);
		cstmt.setString(6, dm.int_rate_chg_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_7014_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fund_mang_no = [" + getFund_mang_no() + "]");
		System.out.println("loan_no = [" + getLoan_no() + "]");
		System.out.println("int_rate_chg_dt = [" + getInt_rate_chg_dt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

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
String loan_no = req.getParameter("loan_no");
if( loan_no == null){
	System.out.println(this.toString+" : loan_no is null" );
}else{
	System.out.println(this.toString+" : loan_no is "+loan_no );
}
String int_rate_chg_dt = req.getParameter("int_rate_chg_dt");
if( int_rate_chg_dt == null){
	System.out.println(this.toString+" : int_rate_chg_dt is null" );
}else{
	System.out.println(this.toString+" : int_rate_chg_dt is "+int_rate_chg_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
String loan_no = Util.checkString(req.getParameter("loan_no"));
String int_rate_chg_dt = Util.checkString(req.getParameter("int_rate_chg_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fund_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fund_mang_no")));
String loan_no = Util.Uni2Ksc(Util.checkString(req.getParameter("loan_no")));
String int_rate_chg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("int_rate_chg_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setFund_mang_no(fund_mang_no);
dm.setLoan_no(loan_no);
dm.setInt_rate_chg_dt(int_rate_chg_dt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 01 16:06:55 KST 2009 */