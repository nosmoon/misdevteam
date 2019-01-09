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


public class MT_PRNPAP_3401_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String issu_dt;
	public String prt_dt;
	public String fac_clsf;
	public String medi_cd;
	public String sect_cd;
	public String issu_pcnt;
	public String issu_qty;
	public String matr_cd;
	public String pj_qunt;
	public String cnsm_qunt;
	public String sub_seq;
	public String pj_kind;
	public String rem_qunt;
	public String cnt;
	public String wgt;
	public String sub_gubun;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String gubun;

	public MT_PRNPAP_3401_ADM(){}
	public MT_PRNPAP_3401_ADM(String cmpy_cd, String occr_dt, String seq, String issu_dt, String prt_dt, String fac_clsf, String medi_cd, String sect_cd, String issu_pcnt, String issu_qty, String matr_cd, String pj_qunt, String cnsm_qunt, String sub_seq, String pj_kind, String rem_qunt, String cnt, String wgt, String sub_gubun, String incmg_pers_ipaddr, String incmg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.issu_dt = issu_dt;
		this.prt_dt = prt_dt;
		this.fac_clsf = fac_clsf;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
		this.issu_pcnt = issu_pcnt;
		this.issu_qty = issu_qty;
		this.matr_cd = matr_cd;
		this.pj_qunt = pj_qunt;
		this.cnsm_qunt = cnsm_qunt;
		this.sub_seq = sub_seq;
		this.pj_kind = pj_kind;
		this.rem_qunt = rem_qunt;
		this.cnt = cnt;
		this.wgt = wgt;
		this.sub_gubun = sub_gubun;
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

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setIssu_qty(String issu_qty){
		this.issu_qty = issu_qty;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setPj_qunt(String pj_qunt){
		this.pj_qunt = pj_qunt;
	}

	public void setCnsm_qunt(String cnsm_qunt){
		this.cnsm_qunt = cnsm_qunt;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setPj_kind(String pj_kind){
		this.pj_kind = pj_kind;
	}

	public void setRem_qunt(String rem_qunt){
		this.rem_qunt = rem_qunt;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public void setSub_gubun(String sub_gubun){
		this.sub_gubun = sub_gubun;
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

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getIssu_qty(){
		return this.issu_qty;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getPj_qunt(){
		return this.pj_qunt;
	}

	public String getCnsm_qunt(){
		return this.cnsm_qunt;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getPj_kind(){
		return this.pj_kind;
	}

	public String getRem_qunt(){
		return this.rem_qunt;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getWgt(){
		return this.wgt;
	}

	public String getSub_gubun(){
		return this.sub_gubun;
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
		 return "{ call MISMAT.SP_MT_PRNPAP_3401_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PRNPAP_3401_ADM dm = (MT_PRNPAP_3401_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.issu_dt);
		cstmt.setString(7, dm.prt_dt);
		cstmt.setString(8, dm.fac_clsf);
		cstmt.setString(9, dm.medi_cd);
		cstmt.setString(10, dm.sect_cd);
		cstmt.setString(11, dm.issu_pcnt);
		cstmt.setString(12, dm.issu_qty);
		cstmt.setString(13, dm.matr_cd);
		cstmt.setString(14, dm.pj_qunt);
		cstmt.setString(15, dm.cnsm_qunt);
		cstmt.setString(16, dm.sub_seq);
		cstmt.setString(17, dm.pj_kind);
		cstmt.setString(18, dm.rem_qunt);
		cstmt.setString(19, dm.cnt);
		cstmt.setString(20, dm.wgt);
		cstmt.setString(21, dm.sub_gubun);
		cstmt.setString(22, dm.incmg_pers_ipaddr);
		cstmt.setString(23, dm.incmg_pers);
		cstmt.setString(24, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.prnpap.ds.MT_PRNPAP_3401_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("prt_dt = [" + getPrt_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("issu_pcnt = [" + getIssu_pcnt() + "]");
		System.out.println("issu_qty = [" + getIssu_qty() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("pj_qunt = [" + getPj_qunt() + "]");
		System.out.println("cnsm_qunt = [" + getCnsm_qunt() + "]");
		System.out.println("sub_seq = [" + getSub_seq() + "]");
		System.out.println("pj_kind = [" + getPj_kind() + "]");
		System.out.println("rem_qunt = [" + getRem_qunt() + "]");
		System.out.println("cnt = [" + getCnt() + "]");
		System.out.println("wgt = [" + getWgt() + "]");
		System.out.println("sub_gubun = [" + getSub_gubun() + "]");
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
String prt_dt = req.getParameter("prt_dt");
if( prt_dt == null){
	System.out.println(this.toString+" : prt_dt is null" );
}else{
	System.out.println(this.toString+" : prt_dt is "+prt_dt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String issu_pcnt = req.getParameter("issu_pcnt");
if( issu_pcnt == null){
	System.out.println(this.toString+" : issu_pcnt is null" );
}else{
	System.out.println(this.toString+" : issu_pcnt is "+issu_pcnt );
}
String issu_qty = req.getParameter("issu_qty");
if( issu_qty == null){
	System.out.println(this.toString+" : issu_qty is null" );
}else{
	System.out.println(this.toString+" : issu_qty is "+issu_qty );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String pj_qunt = req.getParameter("pj_qunt");
if( pj_qunt == null){
	System.out.println(this.toString+" : pj_qunt is null" );
}else{
	System.out.println(this.toString+" : pj_qunt is "+pj_qunt );
}
String cnsm_qunt = req.getParameter("cnsm_qunt");
if( cnsm_qunt == null){
	System.out.println(this.toString+" : cnsm_qunt is null" );
}else{
	System.out.println(this.toString+" : cnsm_qunt is "+cnsm_qunt );
}
String sub_seq = req.getParameter("sub_seq");
if( sub_seq == null){
	System.out.println(this.toString+" : sub_seq is null" );
}else{
	System.out.println(this.toString+" : sub_seq is "+sub_seq );
}
String pj_kind = req.getParameter("pj_kind");
if( pj_kind == null){
	System.out.println(this.toString+" : pj_kind is null" );
}else{
	System.out.println(this.toString+" : pj_kind is "+pj_kind );
}
String rem_qunt = req.getParameter("rem_qunt");
if( rem_qunt == null){
	System.out.println(this.toString+" : rem_qunt is null" );
}else{
	System.out.println(this.toString+" : rem_qunt is "+rem_qunt );
}
String cnt = req.getParameter("cnt");
if( cnt == null){
	System.out.println(this.toString+" : cnt is null" );
}else{
	System.out.println(this.toString+" : cnt is "+cnt );
}
String wgt = req.getParameter("wgt");
if( wgt == null){
	System.out.println(this.toString+" : wgt is null" );
}else{
	System.out.println(this.toString+" : wgt is "+wgt );
}
String sub_gubun = req.getParameter("sub_gubun");
if( sub_gubun == null){
	System.out.println(this.toString+" : sub_gubun is null" );
}else{
	System.out.println(this.toString+" : sub_gubun is "+sub_gubun );
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
String prt_dt = Util.checkString(req.getParameter("prt_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String issu_pcnt = Util.checkString(req.getParameter("issu_pcnt"));
String issu_qty = Util.checkString(req.getParameter("issu_qty"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String pj_qunt = Util.checkString(req.getParameter("pj_qunt"));
String cnsm_qunt = Util.checkString(req.getParameter("cnsm_qunt"));
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String pj_kind = Util.checkString(req.getParameter("pj_kind"));
String rem_qunt = Util.checkString(req.getParameter("rem_qunt"));
String cnt = Util.checkString(req.getParameter("cnt"));
String wgt = Util.checkString(req.getParameter("wgt"));
String sub_gubun = Util.checkString(req.getParameter("sub_gubun"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String prt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String issu_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pcnt")));
String issu_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_qty")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String pj_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("pj_qunt")));
String cnsm_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("cnsm_qunt")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String pj_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("pj_kind")));
String rem_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("rem_qunt")));
String cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("cnt")));
String wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("wgt")));
String sub_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_gubun")));
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
dm.setPrt_dt(prt_dt);
dm.setFac_clsf(fac_clsf);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
dm.setIssu_pcnt(issu_pcnt);
dm.setIssu_qty(issu_qty);
dm.setMatr_cd(matr_cd);
dm.setPj_qunt(pj_qunt);
dm.setCnsm_qunt(cnsm_qunt);
dm.setSub_seq(sub_seq);
dm.setPj_kind(pj_kind);
dm.setRem_qunt(rem_qunt);
dm.setCnt(cnt);
dm.setWgt(wgt);
dm.setSub_gubun(sub_gubun);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 24 11:54:07 KST 2009 */