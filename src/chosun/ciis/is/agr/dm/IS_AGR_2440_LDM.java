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


package chosun.ciis.is.agr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.ds.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_2440_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String scat_dt_fr;
	public String scat_dt_to;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String dlco_clsf_cd_seq;
	public String advcs_cd;
	public String indt_cd;
	public String sale_clsf;
	public String spc_sale_clsf;
	public String indt_cls_cd;

	public IS_AGR_2440_LDM(){}
	public IS_AGR_2440_LDM(String cmpy_cd, String scat_dt_fr, String scat_dt_to, String dept_cd, String sub_dept_cd, String chrg_pers, String dlco_clsf_cd_seq, String advcs_cd, String indt_cd, String sale_clsf, String spc_sale_clsf, String indt_cls_cd){
		this.cmpy_cd = cmpy_cd;
		this.scat_dt_fr = scat_dt_fr;
		this.scat_dt_to = scat_dt_to;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.chrg_pers = chrg_pers;
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
		this.advcs_cd = advcs_cd;
		this.indt_cd = indt_cd;
		this.sale_clsf = sale_clsf;
		this.spc_sale_clsf = spc_sale_clsf;
		this.indt_cls_cd = indt_cls_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setScat_dt_fr(String scat_dt_fr){
		this.scat_dt_fr = scat_dt_fr;
	}

	public void setScat_dt_to(String scat_dt_to){
		this.scat_dt_to = scat_dt_to;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setAdvcs_cd(String advcs_cd){
		this.advcs_cd = advcs_cd;
	}

	public void setIndt_cd(String indt_cd){
		this.indt_cd = indt_cd;
	}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setSpc_sale_clsf(String spc_sale_clsf){
		this.spc_sale_clsf = spc_sale_clsf;
	}

	public void setIndt_cls_cd(String indt_cls_cd){
		this.indt_cls_cd = indt_cls_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getScat_dt_fr(){
		return this.scat_dt_fr;
	}

	public String getScat_dt_to(){
		return this.scat_dt_to;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getAdvcs_cd(){
		return this.advcs_cd;
	}

	public String getIndt_cd(){
		return this.indt_cd;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getSpc_sale_clsf(){
		return this.spc_sale_clsf;
	}

	public String getIndt_cls_cd(){
		return this.indt_cls_cd;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_AGR_2440_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_AGR_2440_LDM dm = (IS_AGR_2440_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.scat_dt_fr);
		cstmt.setString(5, dm.scat_dt_to);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.sub_dept_cd);
		cstmt.setString(8, dm.chrg_pers);
		cstmt.setString(9, dm.dlco_clsf_cd_seq);
		cstmt.setString(10, dm.advcs_cd);
		cstmt.setString(11, dm.indt_cd);
		cstmt.setString(12, dm.sale_clsf);
		cstmt.setString(13, dm.spc_sale_clsf);
		cstmt.setString(14, dm.indt_cls_cd);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.agr.ds.IS_AGR_2440_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("scat_dt_fr = [" + getScat_dt_fr() + "]");
		System.out.println("scat_dt_to = [" + getScat_dt_to() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("dlco_clsf_cd_seq = [" + getDlco_clsf_cd_seq() + "]");
		System.out.println("advcs_cd = [" + getAdvcs_cd() + "]");
		System.out.println("indt_cd = [" + getIndt_cd() + "]");
		System.out.println("sale_clsf = [" + getSale_clsf() + "]");
		System.out.println("spc_sale_clsf = [" + getSpc_sale_clsf() + "]");
		System.out.println("indt_cls_cd = [" + getIndt_cls_cd() + "]");
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
String scat_dt_fr = req.getParameter("scat_dt_fr");
if( scat_dt_fr == null){
	System.out.println(this.toString+" : scat_dt_fr is null" );
}else{
	System.out.println(this.toString+" : scat_dt_fr is "+scat_dt_fr );
}
String scat_dt_to = req.getParameter("scat_dt_to");
if( scat_dt_to == null){
	System.out.println(this.toString+" : scat_dt_to is null" );
}else{
	System.out.println(this.toString+" : scat_dt_to is "+scat_dt_to );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String dlco_clsf_cd_seq = req.getParameter("dlco_clsf_cd_seq");
if( dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd_seq is "+dlco_clsf_cd_seq );
}
String advcs_cd = req.getParameter("advcs_cd");
if( advcs_cd == null){
	System.out.println(this.toString+" : advcs_cd is null" );
}else{
	System.out.println(this.toString+" : advcs_cd is "+advcs_cd );
}
String indt_cd = req.getParameter("indt_cd");
if( indt_cd == null){
	System.out.println(this.toString+" : indt_cd is null" );
}else{
	System.out.println(this.toString+" : indt_cd is "+indt_cd );
}
String sale_clsf = req.getParameter("sale_clsf");
if( sale_clsf == null){
	System.out.println(this.toString+" : sale_clsf is null" );
}else{
	System.out.println(this.toString+" : sale_clsf is "+sale_clsf );
}
String spc_sale_clsf = req.getParameter("spc_sale_clsf");
if( spc_sale_clsf == null){
	System.out.println(this.toString+" : spc_sale_clsf is null" );
}else{
	System.out.println(this.toString+" : spc_sale_clsf is "+spc_sale_clsf );
}
String indt_cls_cd = req.getParameter("indt_cls_cd");
if( indt_cls_cd == null){
	System.out.println(this.toString+" : indt_cls_cd is null" );
}else{
	System.out.println(this.toString+" : indt_cls_cd is "+indt_cls_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
String scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
String advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
String indt_cd = Util.checkString(req.getParameter("indt_cd"));
String sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
String spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
String indt_cls_cd = Util.checkString(req.getParameter("indt_cls_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String scat_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("scat_dt_fr")));
String scat_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("scat_dt_to")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd_seq")));
String advcs_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs_cd")));
String indt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_cd")));
String sale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_clsf")));
String spc_sale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_sale_clsf")));
String indt_cls_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_cls_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setScat_dt_fr(scat_dt_fr);
dm.setScat_dt_to(scat_dt_to);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setChrg_pers(chrg_pers);
dm.setDlco_clsf_cd_seq(dlco_clsf_cd_seq);
dm.setAdvcs_cd(advcs_cd);
dm.setIndt_cd(indt_cd);
dm.setSale_clsf(sale_clsf);
dm.setSpc_sale_clsf(spc_sale_clsf);
dm.setIndt_cls_cd(indt_cls_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jun 01 11:18:54 KST 2012 */