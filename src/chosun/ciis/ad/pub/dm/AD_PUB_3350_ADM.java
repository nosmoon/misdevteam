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


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3350_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String podr_ym;
	public String podr_clsf;
	public String spl_dlco;
	public String spl_dlco_nm;
	public String dlco_no;
	public String dlco_nm;
	public String item_nm;
	public String brnd_nm;
	public String podr_cnt;
	public String podr_uprc;
	public String podr_amt;
	public String exct_tot_cnt;
	public String exct_cnt2;
	public String exct_cnt1;
	public String exct_cnt;
	public String exct_uprc;
	public String exct_amt;
	public String ccon_fee;
	public String medi_fee;
	public String m_amt;
	public String easy_amt;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String mode;
	public String occr_dt;
	public String occr_seq;

	public AD_PUB_3350_ADM(){}
	public AD_PUB_3350_ADM(String cmpy_cd, String podr_ym, String podr_clsf, String spl_dlco, String spl_dlco_nm, String dlco_no, String dlco_nm, String item_nm, String brnd_nm, String podr_cnt, String podr_uprc, String podr_amt, String exct_tot_cnt, String exct_cnt2, String exct_cnt1, String exct_cnt, String exct_uprc, String exct_amt, String ccon_fee, String medi_fee, String m_amt, String easy_amt, String incmg_pers_ip, String incmg_pers, String mode, String occr_dt, String occr_seq){
		this.cmpy_cd = cmpy_cd;
		this.podr_ym = podr_ym;
		this.podr_clsf = podr_clsf;
		this.spl_dlco = spl_dlco;
		this.spl_dlco_nm = spl_dlco_nm;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.item_nm = item_nm;
		this.brnd_nm = brnd_nm;
		this.podr_cnt = podr_cnt;
		this.podr_uprc = podr_uprc;
		this.podr_amt = podr_amt;
		this.exct_tot_cnt = exct_tot_cnt;
		this.exct_cnt2 = exct_cnt2;
		this.exct_cnt1 = exct_cnt1;
		this.exct_cnt = exct_cnt;
		this.exct_uprc = exct_uprc;
		this.exct_amt = exct_amt;
		this.ccon_fee = ccon_fee;
		this.medi_fee = medi_fee;
		this.m_amt = m_amt;
		this.easy_amt = easy_amt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
		this.occr_dt = occr_dt;
		this.occr_seq = occr_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPodr_ym(String podr_ym){
		this.podr_ym = podr_ym;
	}

	public void setPodr_clsf(String podr_clsf){
		this.podr_clsf = podr_clsf;
	}

	public void setSpl_dlco(String spl_dlco){
		this.spl_dlco = spl_dlco;
	}

	public void setSpl_dlco_nm(String spl_dlco_nm){
		this.spl_dlco_nm = spl_dlco_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}

	public void setBrnd_nm(String brnd_nm){
		this.brnd_nm = brnd_nm;
	}

	public void setPodr_cnt(String podr_cnt){
		this.podr_cnt = podr_cnt;
	}

	public void setPodr_uprc(String podr_uprc){
		this.podr_uprc = podr_uprc;
	}

	public void setPodr_amt(String podr_amt){
		this.podr_amt = podr_amt;
	}

	public void setExct_tot_cnt(String exct_tot_cnt){
		this.exct_tot_cnt = exct_tot_cnt;
	}

	public void setExct_cnt2(String exct_cnt2){
		this.exct_cnt2 = exct_cnt2;
	}

	public void setExct_cnt1(String exct_cnt1){
		this.exct_cnt1 = exct_cnt1;
	}

	public void setExct_cnt(String exct_cnt){
		this.exct_cnt = exct_cnt;
	}

	public void setExct_uprc(String exct_uprc){
		this.exct_uprc = exct_uprc;
	}

	public void setExct_amt(String exct_amt){
		this.exct_amt = exct_amt;
	}

	public void setCcon_fee(String ccon_fee){
		this.ccon_fee = ccon_fee;
	}

	public void setMedi_fee(String medi_fee){
		this.medi_fee = medi_fee;
	}

	public void setM_amt(String m_amt){
		this.m_amt = m_amt;
	}

	public void setEasy_amt(String easy_amt){
		this.easy_amt = easy_amt;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPodr_ym(){
		return this.podr_ym;
	}

	public String getPodr_clsf(){
		return this.podr_clsf;
	}

	public String getSpl_dlco(){
		return this.spl_dlco;
	}

	public String getSpl_dlco_nm(){
		return this.spl_dlco_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getItem_nm(){
		return this.item_nm;
	}

	public String getBrnd_nm(){
		return this.brnd_nm;
	}

	public String getPodr_cnt(){
		return this.podr_cnt;
	}

	public String getPodr_uprc(){
		return this.podr_uprc;
	}

	public String getPodr_amt(){
		return this.podr_amt;
	}

	public String getExct_tot_cnt(){
		return this.exct_tot_cnt;
	}

	public String getExct_cnt2(){
		return this.exct_cnt2;
	}

	public String getExct_cnt1(){
		return this.exct_cnt1;
	}

	public String getExct_cnt(){
		return this.exct_cnt;
	}

	public String getExct_uprc(){
		return this.exct_uprc;
	}

	public String getExct_amt(){
		return this.exct_amt;
	}

	public String getCcon_fee(){
		return this.ccon_fee;
	}

	public String getMedi_fee(){
		return this.medi_fee;
	}

	public String getM_amt(){
		return this.m_amt;
	}

	public String getEasy_amt(){
		return this.easy_amt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_3350_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_3350_ADM dm = (AD_PUB_3350_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.podr_ym);
		cstmt.setString(5, dm.podr_clsf);
		cstmt.setString(6, dm.spl_dlco);
		cstmt.setString(7, dm.spl_dlco_nm);
		cstmt.setString(8, dm.dlco_no);
		cstmt.setString(9, dm.dlco_nm);
		cstmt.setString(10, dm.item_nm);
		cstmt.setString(11, dm.brnd_nm);
		cstmt.setString(12, dm.podr_cnt);
		cstmt.setString(13, dm.podr_uprc);
		cstmt.setString(14, dm.podr_amt);
		cstmt.setString(15, dm.exct_tot_cnt);
		cstmt.setString(16, dm.exct_cnt2);
		cstmt.setString(17, dm.exct_cnt1);
		cstmt.setString(18, dm.exct_cnt);
		cstmt.setString(19, dm.exct_uprc);
		cstmt.setString(20, dm.exct_amt);
		cstmt.setString(21, dm.ccon_fee);
		cstmt.setString(22, dm.medi_fee);
		cstmt.setString(23, dm.m_amt);
		cstmt.setString(24, dm.easy_amt);
		cstmt.setString(25, dm.incmg_pers_ip);
		cstmt.setString(26, dm.incmg_pers);
		cstmt.setString(27, dm.mode);
		cstmt.setString(28, dm.occr_dt);
		cstmt.setString(29, dm.occr_seq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_3350_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("podr_ym = [" + getPodr_ym() + "]");
		System.out.println("podr_clsf = [" + getPodr_clsf() + "]");
		System.out.println("spl_dlco = [" + getSpl_dlco() + "]");
		System.out.println("spl_dlco_nm = [" + getSpl_dlco_nm() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("item_nm = [" + getItem_nm() + "]");
		System.out.println("brnd_nm = [" + getBrnd_nm() + "]");
		System.out.println("podr_cnt = [" + getPodr_cnt() + "]");
		System.out.println("podr_uprc = [" + getPodr_uprc() + "]");
		System.out.println("podr_amt = [" + getPodr_amt() + "]");
		System.out.println("exct_tot_cnt = [" + getExct_tot_cnt() + "]");
		System.out.println("exct_cnt2 = [" + getExct_cnt2() + "]");
		System.out.println("exct_cnt1 = [" + getExct_cnt1() + "]");
		System.out.println("exct_cnt = [" + getExct_cnt() + "]");
		System.out.println("exct_uprc = [" + getExct_uprc() + "]");
		System.out.println("exct_amt = [" + getExct_amt() + "]");
		System.out.println("ccon_fee = [" + getCcon_fee() + "]");
		System.out.println("medi_fee = [" + getMedi_fee() + "]");
		System.out.println("m_amt = [" + getM_amt() + "]");
		System.out.println("easy_amt = [" + getEasy_amt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("occr_seq = [" + getOccr_seq() + "]");
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
String podr_ym = req.getParameter("podr_ym");
if( podr_ym == null){
	System.out.println(this.toString+" : podr_ym is null" );
}else{
	System.out.println(this.toString+" : podr_ym is "+podr_ym );
}
String podr_clsf = req.getParameter("podr_clsf");
if( podr_clsf == null){
	System.out.println(this.toString+" : podr_clsf is null" );
}else{
	System.out.println(this.toString+" : podr_clsf is "+podr_clsf );
}
String spl_dlco = req.getParameter("spl_dlco");
if( spl_dlco == null){
	System.out.println(this.toString+" : spl_dlco is null" );
}else{
	System.out.println(this.toString+" : spl_dlco is "+spl_dlco );
}
String spl_dlco_nm = req.getParameter("spl_dlco_nm");
if( spl_dlco_nm == null){
	System.out.println(this.toString+" : spl_dlco_nm is null" );
}else{
	System.out.println(this.toString+" : spl_dlco_nm is "+spl_dlco_nm );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String item_nm = req.getParameter("item_nm");
if( item_nm == null){
	System.out.println(this.toString+" : item_nm is null" );
}else{
	System.out.println(this.toString+" : item_nm is "+item_nm );
}
String brnd_nm = req.getParameter("brnd_nm");
if( brnd_nm == null){
	System.out.println(this.toString+" : brnd_nm is null" );
}else{
	System.out.println(this.toString+" : brnd_nm is "+brnd_nm );
}
String podr_cnt = req.getParameter("podr_cnt");
if( podr_cnt == null){
	System.out.println(this.toString+" : podr_cnt is null" );
}else{
	System.out.println(this.toString+" : podr_cnt is "+podr_cnt );
}
String podr_uprc = req.getParameter("podr_uprc");
if( podr_uprc == null){
	System.out.println(this.toString+" : podr_uprc is null" );
}else{
	System.out.println(this.toString+" : podr_uprc is "+podr_uprc );
}
String podr_amt = req.getParameter("podr_amt");
if( podr_amt == null){
	System.out.println(this.toString+" : podr_amt is null" );
}else{
	System.out.println(this.toString+" : podr_amt is "+podr_amt );
}
String exct_tot_cnt = req.getParameter("exct_tot_cnt");
if( exct_tot_cnt == null){
	System.out.println(this.toString+" : exct_tot_cnt is null" );
}else{
	System.out.println(this.toString+" : exct_tot_cnt is "+exct_tot_cnt );
}
String exct_cnt2 = req.getParameter("exct_cnt2");
if( exct_cnt2 == null){
	System.out.println(this.toString+" : exct_cnt2 is null" );
}else{
	System.out.println(this.toString+" : exct_cnt2 is "+exct_cnt2 );
}
String exct_cnt1 = req.getParameter("exct_cnt1");
if( exct_cnt1 == null){
	System.out.println(this.toString+" : exct_cnt1 is null" );
}else{
	System.out.println(this.toString+" : exct_cnt1 is "+exct_cnt1 );
}
String exct_cnt = req.getParameter("exct_cnt");
if( exct_cnt == null){
	System.out.println(this.toString+" : exct_cnt is null" );
}else{
	System.out.println(this.toString+" : exct_cnt is "+exct_cnt );
}
String exct_uprc = req.getParameter("exct_uprc");
if( exct_uprc == null){
	System.out.println(this.toString+" : exct_uprc is null" );
}else{
	System.out.println(this.toString+" : exct_uprc is "+exct_uprc );
}
String exct_amt = req.getParameter("exct_amt");
if( exct_amt == null){
	System.out.println(this.toString+" : exct_amt is null" );
}else{
	System.out.println(this.toString+" : exct_amt is "+exct_amt );
}
String ccon_fee = req.getParameter("ccon_fee");
if( ccon_fee == null){
	System.out.println(this.toString+" : ccon_fee is null" );
}else{
	System.out.println(this.toString+" : ccon_fee is "+ccon_fee );
}
String medi_fee = req.getParameter("medi_fee");
if( medi_fee == null){
	System.out.println(this.toString+" : medi_fee is null" );
}else{
	System.out.println(this.toString+" : medi_fee is "+medi_fee );
}
String m_amt = req.getParameter("m_amt");
if( m_amt == null){
	System.out.println(this.toString+" : m_amt is null" );
}else{
	System.out.println(this.toString+" : m_amt is "+m_amt );
}
String easy_amt = req.getParameter("easy_amt");
if( easy_amt == null){
	System.out.println(this.toString+" : easy_amt is null" );
}else{
	System.out.println(this.toString+" : easy_amt is "+easy_amt );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String occr_seq = req.getParameter("occr_seq");
if( occr_seq == null){
	System.out.println(this.toString+" : occr_seq is null" );
}else{
	System.out.println(this.toString+" : occr_seq is "+occr_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String podr_ym = Util.checkString(req.getParameter("podr_ym"));
String podr_clsf = Util.checkString(req.getParameter("podr_clsf"));
String spl_dlco = Util.checkString(req.getParameter("spl_dlco"));
String spl_dlco_nm = Util.checkString(req.getParameter("spl_dlco_nm"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String item_nm = Util.checkString(req.getParameter("item_nm"));
String brnd_nm = Util.checkString(req.getParameter("brnd_nm"));
String podr_cnt = Util.checkString(req.getParameter("podr_cnt"));
String podr_uprc = Util.checkString(req.getParameter("podr_uprc"));
String podr_amt = Util.checkString(req.getParameter("podr_amt"));
String exct_tot_cnt = Util.checkString(req.getParameter("exct_tot_cnt"));
String exct_cnt2 = Util.checkString(req.getParameter("exct_cnt2"));
String exct_cnt1 = Util.checkString(req.getParameter("exct_cnt1"));
String exct_cnt = Util.checkString(req.getParameter("exct_cnt"));
String exct_uprc = Util.checkString(req.getParameter("exct_uprc"));
String exct_amt = Util.checkString(req.getParameter("exct_amt"));
String ccon_fee = Util.checkString(req.getParameter("ccon_fee"));
String medi_fee = Util.checkString(req.getParameter("medi_fee"));
String m_amt = Util.checkString(req.getParameter("m_amt"));
String easy_amt = Util.checkString(req.getParameter("easy_amt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String occr_seq = Util.checkString(req.getParameter("occr_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String podr_ym = Util.Uni2Ksc(Util.checkString(req.getParameter("podr_ym")));
String podr_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("podr_clsf")));
String spl_dlco = Util.Uni2Ksc(Util.checkString(req.getParameter("spl_dlco")));
String spl_dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("spl_dlco_nm")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String item_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("item_nm")));
String brnd_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("brnd_nm")));
String podr_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("podr_cnt")));
String podr_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("podr_uprc")));
String podr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("podr_amt")));
String exct_tot_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("exct_tot_cnt")));
String exct_cnt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("exct_cnt2")));
String exct_cnt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("exct_cnt1")));
String exct_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("exct_cnt")));
String exct_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("exct_uprc")));
String exct_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("exct_amt")));
String ccon_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("ccon_fee")));
String medi_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_fee")));
String m_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("m_amt")));
String easy_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("easy_amt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPodr_ym(podr_ym);
dm.setPodr_clsf(podr_clsf);
dm.setSpl_dlco(spl_dlco);
dm.setSpl_dlco_nm(spl_dlco_nm);
dm.setDlco_no(dlco_no);
dm.setDlco_nm(dlco_nm);
dm.setItem_nm(item_nm);
dm.setBrnd_nm(brnd_nm);
dm.setPodr_cnt(podr_cnt);
dm.setPodr_uprc(podr_uprc);
dm.setPodr_amt(podr_amt);
dm.setExct_tot_cnt(exct_tot_cnt);
dm.setExct_cnt2(exct_cnt2);
dm.setExct_cnt1(exct_cnt1);
dm.setExct_cnt(exct_cnt);
dm.setExct_uprc(exct_uprc);
dm.setExct_amt(exct_amt);
dm.setCcon_fee(ccon_fee);
dm.setMedi_fee(medi_fee);
dm.setM_amt(m_amt);
dm.setEasy_amt(easy_amt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setMode(mode);
dm.setOccr_dt(occr_dt);
dm.setOccr_seq(occr_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 12 15:03:33 KST 2016 */