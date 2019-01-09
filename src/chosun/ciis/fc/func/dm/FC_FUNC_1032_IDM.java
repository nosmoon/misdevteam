/***************************************************************************************************
* 파일명 : .java
* 기능 : 자금관리-받을어음할인등록
* 작성일자 : 2009-02-19
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 자금관리-받을어음할인등록
 */


public class FC_FUNC_1032_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String clsf;
	public String cmpy_cd;
	public String stat_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_cdnm;
	public String deps_clsf_cd;
	public String rmks1;
	public String chg_pers;
	public String incmg_pers_ipadd;
	public String deptcd;
	public String row_no;
	public String bank_cd;
	public String note_no;
	public String note_seq;
	public String rcpay_amt;
	public String coms;
	public String note_clsf_cd;
	public String mtry_dt;

	public FC_FUNC_1032_IDM(){}
	public FC_FUNC_1032_IDM(String clsf, String cmpy_cd, String stat_dt, String dlco_clsf_cd, String dlco_cd, String dlco_cdnm, String deps_clsf_cd, String rmks1, String chg_pers, String incmg_pers_ipadd, String deptcd, String row_no, String bank_cd, String note_no, String note_seq, String rcpay_amt, String coms, String note_clsf_cd, String mtry_dt){
		this.clsf = clsf;
		this.cmpy_cd = cmpy_cd;
		this.stat_dt = stat_dt;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.dlco_cdnm = dlco_cdnm;
		this.deps_clsf_cd = deps_clsf_cd;
		this.rmks1 = rmks1;
		this.chg_pers = chg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.deptcd = deptcd;
		this.row_no = row_no;
		this.bank_cd = bank_cd;
		this.note_no = note_no;
		this.note_seq = note_seq;
		this.rcpay_amt = rcpay_amt;
		this.coms = coms;
		this.note_clsf_cd = note_clsf_cd;
		this.mtry_dt = mtry_dt;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setStat_dt(String stat_dt){
		this.stat_dt = stat_dt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_cdnm(String dlco_cdnm){
		this.dlco_cdnm = dlco_cdnm;
	}

	public void setDeps_clsf_cd(String deps_clsf_cd){
		this.deps_clsf_cd = deps_clsf_cd;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setRow_no(String row_no){
		this.row_no = row_no;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setRcpay_amt(String rcpay_amt){
		this.rcpay_amt = rcpay_amt;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getStat_dt(){
		return this.stat_dt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_cdnm(){
		return this.dlco_cdnm;
	}

	public String getDeps_clsf_cd(){
		return this.deps_clsf_cd;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getRow_no(){
		return this.row_no;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_seq(){
		return this.note_seq;
	}

	public String getRcpay_amt(){
		return this.rcpay_amt;
	}

	public String getComs(){
		return this.coms;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1032_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1032_IDM dm = (FC_FUNC_1032_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.clsf);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.stat_dt);
		cstmt.setString(6, dm.dlco_clsf_cd);
		cstmt.setString(7, dm.dlco_cd);
		cstmt.setString(8, dm.dlco_cdnm);
		cstmt.setString(9, dm.deps_clsf_cd);
		cstmt.setString(10, dm.rmks1);
		cstmt.setString(11, dm.chg_pers);
		cstmt.setString(12, dm.incmg_pers_ipadd);
		cstmt.setString(13, dm.deptcd);
		cstmt.setString(14, dm.row_no);
		cstmt.setString(15, dm.bank_cd);
		cstmt.setString(16, dm.note_no);
		cstmt.setString(17, dm.note_seq);
		cstmt.setString(18, dm.rcpay_amt);
		cstmt.setString(19, dm.coms);
		cstmt.setString(20, dm.note_clsf_cd);
		cstmt.setString(21, dm.mtry_dt);
		cstmt.registerOutParameter(22, Types.VARCHAR);
		cstmt.registerOutParameter(23, Types.VARCHAR);
		cstmt.registerOutParameter(24, Types.VARCHAR);
		cstmt.registerOutParameter(25, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1032_IDataSet();
	}



    public void print(){
        System.out.println("clsf = " + getClsf());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("stat_dt = " + getStat_dt());
        System.out.println("dlco_clsf_cd = " + getDlco_clsf_cd());
        System.out.println("dlco_cd = " + getDlco_cd());
        System.out.println("dlco_cdnm = " + getDlco_cdnm());
        System.out.println("deps_clsf_cd = " + getDeps_clsf_cd());
        System.out.println("rmks1 = " + getRmks1());
        System.out.println("chg_pers = " + getChg_pers());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("deptcd = " + getDeptcd());
        System.out.println("row_no = " + getRow_no());
        System.out.println("bank_cd = " + getBank_cd());
        System.out.println("note_no = " + getNote_no());
        System.out.println("note_seq = " + getNote_seq());
        System.out.println("rcpay_amt = " + getRcpay_amt());
        System.out.println("coms = " + getComs());
        System.out.println("note_clsf_cd = " + getNote_clsf_cd());
        System.out.println("mtry_dt = " + getMtry_dt());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String stat_dt = req.getParameter("stat_dt");
if( stat_dt == null){
	System.out.println(this.toString+" : stat_dt is null" );
}else{
	System.out.println(this.toString+" : stat_dt is "+stat_dt );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String dlco_cdnm = req.getParameter("dlco_cdnm");
if( dlco_cdnm == null){
	System.out.println(this.toString+" : dlco_cdnm is null" );
}else{
	System.out.println(this.toString+" : dlco_cdnm is "+dlco_cdnm );
}
String deps_clsf_cd = req.getParameter("deps_clsf_cd");
if( deps_clsf_cd == null){
	System.out.println(this.toString+" : deps_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : deps_clsf_cd is "+deps_clsf_cd );
}
String rmks1 = req.getParameter("rmks1");
if( rmks1 == null){
	System.out.println(this.toString+" : rmks1 is null" );
}else{
	System.out.println(this.toString+" : rmks1 is "+rmks1 );
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
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String row_no = req.getParameter("row_no");
if( row_no == null){
	System.out.println(this.toString+" : row_no is null" );
}else{
	System.out.println(this.toString+" : row_no is "+row_no );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String note_no = req.getParameter("note_no");
if( note_no == null){
	System.out.println(this.toString+" : note_no is null" );
}else{
	System.out.println(this.toString+" : note_no is "+note_no );
}
String note_seq = req.getParameter("note_seq");
if( note_seq == null){
	System.out.println(this.toString+" : note_seq is null" );
}else{
	System.out.println(this.toString+" : note_seq is "+note_seq );
}
String rcpay_amt = req.getParameter("rcpay_amt");
if( rcpay_amt == null){
	System.out.println(this.toString+" : rcpay_amt is null" );
}else{
	System.out.println(this.toString+" : rcpay_amt is "+rcpay_amt );
}
String coms = req.getParameter("coms");
if( coms == null){
	System.out.println(this.toString+" : coms is null" );
}else{
	System.out.println(this.toString+" : coms is "+coms );
}
String note_clsf_cd = req.getParameter("note_clsf_cd");
if( note_clsf_cd == null){
	System.out.println(this.toString+" : note_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : note_clsf_cd is "+note_clsf_cd );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String clsf = Util.checkString(req.getParameter("clsf"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String stat_dt = Util.checkString(req.getParameter("stat_dt"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String dlco_cdnm = Util.checkString(req.getParameter("dlco_cdnm"));
String deps_clsf_cd = Util.checkString(req.getParameter("deps_clsf_cd"));
String rmks1 = Util.checkString(req.getParameter("rmks1"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String row_no = Util.checkString(req.getParameter("row_no"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String note_no = Util.checkString(req.getParameter("note_no"));
String note_seq = Util.checkString(req.getParameter("note_seq"));
String rcpay_amt = Util.checkString(req.getParameter("rcpay_amt"));
String coms = Util.checkString(req.getParameter("coms"));
String note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String stat_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_dt")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dlco_cdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cdnm")));
String deps_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_clsf_cd")));
String rmks1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks1")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String row_no = Util.Uni2Ksc(Util.checkString(req.getParameter("row_no")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("note_no")));
String note_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("note_seq")));
String rcpay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpay_amt")));
String coms = Util.Uni2Ksc(Util.checkString(req.getParameter("coms")));
String note_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("note_clsf_cd")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setClsf(clsf);
dm.setCmpy_cd(cmpy_cd);
dm.setStat_dt(stat_dt);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setDlco_cdnm(dlco_cdnm);
dm.setDeps_clsf_cd(deps_clsf_cd);
dm.setRmks1(rmks1);
dm.setChg_pers(chg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setDeptcd(deptcd);
dm.setRow_no(row_no);
dm.setBank_cd(bank_cd);
dm.setNote_no(note_no);
dm.setNote_seq(note_seq);
dm.setRcpay_amt(rcpay_amt);
dm.setComs(coms);
dm.setNote_clsf_cd(note_clsf_cd);
dm.setMtry_dt(mtry_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 13 20:08:11 KST 2009 */