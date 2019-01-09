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


package chosun.ciis.sp.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.dep.ds.*;
import chosun.ciis.sp.dep.rec.*;

/**
 * 
 */


public class SP_DEP_1310_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sale_item_cd;
	public String basi_yymm;
	public String sp_comp_chrg_pers_emp_no;

	public SP_DEP_1310_LDM(){}
	public SP_DEP_1310_LDM(String cmpy_cd, String sale_item_cd, String basi_yymm, String sp_comp_chrg_pers_emp_no){
		this.cmpy_cd = cmpy_cd;
		this.sale_item_cd = sale_item_cd;
		this.basi_yymm = basi_yymm;
		this.sp_comp_chrg_pers_emp_no = sp_comp_chrg_pers_emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSale_item_cd(String sale_item_cd){
		this.sale_item_cd = sale_item_cd;
	}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setSp_comp_chrg_pers_emp_no(String sp_comp_chrg_pers_emp_no){
		this.sp_comp_chrg_pers_emp_no = sp_comp_chrg_pers_emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSale_item_cd(){
		return this.sale_item_cd;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getSp_comp_chrg_pers_emp_no(){
		return this.sp_comp_chrg_pers_emp_no;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_DEP_1310_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_DEP_1310_LDM dm = (SP_DEP_1310_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sale_item_cd);
		cstmt.setString(5, dm.basi_yymm);
		cstmt.setString(6, dm.sp_comp_chrg_pers_emp_no);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.dep.ds.SP_DEP_1310_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sale_item_cd = [" + getSale_item_cd() + "]");
		System.out.println("basi_yymm = [" + getBasi_yymm() + "]");
		System.out.println("sp_comp_chrg_pers_emp_no = [" + getSp_comp_chrg_pers_emp_no() + "]");
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
String sale_item_cd = req.getParameter("sale_item_cd");
if( sale_item_cd == null){
	System.out.println(this.toString+" : sale_item_cd is null" );
}else{
	System.out.println(this.toString+" : sale_item_cd is "+sale_item_cd );
}
String basi_yymm = req.getParameter("basi_yymm");
if( basi_yymm == null){
	System.out.println(this.toString+" : basi_yymm is null" );
}else{
	System.out.println(this.toString+" : basi_yymm is "+basi_yymm );
}
String sp_comp_chrg_pers_emp_no = req.getParameter("sp_comp_chrg_pers_emp_no");
if( sp_comp_chrg_pers_emp_no == null){
	System.out.println(this.toString+" : sp_comp_chrg_pers_emp_no is null" );
}else{
	System.out.println(this.toString+" : sp_comp_chrg_pers_emp_no is "+sp_comp_chrg_pers_emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));
String sp_comp_chrg_pers_emp_no = Util.checkString(req.getParameter("sp_comp_chrg_pers_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sale_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_item_cd")));
String basi_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_yymm")));
String sp_comp_chrg_pers_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("sp_comp_chrg_pers_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSale_item_cd(sale_item_cd);
dm.setBasi_yymm(basi_yymm);
dm.setSp_comp_chrg_pers_emp_no(sp_comp_chrg_pers_emp_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Aug 21 19:32:00 KST 2012 */