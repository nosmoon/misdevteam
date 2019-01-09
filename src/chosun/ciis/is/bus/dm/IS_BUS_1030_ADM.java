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


package chosun.ciis.is.bus.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.ds.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_1030_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String make_dt;
	public String make_seq;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String same;
	public String istt_dd;
	public String etc;
	public String thdd_rvord;
	public String nxtdd_plan;
	public String cash_clamt;
	public String note_clamt;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String b_mode;
	public String b_make_dtls_seq;
	public String b_dlco;
	public String b_cns_tm;
	public String b_chrg_pers;
	public String b_tel_no;
	public String b_clsf;
	public String b_vist_purp;
	public String b_remk;
	public String c_mode;
	public String c_make_dtls_seq;
	public String c_dlco;
	public String c_cns_tm;
	public String c_chrg_pers;
	public String c_tel_no;
	public String c_clsf;
	public String c_vist_purp;
	public String c_remk;

	public IS_BUS_1030_ADM(){}
	public IS_BUS_1030_ADM(String flag, String cmpy_cd, String make_dt, String make_seq, String dept_cd, String sub_dept_cd, String chrg_pers, String same, String istt_dd, String etc, String thdd_rvord, String nxtdd_plan, String cash_clamt, String note_clamt, String incmg_pers_ip, String incmg_pers, String b_mode, String b_make_dtls_seq, String b_dlco, String b_cns_tm, String b_chrg_pers, String b_tel_no, String b_clsf, String b_vist_purp, String b_remk, String c_mode, String c_make_dtls_seq, String c_dlco, String c_cns_tm, String c_chrg_pers, String c_tel_no, String c_clsf, String c_vist_purp, String c_remk){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.make_dt = make_dt;
		this.make_seq = make_seq;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.chrg_pers = chrg_pers;
		this.same = same;
		this.istt_dd = istt_dd;
		this.etc = etc;
		this.thdd_rvord = thdd_rvord;
		this.nxtdd_plan = nxtdd_plan;
		this.cash_clamt = cash_clamt;
		this.note_clamt = note_clamt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.b_mode = b_mode;
		this.b_make_dtls_seq = b_make_dtls_seq;
		this.b_dlco = b_dlco;
		this.b_cns_tm = b_cns_tm;
		this.b_chrg_pers = b_chrg_pers;
		this.b_tel_no = b_tel_no;
		this.b_clsf = b_clsf;
		this.b_vist_purp = b_vist_purp;
		this.b_remk = b_remk;
		this.c_mode = c_mode;
		this.c_make_dtls_seq = c_make_dtls_seq;
		this.c_dlco = c_dlco;
		this.c_cns_tm = c_cns_tm;
		this.c_chrg_pers = c_chrg_pers;
		this.c_tel_no = c_tel_no;
		this.c_clsf = c_clsf;
		this.c_vist_purp = c_vist_purp;
		this.c_remk = c_remk;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setMake_seq(String make_seq){
		this.make_seq = make_seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setSame(String same){
		this.same = same;
	}

	public void setIstt_dd(String istt_dd){
		this.istt_dd = istt_dd;
	}

	public void setEtc(String etc){
		this.etc = etc;
	}

	public void setThdd_rvord(String thdd_rvord){
		this.thdd_rvord = thdd_rvord;
	}

	public void setNxtdd_plan(String nxtdd_plan){
		this.nxtdd_plan = nxtdd_plan;
	}

	public void setCash_clamt(String cash_clamt){
		this.cash_clamt = cash_clamt;
	}

	public void setNote_clamt(String note_clamt){
		this.note_clamt = note_clamt;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setB_mode(String b_mode){
		this.b_mode = b_mode;
	}

	public void setB_make_dtls_seq(String b_make_dtls_seq){
		this.b_make_dtls_seq = b_make_dtls_seq;
	}

	public void setB_dlco(String b_dlco){
		this.b_dlco = b_dlco;
	}

	public void setB_cns_tm(String b_cns_tm){
		this.b_cns_tm = b_cns_tm;
	}

	public void setB_chrg_pers(String b_chrg_pers){
		this.b_chrg_pers = b_chrg_pers;
	}

	public void setB_tel_no(String b_tel_no){
		this.b_tel_no = b_tel_no;
	}

	public void setB_clsf(String b_clsf){
		this.b_clsf = b_clsf;
	}

	public void setB_vist_purp(String b_vist_purp){
		this.b_vist_purp = b_vist_purp;
	}

	public void setB_remk(String b_remk){
		this.b_remk = b_remk;
	}

	public void setC_mode(String c_mode){
		this.c_mode = c_mode;
	}

	public void setC_make_dtls_seq(String c_make_dtls_seq){
		this.c_make_dtls_seq = c_make_dtls_seq;
	}

	public void setC_dlco(String c_dlco){
		this.c_dlco = c_dlco;
	}

	public void setC_cns_tm(String c_cns_tm){
		this.c_cns_tm = c_cns_tm;
	}

	public void setC_chrg_pers(String c_chrg_pers){
		this.c_chrg_pers = c_chrg_pers;
	}

	public void setC_tel_no(String c_tel_no){
		this.c_tel_no = c_tel_no;
	}

	public void setC_clsf(String c_clsf){
		this.c_clsf = c_clsf;
	}

	public void setC_vist_purp(String c_vist_purp){
		this.c_vist_purp = c_vist_purp;
	}

	public void setC_remk(String c_remk){
		this.c_remk = c_remk;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getMake_seq(){
		return this.make_seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getSame(){
		return this.same;
	}

	public String getIstt_dd(){
		return this.istt_dd;
	}

	public String getEtc(){
		return this.etc;
	}

	public String getThdd_rvord(){
		return this.thdd_rvord;
	}

	public String getNxtdd_plan(){
		return this.nxtdd_plan;
	}

	public String getCash_clamt(){
		return this.cash_clamt;
	}

	public String getNote_clamt(){
		return this.note_clamt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getB_mode(){
		return this.b_mode;
	}

	public String getB_make_dtls_seq(){
		return this.b_make_dtls_seq;
	}

	public String getB_dlco(){
		return this.b_dlco;
	}

	public String getB_cns_tm(){
		return this.b_cns_tm;
	}

	public String getB_chrg_pers(){
		return this.b_chrg_pers;
	}

	public String getB_tel_no(){
		return this.b_tel_no;
	}

	public String getB_clsf(){
		return this.b_clsf;
	}

	public String getB_vist_purp(){
		return this.b_vist_purp;
	}

	public String getB_remk(){
		return this.b_remk;
	}

	public String getC_mode(){
		return this.c_mode;
	}

	public String getC_make_dtls_seq(){
		return this.c_make_dtls_seq;
	}

	public String getC_dlco(){
		return this.c_dlco;
	}

	public String getC_cns_tm(){
		return this.c_cns_tm;
	}

	public String getC_chrg_pers(){
		return this.c_chrg_pers;
	}

	public String getC_tel_no(){
		return this.c_tel_no;
	}

	public String getC_clsf(){
		return this.c_clsf;
	}

	public String getC_vist_purp(){
		return this.c_vist_purp;
	}

	public String getC_remk(){
		return this.c_remk;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_BUS_1030_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_BUS_1030_ADM dm = (IS_BUS_1030_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.make_dt);
		cstmt.setString(6, dm.make_seq);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.sub_dept_cd);
		cstmt.setString(9, dm.chrg_pers);
		cstmt.setString(10, dm.same);
		cstmt.setString(11, dm.istt_dd);
		cstmt.setString(12, dm.etc);
		cstmt.setString(13, dm.thdd_rvord);
		cstmt.setString(14, dm.nxtdd_plan);
		cstmt.setString(15, dm.cash_clamt);
		cstmt.setString(16, dm.note_clamt);
		cstmt.setString(17, dm.incmg_pers_ip);
		cstmt.setString(18, dm.incmg_pers);
		cstmt.setString(19, dm.b_mode);
		cstmt.setString(20, dm.b_make_dtls_seq);
		cstmt.setString(21, dm.b_dlco);
		cstmt.setString(22, dm.b_cns_tm);
		cstmt.setString(23, dm.b_chrg_pers);
		cstmt.setString(24, dm.b_tel_no);
		cstmt.setString(25, dm.b_clsf);
		cstmt.setString(26, dm.b_vist_purp);
		cstmt.setString(27, dm.b_remk);
		cstmt.setString(28, dm.c_mode);
		cstmt.setString(29, dm.c_make_dtls_seq);
		cstmt.setString(30, dm.c_dlco);
		cstmt.setString(31, dm.c_cns_tm);
		cstmt.setString(32, dm.c_chrg_pers);
		cstmt.setString(33, dm.c_tel_no);
		cstmt.setString(34, dm.c_clsf);
		cstmt.setString(35, dm.c_vist_purp);
		cstmt.setString(36, dm.c_remk);
		cstmt.registerOutParameter(37, Types.VARCHAR);
		cstmt.registerOutParameter(38, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.bus.ds.IS_BUS_1030_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("make_dt = [" + getMake_dt() + "]");
		System.out.println("make_seq = [" + getMake_seq() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("same = [" + getSame() + "]");
		System.out.println("istt_dd = [" + getIstt_dd() + "]");
		System.out.println("etc = [" + getEtc() + "]");
		System.out.println("thdd_rvord = [" + getThdd_rvord() + "]");
		System.out.println("nxtdd_plan = [" + getNxtdd_plan() + "]");
		System.out.println("cash_clamt = [" + getCash_clamt() + "]");
		System.out.println("note_clamt = [" + getNote_clamt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("b_mode = [" + getB_mode() + "]");
		System.out.println("b_make_dtls_seq = [" + getB_make_dtls_seq() + "]");
		System.out.println("b_dlco = [" + getB_dlco() + "]");
		System.out.println("b_cns_tm = [" + getB_cns_tm() + "]");
		System.out.println("b_chrg_pers = [" + getB_chrg_pers() + "]");
		System.out.println("b_tel_no = [" + getB_tel_no() + "]");
		System.out.println("b_clsf = [" + getB_clsf() + "]");
		System.out.println("b_vist_purp = [" + getB_vist_purp() + "]");
		System.out.println("b_remk = [" + getB_remk() + "]");
		System.out.println("c_mode = [" + getC_mode() + "]");
		System.out.println("c_make_dtls_seq = [" + getC_make_dtls_seq() + "]");
		System.out.println("c_dlco = [" + getC_dlco() + "]");
		System.out.println("c_cns_tm = [" + getC_cns_tm() + "]");
		System.out.println("c_chrg_pers = [" + getC_chrg_pers() + "]");
		System.out.println("c_tel_no = [" + getC_tel_no() + "]");
		System.out.println("c_clsf = [" + getC_clsf() + "]");
		System.out.println("c_vist_purp = [" + getC_vist_purp() + "]");
		System.out.println("c_remk = [" + getC_remk() + "]");
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
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
String make_seq = req.getParameter("make_seq");
if( make_seq == null){
	System.out.println(this.toString+" : make_seq is null" );
}else{
	System.out.println(this.toString+" : make_seq is "+make_seq );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String same = req.getParameter("same");
if( same == null){
	System.out.println(this.toString+" : same is null" );
}else{
	System.out.println(this.toString+" : same is "+same );
}
String istt_dd = req.getParameter("istt_dd");
if( istt_dd == null){
	System.out.println(this.toString+" : istt_dd is null" );
}else{
	System.out.println(this.toString+" : istt_dd is "+istt_dd );
}
String etc = req.getParameter("etc");
if( etc == null){
	System.out.println(this.toString+" : etc is null" );
}else{
	System.out.println(this.toString+" : etc is "+etc );
}
String thdd_rvord = req.getParameter("thdd_rvord");
if( thdd_rvord == null){
	System.out.println(this.toString+" : thdd_rvord is null" );
}else{
	System.out.println(this.toString+" : thdd_rvord is "+thdd_rvord );
}
String nxtdd_plan = req.getParameter("nxtdd_plan");
if( nxtdd_plan == null){
	System.out.println(this.toString+" : nxtdd_plan is null" );
}else{
	System.out.println(this.toString+" : nxtdd_plan is "+nxtdd_plan );
}
String cash_clamt = req.getParameter("cash_clamt");
if( cash_clamt == null){
	System.out.println(this.toString+" : cash_clamt is null" );
}else{
	System.out.println(this.toString+" : cash_clamt is "+cash_clamt );
}
String note_clamt = req.getParameter("note_clamt");
if( note_clamt == null){
	System.out.println(this.toString+" : note_clamt is null" );
}else{
	System.out.println(this.toString+" : note_clamt is "+note_clamt );
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
String b_mode = req.getParameter("b_mode");
if( b_mode == null){
	System.out.println(this.toString+" : b_mode is null" );
}else{
	System.out.println(this.toString+" : b_mode is "+b_mode );
}
String b_make_dtls_seq = req.getParameter("b_make_dtls_seq");
if( b_make_dtls_seq == null){
	System.out.println(this.toString+" : b_make_dtls_seq is null" );
}else{
	System.out.println(this.toString+" : b_make_dtls_seq is "+b_make_dtls_seq );
}
String b_dlco = req.getParameter("b_dlco");
if( b_dlco == null){
	System.out.println(this.toString+" : b_dlco is null" );
}else{
	System.out.println(this.toString+" : b_dlco is "+b_dlco );
}
String b_cns_tm = req.getParameter("b_cns_tm");
if( b_cns_tm == null){
	System.out.println(this.toString+" : b_cns_tm is null" );
}else{
	System.out.println(this.toString+" : b_cns_tm is "+b_cns_tm );
}
String b_chrg_pers = req.getParameter("b_chrg_pers");
if( b_chrg_pers == null){
	System.out.println(this.toString+" : b_chrg_pers is null" );
}else{
	System.out.println(this.toString+" : b_chrg_pers is "+b_chrg_pers );
}
String b_tel_no = req.getParameter("b_tel_no");
if( b_tel_no == null){
	System.out.println(this.toString+" : b_tel_no is null" );
}else{
	System.out.println(this.toString+" : b_tel_no is "+b_tel_no );
}
String b_clsf = req.getParameter("b_clsf");
if( b_clsf == null){
	System.out.println(this.toString+" : b_clsf is null" );
}else{
	System.out.println(this.toString+" : b_clsf is "+b_clsf );
}
String b_vist_purp = req.getParameter("b_vist_purp");
if( b_vist_purp == null){
	System.out.println(this.toString+" : b_vist_purp is null" );
}else{
	System.out.println(this.toString+" : b_vist_purp is "+b_vist_purp );
}
String b_remk = req.getParameter("b_remk");
if( b_remk == null){
	System.out.println(this.toString+" : b_remk is null" );
}else{
	System.out.println(this.toString+" : b_remk is "+b_remk );
}
String c_mode = req.getParameter("c_mode");
if( c_mode == null){
	System.out.println(this.toString+" : c_mode is null" );
}else{
	System.out.println(this.toString+" : c_mode is "+c_mode );
}
String c_make_dtls_seq = req.getParameter("c_make_dtls_seq");
if( c_make_dtls_seq == null){
	System.out.println(this.toString+" : c_make_dtls_seq is null" );
}else{
	System.out.println(this.toString+" : c_make_dtls_seq is "+c_make_dtls_seq );
}
String c_dlco = req.getParameter("c_dlco");
if( c_dlco == null){
	System.out.println(this.toString+" : c_dlco is null" );
}else{
	System.out.println(this.toString+" : c_dlco is "+c_dlco );
}
String c_cns_tm = req.getParameter("c_cns_tm");
if( c_cns_tm == null){
	System.out.println(this.toString+" : c_cns_tm is null" );
}else{
	System.out.println(this.toString+" : c_cns_tm is "+c_cns_tm );
}
String c_chrg_pers = req.getParameter("c_chrg_pers");
if( c_chrg_pers == null){
	System.out.println(this.toString+" : c_chrg_pers is null" );
}else{
	System.out.println(this.toString+" : c_chrg_pers is "+c_chrg_pers );
}
String c_tel_no = req.getParameter("c_tel_no");
if( c_tel_no == null){
	System.out.println(this.toString+" : c_tel_no is null" );
}else{
	System.out.println(this.toString+" : c_tel_no is "+c_tel_no );
}
String c_clsf = req.getParameter("c_clsf");
if( c_clsf == null){
	System.out.println(this.toString+" : c_clsf is null" );
}else{
	System.out.println(this.toString+" : c_clsf is "+c_clsf );
}
String c_vist_purp = req.getParameter("c_vist_purp");
if( c_vist_purp == null){
	System.out.println(this.toString+" : c_vist_purp is null" );
}else{
	System.out.println(this.toString+" : c_vist_purp is "+c_vist_purp );
}
String c_remk = req.getParameter("c_remk");
if( c_remk == null){
	System.out.println(this.toString+" : c_remk is null" );
}else{
	System.out.println(this.toString+" : c_remk is "+c_remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String make_seq = Util.checkString(req.getParameter("make_seq"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String same = Util.checkString(req.getParameter("same"));
String istt_dd = Util.checkString(req.getParameter("istt_dd"));
String etc = Util.checkString(req.getParameter("etc"));
String thdd_rvord = Util.checkString(req.getParameter("thdd_rvord"));
String nxtdd_plan = Util.checkString(req.getParameter("nxtdd_plan"));
String cash_clamt = Util.checkString(req.getParameter("cash_clamt"));
String note_clamt = Util.checkString(req.getParameter("note_clamt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String b_mode = Util.checkString(req.getParameter("b_mode"));
String b_make_dtls_seq = Util.checkString(req.getParameter("b_make_dtls_seq"));
String b_dlco = Util.checkString(req.getParameter("b_dlco"));
String b_cns_tm = Util.checkString(req.getParameter("b_cns_tm"));
String b_chrg_pers = Util.checkString(req.getParameter("b_chrg_pers"));
String b_tel_no = Util.checkString(req.getParameter("b_tel_no"));
String b_clsf = Util.checkString(req.getParameter("b_clsf"));
String b_vist_purp = Util.checkString(req.getParameter("b_vist_purp"));
String b_remk = Util.checkString(req.getParameter("b_remk"));
String c_mode = Util.checkString(req.getParameter("c_mode"));
String c_make_dtls_seq = Util.checkString(req.getParameter("c_make_dtls_seq"));
String c_dlco = Util.checkString(req.getParameter("c_dlco"));
String c_cns_tm = Util.checkString(req.getParameter("c_cns_tm"));
String c_chrg_pers = Util.checkString(req.getParameter("c_chrg_pers"));
String c_tel_no = Util.checkString(req.getParameter("c_tel_no"));
String c_clsf = Util.checkString(req.getParameter("c_clsf"));
String c_vist_purp = Util.checkString(req.getParameter("c_vist_purp"));
String c_remk = Util.checkString(req.getParameter("c_remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String make_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("make_seq")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String same = Util.Uni2Ksc(Util.checkString(req.getParameter("same")));
String istt_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("istt_dd")));
String etc = Util.Uni2Ksc(Util.checkString(req.getParameter("etc")));
String thdd_rvord = Util.Uni2Ksc(Util.checkString(req.getParameter("thdd_rvord")));
String nxtdd_plan = Util.Uni2Ksc(Util.checkString(req.getParameter("nxtdd_plan")));
String cash_clamt = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_clamt")));
String note_clamt = Util.Uni2Ksc(Util.checkString(req.getParameter("note_clamt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String b_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("b_mode")));
String b_make_dtls_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("b_make_dtls_seq")));
String b_dlco = Util.Uni2Ksc(Util.checkString(req.getParameter("b_dlco")));
String b_cns_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("b_cns_tm")));
String b_chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("b_chrg_pers")));
String b_tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("b_tel_no")));
String b_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("b_clsf")));
String b_vist_purp = Util.Uni2Ksc(Util.checkString(req.getParameter("b_vist_purp")));
String b_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("b_remk")));
String c_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("c_mode")));
String c_make_dtls_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("c_make_dtls_seq")));
String c_dlco = Util.Uni2Ksc(Util.checkString(req.getParameter("c_dlco")));
String c_cns_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("c_cns_tm")));
String c_chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("c_chrg_pers")));
String c_tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("c_tel_no")));
String c_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("c_clsf")));
String c_vist_purp = Util.Uni2Ksc(Util.checkString(req.getParameter("c_vist_purp")));
String c_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("c_remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setMake_dt(make_dt);
dm.setMake_seq(make_seq);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setChrg_pers(chrg_pers);
dm.setSame(same);
dm.setIstt_dd(istt_dd);
dm.setEtc(etc);
dm.setThdd_rvord(thdd_rvord);
dm.setNxtdd_plan(nxtdd_plan);
dm.setCash_clamt(cash_clamt);
dm.setNote_clamt(note_clamt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setB_mode(b_mode);
dm.setB_make_dtls_seq(b_make_dtls_seq);
dm.setB_dlco(b_dlco);
dm.setB_cns_tm(b_cns_tm);
dm.setB_chrg_pers(b_chrg_pers);
dm.setB_tel_no(b_tel_no);
dm.setB_clsf(b_clsf);
dm.setB_vist_purp(b_vist_purp);
dm.setB_remk(b_remk);
dm.setC_mode(c_mode);
dm.setC_make_dtls_seq(c_make_dtls_seq);
dm.setC_dlco(c_dlco);
dm.setC_cns_tm(c_cns_tm);
dm.setC_chrg_pers(c_chrg_pers);
dm.setC_tel_no(c_tel_no);
dm.setC_clsf(c_clsf);
dm.setC_vist_purp(c_vist_purp);
dm.setC_remk(c_remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 07 20:21:45 KST 2012 */