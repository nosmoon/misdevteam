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


public class SP_SAL_2440_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mappli;
	public String auto_shift_clsf;
	public String dduc_clsf;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SP_SAL_2440_ADM(){}
	public SP_SAL_2440_ADM(String cmpy_cd, String mappli, String auto_shift_clsf, String dduc_clsf, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mappli = mappli;
		this.auto_shift_clsf = auto_shift_clsf;
		this.dduc_clsf = dduc_clsf;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMappli(String mappli){
		this.mappli = mappli;
	}

	public void setAuto_shift_clsf(String auto_shift_clsf){
		this.auto_shift_clsf = auto_shift_clsf;
	}

	public void setDduc_clsf(String dduc_clsf){
		this.dduc_clsf = dduc_clsf;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMappli(){
		return this.mappli;
	}

	public String getAuto_shift_clsf(){
		return this.auto_shift_clsf;
	}

	public String getDduc_clsf(){
		return this.dduc_clsf;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_2440_A(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_2440_ADM dm = (SP_SAL_2440_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mappli);
		cstmt.setString(5, dm.auto_shift_clsf);
		cstmt.setString(6, dm.dduc_clsf);
		cstmt.setString(7, dm.incmg_pers_ip);
		cstmt.setString(8, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_2440_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mappli = [" + getMappli() + "]");
		System.out.println("auto_shift_clsf = [" + getAuto_shift_clsf() + "]");
		System.out.println("dduc_clsf = [" + getDduc_clsf() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String mappli = req.getParameter("mappli");
if( mappli == null){
	System.out.println(this.toString+" : mappli is null" );
}else{
	System.out.println(this.toString+" : mappli is "+mappli );
}
String auto_shift_clsf = req.getParameter("auto_shift_clsf");
if( auto_shift_clsf == null){
	System.out.println(this.toString+" : auto_shift_clsf is null" );
}else{
	System.out.println(this.toString+" : auto_shift_clsf is "+auto_shift_clsf );
}
String dduc_clsf = req.getParameter("dduc_clsf");
if( dduc_clsf == null){
	System.out.println(this.toString+" : dduc_clsf is null" );
}else{
	System.out.println(this.toString+" : dduc_clsf is "+dduc_clsf );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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
String mappli = Util.checkString(req.getParameter("mappli"));
String auto_shift_clsf = Util.checkString(req.getParameter("auto_shift_clsf"));
String dduc_clsf = Util.checkString(req.getParameter("dduc_clsf"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mappli = Util.Uni2Ksc(Util.checkString(req.getParameter("mappli")));
String auto_shift_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("auto_shift_clsf")));
String dduc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dduc_clsf")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setMappli(mappli);
dm.setAuto_shift_clsf(auto_shift_clsf);
dm.setDduc_clsf(dduc_clsf);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jul 18 15:48:11 KST 2012 */