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


package chosun.ciis.mt.submatrcla.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrcla.ds.*;
import chosun.ciis.mt.submatrcla.rec.*;

/**
 * 
 */


public class MT_SUBMATRCLA_2010_500_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mst_mode;
	public String cmpy_cd;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String chg_pers;
	public String occr_dt;
	public String seq;
	public String dept_cd;
	public String clam_clsf;
	public String clam_actu_cd;
	public String via_dept;
	public String remk;
	public String aplc_pers;
	public String buy_proc_stat;
	public String mode;
	public String sub_seq;
	public String matr_cd;
	public String matr_nm;
	public String std_modl;
	public String unit;
	public String clam_qunt;
	public String fix_qunt;
	public String purc_uprc;
	public String amt;
	public String usag;

	public MT_SUBMATRCLA_2010_500_ADM(){}
	public MT_SUBMATRCLA_2010_500_ADM(String mst_mode, String cmpy_cd, String incmg_pers_ipaddr, String incmg_pers, String chg_pers, String occr_dt, String seq, String dept_cd, String clam_clsf, String clam_actu_cd, String via_dept, String remk, String aplc_pers, String buy_proc_stat, String mode, String sub_seq, String matr_cd, String matr_nm, String std_modl, String unit, String clam_qunt, String fix_qunt, String purc_uprc, String amt, String usag){
		this.mst_mode = mst_mode;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.dept_cd = dept_cd;
		this.clam_clsf = clam_clsf;
		this.clam_actu_cd = clam_actu_cd;
		this.via_dept = via_dept;
		this.remk = remk;
		this.aplc_pers = aplc_pers;
		this.buy_proc_stat = buy_proc_stat;
		this.mode = mode;
		this.sub_seq = sub_seq;
		this.matr_cd = matr_cd;
		this.matr_nm = matr_nm;
		this.std_modl = std_modl;
		this.unit = unit;
		this.clam_qunt = clam_qunt;
		this.fix_qunt = fix_qunt;
		this.purc_uprc = purc_uprc;
		this.amt = amt;
		this.usag = usag;
	}

	public void setMst_mode(String mst_mode){
		this.mst_mode = mst_mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setClam_clsf(String clam_clsf){
		this.clam_clsf = clam_clsf;
	}

	public void setClam_actu_cd(String clam_actu_cd){
		this.clam_actu_cd = clam_actu_cd;
	}

	public void setVia_dept(String via_dept){
		this.via_dept = via_dept;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}
	
	public void setAplc_pers(String aplc_pers){
		this.aplc_pers = aplc_pers;
	}

	public void setBuy_proc_stat(String buy_proc_stat){
		this.buy_proc_stat = buy_proc_stat;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setStd_modl(String std_modl){
		this.std_modl = std_modl;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setClam_qunt(String clam_qunt){
		this.clam_qunt = clam_qunt;
	}

	public void setFix_qunt(String fix_qunt){
		this.fix_qunt = fix_qunt;
	}

	public void setPurc_uprc(String purc_uprc){
		this.purc_uprc = purc_uprc;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public String getMst_mode(){
		return this.mst_mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getClam_clsf(){
		return this.clam_clsf;
	}

	public String getClam_actu_cd(){
		return this.clam_actu_cd;
	}

	public String getVia_dept(){
		return this.via_dept;
	}

	public String getRemk(){
		return this.remk;
	}
	
	public String getAplc_pers(){
		return this.aplc_pers;
	}

	public String getBuy_proc_stat(){
		return this.buy_proc_stat;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getStd_modl(){
		return this.std_modl;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getClam_qunt(){
		return this.clam_qunt;
	}

	public String getFix_qunt(){
		return this.fix_qunt;
	}

	public String getPurc_uprc(){
		return this.purc_uprc;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATRCLA_2010_500_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRCLA_2010_500_ADM dm = (MT_SUBMATRCLA_2010_500_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mst_mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers_ipaddr);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.setString(7, dm.chg_pers);
		cstmt.setString(8, dm.occr_dt);
		cstmt.setString(9, dm.seq);
		cstmt.setString(10, dm.dept_cd);
		cstmt.setString(11, dm.clam_clsf);
		cstmt.setString(12, dm.clam_actu_cd);
		cstmt.setString(13, dm.via_dept);
		cstmt.setString(14, dm.remk);
		cstmt.setString(15, dm.aplc_pers);
		cstmt.setString(16, dm.buy_proc_stat);
		cstmt.setString(17, dm.mode);
		cstmt.setString(18, dm.sub_seq);
		cstmt.setString(19, dm.matr_cd);
		cstmt.setString(20, dm.matr_nm);
		cstmt.setString(21, dm.std_modl);
		cstmt.setString(22, dm.unit);
		cstmt.setString(23, dm.clam_qunt);
		cstmt.setString(24, dm.fix_qunt);
		cstmt.setString(25, dm.purc_uprc);
		cstmt.setString(26, dm.amt);
		cstmt.setString(27, dm.usag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrcla.ds.MT_SUBMATRCLA_2010_500_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mst_mode = [" + getMst_mode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("clam_clsf = [" + getClam_clsf() + "]");
		System.out.println("clam_actu_cd = [" + getClam_actu_cd() + "]");
		System.out.println("via_dept = [" + getVia_dept() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("aplc_pers = [" + getAplc_pers() + "]");
		System.out.println("buy_proc_stat = [" + getBuy_proc_stat() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("sub_seq = [" + getSub_seq() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("matr_nm = [" + getMatr_nm() + "]");
		System.out.println("std_modl = [" + getStd_modl() + "]");
		System.out.println("unit = [" + getUnit() + "]");
		System.out.println("clam_qunt = [" + getClam_qunt() + "]");
		System.out.println("fix_qunt = [" + getFix_qunt() + "]");
		System.out.println("purc_uprc = [" + getPurc_uprc() + "]");
		System.out.println("amt = [" + getAmt() + "]");
		System.out.println("usag = [" + getUsag() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mst_mode = req.getParameter("mst_mode");
if( mst_mode == null){
	System.out.println(this.toString+" : mst_mode is null" );
}else{
	System.out.println(this.toString+" : mst_mode is "+mst_mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
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
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String clam_clsf = req.getParameter("clam_clsf");
if( clam_clsf == null){
	System.out.println(this.toString+" : clam_clsf is null" );
}else{
	System.out.println(this.toString+" : clam_clsf is "+clam_clsf );
}
String clam_actu_cd = req.getParameter("clam_actu_cd");
if( clam_actu_cd == null){
	System.out.println(this.toString+" : clam_actu_cd is null" );
}else{
	System.out.println(this.toString+" : clam_actu_cd is "+clam_actu_cd );
}
String via_dept = req.getParameter("via_dept");
if( via_dept == null){
	System.out.println(this.toString+" : via_dept is null" );
}else{
	System.out.println(this.toString+" : via_dept is "+via_dept );
}
String aplc_pers = req.getParameter("aplc_pers");
if( aplc_pers == null){
	System.out.println(this.toString+" : aplc_pers is null" );
}else{
	System.out.println(this.toString+" : aplc_pers is "+aplc_pers );
}
String buy_proc_stat = req.getParameter("buy_proc_stat");
if( buy_proc_stat == null){
	System.out.println(this.toString+" : buy_proc_stat is null" );
}else{
	System.out.println(this.toString+" : buy_proc_stat is "+buy_proc_stat );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String sub_seq = req.getParameter("sub_seq");
if( sub_seq == null){
	System.out.println(this.toString+" : sub_seq is null" );
}else{
	System.out.println(this.toString+" : sub_seq is "+sub_seq );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String matr_nm = req.getParameter("matr_nm");
if( matr_nm == null){
	System.out.println(this.toString+" : matr_nm is null" );
}else{
	System.out.println(this.toString+" : matr_nm is "+matr_nm );
}
String std_modl = req.getParameter("std_modl");
if( std_modl == null){
	System.out.println(this.toString+" : std_modl is null" );
}else{
	System.out.println(this.toString+" : std_modl is "+std_modl );
}
String unit = req.getParameter("unit");
if( unit == null){
	System.out.println(this.toString+" : unit is null" );
}else{
	System.out.println(this.toString+" : unit is "+unit );
}
String clam_qunt = req.getParameter("clam_qunt");
if( clam_qunt == null){
	System.out.println(this.toString+" : clam_qunt is null" );
}else{
	System.out.println(this.toString+" : clam_qunt is "+clam_qunt );
}
String fix_qunt = req.getParameter("fix_qunt");
if( fix_qunt == null){
	System.out.println(this.toString+" : fix_qunt is null" );
}else{
	System.out.println(this.toString+" : fix_qunt is "+fix_qunt );
}
String purc_uprc = req.getParameter("purc_uprc");
if( purc_uprc == null){
	System.out.println(this.toString+" : purc_uprc is null" );
}else{
	System.out.println(this.toString+" : purc_uprc is "+purc_uprc );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
String usag = req.getParameter("usag");
if( usag == null){
	System.out.println(this.toString+" : usag is null" );
}else{
	System.out.println(this.toString+" : usag is "+usag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mst_mode = Util.checkString(req.getParameter("mst_mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String clam_clsf = Util.checkString(req.getParameter("clam_clsf"));
String clam_actu_cd = Util.checkString(req.getParameter("clam_actu_cd"));
String via_dept = Util.checkString(req.getParameter("via_dept"));
String aplc_pers = Util.checkString(req.getParameter("aplc_pers"));
String buy_proc_stat = Util.checkString(req.getParameter("buy_proc_stat"));
String mode = Util.checkString(req.getParameter("mode"));
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String matr_nm = Util.checkString(req.getParameter("matr_nm"));
String std_modl = Util.checkString(req.getParameter("std_modl"));
String unit = Util.checkString(req.getParameter("unit"));
String clam_qunt = Util.checkString(req.getParameter("clam_qunt"));
String fix_qunt = Util.checkString(req.getParameter("fix_qunt"));
String purc_uprc = Util.checkString(req.getParameter("purc_uprc"));
String amt = Util.checkString(req.getParameter("amt"));
String usag = Util.checkString(req.getParameter("usag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mst_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mst_mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String clam_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_clsf")));
String clam_actu_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_actu_cd")));
String via_dept = Util.Uni2Ksc(Util.checkString(req.getParameter("via_dept")));
String aplc_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_pers")));
String buy_proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_proc_stat")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String matr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_nm")));
String std_modl = Util.Uni2Ksc(Util.checkString(req.getParameter("std_modl")));
String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));
String clam_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_qunt")));
String fix_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_qunt")));
String purc_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_uprc")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String usag = Util.Uni2Ksc(Util.checkString(req.getParameter("usag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMst_mode(mst_mode);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setDept_cd(dept_cd);
dm.setClam_clsf(clam_clsf);
dm.setClam_actu_cd(clam_actu_cd);
dm.setVia_dept(via_dept);
dm.setAplc_pers(aplc_pers);
dm.setBuy_proc_stat(buy_proc_stat);
dm.setMode(mode);
dm.setSub_seq(sub_seq);
dm.setMatr_cd(matr_cd);
dm.setMatr_nm(matr_nm);
dm.setStd_modl(std_modl);
dm.setUnit(unit);
dm.setClam_qunt(clam_qunt);
dm.setFix_qunt(fix_qunt);
dm.setPurc_uprc(purc_uprc);
dm.setAmt(amt);
dm.setUsag(usag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 10 14:21:58 KST 2009 */