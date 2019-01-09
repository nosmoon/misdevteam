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


package chosun.ciis.mt.etcpc.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcpc.ds.*;
import chosun.ciis.mt.etcpc.rec.*;

/**
 * 
 */


public class MT_ETCPC_1304_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String modl_mang_no;
	public String occr_dt;
	public String seq;
	public String buy_dt;
	public String use_usag;
	public String buy_cnt;
	public String draft_deptcd;
	public String draft_kind;
	public String draft_no;
	public String nocompen_mant_frdt;
	public String nocompen_mant_todt;
	public String compen_mant_frdt;
	public String compen_mant_todt;
	public String compen_mant_cmpy;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String gubun;

	public MT_ETCPC_1304_ADM(){}
	public MT_ETCPC_1304_ADM(String cmpy_cd, String modl_mang_no, String occr_dt, String seq, String buy_dt, String use_usag, String buy_cnt, String draft_deptcd, String draft_kind, String draft_no, String nocompen_mant_frdt, String nocompen_mant_todt, String compen_mant_frdt, String compen_mant_todt, String compen_mant_cmpy, String incmg_pers_ipaddr, String incmg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.modl_mang_no = modl_mang_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.buy_dt = buy_dt;
		this.use_usag = use_usag;
		this.buy_cnt = buy_cnt;
		this.draft_deptcd = draft_deptcd;
		this.draft_kind = draft_kind;
		this.draft_no = draft_no;
		this.nocompen_mant_frdt = nocompen_mant_frdt;
		this.nocompen_mant_todt = nocompen_mant_todt;
		this.compen_mant_frdt = compen_mant_frdt;
		this.compen_mant_todt = compen_mant_todt;
		this.compen_mant_cmpy = compen_mant_cmpy;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setModl_mang_no(String modl_mang_no){
		this.modl_mang_no = modl_mang_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setBuy_dt(String buy_dt){
		this.buy_dt = buy_dt;
	}

	public void setUse_usag(String use_usag){
		this.use_usag = use_usag;
	}

	public void setBuy_cnt(String buy_cnt){
		this.buy_cnt = buy_cnt;
	}

	public void setDraft_deptcd(String draft_deptcd){
		this.draft_deptcd = draft_deptcd;
	}

	public void setDraft_kind(String draft_kind){
		this.draft_kind = draft_kind;
	}

	public void setDraft_no(String draft_no){
		this.draft_no = draft_no;
	}

	public void setNocompen_mant_frdt(String nocompen_mant_frdt){
		this.nocompen_mant_frdt = nocompen_mant_frdt;
	}

	public void setNocompen_mant_todt(String nocompen_mant_todt){
		this.nocompen_mant_todt = nocompen_mant_todt;
	}

	public void setCompen_mant_frdt(String compen_mant_frdt){
		this.compen_mant_frdt = compen_mant_frdt;
	}

	public void setCompen_mant_todt(String compen_mant_todt){
		this.compen_mant_todt = compen_mant_todt;
	}

	public void setCompen_mant_cmpy(String compen_mant_cmpy){
		this.compen_mant_cmpy = compen_mant_cmpy;
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

	public String getModl_mang_no(){
		return this.modl_mang_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getBuy_dt(){
		return this.buy_dt;
	}

	public String getUse_usag(){
		return this.use_usag;
	}

	public String getBuy_cnt(){
		return this.buy_cnt;
	}

	public String getDraft_deptcd(){
		return this.draft_deptcd;
	}

	public String getDraft_kind(){
		return this.draft_kind;
	}

	public String getDraft_no(){
		return this.draft_no;
	}

	public String getNocompen_mant_frdt(){
		return this.nocompen_mant_frdt;
	}

	public String getNocompen_mant_todt(){
		return this.nocompen_mant_todt;
	}

	public String getCompen_mant_frdt(){
		return this.compen_mant_frdt;
	}

	public String getCompen_mant_todt(){
		return this.compen_mant_todt;
	}

	public String getCompen_mant_cmpy(){
		return this.compen_mant_cmpy;
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
		 return "{ call MISMAT.SP_MT_ETCPC_1304_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCPC_1304_ADM dm = (MT_ETCPC_1304_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.modl_mang_no);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.buy_dt);
		cstmt.setString(8, dm.use_usag);
		cstmt.setString(9, dm.buy_cnt);
		cstmt.setString(10, dm.draft_deptcd);
		cstmt.setString(11, dm.draft_kind);
		cstmt.setString(12, dm.draft_no);
		cstmt.setString(13, dm.nocompen_mant_frdt);
		cstmt.setString(14, dm.nocompen_mant_todt);
		cstmt.setString(15, dm.compen_mant_frdt);
		cstmt.setString(16, dm.compen_mant_todt);
		cstmt.setString(17, dm.compen_mant_cmpy);
		cstmt.setString(18, dm.incmg_pers_ipaddr);
		cstmt.setString(19, dm.incmg_pers);
		cstmt.setString(20, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcpc.ds.MT_ETCPC_1304_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("modl_mang_no = " + getModl_mang_no());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("seq = " + getSeq());
        System.out.println("buy_dt = " + getBuy_dt());
        System.out.println("use_usag = " + getUse_usag());
        System.out.println("buy_cnt = " + getBuy_cnt());
        System.out.println("draft_deptcd = " + getDraft_deptcd());
        System.out.println("draft_kind = " + getDraft_kind());
        System.out.println("draft_no = " + getDraft_no());
        System.out.println("nocompen_mant_frdt = " + getNocompen_mant_frdt());
        System.out.println("nocompen_mant_todt = " + getNocompen_mant_todt());
        System.out.println("compen_mant_frdt = " + getCompen_mant_frdt());
        System.out.println("compen_mant_todt = " + getCompen_mant_todt());
        System.out.println("compen_mant_cmpy = " + getCompen_mant_cmpy());
        System.out.println("incmg_pers_ipaddr = " + getIncmg_pers_ipaddr());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("gubun = " + getGubun());
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
String modl_mang_no = req.getParameter("modl_mang_no");
if( modl_mang_no == null){
	System.out.println(this.toString+" : modl_mang_no is null" );
}else{
	System.out.println(this.toString+" : modl_mang_no is "+modl_mang_no );
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
String buy_dt = req.getParameter("buy_dt");
if( buy_dt == null){
	System.out.println(this.toString+" : buy_dt is null" );
}else{
	System.out.println(this.toString+" : buy_dt is "+buy_dt );
}
String use_usag = req.getParameter("use_usag");
if( use_usag == null){
	System.out.println(this.toString+" : use_usag is null" );
}else{
	System.out.println(this.toString+" : use_usag is "+use_usag );
}
String buy_cnt = req.getParameter("buy_cnt");
if( buy_cnt == null){
	System.out.println(this.toString+" : buy_cnt is null" );
}else{
	System.out.println(this.toString+" : buy_cnt is "+buy_cnt );
}
String draft_deptcd = req.getParameter("draft_deptcd");
if( draft_deptcd == null){
	System.out.println(this.toString+" : draft_deptcd is null" );
}else{
	System.out.println(this.toString+" : draft_deptcd is "+draft_deptcd );
}
String draft_kind = req.getParameter("draft_kind");
if( draft_kind == null){
	System.out.println(this.toString+" : draft_kind is null" );
}else{
	System.out.println(this.toString+" : draft_kind is "+draft_kind );
}
String draft_no = req.getParameter("draft_no");
if( draft_no == null){
	System.out.println(this.toString+" : draft_no is null" );
}else{
	System.out.println(this.toString+" : draft_no is "+draft_no );
}
String nocompen_mant_frdt = req.getParameter("nocompen_mant_frdt");
if( nocompen_mant_frdt == null){
	System.out.println(this.toString+" : nocompen_mant_frdt is null" );
}else{
	System.out.println(this.toString+" : nocompen_mant_frdt is "+nocompen_mant_frdt );
}
String nocompen_mant_todt = req.getParameter("nocompen_mant_todt");
if( nocompen_mant_todt == null){
	System.out.println(this.toString+" : nocompen_mant_todt is null" );
}else{
	System.out.println(this.toString+" : nocompen_mant_todt is "+nocompen_mant_todt );
}
String compen_mant_frdt = req.getParameter("compen_mant_frdt");
if( compen_mant_frdt == null){
	System.out.println(this.toString+" : compen_mant_frdt is null" );
}else{
	System.out.println(this.toString+" : compen_mant_frdt is "+compen_mant_frdt );
}
String compen_mant_todt = req.getParameter("compen_mant_todt");
if( compen_mant_todt == null){
	System.out.println(this.toString+" : compen_mant_todt is null" );
}else{
	System.out.println(this.toString+" : compen_mant_todt is "+compen_mant_todt );
}
String compen_mant_cmpy = req.getParameter("compen_mant_cmpy");
if( compen_mant_cmpy == null){
	System.out.println(this.toString+" : compen_mant_cmpy is null" );
}else{
	System.out.println(this.toString+" : compen_mant_cmpy is "+compen_mant_cmpy );
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
String modl_mang_no = Util.checkString(req.getParameter("modl_mang_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String buy_dt = Util.checkString(req.getParameter("buy_dt"));
String use_usag = Util.checkString(req.getParameter("use_usag"));
String buy_cnt = Util.checkString(req.getParameter("buy_cnt"));
String draft_deptcd = Util.checkString(req.getParameter("draft_deptcd"));
String draft_kind = Util.checkString(req.getParameter("draft_kind"));
String draft_no = Util.checkString(req.getParameter("draft_no"));
String nocompen_mant_frdt = Util.checkString(req.getParameter("nocompen_mant_frdt"));
String nocompen_mant_todt = Util.checkString(req.getParameter("nocompen_mant_todt"));
String compen_mant_frdt = Util.checkString(req.getParameter("compen_mant_frdt"));
String compen_mant_todt = Util.checkString(req.getParameter("compen_mant_todt"));
String compen_mant_cmpy = Util.checkString(req.getParameter("compen_mant_cmpy"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String modl_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("modl_mang_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String buy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_dt")));
String use_usag = Util.Uni2Ksc(Util.checkString(req.getParameter("use_usag")));
String buy_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_cnt")));
String draft_deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_deptcd")));
String draft_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_kind")));
String draft_no = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_no")));
String nocompen_mant_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("nocompen_mant_frdt")));
String nocompen_mant_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("nocompen_mant_todt")));
String compen_mant_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("compen_mant_frdt")));
String compen_mant_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("compen_mant_todt")));
String compen_mant_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("compen_mant_cmpy")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setModl_mang_no(modl_mang_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setBuy_dt(buy_dt);
dm.setUse_usag(use_usag);
dm.setBuy_cnt(buy_cnt);
dm.setDraft_deptcd(draft_deptcd);
dm.setDraft_kind(draft_kind);
dm.setDraft_no(draft_no);
dm.setNocompen_mant_frdt(nocompen_mant_frdt);
dm.setNocompen_mant_todt(nocompen_mant_todt);
dm.setCompen_mant_frdt(compen_mant_frdt);
dm.setCompen_mant_todt(compen_mant_todt);
dm.setCompen_mant_cmpy(compen_mant_cmpy);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 19 14:19:24 KST 2009 */