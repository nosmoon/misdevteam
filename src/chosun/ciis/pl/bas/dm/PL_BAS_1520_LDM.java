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


public class PL_BAS_1520_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String yy;
	public String medi_cd;

	public PL_BAS_1520_LDM(){}
	public PL_BAS_1520_LDM(String cmpy_cd, String incmg_pers, String yy, String medi_cd){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.yy = yy;
		this.medi_cd = medi_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getYy(){
		return this.yy;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_BAS_1520_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_BAS_1520_LDM dm = (PL_BAS_1520_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.yy);
		cstmt.setString(6, dm.medi_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.bas.ds.PL_BAS_1520_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("yy = [" + getYy() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
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
String yy = req.getParameter("yy");
if( yy == null){
	System.out.println(this.toString+" : yy is null" );
}else{
	System.out.println(this.toString+" : yy is "+yy );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String yy = Util.checkString(req.getParameter("yy"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String yy = Util.Uni2Ksc(Util.checkString(req.getParameter("yy")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setYy(yy);
dm.setMedi_cd(medi_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 30 14:29:47 KST 2009 */