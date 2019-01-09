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


public class MT_PRNPAP_3201_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String issu_dt;
	public String fac_clsf;
	public String paper_loca_clsf;
	public String papcmpy_cd;
	public String a_rem_qunt_cnt;
	public String a_rem_qunt_wgt;
	public String a_un_use_roll_cnt;
	public String b_rem_qunt_cnt;
	public String b_rem_qunt_wgt;
	public String b_un_use_roll_cnt;
	public String c_rem_qunt_cnt;
	public String c_rem_qunt_wgt;
	public String c_un_use_roll_cnt;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String gubun;

	public MT_PRNPAP_3201_ADM(){}
	public MT_PRNPAP_3201_ADM(String cmpy_cd, String occr_dt, String seq, String issu_dt, String fac_clsf, String paper_loca_clsf, String papcmpy_cd, String a_rem_qunt_cnt, String a_rem_qunt_wgt, String a_un_use_roll_cnt, String b_rem_qunt_cnt, String b_rem_qunt_wgt, String b_un_use_roll_cnt, String c_rem_qunt_cnt, String c_rem_qunt_wgt, String c_un_use_roll_cnt, String incmg_pers_ipaddr, String incmg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.issu_dt = issu_dt;
		this.fac_clsf = fac_clsf;
		this.paper_loca_clsf = paper_loca_clsf;
		this.papcmpy_cd = papcmpy_cd;
		this.a_rem_qunt_cnt = a_rem_qunt_cnt;
		this.a_rem_qunt_wgt = a_rem_qunt_wgt;
		this.a_un_use_roll_cnt = a_un_use_roll_cnt;
		this.b_rem_qunt_cnt = b_rem_qunt_cnt;
		this.b_rem_qunt_wgt = b_rem_qunt_wgt;
		this.b_un_use_roll_cnt = b_un_use_roll_cnt;
		this.c_rem_qunt_cnt = c_rem_qunt_cnt;
		this.c_rem_qunt_wgt = c_rem_qunt_wgt;
		this.c_un_use_roll_cnt = c_un_use_roll_cnt;
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

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPaper_loca_clsf(String paper_loca_clsf){
		this.paper_loca_clsf = paper_loca_clsf;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setA_rem_qunt_cnt(String a_rem_qunt_cnt){
		this.a_rem_qunt_cnt = a_rem_qunt_cnt;
	}

	public void setA_rem_qunt_wgt(String a_rem_qunt_wgt){
		this.a_rem_qunt_wgt = a_rem_qunt_wgt;
	}

	public void setA_un_use_roll_cnt(String a_un_use_roll_cnt){
		this.a_un_use_roll_cnt = a_un_use_roll_cnt;
	}

	public void setB_rem_qunt_cnt(String b_rem_qunt_cnt){
		this.b_rem_qunt_cnt = b_rem_qunt_cnt;
	}

	public void setB_rem_qunt_wgt(String b_rem_qunt_wgt){
		this.b_rem_qunt_wgt = b_rem_qunt_wgt;
	}

	public void setB_un_use_roll_cnt(String b_un_use_roll_cnt){
		this.b_un_use_roll_cnt = b_un_use_roll_cnt;
	}

	public void setC_rem_qunt_cnt(String c_rem_qunt_cnt){
		this.c_rem_qunt_cnt = c_rem_qunt_cnt;
	}

	public void setC_rem_qunt_wgt(String c_rem_qunt_wgt){
		this.c_rem_qunt_wgt = c_rem_qunt_wgt;
	}

	public void setC_un_use_roll_cnt(String c_un_use_roll_cnt){
		this.c_un_use_roll_cnt = c_un_use_roll_cnt;
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

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPaper_loca_clsf(){
		return this.paper_loca_clsf;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getA_rem_qunt_cnt(){
		return this.a_rem_qunt_cnt;
	}

	public String getA_rem_qunt_wgt(){
		return this.a_rem_qunt_wgt;
	}

	public String getA_un_use_roll_cnt(){
		return this.a_un_use_roll_cnt;
	}

	public String getB_rem_qunt_cnt(){
		return this.b_rem_qunt_cnt;
	}

	public String getB_rem_qunt_wgt(){
		return this.b_rem_qunt_wgt;
	}

	public String getB_un_use_roll_cnt(){
		return this.b_un_use_roll_cnt;
	}

	public String getC_rem_qunt_cnt(){
		return this.c_rem_qunt_cnt;
	}

	public String getC_rem_qunt_wgt(){
		return this.c_rem_qunt_wgt;
	}

	public String getC_un_use_roll_cnt(){
		return this.c_un_use_roll_cnt;
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
		 return "{ call MISMAT.SP_MT_PRNPAP_3201_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PRNPAP_3201_ADM dm = (MT_PRNPAP_3201_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.issu_dt);
		cstmt.setString(7, dm.fac_clsf);
		cstmt.setString(8, dm.paper_loca_clsf);
		cstmt.setString(9, dm.papcmpy_cd);
		cstmt.setString(10, dm.a_rem_qunt_cnt);
		cstmt.setString(11, dm.a_rem_qunt_wgt);
		cstmt.setString(12, dm.a_un_use_roll_cnt);
		cstmt.setString(13, dm.b_rem_qunt_cnt);
		cstmt.setString(14, dm.b_rem_qunt_wgt);
		cstmt.setString(15, dm.b_un_use_roll_cnt);
		cstmt.setString(16, dm.c_rem_qunt_cnt);
		cstmt.setString(17, dm.c_rem_qunt_wgt);
		cstmt.setString(18, dm.c_un_use_roll_cnt);
		cstmt.setString(19, dm.incmg_pers_ipaddr);
		cstmt.setString(20, dm.incmg_pers);
		cstmt.setString(21, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.prnpap.ds.MT_PRNPAP_3201_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("paper_loca_clsf = [" + getPaper_loca_clsf() + "]");
		System.out.println("papcmpy_cd = [" + getPapcmpy_cd() + "]");
		System.out.println("a_rem_qunt_cnt = [" + getA_rem_qunt_cnt() + "]");
		System.out.println("a_rem_qunt_wgt = [" + getA_rem_qunt_wgt() + "]");
		System.out.println("a_un_use_roll_cnt = [" + getA_un_use_roll_cnt() + "]");
		System.out.println("b_rem_qunt_cnt = [" + getB_rem_qunt_cnt() + "]");
		System.out.println("b_rem_qunt_wgt = [" + getB_rem_qunt_wgt() + "]");
		System.out.println("b_un_use_roll_cnt = [" + getB_un_use_roll_cnt() + "]");
		System.out.println("c_rem_qunt_cnt = [" + getC_rem_qunt_cnt() + "]");
		System.out.println("c_rem_qunt_wgt = [" + getC_rem_qunt_wgt() + "]");
		System.out.println("c_un_use_roll_cnt = [" + getC_un_use_roll_cnt() + "]");
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
String paper_loca_clsf = req.getParameter("paper_loca_clsf");
if( paper_loca_clsf == null){
	System.out.println(this.toString+" : paper_loca_clsf is null" );
}else{
	System.out.println(this.toString+" : paper_loca_clsf is "+paper_loca_clsf );
}
String papcmpy_cd = req.getParameter("papcmpy_cd");
if( papcmpy_cd == null){
	System.out.println(this.toString+" : papcmpy_cd is null" );
}else{
	System.out.println(this.toString+" : papcmpy_cd is "+papcmpy_cd );
}
String a_rem_qunt_cnt = req.getParameter("a_rem_qunt_cnt");
if( a_rem_qunt_cnt == null){
	System.out.println(this.toString+" : a_rem_qunt_cnt is null" );
}else{
	System.out.println(this.toString+" : a_rem_qunt_cnt is "+a_rem_qunt_cnt );
}
String a_rem_qunt_wgt = req.getParameter("a_rem_qunt_wgt");
if( a_rem_qunt_wgt == null){
	System.out.println(this.toString+" : a_rem_qunt_wgt is null" );
}else{
	System.out.println(this.toString+" : a_rem_qunt_wgt is "+a_rem_qunt_wgt );
}
String a_un_use_roll_cnt = req.getParameter("a_un_use_roll_cnt");
if( a_un_use_roll_cnt == null){
	System.out.println(this.toString+" : a_un_use_roll_cnt is null" );
}else{
	System.out.println(this.toString+" : a_un_use_roll_cnt is "+a_un_use_roll_cnt );
}
String b_rem_qunt_cnt = req.getParameter("b_rem_qunt_cnt");
if( b_rem_qunt_cnt == null){
	System.out.println(this.toString+" : b_rem_qunt_cnt is null" );
}else{
	System.out.println(this.toString+" : b_rem_qunt_cnt is "+b_rem_qunt_cnt );
}
String b_rem_qunt_wgt = req.getParameter("b_rem_qunt_wgt");
if( b_rem_qunt_wgt == null){
	System.out.println(this.toString+" : b_rem_qunt_wgt is null" );
}else{
	System.out.println(this.toString+" : b_rem_qunt_wgt is "+b_rem_qunt_wgt );
}
String b_un_use_roll_cnt = req.getParameter("b_un_use_roll_cnt");
if( b_un_use_roll_cnt == null){
	System.out.println(this.toString+" : b_un_use_roll_cnt is null" );
}else{
	System.out.println(this.toString+" : b_un_use_roll_cnt is "+b_un_use_roll_cnt );
}
String c_rem_qunt_cnt = req.getParameter("c_rem_qunt_cnt");
if( c_rem_qunt_cnt == null){
	System.out.println(this.toString+" : c_rem_qunt_cnt is null" );
}else{
	System.out.println(this.toString+" : c_rem_qunt_cnt is "+c_rem_qunt_cnt );
}
String c_rem_qunt_wgt = req.getParameter("c_rem_qunt_wgt");
if( c_rem_qunt_wgt == null){
	System.out.println(this.toString+" : c_rem_qunt_wgt is null" );
}else{
	System.out.println(this.toString+" : c_rem_qunt_wgt is "+c_rem_qunt_wgt );
}
String c_un_use_roll_cnt = req.getParameter("c_un_use_roll_cnt");
if( c_un_use_roll_cnt == null){
	System.out.println(this.toString+" : c_un_use_roll_cnt is null" );
}else{
	System.out.println(this.toString+" : c_un_use_roll_cnt is "+c_un_use_roll_cnt );
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
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String paper_loca_clsf = Util.checkString(req.getParameter("paper_loca_clsf"));
String papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
String a_rem_qunt_cnt = Util.checkString(req.getParameter("a_rem_qunt_cnt"));
String a_rem_qunt_wgt = Util.checkString(req.getParameter("a_rem_qunt_wgt"));
String a_un_use_roll_cnt = Util.checkString(req.getParameter("a_un_use_roll_cnt"));
String b_rem_qunt_cnt = Util.checkString(req.getParameter("b_rem_qunt_cnt"));
String b_rem_qunt_wgt = Util.checkString(req.getParameter("b_rem_qunt_wgt"));
String b_un_use_roll_cnt = Util.checkString(req.getParameter("b_un_use_roll_cnt"));
String c_rem_qunt_cnt = Util.checkString(req.getParameter("c_rem_qunt_cnt"));
String c_rem_qunt_wgt = Util.checkString(req.getParameter("c_rem_qunt_wgt"));
String c_un_use_roll_cnt = Util.checkString(req.getParameter("c_un_use_roll_cnt"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String paper_loca_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("paper_loca_clsf")));
String papcmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("papcmpy_cd")));
String a_rem_qunt_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("a_rem_qunt_cnt")));
String a_rem_qunt_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("a_rem_qunt_wgt")));
String a_un_use_roll_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("a_un_use_roll_cnt")));
String b_rem_qunt_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("b_rem_qunt_cnt")));
String b_rem_qunt_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("b_rem_qunt_wgt")));
String b_un_use_roll_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("b_un_use_roll_cnt")));
String c_rem_qunt_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("c_rem_qunt_cnt")));
String c_rem_qunt_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("c_rem_qunt_wgt")));
String c_un_use_roll_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("c_un_use_roll_cnt")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setIssu_dt(issu_dt);
dm.setFac_clsf(fac_clsf);
dm.setPaper_loca_clsf(paper_loca_clsf);
dm.setPapcmpy_cd(papcmpy_cd);
dm.setA_rem_qunt_cnt(a_rem_qunt_cnt);
dm.setA_rem_qunt_wgt(a_rem_qunt_wgt);
dm.setA_un_use_roll_cnt(a_un_use_roll_cnt);
dm.setB_rem_qunt_cnt(b_rem_qunt_cnt);
dm.setB_rem_qunt_wgt(b_rem_qunt_wgt);
dm.setB_un_use_roll_cnt(b_un_use_roll_cnt);
dm.setC_rem_qunt_cnt(c_rem_qunt_cnt);
dm.setC_rem_qunt_wgt(c_rem_qunt_wgt);
dm.setC_un_use_roll_cnt(c_un_use_roll_cnt);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 22 16:56:16 KST 2009 */