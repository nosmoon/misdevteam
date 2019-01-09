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


package chosun.ciis.sp.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.ds.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_3410_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sale_yymm;
	public String cta_rdr_extn_amt_clsf;
	public String incmg_pers;

	public SP_SAL_3410_LDM(){}
	public SP_SAL_3410_LDM(String cmpy_cd, String sale_yymm, String cta_rdr_extn_amt_clsf, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.sale_yymm = sale_yymm;
		this.cta_rdr_extn_amt_clsf = cta_rdr_extn_amt_clsf;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSale_yymm(String sale_yymm){
		this.sale_yymm = sale_yymm;
	}

	public void setCta_rdr_extn_amt_clsf(String cta_rdr_extn_amt_clsf){
		this.cta_rdr_extn_amt_clsf = cta_rdr_extn_amt_clsf;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSale_yymm(){
		return this.sale_yymm;
	}

	public String getCta_rdr_extn_amt_clsf(){
		return this.cta_rdr_extn_amt_clsf;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_3410_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_3410_LDM dm = (SP_SAL_3410_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sale_yymm);
		cstmt.setString(5, dm.cta_rdr_extn_amt_clsf);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_3410_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sale_yymm = [" + getSale_yymm() + "]");
		System.out.println("cta_rdr_extn_amt_clsf = [" + getCta_rdr_extn_amt_clsf() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String sale_yymm = req.getParameter("sale_yymm");
if( sale_yymm == null){
	System.out.println(this.toString+" : sale_yymm is null" );
}else{
	System.out.println(this.toString+" : sale_yymm is "+sale_yymm );
}
String cta_rdr_extn_amt_clsf = req.getParameter("cta_rdr_extn_amt_clsf");
if( cta_rdr_extn_amt_clsf == null){
	System.out.println(this.toString+" : cta_rdr_extn_amt_clsf is null" );
}else{
	System.out.println(this.toString+" : cta_rdr_extn_amt_clsf is "+cta_rdr_extn_amt_clsf );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
String cta_rdr_extn_amt_clsf = Util.checkString(req.getParameter("cta_rdr_extn_amt_clsf"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sale_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_yymm")));
String cta_rdr_extn_amt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cta_rdr_extn_amt_clsf")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSale_yymm(sale_yymm);
dm.setCta_rdr_extn_amt_clsf(cta_rdr_extn_amt_clsf);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sun Jul 22 14:14:36 KST 2012 */