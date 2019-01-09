/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
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


public class SP_SAL_4020_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String work_yymm;
	public String proc_gubun;
	public String checked;
	public String sale_yymm;
	public String sale_seq;
	public String sale_item_cd;
	public String dlco_no;
	public String sale_cost;
	public String qunt;
	public String suply_amt;
	public String vat_amt;
	public String tot_rvord_amt;
	public String incmg_dept_cd;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SP_SAL_4020_ADM(){}
	public SP_SAL_4020_ADM(String cmpy_cd, String work_yymm, String proc_gubun, String checked, String sale_yymm, String sale_seq, String sale_item_cd, String dlco_no, String sale_cost, String qunt, String suply_amt, String vat_amt, String tot_rvord_amt, String incmg_dept_cd, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.work_yymm = work_yymm;
		this.proc_gubun = proc_gubun;
		this.checked = checked;
		this.sale_yymm = sale_yymm;
		this.sale_seq = sale_seq;
		this.sale_item_cd = sale_item_cd;
		this.dlco_no = dlco_no;
		this.sale_cost = sale_cost;
		this.qunt = qunt;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.tot_rvord_amt = tot_rvord_amt;
		this.incmg_dept_cd = incmg_dept_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setWork_yymm(String work_yymm){
		this.work_yymm = work_yymm;
	}

	public void setProc_gubun(String proc_gubun){
		this.proc_gubun = proc_gubun;
	}

	public void setChecked(String checked){
		this.checked = checked;
	}

	public void setSale_yymm(String sale_yymm){
		this.sale_yymm = sale_yymm;
	}

	public void setSale_seq(String sale_seq){
		this.sale_seq = sale_seq;
	}

	public void setSale_item_cd(String sale_item_cd){
		this.sale_item_cd = sale_item_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setSale_cost(String sale_cost){
		this.sale_cost = sale_cost;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setTot_rvord_amt(String tot_rvord_amt){
		this.tot_rvord_amt = tot_rvord_amt;
	}

	public void setIncmg_dept_cd(String incmg_dept_cd){
		this.incmg_dept_cd = incmg_dept_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getWork_yymm(){
		return this.work_yymm;
	}

	public String getProc_gubun(){
		return this.proc_gubun;
	}

	public String getChecked(){
		return this.checked;
	}

	public String getSale_yymm(){
		return this.sale_yymm;
	}

	public String getSale_seq(){
		return this.sale_seq;
	}

	public String getSale_item_cd(){
		return this.sale_item_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSale_cost(){
		return this.sale_cost;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getTot_rvord_amt(){
		return this.tot_rvord_amt;
	}

	public String getIncmg_dept_cd(){
		return this.incmg_dept_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_4020_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_4020_ADM dm = (SP_SAL_4020_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.work_yymm);
		cstmt.setString(5, dm.proc_gubun);
		cstmt.setString(6, dm.checked);
		cstmt.setString(7, dm.sale_yymm);
		cstmt.setString(8, dm.sale_seq);
		cstmt.setString(9, dm.sale_item_cd);
		cstmt.setString(10, dm.dlco_no);
		cstmt.setString(11, dm.sale_cost);
		cstmt.setString(12, dm.qunt);
		cstmt.setString(13, dm.suply_amt);
		cstmt.setString(14, dm.vat_amt);
		cstmt.setString(15, dm.tot_rvord_amt);
		cstmt.setString(16, dm.incmg_dept_cd);
		cstmt.setString(17, dm.incmg_pers);
		cstmt.setString(18, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_4020_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("work_yymm = [" + getWork_yymm() + "]");
		System.out.println("proc_gubun = [" + getProc_gubun() + "]");
		System.out.println("checked = [" + getChecked() + "]");
		System.out.println("sale_yymm = [" + getSale_yymm() + "]");
		System.out.println("sale_seq = [" + getSale_seq() + "]");
		System.out.println("sale_item_cd = [" + getSale_item_cd() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("sale_cost = [" + getSale_cost() + "]");
		System.out.println("qunt = [" + getQunt() + "]");
		System.out.println("suply_amt = [" + getSuply_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("tot_rvord_amt = [" + getTot_rvord_amt() + "]");
		System.out.println("incmg_dept_cd = [" + getIncmg_dept_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String work_yymm = req.getParameter("work_yymm");
if( work_yymm == null){
	System.out.println(this.toString+" : work_yymm is null" );
}else{
	System.out.println(this.toString+" : work_yymm is "+work_yymm );
}
String proc_gubun = req.getParameter("proc_gubun");
if( proc_gubun == null){
	System.out.println(this.toString+" : proc_gubun is null" );
}else{
	System.out.println(this.toString+" : proc_gubun is "+proc_gubun );
}
String checked = req.getParameter("checked");
if( checked == null){
	System.out.println(this.toString+" : checked is null" );
}else{
	System.out.println(this.toString+" : checked is "+checked );
}
String sale_yymm = req.getParameter("sale_yymm");
if( sale_yymm == null){
	System.out.println(this.toString+" : sale_yymm is null" );
}else{
	System.out.println(this.toString+" : sale_yymm is "+sale_yymm );
}
String sale_seq = req.getParameter("sale_seq");
if( sale_seq == null){
	System.out.println(this.toString+" : sale_seq is null" );
}else{
	System.out.println(this.toString+" : sale_seq is "+sale_seq );
}
String sale_item_cd = req.getParameter("sale_item_cd");
if( sale_item_cd == null){
	System.out.println(this.toString+" : sale_item_cd is null" );
}else{
	System.out.println(this.toString+" : sale_item_cd is "+sale_item_cd );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String sale_cost = req.getParameter("sale_cost");
if( sale_cost == null){
	System.out.println(this.toString+" : sale_cost is null" );
}else{
	System.out.println(this.toString+" : sale_cost is "+sale_cost );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
String suply_amt = req.getParameter("suply_amt");
if( suply_amt == null){
	System.out.println(this.toString+" : suply_amt is null" );
}else{
	System.out.println(this.toString+" : suply_amt is "+suply_amt );
}
String vat_amt = req.getParameter("vat_amt");
if( vat_amt == null){
	System.out.println(this.toString+" : vat_amt is null" );
}else{
	System.out.println(this.toString+" : vat_amt is "+vat_amt );
}
String tot_rvord_amt = req.getParameter("tot_rvord_amt");
if( tot_rvord_amt == null){
	System.out.println(this.toString+" : tot_rvord_amt is null" );
}else{
	System.out.println(this.toString+" : tot_rvord_amt is "+tot_rvord_amt );
}
String incmg_dept_cd = req.getParameter("incmg_dept_cd");
if( incmg_dept_cd == null){
	System.out.println(this.toString+" : incmg_dept_cd is null" );
}else{
	System.out.println(this.toString+" : incmg_dept_cd is "+incmg_dept_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String work_yymm = Util.checkString(req.getParameter("work_yymm"));
String proc_gubun = Util.checkString(req.getParameter("proc_gubun"));
String checked = Util.checkString(req.getParameter("checked"));
String sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
String sale_seq = Util.checkString(req.getParameter("sale_seq"));
String sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String sale_cost = Util.checkString(req.getParameter("sale_cost"));
String qunt = Util.checkString(req.getParameter("qunt"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String tot_rvord_amt = Util.checkString(req.getParameter("tot_rvord_amt"));
String incmg_dept_cd = Util.checkString(req.getParameter("incmg_dept_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String work_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("work_yymm")));
String proc_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_gubun")));
String checked = Util.Uni2Ksc(Util.checkString(req.getParameter("checked")));
String sale_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_yymm")));
String sale_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_seq")));
String sale_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_item_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String sale_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_cost")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String tot_rvord_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_rvord_amt")));
String incmg_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dept_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setWork_yymm(work_yymm);
dm.setProc_gubun(proc_gubun);
dm.setChecked(checked);
dm.setSale_yymm(sale_yymm);
dm.setSale_seq(sale_seq);
dm.setSale_item_cd(sale_item_cd);
dm.setDlco_no(dlco_no);
dm.setSale_cost(sale_cost);
dm.setQunt(qunt);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setTot_rvord_amt(tot_rvord_amt);
dm.setIncmg_dept_cd(incmg_dept_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 09 21:03:07 KST 2013 */