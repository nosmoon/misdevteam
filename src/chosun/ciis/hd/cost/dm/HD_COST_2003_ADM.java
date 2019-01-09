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


package chosun.ciis.hd.cost.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.cost.ds.*;
import chosun.ciis.hd.cost.rec.*;

/**
 * 
 */


public class HD_COST_2003_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String emp_no;
	public String flnm;
	public String subj_sel_dt;
	public String subj_sel_nm;
	public String itme_seq;
	public String cmr_man_nm;
	public String cmr_asst_man_nm;
	public String drvr_nm;
	public String etc;
	public String tot_nops;
	public String tot_amt;
	public String proc_amt;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String seq;
	public String occr_dt;
	public String medi_cd;
	public String dtl_medi_cd;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_COST_2003_ADM(){}
	public HD_COST_2003_ADM(String cmpy_cd, String mode, String emp_no, String flnm, String subj_sel_dt, String subj_sel_nm, String itme_seq, String cmr_man_nm, String cmr_asst_man_nm, String drvr_nm, String etc, String tot_nops, String tot_amt, String proc_amt, String dept_cd, String dty_cd, String posi_cd, String seq, String occr_dt, String medi_cd, String dtl_medi_cd, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.subj_sel_dt = subj_sel_dt;
		this.subj_sel_nm = subj_sel_nm;
		this.itme_seq = itme_seq;
		this.cmr_man_nm = cmr_man_nm;
		this.cmr_asst_man_nm = cmr_asst_man_nm;
		this.drvr_nm = drvr_nm;
		this.etc = etc;
		this.tot_nops = tot_nops;
		this.tot_amt = tot_amt;
		this.proc_amt = proc_amt;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.seq = seq;
		this.occr_dt = occr_dt;
		this.medi_cd = medi_cd;
		this.dtl_medi_cd = dtl_medi_cd;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setSubj_sel_dt(String subj_sel_dt){
		this.subj_sel_dt = subj_sel_dt;
	}

	public void setSubj_sel_nm(String subj_sel_nm){
		this.subj_sel_nm = subj_sel_nm;
	}

	public void setItme_seq(String itme_seq){
		this.itme_seq = itme_seq;
	}

	public void setCmr_man_nm(String cmr_man_nm){
		this.cmr_man_nm = cmr_man_nm;
	}

	public void setCmr_asst_man_nm(String cmr_asst_man_nm){
		this.cmr_asst_man_nm = cmr_asst_man_nm;
	}

	public void setDrvr_nm(String drvr_nm){
		this.drvr_nm = drvr_nm;
	}

	public void setEtc(String etc){
		this.etc = etc;
	}

	public void setTot_nops(String tot_nops){
		this.tot_nops = tot_nops;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setProc_amt(String proc_amt){
		this.proc_amt = proc_amt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtl_medi_cd(String dtl_medi_cd){
		this.dtl_medi_cd = dtl_medi_cd;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getSubj_sel_dt(){
		return this.subj_sel_dt;
	}

	public String getSubj_sel_nm(){
		return this.subj_sel_nm;
	}

	public String getItme_seq(){
		return this.itme_seq;
	}

	public String getCmr_man_nm(){
		return this.cmr_man_nm;
	}

	public String getCmr_asst_man_nm(){
		return this.cmr_asst_man_nm;
	}

	public String getDrvr_nm(){
		return this.drvr_nm;
	}

	public String getEtc(){
		return this.etc;
	}

	public String getTot_nops(){
		return this.tot_nops;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getProc_amt(){
		return this.proc_amt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtl_medi_cd(){
		return this.dtl_medi_cd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_COST_2003_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_COST_2003_ADM dm = (HD_COST_2003_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.subj_sel_dt);
		cstmt.setString(8, dm.subj_sel_nm);
		cstmt.setString(9, dm.itme_seq);
		cstmt.setString(10, dm.cmr_man_nm);
		cstmt.setString(11, dm.cmr_asst_man_nm);
		cstmt.setString(12, dm.drvr_nm);
		cstmt.setString(13, dm.etc);
		cstmt.setString(14, dm.tot_nops);
		cstmt.setString(15, dm.tot_amt);
		cstmt.setString(16, dm.proc_amt);
		cstmt.setString(17, dm.dept_cd);
		cstmt.setString(18, dm.dty_cd);
		cstmt.setString(19, dm.posi_cd);
		cstmt.setString(20, dm.seq);
		cstmt.setString(21, dm.occr_dt);
		cstmt.setString(22, dm.medi_cd);
		cstmt.setString(23, dm.dtl_medi_cd);
		cstmt.setString(24, dm.incmg_pers_ipadd);
		cstmt.setString(25, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.cost.ds.HD_COST_2003_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("subj_sel_dt = [" + getSubj_sel_dt() + "]");
		System.out.println("subj_sel_nm = [" + getSubj_sel_nm() + "]");
		System.out.println("itme_seq = [" + getItme_seq() + "]");
		System.out.println("cmr_man_nm = [" + getCmr_man_nm() + "]");
		System.out.println("cmr_asst_man_nm = [" + getCmr_asst_man_nm() + "]");
		System.out.println("drvr_nm = [" + getDrvr_nm() + "]");
		System.out.println("etc = [" + getEtc() + "]");
		System.out.println("tot_nops = [" + getTot_nops() + "]");
		System.out.println("tot_amt = [" + getTot_amt() + "]");
		System.out.println("proc_amt = [" + getProc_amt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dtl_medi_cd = [" + getDtl_medi_cd() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String subj_sel_dt = req.getParameter("subj_sel_dt");
if( subj_sel_dt == null){
	System.out.println(this.toString+" : subj_sel_dt is null" );
}else{
	System.out.println(this.toString+" : subj_sel_dt is "+subj_sel_dt );
}
String subj_sel_nm = req.getParameter("subj_sel_nm");
if( subj_sel_nm == null){
	System.out.println(this.toString+" : subj_sel_nm is null" );
}else{
	System.out.println(this.toString+" : subj_sel_nm is "+subj_sel_nm );
}
String itme_seq = req.getParameter("itme_seq");
if( itme_seq == null){
	System.out.println(this.toString+" : itme_seq is null" );
}else{
	System.out.println(this.toString+" : itme_seq is "+itme_seq );
}
String cmr_man_nm = req.getParameter("cmr_man_nm");
if( cmr_man_nm == null){
	System.out.println(this.toString+" : cmr_man_nm is null" );
}else{
	System.out.println(this.toString+" : cmr_man_nm is "+cmr_man_nm );
}
String cmr_asst_man_nm = req.getParameter("cmr_asst_man_nm");
if( cmr_asst_man_nm == null){
	System.out.println(this.toString+" : cmr_asst_man_nm is null" );
}else{
	System.out.println(this.toString+" : cmr_asst_man_nm is "+cmr_asst_man_nm );
}
String drvr_nm = req.getParameter("drvr_nm");
if( drvr_nm == null){
	System.out.println(this.toString+" : drvr_nm is null" );
}else{
	System.out.println(this.toString+" : drvr_nm is "+drvr_nm );
}
String etc = req.getParameter("etc");
if( etc == null){
	System.out.println(this.toString+" : etc is null" );
}else{
	System.out.println(this.toString+" : etc is "+etc );
}
String tot_nops = req.getParameter("tot_nops");
if( tot_nops == null){
	System.out.println(this.toString+" : tot_nops is null" );
}else{
	System.out.println(this.toString+" : tot_nops is "+tot_nops );
}
String tot_amt = req.getParameter("tot_amt");
if( tot_amt == null){
	System.out.println(this.toString+" : tot_amt is null" );
}else{
	System.out.println(this.toString+" : tot_amt is "+tot_amt );
}
String proc_amt = req.getParameter("proc_amt");
if( proc_amt == null){
	System.out.println(this.toString+" : proc_amt is null" );
}else{
	System.out.println(this.toString+" : proc_amt is "+proc_amt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dtl_medi_cd = req.getParameter("dtl_medi_cd");
if( dtl_medi_cd == null){
	System.out.println(this.toString+" : dtl_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtl_medi_cd is "+dtl_medi_cd );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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
String mode = Util.checkString(req.getParameter("mode"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String subj_sel_dt = Util.checkString(req.getParameter("subj_sel_dt"));
String subj_sel_nm = Util.checkString(req.getParameter("subj_sel_nm"));
String itme_seq = Util.checkString(req.getParameter("itme_seq"));
String cmr_man_nm = Util.checkString(req.getParameter("cmr_man_nm"));
String cmr_asst_man_nm = Util.checkString(req.getParameter("cmr_asst_man_nm"));
String drvr_nm = Util.checkString(req.getParameter("drvr_nm"));
String etc = Util.checkString(req.getParameter("etc"));
String tot_nops = Util.checkString(req.getParameter("tot_nops"));
String tot_amt = Util.checkString(req.getParameter("tot_amt"));
String proc_amt = Util.checkString(req.getParameter("proc_amt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dtl_medi_cd = Util.checkString(req.getParameter("dtl_medi_cd"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String subj_sel_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("subj_sel_dt")));
String subj_sel_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("subj_sel_nm")));
String itme_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("itme_seq")));
String cmr_man_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cmr_man_nm")));
String cmr_asst_man_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cmr_asst_man_nm")));
String drvr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("drvr_nm")));
String etc = Util.Uni2Ksc(Util.checkString(req.getParameter("etc")));
String tot_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_nops")));
String tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_amt")));
String proc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_amt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dtl_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtl_medi_cd")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setSubj_sel_dt(subj_sel_dt);
dm.setSubj_sel_nm(subj_sel_nm);
dm.setItme_seq(itme_seq);
dm.setCmr_man_nm(cmr_man_nm);
dm.setCmr_asst_man_nm(cmr_asst_man_nm);
dm.setDrvr_nm(drvr_nm);
dm.setEtc(etc);
dm.setTot_nops(tot_nops);
dm.setTot_amt(tot_amt);
dm.setProc_amt(proc_amt);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
dm.setMedi_cd(medi_cd);
dm.setDtl_medi_cd(dtl_medi_cd);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jul 23 16:24:26 KST 2012 */