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


public class AD_PUB_3420_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String medi_cd;
	public String proc_dt;
	public String podr_occr_seq;
	public String podr_occr_dt;
	public String dlco_no;
	public String expct_amt;
	public String slcrg_pers;
	public String dept_cd;
	public String mchrg_pers;
	public String podr_dt;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String occr_arow;
	public String spl_dlco;
	public String brnd_cd;
	public String item_nm;
	public String podr_cnt;
	public String podr_uprc;
	public String podr_amt;
	public String uprc_fee;
	public String mms_uprc;
	public String mms_cnt;
	public String mms_fee;
	public String mms_vat;
	public String div_expct_amt;

	public AD_PUB_3420_ADM(){}
	public AD_PUB_3420_ADM(String flag, String cmpy_cd, String medi_cd, String proc_dt, String podr_occr_seq, String podr_occr_dt, String dlco_no, String expct_amt, String slcrg_pers, String dept_cd, String mchrg_pers, String podr_dt, String incmg_pers_ip, String incmg_pers, String occr_arow, String spl_dlco, String brnd_cd, String item_nm, String podr_cnt, String podr_uprc, String podr_amt, String uprc_fee, String mms_uprc, String mms_cnt, String mms_fee, String mms_vat, String div_expct_amt){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.proc_dt = proc_dt;
		this.podr_occr_seq = podr_occr_seq;
		this.podr_occr_dt = podr_occr_dt;
		this.dlco_no = dlco_no;
		this.expct_amt = expct_amt;
		this.slcrg_pers = slcrg_pers;
		this.dept_cd = dept_cd;
		this.mchrg_pers = mchrg_pers;
		this.podr_dt = podr_dt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.occr_arow = occr_arow;
		this.spl_dlco = spl_dlco;
		this.brnd_cd = brnd_cd;
		this.item_nm = item_nm;
		this.podr_cnt = podr_cnt;
		this.podr_uprc = podr_uprc;
		this.podr_amt = podr_amt;
		this.uprc_fee = uprc_fee;
		this.mms_uprc = mms_uprc;
		this.mms_cnt = mms_cnt;
		this.mms_fee = mms_fee;
		this.mms_vat = mms_vat;
		this.div_expct_amt = div_expct_amt;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setProc_dt(String proc_dt){
		this.proc_dt = proc_dt;
	}

	public void setPodr_occr_seq(String podr_occr_seq){
		this.podr_occr_seq = podr_occr_seq;
	}

	public void setPodr_occr_dt(String podr_occr_dt){
		this.podr_occr_dt = podr_occr_dt;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setExpct_amt(String expct_amt){
		this.expct_amt = expct_amt;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setPodr_dt(String podr_dt){
		this.podr_dt = podr_dt;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setOccr_arow(String occr_arow){
		this.occr_arow = occr_arow;
	}

	public void setSpl_dlco(String spl_dlco){
		this.spl_dlco = spl_dlco;
	}

	public void setBrnd_cd(String brnd_cd){
		this.brnd_cd = brnd_cd;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
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

	public void setUprc_fee(String uprc_fee){
		this.uprc_fee = uprc_fee;
	}

	public void setMms_uprc(String mms_uprc){
		this.mms_uprc = mms_uprc;
	}

	public void setMms_cnt(String mms_cnt){
		this.mms_cnt = mms_cnt;
	}

	public void setMms_fee(String mms_fee){
		this.mms_fee = mms_fee;
	}

	public void setMms_vat(String mms_vat){
		this.mms_vat = mms_vat;
	}

	public void setDiv_expct_amt(String div_expct_amt){
		this.div_expct_amt = div_expct_amt;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getProc_dt(){
		return this.proc_dt;
	}

	public String getPodr_occr_seq(){
		return this.podr_occr_seq;
	}

	public String getPodr_occr_dt(){
		return this.podr_occr_dt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getExpct_amt(){
		return this.expct_amt;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getPodr_dt(){
		return this.podr_dt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getOccr_arow(){
		return this.occr_arow;
	}

	public String getSpl_dlco(){
		return this.spl_dlco;
	}

	public String getBrnd_cd(){
		return this.brnd_cd;
	}

	public String getItem_nm(){
		return this.item_nm;
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

	public String getUprc_fee(){
		return this.uprc_fee;
	}

	public String getMms_uprc(){
		return this.mms_uprc;
	}

	public String getMms_cnt(){
		return this.mms_cnt;
	}

	public String getMms_fee(){
		return this.mms_fee;
	}

	public String getMms_vat(){
		return this.mms_vat;
	}

	public String getDiv_expct_amt(){
		return this.div_expct_amt;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_3420_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_3420_ADM dm = (AD_PUB_3420_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.proc_dt);
		cstmt.setString(7, dm.podr_occr_seq);
		cstmt.setString(8, dm.podr_occr_dt);
		cstmt.setString(9, dm.dlco_no);
		cstmt.setString(10, dm.expct_amt);
		cstmt.setString(11, dm.slcrg_pers);
		cstmt.setString(12, dm.dept_cd);
		cstmt.setString(13, dm.mchrg_pers);
		cstmt.setString(14, dm.podr_dt);
		cstmt.setString(15, dm.incmg_pers_ip);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.occr_arow);
		cstmt.setString(18, dm.spl_dlco);
		cstmt.setString(19, dm.brnd_cd);
		cstmt.setString(20, dm.item_nm);
		cstmt.setString(21, dm.podr_cnt);
		cstmt.setString(22, dm.podr_uprc);
		cstmt.setString(23, dm.podr_amt);
		cstmt.setString(24, dm.uprc_fee);
		cstmt.setString(25, dm.mms_uprc);
		cstmt.setString(26, dm.mms_cnt);
		cstmt.setString(27, dm.mms_fee);
		cstmt.setString(28, dm.mms_vat);
		cstmt.setString(29, dm.div_expct_amt);
		cstmt.registerOutParameter(30, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_3420_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("proc_dt = [" + getProc_dt() + "]");
		System.out.println("podr_occr_seq = [" + getPodr_occr_seq() + "]");
		System.out.println("podr_occr_dt = [" + getPodr_occr_dt() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("expct_amt = [" + getExpct_amt() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("mchrg_pers = [" + getMchrg_pers() + "]");
		System.out.println("podr_dt = [" + getPodr_dt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("occr_arow = [" + getOccr_arow() + "]");
		System.out.println("spl_dlco = [" + getSpl_dlco() + "]");
		System.out.println("brnd_cd = [" + getBrnd_cd() + "]");
		System.out.println("item_nm = [" + getItem_nm() + "]");
		System.out.println("podr_cnt = [" + getPodr_cnt() + "]");
		System.out.println("podr_uprc = [" + getPodr_uprc() + "]");
		System.out.println("podr_amt = [" + getPodr_amt() + "]");
		System.out.println("uprc_fee = [" + getUprc_fee() + "]");
		System.out.println("mms_uprc = [" + getMms_uprc() + "]");
		System.out.println("mms_cnt = [" + getMms_cnt() + "]");
		System.out.println("mms_fee = [" + getMms_fee() + "]");
		System.out.println("mms_vat = [" + getMms_vat() + "]");
		System.out.println("div_expct_amt = [" + getDiv_expct_amt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String proc_dt = req.getParameter("proc_dt");
if( proc_dt == null){
	System.out.println(this.toString+" : proc_dt is null" );
}else{
	System.out.println(this.toString+" : proc_dt is "+proc_dt );
}
String podr_occr_seq = req.getParameter("podr_occr_seq");
if( podr_occr_seq == null){
	System.out.println(this.toString+" : podr_occr_seq is null" );
}else{
	System.out.println(this.toString+" : podr_occr_seq is "+podr_occr_seq );
}
String podr_occr_dt = req.getParameter("podr_occr_dt");
if( podr_occr_dt == null){
	System.out.println(this.toString+" : podr_occr_dt is null" );
}else{
	System.out.println(this.toString+" : podr_occr_dt is "+podr_occr_dt );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String expct_amt = req.getParameter("expct_amt");
if( expct_amt == null){
	System.out.println(this.toString+" : expct_amt is null" );
}else{
	System.out.println(this.toString+" : expct_amt is "+expct_amt );
}
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String mchrg_pers = req.getParameter("mchrg_pers");
if( mchrg_pers == null){
	System.out.println(this.toString+" : mchrg_pers is null" );
}else{
	System.out.println(this.toString+" : mchrg_pers is "+mchrg_pers );
}
String podr_dt = req.getParameter("podr_dt");
if( podr_dt == null){
	System.out.println(this.toString+" : podr_dt is null" );
}else{
	System.out.println(this.toString+" : podr_dt is "+podr_dt );
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
String occr_arow = req.getParameter("occr_arow");
if( occr_arow == null){
	System.out.println(this.toString+" : occr_arow is null" );
}else{
	System.out.println(this.toString+" : occr_arow is "+occr_arow );
}
String spl_dlco = req.getParameter("spl_dlco");
if( spl_dlco == null){
	System.out.println(this.toString+" : spl_dlco is null" );
}else{
	System.out.println(this.toString+" : spl_dlco is "+spl_dlco );
}
String brnd_cd = req.getParameter("brnd_cd");
if( brnd_cd == null){
	System.out.println(this.toString+" : brnd_cd is null" );
}else{
	System.out.println(this.toString+" : brnd_cd is "+brnd_cd );
}
String item_nm = req.getParameter("item_nm");
if( item_nm == null){
	System.out.println(this.toString+" : item_nm is null" );
}else{
	System.out.println(this.toString+" : item_nm is "+item_nm );
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
String uprc_fee = req.getParameter("uprc_fee");
if( uprc_fee == null){
	System.out.println(this.toString+" : uprc_fee is null" );
}else{
	System.out.println(this.toString+" : uprc_fee is "+uprc_fee );
}
String mms_uprc = req.getParameter("mms_uprc");
if( mms_uprc == null){
	System.out.println(this.toString+" : mms_uprc is null" );
}else{
	System.out.println(this.toString+" : mms_uprc is "+mms_uprc );
}
String mms_cnt = req.getParameter("mms_cnt");
if( mms_cnt == null){
	System.out.println(this.toString+" : mms_cnt is null" );
}else{
	System.out.println(this.toString+" : mms_cnt is "+mms_cnt );
}
String mms_fee = req.getParameter("mms_fee");
if( mms_fee == null){
	System.out.println(this.toString+" : mms_fee is null" );
}else{
	System.out.println(this.toString+" : mms_fee is "+mms_fee );
}
String mms_vat = req.getParameter("mms_vat");
if( mms_vat == null){
	System.out.println(this.toString+" : mms_vat is null" );
}else{
	System.out.println(this.toString+" : mms_vat is "+mms_vat );
}
String div_expct_amt = req.getParameter("div_expct_amt");
if( div_expct_amt == null){
	System.out.println(this.toString+" : div_expct_amt is null" );
}else{
	System.out.println(this.toString+" : div_expct_amt is "+div_expct_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String proc_dt = Util.checkString(req.getParameter("proc_dt"));
String podr_occr_seq = Util.checkString(req.getParameter("podr_occr_seq"));
String podr_occr_dt = Util.checkString(req.getParameter("podr_occr_dt"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String expct_amt = Util.checkString(req.getParameter("expct_amt"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
String podr_dt = Util.checkString(req.getParameter("podr_dt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String occr_arow = Util.checkString(req.getParameter("occr_arow"));
String spl_dlco = Util.checkString(req.getParameter("spl_dlco"));
String brnd_cd = Util.checkString(req.getParameter("brnd_cd"));
String item_nm = Util.checkString(req.getParameter("item_nm"));
String podr_cnt = Util.checkString(req.getParameter("podr_cnt"));
String podr_uprc = Util.checkString(req.getParameter("podr_uprc"));
String podr_amt = Util.checkString(req.getParameter("podr_amt"));
String uprc_fee = Util.checkString(req.getParameter("uprc_fee"));
String mms_uprc = Util.checkString(req.getParameter("mms_uprc"));
String mms_cnt = Util.checkString(req.getParameter("mms_cnt"));
String mms_fee = Util.checkString(req.getParameter("mms_fee"));
String mms_vat = Util.checkString(req.getParameter("mms_vat"));
String div_expct_amt = Util.checkString(req.getParameter("div_expct_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String proc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_dt")));
String podr_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("podr_occr_seq")));
String podr_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("podr_occr_dt")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String expct_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("expct_amt")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
String podr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("podr_dt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String occr_arow = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_arow")));
String spl_dlco = Util.Uni2Ksc(Util.checkString(req.getParameter("spl_dlco")));
String brnd_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("brnd_cd")));
String item_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("item_nm")));
String podr_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("podr_cnt")));
String podr_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("podr_uprc")));
String podr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("podr_amt")));
String uprc_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc_fee")));
String mms_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("mms_uprc")));
String mms_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("mms_cnt")));
String mms_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("mms_fee")));
String mms_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("mms_vat")));
String div_expct_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("div_expct_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setProc_dt(proc_dt);
dm.setPodr_occr_seq(podr_occr_seq);
dm.setPodr_occr_dt(podr_occr_dt);
dm.setDlco_no(dlco_no);
dm.setExpct_amt(expct_amt);
dm.setSlcrg_pers(slcrg_pers);
dm.setDept_cd(dept_cd);
dm.setMchrg_pers(mchrg_pers);
dm.setPodr_dt(podr_dt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setOccr_arow(occr_arow);
dm.setSpl_dlco(spl_dlco);
dm.setBrnd_cd(brnd_cd);
dm.setItem_nm(item_nm);
dm.setPodr_cnt(podr_cnt);
dm.setPodr_uprc(podr_uprc);
dm.setPodr_amt(podr_amt);
dm.setUprc_fee(uprc_fee);
dm.setMms_uprc(mms_uprc);
dm.setMms_cnt(mms_cnt);
dm.setMms_fee(mms_fee);
dm.setMms_vat(mms_vat);
dm.setDiv_expct_amt(div_expct_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 12 11:47:16 KST 2015 */