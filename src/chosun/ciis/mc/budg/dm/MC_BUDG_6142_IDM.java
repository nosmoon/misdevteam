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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_6142_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String non_dduc_yn;
	public String area_clsf;
	public String paper_amt;
	public String submat_amt;
	public String prt_amt;
	public String non_dduc_paper_amt;
	public String non_dduc_submat_amt;
	public String non_dduc_prt_amt;
	public String paper_amt_cost;
	public String submat_amt_cost;
	public String prt_amt_cost;
	public String pcnt_cost;
	public String cho_issu_cnt;
	public String local_issu_cnt;
	public String avg_cnt;
	public String non_dduc_rate;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public MC_BUDG_6142_IDM(){}
	public MC_BUDG_6142_IDM(String cmpy_cd, String yymm, String non_dduc_yn, String area_clsf, String paper_amt, String submat_amt, String prt_amt, String non_dduc_paper_amt, String non_dduc_submat_amt, String non_dduc_prt_amt, String paper_amt_cost, String submat_amt_cost, String prt_amt_cost, String pcnt_cost, String cho_issu_cnt, String local_issu_cnt, String avg_cnt, String non_dduc_rate, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.non_dduc_yn = non_dduc_yn;
		this.area_clsf = area_clsf;
		this.paper_amt = paper_amt;
		this.submat_amt = submat_amt;
		this.prt_amt = prt_amt;
		this.non_dduc_paper_amt = non_dduc_paper_amt;
		this.non_dduc_submat_amt = non_dduc_submat_amt;
		this.non_dduc_prt_amt = non_dduc_prt_amt;
		this.paper_amt_cost = paper_amt_cost;
		this.submat_amt_cost = submat_amt_cost;
		this.prt_amt_cost = prt_amt_cost;
		this.pcnt_cost = pcnt_cost;
		this.cho_issu_cnt = cho_issu_cnt;
		this.local_issu_cnt = local_issu_cnt;
		this.avg_cnt = avg_cnt;
		this.non_dduc_rate = non_dduc_rate;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setNon_dduc_yn(String non_dduc_yn){
		this.non_dduc_yn = non_dduc_yn;
	}

	public void setArea_clsf(String area_clsf){
		this.area_clsf = area_clsf;
	}

	public void setPaper_amt(String paper_amt){
		this.paper_amt = paper_amt;
	}

	public void setSubmat_amt(String submat_amt){
		this.submat_amt = submat_amt;
	}

	public void setPrt_amt(String prt_amt){
		this.prt_amt = prt_amt;
	}

	public void setNon_dduc_paper_amt(String non_dduc_paper_amt){
		this.non_dduc_paper_amt = non_dduc_paper_amt;
	}

	public void setNon_dduc_submat_amt(String non_dduc_submat_amt){
		this.non_dduc_submat_amt = non_dduc_submat_amt;
	}

	public void setNon_dduc_prt_amt(String non_dduc_prt_amt){
		this.non_dduc_prt_amt = non_dduc_prt_amt;
	}

	public void setPaper_amt_cost(String paper_amt_cost){
		this.paper_amt_cost = paper_amt_cost;
	}

	public void setSubmat_amt_cost(String submat_amt_cost){
		this.submat_amt_cost = submat_amt_cost;
	}

	public void setPrt_amt_cost(String prt_amt_cost){
		this.prt_amt_cost = prt_amt_cost;
	}

	public void setPcnt_cost(String pcnt_cost){
		this.pcnt_cost = pcnt_cost;
	}

	public void setCho_issu_cnt(String cho_issu_cnt){
		this.cho_issu_cnt = cho_issu_cnt;
	}

	public void setLocal_issu_cnt(String local_issu_cnt){
		this.local_issu_cnt = local_issu_cnt;
	}

	public void setAvg_cnt(String avg_cnt){
		this.avg_cnt = avg_cnt;
	}

	public void setNon_dduc_rate(String non_dduc_rate){
		this.non_dduc_rate = non_dduc_rate;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getNon_dduc_yn(){
		return this.non_dduc_yn;
	}

	public String getArea_clsf(){
		return this.area_clsf;
	}

	public String getPaper_amt(){
		return this.paper_amt;
	}

	public String getSubmat_amt(){
		return this.submat_amt;
	}

	public String getPrt_amt(){
		return this.prt_amt;
	}

	public String getNon_dduc_paper_amt(){
		return this.non_dduc_paper_amt;
	}

	public String getNon_dduc_submat_amt(){
		return this.non_dduc_submat_amt;
	}

	public String getNon_dduc_prt_amt(){
		return this.non_dduc_prt_amt;
	}

	public String getPaper_amt_cost(){
		return this.paper_amt_cost;
	}

	public String getSubmat_amt_cost(){
		return this.submat_amt_cost;
	}

	public String getPrt_amt_cost(){
		return this.prt_amt_cost;
	}

	public String getPcnt_cost(){
		return this.pcnt_cost;
	}

	public String getCho_issu_cnt(){
		return this.cho_issu_cnt;
	}

	public String getLocal_issu_cnt(){
		return this.local_issu_cnt;
	}

	public String getAvg_cnt(){
		return this.avg_cnt;
	}

	public String getNon_dduc_rate(){
		return this.non_dduc_rate;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_6142_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_6142_IDM dm = (MC_BUDG_6142_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.non_dduc_yn);
		cstmt.setString(6, dm.area_clsf);
		cstmt.setString(7, dm.paper_amt);
		cstmt.setString(8, dm.submat_amt);
		cstmt.setString(9, dm.prt_amt);
		cstmt.setString(10, dm.non_dduc_paper_amt);
		cstmt.setString(11, dm.non_dduc_submat_amt);
		cstmt.setString(12, dm.non_dduc_prt_amt);
		cstmt.setString(13, dm.paper_amt_cost);
		cstmt.setString(14, dm.submat_amt_cost);
		cstmt.setString(15, dm.prt_amt_cost);
		cstmt.setString(16, dm.pcnt_cost);
		cstmt.setString(17, dm.cho_issu_cnt);
		cstmt.setString(18, dm.local_issu_cnt);
		cstmt.setString(19, dm.avg_cnt);
		cstmt.setString(20, dm.non_dduc_rate);
		cstmt.setString(21, dm.incmg_pers_ipadd);
		cstmt.setString(22, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_6142_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("non_dduc_yn = [" + getNon_dduc_yn() + "]");
		System.out.println("area_clsf = [" + getArea_clsf() + "]");
		System.out.println("paper_amt = [" + getPaper_amt() + "]");
		System.out.println("submat_amt = [" + getSubmat_amt() + "]");
		System.out.println("prt_amt = [" + getPrt_amt() + "]");
		System.out.println("non_dduc_paper_amt = [" + getNon_dduc_paper_amt() + "]");
		System.out.println("non_dduc_submat_amt = [" + getNon_dduc_submat_amt() + "]");
		System.out.println("non_dduc_prt_amt = [" + getNon_dduc_prt_amt() + "]");
		System.out.println("paper_amt_cost = [" + getPaper_amt_cost() + "]");
		System.out.println("submat_amt_cost = [" + getSubmat_amt_cost() + "]");
		System.out.println("prt_amt_cost = [" + getPrt_amt_cost() + "]");
		System.out.println("pcnt_cost = [" + getPcnt_cost() + "]");
		System.out.println("cho_issu_cnt = [" + getCho_issu_cnt() + "]");
		System.out.println("local_issu_cnt = [" + getLocal_issu_cnt() + "]");
		System.out.println("avg_cnt = [" + getAvg_cnt() + "]");
		System.out.println("non_dduc_rate = [" + getNon_dduc_rate() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String non_dduc_yn = req.getParameter("non_dduc_yn");
if( non_dduc_yn == null){
	System.out.println(this.toString+" : non_dduc_yn is null" );
}else{
	System.out.println(this.toString+" : non_dduc_yn is "+non_dduc_yn );
}
String area_clsf = req.getParameter("area_clsf");
if( area_clsf == null){
	System.out.println(this.toString+" : area_clsf is null" );
}else{
	System.out.println(this.toString+" : area_clsf is "+area_clsf );
}
String paper_amt = req.getParameter("paper_amt");
if( paper_amt == null){
	System.out.println(this.toString+" : paper_amt is null" );
}else{
	System.out.println(this.toString+" : paper_amt is "+paper_amt );
}
String submat_amt = req.getParameter("submat_amt");
if( submat_amt == null){
	System.out.println(this.toString+" : submat_amt is null" );
}else{
	System.out.println(this.toString+" : submat_amt is "+submat_amt );
}
String prt_amt = req.getParameter("prt_amt");
if( prt_amt == null){
	System.out.println(this.toString+" : prt_amt is null" );
}else{
	System.out.println(this.toString+" : prt_amt is "+prt_amt );
}
String non_dduc_paper_amt = req.getParameter("non_dduc_paper_amt");
if( non_dduc_paper_amt == null){
	System.out.println(this.toString+" : non_dduc_paper_amt is null" );
}else{
	System.out.println(this.toString+" : non_dduc_paper_amt is "+non_dduc_paper_amt );
}
String non_dduc_submat_amt = req.getParameter("non_dduc_submat_amt");
if( non_dduc_submat_amt == null){
	System.out.println(this.toString+" : non_dduc_submat_amt is null" );
}else{
	System.out.println(this.toString+" : non_dduc_submat_amt is "+non_dduc_submat_amt );
}
String non_dduc_prt_amt = req.getParameter("non_dduc_prt_amt");
if( non_dduc_prt_amt == null){
	System.out.println(this.toString+" : non_dduc_prt_amt is null" );
}else{
	System.out.println(this.toString+" : non_dduc_prt_amt is "+non_dduc_prt_amt );
}
String paper_amt_cost = req.getParameter("paper_amt_cost");
if( paper_amt_cost == null){
	System.out.println(this.toString+" : paper_amt_cost is null" );
}else{
	System.out.println(this.toString+" : paper_amt_cost is "+paper_amt_cost );
}
String submat_amt_cost = req.getParameter("submat_amt_cost");
if( submat_amt_cost == null){
	System.out.println(this.toString+" : submat_amt_cost is null" );
}else{
	System.out.println(this.toString+" : submat_amt_cost is "+submat_amt_cost );
}
String prt_amt_cost = req.getParameter("prt_amt_cost");
if( prt_amt_cost == null){
	System.out.println(this.toString+" : prt_amt_cost is null" );
}else{
	System.out.println(this.toString+" : prt_amt_cost is "+prt_amt_cost );
}
String pcnt_cost = req.getParameter("pcnt_cost");
if( pcnt_cost == null){
	System.out.println(this.toString+" : pcnt_cost is null" );
}else{
	System.out.println(this.toString+" : pcnt_cost is "+pcnt_cost );
}
String cho_issu_cnt = req.getParameter("cho_issu_cnt");
if( cho_issu_cnt == null){
	System.out.println(this.toString+" : cho_issu_cnt is null" );
}else{
	System.out.println(this.toString+" : cho_issu_cnt is "+cho_issu_cnt );
}
String local_issu_cnt = req.getParameter("local_issu_cnt");
if( local_issu_cnt == null){
	System.out.println(this.toString+" : local_issu_cnt is null" );
}else{
	System.out.println(this.toString+" : local_issu_cnt is "+local_issu_cnt );
}
String avg_cnt = req.getParameter("avg_cnt");
if( avg_cnt == null){
	System.out.println(this.toString+" : avg_cnt is null" );
}else{
	System.out.println(this.toString+" : avg_cnt is "+avg_cnt );
}
String non_dduc_rate = req.getParameter("non_dduc_rate");
if( non_dduc_rate == null){
	System.out.println(this.toString+" : non_dduc_rate is null" );
}else{
	System.out.println(this.toString+" : non_dduc_rate is "+non_dduc_rate );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String non_dduc_yn = Util.checkString(req.getParameter("non_dduc_yn"));
String area_clsf = Util.checkString(req.getParameter("area_clsf"));
String paper_amt = Util.checkString(req.getParameter("paper_amt"));
String submat_amt = Util.checkString(req.getParameter("submat_amt"));
String prt_amt = Util.checkString(req.getParameter("prt_amt"));
String non_dduc_paper_amt = Util.checkString(req.getParameter("non_dduc_paper_amt"));
String non_dduc_submat_amt = Util.checkString(req.getParameter("non_dduc_submat_amt"));
String non_dduc_prt_amt = Util.checkString(req.getParameter("non_dduc_prt_amt"));
String paper_amt_cost = Util.checkString(req.getParameter("paper_amt_cost"));
String submat_amt_cost = Util.checkString(req.getParameter("submat_amt_cost"));
String prt_amt_cost = Util.checkString(req.getParameter("prt_amt_cost"));
String pcnt_cost = Util.checkString(req.getParameter("pcnt_cost"));
String cho_issu_cnt = Util.checkString(req.getParameter("cho_issu_cnt"));
String local_issu_cnt = Util.checkString(req.getParameter("local_issu_cnt"));
String avg_cnt = Util.checkString(req.getParameter("avg_cnt"));
String non_dduc_rate = Util.checkString(req.getParameter("non_dduc_rate"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String non_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("non_dduc_yn")));
String area_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("area_clsf")));
String paper_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("paper_amt")));
String submat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("submat_amt")));
String prt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_amt")));
String non_dduc_paper_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("non_dduc_paper_amt")));
String non_dduc_submat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("non_dduc_submat_amt")));
String non_dduc_prt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("non_dduc_prt_amt")));
String paper_amt_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("paper_amt_cost")));
String submat_amt_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("submat_amt_cost")));
String prt_amt_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_amt_cost")));
String pcnt_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("pcnt_cost")));
String cho_issu_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("cho_issu_cnt")));
String local_issu_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("local_issu_cnt")));
String avg_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("avg_cnt")));
String non_dduc_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("non_dduc_rate")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setNon_dduc_yn(non_dduc_yn);
dm.setArea_clsf(area_clsf);
dm.setPaper_amt(paper_amt);
dm.setSubmat_amt(submat_amt);
dm.setPrt_amt(prt_amt);
dm.setNon_dduc_paper_amt(non_dduc_paper_amt);
dm.setNon_dduc_submat_amt(non_dduc_submat_amt);
dm.setNon_dduc_prt_amt(non_dduc_prt_amt);
dm.setPaper_amt_cost(paper_amt_cost);
dm.setSubmat_amt_cost(submat_amt_cost);
dm.setPrt_amt_cost(prt_amt_cost);
dm.setPcnt_cost(pcnt_cost);
dm.setCho_issu_cnt(cho_issu_cnt);
dm.setLocal_issu_cnt(local_issu_cnt);
dm.setAvg_cnt(avg_cnt);
dm.setNon_dduc_rate(non_dduc_rate);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 22 10:30:46 KST 2009 */