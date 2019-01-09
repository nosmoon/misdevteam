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


package chosun.ciis.pl.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.bas.ds.*;
import chosun.ciis.pl.bas.rec.*;

/**
 * 
 */


public class PL_BAS_1610_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String issu_cmpy;
	public String medi_clsf;

	public PL_BAS_1610_LDM(){}
	public PL_BAS_1610_LDM(String cmpy_cd, String incmg_pers, String issu_cmpy, String medi_clsf){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.issu_cmpy = issu_cmpy;
		this.medi_clsf = medi_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIssu_cmpy(String issu_cmpy){
		this.issu_cmpy = issu_cmpy;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIssu_cmpy(){
		return this.issu_cmpy;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_BAS_1610_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_BAS_1610_LDM dm = (PL_BAS_1610_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.issu_cmpy);
		cstmt.setString(6, dm.medi_clsf);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.bas.ds.PL_BAS_1610_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("issu_cmpy = [" + getIssu_cmpy() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
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
String issu_cmpy = req.getParameter("issu_cmpy");
if( issu_cmpy == null){
	System.out.println(this.toString+" : issu_cmpy is null" );
}else{
	System.out.println(this.toString+" : issu_cmpy is "+issu_cmpy );
}
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String issu_cmpy = Util.checkString(req.getParameter("issu_cmpy"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String issu_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_cmpy")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIssu_cmpy(issu_cmpy);
dm.setMedi_clsf(medi_clsf);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 18 12:11:10 KST 2009 */