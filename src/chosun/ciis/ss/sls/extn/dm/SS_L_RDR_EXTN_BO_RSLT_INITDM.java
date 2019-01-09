/***************************************************************************************************
* ���ϸ� : .java
* ��� : *Ȯ����Ȳ-����ISȮ��-������ �ʱ�ȭ��
* �ۼ����� : 2009-03-27
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * Ȯ����Ȳ-����ISȮ��-������ �ʱ�ȭ��
 */

public class SS_L_RDR_EXTN_BO_RSLT_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String auth_gb;
	public String incmg_pers;
	public String base_dt;

	public SS_L_RDR_EXTN_BO_RSLT_INITDM(){}
	public SS_L_RDR_EXTN_BO_RSLT_INITDM(String cmpy_cd, String auth_gb, String incmg_pers, String base_dt){
		this.cmpy_cd = cmpy_cd;
		this.auth_gb = auth_gb;
		this.incmg_pers = incmg_pers;
		this.base_dt = base_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAuth_gb(String auth_gb){
		this.auth_gb = auth_gb;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setBase_dt(String base_dt){
		this.base_dt = base_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAuth_gb(){
		return this.auth_gb;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getBase_dt(){
		return this.base_dt;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RDR_EXTN_BO_RSLT_INIT( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_EXTN_BO_RSLT_INITDM dm = (SS_L_RDR_EXTN_BO_RSLT_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.auth_gb);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.base_dt);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_RDR_EXTN_BO_RSLT_INITDataSet();
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
String auth_gb = req.getParameter("auth_gb");
if( auth_gb == null){
	System.out.println(this.toString+" : auth_gb is null" );
}else{
	System.out.println(this.toString+" : auth_gb is "+auth_gb );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String base_dt = req.getParameter("base_dt");
if( base_dt == null){
	System.out.println(this.toString+" : base_dt is null" );
}else{
	System.out.println(this.toString+" : base_dt is "+base_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String auth_gb = Util.checkString(req.getParameter("auth_gb"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String base_dt = Util.checkString(req.getParameter("base_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String auth_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("auth_gb")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String base_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setAuth_gb(auth_gb);
dm.setIncmg_pers(incmg_pers);
dm.setBase_dt(base_dt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 27 09:55:23 KST 2009 */