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


public class SP_SAL_4010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sale_fr_yymm;
	public String sale_to_yymm;
	public String proc_gubun;
	public String sale_item_cd;
	public String purc_dlco_clsf_cd_seq;
	public String incmg_pers;

	public SP_SAL_4010_LDM(){}
	public SP_SAL_4010_LDM(String cmpy_cd, String sale_fr_yymm, String sale_to_yymm, String proc_gubun, String sale_item_cd, String purc_dlco_clsf_cd_seq, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.sale_fr_yymm = sale_fr_yymm;
		this.sale_to_yymm = sale_to_yymm;
		this.proc_gubun = proc_gubun;
		this.sale_item_cd = sale_item_cd;
		this.purc_dlco_clsf_cd_seq = purc_dlco_clsf_cd_seq;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSale_fr_yymm(String sale_fr_yymm){
		this.sale_fr_yymm = sale_fr_yymm;
	}

	public void setSale_to_yymm(String sale_to_yymm){
		this.sale_to_yymm = sale_to_yymm;
	}

	public void setProc_gubun(String proc_gubun){
		this.proc_gubun = proc_gubun;
	}

	public void setSale_item_cd(String sale_item_cd){
		this.sale_item_cd = sale_item_cd;
	}

	public void setPurc_dlco_clsf_cd_seq(String purc_dlco_clsf_cd_seq){
		this.purc_dlco_clsf_cd_seq = purc_dlco_clsf_cd_seq;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSale_fr_yymm(){
		return this.sale_fr_yymm;
	}

	public String getSale_to_yymm(){
		return this.sale_to_yymm;
	}

	public String getProc_gubun(){
		return this.proc_gubun;
	}

	public String getSale_item_cd(){
		return this.sale_item_cd;
	}

	public String getPurc_dlco_clsf_cd_seq(){
		return this.purc_dlco_clsf_cd_seq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_4010_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_4010_LDM dm = (SP_SAL_4010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sale_fr_yymm);
		cstmt.setString(5, dm.sale_to_yymm);
		cstmt.setString(6, dm.proc_gubun);
		cstmt.setString(7, dm.sale_item_cd);
		cstmt.setString(8, dm.purc_dlco_clsf_cd_seq);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_4010_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sale_fr_yymm = [" + getSale_fr_yymm() + "]");
		System.out.println("sale_to_yymm = [" + getSale_to_yymm() + "]");
		System.out.println("proc_gubun = [" + getProc_gubun() + "]");
		System.out.println("sale_item_cd = [" + getSale_item_cd() + "]");
		System.out.println("purc_dlco_clsf_cd_seq = [" + getPurc_dlco_clsf_cd_seq() + "]");
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
String sale_fr_yymm = req.getParameter("sale_fr_yymm");
if( sale_fr_yymm == null){
	System.out.println(this.toString+" : sale_fr_yymm is null" );
}else{
	System.out.println(this.toString+" : sale_fr_yymm is "+sale_fr_yymm );
}
String sale_to_yymm = req.getParameter("sale_to_yymm");
if( sale_to_yymm == null){
	System.out.println(this.toString+" : sale_to_yymm is null" );
}else{
	System.out.println(this.toString+" : sale_to_yymm is "+sale_to_yymm );
}
String proc_gubun = req.getParameter("proc_gubun");
if( proc_gubun == null){
	System.out.println(this.toString+" : proc_gubun is null" );
}else{
	System.out.println(this.toString+" : proc_gubun is "+proc_gubun );
}
String sale_item_cd = req.getParameter("sale_item_cd");
if( sale_item_cd == null){
	System.out.println(this.toString+" : sale_item_cd is null" );
}else{
	System.out.println(this.toString+" : sale_item_cd is "+sale_item_cd );
}
String purc_dlco_clsf_cd_seq = req.getParameter("purc_dlco_clsf_cd_seq");
if( purc_dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : purc_dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : purc_dlco_clsf_cd_seq is "+purc_dlco_clsf_cd_seq );
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
String sale_fr_yymm = Util.checkString(req.getParameter("sale_fr_yymm"));
String sale_to_yymm = Util.checkString(req.getParameter("sale_to_yymm"));
String proc_gubun = Util.checkString(req.getParameter("proc_gubun"));
String sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
String purc_dlco_clsf_cd_seq = Util.checkString(req.getParameter("purc_dlco_clsf_cd_seq"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sale_fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_fr_yymm")));
String sale_to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_to_yymm")));
String proc_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_gubun")));
String sale_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_item_cd")));
String purc_dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_dlco_clsf_cd_seq")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSale_fr_yymm(sale_fr_yymm);
dm.setSale_to_yymm(sale_to_yymm);
dm.setProc_gubun(proc_gubun);
dm.setSale_item_cd(sale_item_cd);
dm.setPurc_dlco_clsf_cd_seq(purc_dlco_clsf_cd_seq);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jan 09 11:24:21 KST 2013 */