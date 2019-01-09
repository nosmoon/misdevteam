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


package chosun.ciis.mt.prnpap.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.ds.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_3301_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String sub_seq;
	public String issu_dt;
	public String fac_clsf;
	public String papcmpy_cd;
	public String rot_mach_no;
	public String sett_no;
	public String sett_seq;
	public String a_cmcnt_val;
	public String a_wgt;
	public String a_un_use_yn;
	public String b_cmcnt_val;
	public String b_wgt;
	public String b_un_use_yn;
	public String c_cmcnt_val;
	public String c_wgt;
	public String c_un_use_yn;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String gubun;

	public MT_PRNPAP_3301_ADM(){}
	public MT_PRNPAP_3301_ADM(String cmpy_cd, String occr_dt, String seq, String sub_seq, String issu_dt, String fac_clsf, String papcmpy_cd, String rot_mach_no, String sett_no, String sett_seq, String a_cmcnt_val, String a_wgt, String a_un_use_yn, String b_cmcnt_val, String b_wgt, String b_un_use_yn, String c_cmcnt_val, String c_wgt, String c_un_use_yn, String incmg_pers_ipaddr, String incmg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.sub_seq = sub_seq;
		this.issu_dt = issu_dt;
		this.fac_clsf = fac_clsf;
		this.papcmpy_cd = papcmpy_cd;
		this.rot_mach_no = rot_mach_no;
		this.sett_no = sett_no;
		this.sett_seq = sett_seq;
		this.a_cmcnt_val = a_cmcnt_val;
		this.a_wgt = a_wgt;
		this.a_un_use_yn = a_un_use_yn;
		this.b_cmcnt_val = b_cmcnt_val;
		this.b_wgt = b_wgt;
		this.b_un_use_yn = b_un_use_yn;
		this.c_cmcnt_val = c_cmcnt_val;
		this.c_wgt = c_wgt;
		this.c_un_use_yn = c_un_use_yn;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setRot_mach_no(String rot_mach_no){
		this.rot_mach_no = rot_mach_no;
	}

	public void setSett_no(String sett_no){
		this.sett_no = sett_no;
	}

	public void setSett_seq(String sett_seq){
		this.sett_seq = sett_seq;
	}

	public void setA_cmcnt_val(String a_cmcnt_val){
		this.a_cmcnt_val = a_cmcnt_val;
	}

	public void setA_wgt(String a_wgt){
		this.a_wgt = a_wgt;
	}

	public void setA_un_use_yn(String a_un_use_yn){
		this.a_un_use_yn = a_un_use_yn;
	}

	public void setB_cmcnt_val(String b_cmcnt_val){
		this.b_cmcnt_val = b_cmcnt_val;
	}

	public void setB_wgt(String b_wgt){
		this.b_wgt = b_wgt;
	}

	public void setB_un_use_yn(String b_un_use_yn){
		this.b_un_use_yn = b_un_use_yn;
	}

	public void setC_cmcnt_val(String c_cmcnt_val){
		this.c_cmcnt_val = c_cmcnt_val;
	}

	public void setC_wgt(String c_wgt){
		this.c_wgt = c_wgt;
	}

	public void setC_un_use_yn(String c_un_use_yn){
		this.c_un_use_yn = c_un_use_yn;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getRot_mach_no(){
		return this.rot_mach_no;
	}

	public String getSett_no(){
		return this.sett_no;
	}

	public String getSett_seq(){
		return this.sett_seq;
	}

	public String getA_cmcnt_val(){
		return this.a_cmcnt_val;
	}

	public String getA_wgt(){
		return this.a_wgt;
	}

	public String getA_un_use_yn(){
		return this.a_un_use_yn;
	}

	public String getB_cmcnt_val(){
		return this.b_cmcnt_val;
	}

	public String getB_wgt(){
		return this.b_wgt;
	}

	public String getB_un_use_yn(){
		return this.b_un_use_yn;
	}

	public String getC_cmcnt_val(){
		return this.c_cmcnt_val;
	}

	public String getC_wgt(){
		return this.c_wgt;
	}

	public String getC_un_use_yn(){
		return this.c_un_use_yn;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PRNPAP_3301_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PRNPAP_3301_ADM dm = (MT_PRNPAP_3301_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.sub_seq);
		cstmt.setString(7, dm.issu_dt);
		cstmt.setString(8, dm.fac_clsf);
		cstmt.setString(9, dm.papcmpy_cd);
		cstmt.setString(10, dm.rot_mach_no);
		cstmt.setString(11, dm.sett_no);
		cstmt.setString(12, dm.sett_seq);
		cstmt.setString(13, dm.a_cmcnt_val);
		cstmt.setString(14, dm.a_wgt);
		cstmt.setString(15, dm.a_un_use_yn);
		cstmt.setString(16, dm.b_cmcnt_val);
		cstmt.setString(17, dm.b_wgt);
		cstmt.setString(18, dm.b_un_use_yn);
		cstmt.setString(19, dm.c_cmcnt_val);
		cstmt.setString(20, dm.c_wgt);
		cstmt.setString(21, dm.c_un_use_yn);
		cstmt.setString(22, dm.incmg_pers_ipaddr);
		cstmt.setString(23, dm.incmg_pers);
		cstmt.setString(24, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.prnpap.ds.MT_PRNPAP_3301_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("sub_seq = [" + getSub_seq() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("papcmpy_cd = [" + getPapcmpy_cd() + "]");
		System.out.println("rot_mach_no = [" + getRot_mach_no() + "]");
		System.out.println("sett_no = [" + getSett_no() + "]");
		System.out.println("sett_seq = [" + getSett_seq() + "]");
		System.out.println("a_cmcnt_val = [" + getA_cmcnt_val() + "]");
		System.out.println("a_wgt = [" + getA_wgt() + "]");
		System.out.println("a_un_use_yn = [" + getA_un_use_yn() + "]");
		System.out.println("b_cmcnt_val = [" + getB_cmcnt_val() + "]");
		System.out.println("b_wgt = [" + getB_wgt() + "]");
		System.out.println("b_un_use_yn = [" + getB_un_use_yn() + "]");
		System.out.println("c_cmcnt_val = [" + getC_cmcnt_val() + "]");
		System.out.println("c_wgt = [" + getC_wgt() + "]");
		System.out.println("c_un_use_yn = [" + getC_un_use_yn() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
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
String sub_seq = req.getParameter("sub_seq");
if( sub_seq == null){
	System.out.println(this.toString+" : sub_seq is null" );
}else{
	System.out.println(this.toString+" : sub_seq is "+sub_seq );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String papcmpy_cd = req.getParameter("papcmpy_cd");
if( papcmpy_cd == null){
	System.out.println(this.toString+" : papcmpy_cd is null" );
}else{
	System.out.println(this.toString+" : papcmpy_cd is "+papcmpy_cd );
}
String rot_mach_no = req.getParameter("rot_mach_no");
if( rot_mach_no == null){
	System.out.println(this.toString+" : rot_mach_no is null" );
}else{
	System.out.println(this.toString+" : rot_mach_no is "+rot_mach_no );
}
String sett_no = req.getParameter("sett_no");
if( sett_no == null){
	System.out.println(this.toString+" : sett_no is null" );
}else{
	System.out.println(this.toString+" : sett_no is "+sett_no );
}
String sett_seq = req.getParameter("sett_seq");
if( sett_seq == null){
	System.out.println(this.toString+" : sett_seq is null" );
}else{
	System.out.println(this.toString+" : sett_seq is "+sett_seq );
}
String a_cmcnt_val = req.getParameter("a_cmcnt_val");
if( a_cmcnt_val == null){
	System.out.println(this.toString+" : a_cmcnt_val is null" );
}else{
	System.out.println(this.toString+" : a_cmcnt_val is "+a_cmcnt_val );
}
String a_wgt = req.getParameter("a_wgt");
if( a_wgt == null){
	System.out.println(this.toString+" : a_wgt is null" );
}else{
	System.out.println(this.toString+" : a_wgt is "+a_wgt );
}
String a_un_use_yn = req.getParameter("a_un_use_yn");
if( a_un_use_yn == null){
	System.out.println(this.toString+" : a_un_use_yn is null" );
}else{
	System.out.println(this.toString+" : a_un_use_yn is "+a_un_use_yn );
}
String b_cmcnt_val = req.getParameter("b_cmcnt_val");
if( b_cmcnt_val == null){
	System.out.println(this.toString+" : b_cmcnt_val is null" );
}else{
	System.out.println(this.toString+" : b_cmcnt_val is "+b_cmcnt_val );
}
String b_wgt = req.getParameter("b_wgt");
if( b_wgt == null){
	System.out.println(this.toString+" : b_wgt is null" );
}else{
	System.out.println(this.toString+" : b_wgt is "+b_wgt );
}
String b_un_use_yn = req.getParameter("b_un_use_yn");
if( b_un_use_yn == null){
	System.out.println(this.toString+" : b_un_use_yn is null" );
}else{
	System.out.println(this.toString+" : b_un_use_yn is "+b_un_use_yn );
}
String c_cmcnt_val = req.getParameter("c_cmcnt_val");
if( c_cmcnt_val == null){
	System.out.println(this.toString+" : c_cmcnt_val is null" );
}else{
	System.out.println(this.toString+" : c_cmcnt_val is "+c_cmcnt_val );
}
String c_wgt = req.getParameter("c_wgt");
if( c_wgt == null){
	System.out.println(this.toString+" : c_wgt is null" );
}else{
	System.out.println(this.toString+" : c_wgt is "+c_wgt );
}
String c_un_use_yn = req.getParameter("c_un_use_yn");
if( c_un_use_yn == null){
	System.out.println(this.toString+" : c_un_use_yn is null" );
}else{
	System.out.println(this.toString+" : c_un_use_yn is "+c_un_use_yn );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
String rot_mach_no = Util.checkString(req.getParameter("rot_mach_no"));
String sett_no = Util.checkString(req.getParameter("sett_no"));
String sett_seq = Util.checkString(req.getParameter("sett_seq"));
String a_cmcnt_val = Util.checkString(req.getParameter("a_cmcnt_val"));
String a_wgt = Util.checkString(req.getParameter("a_wgt"));
String a_un_use_yn = Util.checkString(req.getParameter("a_un_use_yn"));
String b_cmcnt_val = Util.checkString(req.getParameter("b_cmcnt_val"));
String b_wgt = Util.checkString(req.getParameter("b_wgt"));
String b_un_use_yn = Util.checkString(req.getParameter("b_un_use_yn"));
String c_cmcnt_val = Util.checkString(req.getParameter("c_cmcnt_val"));
String c_wgt = Util.checkString(req.getParameter("c_wgt"));
String c_un_use_yn = Util.checkString(req.getParameter("c_un_use_yn"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String papcmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("papcmpy_cd")));
String rot_mach_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rot_mach_no")));
String sett_no = Util.Uni2Ksc(Util.checkString(req.getParameter("sett_no")));
String sett_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sett_seq")));
String a_cmcnt_val = Util.Uni2Ksc(Util.checkString(req.getParameter("a_cmcnt_val")));
String a_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("a_wgt")));
String a_un_use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("a_un_use_yn")));
String b_cmcnt_val = Util.Uni2Ksc(Util.checkString(req.getParameter("b_cmcnt_val")));
String b_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("b_wgt")));
String b_un_use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("b_un_use_yn")));
String c_cmcnt_val = Util.Uni2Ksc(Util.checkString(req.getParameter("c_cmcnt_val")));
String c_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("c_wgt")));
String c_un_use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("c_un_use_yn")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setSub_seq(sub_seq);
dm.setIssu_dt(issu_dt);
dm.setFac_clsf(fac_clsf);
dm.setPapcmpy_cd(papcmpy_cd);
dm.setRot_mach_no(rot_mach_no);
dm.setSett_no(sett_no);
dm.setSett_seq(sett_seq);
dm.setA_cmcnt_val(a_cmcnt_val);
dm.setA_wgt(a_wgt);
dm.setA_un_use_yn(a_un_use_yn);
dm.setB_cmcnt_val(b_cmcnt_val);
dm.setB_wgt(b_wgt);
dm.setB_un_use_yn(b_un_use_yn);
dm.setC_cmcnt_val(c_cmcnt_val);
dm.setC_wgt(c_wgt);
dm.setC_un_use_yn(c_un_use_yn);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 20:47:49 KST 2009 */