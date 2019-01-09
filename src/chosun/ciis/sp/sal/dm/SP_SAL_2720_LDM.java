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


public class SP_SAL_2720_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sale_yymm_fr;
	public String sale_yymm_to;
	public String sp_comp_chrg_pers_emp_no;
	public String sale_item_kind;

	public SP_SAL_2720_LDM(){}
	public SP_SAL_2720_LDM(String cmpy_cd, String sale_yymm_fr, String sale_yymm_to, String sp_comp_chrg_pers_emp_no, String sale_item_kind){
		this.cmpy_cd = cmpy_cd;
		this.sale_yymm_fr = sale_yymm_fr;
		this.sale_yymm_to = sale_yymm_to;
		this.sp_comp_chrg_pers_emp_no = sp_comp_chrg_pers_emp_no;
		this.sale_item_kind = sale_item_kind;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSale_yymm_fr(String sale_yymm_fr){
		this.sale_yymm_fr = sale_yymm_fr;
	}

	public void setSale_yymm_to(String sale_yymm_to){
		this.sale_yymm_to = sale_yymm_to;
	}

	public void setSp_comp_chrg_pers_emp_no(String sp_comp_chrg_pers_emp_no){
		this.sp_comp_chrg_pers_emp_no = sp_comp_chrg_pers_emp_no;
	}

	public void setSale_item_kind(String sale_item_kind){
		this.sale_item_kind = sale_item_kind;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSale_yymm_fr(){
		return this.sale_yymm_fr;
	}

	public String getSale_yymm_to(){
		return this.sale_yymm_to;
	}

	public String getSp_comp_chrg_pers_emp_no(){
		return this.sp_comp_chrg_pers_emp_no;
	}

	public String getSale_item_kind(){
		return this.sale_item_kind;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_2720_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_2720_LDM dm = (SP_SAL_2720_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sale_yymm_fr);
		cstmt.setString(5, dm.sale_yymm_to);
		cstmt.setString(6, dm.sp_comp_chrg_pers_emp_no);
		cstmt.setString(7, dm.sale_item_kind);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_2720_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sale_yymm_fr = [" + getSale_yymm_fr() + "]");
		System.out.println("sale_yymm_to = [" + getSale_yymm_to() + "]");
		System.out.println("sp_comp_chrg_pers_emp_no = [" + getSp_comp_chrg_pers_emp_no() + "]");
		System.out.println("sale_item_kind = [" + getSale_item_kind() + "]");
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
String sale_yymm_fr = req.getParameter("sale_yymm_fr");
if( sale_yymm_fr == null){
	System.out.println(this.toString+" : sale_yymm_fr is null" );
}else{
	System.out.println(this.toString+" : sale_yymm_fr is "+sale_yymm_fr );
}
String sale_yymm_to = req.getParameter("sale_yymm_to");
if( sale_yymm_to == null){
	System.out.println(this.toString+" : sale_yymm_to is null" );
}else{
	System.out.println(this.toString+" : sale_yymm_to is "+sale_yymm_to );
}
String sp_comp_chrg_pers_emp_no = req.getParameter("sp_comp_chrg_pers_emp_no");
if( sp_comp_chrg_pers_emp_no == null){
	System.out.println(this.toString+" : sp_comp_chrg_pers_emp_no is null" );
}else{
	System.out.println(this.toString+" : sp_comp_chrg_pers_emp_no is "+sp_comp_chrg_pers_emp_no );
}
String sale_item_kind = req.getParameter("sale_item_kind");
if( sale_item_kind == null){
	System.out.println(this.toString+" : sale_item_kind is null" );
}else{
	System.out.println(this.toString+" : sale_item_kind is "+sale_item_kind );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String sale_yymm_fr = Util.checkString(req.getParameter("sale_yymm_fr"));
String sale_yymm_to = Util.checkString(req.getParameter("sale_yymm_to"));
String sp_comp_chrg_pers_emp_no = Util.checkString(req.getParameter("sp_comp_chrg_pers_emp_no"));
String sale_item_kind = Util.checkString(req.getParameter("sale_item_kind"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sale_yymm_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_yymm_fr")));
String sale_yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_yymm_to")));
String sp_comp_chrg_pers_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("sp_comp_chrg_pers_emp_no")));
String sale_item_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_item_kind")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSale_yymm_fr(sale_yymm_fr);
dm.setSale_yymm_to(sale_yymm_to);
dm.setSp_comp_chrg_pers_emp_no(sp_comp_chrg_pers_emp_no);
dm.setSale_item_kind(sale_item_kind);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Aug 21 20:49:34 KST 2012 */