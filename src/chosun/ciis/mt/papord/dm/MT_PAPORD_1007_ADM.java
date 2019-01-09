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


package chosun.ciis.mt.papord.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.ds.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_1007_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String fac_clsf;
	public String aply_dt;
	public String oth_prts_ratio;
	public String max_ewh_wgt;
	public String seq;
	public String occr_dt;
	public String gubun;
	public String matr_cd;
	public String std_ewh_roll_cnt;
	public String std_ewh_wgt;
	public String seq2;
	public String occr_dt2;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public MT_PAPORD_1007_ADM(){}
	public MT_PAPORD_1007_ADM(String mode, String cmpy_cd, String fac_clsf, String aply_dt, String oth_prts_ratio, String max_ewh_wgt, String seq, String occr_dt, String gubun, String matr_cd, String std_ewh_roll_cnt, String std_ewh_wgt, String seq2, String occr_dt2, String incmg_pers_ipaddr, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.fac_clsf = fac_clsf;
		this.aply_dt = aply_dt;
		this.oth_prts_ratio = oth_prts_ratio;
		this.max_ewh_wgt = max_ewh_wgt;
		this.seq = seq;
		this.occr_dt = occr_dt;
		this.gubun = gubun;
		this.matr_cd = matr_cd;
		this.std_ewh_roll_cnt = std_ewh_roll_cnt;
		this.std_ewh_wgt = std_ewh_wgt;
		this.seq2 = seq2;
		this.occr_dt2 = occr_dt2;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setOth_prts_ratio(String oth_prts_ratio){
		this.oth_prts_ratio = oth_prts_ratio;
	}

	public void setMax_ewh_wgt(String max_ewh_wgt){
		this.max_ewh_wgt = max_ewh_wgt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setStd_ewh_roll_cnt(String std_ewh_roll_cnt){
		this.std_ewh_roll_cnt = std_ewh_roll_cnt;
	}

	public void setStd_ewh_wgt(String std_ewh_wgt){
		this.std_ewh_wgt = std_ewh_wgt;
	}

	public void setSeq2(String seq2){
		this.seq2 = seq2;
	}

	public void setOccr_dt2(String occr_dt2){
		this.occr_dt2 = occr_dt2;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getOth_prts_ratio(){
		return this.oth_prts_ratio;
	}

	public String getMax_ewh_wgt(){
		return this.max_ewh_wgt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getStd_ewh_roll_cnt(){
		return this.std_ewh_roll_cnt;
	}

	public String getStd_ewh_wgt(){
		return this.std_ewh_wgt;
	}

	public String getSeq2(){
		return this.seq2;
	}

	public String getOccr_dt2(){
		return this.occr_dt2;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPORD_1007_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPORD_1007_ADM dm = (MT_PAPORD_1007_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.fac_clsf);
		cstmt.setString(6, dm.aply_dt);
		cstmt.setString(7, dm.oth_prts_ratio);
		cstmt.setString(8, dm.max_ewh_wgt);
		cstmt.setString(9, dm.seq);
		cstmt.setString(10, dm.occr_dt);
		cstmt.setString(11, dm.gubun);
		cstmt.setString(12, dm.matr_cd);
		cstmt.setString(13, dm.std_ewh_roll_cnt);
		cstmt.setString(14, dm.std_ewh_wgt);
		cstmt.setString(15, dm.seq2);
		cstmt.setString(16, dm.occr_dt2);
		cstmt.setString(17, dm.incmg_pers_ipaddr);
		cstmt.setString(18, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papord.ds.MT_PAPORD_1007_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("aply_dt = [" + getAply_dt() + "]");
		System.out.println("oth_prts_ratio = [" + getOth_prts_ratio() + "]");
		System.out.println("max_ewh_wgt = [" + getMax_ewh_wgt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("std_ewh_roll_cnt = [" + getStd_ewh_roll_cnt() + "]");
		System.out.println("std_ewh_wgt = [" + getStd_ewh_wgt() + "]");
		System.out.println("seq2 = [" + getSeq2() + "]");
		System.out.println("occr_dt2 = [" + getOccr_dt2() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String aply_dt = req.getParameter("aply_dt");
if( aply_dt == null){
	System.out.println(this.toString+" : aply_dt is null" );
}else{
	System.out.println(this.toString+" : aply_dt is "+aply_dt );
}
String oth_prts_ratio = req.getParameter("oth_prts_ratio");
if( oth_prts_ratio == null){
	System.out.println(this.toString+" : oth_prts_ratio is null" );
}else{
	System.out.println(this.toString+" : oth_prts_ratio is "+oth_prts_ratio );
}
String max_ewh_wgt = req.getParameter("max_ewh_wgt");
if( max_ewh_wgt == null){
	System.out.println(this.toString+" : max_ewh_wgt is null" );
}else{
	System.out.println(this.toString+" : max_ewh_wgt is "+max_ewh_wgt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String std_ewh_roll_cnt = req.getParameter("std_ewh_roll_cnt");
if( std_ewh_roll_cnt == null){
	System.out.println(this.toString+" : std_ewh_roll_cnt is null" );
}else{
	System.out.println(this.toString+" : std_ewh_roll_cnt is "+std_ewh_roll_cnt );
}
String std_ewh_wgt = req.getParameter("std_ewh_wgt");
if( std_ewh_wgt == null){
	System.out.println(this.toString+" : std_ewh_wgt is null" );
}else{
	System.out.println(this.toString+" : std_ewh_wgt is "+std_ewh_wgt );
}
String seq2 = req.getParameter("seq2");
if( seq2 == null){
	System.out.println(this.toString+" : seq2 is null" );
}else{
	System.out.println(this.toString+" : seq2 is "+seq2 );
}
String occr_dt2 = req.getParameter("occr_dt2");
if( occr_dt2 == null){
	System.out.println(this.toString+" : occr_dt2 is null" );
}else{
	System.out.println(this.toString+" : occr_dt2 is "+occr_dt2 );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
String oth_prts_ratio = Util.checkString(req.getParameter("oth_prts_ratio"));
String max_ewh_wgt = Util.checkString(req.getParameter("max_ewh_wgt"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String gubun = Util.checkString(req.getParameter("gubun"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String std_ewh_roll_cnt = Util.checkString(req.getParameter("std_ewh_roll_cnt"));
String std_ewh_wgt = Util.checkString(req.getParameter("std_ewh_wgt"));
String seq2 = Util.checkString(req.getParameter("seq2"));
String occr_dt2 = Util.checkString(req.getParameter("occr_dt2"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
String oth_prts_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("oth_prts_ratio")));
String max_ewh_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("max_ewh_wgt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String std_ewh_roll_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("std_ewh_roll_cnt")));
String std_ewh_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("std_ewh_wgt")));
String seq2 = Util.Uni2Ksc(Util.checkString(req.getParameter("seq2")));
String occr_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt2")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setFac_clsf(fac_clsf);
dm.setAply_dt(aply_dt);
dm.setOth_prts_ratio(oth_prts_ratio);
dm.setMax_ewh_wgt(max_ewh_wgt);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
dm.setGubun(gubun);
dm.setMatr_cd(matr_cd);
dm.setStd_ewh_roll_cnt(std_ewh_roll_cnt);
dm.setStd_ewh_wgt(std_ewh_wgt);
dm.setSeq2(seq2);
dm.setOccr_dt2(occr_dt2);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 14 00:45:32 KST 2009 */