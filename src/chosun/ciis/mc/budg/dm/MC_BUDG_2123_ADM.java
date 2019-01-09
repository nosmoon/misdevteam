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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_2123_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String work_no_inc;
	public String budg_yyyy;
	public String dept_cd;
	public String work_no;
	public String evnt_cd;
	public String use_dept_cd;
	public String medi_cd;
	public String crte_clsf;
	public String grid1_mode;
	public String grid1_rownum;
	public String grid1_seq;
	public String grid1_budg_cd;
	public String grid1_rmks;
	public String grid1_req_amt_01;
	public String grid1_fix_amt_01;
	public String grid1_req_amt_02;
	public String grid1_fix_amt_02;
	public String grid1_req_amt_03;
	public String grid1_fix_amt_03;
	public String grid1_req_amt_04;
	public String grid1_fix_amt_04;
	public String grid1_req_amt_05;
	public String grid1_fix_amt_05;
	public String grid1_req_amt_06;
	public String grid1_fix_amt_06;
	public String grid1_req_amt_07;
	public String grid1_fix_amt_07;
	public String grid1_req_amt_08;
	public String grid1_fix_amt_08;
	public String grid1_req_amt_09;
	public String grid1_fix_amt_09;
	public String grid1_req_amt_10;
	public String grid1_fix_amt_10;
	public String grid1_req_amt_11;
	public String grid1_fix_amt_11;
	public String grid1_req_amt_12;
	public String grid1_fix_amt_12;
	public String incmg_pers;
	public String chg_pers;
	public String incmg_pers_ipadd;

	public MC_BUDG_2123_ADM(){}
	public MC_BUDG_2123_ADM(String cmpy_cd, String work_no_inc, String budg_yyyy, String dept_cd, String work_no, String evnt_cd, String use_dept_cd, String medi_cd, String crte_clsf, String grid1_mode, String grid1_rownum, String grid1_seq, String grid1_budg_cd, String grid1_rmks, String grid1_req_amt_01, String grid1_fix_amt_01, String grid1_req_amt_02, String grid1_fix_amt_02, String grid1_req_amt_03, String grid1_fix_amt_03, String grid1_req_amt_04, String grid1_fix_amt_04, String grid1_req_amt_05, String grid1_fix_amt_05, String grid1_req_amt_06, String grid1_fix_amt_06, String grid1_req_amt_07, String grid1_fix_amt_07, String grid1_req_amt_08, String grid1_fix_amt_08, String grid1_req_amt_09, String grid1_fix_amt_09, String grid1_req_amt_10, String grid1_fix_amt_10, String grid1_req_amt_11, String grid1_fix_amt_11, String grid1_req_amt_12, String grid1_fix_amt_12, String incmg_pers, String chg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.work_no_inc = work_no_inc;
		this.budg_yyyy = budg_yyyy;
		this.dept_cd = dept_cd;
		this.work_no = work_no;
		this.evnt_cd = evnt_cd;
		this.use_dept_cd = use_dept_cd;
		this.medi_cd = medi_cd;
		this.crte_clsf = crte_clsf;
		this.grid1_mode = grid1_mode;
		this.grid1_rownum = grid1_rownum;
		this.grid1_seq = grid1_seq;
		this.grid1_budg_cd = grid1_budg_cd;
		this.grid1_rmks = grid1_rmks;
		this.grid1_req_amt_01 = grid1_req_amt_01;
		this.grid1_fix_amt_01 = grid1_fix_amt_01;
		this.grid1_req_amt_02 = grid1_req_amt_02;
		this.grid1_fix_amt_02 = grid1_fix_amt_02;
		this.grid1_req_amt_03 = grid1_req_amt_03;
		this.grid1_fix_amt_03 = grid1_fix_amt_03;
		this.grid1_req_amt_04 = grid1_req_amt_04;
		this.grid1_fix_amt_04 = grid1_fix_amt_04;
		this.grid1_req_amt_05 = grid1_req_amt_05;
		this.grid1_fix_amt_05 = grid1_fix_amt_05;
		this.grid1_req_amt_06 = grid1_req_amt_06;
		this.grid1_fix_amt_06 = grid1_fix_amt_06;
		this.grid1_req_amt_07 = grid1_req_amt_07;
		this.grid1_fix_amt_07 = grid1_fix_amt_07;
		this.grid1_req_amt_08 = grid1_req_amt_08;
		this.grid1_fix_amt_08 = grid1_fix_amt_08;
		this.grid1_req_amt_09 = grid1_req_amt_09;
		this.grid1_fix_amt_09 = grid1_fix_amt_09;
		this.grid1_req_amt_10 = grid1_req_amt_10;
		this.grid1_fix_amt_10 = grid1_fix_amt_10;
		this.grid1_req_amt_11 = grid1_req_amt_11;
		this.grid1_fix_amt_11 = grid1_fix_amt_11;
		this.grid1_req_amt_12 = grid1_req_amt_12;
		this.grid1_fix_amt_12 = grid1_fix_amt_12;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setWork_no_inc(String work_no_inc){
		this.work_no_inc = work_no_inc;
	}

	public void setBudg_yyyy(String budg_yyyy){
		this.budg_yyyy = budg_yyyy;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setWork_no(String work_no){
		this.work_no = work_no;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setCrte_clsf(String crte_clsf){
		this.crte_clsf = crte_clsf;
	}

	public void setGrid1_mode(String grid1_mode){
		this.grid1_mode = grid1_mode;
	}

	public void setGrid1_rownum(String grid1_rownum){
		this.grid1_rownum = grid1_rownum;
	}

	public void setGrid1_seq(String grid1_seq){
		this.grid1_seq = grid1_seq;
	}

	public void setGrid1_budg_cd(String grid1_budg_cd){
		this.grid1_budg_cd = grid1_budg_cd;
	}

	public void setGrid1_rmks(String grid1_rmks){
		this.grid1_rmks = grid1_rmks;
	}

	public void setGrid1_req_amt_01(String grid1_req_amt_01){
		this.grid1_req_amt_01 = grid1_req_amt_01;
	}

	public void setGrid1_fix_amt_01(String grid1_fix_amt_01){
		this.grid1_fix_amt_01 = grid1_fix_amt_01;
	}

	public void setGrid1_req_amt_02(String grid1_req_amt_02){
		this.grid1_req_amt_02 = grid1_req_amt_02;
	}

	public void setGrid1_fix_amt_02(String grid1_fix_amt_02){
		this.grid1_fix_amt_02 = grid1_fix_amt_02;
	}

	public void setGrid1_req_amt_03(String grid1_req_amt_03){
		this.grid1_req_amt_03 = grid1_req_amt_03;
	}

	public void setGrid1_fix_amt_03(String grid1_fix_amt_03){
		this.grid1_fix_amt_03 = grid1_fix_amt_03;
	}

	public void setGrid1_req_amt_04(String grid1_req_amt_04){
		this.grid1_req_amt_04 = grid1_req_amt_04;
	}

	public void setGrid1_fix_amt_04(String grid1_fix_amt_04){
		this.grid1_fix_amt_04 = grid1_fix_amt_04;
	}

	public void setGrid1_req_amt_05(String grid1_req_amt_05){
		this.grid1_req_amt_05 = grid1_req_amt_05;
	}

	public void setGrid1_fix_amt_05(String grid1_fix_amt_05){
		this.grid1_fix_amt_05 = grid1_fix_amt_05;
	}

	public void setGrid1_req_amt_06(String grid1_req_amt_06){
		this.grid1_req_amt_06 = grid1_req_amt_06;
	}

	public void setGrid1_fix_amt_06(String grid1_fix_amt_06){
		this.grid1_fix_amt_06 = grid1_fix_amt_06;
	}

	public void setGrid1_req_amt_07(String grid1_req_amt_07){
		this.grid1_req_amt_07 = grid1_req_amt_07;
	}

	public void setGrid1_fix_amt_07(String grid1_fix_amt_07){
		this.grid1_fix_amt_07 = grid1_fix_amt_07;
	}

	public void setGrid1_req_amt_08(String grid1_req_amt_08){
		this.grid1_req_amt_08 = grid1_req_amt_08;
	}

	public void setGrid1_fix_amt_08(String grid1_fix_amt_08){
		this.grid1_fix_amt_08 = grid1_fix_amt_08;
	}

	public void setGrid1_req_amt_09(String grid1_req_amt_09){
		this.grid1_req_amt_09 = grid1_req_amt_09;
	}

	public void setGrid1_fix_amt_09(String grid1_fix_amt_09){
		this.grid1_fix_amt_09 = grid1_fix_amt_09;
	}

	public void setGrid1_req_amt_10(String grid1_req_amt_10){
		this.grid1_req_amt_10 = grid1_req_amt_10;
	}

	public void setGrid1_fix_amt_10(String grid1_fix_amt_10){
		this.grid1_fix_amt_10 = grid1_fix_amt_10;
	}

	public void setGrid1_req_amt_11(String grid1_req_amt_11){
		this.grid1_req_amt_11 = grid1_req_amt_11;
	}

	public void setGrid1_fix_amt_11(String grid1_fix_amt_11){
		this.grid1_fix_amt_11 = grid1_fix_amt_11;
	}

	public void setGrid1_req_amt_12(String grid1_req_amt_12){
		this.grid1_req_amt_12 = grid1_req_amt_12;
	}

	public void setGrid1_fix_amt_12(String grid1_fix_amt_12){
		this.grid1_fix_amt_12 = grid1_fix_amt_12;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getWork_no_inc(){
		return this.work_no_inc;
	}

	public String getBudg_yyyy(){
		return this.budg_yyyy;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getWork_no(){
		return this.work_no;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getCrte_clsf(){
		return this.crte_clsf;
	}

	public String getGrid1_mode(){
		return this.grid1_mode;
	}

	public String getGrid1_rownum(){
		return this.grid1_rownum;
	}

	public String getGrid1_seq(){
		return this.grid1_seq;
	}

	public String getGrid1_budg_cd(){
		return this.grid1_budg_cd;
	}

	public String getGrid1_rmks(){
		return this.grid1_rmks;
	}

	public String getGrid1_req_amt_01(){
		return this.grid1_req_amt_01;
	}

	public String getGrid1_fix_amt_01(){
		return this.grid1_fix_amt_01;
	}

	public String getGrid1_req_amt_02(){
		return this.grid1_req_amt_02;
	}

	public String getGrid1_fix_amt_02(){
		return this.grid1_fix_amt_02;
	}

	public String getGrid1_req_amt_03(){
		return this.grid1_req_amt_03;
	}

	public String getGrid1_fix_amt_03(){
		return this.grid1_fix_amt_03;
	}

	public String getGrid1_req_amt_04(){
		return this.grid1_req_amt_04;
	}

	public String getGrid1_fix_amt_04(){
		return this.grid1_fix_amt_04;
	}

	public String getGrid1_req_amt_05(){
		return this.grid1_req_amt_05;
	}

	public String getGrid1_fix_amt_05(){
		return this.grid1_fix_amt_05;
	}

	public String getGrid1_req_amt_06(){
		return this.grid1_req_amt_06;
	}

	public String getGrid1_fix_amt_06(){
		return this.grid1_fix_amt_06;
	}

	public String getGrid1_req_amt_07(){
		return this.grid1_req_amt_07;
	}

	public String getGrid1_fix_amt_07(){
		return this.grid1_fix_amt_07;
	}

	public String getGrid1_req_amt_08(){
		return this.grid1_req_amt_08;
	}

	public String getGrid1_fix_amt_08(){
		return this.grid1_fix_amt_08;
	}

	public String getGrid1_req_amt_09(){
		return this.grid1_req_amt_09;
	}

	public String getGrid1_fix_amt_09(){
		return this.grid1_fix_amt_09;
	}

	public String getGrid1_req_amt_10(){
		return this.grid1_req_amt_10;
	}

	public String getGrid1_fix_amt_10(){
		return this.grid1_fix_amt_10;
	}

	public String getGrid1_req_amt_11(){
		return this.grid1_req_amt_11;
	}

	public String getGrid1_fix_amt_11(){
		return this.grid1_fix_amt_11;
	}

	public String getGrid1_req_amt_12(){
		return this.grid1_req_amt_12;
	}

	public String getGrid1_fix_amt_12(){
		return this.grid1_fix_amt_12;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_2123_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_2123_ADM dm = (MC_BUDG_2123_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.work_no_inc);
		cstmt.setString(5, dm.budg_yyyy);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.work_no);
		cstmt.setString(8, dm.evnt_cd);
		cstmt.setString(9, dm.use_dept_cd);
		cstmt.setString(10, dm.medi_cd);
		cstmt.setString(11, dm.crte_clsf);
		cstmt.setString(12, dm.grid1_mode);
		cstmt.setString(13, dm.grid1_rownum);
		cstmt.setString(14, dm.grid1_seq);
		cstmt.setString(15, dm.grid1_budg_cd);
		cstmt.setString(16, dm.grid1_rmks);
		cstmt.setString(17, dm.grid1_req_amt_01);
		cstmt.setString(18, dm.grid1_fix_amt_01);
		cstmt.setString(19, dm.grid1_req_amt_02);
		cstmt.setString(20, dm.grid1_fix_amt_02);
		cstmt.setString(21, dm.grid1_req_amt_03);
		cstmt.setString(22, dm.grid1_fix_amt_03);
		cstmt.setString(23, dm.grid1_req_amt_04);
		cstmt.setString(24, dm.grid1_fix_amt_04);
		cstmt.setString(25, dm.grid1_req_amt_05);
		cstmt.setString(26, dm.grid1_fix_amt_05);
		cstmt.setString(27, dm.grid1_req_amt_06);
		cstmt.setString(28, dm.grid1_fix_amt_06);
		cstmt.setString(29, dm.grid1_req_amt_07);
		cstmt.setString(30, dm.grid1_fix_amt_07);
		cstmt.setString(31, dm.grid1_req_amt_08);
		cstmt.setString(32, dm.grid1_fix_amt_08);
		cstmt.setString(33, dm.grid1_req_amt_09);
		cstmt.setString(34, dm.grid1_fix_amt_09);
		cstmt.setString(35, dm.grid1_req_amt_10);
		cstmt.setString(36, dm.grid1_fix_amt_10);
		cstmt.setString(37, dm.grid1_req_amt_11);
		cstmt.setString(38, dm.grid1_fix_amt_11);
		cstmt.setString(39, dm.grid1_req_amt_12);
		cstmt.setString(40, dm.grid1_fix_amt_12);
		cstmt.setString(41, dm.incmg_pers);
		cstmt.setString(42, dm.chg_pers);
		cstmt.setString(43, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_2123_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("work_no_inc = [" + getWork_no_inc() + "]");
		System.out.println("budg_yyyy = [" + getBudg_yyyy() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("work_no = [" + getWork_no() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("crte_clsf = [" + getCrte_clsf() + "]");
		System.out.println("grid1_mode = [" + getGrid1_mode() + "]");
		System.out.println("grid1_rownum = [" + getGrid1_rownum() + "]");
		System.out.println("grid1_seq = [" + getGrid1_seq() + "]");
		System.out.println("grid1_budg_cd = [" + getGrid1_budg_cd() + "]");
		System.out.println("grid1_rmks = [" + getGrid1_rmks() + "]");
		System.out.println("grid1_req_amt_01 = [" + getGrid1_req_amt_01() + "]");
		System.out.println("grid1_fix_amt_01 = [" + getGrid1_fix_amt_01() + "]");
		System.out.println("grid1_req_amt_02 = [" + getGrid1_req_amt_02() + "]");
		System.out.println("grid1_fix_amt_02 = [" + getGrid1_fix_amt_02() + "]");
		System.out.println("grid1_req_amt_03 = [" + getGrid1_req_amt_03() + "]");
		System.out.println("grid1_fix_amt_03 = [" + getGrid1_fix_amt_03() + "]");
		System.out.println("grid1_req_amt_04 = [" + getGrid1_req_amt_04() + "]");
		System.out.println("grid1_fix_amt_04 = [" + getGrid1_fix_amt_04() + "]");
		System.out.println("grid1_req_amt_05 = [" + getGrid1_req_amt_05() + "]");
		System.out.println("grid1_fix_amt_05 = [" + getGrid1_fix_amt_05() + "]");
		System.out.println("grid1_req_amt_06 = [" + getGrid1_req_amt_06() + "]");
		System.out.println("grid1_fix_amt_06 = [" + getGrid1_fix_amt_06() + "]");
		System.out.println("grid1_req_amt_07 = [" + getGrid1_req_amt_07() + "]");
		System.out.println("grid1_fix_amt_07 = [" + getGrid1_fix_amt_07() + "]");
		System.out.println("grid1_req_amt_08 = [" + getGrid1_req_amt_08() + "]");
		System.out.println("grid1_fix_amt_08 = [" + getGrid1_fix_amt_08() + "]");
		System.out.println("grid1_req_amt_09 = [" + getGrid1_req_amt_09() + "]");
		System.out.println("grid1_fix_amt_09 = [" + getGrid1_fix_amt_09() + "]");
		System.out.println("grid1_req_amt_10 = [" + getGrid1_req_amt_10() + "]");
		System.out.println("grid1_fix_amt_10 = [" + getGrid1_fix_amt_10() + "]");
		System.out.println("grid1_req_amt_11 = [" + getGrid1_req_amt_11() + "]");
		System.out.println("grid1_fix_amt_11 = [" + getGrid1_fix_amt_11() + "]");
		System.out.println("grid1_req_amt_12 = [" + getGrid1_req_amt_12() + "]");
		System.out.println("grid1_fix_amt_12 = [" + getGrid1_fix_amt_12() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String work_no_inc = req.getParameter("work_no_inc");
if( work_no_inc == null){
	System.out.println(this.toString+" : work_no_inc is null" );
}else{
	System.out.println(this.toString+" : work_no_inc is "+work_no_inc );
}
String budg_yyyy = req.getParameter("budg_yyyy");
if( budg_yyyy == null){
	System.out.println(this.toString+" : budg_yyyy is null" );
}else{
	System.out.println(this.toString+" : budg_yyyy is "+budg_yyyy );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String work_no = req.getParameter("work_no");
if( work_no == null){
	System.out.println(this.toString+" : work_no is null" );
}else{
	System.out.println(this.toString+" : work_no is "+work_no );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String crte_clsf = req.getParameter("crte_clsf");
if( crte_clsf == null){
	System.out.println(this.toString+" : crte_clsf is null" );
}else{
	System.out.println(this.toString+" : crte_clsf is "+crte_clsf );
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
String grid1_seq = req.getParameter("grid1_seq");
if( grid1_seq == null){
	System.out.println(this.toString+" : grid1_seq is null" );
}else{
	System.out.println(this.toString+" : grid1_seq is "+grid1_seq );
}
String grid1_budg_cd = req.getParameter("grid1_budg_cd");
if( grid1_budg_cd == null){
	System.out.println(this.toString+" : grid1_budg_cd is null" );
}else{
	System.out.println(this.toString+" : grid1_budg_cd is "+grid1_budg_cd );
}
String grid1_rmks = req.getParameter("grid1_rmks");
if( grid1_rmks == null){
	System.out.println(this.toString+" : grid1_rmks is null" );
}else{
	System.out.println(this.toString+" : grid1_rmks is "+grid1_rmks );
}
String grid1_req_amt_01 = req.getParameter("grid1_req_amt_01");
if( grid1_req_amt_01 == null){
	System.out.println(this.toString+" : grid1_req_amt_01 is null" );
}else{
	System.out.println(this.toString+" : grid1_req_amt_01 is "+grid1_req_amt_01 );
}
String grid1_fix_amt_01 = req.getParameter("grid1_fix_amt_01");
if( grid1_fix_amt_01 == null){
	System.out.println(this.toString+" : grid1_fix_amt_01 is null" );
}else{
	System.out.println(this.toString+" : grid1_fix_amt_01 is "+grid1_fix_amt_01 );
}
String grid1_req_amt_02 = req.getParameter("grid1_req_amt_02");
if( grid1_req_amt_02 == null){
	System.out.println(this.toString+" : grid1_req_amt_02 is null" );
}else{
	System.out.println(this.toString+" : grid1_req_amt_02 is "+grid1_req_amt_02 );
}
String grid1_fix_amt_02 = req.getParameter("grid1_fix_amt_02");
if( grid1_fix_amt_02 == null){
	System.out.println(this.toString+" : grid1_fix_amt_02 is null" );
}else{
	System.out.println(this.toString+" : grid1_fix_amt_02 is "+grid1_fix_amt_02 );
}
String grid1_req_amt_03 = req.getParameter("grid1_req_amt_03");
if( grid1_req_amt_03 == null){
	System.out.println(this.toString+" : grid1_req_amt_03 is null" );
}else{
	System.out.println(this.toString+" : grid1_req_amt_03 is "+grid1_req_amt_03 );
}
String grid1_fix_amt_03 = req.getParameter("grid1_fix_amt_03");
if( grid1_fix_amt_03 == null){
	System.out.println(this.toString+" : grid1_fix_amt_03 is null" );
}else{
	System.out.println(this.toString+" : grid1_fix_amt_03 is "+grid1_fix_amt_03 );
}
String grid1_req_amt_04 = req.getParameter("grid1_req_amt_04");
if( grid1_req_amt_04 == null){
	System.out.println(this.toString+" : grid1_req_amt_04 is null" );
}else{
	System.out.println(this.toString+" : grid1_req_amt_04 is "+grid1_req_amt_04 );
}
String grid1_fix_amt_04 = req.getParameter("grid1_fix_amt_04");
if( grid1_fix_amt_04 == null){
	System.out.println(this.toString+" : grid1_fix_amt_04 is null" );
}else{
	System.out.println(this.toString+" : grid1_fix_amt_04 is "+grid1_fix_amt_04 );
}
String grid1_req_amt_05 = req.getParameter("grid1_req_amt_05");
if( grid1_req_amt_05 == null){
	System.out.println(this.toString+" : grid1_req_amt_05 is null" );
}else{
	System.out.println(this.toString+" : grid1_req_amt_05 is "+grid1_req_amt_05 );
}
String grid1_fix_amt_05 = req.getParameter("grid1_fix_amt_05");
if( grid1_fix_amt_05 == null){
	System.out.println(this.toString+" : grid1_fix_amt_05 is null" );
}else{
	System.out.println(this.toString+" : grid1_fix_amt_05 is "+grid1_fix_amt_05 );
}
String grid1_req_amt_06 = req.getParameter("grid1_req_amt_06");
if( grid1_req_amt_06 == null){
	System.out.println(this.toString+" : grid1_req_amt_06 is null" );
}else{
	System.out.println(this.toString+" : grid1_req_amt_06 is "+grid1_req_amt_06 );
}
String grid1_fix_amt_06 = req.getParameter("grid1_fix_amt_06");
if( grid1_fix_amt_06 == null){
	System.out.println(this.toString+" : grid1_fix_amt_06 is null" );
}else{
	System.out.println(this.toString+" : grid1_fix_amt_06 is "+grid1_fix_amt_06 );
}
String grid1_req_amt_07 = req.getParameter("grid1_req_amt_07");
if( grid1_req_amt_07 == null){
	System.out.println(this.toString+" : grid1_req_amt_07 is null" );
}else{
	System.out.println(this.toString+" : grid1_req_amt_07 is "+grid1_req_amt_07 );
}
String grid1_fix_amt_07 = req.getParameter("grid1_fix_amt_07");
if( grid1_fix_amt_07 == null){
	System.out.println(this.toString+" : grid1_fix_amt_07 is null" );
}else{
	System.out.println(this.toString+" : grid1_fix_amt_07 is "+grid1_fix_amt_07 );
}
String grid1_req_amt_08 = req.getParameter("grid1_req_amt_08");
if( grid1_req_amt_08 == null){
	System.out.println(this.toString+" : grid1_req_amt_08 is null" );
}else{
	System.out.println(this.toString+" : grid1_req_amt_08 is "+grid1_req_amt_08 );
}
String grid1_fix_amt_08 = req.getParameter("grid1_fix_amt_08");
if( grid1_fix_amt_08 == null){
	System.out.println(this.toString+" : grid1_fix_amt_08 is null" );
}else{
	System.out.println(this.toString+" : grid1_fix_amt_08 is "+grid1_fix_amt_08 );
}
String grid1_req_amt_09 = req.getParameter("grid1_req_amt_09");
if( grid1_req_amt_09 == null){
	System.out.println(this.toString+" : grid1_req_amt_09 is null" );
}else{
	System.out.println(this.toString+" : grid1_req_amt_09 is "+grid1_req_amt_09 );
}
String grid1_fix_amt_09 = req.getParameter("grid1_fix_amt_09");
if( grid1_fix_amt_09 == null){
	System.out.println(this.toString+" : grid1_fix_amt_09 is null" );
}else{
	System.out.println(this.toString+" : grid1_fix_amt_09 is "+grid1_fix_amt_09 );
}
String grid1_req_amt_10 = req.getParameter("grid1_req_amt_10");
if( grid1_req_amt_10 == null){
	System.out.println(this.toString+" : grid1_req_amt_10 is null" );
}else{
	System.out.println(this.toString+" : grid1_req_amt_10 is "+grid1_req_amt_10 );
}
String grid1_fix_amt_10 = req.getParameter("grid1_fix_amt_10");
if( grid1_fix_amt_10 == null){
	System.out.println(this.toString+" : grid1_fix_amt_10 is null" );
}else{
	System.out.println(this.toString+" : grid1_fix_amt_10 is "+grid1_fix_amt_10 );
}
String grid1_req_amt_11 = req.getParameter("grid1_req_amt_11");
if( grid1_req_amt_11 == null){
	System.out.println(this.toString+" : grid1_req_amt_11 is null" );
}else{
	System.out.println(this.toString+" : grid1_req_amt_11 is "+grid1_req_amt_11 );
}
String grid1_fix_amt_11 = req.getParameter("grid1_fix_amt_11");
if( grid1_fix_amt_11 == null){
	System.out.println(this.toString+" : grid1_fix_amt_11 is null" );
}else{
	System.out.println(this.toString+" : grid1_fix_amt_11 is "+grid1_fix_amt_11 );
}
String grid1_req_amt_12 = req.getParameter("grid1_req_amt_12");
if( grid1_req_amt_12 == null){
	System.out.println(this.toString+" : grid1_req_amt_12 is null" );
}else{
	System.out.println(this.toString+" : grid1_req_amt_12 is "+grid1_req_amt_12 );
}
String grid1_fix_amt_12 = req.getParameter("grid1_fix_amt_12");
if( grid1_fix_amt_12 == null){
	System.out.println(this.toString+" : grid1_fix_amt_12 is null" );
}else{
	System.out.println(this.toString+" : grid1_fix_amt_12 is "+grid1_fix_amt_12 );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String work_no_inc = Util.checkString(req.getParameter("work_no_inc"));
String budg_yyyy = Util.checkString(req.getParameter("budg_yyyy"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String work_no = Util.checkString(req.getParameter("work_no"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String crte_clsf = Util.checkString(req.getParameter("crte_clsf"));
String grid1_mode = Util.checkString(req.getParameter("grid1_mode"));
String grid1_rownum = Util.checkString(req.getParameter("grid1_rownum"));
String grid1_seq = Util.checkString(req.getParameter("grid1_seq"));
String grid1_budg_cd = Util.checkString(req.getParameter("grid1_budg_cd"));
String grid1_rmks = Util.checkString(req.getParameter("grid1_rmks"));
String grid1_req_amt_01 = Util.checkString(req.getParameter("grid1_req_amt_01"));
String grid1_fix_amt_01 = Util.checkString(req.getParameter("grid1_fix_amt_01"));
String grid1_req_amt_02 = Util.checkString(req.getParameter("grid1_req_amt_02"));
String grid1_fix_amt_02 = Util.checkString(req.getParameter("grid1_fix_amt_02"));
String grid1_req_amt_03 = Util.checkString(req.getParameter("grid1_req_amt_03"));
String grid1_fix_amt_03 = Util.checkString(req.getParameter("grid1_fix_amt_03"));
String grid1_req_amt_04 = Util.checkString(req.getParameter("grid1_req_amt_04"));
String grid1_fix_amt_04 = Util.checkString(req.getParameter("grid1_fix_amt_04"));
String grid1_req_amt_05 = Util.checkString(req.getParameter("grid1_req_amt_05"));
String grid1_fix_amt_05 = Util.checkString(req.getParameter("grid1_fix_amt_05"));
String grid1_req_amt_06 = Util.checkString(req.getParameter("grid1_req_amt_06"));
String grid1_fix_amt_06 = Util.checkString(req.getParameter("grid1_fix_amt_06"));
String grid1_req_amt_07 = Util.checkString(req.getParameter("grid1_req_amt_07"));
String grid1_fix_amt_07 = Util.checkString(req.getParameter("grid1_fix_amt_07"));
String grid1_req_amt_08 = Util.checkString(req.getParameter("grid1_req_amt_08"));
String grid1_fix_amt_08 = Util.checkString(req.getParameter("grid1_fix_amt_08"));
String grid1_req_amt_09 = Util.checkString(req.getParameter("grid1_req_amt_09"));
String grid1_fix_amt_09 = Util.checkString(req.getParameter("grid1_fix_amt_09"));
String grid1_req_amt_10 = Util.checkString(req.getParameter("grid1_req_amt_10"));
String grid1_fix_amt_10 = Util.checkString(req.getParameter("grid1_fix_amt_10"));
String grid1_req_amt_11 = Util.checkString(req.getParameter("grid1_req_amt_11"));
String grid1_fix_amt_11 = Util.checkString(req.getParameter("grid1_fix_amt_11"));
String grid1_req_amt_12 = Util.checkString(req.getParameter("grid1_req_amt_12"));
String grid1_fix_amt_12 = Util.checkString(req.getParameter("grid1_fix_amt_12"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String work_no_inc = Util.Uni2Ksc(Util.checkString(req.getParameter("work_no_inc")));
String budg_yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yyyy")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String work_no = Util.Uni2Ksc(Util.checkString(req.getParameter("work_no")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String crte_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("crte_clsf")));
String grid1_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_mode")));
String grid1_rownum = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_rownum")));
String grid1_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_seq")));
String grid1_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_budg_cd")));
String grid1_rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_rmks")));
String grid1_req_amt_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_req_amt_01")));
String grid1_fix_amt_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_fix_amt_01")));
String grid1_req_amt_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_req_amt_02")));
String grid1_fix_amt_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_fix_amt_02")));
String grid1_req_amt_03 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_req_amt_03")));
String grid1_fix_amt_03 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_fix_amt_03")));
String grid1_req_amt_04 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_req_amt_04")));
String grid1_fix_amt_04 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_fix_amt_04")));
String grid1_req_amt_05 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_req_amt_05")));
String grid1_fix_amt_05 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_fix_amt_05")));
String grid1_req_amt_06 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_req_amt_06")));
String grid1_fix_amt_06 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_fix_amt_06")));
String grid1_req_amt_07 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_req_amt_07")));
String grid1_fix_amt_07 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_fix_amt_07")));
String grid1_req_amt_08 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_req_amt_08")));
String grid1_fix_amt_08 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_fix_amt_08")));
String grid1_req_amt_09 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_req_amt_09")));
String grid1_fix_amt_09 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_fix_amt_09")));
String grid1_req_amt_10 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_req_amt_10")));
String grid1_fix_amt_10 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_fix_amt_10")));
String grid1_req_amt_11 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_req_amt_11")));
String grid1_fix_amt_11 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_fix_amt_11")));
String grid1_req_amt_12 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_req_amt_12")));
String grid1_fix_amt_12 = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_fix_amt_12")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setWork_no_inc(work_no_inc);
dm.setBudg_yyyy(budg_yyyy);
dm.setDept_cd(dept_cd);
dm.setWork_no(work_no);
dm.setEvnt_cd(evnt_cd);
dm.setUse_dept_cd(use_dept_cd);
dm.setMedi_cd(medi_cd);
dm.setCrte_clsf(crte_clsf);
dm.setGrid1_mode(grid1_mode);
dm.setGrid1_rownum(grid1_rownum);
dm.setGrid1_seq(grid1_seq);
dm.setGrid1_budg_cd(grid1_budg_cd);
dm.setGrid1_rmks(grid1_rmks);
dm.setGrid1_req_amt_01(grid1_req_amt_01);
dm.setGrid1_fix_amt_01(grid1_fix_amt_01);
dm.setGrid1_req_amt_02(grid1_req_amt_02);
dm.setGrid1_fix_amt_02(grid1_fix_amt_02);
dm.setGrid1_req_amt_03(grid1_req_amt_03);
dm.setGrid1_fix_amt_03(grid1_fix_amt_03);
dm.setGrid1_req_amt_04(grid1_req_amt_04);
dm.setGrid1_fix_amt_04(grid1_fix_amt_04);
dm.setGrid1_req_amt_05(grid1_req_amt_05);
dm.setGrid1_fix_amt_05(grid1_fix_amt_05);
dm.setGrid1_req_amt_06(grid1_req_amt_06);
dm.setGrid1_fix_amt_06(grid1_fix_amt_06);
dm.setGrid1_req_amt_07(grid1_req_amt_07);
dm.setGrid1_fix_amt_07(grid1_fix_amt_07);
dm.setGrid1_req_amt_08(grid1_req_amt_08);
dm.setGrid1_fix_amt_08(grid1_fix_amt_08);
dm.setGrid1_req_amt_09(grid1_req_amt_09);
dm.setGrid1_fix_amt_09(grid1_fix_amt_09);
dm.setGrid1_req_amt_10(grid1_req_amt_10);
dm.setGrid1_fix_amt_10(grid1_fix_amt_10);
dm.setGrid1_req_amt_11(grid1_req_amt_11);
dm.setGrid1_fix_amt_11(grid1_fix_amt_11);
dm.setGrid1_req_amt_12(grid1_req_amt_12);
dm.setGrid1_fix_amt_12(grid1_fix_amt_12);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 27 15:51:31 KST 2009 */