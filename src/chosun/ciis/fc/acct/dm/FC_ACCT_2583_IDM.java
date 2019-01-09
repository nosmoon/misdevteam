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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2583_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String fisc_dt;
	public String rmks1;
	public String work_flag;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String grid1_mode;
	public String grid1_rownum;
	public String grid1_drcr_clsf_cd;
	public String grid1_budg_cd;
	public String grid1_mang_clsf_cd;
	public String grid1_dr_amt;
	public String grid1_crdt_amt;
	public String grid1_rmks2;
	public String grid1_dlco_clsf_cd;
	public String grid1_dlco_cd;
	public String grid1_dlco_nm;
	public String grid1_boks_dlco_nm;

	public FC_ACCT_2583_IDM(){}
	public FC_ACCT_2583_IDM(String cmpy_cd, String slip_occr_dt, String slip_clsf_cd, String fisc_dt, String rmks1, String work_flag, String incmg_pers, String incmg_pers_ipadd, String grid1_mode, String grid1_rownum, String grid1_drcr_clsf_cd, String grid1_budg_cd, String grid1_mang_clsf_cd, String grid1_dr_amt, String grid1_crdt_amt, String grid1_rmks2, String grid1_dlco_clsf_cd, String grid1_dlco_cd, String grid1_dlco_nm, String grid1_boks_dlco_nm){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.fisc_dt = fisc_dt;
		this.rmks1 = rmks1;
		this.work_flag = work_flag;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.grid1_mode = grid1_mode;
		this.grid1_rownum = grid1_rownum;
		this.grid1_drcr_clsf_cd = grid1_drcr_clsf_cd;
		this.grid1_budg_cd = grid1_budg_cd;
		this.grid1_mang_clsf_cd = grid1_mang_clsf_cd;
		this.grid1_dr_amt = grid1_dr_amt;
		this.grid1_crdt_amt = grid1_crdt_amt;
		this.grid1_rmks2 = grid1_rmks2;
		this.grid1_dlco_clsf_cd = grid1_dlco_clsf_cd;
		this.grid1_dlco_cd = grid1_dlco_cd;
		this.grid1_dlco_nm = grid1_dlco_nm;
		this.grid1_boks_dlco_nm = grid1_boks_dlco_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setWork_flag(String work_flag){
		this.work_flag = work_flag;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setGrid1_mode(String grid1_mode){
		this.grid1_mode = grid1_mode;
	}

	public void setGrid1_rownum(String grid1_rownum){
		this.grid1_rownum = grid1_rownum;
	}

	public void setGrid1_drcr_clsf_cd(String grid1_drcr_clsf_cd){
		this.grid1_drcr_clsf_cd = grid1_drcr_clsf_cd;
	}

	public void setGrid1_budg_cd(String grid1_budg_cd){
		this.grid1_budg_cd = grid1_budg_cd;
	}

	public void setGrid1_mang_clsf_cd(String grid1_mang_clsf_cd){
		this.grid1_mang_clsf_cd = grid1_mang_clsf_cd;
	}

	public void setGrid1_dr_amt(String grid1_dr_amt){
		this.grid1_dr_amt = grid1_dr_amt;
	}

	public void setGrid1_crdt_amt(String grid1_crdt_amt){
		this.grid1_crdt_amt = grid1_crdt_amt;
	}

	public void setGrid1_rmks2(String grid1_rmks2){
		this.grid1_rmks2 = grid1_rmks2;
	}

	public void setGrid1_dlco_clsf_cd(String grid1_dlco_clsf_cd){
		this.grid1_dlco_clsf_cd = grid1_dlco_clsf_cd;
	}

	public void setGrid1_dlco_cd(String grid1_dlco_cd){
		this.grid1_dlco_cd = grid1_dlco_cd;
	}

	public void setGrid1_dlco_nm(String grid1_dlco_nm){
		this.grid1_dlco_nm = grid1_dlco_nm;
	}

	public void setGrid1_boks_dlco_nm(String grid1_boks_dlco_nm){
		this.grid1_boks_dlco_nm = grid1_boks_dlco_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getWork_flag(){
		return this.work_flag;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getGrid1_mode(){
		return this.grid1_mode;
	}

	public String getGrid1_rownum(){
		return this.grid1_rownum;
	}

	public String getGrid1_drcr_clsf_cd(){
		return this.grid1_drcr_clsf_cd;
	}

	public String getGrid1_budg_cd(){
		return this.grid1_budg_cd;
	}

	public String getGrid1_mang_clsf_cd(){
		return this.grid1_mang_clsf_cd;
	}

	public String getGrid1_dr_amt(){
		return this.grid1_dr_amt;
	}

	public String getGrid1_crdt_amt(){
		return this.grid1_crdt_amt;
	}

	public String getGrid1_rmks2(){
		return this.grid1_rmks2;
	}

	public String getGrid1_dlco_clsf_cd(){
		return this.grid1_dlco_clsf_cd;
	}

	public String getGrid1_dlco_cd(){
		return this.grid1_dlco_cd;
	}

	public String getGrid1_dlco_nm(){
		return this.grid1_dlco_nm;
	}

	public String getGrid1_boks_dlco_nm(){
		return this.grid1_boks_dlco_nm;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2583_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2583_IDM dm = (FC_ACCT_2583_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_dt);
		cstmt.setString(5, dm.slip_clsf_cd);
		cstmt.setString(6, dm.fisc_dt);
		cstmt.setString(7, dm.rmks1);
		cstmt.setString(8, dm.work_flag);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.setString(10, dm.incmg_pers_ipadd);
		cstmt.setString(11, dm.grid1_mode);
		cstmt.setString(12, dm.grid1_rownum);
		cstmt.setString(13, dm.grid1_drcr_clsf_cd);
		cstmt.setString(14, dm.grid1_budg_cd);
		cstmt.setString(15, dm.grid1_mang_clsf_cd);
		cstmt.setString(16, dm.grid1_dr_amt);
		cstmt.setString(17, dm.grid1_crdt_amt);
		cstmt.setString(18, dm.grid1_rmks2);
		cstmt.setString(19, dm.grid1_dlco_clsf_cd);
		cstmt.setString(20, dm.grid1_dlco_cd);
		cstmt.setString(21, dm.grid1_dlco_nm);
		cstmt.setString(22, dm.grid1_boks_dlco_nm);
		cstmt.registerOutParameter(23, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2583_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("fisc_dt = [" + getFisc_dt() + "]");
		System.out.println("rmks1 = [" + getRmks1() + "]");
		System.out.println("work_flag = [" + getWork_flag() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("grid1_mode = [" + getGrid1_mode() + "]");
		System.out.println("grid1_rownum = [" + getGrid1_rownum() + "]");
		System.out.println("grid1_drcr_clsf_cd = [" + getGrid1_drcr_clsf_cd() + "]");
		System.out.println("grid1_budg_cd = [" + getGrid1_budg_cd() + "]");
		System.out.println("grid1_mang_clsf_cd = [" + getGrid1_mang_clsf_cd() + "]");
		System.out.println("grid1_dr_amt = [" + getGrid1_dr_amt() + "]");
		System.out.println("grid1_crdt_amt = [" + getGrid1_crdt_amt() + "]");
		System.out.println("grid1_rmks2 = [" + getGrid1_rmks2() + "]");
		System.out.println("grid1_dlco_clsf_cd = [" + getGrid1_dlco_clsf_cd() + "]");
		System.out.println("grid1_dlco_cd = [" + getGrid1_dlco_cd() + "]");
		System.out.println("grid1_dlco_nm = [" + getGrid1_dlco_nm() + "]");
		System.out.println("grid1_boks_dlco_nm = [" + getGrid1_boks_dlco_nm() + "]");
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
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String fisc_dt = req.getParameter("fisc_dt");
if( fisc_dt == null){
	System.out.println(this.toString+" : fisc_dt is null" );
}else{
	System.out.println(this.toString+" : fisc_dt is "+fisc_dt );
}
String rmks1 = req.getParameter("rmks1");
if( rmks1 == null){
	System.out.println(this.toString+" : rmks1 is null" );
}else{
	System.out.println(this.toString+" : rmks1 is "+rmks1 );
}
String work_flag = req.getParameter("work_flag");
if( work_flag == null){
	System.out.println(this.toString+" : work_flag is null" );
}else{
	System.out.println(this.toString+" : work_flag is "+work_flag );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String grid1_mode = req.getParameter("grid1_mode");
if( grid1_mode == null){
	System.out.println(this.toString+" : grid1_mode is null" );
}else{
	System.out.println(this.toString+" : grid1_mode is "+grid1_mode );
}
String grid1_rownum = req.getParameter("grid1_rownum");
if( grid1_rownum == null){
	System.out.println(this.toString+" : grid1_rownum is null" );
}else{
	System.out.println(this.toString+" : grid1_rownum is "+grid1_rownum );
}
String grid1_drcr_clsf_cd = req.getParameter("grid1_drcr_clsf_cd");
if( grid1_drcr_clsf_cd == null){
	System.out.println(this.toString+" : grid1_drcr_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : grid1_drcr_clsf_cd is "+grid1_drcr_clsf_cd );
}
String grid1_budg_cd = req.getParameter("grid1_budg_cd");
if( grid1_budg_cd == null){
	System.out.println(this.toString+" : grid1_budg_cd is null" );
}else{
	System.out.println(this.toString+" : grid1_budg_cd is "+grid1_budg_cd );
}
String grid1_mang_clsf_cd = req.getParameter("grid1_mang_clsf_cd");
if( grid1_mang_clsf_cd == null){
	System.out.println(this.toString+" : grid1_mang_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : grid1_mang_clsf_cd is "+grid1_mang_clsf_cd );
}
String grid1_dr_amt = req.getParameter("grid1_dr_amt");
if( grid1_dr_amt == null){
	System.out.println(this.toString+" : grid1_dr_amt is null" );
}else{
	System.out.println(this.toString+" : grid1_dr_amt is "+grid1_dr_amt );
}
String grid1_crdt_amt = req.getParameter("grid1_crdt_amt");
if( grid1_crdt_amt == null){
	System.out.println(this.toString+" : grid1_crdt_amt is null" );
}else{
	System.out.println(this.toString+" : grid1_crdt_amt is "+grid1_crdt_amt );
}
String grid1_rmks2 = req.getParameter("grid1_rmks2");
if( grid1_rmks2 == null){
	System.out.println(this.toString+" : grid1_rmks2 is null" );
}else{
	System.out.println(this.toString+" : grid1_rmks2 is "+grid1_rmks2 );
}
String grid1_dlco_clsf_cd = req.getParameter("grid1_dlco_clsf_cd");
if( grid1_dlco_clsf_cd == null){
	System.out.println(this.toString+" : grid1_dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : grid1_dlco_clsf_cd is "+grid1_dlco_clsf_cd );
}
String grid1_dlco_cd = req.getParameter("grid1_dlco_cd");
if( grid1_dlco_cd == null){
	System.out.println(this.toString+" : grid1_dlco_cd is null" );
}else{
	System.out.println(this.toString+" : grid1_dlco_cd is "+grid1_dlco_cd );
}
String grid1_dlco_nm = req.getParameter("grid1_dlco_nm");
if( grid1_dlco_nm == null){
	System.out.println(this.toString+" : grid1_dlco_nm is null" );
}else{
	System.out.println(this.toString+" : grid1_dlco_nm is "+grid1_dlco_nm );
}
String grid1_boks_dlco_nm = req.getParameter("grid1_boks_dlco_nm");
if( grid1_boks_dlco_nm == null){
	System.out.println(this.toString+" : grid1_boks_dlco_nm is null" );
}else{
	System.out.println(this.toString+" : grid1_boks_dlco_nm is "+grid1_boks_dlco_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
String rmks1 = Util.checkString(req.getParameter("rmks1"));
String work_flag = Util.checkString(req.getParameter("work_flag"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String grid1_mode = Util.checkString(req.getParameter("grid1_mode"));
String grid1_rownum = Util.checkString(req.getParameter("grid1_rownum"));
String grid1_drcr_clsf_cd = Util.checkString(req.getParameter("grid1_drcr_clsf_cd"));
String grid1_budg_cd = Util.checkString(req.getParameter("grid1_budg_cd"));
String grid1_mang_clsf_cd = Util.checkString(req.getParameter("grid1_mang_clsf_cd"));
String grid1_dr_amt = Util.checkString(req.getParameter("grid1_dr_amt"));
String grid1_crdt_amt = Util.checkString(req.getParameter("grid1_crdt_amt"));
String grid1_rmks2 = Util.checkString(req.getParameter("grid1_rmks2"));
String grid1_dlco_clsf_cd = Util.checkString(req.getParameter("grid1_dlco_clsf_cd"));
String grid1_dlco_cd = Util.checkString(req.getParameter("grid1_dlco_cd"));
String grid1_dlco_nm = Util.checkString(req.getParameter("grid1_dlco_nm"));
String grid1_boks_dlco_nm = Util.checkString(req.getParameter("grid1_boks_dlco_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt")));
String rmks1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks1")));
String work_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("work_flag")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String grid1_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_mode")));
String grid1_rownum = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_rownum")));
String grid1_drcr_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_drcr_clsf_cd")));
String grid1_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_budg_cd")));
String grid1_mang_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_mang_clsf_cd")));
String grid1_dr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_dr_amt")));
String grid1_crdt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_crdt_amt")));
String grid1_rmks2 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_rmks2")));
String grid1_dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_dlco_clsf_cd")));
String grid1_dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_dlco_cd")));
String grid1_dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_dlco_nm")));
String grid1_boks_dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_boks_dlco_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setFisc_dt(fisc_dt);
dm.setRmks1(rmks1);
dm.setWork_flag(work_flag);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setGrid1_mode(grid1_mode);
dm.setGrid1_rownum(grid1_rownum);
dm.setGrid1_drcr_clsf_cd(grid1_drcr_clsf_cd);
dm.setGrid1_budg_cd(grid1_budg_cd);
dm.setGrid1_mang_clsf_cd(grid1_mang_clsf_cd);
dm.setGrid1_dr_amt(grid1_dr_amt);
dm.setGrid1_crdt_amt(grid1_crdt_amt);
dm.setGrid1_rmks2(grid1_rmks2);
dm.setGrid1_dlco_clsf_cd(grid1_dlco_clsf_cd);
dm.setGrid1_dlco_cd(grid1_dlco_cd);
dm.setGrid1_dlco_nm(grid1_dlco_nm);
dm.setGrid1_boks_dlco_nm(grid1_boks_dlco_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 11 16:06:45 KST 2009 */