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


package chosun.ciis.ad.nmd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.nmd.ds.*;
import chosun.ciis.ad.nmd.rec.*;

/**
 * 
 */


public class AD_NMD_4021_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String flag;
	public String occr_dt;
	public String occr_seq;
	public String tax_clsf;
	public String advt_yn;
	public String canc_yn;
	public String readr_nm;
	public String read_fr_dt;
	public String stplt_time;
	public String sale_amt;
	public String dlco_no;
	public String extn_no;
	public String grp_id;
	public String id;
	public String re_reciv_dt;
	public String old_occr_dt;
	public String incmg_pers;

	public AD_NMD_4021_ADM(){}
	public AD_NMD_4021_ADM(String cmpy_cd, String medi_cd, String flag, String occr_dt, String occr_seq, String tax_clsf, String advt_yn, String canc_yn, String readr_nm, String read_fr_dt, String stplt_time, String sale_amt, String dlco_no, String extn_no, String grp_id, String id, String re_reciv_dt, String old_occr_dt, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.flag = flag;
		this.occr_dt = occr_dt;
		this.occr_seq = occr_seq;
		this.tax_clsf = tax_clsf;
		this.advt_yn = advt_yn;
		this.canc_yn = canc_yn;
		this.readr_nm = readr_nm;
		this.read_fr_dt = read_fr_dt;
		this.stplt_time = stplt_time;
		this.sale_amt = sale_amt;
		this.dlco_no = dlco_no;
		this.extn_no = extn_no;
		this.grp_id = grp_id;
		this.id = id;
		this.re_reciv_dt = re_reciv_dt;
		this.old_occr_dt = old_occr_dt;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setTax_clsf(String tax_clsf){
		this.tax_clsf = tax_clsf;
	}

	public void setAdvt_yn(String advt_yn){
		this.advt_yn = advt_yn;
	}

	public void setCanc_yn(String canc_yn){
		this.canc_yn = canc_yn;
	}

	public void setReadr_nm(String readr_nm){
		this.readr_nm = readr_nm;
	}

	public void setRead_fr_dt(String read_fr_dt){
		this.read_fr_dt = read_fr_dt;
	}

	public void setStplt_time(String stplt_time){
		this.stplt_time = stplt_time;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setExtn_no(String extn_no){
		this.extn_no = extn_no;
	}

	public void setGrp_id(String grp_id){
		this.grp_id = grp_id;
	}

	public void setId(String id){
		this.id = id;
	}

	public void setRe_reciv_dt(String re_reciv_dt){
		this.re_reciv_dt = re_reciv_dt;
	}

	public void setOld_occr_dt(String old_occr_dt){
		this.old_occr_dt = old_occr_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getTax_clsf(){
		return this.tax_clsf;
	}

	public String getAdvt_yn(){
		return this.advt_yn;
	}

	public String getCanc_yn(){
		return this.canc_yn;
	}

	public String getReadr_nm(){
		return this.readr_nm;
	}

	public String getRead_fr_dt(){
		return this.read_fr_dt;
	}

	public String getStplt_time(){
		return this.stplt_time;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getExtn_no(){
		return this.extn_no;
	}

	public String getGrp_id(){
		return this.grp_id;
	}

	public String getId(){
		return this.id;
	}

	public String getRe_reciv_dt(){
		return this.re_reciv_dt;
	}

	public String getOld_occr_dt(){
		return this.old_occr_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_NMD_4021_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_NMD_4021_ADM dm = (AD_NMD_4021_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.flag);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.occr_seq);
		cstmt.setString(8, dm.tax_clsf);
		cstmt.setString(9, dm.advt_yn);
		cstmt.setString(10, dm.canc_yn);
		cstmt.setString(11, dm.readr_nm);
		cstmt.setString(12, dm.read_fr_dt);
		cstmt.setString(13, dm.stplt_time);
		cstmt.setString(14, dm.sale_amt);
		cstmt.setString(15, dm.dlco_no);
		cstmt.setString(16, dm.extn_no);
		cstmt.setString(17, dm.grp_id);
		cstmt.setString(18, dm.id);
		cstmt.setString(19, dm.re_reciv_dt);
		cstmt.setString(20, dm.old_occr_dt);
		cstmt.setString(21, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.nmd.ds.AD_NMD_4021_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("occr_seq = [" + getOccr_seq() + "]");
		System.out.println("tax_clsf = [" + getTax_clsf() + "]");
		System.out.println("advt_yn = [" + getAdvt_yn() + "]");
		System.out.println("canc_yn = [" + getCanc_yn() + "]");
		System.out.println("readr_nm = [" + getReadr_nm() + "]");
		System.out.println("read_fr_dt = [" + getRead_fr_dt() + "]");
		System.out.println("stplt_time = [" + getStplt_time() + "]");
		System.out.println("sale_amt = [" + getSale_amt() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("extn_no = [" + getExtn_no() + "]");
		System.out.println("grp_id = [" + getGrp_id() + "]");
		System.out.println("id = [" + getId() + "]");
		System.out.println("re_reciv_dt = [" + getRe_reciv_dt() + "]");
		System.out.println("old_occr_dt = [" + getOld_occr_dt() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
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
String tax_clsf = req.getParameter("tax_clsf");
if( tax_clsf == null){
	System.out.println(this.toString+" : tax_clsf is null" );
}else{
	System.out.println(this.toString+" : tax_clsf is "+tax_clsf );
}
String advt_yn = req.getParameter("advt_yn");
if( advt_yn == null){
	System.out.println(this.toString+" : advt_yn is null" );
}else{
	System.out.println(this.toString+" : advt_yn is "+advt_yn );
}
String canc_yn = req.getParameter("canc_yn");
if( canc_yn == null){
	System.out.println(this.toString+" : canc_yn is null" );
}else{
	System.out.println(this.toString+" : canc_yn is "+canc_yn );
}
String readr_nm = req.getParameter("readr_nm");
if( readr_nm == null){
	System.out.println(this.toString+" : readr_nm is null" );
}else{
	System.out.println(this.toString+" : readr_nm is "+readr_nm );
}
String read_fr_dt = req.getParameter("read_fr_dt");
if( read_fr_dt == null){
	System.out.println(this.toString+" : read_fr_dt is null" );
}else{
	System.out.println(this.toString+" : read_fr_dt is "+read_fr_dt );
}
String stplt_time = req.getParameter("stplt_time");
if( stplt_time == null){
	System.out.println(this.toString+" : stplt_time is null" );
}else{
	System.out.println(this.toString+" : stplt_time is "+stplt_time );
}
String sale_amt = req.getParameter("sale_amt");
if( sale_amt == null){
	System.out.println(this.toString+" : sale_amt is null" );
}else{
	System.out.println(this.toString+" : sale_amt is "+sale_amt );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String extn_no = req.getParameter("extn_no");
if( extn_no == null){
	System.out.println(this.toString+" : extn_no is null" );
}else{
	System.out.println(this.toString+" : extn_no is "+extn_no );
}
String grp_id = req.getParameter("grp_id");
if( grp_id == null){
	System.out.println(this.toString+" : grp_id is null" );
}else{
	System.out.println(this.toString+" : grp_id is "+grp_id );
}
String id = req.getParameter("id");
if( id == null){
	System.out.println(this.toString+" : id is null" );
}else{
	System.out.println(this.toString+" : id is "+id );
}
String re_reciv_dt = req.getParameter("re_reciv_dt");
if( re_reciv_dt == null){
	System.out.println(this.toString+" : re_reciv_dt is null" );
}else{
	System.out.println(this.toString+" : re_reciv_dt is "+re_reciv_dt );
}
String old_occr_dt = req.getParameter("old_occr_dt");
if( old_occr_dt == null){
	System.out.println(this.toString+" : old_occr_dt is null" );
}else{
	System.out.println(this.toString+" : old_occr_dt is "+old_occr_dt );
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
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String flag = Util.checkString(req.getParameter("flag"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String occr_seq = Util.checkString(req.getParameter("occr_seq"));
String tax_clsf = Util.checkString(req.getParameter("tax_clsf"));
String advt_yn = Util.checkString(req.getParameter("advt_yn"));
String canc_yn = Util.checkString(req.getParameter("canc_yn"));
String readr_nm = Util.checkString(req.getParameter("readr_nm"));
String read_fr_dt = Util.checkString(req.getParameter("read_fr_dt"));
String stplt_time = Util.checkString(req.getParameter("stplt_time"));
String sale_amt = Util.checkString(req.getParameter("sale_amt"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String extn_no = Util.checkString(req.getParameter("extn_no"));
String grp_id = Util.checkString(req.getParameter("grp_id"));
String id = Util.checkString(req.getParameter("id"));
String re_reciv_dt = Util.checkString(req.getParameter("re_reciv_dt"));
String old_occr_dt = Util.checkString(req.getParameter("old_occr_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_seq")));
String tax_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_clsf")));
String advt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_yn")));
String canc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("canc_yn")));
String readr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("readr_nm")));
String read_fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("read_fr_dt")));
String stplt_time = Util.Uni2Ksc(Util.checkString(req.getParameter("stplt_time")));
String sale_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_amt")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String extn_no = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_no")));
String grp_id = Util.Uni2Ksc(Util.checkString(req.getParameter("grp_id")));
String id = Util.Uni2Ksc(Util.checkString(req.getParameter("id")));
String re_reciv_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("re_reciv_dt")));
String old_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("old_occr_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setFlag(flag);
dm.setOccr_dt(occr_dt);
dm.setOccr_seq(occr_seq);
dm.setTax_clsf(tax_clsf);
dm.setAdvt_yn(advt_yn);
dm.setCanc_yn(canc_yn);
dm.setReadr_nm(readr_nm);
dm.setRead_fr_dt(read_fr_dt);
dm.setStplt_time(stplt_time);
dm.setSale_amt(sale_amt);
dm.setDlco_no(dlco_no);
dm.setExtn_no(extn_no);
dm.setGrp_id(grp_id);
dm.setId(id);
dm.setRe_reciv_dt(re_reciv_dt);
dm.setOld_occr_dt(old_occr_dt);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 12 14:09:31 KST 2015 */