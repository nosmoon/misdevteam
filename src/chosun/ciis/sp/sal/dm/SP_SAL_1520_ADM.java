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


public class SP_SAL_1520_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sale_yymm;
	public String cta_rdr_extn_amt_clsf;
	public String cmpy_dlco_no;
	public String cmpy_dlco_nm;
	public String qty;
	public String sale_amt;
	public String dlco_no;
	public String dlco_nm;
	public String qty_2;
	public String dlv_fee;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SP_SAL_1520_ADM(){}
	public SP_SAL_1520_ADM(String cmpy_cd, String sale_yymm, String cta_rdr_extn_amt_clsf, String cmpy_dlco_no, String cmpy_dlco_nm, String qty, String sale_amt, String dlco_no, String dlco_nm, String qty_2, String dlv_fee, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.sale_yymm = sale_yymm;
		this.cta_rdr_extn_amt_clsf = cta_rdr_extn_amt_clsf;
		this.cmpy_dlco_no = cmpy_dlco_no;
		this.cmpy_dlco_nm = cmpy_dlco_nm;
		this.qty = qty;
		this.sale_amt = sale_amt;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.qty_2 = qty_2;
		this.dlv_fee = dlv_fee;
		this.incmg_pers_ip = incmg_pers_ip;
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

	public void setCmpy_dlco_no(String cmpy_dlco_no){
		this.cmpy_dlco_no = cmpy_dlco_no;
	}

	public void setCmpy_dlco_nm(String cmpy_dlco_nm){
		this.cmpy_dlco_nm = cmpy_dlco_nm;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setQty_2(String qty_2){
		this.qty_2 = qty_2;
	}

	public void setDlv_fee(String dlv_fee){
		this.dlv_fee = dlv_fee;
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

	public String getSale_yymm(){
		return this.sale_yymm;
	}

	public String getCta_rdr_extn_amt_clsf(){
		return this.cta_rdr_extn_amt_clsf;
	}

	public String getCmpy_dlco_no(){
		return this.cmpy_dlco_no;
	}

	public String getCmpy_dlco_nm(){
		return this.cmpy_dlco_nm;
	}

	public String getQty(){
		return this.qty;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getQty_2(){
		return this.qty_2;
	}

	public String getDlv_fee(){
		return this.dlv_fee;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_1520_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_1520_ADM dm = (SP_SAL_1520_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sale_yymm);
		cstmt.setString(5, dm.cta_rdr_extn_amt_clsf);
		cstmt.setString(6, dm.cmpy_dlco_no);
		cstmt.setString(7, dm.cmpy_dlco_nm);
		cstmt.setString(8, dm.qty);
		cstmt.setString(9, dm.sale_amt);
		cstmt.setString(10, dm.dlco_no);
		cstmt.setString(11, dm.dlco_nm);
		cstmt.setString(12, dm.qty_2);
		cstmt.setString(13, dm.dlv_fee);
		cstmt.setString(14, dm.incmg_pers_ip);
		cstmt.setString(15, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_1520_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sale_yymm = [" + getSale_yymm() + "]");
		System.out.println("cta_rdr_extn_amt_clsf = [" + getCta_rdr_extn_amt_clsf() + "]");
		System.out.println("cmpy_dlco_no = [" + getCmpy_dlco_no() + "]");
		System.out.println("cmpy_dlco_nm = [" + getCmpy_dlco_nm() + "]");
		System.out.println("qty = [" + getQty() + "]");
		System.out.println("sale_amt = [" + getSale_amt() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("qty_2 = [" + getQty_2() + "]");
		System.out.println("dlv_fee = [" + getDlv_fee() + "]");
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
String cmpy_dlco_no = req.getParameter("cmpy_dlco_no");
if( cmpy_dlco_no == null){
	System.out.println(this.toString+" : cmpy_dlco_no is null" );
}else{
	System.out.println(this.toString+" : cmpy_dlco_no is "+cmpy_dlco_no );
}
String cmpy_dlco_nm = req.getParameter("cmpy_dlco_nm");
if( cmpy_dlco_nm == null){
	System.out.println(this.toString+" : cmpy_dlco_nm is null" );
}else{
	System.out.println(this.toString+" : cmpy_dlco_nm is "+cmpy_dlco_nm );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String sale_amt = req.getParameter("sale_amt");
if( sale_amt == null){
	System.out.println(this.toString+" : sale_amt is null" );
}else{
	System.out.println(this.toString+" : sale_amt is "+sale_amt );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String qty_2 = req.getParameter("qty_2");
if( qty_2 == null){
	System.out.println(this.toString+" : qty_2 is null" );
}else{
	System.out.println(this.toString+" : qty_2 is "+qty_2 );
}
String dlv_fee = req.getParameter("dlv_fee");
if( dlv_fee == null){
	System.out.println(this.toString+" : dlv_fee is null" );
}else{
	System.out.println(this.toString+" : dlv_fee is "+dlv_fee );
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
String sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
String cta_rdr_extn_amt_clsf = Util.checkString(req.getParameter("cta_rdr_extn_amt_clsf"));
String cmpy_dlco_no = Util.checkString(req.getParameter("cmpy_dlco_no"));
String cmpy_dlco_nm = Util.checkString(req.getParameter("cmpy_dlco_nm"));
String qty = Util.checkString(req.getParameter("qty"));
String sale_amt = Util.checkString(req.getParameter("sale_amt"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String qty_2 = Util.checkString(req.getParameter("qty_2"));
String dlv_fee = Util.checkString(req.getParameter("dlv_fee"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sale_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_yymm")));
String cta_rdr_extn_amt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cta_rdr_extn_amt_clsf")));
String cmpy_dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_dlco_no")));
String cmpy_dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_dlco_nm")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String sale_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_amt")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String qty_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("qty_2")));
String dlv_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("dlv_fee")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSale_yymm(sale_yymm);
dm.setCta_rdr_extn_amt_clsf(cta_rdr_extn_amt_clsf);
dm.setCmpy_dlco_no(cmpy_dlco_no);
dm.setCmpy_dlco_nm(cmpy_dlco_nm);
dm.setQty(qty);
dm.setSale_amt(sale_amt);
dm.setDlco_no(dlco_no);
dm.setDlco_nm(dlco_nm);
dm.setQty_2(qty_2);
dm.setDlv_fee(dlv_fee);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jul 16 15:42:21 KST 2012 */