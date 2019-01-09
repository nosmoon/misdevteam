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


package chosun.ciis.hd.trip.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.trip.ds.*;
import chosun.ciis.hd.trip.rec.*;

/**
 * 
 */


public class HD_TRIP_1601_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String with_seq;
	public String invit_dds;
	public String draft_dt;
	public String adpay_no;
	public String adpay_amt;
	public String adpay_plan_dt;
	public String actu_pay_dt;
	public String expn_reso_no;
	public String u_ipadd;
	public String u_id;

	public HD_TRIP_1601_ADM(){}
	public HD_TRIP_1601_ADM(String mode, String cmpy_cd, String emp_no, String occr_dt, String seq, String with_seq, String invit_dds, String draft_dt, String adpay_no, String adpay_amt, String adpay_plan_dt, String actu_pay_dt, String expn_reso_no, String u_ipadd, String u_id){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.with_seq = with_seq;
		this.invit_dds = invit_dds;
		this.draft_dt = draft_dt;
		this.adpay_no = adpay_no;
		this.adpay_amt = adpay_amt;
		this.adpay_plan_dt = adpay_plan_dt;
		this.actu_pay_dt = actu_pay_dt;
		this.expn_reso_no = expn_reso_no;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setWith_seq(String with_seq){
		this.with_seq = with_seq;
	}

	public void setInvit_dds(String invit_dds){
		this.invit_dds = invit_dds;
	}

	public void setDraft_dt(String draft_dt){
		this.draft_dt = draft_dt;
	}

	public void setAdpay_no(String adpay_no){
		this.adpay_no = adpay_no;
	}

	public void setAdpay_amt(String adpay_amt){
		this.adpay_amt = adpay_amt;
	}

	public void setAdpay_plan_dt(String adpay_plan_dt){
		this.adpay_plan_dt = adpay_plan_dt;
	}

	public void setActu_pay_dt(String actu_pay_dt){
		this.actu_pay_dt = actu_pay_dt;
	}

	public void setExpn_reso_no(String expn_reso_no){
		this.expn_reso_no = expn_reso_no;
	}

	public void setU_ipadd(String u_ipadd){
		this.u_ipadd = u_ipadd;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getWith_seq(){
		return this.with_seq;
	}

	public String getInvit_dds(){
		return this.invit_dds;
	}

	public String getDraft_dt(){
		return this.draft_dt;
	}

	public String getAdpay_no(){
		return this.adpay_no;
	}

	public String getAdpay_amt(){
		return this.adpay_amt;
	}

	public String getAdpay_plan_dt(){
		return this.adpay_plan_dt;
	}

	public String getActu_pay_dt(){
		return this.actu_pay_dt;
	}

	public String getExpn_reso_no(){
		return this.expn_reso_no;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TRIP_1601_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TRIP_1601_ADM dm = (HD_TRIP_1601_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.with_seq);
		cstmt.setString(9, dm.invit_dds);
		cstmt.setString(10, dm.draft_dt);
		cstmt.setString(11, dm.adpay_no);
		cstmt.setString(12, dm.adpay_amt);
		cstmt.setString(13, dm.adpay_plan_dt);
		cstmt.setString(14, dm.actu_pay_dt);
		cstmt.setString(15, dm.expn_reso_no);
		cstmt.setString(16, dm.u_ipadd);
		cstmt.setString(17, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.trip.ds.HD_TRIP_1601_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("with_seq = [" + getWith_seq() + "]");
		System.out.println("invit_dds = [" + getInvit_dds() + "]");
		System.out.println("draft_dt = [" + getDraft_dt() + "]");
		System.out.println("adpay_no = [" + getAdpay_no() + "]");
		System.out.println("adpay_amt = [" + getAdpay_amt() + "]");
		System.out.println("adpay_plan_dt = [" + getAdpay_plan_dt() + "]");
		System.out.println("actu_pay_dt = [" + getActu_pay_dt() + "]");
		System.out.println("expn_reso_no = [" + getExpn_reso_no() + "]");
		System.out.println("u_ipadd = [" + getU_ipadd() + "]");
		System.out.println("u_id = [" + getU_id() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String with_seq = req.getParameter("with_seq");
if( with_seq == null){
	System.out.println(this.toString+" : with_seq is null" );
}else{
	System.out.println(this.toString+" : with_seq is "+with_seq );
}
String invit_dds = req.getParameter("invit_dds");
if( invit_dds == null){
	System.out.println(this.toString+" : invit_dds is null" );
}else{
	System.out.println(this.toString+" : invit_dds is "+invit_dds );
}
String draft_dt = req.getParameter("draft_dt");
if( draft_dt == null){
	System.out.println(this.toString+" : draft_dt is null" );
}else{
	System.out.println(this.toString+" : draft_dt is "+draft_dt );
}
String adpay_no = req.getParameter("adpay_no");
if( adpay_no == null){
	System.out.println(this.toString+" : adpay_no is null" );
}else{
	System.out.println(this.toString+" : adpay_no is "+adpay_no );
}
String adpay_amt = req.getParameter("adpay_amt");
if( adpay_amt == null){
	System.out.println(this.toString+" : adpay_amt is null" );
}else{
	System.out.println(this.toString+" : adpay_amt is "+adpay_amt );
}
String adpay_plan_dt = req.getParameter("adpay_plan_dt");
if( adpay_plan_dt == null){
	System.out.println(this.toString+" : adpay_plan_dt is null" );
}else{
	System.out.println(this.toString+" : adpay_plan_dt is "+adpay_plan_dt );
}
String actu_pay_dt = req.getParameter("actu_pay_dt");
if( actu_pay_dt == null){
	System.out.println(this.toString+" : actu_pay_dt is null" );
}else{
	System.out.println(this.toString+" : actu_pay_dt is "+actu_pay_dt );
}
String expn_reso_no = req.getParameter("expn_reso_no");
if( expn_reso_no == null){
	System.out.println(this.toString+" : expn_reso_no is null" );
}else{
	System.out.println(this.toString+" : expn_reso_no is "+expn_reso_no );
}
String u_ipadd = req.getParameter("u_ipadd");
if( u_ipadd == null){
	System.out.println(this.toString+" : u_ipadd is null" );
}else{
	System.out.println(this.toString+" : u_ipadd is "+u_ipadd );
}
String u_id = req.getParameter("u_id");
if( u_id == null){
	System.out.println(this.toString+" : u_id is null" );
}else{
	System.out.println(this.toString+" : u_id is "+u_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String with_seq = Util.checkString(req.getParameter("with_seq"));
String invit_dds = Util.checkString(req.getParameter("invit_dds"));
String draft_dt = Util.checkString(req.getParameter("draft_dt"));
String adpay_no = Util.checkString(req.getParameter("adpay_no"));
String adpay_amt = Util.checkString(req.getParameter("adpay_amt"));
String adpay_plan_dt = Util.checkString(req.getParameter("adpay_plan_dt"));
String actu_pay_dt = Util.checkString(req.getParameter("actu_pay_dt"));
String expn_reso_no = Util.checkString(req.getParameter("expn_reso_no"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String with_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("with_seq")));
String invit_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("invit_dds")));
String draft_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_dt")));
String adpay_no = Util.Uni2Ksc(Util.checkString(req.getParameter("adpay_no")));
String adpay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("adpay_amt")));
String adpay_plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("adpay_plan_dt")));
String actu_pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("actu_pay_dt")));
String expn_reso_no = Util.Uni2Ksc(Util.checkString(req.getParameter("expn_reso_no")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setWith_seq(with_seq);
dm.setInvit_dds(invit_dds);
dm.setDraft_dt(draft_dt);
dm.setAdpay_no(adpay_no);
dm.setAdpay_amt(adpay_amt);
dm.setAdpay_plan_dt(adpay_plan_dt);
dm.setActu_pay_dt(actu_pay_dt);
dm.setExpn_reso_no(expn_reso_no);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 18 15:26:01 KST 2009 */