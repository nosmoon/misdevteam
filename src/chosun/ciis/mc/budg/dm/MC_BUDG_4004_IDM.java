/***************************************************************************************************
* 파일명 : .java
* 기능 :  예산관리/예산변경관리/예산월변경등록
* 작성일자 : 2009.08.20
* 작성자   : 고종수
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 노상현
* 수정일자 : 2014-02-06
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
 * 예산관리/예산변경관리/예산월변경등록
 */

public class MC_BUDG_4004_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cnt;
	public String budg_yymm;
	public String budg_cd;
	public String dept_cd;
	public String evnt_cd;
	public String budg_yymm_to;
	public String budg_cd_to;
	public String dept_cd_to;
	public String evnt_cd_to;
	public String work_no;
	public String seq;
	public String medi_cd;
	public String use_dept_cd;
	public String rmks;
	public String fix_asin_amt;
	public String chg_asin_amt;
	public String work_no_1;
	public String seq_1;
	public String medi_cd_1;
	public String use_dept_cd_1;
	public String rmks_1;
	public String fix_asin_amt_1;
	public String from_iwamt;
	public String to_iwamt;
	public String crte_clsf;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public MC_BUDG_4004_IDM(){}
	public MC_BUDG_4004_IDM(String cmpy_cd, String cnt, String budg_yymm, String budg_cd, String dept_cd, String evnt_cd, String budg_yymm_to, String budg_cd_to, String dept_cd_to, String evnt_cd_to, String work_no, String seq, String medi_cd, String use_dept_cd, String rmks, String fix_asin_amt, String chg_asin_amt, String work_no_1, String seq_1, String medi_cd_1, String use_dept_cd_1, String rmks_1, String fix_asin_amt_1, String from_iwamt, String to_iwamt, String crte_clsf, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.cnt = cnt;
		this.budg_yymm = budg_yymm;
		this.budg_cd = budg_cd;
		this.dept_cd = dept_cd;
		this.evnt_cd = evnt_cd;
		this.budg_yymm_to = budg_yymm_to;
		this.budg_cd_to = budg_cd_to;
		this.dept_cd_to = dept_cd_to;
		this.evnt_cd_to = evnt_cd_to;
		this.work_no = work_no;
		this.seq = seq;
		this.medi_cd = medi_cd;
		this.use_dept_cd = use_dept_cd;
		this.rmks = rmks;
		this.fix_asin_amt = fix_asin_amt;
		this.chg_asin_amt = chg_asin_amt;
		this.work_no_1 = work_no_1;
		this.seq_1 = seq_1;
		this.medi_cd_1 = medi_cd_1;
		this.use_dept_cd_1 = use_dept_cd_1;
		this.rmks_1 = rmks_1;
		this.fix_asin_amt_1 = fix_asin_amt_1;
		this.from_iwamt = from_iwamt;
		this.to_iwamt = to_iwamt;
		this.crte_clsf = crte_clsf;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setBudg_yymm_to(String budg_yymm_to){
		this.budg_yymm_to = budg_yymm_to;
	}

	public void setBudg_cd_to(String budg_cd_to){
		this.budg_cd_to = budg_cd_to;
	}

	public void setDept_cd_to(String dept_cd_to){
		this.dept_cd_to = dept_cd_to;
	}

	public void setEvnt_cd_to(String evnt_cd_to){
		this.evnt_cd_to = evnt_cd_to;
	}

	public void setWork_no(String work_no){
		this.work_no = work_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setFix_asin_amt(String fix_asin_amt){
		this.fix_asin_amt = fix_asin_amt;
	}

	public void setChg_asin_amt(String chg_asin_amt){
		this.chg_asin_amt = chg_asin_amt;
	}

	public void setWork_no_1(String work_no_1){
		this.work_no_1 = work_no_1;
	}

	public void setSeq_1(String seq_1){
		this.seq_1 = seq_1;
	}

	public void setMedi_cd_1(String medi_cd_1){
		this.medi_cd_1 = medi_cd_1;
	}

	public void setUse_dept_cd_1(String use_dept_cd_1){
		this.use_dept_cd_1 = use_dept_cd_1;
	}

	public void setRmks_1(String rmks_1){
		this.rmks_1 = rmks_1;
	}

	public void setFix_asin_amt_1(String fix_asin_amt_1){
		this.fix_asin_amt_1 = fix_asin_amt_1;
	}

	public void setFrom_iwamt(String from_iwamt){
		this.from_iwamt = from_iwamt;
	}

	public void setTo_iwamt(String to_iwamt){
		this.to_iwamt = to_iwamt;
	}

	public void setCrte_clsf(String crte_clsf){
		this.crte_clsf = crte_clsf;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getBudg_yymm_to(){
		return this.budg_yymm_to;
	}

	public String getBudg_cd_to(){
		return this.budg_cd_to;
	}

	public String getDept_cd_to(){
		return this.dept_cd_to;
	}

	public String getEvnt_cd_to(){
		return this.evnt_cd_to;
	}

	public String getWork_no(){
		return this.work_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getFix_asin_amt(){
		return this.fix_asin_amt;
	}

	public String getChg_asin_amt(){
		return this.chg_asin_amt;
	}

	public String getWork_no_1(){
		return this.work_no_1;
	}

	public String getSeq_1(){
		return this.seq_1;
	}

	public String getMedi_cd_1(){
		return this.medi_cd_1;
	}

	public String getUse_dept_cd_1(){
		return this.use_dept_cd_1;
	}

	public String getRmks_1(){
		return this.rmks_1;
	}

	public String getFix_asin_amt_1(){
		return this.fix_asin_amt_1;
	}

	public String getFrom_iwamt(){
		return this.from_iwamt;
	}

	public String getTo_iwamt(){
		return this.to_iwamt;
	}

	public String getCrte_clsf(){
		return this.crte_clsf;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_4004_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_4004_IDM dm = (MC_BUDG_4004_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cnt);
		cstmt.setString(5, dm.budg_yymm);
		cstmt.setString(6, dm.budg_cd);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.evnt_cd);
		cstmt.setString(9, dm.budg_yymm_to);
		cstmt.setString(10, dm.budg_cd_to);
		cstmt.setString(11, dm.dept_cd_to);
		cstmt.setString(12, dm.evnt_cd_to);
		cstmt.setString(13, dm.work_no);
		cstmt.setString(14, dm.seq);
		cstmt.setString(15, dm.medi_cd);
		cstmt.setString(16, dm.use_dept_cd);
		cstmt.setString(17, dm.rmks);
		cstmt.setString(18, dm.fix_asin_amt);
		cstmt.setString(19, dm.chg_asin_amt);
		cstmt.setString(20, dm.work_no_1);
		cstmt.setString(21, dm.seq_1);
		cstmt.setString(22, dm.medi_cd_1);
		cstmt.setString(23, dm.use_dept_cd_1);
		cstmt.setString(24, dm.rmks_1);
		cstmt.setString(25, dm.fix_asin_amt_1);
		cstmt.setString(26, dm.from_iwamt);
		cstmt.setString(27, dm.to_iwamt);
		cstmt.setString(28, dm.crte_clsf);
		cstmt.setString(29, dm.incmg_pers);
		cstmt.setString(30, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_4004_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cnt = [" + getCnt() + "]");
		System.out.println("budg_yymm = [" + getBudg_yymm() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("budg_yymm_to = [" + getBudg_yymm_to() + "]");
		System.out.println("budg_cd_to = [" + getBudg_cd_to() + "]");
		System.out.println("dept_cd_to = [" + getDept_cd_to() + "]");
		System.out.println("evnt_cd_to = [" + getEvnt_cd_to() + "]");
		System.out.println("work_no = [" + getWork_no() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("rmks = [" + getRmks() + "]");
		System.out.println("fix_asin_amt = [" + getFix_asin_amt() + "]");
		System.out.println("chg_asin_amt = [" + getChg_asin_amt() + "]");
		System.out.println("work_no_1 = [" + getWork_no_1() + "]");
		System.out.println("seq_1 = [" + getSeq_1() + "]");
		System.out.println("medi_cd_1 = [" + getMedi_cd_1() + "]");
		System.out.println("use_dept_cd_1 = [" + getUse_dept_cd_1() + "]");
		System.out.println("rmks_1 = [" + getRmks_1() + "]");
		System.out.println("fix_asin_amt_1 = [" + getFix_asin_amt_1() + "]");
		System.out.println("from_iwamt = [" + getFrom_iwamt() + "]");
		System.out.println("to_iwamt = [" + getTo_iwamt() + "]");
		System.out.println("crte_clsf = [" + getCrte_clsf() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String cnt = req.getParameter("cnt");
if( cnt == null){
	System.out.println(this.toString+" : cnt is null" );
}else{
	System.out.println(this.toString+" : cnt is "+cnt );
}
String budg_yymm = req.getParameter("budg_yymm");
if( budg_yymm == null){
	System.out.println(this.toString+" : budg_yymm is null" );
}else{
	System.out.println(this.toString+" : budg_yymm is "+budg_yymm );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String budg_yymm_to = req.getParameter("budg_yymm_to");
if( budg_yymm_to == null){
	System.out.println(this.toString+" : budg_yymm_to is null" );
}else{
	System.out.println(this.toString+" : budg_yymm_to is "+budg_yymm_to );
}
String budg_cd_to = req.getParameter("budg_cd_to");
if( budg_cd_to == null){
	System.out.println(this.toString+" : budg_cd_to is null" );
}else{
	System.out.println(this.toString+" : budg_cd_to is "+budg_cd_to );
}
String dept_cd_to = req.getParameter("dept_cd_to");
if( dept_cd_to == null){
	System.out.println(this.toString+" : dept_cd_to is null" );
}else{
	System.out.println(this.toString+" : dept_cd_to is "+dept_cd_to );
}
String evnt_cd_to = req.getParameter("evnt_cd_to");
if( evnt_cd_to == null){
	System.out.println(this.toString+" : evnt_cd_to is null" );
}else{
	System.out.println(this.toString+" : evnt_cd_to is "+evnt_cd_to );
}
String work_no = req.getParameter("work_no");
if( work_no == null){
	System.out.println(this.toString+" : work_no is null" );
}else{
	System.out.println(this.toString+" : work_no is "+work_no );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
}
String fix_asin_amt = req.getParameter("fix_asin_amt");
if( fix_asin_amt == null){
	System.out.println(this.toString+" : fix_asin_amt is null" );
}else{
	System.out.println(this.toString+" : fix_asin_amt is "+fix_asin_amt );
}
String chg_asin_amt = req.getParameter("chg_asin_amt");
if( chg_asin_amt == null){
	System.out.println(this.toString+" : chg_asin_amt is null" );
}else{
	System.out.println(this.toString+" : chg_asin_amt is "+chg_asin_amt );
}
String work_no_1 = req.getParameter("work_no_1");
if( work_no_1 == null){
	System.out.println(this.toString+" : work_no_1 is null" );
}else{
	System.out.println(this.toString+" : work_no_1 is "+work_no_1 );
}
String seq_1 = req.getParameter("seq_1");
if( seq_1 == null){
	System.out.println(this.toString+" : seq_1 is null" );
}else{
	System.out.println(this.toString+" : seq_1 is "+seq_1 );
}
String medi_cd_1 = req.getParameter("medi_cd_1");
if( medi_cd_1 == null){
	System.out.println(this.toString+" : medi_cd_1 is null" );
}else{
	System.out.println(this.toString+" : medi_cd_1 is "+medi_cd_1 );
}
String use_dept_cd_1 = req.getParameter("use_dept_cd_1");
if( use_dept_cd_1 == null){
	System.out.println(this.toString+" : use_dept_cd_1 is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd_1 is "+use_dept_cd_1 );
}
String rmks_1 = req.getParameter("rmks_1");
if( rmks_1 == null){
	System.out.println(this.toString+" : rmks_1 is null" );
}else{
	System.out.println(this.toString+" : rmks_1 is "+rmks_1 );
}
String fix_asin_amt_1 = req.getParameter("fix_asin_amt_1");
if( fix_asin_amt_1 == null){
	System.out.println(this.toString+" : fix_asin_amt_1 is null" );
}else{
	System.out.println(this.toString+" : fix_asin_amt_1 is "+fix_asin_amt_1 );
}
String from_iwamt = req.getParameter("from_iwamt");
if( from_iwamt == null){
	System.out.println(this.toString+" : from_iwamt is null" );
}else{
	System.out.println(this.toString+" : from_iwamt is "+from_iwamt );
}
String to_iwamt = req.getParameter("to_iwamt");
if( to_iwamt == null){
	System.out.println(this.toString+" : to_iwamt is null" );
}else{
	System.out.println(this.toString+" : to_iwamt is "+to_iwamt );
}
String crte_clsf = req.getParameter("crte_clsf");
if( crte_clsf == null){
	System.out.println(this.toString+" : crte_clsf is null" );
}else{
	System.out.println(this.toString+" : crte_clsf is "+crte_clsf );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cnt = Util.checkString(req.getParameter("cnt"));
String budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String budg_yymm_to = Util.checkString(req.getParameter("budg_yymm_to"));
String budg_cd_to = Util.checkString(req.getParameter("budg_cd_to"));
String dept_cd_to = Util.checkString(req.getParameter("dept_cd_to"));
String evnt_cd_to = Util.checkString(req.getParameter("evnt_cd_to"));
String work_no = Util.checkString(req.getParameter("work_no"));
String seq = Util.checkString(req.getParameter("seq"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String rmks = Util.checkString(req.getParameter("rmks"));
String fix_asin_amt = Util.checkString(req.getParameter("fix_asin_amt"));
String chg_asin_amt = Util.checkString(req.getParameter("chg_asin_amt"));
String work_no_1 = Util.checkString(req.getParameter("work_no_1"));
String seq_1 = Util.checkString(req.getParameter("seq_1"));
String medi_cd_1 = Util.checkString(req.getParameter("medi_cd_1"));
String use_dept_cd_1 = Util.checkString(req.getParameter("use_dept_cd_1"));
String rmks_1 = Util.checkString(req.getParameter("rmks_1"));
String fix_asin_amt_1 = Util.checkString(req.getParameter("fix_asin_amt_1"));
String from_iwamt = Util.checkString(req.getParameter("from_iwamt"));
String to_iwamt = Util.checkString(req.getParameter("to_iwamt"));
String crte_clsf = Util.checkString(req.getParameter("crte_clsf"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("cnt")));
String budg_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String budg_yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm_to")));
String budg_cd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd_to")));
String dept_cd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd_to")));
String evnt_cd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd_to")));
String work_no = Util.Uni2Ksc(Util.checkString(req.getParameter("work_no")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String fix_asin_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_asin_amt")));
String chg_asin_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_asin_amt")));
String work_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("work_no_1")));
String seq_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_1")));
String medi_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd_1")));
String use_dept_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd_1")));
String rmks_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks_1")));
String fix_asin_amt_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_asin_amt_1")));
String from_iwamt = Util.Uni2Ksc(Util.checkString(req.getParameter("from_iwamt")));
String to_iwamt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_iwamt")));
String crte_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("crte_clsf")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCnt(cnt);
dm.setBudg_yymm(budg_yymm);
dm.setBudg_cd(budg_cd);
dm.setDept_cd(dept_cd);
dm.setEvnt_cd(evnt_cd);
dm.setBudg_yymm_to(budg_yymm_to);
dm.setBudg_cd_to(budg_cd_to);
dm.setDept_cd_to(dept_cd_to);
dm.setEvnt_cd_to(evnt_cd_to);
dm.setWork_no(work_no);
dm.setSeq(seq);
dm.setMedi_cd(medi_cd);
dm.setUse_dept_cd(use_dept_cd);
dm.setRmks(rmks);
dm.setFix_asin_amt(fix_asin_amt);
dm.setChg_asin_amt(chg_asin_amt);
dm.setWork_no_1(work_no_1);
dm.setSeq_1(seq_1);
dm.setMedi_cd_1(medi_cd_1);
dm.setUse_dept_cd_1(use_dept_cd_1);
dm.setRmks_1(rmks_1);
dm.setFix_asin_amt_1(fix_asin_amt_1);
dm.setFrom_iwamt(from_iwamt);
dm.setTo_iwamt(to_iwamt);
dm.setCrte_clsf(crte_clsf);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 12 19:41:42 KST 2014 */