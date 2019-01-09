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


package chosun.ciis.mt.outsdelmt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.outsdelmt.ds.*;
import chosun.ciis.mt.outsdelmt.rec.*;

/**
 * 
 */


public class MT_OUTSDELMT_3002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String occr_dt;
	public String seq;
	public String sub_seq;
	public String m_gubun;
	public String mode;
	public String cmpy_cd;
	public String outsd_elmt_clsf;
	public String outsd_elmt_cd;
	public String outsd_elmt_amt;
	public String cmps_cost;
	public String cmps_ratio;
	public String cmps_calc;
	public String chg_ratio_yn;
	public String chg_cost;
	public String chg_ratio;
	public String matr_cd;
	public String outsd_elmt_aply_clsf;
	public String aply_dt;
	public String aply_yymm;
	public String matr_uprc;
	public String ratio_yn;
	public String fix_item_cost;
	public String fix_item_ratio;
	public String marjn_cost;
	public String marjn_ratio;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public MT_OUTSDELMT_3002_ADM(){}
	public MT_OUTSDELMT_3002_ADM(String occr_dt, String seq, String sub_seq, String m_gubun, String mode, String cmpy_cd, String outsd_elmt_clsf, String outsd_elmt_cd, String outsd_elmt_amt, String cmps_cost, String cmps_ratio, String cmps_calc, String chg_ratio_yn, String chg_cost, String chg_ratio, String matr_cd, String outsd_elmt_aply_clsf, String aply_dt, String aply_yymm, String matr_uprc, String ratio_yn, String fix_item_cost, String fix_item_ratio, String marjn_cost, String marjn_ratio, String incmg_pers_ipaddr, String incmg_pers){
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.sub_seq = sub_seq;
		this.m_gubun = m_gubun;
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.outsd_elmt_clsf = outsd_elmt_clsf;
		this.outsd_elmt_cd = outsd_elmt_cd;
		this.outsd_elmt_amt = outsd_elmt_amt;
		this.cmps_cost = cmps_cost;
		this.cmps_ratio = cmps_ratio;
		this.cmps_calc = cmps_calc;
		this.chg_ratio_yn = chg_ratio_yn;
		this.chg_cost = chg_cost;
		this.chg_ratio = chg_ratio;
		this.matr_cd = matr_cd;
		this.outsd_elmt_aply_clsf = outsd_elmt_aply_clsf;
		this.aply_dt = aply_dt;
		this.aply_yymm = aply_yymm;
		this.matr_uprc = matr_uprc;
		this.ratio_yn = ratio_yn;
		this.fix_item_cost = fix_item_cost;
		this.fix_item_ratio = fix_item_ratio;
		this.marjn_cost = marjn_cost;
		this.marjn_ratio = marjn_ratio;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
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

	public void setM_gubun(String m_gubun){
		this.m_gubun = m_gubun;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOutsd_elmt_clsf(String outsd_elmt_clsf){
		this.outsd_elmt_clsf = outsd_elmt_clsf;
	}

	public void setOutsd_elmt_cd(String outsd_elmt_cd){
		this.outsd_elmt_cd = outsd_elmt_cd;
	}

	public void setOutsd_elmt_amt(String outsd_elmt_amt){
		this.outsd_elmt_amt = outsd_elmt_amt;
	}

	public void setCmps_cost(String cmps_cost){
		this.cmps_cost = cmps_cost;
	}

	public void setCmps_ratio(String cmps_ratio){
		this.cmps_ratio = cmps_ratio;
	}

	public void setCmps_calc(String cmps_calc){
		this.cmps_calc = cmps_calc;
	}

	public void setChg_ratio_yn(String chg_ratio_yn){
		this.chg_ratio_yn = chg_ratio_yn;
	}

	public void setChg_cost(String chg_cost){
		this.chg_cost = chg_cost;
	}

	public void setChg_ratio(String chg_ratio){
		this.chg_ratio = chg_ratio;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setOutsd_elmt_aply_clsf(String outsd_elmt_aply_clsf){
		this.outsd_elmt_aply_clsf = outsd_elmt_aply_clsf;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setAply_yymm(String aply_yymm){
		this.aply_yymm = aply_yymm;
	}

	public void setMatr_uprc(String matr_uprc){
		this.matr_uprc = matr_uprc;
	}

	public void setRatio_yn(String ratio_yn){
		this.ratio_yn = ratio_yn;
	}

	public void setFix_item_cost(String fix_item_cost){
		this.fix_item_cost = fix_item_cost;
	}

	public void setFix_item_ratio(String fix_item_ratio){
		this.fix_item_ratio = fix_item_ratio;
	}

	public void setMarjn_cost(String marjn_cost){
		this.marjn_cost = marjn_cost;
	}

	public void setMarjn_ratio(String marjn_ratio){
		this.marjn_ratio = marjn_ratio;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
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

	public String getM_gubun(){
		return this.m_gubun;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOutsd_elmt_clsf(){
		return this.outsd_elmt_clsf;
	}

	public String getOutsd_elmt_cd(){
		return this.outsd_elmt_cd;
	}

	public String getOutsd_elmt_amt(){
		return this.outsd_elmt_amt;
	}

	public String getCmps_cost(){
		return this.cmps_cost;
	}

	public String getCmps_ratio(){
		return this.cmps_ratio;
	}

	public String getCmps_calc(){
		return this.cmps_calc;
	}

	public String getChg_ratio_yn(){
		return this.chg_ratio_yn;
	}

	public String getChg_cost(){
		return this.chg_cost;
	}

	public String getChg_ratio(){
		return this.chg_ratio;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getOutsd_elmt_aply_clsf(){
		return this.outsd_elmt_aply_clsf;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getAply_yymm(){
		return this.aply_yymm;
	}

	public String getMatr_uprc(){
		return this.matr_uprc;
	}

	public String getRatio_yn(){
		return this.ratio_yn;
	}

	public String getFix_item_cost(){
		return this.fix_item_cost;
	}

	public String getFix_item_ratio(){
		return this.fix_item_ratio;
	}

	public String getMarjn_cost(){
		return this.marjn_cost;
	}

	public String getMarjn_ratio(){
		return this.marjn_ratio;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_MT_OUTSDELMT_3002_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_OUTSDELMT_3002_ADM dm = (MT_OUTSDELMT_3002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.occr_dt);
		cstmt.setString(4, dm.seq);
		cstmt.setString(5, dm.sub_seq);
		cstmt.setString(6, dm.m_gubun);
		cstmt.setString(7, dm.mode);
		cstmt.setString(8, dm.cmpy_cd);
		cstmt.setString(9, dm.outsd_elmt_clsf);
		cstmt.setString(10, dm.outsd_elmt_cd);
		cstmt.setString(11, dm.outsd_elmt_amt);
		cstmt.setString(12, dm.cmps_cost);
		cstmt.setString(13, dm.cmps_ratio);
		cstmt.setString(14, dm.cmps_calc);
		cstmt.setString(15, dm.chg_ratio_yn);
		cstmt.setString(16, dm.chg_cost);
		cstmt.setString(17, dm.chg_ratio);
		cstmt.setString(18, dm.matr_cd);
		cstmt.setString(19, dm.outsd_elmt_aply_clsf);
		cstmt.setString(20, dm.aply_dt);
		cstmt.setString(21, dm.aply_yymm);
		cstmt.setString(22, dm.matr_uprc);
		cstmt.setString(23, dm.ratio_yn);
		cstmt.setString(24, dm.fix_item_cost);
		cstmt.setString(25, dm.fix_item_ratio);
		cstmt.setString(26, dm.marjn_cost);
		cstmt.setString(27, dm.marjn_ratio);
		cstmt.setString(28, dm.incmg_pers_ipaddr);
		cstmt.setString(29, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.outsdelmt.ds.MT_OUTSDELMT_3002_ADataSet();
	}



    public void print(){
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("seq = " + getSeq());
        System.out.println("sub_seq = " + getSub_seq());
        System.out.println("m_gubun = " + getM_gubun());
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("outsd_elmt_clsf = " + getOutsd_elmt_clsf());
        System.out.println("outsd_elmt_cd = " + getOutsd_elmt_cd());
        System.out.println("outsd_elmt_amt = " + getOutsd_elmt_amt());
        System.out.println("cmps_cost = " + getCmps_cost());
        System.out.println("cmps_ratio = " + getCmps_ratio());
        System.out.println("cmps_calc = " + getCmps_calc());
        System.out.println("chg_ratio_yn = " + getChg_ratio_yn());
        System.out.println("chg_cost = " + getChg_cost());
        System.out.println("chg_ratio = " + getChg_ratio());
        System.out.println("matr_cd = " + getMatr_cd());
        System.out.println("outsd_elmt_aply_clsf = " + getOutsd_elmt_aply_clsf());
        System.out.println("aply_dt = " + getAply_dt());
        System.out.println("aply_yymm = " + getAply_yymm());
        System.out.println("matr_uprc = " + getMatr_uprc());
        System.out.println("ratio_yn = " + getRatio_yn());
        System.out.println("fix_item_cost = " + getFix_item_cost());
        System.out.println("fix_item_ratio = " + getFix_item_ratio());
        System.out.println("marjn_cost = " + getMarjn_cost());
        System.out.println("marjn_ratio = " + getMarjn_ratio());
        System.out.println("incmg_pers_ipaddr = " + getIncmg_pers_ipaddr());
        System.out.println("incmg_pers = " + getIncmg_pers());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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
String m_gubun = req.getParameter("m_gubun");
if( m_gubun == null){
	System.out.println(this.toString+" : m_gubun is null" );
}else{
	System.out.println(this.toString+" : m_gubun is "+m_gubun );
}
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
String outsd_elmt_clsf = req.getParameter("outsd_elmt_clsf");
if( outsd_elmt_clsf == null){
	System.out.println(this.toString+" : outsd_elmt_clsf is null" );
}else{
	System.out.println(this.toString+" : outsd_elmt_clsf is "+outsd_elmt_clsf );
}
String outsd_elmt_cd = req.getParameter("outsd_elmt_cd");
if( outsd_elmt_cd == null){
	System.out.println(this.toString+" : outsd_elmt_cd is null" );
}else{
	System.out.println(this.toString+" : outsd_elmt_cd is "+outsd_elmt_cd );
}
String outsd_elmt_amt = req.getParameter("outsd_elmt_amt");
if( outsd_elmt_amt == null){
	System.out.println(this.toString+" : outsd_elmt_amt is null" );
}else{
	System.out.println(this.toString+" : outsd_elmt_amt is "+outsd_elmt_amt );
}
String cmps_cost = req.getParameter("cmps_cost");
if( cmps_cost == null){
	System.out.println(this.toString+" : cmps_cost is null" );
}else{
	System.out.println(this.toString+" : cmps_cost is "+cmps_cost );
}
String cmps_ratio = req.getParameter("cmps_ratio");
if( cmps_ratio == null){
	System.out.println(this.toString+" : cmps_ratio is null" );
}else{
	System.out.println(this.toString+" : cmps_ratio is "+cmps_ratio );
}
String cmps_calc = req.getParameter("cmps_calc");
if( cmps_calc == null){
	System.out.println(this.toString+" : cmps_calc is null" );
}else{
	System.out.println(this.toString+" : cmps_calc is "+cmps_calc );
}
String chg_ratio_yn = req.getParameter("chg_ratio_yn");
if( chg_ratio_yn == null){
	System.out.println(this.toString+" : chg_ratio_yn is null" );
}else{
	System.out.println(this.toString+" : chg_ratio_yn is "+chg_ratio_yn );
}
String chg_cost = req.getParameter("chg_cost");
if( chg_cost == null){
	System.out.println(this.toString+" : chg_cost is null" );
}else{
	System.out.println(this.toString+" : chg_cost is "+chg_cost );
}
String chg_ratio = req.getParameter("chg_ratio");
if( chg_ratio == null){
	System.out.println(this.toString+" : chg_ratio is null" );
}else{
	System.out.println(this.toString+" : chg_ratio is "+chg_ratio );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String outsd_elmt_aply_clsf = req.getParameter("outsd_elmt_aply_clsf");
if( outsd_elmt_aply_clsf == null){
	System.out.println(this.toString+" : outsd_elmt_aply_clsf is null" );
}else{
	System.out.println(this.toString+" : outsd_elmt_aply_clsf is "+outsd_elmt_aply_clsf );
}
String aply_dt = req.getParameter("aply_dt");
if( aply_dt == null){
	System.out.println(this.toString+" : aply_dt is null" );
}else{
	System.out.println(this.toString+" : aply_dt is "+aply_dt );
}
String aply_yymm = req.getParameter("aply_yymm");
if( aply_yymm == null){
	System.out.println(this.toString+" : aply_yymm is null" );
}else{
	System.out.println(this.toString+" : aply_yymm is "+aply_yymm );
}
String matr_uprc = req.getParameter("matr_uprc");
if( matr_uprc == null){
	System.out.println(this.toString+" : matr_uprc is null" );
}else{
	System.out.println(this.toString+" : matr_uprc is "+matr_uprc );
}
String ratio_yn = req.getParameter("ratio_yn");
if( ratio_yn == null){
	System.out.println(this.toString+" : ratio_yn is null" );
}else{
	System.out.println(this.toString+" : ratio_yn is "+ratio_yn );
}
String fix_item_cost = req.getParameter("fix_item_cost");
if( fix_item_cost == null){
	System.out.println(this.toString+" : fix_item_cost is null" );
}else{
	System.out.println(this.toString+" : fix_item_cost is "+fix_item_cost );
}
String fix_item_ratio = req.getParameter("fix_item_ratio");
if( fix_item_ratio == null){
	System.out.println(this.toString+" : fix_item_ratio is null" );
}else{
	System.out.println(this.toString+" : fix_item_ratio is "+fix_item_ratio );
}
String marjn_cost = req.getParameter("marjn_cost");
if( marjn_cost == null){
	System.out.println(this.toString+" : marjn_cost is null" );
}else{
	System.out.println(this.toString+" : marjn_cost is "+marjn_cost );
}
String marjn_ratio = req.getParameter("marjn_ratio");
if( marjn_ratio == null){
	System.out.println(this.toString+" : marjn_ratio is null" );
}else{
	System.out.println(this.toString+" : marjn_ratio is "+marjn_ratio );
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

String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String m_gubun = Util.checkString(req.getParameter("m_gubun"));
String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String outsd_elmt_clsf = Util.checkString(req.getParameter("outsd_elmt_clsf"));
String outsd_elmt_cd = Util.checkString(req.getParameter("outsd_elmt_cd"));
String outsd_elmt_amt = Util.checkString(req.getParameter("outsd_elmt_amt"));
String cmps_cost = Util.checkString(req.getParameter("cmps_cost"));
String cmps_ratio = Util.checkString(req.getParameter("cmps_ratio"));
String cmps_calc = Util.checkString(req.getParameter("cmps_calc"));
String chg_ratio_yn = Util.checkString(req.getParameter("chg_ratio_yn"));
String chg_cost = Util.checkString(req.getParameter("chg_cost"));
String chg_ratio = Util.checkString(req.getParameter("chg_ratio"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String outsd_elmt_aply_clsf = Util.checkString(req.getParameter("outsd_elmt_aply_clsf"));
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
String aply_yymm = Util.checkString(req.getParameter("aply_yymm"));
String matr_uprc = Util.checkString(req.getParameter("matr_uprc"));
String ratio_yn = Util.checkString(req.getParameter("ratio_yn"));
String fix_item_cost = Util.checkString(req.getParameter("fix_item_cost"));
String fix_item_ratio = Util.checkString(req.getParameter("fix_item_ratio"));
String marjn_cost = Util.checkString(req.getParameter("marjn_cost"));
String marjn_ratio = Util.checkString(req.getParameter("marjn_ratio"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String m_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("m_gubun")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String outsd_elmt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("outsd_elmt_clsf")));
String outsd_elmt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("outsd_elmt_cd")));
String outsd_elmt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("outsd_elmt_amt")));
String cmps_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("cmps_cost")));
String cmps_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("cmps_ratio")));
String cmps_calc = Util.Uni2Ksc(Util.checkString(req.getParameter("cmps_calc")));
String chg_ratio_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_ratio_yn")));
String chg_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_cost")));
String chg_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_ratio")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String outsd_elmt_aply_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("outsd_elmt_aply_clsf")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
String aply_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yymm")));
String matr_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_uprc")));
String ratio_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("ratio_yn")));
String fix_item_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_item_cost")));
String fix_item_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_item_ratio")));
String marjn_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("marjn_cost")));
String marjn_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("marjn_ratio")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setSub_seq(sub_seq);
dm.setM_gubun(m_gubun);
dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setOutsd_elmt_clsf(outsd_elmt_clsf);
dm.setOutsd_elmt_cd(outsd_elmt_cd);
dm.setOutsd_elmt_amt(outsd_elmt_amt);
dm.setCmps_cost(cmps_cost);
dm.setCmps_ratio(cmps_ratio);
dm.setCmps_calc(cmps_calc);
dm.setChg_ratio_yn(chg_ratio_yn);
dm.setChg_cost(chg_cost);
dm.setChg_ratio(chg_ratio);
dm.setMatr_cd(matr_cd);
dm.setOutsd_elmt_aply_clsf(outsd_elmt_aply_clsf);
dm.setAply_dt(aply_dt);
dm.setAply_yymm(aply_yymm);
dm.setMatr_uprc(matr_uprc);
dm.setRatio_yn(ratio_yn);
dm.setFix_item_cost(fix_item_cost);
dm.setFix_item_ratio(fix_item_ratio);
dm.setMarjn_cost(marjn_cost);
dm.setMarjn_ratio(marjn_ratio);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 27 21:02:40 KST 2009 */