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


public class FC_ACCT_2124_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String prof_type_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String bank_cd;
	public String note_no;
	public String slip_rcpm_dt;
	public String in_igyb;
	public String rcpm_shet_kind;
	public String rcpm_shet_no;
	public String whco_slip_clsf;
	public String whco_slip_no;
	public String rcpm_amt;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_ACCT_2124_DDM(){}
	public FC_ACCT_2124_DDM(String cmpy_cd, String prof_type_cd, String slip_clsf_cd, String slip_occr_dt, String slip_seq, String bank_cd, String note_no, String slip_rcpm_dt, String in_igyb, String rcpm_shet_kind, String rcpm_shet_no, String whco_slip_clsf, String whco_slip_no, String rcpm_amt, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.prof_type_cd = prof_type_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.bank_cd = bank_cd;
		this.note_no = note_no;
		this.slip_rcpm_dt = slip_rcpm_dt;
		this.in_igyb = in_igyb;
		this.rcpm_shet_kind = rcpm_shet_kind;
		this.rcpm_shet_no = rcpm_shet_no;
		this.whco_slip_clsf = whco_slip_clsf;
		this.whco_slip_no = whco_slip_no;
		this.rcpm_amt = rcpm_amt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setSlip_rcpm_dt(String slip_rcpm_dt){
		this.slip_rcpm_dt = slip_rcpm_dt;
	}

	public void setIn_igyb(String in_igyb){
		this.in_igyb = in_igyb;
	}

	public void setRcpm_shet_kind(String rcpm_shet_kind){
		this.rcpm_shet_kind = rcpm_shet_kind;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setWhco_slip_clsf(String whco_slip_clsf){
		this.whco_slip_clsf = whco_slip_clsf;
	}

	public void setWhco_slip_no(String whco_slip_no){
		this.whco_slip_no = whco_slip_no;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
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

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getSlip_rcpm_dt(){
		return this.slip_rcpm_dt;
	}

	public String getIn_igyb(){
		return this.in_igyb;
	}

	public String getRcpm_shet_kind(){
		return this.rcpm_shet_kind;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getWhco_slip_clsf(){
		return this.whco_slip_clsf;
	}

	public String getWhco_slip_no(){
		return this.whco_slip_no;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2124_D(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2124_DDM dm = (FC_ACCT_2124_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.prof_type_cd);
		cstmt.setString(5, dm.slip_clsf_cd);
		cstmt.setString(6, dm.slip_occr_dt);
		cstmt.setString(7, dm.slip_seq);
		cstmt.setString(8, dm.bank_cd);
		cstmt.setString(9, dm.note_no);
		cstmt.setString(10, dm.slip_rcpm_dt);
		cstmt.setString(11, dm.in_igyb);
		cstmt.setString(12, dm.rcpm_shet_kind);
		cstmt.setString(13, dm.rcpm_shet_no);
		cstmt.setString(14, dm.whco_slip_clsf);
		cstmt.setString(15, dm.whco_slip_no);
		cstmt.setString(16, dm.rcpm_amt);
		cstmt.setString(17, dm.incmg_pers);
		cstmt.setString(18, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2124_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("prof_type_cd = [" + getProf_type_cd() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("note_no = [" + getNote_no() + "]");
		System.out.println("slip_rcpm_dt = [" + getSlip_rcpm_dt() + "]");
		System.out.println("in_igyb = [" + getIn_igyb() + "]");
		System.out.println("rcpm_shet_kind = [" + getRcpm_shet_kind() + "]");
		System.out.println("rcpm_shet_no = [" + getRcpm_shet_no() + "]");
		System.out.println("whco_slip_clsf = [" + getWhco_slip_clsf() + "]");
		System.out.println("whco_slip_no = [" + getWhco_slip_no() + "]");
		System.out.println("rcpm_amt = [" + getRcpm_amt() + "]");
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
String prof_type_cd = req.getParameter("prof_type_cd");
if( prof_type_cd == null){
	System.out.println(this.toString+" : prof_type_cd is null" );
}else{
	System.out.println(this.toString+" : prof_type_cd is "+prof_type_cd );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
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
String slip_rcpm_dt = req.getParameter("slip_rcpm_dt");
if( slip_rcpm_dt == null){
	System.out.println(this.toString+" : slip_rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : slip_rcpm_dt is "+slip_rcpm_dt );
}
String in_igyb = req.getParameter("in_igyb");
if( in_igyb == null){
	System.out.println(this.toString+" : in_igyb is null" );
}else{
	System.out.println(this.toString+" : in_igyb is "+in_igyb );
}
String rcpm_shet_kind = req.getParameter("rcpm_shet_kind");
if( rcpm_shet_kind == null){
	System.out.println(this.toString+" : rcpm_shet_kind is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_kind is "+rcpm_shet_kind );
}
String rcpm_shet_no = req.getParameter("rcpm_shet_no");
if( rcpm_shet_no == null){
	System.out.println(this.toString+" : rcpm_shet_no is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_no is "+rcpm_shet_no );
}
String whco_slip_clsf = req.getParameter("whco_slip_clsf");
if( whco_slip_clsf == null){
	System.out.println(this.toString+" : whco_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : whco_slip_clsf is "+whco_slip_clsf );
}
String whco_slip_no = req.getParameter("whco_slip_no");
if( whco_slip_no == null){
	System.out.println(this.toString+" : whco_slip_no is null" );
}else{
	System.out.println(this.toString+" : whco_slip_no is "+whco_slip_no );
}
String rcpm_amt = req.getParameter("rcpm_amt");
if( rcpm_amt == null){
	System.out.println(this.toString+" : rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : rcpm_amt is "+rcpm_amt );
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
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String note_no = Util.checkString(req.getParameter("note_no"));
String slip_rcpm_dt = Util.checkString(req.getParameter("slip_rcpm_dt"));
String in_igyb = Util.checkString(req.getParameter("in_igyb"));
String rcpm_shet_kind = Util.checkString(req.getParameter("rcpm_shet_kind"));
String rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
String whco_slip_clsf = Util.checkString(req.getParameter("whco_slip_clsf"));
String whco_slip_no = Util.checkString(req.getParameter("whco_slip_no"));
String rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("note_no")));
String slip_rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_rcpm_dt")));
String in_igyb = Util.Uni2Ksc(Util.checkString(req.getParameter("in_igyb")));
String rcpm_shet_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_kind")));
String rcpm_shet_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no")));
String whco_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("whco_slip_clsf")));
String whco_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("whco_slip_no")));
String rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_amt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setProf_type_cd(prof_type_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_seq(slip_seq);
dm.setBank_cd(bank_cd);
dm.setNote_no(note_no);
dm.setSlip_rcpm_dt(slip_rcpm_dt);
dm.setIn_igyb(in_igyb);
dm.setRcpm_shet_kind(rcpm_shet_kind);
dm.setRcpm_shet_no(rcpm_shet_no);
dm.setWhco_slip_clsf(whco_slip_clsf);
dm.setWhco_slip_no(whco_slip_no);
dm.setRcpm_amt(rcpm_amt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 30 17:16:29 KST 2009 */