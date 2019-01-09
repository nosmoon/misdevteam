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


package chosun.ciis.is.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.ds.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_4310_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String frdt;
	public String todt;
	public String bank_cd;
	public String note_clsf_cd;
	public String issu_cmpy_clsf_cd;
	public String issu_pers_nm;
	public String rcpm_acct;
	public String sale_aprv_no;
	public String reg_yn;

	public IS_DEP_4310_LDM(){}
	public IS_DEP_4310_LDM(String cmpy_cd, String frdt, String todt, String bank_cd, String note_clsf_cd, String issu_cmpy_clsf_cd, String issu_pers_nm, String rcpm_acct, String sale_aprv_no, String reg_yn){
		this.cmpy_cd = cmpy_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.bank_cd = bank_cd;
		this.note_clsf_cd = note_clsf_cd;
		this.issu_cmpy_clsf_cd = issu_cmpy_clsf_cd;
		this.issu_pers_nm = issu_pers_nm;
		this.rcpm_acct = rcpm_acct;
		this.sale_aprv_no = sale_aprv_no;
		this.reg_yn = reg_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setIssu_cmpy_clsf_cd(String issu_cmpy_clsf_cd){
		this.issu_cmpy_clsf_cd = issu_cmpy_clsf_cd;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setRcpm_acct(String rcpm_acct){
		this.rcpm_acct = rcpm_acct;
	}

	public void setSale_aprv_no(String sale_aprv_no){
		this.sale_aprv_no = sale_aprv_no;
	}

	public void setReg_yn(String reg_yn){
		this.reg_yn = reg_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getIssu_cmpy_clsf_cd(){
		return this.issu_cmpy_clsf_cd;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getRcpm_acct(){
		return this.rcpm_acct;
	}

	public String getSale_aprv_no(){
		return this.sale_aprv_no;
	}

	public String getReg_yn(){
		return this.reg_yn;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_4310_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_4310_LDM dm = (IS_DEP_4310_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.frdt);
		cstmt.setString(5, dm.todt);
		cstmt.setString(6, dm.bank_cd);
		cstmt.setString(7, dm.note_clsf_cd);
		cstmt.setString(8, dm.issu_cmpy_clsf_cd);
		cstmt.setString(9, dm.issu_pers_nm);
		cstmt.setString(10, dm.rcpm_acct);
		cstmt.setString(11, dm.sale_aprv_no);
		cstmt.setString(12, dm.reg_yn);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_4310_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("note_clsf_cd = [" + getNote_clsf_cd() + "]");
		System.out.println("issu_cmpy_clsf_cd = [" + getIssu_cmpy_clsf_cd() + "]");
		System.out.println("issu_pers_nm = [" + getIssu_pers_nm() + "]");
		System.out.println("rcpm_acct = [" + getRcpm_acct() + "]");
		System.out.println("sale_aprv_no = [" + getSale_aprv_no() + "]");
		System.out.println("reg_yn = [" + getReg_yn() + "]");
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
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String note_clsf_cd = req.getParameter("note_clsf_cd");
if( note_clsf_cd == null){
	System.out.println(this.toString+" : note_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : note_clsf_cd is "+note_clsf_cd );
}
String issu_cmpy_clsf_cd = req.getParameter("issu_cmpy_clsf_cd");
if( issu_cmpy_clsf_cd == null){
	System.out.println(this.toString+" : issu_cmpy_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : issu_cmpy_clsf_cd is "+issu_cmpy_clsf_cd );
}
String issu_pers_nm = req.getParameter("issu_pers_nm");
if( issu_pers_nm == null){
	System.out.println(this.toString+" : issu_pers_nm is null" );
}else{
	System.out.println(this.toString+" : issu_pers_nm is "+issu_pers_nm );
}
String rcpm_acct = req.getParameter("rcpm_acct");
if( rcpm_acct == null){
	System.out.println(this.toString+" : rcpm_acct is null" );
}else{
	System.out.println(this.toString+" : rcpm_acct is "+rcpm_acct );
}
String sale_aprv_no = req.getParameter("sale_aprv_no");
if( sale_aprv_no == null){
	System.out.println(this.toString+" : sale_aprv_no is null" );
}else{
	System.out.println(this.toString+" : sale_aprv_no is "+sale_aprv_no );
}
String reg_yn = req.getParameter("reg_yn");
if( reg_yn == null){
	System.out.println(this.toString+" : reg_yn is null" );
}else{
	System.out.println(this.toString+" : reg_yn is "+reg_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
String issu_cmpy_clsf_cd = Util.checkString(req.getParameter("issu_cmpy_clsf_cd"));
String issu_pers_nm = Util.checkString(req.getParameter("issu_pers_nm"));
String rcpm_acct = Util.checkString(req.getParameter("rcpm_acct"));
String sale_aprv_no = Util.checkString(req.getParameter("sale_aprv_no"));
String reg_yn = Util.checkString(req.getParameter("reg_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String note_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("note_clsf_cd")));
String issu_cmpy_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_cmpy_clsf_cd")));
String issu_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pers_nm")));
String rcpm_acct = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_acct")));
String sale_aprv_no = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_aprv_no")));
String reg_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setBank_cd(bank_cd);
dm.setNote_clsf_cd(note_clsf_cd);
dm.setIssu_cmpy_clsf_cd(issu_cmpy_clsf_cd);
dm.setIssu_pers_nm(issu_pers_nm);
dm.setRcpm_acct(rcpm_acct);
dm.setSale_aprv_no(sale_aprv_no);
dm.setReg_yn(reg_yn);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 16 19:49:37 KST 2012 */