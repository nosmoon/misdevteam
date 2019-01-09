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


package chosun.ciis.pr.papmake.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.sendmg.ds.*;
import chosun.ciis.pr.sendmg.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_3010_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String occr_dt;
	public String cmpy_cd;
	public String seq;
	public String aply_dt;
	public String fac_clsf;
	public String basi_prt_qty;
	public String base_servcost;
	public String basi_excs_qty;
	public String basi_excs_servcost;
	public String basi_make_pcnt;
	public String base_make_servcost;
	public String basi_excs_pcnt;
	public String basi_excs_make_servcost;
	public String basi_ovt_prt_qty;
	public String basi_sep_prtn_servcost;
	public String crps_cost;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public PR_PAPMAKE_3010_ADM(){}
	public PR_PAPMAKE_3010_ADM(String gubun, String occr_dt, String cmpy_cd, String seq, String aply_dt, String fac_clsf, String basi_prt_qty, String base_servcost, String basi_excs_qty, String basi_excs_servcost, String basi_make_pcnt, String base_make_servcost, String basi_excs_pcnt, String basi_excs_make_servcost, String basi_ovt_prt_qty, String basi_sep_prtn_servcost, String crps_cost, String incmg_pers_ipaddr, String incmg_pers){
		this.gubun = gubun;
		this.occr_dt = occr_dt;
		this.cmpy_cd = cmpy_cd;
		this.seq = seq;
		this.aply_dt = aply_dt;
		this.fac_clsf = fac_clsf;
		this.basi_prt_qty = basi_prt_qty;
		this.base_servcost = base_servcost;
		this.basi_excs_qty = basi_excs_qty;
		this.basi_excs_servcost = basi_excs_servcost;
		this.basi_make_pcnt = basi_make_pcnt;
		this.base_make_servcost = base_make_servcost;
		this.basi_excs_pcnt = basi_excs_pcnt;
		this.basi_excs_make_servcost = basi_excs_make_servcost;
		this.basi_ovt_prt_qty = basi_ovt_prt_qty;
		this.basi_sep_prtn_servcost = basi_sep_prtn_servcost;
		this.crps_cost			= crps_cost;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setBasi_prt_qty(String basi_prt_qty){
		this.basi_prt_qty = basi_prt_qty;
	}

	public void setBase_servcost(String base_servcost){
		this.base_servcost = base_servcost;
	}

	public void setBasi_excs_qty(String basi_excs_qty){
		this.basi_excs_qty = basi_excs_qty;
	}

	public void setBasi_excs_servcost(String basi_excs_servcost){
		this.basi_excs_servcost = basi_excs_servcost;
	}

	public void setBasi_make_pcnt(String basi_make_pcnt){
		this.basi_make_pcnt = basi_make_pcnt;
	}

	public void setBase_make_servcost(String base_make_servcost){
		this.base_make_servcost = base_make_servcost;
	}

	public void setBasi_excs_pcnt(String basi_excs_pcnt){
		this.basi_excs_pcnt = basi_excs_pcnt;
	}

	public void setBasi_excs_make_servcost(String basi_excs_make_servcost){
		this.basi_excs_make_servcost = basi_excs_make_servcost;
	}

	public void setBasi_ovt_prt_qty(String basi_ovt_prt_qty){
		this.basi_ovt_prt_qty = basi_ovt_prt_qty;
	}

	public void setBasi_sep_prtn_servcost(String basi_sep_prtn_servcost){
		this.basi_sep_prtn_servcost = basi_sep_prtn_servcost;
	}
	
	public void setCrps_cost(String crps_cost){
		this.crps_cost = crps_cost;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getBasi_prt_qty(){
		return this.basi_prt_qty;
	}

	public String getBase_servcost(){
		return this.base_servcost;
	}

	public String getBasi_excs_qty(){
		return this.basi_excs_qty;
	}

	public String getBasi_excs_servcost(){
		return this.basi_excs_servcost;
	}

	public String getBasi_make_pcnt(){
		return this.basi_make_pcnt;
	}

	public String getBase_make_servcost(){
		return this.base_make_servcost;
	}

	public String getBasi_excs_pcnt(){
		return this.basi_excs_pcnt;
	}

	public String getBasi_excs_make_servcost(){
		return this.basi_excs_make_servcost;
	}

	public String getBasi_ovt_prt_qty(){
		return this.basi_ovt_prt_qty;
	}

	public String getBasi_sep_prtn_servcost(){
		return this.basi_sep_prtn_servcost;
	}
	
	public String getCrps_cost(){
		return this.crps_cost;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_PR_PAPMAKE_3010_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_3010_ADM dm = (PR_PAPMAKE_3010_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.aply_dt);
		cstmt.setString(8, dm.fac_clsf);
		cstmt.setString(9, dm.basi_prt_qty);
		cstmt.setString(10, dm.base_servcost);
		cstmt.setString(11, dm.basi_excs_qty);
		cstmt.setString(12, dm.basi_excs_servcost);
		cstmt.setString(13, dm.basi_make_pcnt);
		cstmt.setString(14, dm.base_make_servcost);
		cstmt.setString(15, dm.basi_excs_pcnt);
		cstmt.setString(16, dm.basi_excs_make_servcost);
		cstmt.setString(17, dm.basi_ovt_prt_qty);
		cstmt.setString(18, dm.basi_sep_prtn_servcost);
		cstmt.setString(19, dm.crps_cost);
		cstmt.setString(20, dm.incmg_pers_ipaddr);
		cstmt.setString(21, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_3010_ADataSet();
	}



    public void print(){
        System.out.println("gubun = " + getGubun());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("seq = " + getSeq());
        System.out.println("aply_dt = " + getAply_dt());
        System.out.println("fac_clsf = " + getFac_clsf());
        System.out.println("basi_prt_qty = " + getBasi_prt_qty());
        System.out.println("base_servcost = " + getBase_servcost());
        System.out.println("basi_excs_qty = " + getBasi_excs_qty());
        System.out.println("basi_excs_servcost = " + getBasi_excs_servcost());
        System.out.println("basi_make_pcnt = " + getBasi_make_pcnt());
        System.out.println("base_make_servcost = " + getBase_make_servcost());
        System.out.println("basi_excs_pcnt = " + getBasi_excs_pcnt());
        System.out.println("basi_excs_make_servcost = " + getBasi_excs_make_servcost());
        System.out.println("basi_ovt_prt_qty = " + getBasi_ovt_prt_qty());
        System.out.println("basi_sep_prtn_servcost = " + getBasi_sep_prtn_servcost());
        System.out.println("crps_cost = " + getCrps_cost());
        System.out.println("incmg_pers_ipaddr = " + getIncmg_pers_ipaddr());
        System.out.println("incmg_pers = " + getIncmg_pers());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String aply_dt = req.getParameter("aply_dt");
if( aply_dt == null){
	System.out.println(this.toString+" : aply_dt is null" );
}else{
	System.out.println(this.toString+" : aply_dt is "+aply_dt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String basi_prt_qty = req.getParameter("basi_prt_qty");
if( basi_prt_qty == null){
	System.out.println(this.toString+" : basi_prt_qty is null" );
}else{
	System.out.println(this.toString+" : basi_prt_qty is "+basi_prt_qty );
}
String base_servcost = req.getParameter("base_servcost");
if( base_servcost == null){
	System.out.println(this.toString+" : base_servcost is null" );
}else{
	System.out.println(this.toString+" : base_servcost is "+base_servcost );
}
String basi_excs_qty = req.getParameter("basi_excs_qty");
if( basi_excs_qty == null){
	System.out.println(this.toString+" : basi_excs_qty is null" );
}else{
	System.out.println(this.toString+" : basi_excs_qty is "+basi_excs_qty );
}
String basi_excs_servcost = req.getParameter("basi_excs_servcost");
if( basi_excs_servcost == null){
	System.out.println(this.toString+" : basi_excs_servcost is null" );
}else{
	System.out.println(this.toString+" : basi_excs_servcost is "+basi_excs_servcost );
}
String basi_make_pcnt = req.getParameter("basi_make_pcnt");
if( basi_make_pcnt == null){
	System.out.println(this.toString+" : basi_make_pcnt is null" );
}else{
	System.out.println(this.toString+" : basi_make_pcnt is "+basi_make_pcnt );
}
String base_make_servcost = req.getParameter("base_make_servcost");
if( base_make_servcost == null){
	System.out.println(this.toString+" : base_make_servcost is null" );
}else{
	System.out.println(this.toString+" : base_make_servcost is "+base_make_servcost );
}
String basi_excs_pcnt = req.getParameter("basi_excs_pcnt");
if( basi_excs_pcnt == null){
	System.out.println(this.toString+" : basi_excs_pcnt is null" );
}else{
	System.out.println(this.toString+" : basi_excs_pcnt is "+basi_excs_pcnt );
}
String basi_excs_make_servcost = req.getParameter("basi_excs_make_servcost");
if( basi_excs_make_servcost == null){
	System.out.println(this.toString+" : basi_excs_make_servcost is null" );
}else{
	System.out.println(this.toString+" : basi_excs_make_servcost is "+basi_excs_make_servcost );
}
String basi_ovt_prt_qty = req.getParameter("basi_ovt_prt_qty");
if( basi_ovt_prt_qty == null){
	System.out.println(this.toString+" : basi_ovt_prt_qty is null" );
}else{
	System.out.println(this.toString+" : basi_ovt_prt_qty is "+basi_ovt_prt_qty );
}
String basi_sep_prtn_servcost = req.getParameter("basi_sep_prtn_servcost");
if( basi_sep_prtn_servcost == null){
	System.out.println(this.toString+" : basi_sep_prtn_servcost is null" );
}else{
	System.out.println(this.toString+" : basi_sep_prtn_servcost is "+basi_sep_prtn_servcost );
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

String gubun = Util.checkString(req.getParameter("gubun"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String seq = Util.checkString(req.getParameter("seq"));
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String basi_prt_qty = Util.checkString(req.getParameter("basi_prt_qty"));
String base_servcost = Util.checkString(req.getParameter("base_servcost"));
String basi_excs_qty = Util.checkString(req.getParameter("basi_excs_qty"));
String basi_excs_servcost = Util.checkString(req.getParameter("basi_excs_servcost"));
String basi_make_pcnt = Util.checkString(req.getParameter("basi_make_pcnt"));
String base_make_servcost = Util.checkString(req.getParameter("base_make_servcost"));
String basi_excs_pcnt = Util.checkString(req.getParameter("basi_excs_pcnt"));
String basi_excs_make_servcost = Util.checkString(req.getParameter("basi_excs_make_servcost"));
String basi_ovt_prt_qty = Util.checkString(req.getParameter("basi_ovt_prt_qty"));
String basi_sep_prtn_servcost = Util.checkString(req.getParameter("basi_sep_prtn_servcost"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String basi_prt_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_prt_qty")));
String base_servcost = Util.Uni2Ksc(Util.checkString(req.getParameter("base_servcost")));
String basi_excs_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_excs_qty")));
String basi_excs_servcost = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_excs_servcost")));
String basi_make_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_make_pcnt")));
String base_make_servcost = Util.Uni2Ksc(Util.checkString(req.getParameter("base_make_servcost")));
String basi_excs_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_excs_pcnt")));
String basi_excs_make_servcost = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_excs_make_servcost")));
String basi_ovt_prt_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_ovt_prt_qty")));
String basi_sep_prtn_servcost = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_sep_prtn_servcost")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setGubun(gubun);
dm.setOccr_dt(occr_dt);
dm.setCmpy_cd(cmpy_cd);
dm.setSeq(seq);
dm.setAply_dt(aply_dt);
dm.setFac_clsf(fac_clsf);
dm.setBasi_prt_qty(basi_prt_qty);
dm.setBase_servcost(base_servcost);
dm.setBasi_excs_qty(basi_excs_qty);
dm.setBasi_excs_servcost(basi_excs_servcost);
dm.setBasi_make_pcnt(basi_make_pcnt);
dm.setBase_make_servcost(base_make_servcost);
dm.setBasi_excs_pcnt(basi_excs_pcnt);
dm.setBasi_excs_make_servcost(basi_excs_make_servcost);
dm.setBasi_ovt_prt_qty(basi_ovt_prt_qty);
dm.setBasi_sep_prtn_servcost(basi_sep_prtn_servcost);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 11 22:08:58 KST 2009 */