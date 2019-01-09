/***************************************************************************************************
* ���ϸ� : 
* ��� : 
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.pl.com.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.com.ds.*;
import chosun.ciis.pl.com.rec.*;

/**
 * 
 */


public class PL_COM_1610_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String bank_cd;
	public String bank_nm;

	public PL_COM_1610_LDM(){}
	public PL_COM_1610_LDM(String cmpy_cd, String incmg_pers, String bank_cd, String bank_nm){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.bank_cd = bank_cd;
		this.bank_nm = bank_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_COM_1610_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_COM_1610_LDM dm = (PL_COM_1610_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.bank_cd);
		cstmt.setString(6, dm.bank_nm);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.com.ds.PL_COM_1610_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("bank_nm = [" + getBank_nm() + "]");
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String bank_nm = req.getParameter("bank_nm");
if( bank_nm == null){
	System.out.println(this.toString+" : bank_nm is null" );
}else{
	System.out.println(this.toString+" : bank_nm is "+bank_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String bank_nm = Util.checkString(req.getParameter("bank_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String bank_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setBank_cd(bank_cd);
dm.setBank_nm(bank_nm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 22 20:01:20 KST 2009 */